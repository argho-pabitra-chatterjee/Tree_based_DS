
public class CreateMultiChildNodeTree {

	/**
	 * Just create a tree
	 */
	public static NodeStr get(){
		NodeStr root = new NodeStr("CEO");
		root.addRepotee("VP1","VP2","VP3","VP4");
		
		// adding AVPs
		NodeStr VP1 = root.getRepotee("VP1");
		VP1.addRepotee("AVP11","AVP12","AVP13","AVP14");
		NodeStr VP2 = root.getRepotee("VP2");
		VP2.addRepotee("AVP21","AVP22","AVP23","AVP24");
		NodeStr VP3 = root.getRepotee("VP3");
		VP3.addRepotee("AVP31","AVP32","AVP33","AVP34");
		NodeStr VP4 = root.getRepotee("VP4");
		VP4.addRepotee("AVP41","AVP42","AVP43","AVP44");
		
		// Adding Managers under AVP1
		VP1.getRepotee("AVP11").addRepotee("Manager111");
		VP1.getRepotee("AVP11").addRepotee("Manager112");
		VP1.getRepotee("AVP11").addRepotee("Manager113");
		
		VP1.getRepotee("AVP12").addRepotee("Manager121");
		VP1.getRepotee("AVP12").addRepotee("Manager122");
		VP1.getRepotee("AVP12").addRepotee("Manager123");
		
		VP1.getRepotee("AVP13").addRepotee("Manager131");
		VP1.getRepotee("AVP13").addRepotee("Manager132");
		VP1.getRepotee("AVP13").addRepotee("Manager133");
		
		VP1.getRepotee("AVP14").addRepotee("Manager141");
		VP1.getRepotee("AVP14").addRepotee("Manager142");
		VP1.getRepotee("AVP14").addRepotee("Manager143");
		
		// Adding Managers under AVP2
		VP2.getRepotee("AVP21").addRepotee("Manager211");
		VP2.getRepotee("AVP21").addRepotee("Manager212");
		VP2.getRepotee("AVP21").addRepotee("Manager213");
		
		VP2.getRepotee("AVP22").addRepotee("Manager221");
		VP2.getRepotee("AVP22").addRepotee("Manager222");
		VP2.getRepotee("AVP22").addRepotee("Manager223");
		
		VP2.getRepotee("AVP23").addRepotee("Manager231");
		VP2.getRepotee("AVP23").addRepotee("Manager232");
		VP2.getRepotee("AVP23").addRepotee("Manager233");
		
		VP2.getRepotee("AVP24").addRepotee("Manager241");
		VP2.getRepotee("AVP24").addRepotee("Manager242");
		VP2.getRepotee("AVP24").addRepotee("Manager243");
		
				
		// Adding Managers under AVP3
		VP3.getRepotee("AVP31").addRepotee("Manager311");
		VP3.getRepotee("AVP31").addRepotee("Manager312");
		VP3.getRepotee("AVP31").addRepotee("Manager313");
		
		VP3.getRepotee("AVP32").addRepotee("Manager321");
		VP3.getRepotee("AVP32").addRepotee("Manager322");
		VP3.getRepotee("AVP32").addRepotee("Manager323");
		
		VP3.getRepotee("AVP33").addRepotee("Manager331");
		VP3.getRepotee("AVP33").addRepotee("Manager332");
		VP3.getRepotee("AVP33").addRepotee("Manager333");
		
		VP3.getRepotee("AVP34").addRepotee("Manager341");
		VP3.getRepotee("AVP34").addRepotee("Manager342");
		VP3.getRepotee("AVP34").addRepotee("Manager343");
		
		// Adding Managers under AVP4
		VP4.getRepotee("AVP41").addRepotee("Manager411");
		VP4.getRepotee("AVP41").addRepotee("Manager412");
		VP4.getRepotee("AVP41").addRepotee("Manager413");
		
		VP4.getRepotee("AVP42").addRepotee("Manager421");
		VP4.getRepotee("AVP42").addRepotee("Manager422");
		VP4.getRepotee("AVP42").addRepotee("Manager423");
		
		VP4.getRepotee("AVP43").addRepotee("Manager431");
		VP4.getRepotee("AVP43").addRepotee("Manager432");
		VP4.getRepotee("AVP43").addRepotee("Manager433");
		
		VP4.getRepotee("AVP44").addRepotee("Manager441");
		VP4.getRepotee("AVP44").addRepotee("Manager442");
		VP4.getRepotee("AVP44").addRepotee("Manager443");
		
		
		return root;
		
	}
	
}
