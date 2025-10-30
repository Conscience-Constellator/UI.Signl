package CC.UI.Sig;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import java.awt.event.ActionEvent;
import CC.UI.GUI.Basd_On_Java.Act_Abs;
import CC.Bool.Trn.Onbl;

public
	class Act_On
	implements Act_Abs
{
	/*
	public static final Clas_Rap Class=Init_StRt(Act_On.class,
		Clas_Rap.class);
	/*Dep ?done*/

	public Onbl On;
		public Onbl On(){return On;}
		public void Set_On(Onbl On){this.On=On;}
	@Override
	public void actionPerformed(ActionEvent EvNt)
	{On.Trn_On(null);}

	public Act_On(Onbl On)
	{Set_On(On);}
	public Act_On()
	{}

//	static{Init_Nd(Act_On.class);}
}