public class JavaQuestion{


public static String getActualMemory(String memory){
	String size = memory.substring(0, memory.length()-2);
	String type = memory.Substring(memory.length()-2);

	double size2 = parseDouble(size);

	double realMem = (size2 - (size2 * 0.07));

	if(type == "GB" && realMem < 1){
		String trunc = new DecimalFormat("#.###").format(realMem);
		return (trunc.substring(trunc.length() - 3) + "MB");
	}

	else return (new DecimalFormat("#.###").format(realMem) + type);
}







}