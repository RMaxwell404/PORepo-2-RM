function solve(cols[]){
	var time = (cols.length * 2)
	var prev = cols[0];
	for (int i = 0; i < cols.length; i++){
		if(cols[i] != prev){
			time++
		}
	}
	return time;
}