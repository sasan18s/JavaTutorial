package ir.porteghali.java;

public class E25_CastingVariables {
    public void Start(){
        System.out.println("Casting Variables");
        int Porteghal = 10 ;
        float sib = 15.3f;
        String Angoor = "25";
        Porteghal = Integer.parseInt(Angoor);
        System.out.println(Porteghal);
        float a = 10.35f;
        double b = 203.556;
        int asb = 15;
        asb = (int) b ;
        System.out.println(asb);
        a = Float.parseFloat(Angoor);
        b = Double.parseDouble(Angoor);
        System.out.println(a);
        System.out.println(b);
    }
}
