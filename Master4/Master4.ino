#include <Stepper.h> 
#include <Wire.h>
 
const int stepsPerRevolution = 100; 
String motor = "";
boolean count = false;

Stepper motores[6] = {

  Stepper(stepsPerRevolution, 4,6,5,7),
  Stepper(stepsPerRevolution, 8,10,9,11),
  Stepper(stepsPerRevolution, 12,22,13,24),
  Stepper(stepsPerRevolution, 26,30,28,32),
  Stepper(stepsPerRevolution, 34,38,36,40),
  Stepper(stepsPerRevolution, 42,46,44,48)
  
};
Stepper copy[6] = {

  Stepper(stepsPerRevolution, 4,6,5,7),
  Stepper(stepsPerRevolution, 8,10,9,11),
  Stepper(stepsPerRevolution, 12,22,13,24),
  Stepper(stepsPerRevolution, 26,30,28,32),
  Stepper(stepsPerRevolution, 34,38,36,40),
  Stepper(stepsPerRevolution, 42,46,44,48)
  
};
void setup() 
{ 
  //Determina a velocidade inicial do motor 
  for(int i = 0; i < 6; i++){
    motores[i].setSpeed(300);
  }
  Serial.begin(9600);
  //Wire.begin();
} 
  
void loop() 
{  
  if(Serial.available() > 0){ 
    motor = Serial.readString();
    Serial.println(motor);
    if(motor.equals("z'")){
      moveAxisZNegative();
    }else if(motor.equals("z")){
      moveAxisZPositive();
    }
    else if(motor.equals("y'")){
      moveAxisYNegative();
    }else if(motor.equals("y")){
      moveAxisYPositive();
    }else if(motor.equals("x'")){
      moveAxisXNegative();
    }else if(motor.equals("x")){
      moveAxisXPositive();
    }   
    else if(motor.charAt(0) == '0'){
      spinh(0, motor.charAt(1));
    }
    else if(motor.charAt(0) == '1'){
      if(motor.charAt(1) == 'R'){
        spinh(1,'L');
      }
      else if(motor.charAt(1) == 'L'){
        spinh(1,'R');
      }
    }
    else if(motor.charAt(0) == '2'){
      spinh(2, motor.charAt(1));
    }
    else if(motor.charAt(0) == '3'){
      spinh(3, motor.charAt(1));
    }
    else if(motor.charAt(0) == '4'){
      spinh(4, motor.charAt(1));
    }
    else if(motor.charAt(0) == '5'){
      if(motor.charAt(1) == 'R'){
        spinh(5,'L');
      }
      else if(motor.charAt(1) == 'L'){
        spinh(5,'R');
      }
    }
    
    else if(motor == "end"){
      Wire.write(2);//envia um byte
      Wire.endTransmission();
    }
    delay(1000); 
    Serial.write('0');
  
  }

  count = true;
}