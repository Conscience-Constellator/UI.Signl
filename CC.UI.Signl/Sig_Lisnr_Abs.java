package CC.UI.Sig;

import CC.COd.Finishd;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Bool.Trn.Onbl;
import CC.Bool.Trn.Flagd_On_Trnbl.Flagd_On_Trnbl_Imp;
import java.util.List;
import java.util.ArrayList;

public interface Sig_Lisnr_Abs extends Onbl,Sig_Prt
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Sig_Lisnr_Abs.class,
		Clas_Rap.class);
	/*Dep ?done*/

	Object On(Object Input);
		//<editor-fold desc="Java method String, for something">
		String On=
			"@Override public Object On(Signal_Lisnr Signal_Lisnr,Object Input);"+
			"\n{"+
				"\n\tif(!Toggle)"+
				"\n\t{"+
					"\n\t\tOn=true;"+
					"\n\t\tfor(Object Lisnr:Lisnr_List){((On_Off)Lisnr).On(Input);}"+
			'\n'+
					"\n\t\t//out.println('<'+\"Turned on:\"+Name+'>');"+
				"\n\t}"+
				"\n\telse"+
				"\n\t{"+
					"\n\t\tOn=!On;"+
					"\n\t\tfor(Object Inp_Lisnr:Lisnr_List){((On_Off)Inp_Lisnr).On(Input);}"+
			'\n'+
					"\n\t\tif(On=true){out.println('<'+\"Toggled on:\"+Name+'>');}"+
					"\n\t\telse{out.println('<'+\"Toggled off:\"+Name+'>');}"+
				"\n\t}"+
			'\n'+
				"\n\treturn null;"+
			"}";
	//</editor-fold>
	Object Of(Object Input);
		//<editor-fold desc="Java method String, for something">
		String Off=
			"@Override"+
			"public Object Off(Object Input)"+
			"\n{"+
				"\n\tif(!Toggle)"+
				"\n\t{"+
					"\n\t\tOn=false;"+
					"\n\t\tfor(Object Inp_Lisnr:Lisnr_List){((On_Off)Inp_Lisnr).Off(Input);}"+
			"\n"+
					"\n\t\t//out.println('<'+\"Turned off:\"+Name+'>');"+
				"\n\t}"+
				"\n\treturn null;"+
			"}";
		//</editor-fold>

	List<Onbl> Lisnr_List=new ArrayList<>();

	/*out.println("Source:"+arg0.getSource());*/

	abstract class Sig_Lisnr
		extends Flagd_On_Trnbl_Imp implements Sig_Lisnr_Abs
	{
//		public static final Clas_Rap Class=Init_StRt(Sig_Lisnr.class,Sig_Lisnr_Abs.class);/*Dep done*/

		@Finishd(Is_Finishd=false)
		public boolean Togl;

		@Finishd(Is_Finishd=true)
		public Sig_Lisnr(boolean Togl)
		{this.Togl=Togl;}
			@Finishd(Is_Finishd=true)
			public Sig_Lisnr()
			{this(false);}

//		static{Init_Nd(Sig_Lisnr.class);}
	}
}