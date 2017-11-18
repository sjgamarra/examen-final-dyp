package pregunta3;

public class Client {

    public static void main(String[] args) {
        int[] numbers = { 1, 5, 7, 78, 9, 2, 24, 38, 78, 91, 96, 4, 6, 17, 101, 24, 38, 47, 37, 148, 2, 589};
        boolean hasDuplicates;
        for (ComplexityType complexityType : ComplexityType.values()) {
            switch(complexityType) {
                case Lineal: 
                    hasDuplicates = hasDuplicateValuesLineal(numbers);
                    System.out.println(hasDuplicates);
                    break;
                case Cuadratic: 
                    hasDuplicates = hasDuplicateValuesCuadratic(numbers);
                    System.out.println(hasDuplicates);
                    break;
                case Exponential: 
                    hasDuplicates = hasDuplicateValuesExponential(numbers);
                    System.out.println(hasDuplicates);
                    break;
            }
        }
    }
    
  //esto se hace con recursividad!!
    public static boolean hasDuplicateValuesCuadratic(int[] numbers)
    {
        long steps = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                steps++;
                if (i != j && numbers[i] == numbers[j]) {
                    System.out.println(steps + " steps");
                    return true;
                }
            }
        }
        System.out.println(steps + " steps");
        return false;
    }    
    
    public static boolean hasDuplicateValuesLineal(int[] numbers)
    {        
    	
        return true;
    }
    
    public static boolean hasDuplicateValuesExponential(int[] numbers)
    {        
        return true;
    }
}
