
public class Node {

	private int valor;
	private Node esquerda;
	private Node direita;

	public Node(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void insert(int valor) {
		if (esquerda == null)
			esquerda = new Node(valor);
		else if (direita == null)
			direita = new Node(valor);
		else
			if (esquerda.valor > direita.valor) {
				esquerda.insert(valor);
			} else {
				direita.insert(valor);
			}
	}
	
	public void print() {
		System.out.print("(" + valor + " ");
		if (esquerda != null)
			esquerda.print();
		else
			System.out.print("_");
		if (direita != null)
			direita.print();
		else
			System.out.print(" _");
		System.out.print(")");
	}
}
