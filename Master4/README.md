# Master4

Pasta que contêm todo o código do Arduino.

## Master4
O arquivo principal. Aqui ocorre a comunicação Serial com o Python e a troca de comandos para a resolução do Cubo Mágico.

## spin
Apresenta apenas o método que realiza o giro de uma das faces do Cubo. É passado como argumento o motor(analogo ao array das faces{0,1,2,3,4,5} e o sentido do movimento{'R', 'L'}. Vale notar que o movimento não é representado na notoção do Cubo Mágico, mas sim a notação de computador, desenvolvida neste projeto.

```cpp
void spinh(int motor, char sentido);
```

## eixos
Arquivo que contêm os métodos de troca de eixos.

```cpp
void moveAxisXPositive();
```

- Gira os motores no eixo X positivo.

```cpp
void moveAxisXNegative();
```

- Gira os motores no eixo X negativo. 

```cpp
void moveAxisYPositive();
```

- Gira os motores no eixo Y positivo. 

```cpp
void moveAxisYNegative();
```

- Gira os motores no eixo Y negativo. 

```cpp
void moveAxisZPositive();
```

- Gira os motores no eixo Z positivo. 

```cpp
void moveAxisZNegative();
```

- Gira os motores no eixo Z negativo. 