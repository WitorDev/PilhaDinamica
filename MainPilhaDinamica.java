package pilha;

public class MainPilhaDinamica {
  public static void main(String[] args) {

    PilhaDinamica pilha = new PilhaDinamica();

    System.out.println("\nEmpilhando...");
    pilha.empilhar("A");
    pilha.empilhar("B");
    pilha.empilhar("C");
    pilha.exibir();

    System.out.println("\nDesempilhando...");
    pilha.desempilhar();
    pilha.exibir();

    System.out.println("\nDesempilhando tudo...");
    pilha.desempilhar();
    pilha.desempilhar();
    pilha.desempilhar();
    pilha.exibir();
  }
}
