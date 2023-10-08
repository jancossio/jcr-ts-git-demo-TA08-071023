//se han dejado los atributos con proteccion privada permitiendo el acceso a ellos mediante getters
//y su manipulacion mediante setters (dado que no parecia haber ninguna restriccion estricta respecto a ello)

public class Serie {

private String titulo;
private Integer numTemporadas;
private boolean entregado;
private String genero;
private String creador;

public Serie() {
	titulo = "";
	numTemporadas = 3;
	entregado = false;
	genero = "";
	creador = "";
}

public Serie(String titulo, String creador) {
	this.titulo = titulo;
	this.creador = creador;
	numTemporadas = 3;
	entregado = false;
	genero = "";
}

public Serie(String titulo, Integer numeroTemp, String genero, String creador) {
	this.titulo = titulo;
	this.numTemporadas = numeroTemp;
	this.entregado = false;
	this.genero = genero;
	this.creador = creador;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public Integer getNumTemporadas() {
	return numTemporadas;
}

public void setNumTemporadas(Integer numTemporadas) {
	this.numTemporadas = numTemporadas;
}

public boolean isEntregado() {
	return entregado;
}

public void setEntregado(boolean entregado) {
	this.entregado = entregado;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public String getCreador() {
	return creador;
}

public void setCreador(String creador) {
	this.creador = creador;
}

@Override
public String toString() {
	return "Serie [titulo=" + titulo + ", numeroTemp=" + numTemporadas + ", entregado=" + entregado + ", genero=" + genero
			+ ", creador=" + creador + "]";
}

}
