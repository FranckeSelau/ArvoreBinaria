
public class Arvore {

	private Node raiz;

	public void insert(int valor) {
		if (raiz == null)
			raiz = new Node(valor);
		else
			raiz.insert(valor);
	}

	public void print() {
		if (raiz != null)
			raiz.print();
	}
}
