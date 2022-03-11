class Solutions{

public static int fibonacciCalc(){

	int f1=0;
	int f2=1;
	int f3;
	int i;
	int sol;


	while(f3 < 4000000){
	f3=f1+f2;
	f1=f2;
	f2=f3;

	if(f3%2 == 0){
		sol += f3;
	}
	return sol;
}

}



}