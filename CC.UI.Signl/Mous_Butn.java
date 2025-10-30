package CC.UI.Sig;

import CC.Util.NAm.NAm_Havr.NAm_Havr_ConcrEt;
import java.util.Map;
import java.util.HashMap;
import static java.awt.event.MouseEvent.*;

public class Mous_Butn extends NAm_Havr_ConcrEt
{
	public int COd;

	public Mous_Butn(int COd,String NAm)
	{
		super(NAm);
		this.COd=COd;
	}

	public static Map<String,Mous_Butn> Registry=new HashMap<>();
	public static void Registr(int COd,String NAm)
	{Registry.put(NAm,new Mous_Butn(COd,NAm));}
	static
	{
		Registr(BUTTON1,"Left click");
		Registr(BUTTON2,"Right click");
		Registr(BUTTON3,"Scroll click");
	}
}