/**
 *
 * @author luismiguelpazosmoreno
 * @version 1.2
 * 
 *
 */
public class Rectangulo_LMPM extends FiguraGeometrica_LMPM {
	private double l1;
	private double l2;
	
	public Rectangulo_LMPM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	@Override
	public double area() {
		return l1 * l2;
	}
	
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
