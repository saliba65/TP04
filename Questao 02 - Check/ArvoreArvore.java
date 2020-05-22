import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Characters {

  // Declaracao de elementos privados
  private String name;
  private String height;
  private String weight;
  private String hairColor;
  private String skinColor;
  private String eyeColor;
  private String birthYear;
  private String genre;
  private String homeWorld;

  // Sets and Gets
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHeight() {
    return this.height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public String getWeight() {
    return this.weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }

  public String getHairColor() {
    return this.hairColor;
  }

  public void setHairColor(String hairColor) {
    this.hairColor = hairColor;
  }

  public String getSkinColor() {
    return this.skinColor;
  }

  public void setSkinColor(String skinColor) {
    this.skinColor = skinColor;
  }

  public String getEyeColor() {
    return this.eyeColor;
  }

  public void setEyeColor(String eyeColor) {
    this.eyeColor = eyeColor;
  }

  public String getBirthYear() {
    return this.birthYear;
  }

  public void setBirthYear(String birthYear) {
    this.birthYear = birthYear;
  }

  public String getGenre() {
    return this.genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getHomeWorld() {
    return this.homeWorld;
  }

  public void setHomeWorld(String homeWorld) {
    this.homeWorld = homeWorld;
  }

  // Construtor
  Characters() {
    this.name = "";
    this.height = "";
    this.weight = "";
    this.skinColor = "";
    this.hairColor = "";
    this.eyeColor = "";
    this.birthYear = "";
    this.genre = "";
    this.homeWorld = "";
  }

  // Ler arquivo txt
  public void readFile(String fileName) {
    try {
      FileReader arq = new FileReader(fileName);
      BufferedReader readFile = new BufferedReader(arq);
      String line = readFile.readLine();

      // MyIO.println(line);
      // Chamada de funcoes para separar dados
      nameSetUp(line);
      heightSetUp(line);
      massSetUp(line);
      hair_colorSetUp(line);
      skin_colorSetUp(line);
      eye_colorSetUp(line);
      birth_yearSetUp(line);
      genderSetUp(line);
      homeworldSetUp(line);
      // filmsSetUp(line);

      /*
       * // Printar resultado MyIO.println(" ## " + name + " ## " + height + " ## " +
       * weight + " ## " + hairColor + " ## " + skinColor + " ## " + eyeColor + " ## "
       * + birthYear + " ## " + genre + " ## " + homeWorld + " ## ");
       */
    } catch (IOException e) {
    }
  }

  // Separar nome
  public void nameSetUp(String line) {

    int nameBegin = line.indexOf("'name'");
    int nameEnd = line.indexOf("'height'", nameBegin);
    String name = line.substring(nameBegin + 7, nameEnd).trim().replace(",", "").replace("'", "");

    this.name = name;
    // MyIO.println("##" + name);
  }

  // Separar altura
  public void heightSetUp(String line) {

    int heightBegin = line.indexOf("'height'");
    int heightEnd = line.indexOf("'mass'", heightBegin);
    String height = line.substring(heightBegin + 10, heightEnd).trim().replace(",", "").replace("'", "")
        .replace("unknown", "0");

    this.height = height;
    // MyIO.println("##" + height);
  }

  // Separar peso
  public void massSetUp(String line) {

    int massBegin = line.indexOf("'mass'");
    int massEnd = line.indexOf("'hair_color'", massBegin);
    String mass = line.substring(massBegin + 8, massEnd).trim().replace(",", "").replace("'", "").replace("unknown",
        "0");

    this.weight = mass;
    // MyIO.println("##" + mass);
  }

  // Separar cor do cabelo
  public void hair_colorSetUp(String line) {

    int hair_colorBegin = line.indexOf("'hair_color'");
    int hair_colorEnd = line.indexOf("'skin_color'", hair_colorBegin);
    String hair_color = line.substring(hair_colorBegin + 14, hair_colorEnd).trim().replace(",", "").replace("'", "");

    this.hairColor = hair_color;
    // MyIO.println("##" + hair_color);
  }

  // Separar cor da pele
  public void skin_colorSetUp(String line) {

    int skin_colorBegin = line.indexOf("'skin_color'");
    int skin_colorEnd = line.indexOf("'eye_color'", skin_colorBegin);
    String skin_color = line.substring(skin_colorBegin + 15, skin_colorEnd).trim().replace(",", "").replace("'", "");

    this.skinColor = skin_color;
    // MyIO.println("##" + skin_color);
  }

  // Separar cor do olho
  public void eye_colorSetUp(String line) {

    int eye_colorBegin = line.indexOf("'eye_color'");
    int eye_colorEnd = line.indexOf("'birth_year'", eye_colorBegin);
    String eye_color = line.substring(eye_colorBegin + 14, eye_colorEnd).trim().replace(",", "").replace("'", "");

    this.eyeColor = eye_color;
    // MyIO.println("##" + eye_color);
  }

  // Separar ano de nascimento
  public void birth_yearSetUp(String line) {

    int birth_yearBegin = line.indexOf("'birth_year'");
    int birth_yearEnd = line.indexOf("'gender'", birth_yearBegin);
    String birth_year = line.substring(birth_yearBegin + 14, birth_yearEnd).trim().replace(",", "").replace("'", "");

    this.birthYear = birth_year;
    // MyIO.println("##" + birth_year);
  }

  // Separar genero
  public void genderSetUp(String line) {

    int genderBegin = line.indexOf("'gender'");
    int genderEnd = line.indexOf("'homeworld'", genderBegin);
    String gender = line.substring(genderBegin + 11, genderEnd).trim().replace(",", "").replace("'", "");

    this.genre = gender;
    // MyIO.println("##" + gender);
  }

  // Separar planeta natal
  public void homeworldSetUp(String line) {

    int homeworldBegin = line.indexOf("'homeworld'");
    int homeworldEnd = line.indexOf("'films'", homeworldBegin);
    String homeworld = line.substring(homeworldBegin + 14, homeworldEnd).trim().replace(",", "").replace("'", "");

    this.homeWorld = homeworld;
    // MyIO.println("##" + homeworld);
  }
  /*
   * public void mostrar() { int j = 0; // System.out.print("[ "); for (Celula i =
   * primeiro.prox; i != null; i = i.prox, j++) { //
   * MyIO.print(i.elemento.getName() + " "); MyIO.print("[" + j + "] ## ");
   * MyIO.print(i.elemento.getName() + " ## "); MyIO.print(i.elemento.getHeight()
   * + " ## "); MyIO.print(i.elemento.getWeight() + " ## ");
   * MyIO.print(i.elemento.getHairColor() + " ## ");
   * MyIO.print(i.elemento.getSkinColor() + " ## ");
   * MyIO.print(i.elemento.getEyeColor() + " ## ");
   * MyIO.print(i.elemento.getBirthYear() + " ## ");
   * MyIO.print(i.elemento.getGenre() + " ## ");
   * MyIO.println(i.elemento.getHomeWorld() + " ## "); } //
   * System.out.println("] "); }
   */
}

class NoCharacters {
  public Characters characters;
  public NoCharacters esquerda;
  public NoCharacters direita;

  // construtor
  public NoCharacters(Characters characters) {
    this.characters = characters;
    this.esquerda = this.direita = null;
  }
}

class NoNumero {
  public int numero;
  public NoNumero esquerda, direita;
  public NoCharacters raiz;

  public NoNumero(int numero) {
    this.numero = numero;
    this.esquerda = this.direita = null;
    this.raiz = null;
  }
}

class ArvoreArvoreBinaria {
  private NoNumero raiz;

  /**
   * Construtor da Classe
   */
  public ArvoreArvoreBinaria() throws Exception {
    this.raiz = null;

    inserirNumero(7);
    inserirNumero(3);
    inserirNumero(11);
    inserirNumero(1);
    inserirNumero(5);
    inserirNumero(9);
    inserirNumero(12);
    inserirNumero(0);
    inserirNumero(2);
    inserirNumero(4);
    inserirNumero(6);
    inserirNumero(8);
    inserirNumero(10);
    inserirNumero(13);
    inserirNumero(14);
  }

  public void inserirNumero(int numero) throws Exception {
    raiz = inserirNumero(numero, raiz);
  }

  private NoNumero inserirNumero(int numero, NoNumero i) throws Exception {
    if (i == null) {
      i = new NoNumero(numero);
    } else if (numero < i.numero) {
      i.esquerda = inserirNumero(numero, i.esquerda);
    } else if (numero > i.numero) {
      i.direita = inserirNumero(numero, i.direita);
    } else {
      throw new Exception("Erro: Numero Existente na Arvore de Arvores Binarias!");
    }

    return i;
  }

  public void inserirCharacters(Characters characters) throws Exception {
    inserirCharacters(characters, raiz);
  }

  private void inserirCharacters(Characters characters, NoNumero i) throws Exception {
    if (i == null) {
      throw new Exception("Erro: Personagem existente na arvore de arvores binarias ");
    } else if (Integer.parseInt(characters.getHeight()) % 15 < i.numero) {
      inserirCharacters(characters, i.esquerda);
    } else if (Integer.parseInt(characters.getHeight()) % 15 > i.numero) {
      inserirCharacters(characters, i.direita);
    } else {
      i.raiz = inserirCharactersAB(characters, i.raiz);
    }
  }

  private NoCharacters inserirCharactersAB(Characters characters, NoCharacters i) throws Exception {
    if (i == null) {
      i = new NoCharacters(characters);
    } else if (characters.getName().compareTo(i.characters.getName()) < 0) {
      i.esquerda = inserirCharactersAB(characters, i.esquerda);
    } else if (characters.getName().compareTo(i.characters.getName()) > 0) {
      i.direita = inserirCharactersAB(characters, i.direita);
    } else {
      throw new Exception("Erro: Personagem Existente na Arvore de Arvores Binarias!");
    }

    return i;
  }

  public void pesquisar(String characterName) {
    MyIO.print("raiz ");

    if (pesquisar(characterName, raiz)) {
      MyIO.println("SIM");
    } else {
      MyIO.setCharset("ISO-8859-1");
      MyIO.println("NÃO");
    }
  }

  private boolean pesquisar(String characterName, NoNumero i) {
    boolean contemPersonagem = false;

    if (i != null) {
      if (pesquisar_AB(characterName, i.raiz)) {
        contemPersonagem = true;
      } else {
        MyIO.print("esq ");

        if (pesquisar(characterName, i.esquerda)) {
          contemPersonagem = true;
        } else {
          MyIO.print("dir ");

          contemPersonagem = pesquisar(characterName, i.direita);
        }
      }
    }

    return contemPersonagem;
  }

  private boolean pesquisar_AB(String characterName, NoCharacters i) {
    boolean contemPersonagem = false;

    if (i != null) {
      if (characterName.contains(i.characters.getName())) {
        contemPersonagem = true;
      } else {
        MyIO.print("ESQ ");

        if (pesquisar_AB(characterName, i.esquerda)) {
          contemPersonagem = true;
        } else {
          MyIO.print("DIR ");

          contemPersonagem = pesquisar_AB(characterName, i.direita);
        }
      }
    }

    return contemPersonagem;
  }

}

public class ArvoreArvore {
  // Identificar palavra FIM
  public static boolean isFIM(String input) {
    return (input.length() >= 3 && input.charAt(0) == 'F' && input.charAt(1) == 'I' && input.charAt(2) == 'M');
  }

  public static String ISO88591toUTF8(String strISO) {
    try {
      byte[] isoBytes = strISO.getBytes("ISO-8859-1");
      return new String(isoBytes, "UTF-8");
    } catch (IOException e) {
    }
    return strISO;
  }

  public static void main(String[] args) throws Exception {

    String[] input = new String[700];
    int enterNumber = 0;
    ArvoreArvoreBinaria arvoreArvoreBinaria = new ArvoreArvoreBinaria();
    String[] nomesPersonagensPesquisados = new String[1000];
    int totalPersonagensPesquisados = 0;
    // MyIO.setCharset("UTF-8");

    // Leitura de dados
    do {
      input[enterNumber] = MyIO.readLine();
      input[enterNumber] = ISO88591toUTF8(input[enterNumber]);

    } while (isFIM(input[enterNumber++]) == false);
    enterNumber--;
    // Criacao de array de objetos
    Characters[] characters = new Characters[enterNumber];

    for (int i = 0; i < enterNumber; i++) {
      characters[i] = new Characters();
      characters[i].readFile(input[i]);
      arvoreArvoreBinaria.inserirCharacters(characters[i]);
    }

    do {
      nomesPersonagensPesquisados[totalPersonagensPesquisados] = MyIO.readLine();
    } while (!nomesPersonagensPesquisados[totalPersonagensPesquisados++].contains("FIM"));

    totalPersonagensPesquisados--;

    for (int i = 0; i < totalPersonagensPesquisados; i++) {
      // MyIO.setCharset("UTF-8");
      MyIO.print(nomesPersonagensPesquisados[i] + " ");
      arvoreArvoreBinaria.pesquisar(nomesPersonagensPesquisados[i]);
    }
  }
}