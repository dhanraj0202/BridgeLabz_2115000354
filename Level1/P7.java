public class P7{
	public static void main(String[] args){
		double radiusKm = 6378;
		double radiusMiles = radiusKm*0.62;
		double volumeKm = 1.33*3.14*radiusKm*radiusKm*radiusKm;
		double volumeMiles = 1.33*3.14*radiusMiles*radiusMiles*radiusMiles;
		System.out.print("The volume of earth in kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
	}
}