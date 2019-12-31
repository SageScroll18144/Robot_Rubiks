# IA 

Aqui encontramos os códigos referentes a Inteligência Artificial. Podemos encontrar os seguintes pacotes:

## IA
Nesta pasta encontramos as seguintes classes principais:

- CasosEspeciais
Este código resolve o cubo mágico apenas para casos clássicos, tais como o Xadrez, Zig-Zag e dos Meios.

- Fridrich
Está classe contêm a implementação do algoritmo de Fridrich com os casos F2L, OLL e PLL.

- IABasic
Podemos definir este arquivo como o Main, nele foi escrito a implementação do algoritmo da Cruz Branca e é onde ocorre toda manipulação inicial do Cubo, desde a captura das faces até o envio dos movimentos para um arquivo .txt


## move
Nesta pasta encontramos apenas uma classe chamada Movimento. Aqui é gerado o emulador do Cubo, apresentando o seu desenho através de um array bi-dimensional e contendo os seguintes métodos para a manipulação do objeto:

- Movimento(int[][] lista)
Método construtor da classe, recebe um array bi-dimensional do tipo inteiro que descreve o Cubo.

- void print()
Mostra no terminal a imagem que o cubo apresenta no presente momento.

- void spinRightFront(int face)
Realiza os seguintes giros:

- void spinLeftBack(int face)
Realiza os seguintes giros:

- ArrayList<String> getMove()
Retorna um ArrayList do tipo String apresentando todos os movimentos apresentados desde o início até o fim dos movimentos.

- String indexof(int cubinho , int adjacente)
Retorna uma String com um texto informando a posição de algum cubinho que está presente em alguma canto do Cubo.

- String indexof(int cubinho, int adjacente_cima, int adjacente_ao_lado)
Retorna uma String com um texto informando a posição de algum cubinho que está presente em alguma quina do Cubo.

- String getPos(int face, int posicao)
Retorna uma String com um texto informando a cor do cubinho que está em determinada face e posição.

- void finishMove()
Deve ser chamado após o último movimento, pois indica que não há mais nenhum movimento para ser feito.

- void moveAxisY()
Gira o cubo no eixo Y positivo. 

## communication

## test

## cam