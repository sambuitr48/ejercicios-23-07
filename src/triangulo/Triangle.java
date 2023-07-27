package triangulo;

public class Triangle {
    public Integer lado1;
    public Integer lado2;
    public Integer lado3;
    public void result(){
        if (lado1.equals(lado2)&& lado2.equals(lado3)){
            System.out.println("El triangulo es quilatero ya que sus lados son iguales");
        } else System.out.println("El triangulo no es equilatero ya que no todos sus lados son iguales");
    }
}
