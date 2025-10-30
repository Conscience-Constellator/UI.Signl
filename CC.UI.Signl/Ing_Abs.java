package CC.UI.Sig;

import org.jetbrains.annotations.NotNull;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif;

import CC.Bool.Trn.Onbl;
import CC.Bool.Trn.On_Trnbl_List;
//import static CC.Util.List.ArA_Util.Clas_1st;
import static java.lang.System.out;
import java.awt.Component;
import java.awt.event.*;
import static CC.UI.Sig.Input_COd.*;

public interface Ing_Abs extends On_Trnbl_List,Ke_And_Mous_Lisnr
{
//	Clas_Rap Class=Stat_Notif.Init_StRt_Nd(Ing_Abs.class,
//		Clas_Rap.class
//	);/*Dep ?done*/

	/*Sig_List*/
		static void Ad_Sig_Lisnr(Component Com,String In,Onbl Lisnr)
		{Inp_List(Com).Ad_Sig_Lisnr(In,Lisnr);}
		default void Ad_Mous_Lisnr(Onbl Lisnr)
		{
			Ad_Sig_Lisnr(Mous_+1,Lisnr);
			Ad_Sig_Lisnr(Mous_Drag,Lisnr);
		}
			static void Ad_Mous_Lisnr(Component Com,String In,Onbl Lisnr)
			{Inp_List(Com).Ad_Mous_Lisnr(Lisnr);}
		default void Ad_Drag_Lisnr(int Butn,Onbl Lisnr)
		{
			String NAm=Prefx_Mous_Butn(Butn);
			Ad_Sig_Lisnr(NAm,Lisnr);
			Ad_Sig_Lisnr(Mous_Drag,Lisnr);
			Ad_Sig_Lisnr(NAm,Lisnr);
		}
			static void Ad_Drag_Lisnr(Component Com,int Butn,Onbl Lisnr)
			{Inp_List(Com).Ad_Drag_Lisnr(Butn,Lisnr);}
		static void Rem_Sig_Lisnr(Component Com,String NAm,Onbl Lisnr)
		{Inp_List(Com).Rmov_Sig_Lisnr(NAm,Lisnr);}
//			static void Rem_Mous_Lisnr(Component Com,String NAm,On_Havr_Abst Lisnr){Inp_List(Com).Rem_Mous_Lisnr(Lisnr);}
			default void Rem_Drag_Lisnr(int Butn,Onbl Lisnr)
			{
				Rmov_Sig_Lisnr(Mous_+Butn,Lisnr);
				Rmov_Sig_Lisnr(Mous_Drag,Lisnr);
			}
				static void Rem_Drag_Lisnr(Component Com,int But,Onbl Lisnr)
				{Inp_List(Com).Rem_Drag_Lisnr(But,Lisnr);}
//			default void Rem_Mous_Lisnr(On_Havr_Abs Lisnr)
//			{
//				Rem_Drag_Lisnr(Lisnr);
//				Ad_Sig_Lisnr(Mous_Mov,Lisnr);
//			}
//			static void Rem_Mous_Lisnr(Component Com,On_Havr_Abs Lisnr){Inp_List(Com).Rem_Mous_Lisnr(Lisnr);}
		static Onbl Sig_Lisnr(Component Com,String NAm)
		{return Inp_List(Com).Get_Sig_Lisnr(NAm);}
		static boolean Cont_Sig_Lisnr(Component Com,String NAm)
		{return Inp_List(Com).Get_On_Trnbl_List().containsKey(NAm);}

	static void On()
	{}

	default void In_On(Object In){Trn_On(KE,In);}
	default void In_Of(Object In){Trn_On(KE,In);}
		default void KE_On(KeyEvent In)
		{
			In_On(In);
			Trn_On(KE,In);
		}
		default void KE_Of(KeyEvent In)
		{
			In_Of(In);
			Trn_Of(KE,In);
		}
			@Override
			default void keyPressed(@NotNull KeyEvent PrS)
			{
				String ID=Prefx_KE(PrS);
				KE_On(PrS);
				Trn_On(ID,PrS);

				out.println(ID);
			}
			@Override
			default void keyReleased(@NotNull KeyEvent RlEs)
			{
				String ID=KE+RlEs.getKeyCode();
				KE_Of(RlEs);
				Trn_Of(ID,RlEs);

				out.println(ID);
			}
			@Override
			default void keyTyped(@NotNull KeyEvent Typ)
			{
				String ID=Prefx_KE_Typ(Typ);
				KE_On(Typ);
				Trn_On(ID,Typ);
				KE_Of(Typ);
				Trn_Of(ID,Typ);

				out.println(ID);
			}
		default void Mous_On(Object In)
		{
			In_On(In);
			Trn_On(Mous,In);
		}
		default void Mous_Of(Object In)
		{
			In_Of(In);
			Trn_Of(Mous,In);
		}
			@Override
			default void mouseEntered(MouseEvent Ntry)
			{
				Mous_On(Ntry);
				Trn_On(Mous_In,Ntry);
				//out.println(Ntry);
			}
			@Override
			default void mouseExited(MouseEvent Xit)
			{
				Mous_Of(Xit);
				Trn_Of(Mous_In,Xit);
				//out.println(Xit);
			}
			default void Mous_Pres(MouseEvent PrS)
			{
				Mous_On(PrS);
				Trn_On(Mous_Butn,PrS);
			}
				@Override
				default void mousePressed(MouseEvent PrS)
				{
					String ID=Mous_+PrS.getButton();
					Mous_Pres(PrS);
					Trn_On(ID,PrS);

					//out.println(ID);
				}
			default void Mous_RlEs(MouseEvent RlEs)
			{
				Mous_Of(RlEs);
				Trn_Of(Mous_Butn,RlEs);
			}
				@Override
				default void mouseReleased(@NotNull MouseEvent RlEs)
				{
					String ID=Mous_+RlEs.getButton();
					Mous_RlEs(RlEs);
					Trn_Of(ID,RlEs);

					//out.println(ID);
				}
			default void Mous_Clik(MouseEvent Clik)
			{
				Mous_On(Clik);
				Mous_Of(Clik);
			}
				@Override
				default void mouseClicked(@NotNull MouseEvent Clik)
				{
					String ID=Mous_Clik+Clik.getButton();
					Mous_Clik(Clik);
					Trn_On(ID,Clik);
					Trn_Of(ID,Clik);

					//out.println(ID);
				}
			@Override
			default void mouseWheelMoved(@NotNull MouseWheelEvent Scrol)
			{
				String ID=Mous_Scrol;
				Mous_On(Scrol);
				Trn_On(ID,Scrol);
				Mous_Of(Scrol);
				Trn_Of(ID,Scrol);

				out.println(ID);
			}
			@Override
			default void mouseMoved(@NotNull MouseEvent Mov)
			{
				String ID=Mous_Mov;
				Mous_On(Mov);
				Trn_On(ID,Mov);
				Mous_Of(Mov);
				Trn_Of(ID,Mov);

				//out.println(ID);
			}
			default void Mous_Drag(MouseEvent Drag)
			{
				Mous_On(Drag);
				Trn_On(Mous_Drag,Drag);
				Mous_Of(Drag);
				Trn_Of(Mous_Drag,Drag);
			}
				@Override
				default void mouseDragged(@NotNull MouseEvent Drag)
				{
					String ID=Mous_Drag_+Drag.getButton();
					Mous_Drag(Drag);
					Trn_On(ID,Drag);
					Trn_Of(ID,Drag);

					//out.println(ID);
				}
	static Object Pass(@NotNull MouseEvent Evnt,@NotNull Ing_Abs In)
	{
		/*int A=Evnt.getY();
		int B=Evnt.getX();
		for(int Branch_Indx=0;Branch_Indx<Branch_List.size();Branch_In+=1)
		{
			GUI_Nod Branch=(GUI_Nod)Branch_List.get(Branch_Ind);
			if(Branch.Bord_Chek(A,B)){return Branch.Pass(A,B,Evnt);}
		}*/

		return null;
	}

	static Ing_Abs Inp_List(Component Com)
	{
		return //(Ing_Abs)Clas_1st(Com.getKeyListeners());
			null;
	}

	default <Com extends Component> Com Add(Com Com)
	{
		Com.addKeyListener(this);
		Com.addMouseListener(this);
		Com.addMouseWheelListener(this);
		Com.addMouseMotionListener(this);

		return Com;
	}
	class Ing
		extends On_Trnbl_List_ConcrEt
		implements Ing_Abs
	{
	//	Clas_Rap Class=Ad_Reg_Task(Ing.class);

		public Ing(Component Com)
		{Add(Com);}
		public <Lisnr extends Onbl>Ing(Component Com,Lisnr[] Lisnrg,String[] KEg)
		{
			this(Com);
			for(int IndX=0;
				IndX<Lisnrg.length;
				IndX+=1)
			{
				Ad_Sig_Lisnr(
					KEg[IndX],
					Lisnrg[IndX]);
			}
		}
		public Ing()
		{}

	//	static{Init_Nd(Ing.class);}
	}
}