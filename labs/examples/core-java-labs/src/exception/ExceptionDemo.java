package exception;

public class ExceptionDemo {

        public static void main(String[] args) { //throws InterruptedException {
            int a = 100;
            int b = 0;

            // add
            double result = add(a, b);
            System.out.println(result);

            // sub
            result = sub(a,b);
            System.out.println(result);

            // mul
            try {
                result = mul(a, b);
                System.out.println(result);
            }catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }finally {
                System.out.println("Multiply finally called...");
            }

            // div
            try {
                result = div(a,b);
                System.out.println(result);
            }catch(ArithmeticException e) {
                System.out.println("Arithmetic Exception: " + e.getMessage());
            }catch(ValidationException e) {
                System.out.println("Validation Exception: " + e.getMessage());
            }catch (Exception e) {
                System.out.println("General Exception: " + e.getMessage());
            }finally {
                System.out.println("Divide finally called...");
            }

            System.out.println("Operation Completed!!!");

            // handling the exception
//        try {
//            System.out.println(a / b); // throws ArithmeticException
//        }catch(ArithmeticException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
        }

        public static double add(double a, double b) {
            return a + b;
        }

        public static double sub(double a, double b) {
            return a - b;
        }

        public static double mul(double a, double b) throws InterruptedException {
            // pausing execution for 5 secs
            System.out.println("Waiting for 5 secs..");
            Thread.sleep(5000);

            return a * b;
        }

        public static double div(int a, int b) throws ValidationException {
            if(b == 0) {
//            System.out.println("Invalid value");
//            throw new Exception("Invalid value");
//            throw new ArithmeticException("Invalid Value");
                throw new ValidationException("Invalid value " + b);
            }

            return a / b;
        }

    }
    
