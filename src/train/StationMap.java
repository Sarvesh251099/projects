package train;
import java.util.*;
public class StationMap {

	private static final int UNKNOWN_DISTANCE = -1;
	private  Map<String,Integer> distanceFromHyderabad;
	
	public StationMap() {
		distanceFromHyderabad = new HashMap<>();
		loadDistance();
	}
	
	private void loadDistance() {
//		Train A distance from Hyderabad
			distanceFromHyderabad.put("CHN", 0);
			distanceFromHyderabad.put("SLM", 350);
			distanceFromHyderabad.put("BLR", 550);
			distanceFromHyderabad.put("KRN", 900);
			distanceFromHyderabad.put("HYB", 1200);
			distanceFromHyderabad.put("NGP", 1600);
			distanceFromHyderabad.put("ITJ", 1900);
			distanceFromHyderabad.put("BPL", 2000);
			distanceFromHyderabad.put("AGA", 2500);
			distanceFromHyderabad.put("NDL", 2700);
			
//			Train B distance
			distanceFromHyderabad.put("TVC", 0);
			distanceFromHyderabad.put("SRR", 300);
			distanceFromHyderabad.put("MAQ", 600);
			distanceFromHyderabad.put("MAO", 1000);
			distanceFromHyderabad.put("PNE", 1400);			
			
//			Next stations from Hyderabad
			
			distanceFromHyderabad.put("NGP", 1600);
			distanceFromHyderabad.put("ITJ", 1900);
			distanceFromHyderabad.put("BPL", 2000);
			distanceFromHyderabad.put("AGA", 2500);
			distanceFromHyderabad.put("NDL", 2700);
			distanceFromHyderabad.put("PTA", 3800);
			distanceFromHyderabad.put("NJP", 2200);
			distanceFromHyderabad.put("GHY", 2700);		
	}
	
	public int  getDistance(String station) {
		return distanceFromHyderabad.getOrDefault(station, UNKNOWN_DISTANCE);
	}
	
	
}
