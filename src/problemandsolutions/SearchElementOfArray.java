package problemandsolutions;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.


    public static void main(String[] args) {

        int array[] = {10, 20, 25, 63, 96, 57};
        int size = array.length;
        int value = 20;

        for (int i=0 ;i< size-1; i++){
            if(array[i]==value){
                System.out.println("Element found index is :"+ i);
            }else{
                System.out.println("Element not found");
            }
        }



    }
}
