package tp1.ejercicio5;

public class Resultado {
	public Resultado(int min, int max, double prom) {
		super();
		this.min = min;
		this.max = max;
		this.prom = prom;
	}
	
	public Resultado () {}
	
	private int min = 999;
	private int max = -999;
	private double prom =0;
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public double getProm() {
		return prom;
	}
	public void setProm(double prom) {
		this.prom = prom;
	}
	
	public void calcular(int []v) {
		for(int i=0;i<v.length;i++) {
			if(v[i]>this.max) {
				this.max=v[i];
			}
			if(v[i]<this.min) {
				this.min=v[i];
			}
			this.prom=this.prom+v[i];
		}
		this.prom=this.prom/v.length;
	}
	
	
	public void resultado() {
		System.out.println("minimo: "+this.getMin()+" maximo: "+this.getMax()+" promedio: "+this.getProm());
	}

}
