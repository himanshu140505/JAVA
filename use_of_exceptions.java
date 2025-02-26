class use_of_exceptions {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } 
        finally {
            System.out.println("This block is always executed.");
        }
    }
}