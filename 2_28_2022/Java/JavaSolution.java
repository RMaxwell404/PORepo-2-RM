class Solutions{
	

	public static int triangleProblem(){
		int i = 1;
		int g == 0;
		while (g < 500){
			int ret = triangleNumber(i);
			g = this.factors(ret);
			if(g >= 500){
				return ret;
			}
			i++;
		}
	}

	public static int factors(int g){
		int k = 0;
		for (int i=1; i<=Math.sqrt(g); i++){
			if(g%i==0){
				if(g/i == i) k++;
				else k += 2;
			}
		}
		return k;
	}
	
	public static int triangleNumber(int tri){
		int triNum;
		for(int t = 1; t<=tri; t++){
			triNum = triNum + t;
		}
		return triNum;

	}

}