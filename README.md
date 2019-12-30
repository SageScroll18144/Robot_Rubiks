# Robot_Rubiks
Robô que resolve o cubo mágico. Este projeto foi desenvolvido para a P.D. Física e Tecnologia do 9º ensino fundamental do ano de 2018.

## Robô
![Screenshot](robot_cube.jpeg)

## I.A.

A inteligência artificial e o emulador do cubo para a realização dos movimentos e testes foi escrito em Java. 

### Input

O Input do código no momento está sendo feito pelo terminal, entretando será implementado uma webcam para capturar as cores da face do cubo, para a realização desse feito utilizarei a biblioteca de visão computacional OpenCV.


#### Faces

|Número|   Cor  | 
|------|--------|
|  0   |Amarelo |
|  1   |Laranja |
|  2   |  Azul  |
|  3   |Vermelho| 
|  4   | Branco |
|  5   | Verde  |

### Algoritmo

Primeiro montamos a Cruz branca e depois é aplicado o algoritmo de Fridrich. Em seguida enviamos os movimentos para um arquivo .txt. O código dessa parte pode ser encontrado na pasta 'IA'.

### Emulador

O emulador é feito por um array bi-dimensional e a permutação dos seus elementos é analoga a movimentação das faces do cubo. 

## Comunicação

Após o envio dos movimentos por um arquivo .txt um arquivo escrito em Python faz a leitura dos movimentos e estabelece uma comunicação Serial com o Arduino. Este arquivo pode ser encontrado na pasta 'Ponte'.


## Comandos da movimentação

O Arduino após a leitura envia o comando de giro para o respectivo motor de passo indicando o sentido de rotação. Este arquivo pode ser encontrado na pasta 'Master4'.