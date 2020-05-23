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

}

class No {
  public String characterName;
  public boolean isColorido;
  public No esquerda;
  public No direita;

  // construtor
  public No(String characterName) {
    this.characterName = characterName;
    this.isColorido = false;
    this.esquerda = this.direita = null;
  }

  public No(String characterName, boolean isColorido) {
    this.characterName = characterName;
    this.isColorido = isColorido;
    this.esquerda = this.direita = null;
  }
}

class ArvoreAlvinegra {
  private No raiz;

  /**
   * Construtor da Classe
   */
  public ArvoreAlvinegra() {
    this.raiz = null;
  }

  public void inserir(String characterName) throws Exception {
    if (raiz == null) {
      raiz = new No(characterName, false);
    } else if (raiz.esquerda == null && raiz.direita == null) {
      if (characterName.compareTo(raiz.characterName) < 0) {
        raiz.esquerda = new No(characterName, true);
      } else {
        raiz.direita = new No(characterName, true);
      }
    } else if (raiz.esquerda == null) {
      if (characterName.compareTo(raiz.characterName) < 0) {
        raiz.esquerda = new No(characterName);
      } else if (characterName.compareTo(raiz.direita.characterName) < 0) {
        raiz.esquerda = new No(raiz.characterName);
        raiz.characterName = characterName;
      } else {
        raiz.esquerda = new No(raiz.characterName);
        raiz.characterName = raiz.direita.characterName;
        raiz.direita.characterName = characterName;
      }

      raiz.esquerda.isColorido = raiz.direita.isColorido = false;
    } else if (raiz.direita == null) {
      if (characterName.compareTo(raiz.characterName) > 0) {
        raiz.direita = new No(characterName);
      } else if (characterName.compareTo(raiz.esquerda.characterName) > 0) {
        raiz.direita = new No(raiz.characterName);
        raiz.characterName = characterName;
      } else {
        raiz.direita = new No(raiz.characterName);
        raiz.characterName = raiz.esquerda.characterName;
        raiz.esquerda.characterName = characterName;
      }

      raiz.esquerda.isColorido = raiz.direita.isColorido = false;
    } else {
      inserir(characterName, null, null, null, raiz);
    }

    raiz.isColorido = false;
  }

  private void inserir(String characterName, No i, No j, No k, No l) throws Exception {
    if (l == null) {
      if (characterName.compareTo(k.characterName) < 0) {
        l = k.esquerda = new No(characterName, true);
      } else {
        l = k.direita = new No(characterName, true);
      }

      if (k.isColorido) {
        balancear(i, j, k, l);
      }
    } else {
      if (l.esquerda != null && l.direita != null && l.esquerda.isColorido && l.direita.isColorido) {
        l.isColorido = true;
        l.esquerda.isColorido = l.direita.isColorido = false;

        if (l == raiz) {
          l.isColorido = false;
        } else if (k.isColorido) {
          balancear(i, j, k, l);
        }
      }

      if (characterName.compareTo(l.characterName) < 0) {
        inserir(characterName, j, k, l, l.esquerda);
      } else if (characterName.compareTo(l.characterName) > 0) {
        inserir(characterName, j, k, l, l.direita);
      } else {
        throw new Exception("Erro: Personagem Existente na Arvore Alvinegra");
      }
    }
  }

  private void balancear(No i, No j, No k, No l) {
    if (k.isColorido) {
      if (k.characterName.compareTo(j.characterName) > 0) {
        if (l.characterName.compareTo(k.characterName) > 0) {
          j = rotacionarEsquerda(j);
        } else {
          j = rotacionarDireitaEsquerda(j);
        }
      } else {
        if (l.characterName.compareTo(k.characterName) < 0) {
          j = rotacionarDireita(j);
        } else {
          j = rotacionarEsquerdaDireita(j);
        }
      }

      if (i == null) {
        raiz = j;
      } else {
        if (j.characterName.compareTo(i.characterName) < 0) {
          i.esquerda = j;
        } else {
          i.direita = j;
        }
      }

      j.isColorido = false;
      j.esquerda.isColorido = j.direita.isColorido = true;
    }
  }

  private No rotacionarEsquerda(No i) {
    No i_direita = i.direita;
    No i_direita_esquerda = i_direita.esquerda;

    i_direita.esquerda = i;
    i.direita = i_direita_esquerda;

    return i_direita;
  }

  private No rotacionarDireita(No i) {
    No i_esquerda = i.esquerda;
    No i_esquerda_direita = i_esquerda.direita;

    i_esquerda.direita = i;
    i.esquerda = i_esquerda_direita;

    return i_esquerda;
  }

  private No rotacionarEsquerdaDireita(No i) {
    i.esquerda = rotacionarEsquerda(i.esquerda);

    return rotacionarDireita(i);
  }

  private No rotacionarDireitaEsquerda(No i) {
    i.direita = rotacionarDireita(i.direita);

    return rotacionarEsquerda(i);
  }

  public boolean pesquisar(String characterName) {
    MyIO.print("raiz ");

    return pesquisar(characterName, raiz);
  }

  private boolean pesquisar(String characterName, No i) {
    boolean contemPersonagem = false;

    if (i == null) {
      contemPersonagem = false;
    } else if (characterName.compareTo(i.characterName) < 0) {
      MyIO.print("esq ");

      contemPersonagem = pesquisar(characterName, i.esquerda);
    } else if (characterName.compareTo(i.characterName) > 0) {
      MyIO.print("dir ");

      contemPersonagem = pesquisar(characterName, i.direita);
    } else {
      contemPersonagem = true;
    }

    return contemPersonagem;
  }

}

public class AVL {
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
    ArvoreAlvinegra arvoreAlvinegra = new ArvoreAlvinegra();
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
      arvoreAlvinegra.inserir(characters[i].getName());
    }

    do {
      nomesPersonagensPesquisados[totalPersonagensPesquisados] = MyIO.readLine();
    } while (!nomesPersonagensPesquisados[totalPersonagensPesquisados++].contains("FIM"));

    totalPersonagensPesquisados--;

    for (int i = 0; i < totalPersonagensPesquisados; i++) {
      // MyIO.setCharset("UTF-8");
      MyIO.print(nomesPersonagensPesquisados[i] + " ");

      if (arvoreAlvinegra.pesquisar(nomesPersonagensPesquisados[i])) {
        MyIO.println("SIM");
      } else {
        MyIO.setCharset("ISO-8859-1");
        MyIO.println("NÃO");
      }
    }
  }
}