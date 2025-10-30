package CC.UI.Sig;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Bool.Trn.Input_Famly_AccSr;
import CC.Bool.Trn.Onbl;
import java.awt.event.InputEvent;

public abstract class EvNt_Input_Famly_AccSr<COd_SOrc extends InputEvent>
extends Input_Famly_AccSr
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	public abstract int Get_COd(COd_SOrc SOrc);

	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public Onbl Get(Input_Havr List,int ID)
	{return Get(List,Integer.toString(ID));}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public Onbl Get(Input_Havr List,COd_SOrc ID)
	{return Get(List,Get_COd(ID));}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public void Set(Input_Havr List,int ID,Object Input_SOrc)
	{Set(List,Integer.toString(ID),Input_SOrc);}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public void Set(Input_Havr List,COd_SOrc ID,Object Input_SOrc)
	{Set(List,Get_COd(ID),Input_SOrc);}

	public EvNt_Input_Famly_AccSr(String Prefx)
	{super(Prefx);}
}
