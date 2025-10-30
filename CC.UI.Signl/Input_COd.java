package CC.UI.Sig;

import CC.COd.Finishd;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public abstract class Input_COd
{
	public static final String
		Dlimitr="_",
		KE="KE",KE_=KE+Dlimitr,
			KE_Typ=KE_+"Typ",
		Mous="Mous",Mous_=Mous+Dlimitr,
			Mous_Scrol=Mous_+"Scrol",
			Mous_In=Mous_+"In",
				Mous_Butn=Mous_+"Butn",
				Mous_Clik=Mous_+"Clik",
			Mous_WEl=Mous_+"WEl",
			Mous_Mov=Mous_+"Mov",
			Mous_Drag=Mous_+"Drag",Mous_Drag_=Mous_Drag+Dlimitr;
	//<editor-fold desc="KE">
	@Finishd(Is_Finishd=true)
	public static String Prefx_KE(String Input)
	{return KE+Input;}
		@Finishd(Is_Finishd=true)
		public static String Prefx_KE(int COd)
		{return Prefx_KE(Integer.toString(COd));}
			@Finishd(Is_Finishd=true)
			public static String Prefx_KE(KeyEvent EvNt)
			{return Prefx_KE(EvNt.getKeyCode());}
	@Finishd(Is_Finishd=true)
	public static String[] Prefx_KE(String... Input)
	{
		String[] List=new String[Input.length];
		for(int IndX=0;
			IndX<Input.length;
			IndX+=1)
		{List[IndX]=Prefx_KE(Input[IndX]);}

		return List;
	}
		@Finishd(Is_Finishd=true)
		public static String[] Prefx_KE(int... Input)
		{
			String[] List=new String[Input.length];
			for(int IndX=0;
				IndX<Input.length;
				IndX+=1)
			{List[IndX]=Prefx_KE(Input[IndX]);}

			return List;
		}

	@Finishd(Is_Finishd=true)
	public static String Prefx_KE_Typ(String Input)
	{return KE_Typ+Input;}
		@Finishd(Is_Finishd=true)
		public static String Prefx_KE_Typ(int COd)
		{return Prefx_KE(Integer.toString(COd));}
			@Finishd(Is_Finishd=true)
			public static String Prefx_KE_Typ(KeyEvent EvNt)
			{return Prefx_KE(EvNt.getKeyCode());}
	@Finishd(Is_Finishd=true)
	public static String[] Prefx_KE_Typ(String... Input)
	{
		String[] List=new String[Input.length];
		for(int IndX=0;
			IndX<Input.length;
			IndX+=1)
		{List[IndX]=Prefx_KE_Typ(Input[IndX]);}

		return List;
	}
		@Finishd(Is_Finishd=true)
		public static String[] Prefx_KE_Typ(int... Input)
		{
			String[] List=new String[Input.length];
			for(int IndX=0;
				IndX<Input.length;
				IndX+=1)
			{List[IndX]=Prefx_KE_Typ(Input[IndX]);}

			return List;
		}
	//</editor-fold>
	//<editor-fold desc="Mous">
	@Finishd(Is_Finishd=true)
	public static String Prefx_Mous_Butn(String Input)
	{return Mous_Butn+Input;}
		@Finishd(Is_Finishd=true)
		public static String Prefx_Mous_Butn(int COd)
		{return Prefx_Mous_Butn(Integer.toString(COd));}
			@Finishd(Is_Finishd=true)
			public static String Prefx_Mous_Butn(MouseEvent EvNt)
			{return Prefx_Mous_Butn(EvNt.getButton());}
	@Finishd(Is_Finishd=false)
	public static String[] Prefx_Mous_Butn(String... Input)
	{
		String[] List=new String[Input.length];
		for(int IndX=0;
			IndX<Input.length;
			IndX+=1)
		{List[IndX]=Prefx_Mous_Butn(Input[IndX]);}

		return List;
	}
		@Finishd(Is_Finishd=true)
		public static String[] Prefx_Mous_Butn(int... Input)
		{
			String[] List=new String[Input.length];
			for(int IndX=0;
				IndX<Input.length;
				IndX+=1)
			{List[IndX]=Prefx_Mous_Butn(Input[IndX]);}

			return List;
		}
	//</editor-fold>
}