
public class Queue {
    Student first;
    Student last;
    
    public void enqueu(int id, String name){
        Student x = new Student(id, name);
        if(first == null){
            first = x;
            last = x;
        }else{
            last.next = x;
            last = x;
        }
    }
    
    public void dequeu(){
        if(first == null){
            System.out.println("--- EMPTY ---");
            return;
        }else{
            first = first.next;
        }
    }
    
    public void print(){
        if(first == null){
            System.out.println("--- EMPTY ---");
            return;
        }else{
            Student tmp = first;
            while(tmp != null){
                
                System.out.print(tmp.name + " --> ");
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }
}
