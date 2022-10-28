public class OperadoresRelacionaisLogicos {
    public static void main(String[] args) {

        int numero1 = 1;
        int numero2 = 2;

        if(numero1>numero2)
            System.out.println(numero1+" é maior que "+numero2);
        if(numero1<numero2)
            System.out.println(numero1+" é menor que "+numero2);
        if(numero1>=numero2)
            System.out.println(numero1+" é maior ou igual a "+numero2);

        String nome1 = "JAVA";
        String nome2 = new String("JAVA");
        System.out.println(nome1.equals(nome2)); // equals compara o conteúdo de objetos

        boolean condicao1 = true;
        boolean condicao2 = false;

        if( condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }

    }
    
}
