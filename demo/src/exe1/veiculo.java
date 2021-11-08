class Veiculo {
	boolean estadoInicial;
	String marca;
	String modelo;
	String placa; 
	String cor; 
	float km;
    int quantidadeLitros;
    int nivelCombustivel;
	boolean isLigado; 
	int velocidade;
	double preco;
	
    void Acelerar() {
        if((estadoInicial == true) && (velocidade<velocidadeMax)&&(nivelCombustivel>0)) {
            System.out.println("Acelerando o veiculo...");
            velocidade += 20;
            nivelCombustivel -= 5;

        }
        else {
            System.out.println("Para acelerar, o carro deve estar ligado, velocidade não pode ser maior que a Máxima e o veiculo deve possuir combustivel");
        }
        
        
    }
    
    void Freiar() {
        if (velocidade == 0) {
            System.out.println("O veiculo já se encontra parado");
            this.velocidade = 0;
        }
        else {
            System.out.println("Você pisou no freio...");
            velocidade -= 20;
            
        }
        
    }
	
    void Abastecer(int quantidadeLitros) {
        
        nivelCombustivel += quantidadeLitros;
        
        if(quantidadeLitros>capacidadeTanque) {
            System.out.println("Quantidade maior que a capacidade do tanque");
            nivelCombustivel = nivelCombustivel - quantidadeLitros;
            System.out.println("Capacidade Máxima:" + capacidadeTanque +  "litros");
        }    
        if(nivelCombustivel>capacidadeTanque) {
            System.out.println("O tanque está cheio!");
            nivelCombustivel = nivelCombustivel - quantidadeLitros;
            System.out.println("Nível do combustivel:" + nivelCombustivel + "litros");
                
        }		
    }
    void Ligar() {
    	if(estadoInicial == true) {
    		System.out.println("O veiculo já está ligado");
    	}
    	else {
    		System.out.println("Ligando o veiculo...");
    		estadoInicial = true;
    	}
    }
    
    void Desligar() {
    	if(estadoInicial==false) {
    		System.out.println("O veiculo já está desligado");
    	}
    	
    	else {
            System.out.println("Desligando o veiculo...");
            estadoInicial = false;
        }

    }
    
    
    void Pintar(int cor) {
        if((pintar<0)||(pintar>5)){
        	System.out.println("Cor inválida. Operação não foi concluida!");
        }    
        else {
            pintar= cor;
        }    		
    }


  
	
}