void moveAxisXPositive(){
  int elements[] = {5,4,2,0};
  for(int i = 0; i < sizeof(elements)/sizeof(int) - 1; i++){
    motores[elements[i]] += motores[elements[i+1]];
    motores[elements[i+1]] = motores[elements[i]] - motores[elements[i+1]];
    motores[elements[i]] = motores[elements[i]] - motores[elements[i+1]];
  }
  motores[1] = copy[1];
  motores[3] = copy[3];
}
void moveAxisXNegative(){
  int elements[] = {0,2,4,5};
  for(int i = 0; i < sizeof(elements)/sizeof(int) - 1; i++){
    motores[elements[i]] += motores[elements[i+1]];
    motores[elements[i+1]] = motores[elements[i]] - motores[elements[i+1]];
    motores[elements[i]] = motores[elements[i]] - motores[elements[i+1]];
  }
  motores[1] = copy[1];
  motores[3] = copy[3];
}
void moveAxisYPositive(){
  int elements[] = {4,1,0,3};
  for(int i = 0; i < sizeof(elements)/sizeof(int) - 1; i++){
    motores[elements[i]] += motores[elements[i+1]];
    motores[elements[i+1]] = motores[elements[i]] - motores[elements[i+1]];
    motores[elements[i]] = motores[elements[i]] - motores[elements[i+1]];
  }
  motores[2] = copy[2];
  motores[5] = copy[5];
}

void moveAxisYNegative(){
  int elements[] = {0,1,4,3};
  for(int i = 0; i < sizeof(elements)/sizeof(int) - 1; i++){
    motores[elements[i]] += motores[elements[i+1]];
    motores[elements[i+1]] = motores[elements[i]] - motores[elements[i+1]];
    motores[elements[i]] = motores[elements[i]] - motores[elements[i+1]];
  }
  motores[2] = copy[2];
  motores[5] = copy[5];
}

void moveAxisZPositive(){
  int elements[] = {1,2,3,5};
  for(int i = 0; i < sizeof(elements)/sizeof(int) - 1; i++){
    motores[elements[i]] += motores[elements[i+1]];
    motores[elements[i+1]] = motores[elements[i]] - motores[elements[i+1]];
    motores[elements[i]] = motores[elements[i]] - motores[elements[i+1]];
  }
  motores[0] = copy[0];
  motores[4] = copy[4];
}
void moveAxisZPositive(){
  int elements[] = {5,3,2,1};
  for(int i = 0; i < sizeof(elements)/sizeof(int) - 1; i++){
    motores[elements[i]] += motores[elements[i+1]];
    motores[elements[i+1]] = motores[elements[i]] - motores[elements[i+1]];
    motores[elements[i]] = motores[elements[i]] - motores[elements[i+1]];
  }
  motores[0] = copy[0];
  motores[4] = copy[4];
}