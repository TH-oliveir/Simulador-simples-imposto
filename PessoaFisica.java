

public class PessoaFisica extends Contribuinte{

private Double cpf;

public PessoaFisica(){

}
public PessoaFisica(String name, Double rendaBruta, Double cpf) {
    super(name, rendaBruta);
    this.cpf = cpf;
}

public Double getCpf() {
    return cpf;
}

public void setCpf(Double cpf) {
    this.cpf = (double) cpf;
}

@Override
public double calcularImposto() {

     Double renda = this.getRendaBruta();

    if (renda <= 1400){
    return 0;
    }
    else if (renda > 1400 && renda <= 2100){
        return (renda * 0.1) - 100;
    }
    else if (renda > 2100 && renda <= 2800){
        return (renda * 0.15) - 270;
    }

    else if (renda > 2800 && renda <= 3600){
        return (renda * 0.25) - 500;
    }
     return renda *0.3 - 700;
    

}

@Override
public String toString() {
    String pc = "\nPessoa Fisica!\n ";
        pc = super.toString();
     pc += "PessoaFisica [cpf=" + cpf + "]";
     pc += "; \n imposto a ser pago:  " + calcularImposto();
     return pc;
}




   



















}