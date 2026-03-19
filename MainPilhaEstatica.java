package pilha;

public class MainPilhaEstatica {
  public static void main(String[] args) {

    PilhaSimples<String> pilha = new PilhaSimples<>(5);

    System.out.println("Empilhando elementos...");
    pilha.empilhar("A");
    pilha.empilhar("B");
    pilha.empilhar("C");
    pilha.exibir();

    System.out.println("\nDesempilhando...");
    pilha.desempilhar();
    pilha.exibir();

    System.out.println("\nEmpilhando mais...");
    pilha.empilhar("D");
    pilha.empilhar("E");
    pilha.empilhar("F");
    pilha.exibir();

    System.out.println("\nDesempilhando tudo...");
    pilha.desempilhar();
    pilha.desempilhar();
    pilha.desempilhar();
    pilha.desempilhar();
    pilha.desempilhar();
    pilha.exibir();
  }
}
