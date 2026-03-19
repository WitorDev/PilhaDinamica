package pilha;

public class PilhaDinamica {

  No inicio;

  public PilhaDinamica() {
    this.inicio = new No(null);
    System.out.println("Pilha Dinamica foi criada");
  }

  public void empilhar(String elemento) {
    No novo = new No(elemento);
    novo.setProx(inicio);
    inicio = novo;
  }

  public void desempilhar() {

    if (estaVazio()) {
      return;
    }

    inicio = inicio.getProx();
  }

  public void exibir() {
    No aux = this.inicio;

    if (estaVazio()) {
      System.out.println("A pilha está vazia");
      return;
    }

    while (aux.getProx() != null) {
      System.out.println(aux.getConteudo());
      aux = aux.getProx();
    }
  }

  public boolean estaVazio() {
    return this.inicio == null;
  }

}
