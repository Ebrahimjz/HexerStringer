package ir.derakhtco.seyedebrahim.hexerstringer;

public class MainClass {

    public static void main(String[] args) {

        String res = HexerStringer.createInstance().stringToHex("Hello World!!!");

        System.out.println("String To Hexadecimal Result: " + res);

        res = HexerStringer.createInstance().hexToString(res);

        System.out.println("Hexadecimal To String Result: " + res);

    }

}
