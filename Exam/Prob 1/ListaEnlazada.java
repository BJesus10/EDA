public class ListaEnlazada {
    Nodo head;
    int size;

    public ListaEnlazada() {
        this.head = null;
        this.size = 0;
    }

    public void agregar(int valor, String nombre) {
        Nodo nuevo = new Nodo(valor, nombre);
        if (head == null) {
            head = nuevo;
        }else{
            Nodo it = head;
            while (it.siguiente !=null) {
                it = it.siguiente;
                
            }
            it.siguiente = nuevo;
            nuevo.siguiente = null;
        }
        size++;
    }

    public void mostrar() {
        Nodo it = head;
        while (it != null) {    
            System.out.print(it.valor + "--->" + it.nombre + "-->");
            it = it.siguiente;
        }
        System.out.println("null");
    }
}
