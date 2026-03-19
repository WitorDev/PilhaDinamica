public class PilhaSimples<T> {

  private String[] pilha;

  public PilhaSimples(int tamanho) {
    pilha = new String[tamanho];
  }

  public void empilhar(String elemento) {
    for (int i = 0; i < pilha.length; i++) {
      if (pilha[i] == null) {
        pilha[i] = elemento;
        return;
      }
    }
  }

  public void desempilhar() {
    if (estaVazia()) {
      return;
    }
    if (estaCheia()) {
      pilha[pilha.length - 1] = null;
      return;
    }

    for (int i = 0; i < pilha.length; i++) {
      if (pilha[i] == null) {
        pilha[i - 1] = null;
        return;
      }
    }
  }

  private boolean estaVazia() {
    for (String elemento : pilha) {
      if (elemento != null) {
        return false;
      }
    }
    return true;
  }

  private boolean estaCheia() {
    if (pilha[pilha.length - 1] != null) {
      return true;
    } else
      return false;
  }

  public void exibir() {
    for (String elemento : pilha) {
      System.out.println(elemento);
    }
  }

}