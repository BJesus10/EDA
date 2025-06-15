public class Principal {
    public static void main(String[] args) {
        // Crear una lista enlazada
        ListaEnlazada lista = new ListaEnlazada();

        // Agregar un array de elementos
        int[] valores = {1, 2, 3, 4, 5};
        String[] nombres = {"Uno", "Dos", "Tres", "Cuatro", "Cinco"};
        

        // Mostrar los elementos de la lista
        for (int i = 0; i < valores.length; i++) {
            lista.agregar(valores[i], nombres[i]);
        }
        
        lista.mostrar();
    }

    // Mostrar los elementos de la lista
    
}
