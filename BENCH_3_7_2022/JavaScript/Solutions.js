function solve(arr, par){
	arr2 = [];
	let i = 0;
	if(par == "odd"){
		i = arr.length;
	}
	else i = arr.length - 1;

	let iter = 0;
	while (i > -1){
		arr2[iter] = arr[i];
		i -= 2;
		iter++;
	}
	return arr2.reverse();
}