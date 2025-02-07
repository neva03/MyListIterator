
import java.util.ListIterator;


public class ArrayListDriver {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(0, 1); //adds 5 in the 0th index 
        list.add(1, 2); //adds 2 in the 2nd index
        list.add(2, 3); //adds 4 in the 3rd index
      
        ListIterator<Integer> iter =list.myListIterator();

        System.out.println("previousIndex: "+ iter.previousIndex());
        System.out.println("list's size: "+ list.size());
        

        System.out.println("Testing hasNext() and next methods: ");
        while(iter.hasNext()){
            System.out.println(iter.next());            
        }
        System.out.println("Now iter is at the end of the list");
        System.out.println("nextIndex should return size which is:  "+ iter.nextIndex());
        System.out.println("previousIndex: "+ iter.previousIndex());
        System.out.println("Testing hasPrevious,previous, and remove methods ");
        while(iter.hasPrevious()){
            System.out.println(iter.previous()); 
            iter.remove();            
        }

        System.out.println("testing remove method, after removing all elements list'S size is: " + list.size());
        System.out.println("List is empty");
        System.out.println("Testing add method: ");
        iter.add(0);
        iter.add(1);
        iter.add(2);
        System.out.println("added 0 1 2 to list");
        System.out.println("iter has jumped over "+iter.previous()); 
        System.out.println("testing set method");
        iter.set(11); // 2 will be 11 
        System.out.println(list);

        ListIterator<Integer> iterSpecific =list.myListIterator(2);
        System.out.println(iterSpecific.nextIndex());
        System.out.println(iterSpecific.previousIndex());
    }
}
