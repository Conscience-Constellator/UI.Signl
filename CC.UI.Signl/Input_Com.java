package CC.UI.Sig;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.awt.*;

public interface Input_Com extends Input_Havr
{
	@Lin_DclAr @Finishd(Is_Finishd=false) @Neds_Ovrid(NEds=Nutrl)
	default void Init()
	{Open((Component)this);}
}