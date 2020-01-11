void moveAxisXPositive(){
  int elements[] = {5,4,2,0};
  int copy_elemt[] = {5,4,2,0};
  for(int i = 0; i < sizeof(elements)/sizeof(int) - 1; i++){
    elements[i] += elements[i+1];
    elements[i+1] = elements[i] - elements[i+1];
    elements[i] = elements[i] - elements[i+1];
  }
  for(int i = 0; i < sizeof(elements)/sizeof(int); i++){
    motores[copy_elemt[i]] = copy[elements[i]];
  }
  motores[1] = copy[1];
  motores[3] = copy[3];
}
void moveAxisXNegative(){
  int elements[] = {0,2,4,5};
  int copy_elemt[] = {0,2,4,5};
  for(int i = 0; i < sizeof(elements)/sizeof(int) - 1; i++){
    elements[i] += elements[i+1];
    elements[i+1] = elements[i] - elements[i+1];
    elements[i] = elements[i] - elements[i+1];
  }
  for(int i = 0; i < sizeof(elements)/sizeof(int); i++){
    motores[copy_elemt[i]] = copy[elements[i]];
  }
  motores[1] = copy[1];
  motores[3] = copy[3];
}
void moveAxisYPositive(){
  int elements[] = {4,1,0,3};
  int copy_elemt[] = {4,1,0,3};
  for(int i = 0; i < sizeof(elements)/sizeof(int) - 1; i++){
    elements[i] += elements[i+1];
    elements[i+1] = elements[i] - elements[i+1];
    elements[i] = elements[i] - elements[i+1];
  }
  for(int i = 0; i < sizeof(elements)/sizeof(int); i++){
    motores[copy_elemt[i]] = copy[elements[i]];
  }
  motores[2] = copy[2];
  motores[5] = copy[5];
}

void moveAxisYNegative(){
  int elements[] = {0,1,4,3};
  int copy_elemt[] = {0,1,4,3};
  for(int i = 0; i < sizeof(elements)/sizeof(int) - 1; i++){
    elements[i] += elements[i+1];
    elements[i+1] = elements[i] - elements[i+1];
    elements[i] = elements[i] - elements[i+1];
  }
  for(int i = 0; i < sizeof(elements)/sizeof(int); i++){
    motores[copy_elemt[i]] = copy[elements[i]];
  }
  motores[2] = copy[2];
  motores[5] = copy[5];
}

void moveAxisZPositive(){
  int elements[] = {1,2,3,5};
  int copy_elemt[] = {1,2,3,5};
  for(int i = 0; i < sizeof(elements)/sizeof(int) - 1; i++){
    elements[i] += elements[i+1];
    elements[i+1] = elements[i] - elements[i+1];
    elements[i] = elements[i] - elements[i+1];
  }
  for(int i = 0; i < sizeof(elements)/sizeof(int); i++){
    motores[copy_elemt[i]] = copy[elements[i]];
  }
  motores[0] = copy[0];
  motores[4] = copy[4];
}
void moveAxisZNegative(){
  int elements[] = {5,3,2,1};
  int copy_elemt[] = {5,3,2,1};
  for(int i = 0; i < sizeof(elements)/sizeof(int) - 1; i++){
    elements[i] += elements[i+1];
    elements[i+1] = elements[i] - elements[i+1];
    elements[i] = elements[i] - elements[i+1];
  }
  for(int i = 0; i < sizeof(elements)/sizeof(int); i++){
    motores[copy_elemt[i]] = copy[elements[i]];
  }
  motores[0] = copy[0];
  motores[4] = copy[4];
}
