package examen;

public class Test {
    public int total;
    public String pregunta1;
    public String pregunta2;
    public String pregunta3;
    public String pregunta4;
    public String pregunta5;
    public void resultado(){
        if(pregunta1.equals("c")){
            total+=10;
        }
        if (pregunta2.equals("a")){
            total+=10;
        }
        if (pregunta3.equals("d")){
            total+=10;
        }
        if (pregunta4.equals("b")){
            total+=10;
        }
        if (pregunta5.equals("a")){
            total+=10;
        }
        System.out.println("Su calificación es de: " + total);
    }

}
