package Lab1;
public class Temperature {
    private double temp;
    private char scale;
    
    public Temperature() {
        this.temp = 0.0;
        this.scale = 'C';
    }
    
    public Temperature(double temp) {
        this.temp = temp;
       	this.scale = 'C';
    }
    
    public Temperature(char scale) {
        this.temp = 0.0;
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            this.scale = 'C';
        }
    }

    public Temperature(double temp, char scale) {
    	this.temp=temp;
    	this.scale=scale;
    }
    
	public void getCelsius() {
		if (this.scale == 'F') {
            double temp = (5 * (this.temp - 32)) / 9;
            output(temp,'C');
		}else {
			System.out.println("It is already Celsius "+this.toString());
		}
	}
	
	public double getFahrenheit() {
        if (this.scale == 'C') {
            double temp =(9 * this.temp / 5) + 32;
            output(temp,'F');
        }else {
			System.out.println("It is already Fahrenheit "+this.toString());
		}
        return temp;
    }
    public void setValue(double value) {
        this.temp = value;
    }
    public void setScale(char scale) {
        this.scale = scale;
    }
    public void setAll(double value,char scale) {
        this.temp = value;
        this.scale = scale;
    }
	public double getTemp() {
		return temp;
	}
	public char getScale() {
		return scale;
	}
	public String toString() {
    	return this.getTemp()+" "+this.getScale();
    }
    public void output(double value, char scale) {
    	System.out.println(value+" "+scale);
    }
}
