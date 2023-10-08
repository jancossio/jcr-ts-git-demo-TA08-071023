//al dejar los atributos como protected, y asi que solo puedan acceder clases hijas y del package a este,
//no se ha decidido añadir getters y setters

public class Electrodomestico {

protected enum colors {blanco, negro, rojo, azul, gris};
protected enum energia {A, B, C, D, E, F};

protected final colors COLOR_DEF = colors.blanco;
protected final energia ENERG_DEF = energia.F;

protected double precioBase;
protected colors color;
protected energia consumoElect;
protected double peso;

public Electrodomestico() {
	precioBase = 100;
	color = COLOR_DEF;
	consumoElect = ENERG_DEF;
	peso = 5;
}

public Electrodomestico(double precioBase, double peso) {
	this.precioBase = precioBase;
	this.peso = peso;
	this.color = COLOR_DEF;
	this.consumoElect = ENERG_DEF;
}

public Electrodomestico(double precioBase, String color, String consumoElect, double peso) {
	this.precioBase = precioBase;
	this.color = checkColor(color);
	this.consumoElect = checkEnerg(consumoElect);
	this.peso = peso;
}

private colors checkColor(String color) {
    //String tmpColor = color.toLowerCase();
  
    for (Object cColor : colors.values()) {
    	if (color.equals(cColor.toString())) {
    	   		 return (colors)cColor;
    	   	 }
    }
    return COLOR_DEF;
}

private energia checkEnerg(String energ) {
    //String tmpEnerg = energ.toLowerCase();

   for (Object tEnerg : energia.values()) {
	   if (energ.equals(tEnerg.toString())) {
   		 return (energia)tEnerg;
   	 	}
   }
    return ENERG_DEF;
}

@Override
public String toString() {
	return "Electrodomestico [h=" + ENERG_DEF + ", precioBase=" + precioBase + ", color=" + color + ", consumoElect="
			+ consumoElect + ", peso=" + peso + "]";
}

}
