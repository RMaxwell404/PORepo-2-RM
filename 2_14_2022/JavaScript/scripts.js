function getHashTags(str){
	var split = str.split(' ');
	var words = split.sort(function(a, b) {
		return b.length - a.length;
	});

	var tags;
	for (let i = 0; i < Math.min(3, words.length); i++){
		tags[i] = ("#" + words[i]);
	}
}