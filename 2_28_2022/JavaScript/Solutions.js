const vals = function zeroEnd(arr){

	let place = 0;
	for(let i = arr.length; i > 0; i--)
	{
		if(arr[i] === 0){
			arr.push(arr.splice(i, 1));
		}
	}
}