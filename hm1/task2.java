package hm1;


    public class task2 {
        public static void main(String[] args) {
            for (int i = 2; i <= 1000; i++) {
                boolean isSimple = true;
    
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isSimple = false;
                        break;
                    }
                }
    
                if (isSimple) 
                    System.out.println(i);
                
            }
        }
    }

