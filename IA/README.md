# IA 

Aqui encontramos os códigos referentes a Inteligência Artificial. Podemos encontrar os seguintes pacotes:

## IA
Nesta pasta encontramos as seguintes classes principais:

- CasosEspeciais:

Este código resolve o cubo mágico apenas para casos clássicos, tais como o Xadrez, Zig-Zag e dos Meios.

- Fridrich:

Está classe contêm a implementação do algoritmo de Fridrich com os casos F2L, OLL e PLL.

- IABasic:

Podemos definir este arquivo como o Main, nele foi escrito a implementação do algoritmo da Cruz Branca e é onde ocorre toda manipulação inicial do Cubo, desde a captura das faces até o envio dos movimentos para um arquivo .txt.

### Também apresenta os seguintes métodos:

```
private int elementoAdjacente(int posElemento, Movimento f);
```

- Retorna o elemento(cubinho) Adjacente do elemento informado.

```
private int FaceAdjacente(int posElemento);
```
- Retorna a Face Adjacente do elemento(cubinho) informado.

```
private void alinhamento(Movimento f);
```

- Alinha os cantos brancos. Cubinho Branco-Azul fica debaixo da face Azul; Cubinho Branco-Laranja fica debaixo da face Laranja; Cubinho Branco-Vermelho fica debaixo da face Vermelha; Cubinho Branco-Verde fica debaixo da face Verde.

```
private int prox(int pos);
```
![Screenshot](prox.jpeg)
**_Posição dos elementos da Face_**

- A primeira etapa da Cruz Branca é colocar no lugar as peças das posições 1, 5, 7 e 3. Após colocar a peça no lugar o computador precisa saber qual será a próxima para não se perder na resolução. Informando a posição do atual elemento que acabou de ser colocado no lugar, este método retorna a posição do próximo canto para ser colocado o próximo elemento. 

## move
Nesta pasta encontramos apenas uma classe chamada Movimento. Aqui é gerado o emulador do Cubo, apresentando o seu desenho através de um array bi-dimensional e contendo os seguintes métodos para a manipulação do objeto:

```
public Movimento(int[][] lista);
```
- Método construtor da classe, recebe um array bi-dimensional do tipo inteiro que descreve o Cubo.

```
public void print();
```
- Mostra no terminal a imagem que o cubo apresenta no presente momento.

```
public void spinRightFront(int face);
```
- Realiza os seguintes giros:

![Screenshot](MR.png)


```
public void spinLeftBack(int face);
```
- Realiza os seguintes giros:

![Screenshot](ML.png)

##### OBS: Neste projeto a String que representa o movimento segue a seguinte estrutura: FACE + SENTIDO_DO_MOVIMENTO. 'FACE' pode assumir como valor os elementos pertencentes ao conjunto {0,1,2,3,4,5}. 'SENTIDO_DO_MOVIMENTO' tem como valor R e L para movimentos realizados pelos respectivos métodos _spinRightFront(int face);_ e _spinLeftBack(int face);_ citados anteriormente.

```
public ArrayList<String> getMove();
```
- Retorna um ArrayList do tipo String apresentando todos os movimentos apresentados desde o início até o fim dos movimentos.

```
public String indexof(int cubinho , int adjacente);
```

- Retorna uma String com um texto informando a posição de algum cubinho que está presente em algum dos cantos do Cubo.

```
public String indexof(int cubinho, int adjacente_cima, int adjacente_ao_lado);
```

- Retorna uma String com um texto informando a posição de algum cubinho que está presente em alguma das quinas do Cubo.

```
public String getPos(int face, int posicao);
```

- Retorna uma String com um texto informando a cor do cubinho que está em determinada face e posição.

```
public void finishMove();
```

- Deve ser chamado após o último movimento, pois indica que não há mais nenhum movimento para ser feito.

```
public void moveAxisY();
```

- Gira o cubo no eixo Y positivo. 

## language
Contém a classe Translate e ela apresenta os seguintes métodos:

```
private String TranslateToComputer(String moving);

```
- Método que faz a tradução da notação do Cubo mágico para a notação deste projeto.
```
private String TranslateToCube(String moving);

```
- Método que faz a tradução da notação do computador para a notação do Cubo mágico.
```
private void putElementInAListToComputer(String moving);

```
- Põe o elemento traduzido da notação do Cubo mágico para a notação do computador em uma lista. 
```
private void putElementInAListToCube(String moving);

```
- Põe o elemento traduzido da notação do computador para a notação do Cubo mágico em uma lista.
```
public String getTranslationToComputer(String moving);

```
- Captura a tradução do elemento atual para a linguagem do computador. 
```
public String getTranslationToCube(String moving);

```
- Captura a tradução do elemento atual para a linguagem do Cubo mágico. 
```
public ArrayList<String> getMoveToComputer();

```
- Captura todos os movimentos na notação do computador.
```
public ArrayList<String> getMoveToCube();
```
- Captura todos os movimentos na notação do Cubo mágico.

## communication
Nesta pasta está contido a classe Writer que apresenta um único método estático chamado writer que envia os movimentos para um arquivo .txt

## test
Apresenta apenas arquivos de testes.

## cam
Apresenta arquivos para captura das faces através de uma câmera(Obs.: Ainda não finalizado).