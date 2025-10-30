package CC.UI.Sig;

import CC.Util.NAm.NAm_Havr.NAm_Havr_ConcrEt;
import java.util.Map;
import java.util.HashMap;
import static java.awt.event.KeyEvent.*;

public class KE extends NAm_Havr_ConcrEt
{
	public int COd;

	public KE(int COd,String NAm)
	{
		super(NAm);
		this.COd=COd;
	}

	public static Map<String,KE> Registry=new HashMap<>();
	public static void Registr(int COd,String NAm)
	{Registry.put(NAm,new KE(COd,NAm));}
		public static void Registr(Object... KVg)
		{
			for(int IndX=0;
				IndX<KVg.length;
				IndX+=2)
			{
				Registr(
					KVg[IndX],
					KVg[IndX+1]);
			}
		}
	static
	{
//		static Map<Object,String> i(Map<Object,String> List)
			/*Math*/
				Registr(VK_NUMBER_SIGN,"#",
					VK_0,"0",VK_NUMPAD0,"Numpad 0",VK_1,"1",VK_NUMPAD1,"Numpad 1",VK_2,"2",VK_NUMPAD2,"Numpad 2",
					VK_3,"3",VK_NUMPAD3,"Numpad 3",VK_4,"4",VK_NUMPAD4,"Numpad 4",VK_5,"5",VK_NUMPAD5,"Numpad 5",
					VK_6,"6",VK_NUMPAD6,"Numpad 6",VK_7,"7",VK_NUMPAD7,"Numpad 7",VK_8,"8",VK_NUMPAD8,"Numpad 8",
					VK_9,"9",VK_NUMPAD9,"Numpad 9",
					VK_PLUS,"Plus",VK_NUMBER_SIGN,"Numpad plus",
					VK_MINUS,"Minus",VK_SUBTRACT,"Numpad minus",
					VK_ADD,"Add",VK_MULTIPLY,"Multiply",
					VK_DIVIDE,"Divide",
					VK_GREATER,"Greater than",VK_LESS,"Less than",
					VK_EQUALS,"Equal",
				VK_SEPARATOR,"Separator",VK_SEPARATER,"Separater",
				VK_DECIMAL,"Decimal",
				VK_DELETE,"Delete",
				VK_NUM_LOCK,"Num lock",
			/*Latin*/
				VK_A,"A",VK_B,"B",VK_C,"C",VK_D,"D",VK_E,"E",
				VK_F,"F",VK_G,"G",VK_H,"H",VK_I,"I",VK_J,"J",
				VK_K,"K",VK_L,"L",VK_M,"M",VK_N,"N",VK_O,"O",
				VK_P,"P",VK_Q,"Q",VK_R,"R",VK_S,"S",VK_T,"T",
				VK_U,"U",VK_V,"V",VK_W,"W",VK_X,"X",VK_Y,"Y",
				VK_Z,"Z",
				VK_CAPS_LOCK,"Caps lock",
				/*Accent*/
					VK_DEAD_OGONEK,"Dead oganek",
					VK_DEAD_CEDILLA,"Dead cedilla",
					VK_DEAD_CARON,"Dead caron",
					VK_DEAD_DOUBLEACUTE,"Dead double acute",
					VK_DEAD_ABOVERING,"Dead above ring",
					VK_DEAD_DIAERESIS,"Dead diaeresis",
					VK_DEAD_ABOVEDOT,"Dead above dot",
					VK_DEAD_BREVE,"Dead breve",
					VK_DEAD_MACRON,"Dead macron",
					VK_DEAD_TILDE,"Dead tilde",
					VK_DEAD_CIRCUMFLEX,"Dead circumflex",
					VK_DEAD_ACUTE,"Dead acute",
					VK_DEAD_GRAVE,"Dead grave",
					VK_DEAD_SEMIVOICED_SOUND,"Dead semivoiced sound",
					VK_DEAD_VOICED_SOUND,"Dead voiced sound",
					VK_DEAD_IOTA,"Dead iota",
					VK_BACK_QUOTE,"Back quote",
				/*Punctuation*/
					VK_PERIOD,".",
					VK_INVERTED_EXCLAMATION_MARK,"¡",VK_EXCLAMATION_MARK,"!",
					VK_COLON,":",
					VK_SEMICOLON,";",
					VK_SLASH,"/",
					VK_BACK_SLASH,"\\",
					VK_LEFT_PARENTHESIS,"(",VK_RIGHT_PARENTHESIS,")",
					VK_OPEN_BRACKET,"[",VK_CLOSE_BRACKET,"]",
					VK_AMPERSAND,"&",
					VK_BRACELEFT,"Left brace",VK_BRACERIGHT,"Right brace",
					VK_ASTERISK,"Asterisk",
					VK_QUOTEDBL,"Quote DBL",
					VK_AT,"At",
					VK_CIRCUMFLEX,"Circumflex",
			/*Direction*/
				VK_UP,"Up",VK_KP_UP,"Keypad up",
				VK_DOWN,"Down",VK_KP_DOWN,"Keypad down",
				VK_RIGHT,"Right",VK_KP_RIGHT,"Keypad right",
				VK_LEFT,"Left",VK_KP_LEFT,"Keypad left",

				VK_SPACE,"Space",

				VK_F1,"F1",VK_F2,"F2",VK_F3,"F3",VK_F4,"F4",VK_F5,"F5",
				VK_F6,"F6",VK_F7,"F7",VK_F8,"F8",VK_F9,"F9",VK_F10,"F10",
				VK_F11,"F11",VK_F12,"F12",VK_F13,"F13",VK_F14,"F14",VK_F15,"F15",
				VK_F16,"F16",VK_F17,"F17",VK_F18,"F18",VK_F19,"F19",VK_F20,"F20",
				VK_F21,"F21",VK_F22,"F22",VK_F23,"F23",VK_F24,"F24",

				VK_ESCAPE,"Escape",
				VK_CANCEL,"Cancel",
				VK_CONTROL,"Control",VK_SHIFT,"Shift",VK_ALT,"Alt",
				VK_CLEAR,"Clear",
				VK_PAUSE,"Pause",
				VK_PAGE_UP,"Page up",VK_PAGE_DOWN,"Page down",
				VK_SCROLL_LOCK,"Scroll lock",
			/**Asian*/
				VK_FINAL,"Final",
				VK_CONVERT,"Convert",
				VK_NONCONVERT,"Non convert",
			/**Editing*/
				VK_CUT,"Cut",
				VK_PASTE,"Paste",
				VK_UNDO,"Undo",
				VK_COPY,"Copy",
				VK_END,"End",VK_HOME,"Home",
				VK_PRINTSCREEN,"Print screen",
				VK_INSERT,"Insert",
				VK_HELP,"Help",
				VK_META,"Meta",
				VK_QUOTE,"Quote",
				VK_DOLLAR,"Dollar",
				VK_EURO_SIGN,"Euro",
				VK_UNDERSCORE,"Underscore",
				VK_WINDOWS,"Windows",
				VK_CONTEXT_MENU,"Context menu",
				VK_MODECHANGE,"Mode change",
				VK_KANA,"Kana",VK_KANA_LOCK,"Kana lock",
				VK_KANJI,"Kanji",
				VK_ALPHANUMERIC,"Alphanumeric",
				VK_KATAKANA,"Katakana",VK_JAPANESE_KATAKANA,"Japanese katakana",
				VK_HIRAGANA,"Hiragana",VK_JAPANESE_HIRAGANA,"Japanese hiragana",
				VK_ROMAN_CHARACTERS,"Romanji",VK_JAPANESE_ROMAN,"Japanese romanji",
				VK_FULL_WIDTH,"Full width",VK_HALF_WIDTH,"Half width",
				VK_ALL_CANDIDATES,"All candidates",
				VK_PREVIOUS_CANDIDATE,"Previous candidates",
				VK_KP_UP,"Test",
				VK_INPUT_METHOD_ON_OFF,"Input method on off",
				VK_CODE_INPUT,"Code input",
				VK_AGAIN,"Again",
				VK_FIND,"Find",
				VK_PROPS,"Props",
				VK_STOP,"Stop",
				VK_COMPOSE,"Compose",
				VK_ALT_GRAPH,"Alt graph",
				VK_BEGIN,"Begin",
				VK_UNDEFINED,"Undefined",
				CHAR_UNDEFINED,"Character undefined",
			/**Key location*/
				KEY_LOCATION_UNKNOWN,"Key location unknown",
				KEY_LOCATION_STANDARD,"Key location standard",
				KEY_LOCATION_LEFT,"Key location left",KEY_LOCATION_RIGHT,"Key location right",
				KEY_LOCATION_NUMPAD,"Key location numpad"
		);
	}
}