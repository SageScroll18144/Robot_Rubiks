void spinh(int motor, char sentido){
  //sentido horario
  if(sentido == 'R'){
    motores[motor].step(-600);
  }
  //sentido anti-horario
  else if(sentido == 'L'){
    motores[motor].step(600);
  }
  delay(500);
}