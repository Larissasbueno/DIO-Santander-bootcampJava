package edu.larissa.segundasemana;
public class MinhaClasse {
    
    public static void main(String[] args) {
        
        String primeirNome = "Larissa";
        String segundoNome = "Bueno";

        String nomeCompleto = nomeCompleto(primeirNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
