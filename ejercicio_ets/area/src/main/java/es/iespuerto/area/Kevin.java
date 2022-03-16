package es.iespuerto.area;

/**
 * Clase para creación de figuras y cálculos de áreas con las mismas.
 * 
 * @author Kevin Ruiz
 * @version 1.0 16/03/22
 */
public class Kevin {
    private String tipo;
    private int valor1;
    private int valor2;

    /**
     * Constructor por defecto de la clase.
     */
    public Kevin() {
    }

    /**
     * Constructor que recibe el tipo de área que va a almacenar.
     * 
     * @param tipo Tipo de área de la figura.
     */
    public Kevin(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Constructor que recibe los valores de la figura a la que se le calculará el área.
     * 
     * @param valor1 Primer valor de la figura.
     * @param valor2 Segundo valor de la figura.
     */
    public Kevin(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    /**
     * Método destinado al cálculo del área de una figura, recibiendo dos valores.
     * 
     * @param valor1 Primer valor de la figura.
     * @param valor2 Segundo valor de la figura.
     * @return Área de la figura deseada.
     */
    public double calculoArea(int valor1, int valor2) {
        double area = 0;
        return area;
    }
}
