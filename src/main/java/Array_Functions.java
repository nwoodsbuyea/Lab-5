
public class Array_Functions {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        
        System.out.println(getTotal(intArray));
        System.out.println(getAverage(intArray));
        System.out.println(getHighest(intArray));
        System.out.println(getLowest(intArray));
    }
    
    public static Integer getTotal(int[] intArray){
        int arrayTotal = 0;
        
        for (int i = 0; i < intArray.length; i++) {
           arrayTotal += intArray[i];
        }
        
        return arrayTotal;
    }
    
    public static Integer getAverage(int[] intArray){
        int arrayCount  = 0;
        int arrayTotal2 = 0;
        int arrayAverage= 0;
        
        for (int x = 0; x < intArray.length; x++){
            arrayCount++;
            arrayTotal2 += intArray[x];
        }
        
        arrayAverage = arrayTotal2 / arrayCount;
        
        return arrayAverage;
    }
    
    public static Integer getHighest(int[] intArray){
        int arrayNumber = 0;
        int arrayNumberHighest = 0;
        
        for (int y = 0; y < intArray.length; y++){
            arrayNumber = intArray[y];
            
            if (arrayNumber > arrayNumberHighest){
                arrayNumberHighest = arrayNumber;
            }
        }
        
        return arrayNumberHighest;
    }
    
    public static Integer getLowest(int[] intArray){
        int arrayNumber2 = 0;
        int arrayNumberLowest = 100;
        
        for (int b = 0; b < intArray.length; b++){
            arrayNumber2 = intArray[b];
            
            if (arrayNumber2 < arrayNumberLowest){
                arrayNumberLowest = arrayNumber2;
            }
        }
        
        return arrayNumberLowest; 
    }    
}
