import serial

porta = '/dev/ttyUSB0'
wm = []
arduino = serial.Serial(porta, 9600)
anterior = -1
moves = open('/home/felipe/Área de trabalho/text.txt', 'r')
count = 0

for move in moves:
    wm = move.split(" ")

for i in wm:
    print(i)

while True:
    r = arduino.readline()
    
    if(count == 0):
        r = b'\x01\r\n'
    elif count >= len(wm):
        break
    print(r)
    if r == b'\x01\r\n' :
        arduino.write(wm[count].encode())
        print(wm[count])
        anterior = r
        count = count + 1
        r = b'0'
print("end");
arduino.close()
