
public class Circulo_LMPM extends FiguraGeometrica_LMPM {
	private double radio;
	
	//Convertir negativo a positivo
	if radio <0 then radio = (radio*-1);
			
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_LMPM(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
