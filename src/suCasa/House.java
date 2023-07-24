package suCasa;

public class House {
    public int houseValue;
    public String houseType;
    public int houseCommission;

    public void houseCost(){
        if(houseType.equals("Nuevo") || houseType.equals("nuevo")){
            houseCommission = (houseValue * 10/100);
            System.out.println("El valor de la casa es de: " +houseValue + ", con la comision el valor de la casa es: " + houseCommission);
        } else if (houseType.equals("Usado") || houseType.equals("usado")){
            houseCommission = (houseValue * 12/100);
            System.out.println("El valor de la casa es de: " +houseValue + ", con la comision el valor de la casa es: " + houseCommission);
        } else {
            System.out.println("Tipo de inmueble invalido...");
        }
    }
}
