import cv2
import numpy as np

name = "I need see that color guy!"

cam = cv2.VideoCapture(0)
cam.set(cv2.CAP_PROP_FPS, 180)

while(True):
    ret, frame = cam.read()
 	
    #hsv = cv2.cvtColor(frame, cv2.COLOR_BGR2HSV)
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    gauss = cv2.GaussianBlur(gray, (3,3), 0)
    segmentationCanny = cv2.Canny(gauss, 20, 40)
    
cam.release()
cv2.destroyWindow(name) 
