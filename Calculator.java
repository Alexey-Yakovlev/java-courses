public class Calculator {
	private float res;
	
	public void add(float[] params) {
		for (float param : params) {
			this.res += param;
		}
	}
	
	public void mult(float[] params) {
        this.res = 1;
		for (float param : params) {
			this.res *= param;
		}
	}
	
	public void subtr(float[] params) {
        if (params.length <= 1) {
            this.res = params[0];
        }
        this.res = params[0];
        for (int i = 1; i < params.length; i++) {
            this.res -= params[i];
        }
	}	

	public void divide(float[] params) {
        if (params.length <= 1) {
            this.res = params[0];
        }
        this.res = params[0];
        for (int i = 1; i < params.length; i++) {
            this.res /= params[i];
        }
	}	
	
	public float getResult() {
		return this.res;
	}
	
	public void cleanResult() {
		this.res = 0;
	}
}