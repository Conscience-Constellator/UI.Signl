package CC.UI.Sig;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Bool.Trn.On_Trnbl_List;
import static CC.UI.Sig.Input_COd.*;
import java.awt.*;
import java.awt.event.*;

public interface Input_Havr
	extends On_Trnbl_List,Ke_And_Mous_Lisnr
{
	//<editor-fold desc="">
	//<editor-fold desc="KE">
	class KE_Input_AccSr
		extends EvNt_Input_Famly_AccSr<KeyEvent>
	{
		@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
		public int Get_COd(KeyEvent EvNt)
		{return EvNt.getKeyCode();}

		public KE_Input_AccSr(String Prefx)
		{super(Prefx);}
	}
	KE_Input_AccSr
		KE_AccSr=new KE_Input_AccSr(KE),
		KE_Typ_AccSr=new KE_Input_AccSr(KE_Typ);

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void keyPressed(KeyEvent EvNt)
	{KE_AccSr.Get(this,EvNt).Trn_On(EvNt);}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void keyReleased(KeyEvent EvNt)
	{KE_AccSr.Get(this,EvNt).Trn_Of(EvNt);}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void keyTyped(KeyEvent EvNt)
	{KE_Typ_AccSr.Get(this,EvNt).Trn_Onf(EvNt);}
	//</editor-fold>
	//<editor-fold desc="Mous">
	class Mous_Input_AccSr
		extends EvNt_Input_Famly_AccSr<MouseEvent>
	{
		@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
		public int Get_COd(MouseEvent EvNt)
		{return EvNt.getButton();}

		public Mous_Input_AccSr(String Prefx)
		{super(Prefx);}
	}
	Mous_Input_AccSr
		Mous_Butn_AccSr=new Mous_Input_AccSr(Mous_Butn),
		Mous_Butn_Clik_AccSr=new Mous_Input_AccSr(Mous_Clik);

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void mouseEntered(MouseEvent EvNt)
	{Get_Input(Mous_In).Trn_On(EvNt);}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void mouseExited(MouseEvent EvNt)
	{Get_Input(Mous_In).Trn_Of(EvNt);}

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void mousePressed(MouseEvent EvNt)
	{Mous_Butn_AccSr.Get(this,EvNt).Trn_On(EvNt);}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void mouseReleased(MouseEvent EvNt)
	{Mous_Butn_AccSr.Get(this,EvNt).Trn_Of(EvNt);}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void mouseClicked(MouseEvent EvNt)
	{Mous_Butn_Clik_AccSr.Get(this,EvNt).Trn_Onf(EvNt);}

	@Override @Finishd(Is_Finishd=false)
	default void mouseWheelMoved(MouseWheelEvent EvNt)
	{Get_Input(Mous_WEl).Trn_Onf(EvNt);}

	@Override @Finishd(Is_Finishd=true)
	default void mouseMoved(MouseEvent EvNt)
	{Get_Input(Mous_Mov).Trn_Onf(EvNt);}
	@Override @Finishd(Is_Finishd=true)
	default void mouseDragged(MouseEvent EvNt)
	{Get_Input(Mous_Drag).Trn_Onf(EvNt);}
	//</editor-fold>
	//</editor-fold>

	@Lin_DclAr @Finishd(Is_Finishd=true)
	default void Ad_Input_Lisnr(Component Com)
	{
		Com.addKeyListener(this);

		Com.addMouseListener(this);
		Com.addMouseWheelListener(this);
		Com.addMouseMotionListener(this);
	}
	/**Named "Open" cuz, I was trying to think of A name,
	 * & it sorta "open"s it to input, or wutev.*/
	@Lin_DclAr @Finishd(Is_Finishd=false)
	default void Open(Component Com)
	{
		Ad_Input_Lisnr(Com);
		Com.setFocusable(true);
	}

	class Input_Havr_ConcrEt
		extends On_Trnbl_List_ConcrEt
		implements Input_Havr
	{}
}