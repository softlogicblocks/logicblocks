package logicblocks.post6_23_20;

public class MultiplyOverload {
    // Multiplies two integer numbers
    public double multiply(int x, int y) {
        int r = x * y;
        return r;
    }

    // Multiplies one double number and one integer number
    public double multiply(double x, int y) {
        double r = x * y;
        return r;
    }

    // Multiplies two double numbers
    public double multiply(double x, double y) {
        double r = x * y;
        return r;
    }

    // Multiplies two double numbers and round off decimals if third boolean parameter is true
    public double multiply(double x, double y, boolean ro) {
        double r = 0.0;
        if(ro) r = Math.round(x * y);
        else r = x * y;
        return r;
    }
}
