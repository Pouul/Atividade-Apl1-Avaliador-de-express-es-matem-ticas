import java.util.Scanner;

public class Expressao_matematica {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while(entrada != "exit"){
        String entrada = scanner.nextLine();
        entrada = entrada.replaceAll(" ", "");
        
        for(int i = 0 ; i < entrada.length() ; i++){
            char[] C_entrada = C_entrada.toCharArray();

            if(C_entrada[1] == "="){
                Vars V1 = new Vars(X,10);
                System.out.println(V1);
            }
        }
        
    }
}
}  