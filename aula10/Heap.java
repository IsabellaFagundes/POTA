
public class Heap {
    private No[] heapVector;
    private int tamHeap;

    public Heap(int maxSize) {
        heapVector = new No[maxSize];
        tamHeap = 0;
    }

    // insere um novo No no vetor (Heap)
    public void insert(No newNode) {
        if (tamHeap >= heapVector.length) {
            return;
        }
        heapVector[tamHeap] = newNode;
        tamHeap++;
    }

    // verificar se este índice existe no vetor
    private boolean exists(int index) {
        return index < tamHeap;
    }

    // verifica se um Nó é folha
    private boolean isLeaf(int index) {
        return index >= tamHeap / 2;
    }

    // realiza a atribuição do No em um certo indice
    private void replaceIn(int index, No no) {
        heapVector[index] = no;
    }

    // verifica qual o maior dos filhos (retorna o índice do maior filho)
    // considera que o no índex não é folha
    public int getMaxChild(int index) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (exists(rightChild) && heapVector[rightChild].getDado() > heapVector[leftChild].getDado()) {
            return rightChild;
        }

        return leftChild;
    }

    public String showHeap() {
        String out = "";

        for (No no : heapVector) {
            out += no.getDado() + ", ";
        }

        return out;
    }

    // Monta o Heap Maximo
    private void makeMaxHeap() {
        for (int i = (tamHeap - 1) / 2; i >= 0; i--) {
            adjustHeap(i);
        }
    }

    // "coração" do algoritmo. Move um No (index) para sua posição correta no heap Maximo
    private void adjustHeap(int index) {
        int maxChildIndex;
        No root = heapVector[index]; // no raiz da "subarvore" indicada por index

        while (!isLeaf(index)) {
            maxChildIndex = getMaxChild(index);

            if (root.getDado() >= heapVector[maxChildIndex].getDado()) {
                break;
            }
            // sobe o filho maior, para o lugar do pai
            heapVector[index] = heapVector[maxChildIndex];
            index = maxChildIndex;
        }
        heapVector[index] = root;
    }

    // Algoritmo principal
    public void heapSort() {
        makeMaxHeap();

        for (int i = tamHeap - 1; i >= 0; i--) {
            No biggestNo = removeNo();
            replaceIn(i, biggestNo); // coloca o maior No (raiz) no final do vetor

            adjustHeap(0); // monta novamente o Heap Máximo
        }
    }

    // "remove" o maior elemento do vetor (raiz)
    private No removeNo() {
        if (tamHeap <= 0) { // se ainda existem elementos no vetor
            return null;
        }

        No root = heapVector[0];
        heapVector[0] = heapVector[tamHeap - 1];
        tamHeap--;

        return root;
    }
}
