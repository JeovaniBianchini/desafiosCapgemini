
import java.util.Scanner;

public class SenhaSegura {

    public static void main(String[] args) {
        System.out.println("Digite uma senha para saber se ela é segura!");
        System.out.println("Requisitos: " +
                "Minimo 6 caracteres," +
                " 1 letra maiúscula," +
                " 1 letra minúscula," +
                " 1 caractere especial(!#@$%&)," +
                " 1 digito");

        Scanner ler = new Scanner(System.in);
        String senha = ler.next();

        if(senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!#@$%&])(?=.*[0-9]).{6,}$")){
            System.out.println("Senha forte");
        }
        else{
            System.out.println("Senha fraca");
        }
    }
}

