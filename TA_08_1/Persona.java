
public class Persona {

	protected enum sexos {H, M};
	
	final sexos SEX_DEF = sexos.H;
	
	private String DNI;
	private String nombre;
	private Integer edad;
	protected sexos sexo;
	private double peso;
	private double altura;
	
	public Persona() {
		//DNI;
		nombre = "";
		edad = 0;
		sexo = SEX_DEF;
		peso = 0f;
		altura = 0f;
	}
	
	public Persona(String nombre, Integer edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = checkSexo(sexo);
		//DNI;
		this.peso = 0f;
		this.altura = 0f;
	}

	public Persona(String dNI, String nombre, Integer edad, String sexo, double peso, double altura) {
		DNI = dNI;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = checkSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public sexos getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = checkSexo(sexo);
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	private sexos checkSexo(String sexo) {
	    //String tmpColor = sexo.toLowerCase();
		for (Object cSexo : sexos.values()) {
	    	 if (sexo.equals(cSexo.toString())) {
	    		 return (sexos)cSexo;
	    	 }
	    }
		
	    return SEX_DEF;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
}
