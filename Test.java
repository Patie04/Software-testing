package calc;

public class Test {
   
    public static void main(String[] args) {
        Calc c1=new Calc();
        c1.setFirstDigit(10);
        c1.setSecondDigit(4);
        c1.add(c1.getFirstDigit(),c1.getSecondDigit());
        
        System.out.println("Wynik: " + c1.add(c1.getFirstDigit(),c1.getSecondDigit()));
    }
}
