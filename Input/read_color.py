import cv2

name = "I need see that color guy!"

cam = cv2.VideoCapture(0)
cam.set(cv2.CAP_PROP_FPS, 180)

while(True):
    ret, frame = cam.read()
 
    cv2.imshow(name, frame)
    print(cam.get(cv2.CAP_PROP_FPS))
    #letra 'q'
    if cv2.waitKey(1) == ord('q'):
        break
cam.release()
cv2.destroyWindow(name) 