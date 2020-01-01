import cv2

name = "I need see that color guy!"

cam = cv2.VideoCapture(0)
cam.set(cv2.CAP_PROP_FPS, 180)

#Limites
greenLower = (29, 86, 6)
greenUpper = (64, 255, 255)

while(True):
    ret, frame = cam.read()
 	
 	hsv = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)

 	#construindo uma mascara para a cor
 	maskGreen = cv2.inRange(hsv, greenLower, greenUpper)
 	maskGreen = cv2.erode(maskGreen, None, iterations=2)
 	maskGreen = cv2.dilate(maskGreen, None, iterations=2)

    cv2.imshow(name, frame)
    print(cam.get(cv2.CAP_PROP_FPS))
    #letra 'q'
    if cv2.waitKey(1) == ord('q'):
        break
cam.release()
cv2.destroyWindow(name) 