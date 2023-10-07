
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
    String tmpColor = color.toLowerCase();
    for (colors ccolor : colors.values()) {
    	 if (ccolor.equals(tmpColor)) {
    		 return ccolor;
    	 }
    }
    return COLOR_DEF;
}

private energia checkEnerg(String energ) {
    String tmpEnerg = energ.toLowerCase();
    for (energia tEnerg : energia.values()) {
   	 	if (tEnerg.equals(tmpEnerg)) {
   		 return tEnerg;
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
