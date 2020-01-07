import cv2
import numpy as np
import imutils
name = "I need see that color guy!"

cam = cv2.VideoCapture(0)
cam.set(cv2.CAP_PROP_FPS, 180)

#Limites
greenLower = (29, 86, 6)
greenUpper = (64, 255, 255)

while(True):
    ret, frame = cam.read()
 	
    frame = imutils.resize(frame, width=600)

    hsv = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)

    #construindo uma mascara para a cor
    maskGreen = cv2.inRange(hsv, greenLower, greenUpper)
    maskGreen = cv2.erode(maskGreen, None, iterations=2)
    maskGreen = cv2.dilate(maskGreen, None, iterations=2)

    #Busca o contorno
    contourGreen = cv2.findContours(maskGreen.copy(), cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)[-2]
    centerGreen = None

    #Desenha na tela
    if len(contourGreen) > 0:
        maxCGreen = max(contourGreen, key=cv2.contourArea)
        rectGreen = cv2.minAreaRect(maxCGreen)
        boxGreen = cv2.boxPoints(rectGreen)
        boxGreen = np.int0(boxGreen)
        MGreen = cv2.moments(maxCGreen)
        centerGreen = (int(MGreen["m10"] / MGreen["m00"]), int(MGreen["m01"] / MGreen["m00"]))
        cv2.drawContours(frame, [boxGreen], 0, (0, 255, 0), 2)

    cv2.imshow(name, frame)
    #print(cam.get(cv2.CAP_PROP_FPS))
    #letra 'q'
    if cv2.waitKey(1) == ord('q'):
        break
cam.release()
cv2.destroyWindow(name) 
