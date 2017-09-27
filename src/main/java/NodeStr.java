import java.util.HashMap;
import java.util.Map;

public class NodeStr {
	
	String name = null;
	Map<String, NodeStr> reportingNamesMap = null;
	
	public NodeStr(String nme) {
		this.name = nme;
	}

	public void addRepotee(String... repoteeArr) {
		if(reportingNamesMap == null) {
			reportingNamesMap = new HashMap<String,NodeStr>();
		}
		
		for(String nme : repoteeArr) {
			reportingNamesMap.put(nme, new NodeStr(nme));
		}
	}

	public NodeStr getRepotee(String repoteeName) {
		return reportingNamesMap.get(repoteeName);
	}
	
	public boolean hasRepotee() {
		return !(reportingNamesMap==null || reportingNamesMap.isEmpty());
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
