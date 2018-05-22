package course5;

public class ComplexNumber {

	private double m_dRealPart;
	private double m_dImaginPart;

	public ComplexNumber() {
		this.m_dRealPart = 0;
		this.m_dImaginPart = 0;
	}

	public ComplexNumber(double r, double i) {
		this.m_dRealPart = r;
		this.m_dImaginPart = i;
	}

	public double getRealPart() {
		return this.m_dRealPart;
	}

	public void setRealPart(double value) {
		this.m_dRealPart = value;
	}

	public double getImaginaryPart() {
		return this.m_dImaginPart;
	}

	public void setImaginaryPart(double value) {
		this.m_dImaginPart = value;
	}

	public ComplexNumber complexAdd(ComplexNumber c) {
		ComplexNumber result = new ComplexNumber();
		result.setRealPart(m_dRealPart + c.getRealPart());
		result.setImaginaryPart(m_dImaginPart + c.getImaginaryPart());
		return result;
	}

	public ComplexNumber complexAdd(double c) {
		ComplexNumber result = new ComplexNumber();
		result.setRealPart(m_dRealPart + c);
		result.setImaginaryPart(m_dImaginPart);
		return result;
	}

	public ComplexNumber complexMinus(ComplexNumber c) {
		ComplexNumber result = new ComplexNumber();
		result.setRealPart(m_dRealPart - c.getRealPart());
		result.setImaginaryPart(m_dImaginPart - c.getImaginaryPart());
		return result;
	}

	public ComplexNumber complexMinus(double c) {
		ComplexNumber result = new ComplexNumber();
		result.setRealPart(m_dRealPart - c);
		result.setImaginaryPart(m_dImaginPart);
		return result;
	}

	public ComplexNumber complexMulti(ComplexNumber cn) {
		double a = m_dRealPart, b = m_dImaginPart;
		double c = cn.getRealPart(), d = cn.getImaginaryPart();
		ComplexNumber result = new ComplexNumber();
		result.setRealPart(a * c - b * d);
		result.setImaginaryPart(b * c + a * d);
		return result;
	}

	public ComplexNumber complexMulti(double c) {
		double a = m_dRealPart, b = m_dImaginPart, d = 0;
		ComplexNumber result = new ComplexNumber();
		result.setRealPart(a * c - b * d);
		result.setImaginaryPart(b * c + a * d);
		return result;
	}

	public ComplexNumber complexDiv(ComplexNumber cn) {
		double a = m_dRealPart, b = m_dImaginPart;
		double c = cn.getRealPart(), d = cn.getImaginaryPart();
		ComplexNumber result = new ComplexNumber();
		result.setRealPart((a * c + b * d) / (c * c + d * d));
		result.setImaginaryPart((b * c - a * d) / (c * c + d * d));
		return result;
	}

	public ComplexNumber complexDiv(double c) {
		double a = m_dRealPart, b = m_dImaginPart, d = 0;
		ComplexNumber result = new ComplexNumber();
		result.setRealPart((a * c + b * d) / (c * c + d * d));
		result.setImaginaryPart((b * c - a * d) / (c * c + d * d));
		return result;
	}

	public String toString() {
		if (m_dImaginPart >= 0)
			return String.format("%.2f+%.2f", m_dRealPart, m_dImaginPart);
		else
			return String.format("%.2f%.2f", m_dRealPart, m_dImaginPart);
	}
}
