public class CircularList {
    NodoSong head;
    NodoSong current;
    int size;

    public CircularList() {
        this.head = null;
        this.current = head;
        this.size = 0;
    }

    public void add(String name) {
        NodoSong temp = new NodoSong(name);
        if (head == null) {
            head = temp;
            head.next = head;
            head.prev = head;
            current = head;
        } else {
            NodoSong it = head;
           
            while (it.next != head) {
                it = it.next;
            }
            temp.prev = it;
            head.prev = temp;
            temp.next = head;
            it.next = temp;
            
        
        } 
        size++;
        
    }

    public String nextSong() {
        if(current == null){
            return null;
        }else{

        current = current.next;
        String name = current.name;
        return name;
        }

    

    }
    
    public String prevSong() {
        if (current == null) {
            return null;
        }else{
            current = current.prev;
            String name = current.name;
            return name;
        }

    }

    public String getCurrentSong() {
        
        
        return current.name;
    }

    public boolean isEmpty() {
        return false;
    }

}