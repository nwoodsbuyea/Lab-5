
public class Array_High_Numbers {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = 4;
     
        System.out.println("Numbers greater in the array than " + n + " are " + arrayCountReturn(intArray, n));
    }
    
    public static Integer arrayCountReturn(int[] intArray, int number){
        int arrayGreaterInt = 0;
        
        for (int i : intArray) {
            if (i > number) {
                arrayGreaterInt++;
            }
        }
        
        return arrayGreaterInt;
    }
}
