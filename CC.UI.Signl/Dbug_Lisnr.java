package CC.UI.Sig;

import CC.Bool.Trn.Onbl;
import CC.Bool.Trn.Flagd_On_Trnbl.Flagd_On_Trnbl_Imp;
import CC.UI.Sig.Input_Havr.Input_Havr_ConcrEt;
import static java.lang.System.out;

public class Dbug_Lisnr extends Input_Havr_ConcrEt
{
	public static final Flagd_On_Trnbl_Imp Dbug_Printr=new Flagd_On_Trnbl_Imp()
	{
		@Override
		public Object On_MEt(Object EvNt)
		{
			out.println(EvNt);

			return null;
		}
		@Override
		public Object Of_MEt(Object EvNt)
		{
			out.println(EvNt);

			return null;
		}
	};
	@Override
	public Onbl Get_Dfalt_Acount()
	{return Dbug_Printr;}
}