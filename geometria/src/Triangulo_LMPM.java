
public class Triangulo_LMPM extends FiguraGeometrica_LMPM {
	private double a;
	private double b;
	private double c;
	
	@Override
	public double perimetro() {
		return a + b + c;
	}

	@Override
	public double area() { //Utiliza la formula de Her�n
		double sp;
		sp = this.perimetro() / 2;
		return Math.sqrt(sp * (sp-a) * (sp-b) * (sp-c));
	}
}

