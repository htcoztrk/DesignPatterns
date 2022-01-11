
public enum Planets {
//Her bir gezegen, enum sabiti olarak tanımlandı, yer çekimi değerleri belirlendi.
	MERKUR(3.70),
	VENUS(8.87),
	MARS(3.77),
	JUPITER(23.30),
	SATURN(9.2),
	NEPTUN(11.0),
	URANUS(8.69),
	PLUTON(0.06);
	
	double gravity;
	Planets(double gravity) {
		this.gravity=gravity;
	}
	public double getGravity() {
		return this.gravity;
	}
}
