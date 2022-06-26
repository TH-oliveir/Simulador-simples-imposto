public abstract class Contribuinte{

private String name;
private Double rendaBruta;


public Contribuinte() {
}
public Contribuinte(String name, Double rendaBruta) {
    this.name = name;
    this.rendaBruta = rendaBruta;
}
public Double getRendaBruta() {
    return rendaBruta;
}
public void setRendaBruta(Double rendaBruta) {
    this.rendaBruta = rendaBruta;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}


public abstract double calcularImposto();


@Override
public String toString() {
    return "Contribuinte name:   " + name + ",\n rendaBruta=" + rendaBruta + "]\n";
}

















}