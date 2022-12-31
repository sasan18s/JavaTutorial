package ir.porteghali.java;

public class E26_TryCatchBlock {
    public void Start() {
        System.out.println("TryCatch Block");
        String porteghal = "20.2";
        String dxrt = "63";
        try {
            //int a = Integer.parseInt(porteghal);
            float b = Float.parseFloat(dxrt);
            System.out.println(b);
           // System.out.println(a);
        }
            catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        finally {
            System.out.println("Finally");
        }

    }
}