	//Los atributos se han definido como privados por la naturaleza de las contraseñas para el usuario
	//se podran acceder a ellos mediante getters y existira un setter para contraseña en el caso que el usuario la quiera cambiar
	//por ultimo, utilizar este setter modificara tambien la longitud de la contraseña

public class Password {
	
	private String contraseña;
	private Integer longitud;
	
	public Password() {
		contraseña = "";
		longitud = 8;
	}
	
	public Password(Integer longitud) {
		this.longitud = longitud;
		this.contraseña = generarContraseña(longitud);
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
		this.longitud = contraseña.length();
	}

	public Integer getLongitud() {
		return longitud;
	}

	private String generarContraseña(Integer longtd) {
		
		String alphabet = "qwertyuioplkjhgfdsazxcvbnm";
		String retPassw = "";

	    for(int i = 0; i<longtd; i++){
			char c = alphabet.charAt(genNumAleatorio(1,25));
			retPassw += c;
		}
	    return retPassw;
	}
	private static int genNumAleatorio(int minVal, int maxVal) {
		int range = (maxVal-minVal)+1;
		return (int)(Math.random()*range)+minVal;
	}
	
	@Override
	public String toString() {
		return "Password [contraseña=" + contraseña + ", longitud=" + longitud + "]";
	}
	
}
