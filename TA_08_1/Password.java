
public class Password {

	private String contrasena;
	private Integer longitud;
	
	public Password() {
		contrasena = "";
		longitud = 8;
	}
	
	public Password(Integer longitud) {
		this.longitud = longitud;
		this.contrasena = generarContrasena(longitud);
	}

	public String getContrasena() {
		return contrasena;
	}

	public Integer getLongitud() {
		return longitud;
	}

	private String generarContrasena(Integer longtd) {
		
		String alphabet = "qwertyuioplkjhgfdsazxcvbnm";
		String retPassw = "";

	    for(int i = 0; i<longtd; i++){
			char c = alphabet.charAt(genNumAleatorio(1,27));
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
		return "Password [contrasena=" + contrasena + ", longitud=" + longitud + "]";
	}
	
}
