public class Conta {
    double saldo = 10;
    
    public void sacar(Double valor) {
		//variavel local de método
		double novoSaldo = saldo - valor;
	}

    public void imprimirSaldo(){
		//disponível em toda classe
		System.out.println(saldo);
		// ERRO:somente o método sacar conhece esta variavel
		//System.out.println(novoSaldo);

    public double calcularDividaExponencial(){
        double valorMontante = 0;
        return valorMontante;
    }

   
}
