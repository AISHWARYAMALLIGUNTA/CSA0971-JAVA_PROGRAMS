class exception{
    public static void main(String[] args) {
        try {
            int result = 10 / 0;

            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);

            // NullPointerException
            String str = null;
            System.out.println(str.length());

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
