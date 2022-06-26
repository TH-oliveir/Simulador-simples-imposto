public class PessoaJuridica extends Contribuinte {
    
    private Double cnpj;
   public PessoaJuridica(){

   }
    public PessoaJuridica(String name, Double rendaBruta, Double cnpj) {
        super(name, rendaBruta);
        this.cnpj = cnpj;
    }

    public Double getCnpj() {
        return cnpj;
    }

    public void setCnpj(double d) {
        this.cnpj = (double) d;
    }

    @Override
    public double calcularImposto() {
       return super.getRendaBruta() * 0.1;
       
    }

    @Override
    public String toString() {
       String pc = "Pessoa Juridica";
       pc = super.toString();
     pc += "PessoaJuridica [cnpj=" + cnpj + "]";
     pc += ";\n imposto a ser pago:  " + calcularImposto();
     return pc;
    }
    
}
