public class JavaQuestion{

public static String concatProd(int a, int b){

	Int[] arr = new Int[b];
	for(i = 1; i < b; i++){
		arr[i-1] = a * i;
	}

	String[] arr2 = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);

	String str = String.join("", arr2);
	return str;
}

}