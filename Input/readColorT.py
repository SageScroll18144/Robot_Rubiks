import cv2
import numpy as np

name = "I need see that color guy!"

cam = cv2.VideoCapture(0)
cam.set(cv2.CAP_PROP_FPS, 180)

while(True):
    ret, frame = cam.read()
 	
    #hsv = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)

    #pré-processamento
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    gauss = cv2.GaussianBlur(gray, (3, 3), 0)
    segmentationCanny = cv2.Canny(gauss, 20, 40)
    
    #dilatando
    kernel = np.ones((3, 3), np.uint8)
    dilate = cv2.dilate(segmentationCanny, kernel, iterations=2)


cam.release()
cv2.destroyWindow(name) 
