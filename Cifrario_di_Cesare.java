import java.util.Scanner;
public class Cifrario_di_Cesare {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Inserire la frase:");
        String frase = scan.nextLine();
        frase=frase.toLowerCase();
        frase=frase.replaceAll(" ", "");
        System.out.println("Inserire il valore di cifratura");
        int valore= scan.nextInt();
        String codifica_Cesare= codifica(frase, valore);
        System.out.println(codifica_Cesare);
        scan.close();
    }
    private static String codifica(String frase,int valore) {
        String codifica_Cesare="";
        int lettera=0;
        for(int i=0;i<frase.length();i++){
            lettera=(int)frase.charAt(i)+ valore;
            if(lettera>122){
                lettera-=26;
            }
            codifica_Cesare+=(char)lettera;
        }
        return codifica_Cesare;
    }
}
