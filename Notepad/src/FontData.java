import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;

class FontData {
	
	private static String allfont[];
	private static List font_list;
	private static JDialog font_pnl;
	private static List fn_type,font_sz;
	private static JButton btn_apply, btn_close;
	private static int user_action;
	private static FontData f;
	private static JTextField font_tf, sz_tf, type_tf;
	


/*APPROVE_BUTTON will return when selection of font!=null*/
	private static final int APPROVE_BUTTON=1;

	private static final int CANCEL_BUTTON=0;

	public FontData(Frame fr){

		Dimension dm=Toolkit.getDefaultToolkit().getScreenSize();

		/*Creating a dialog for font selection */
		font_pnl=new JDialog(fr,"Font",true);
		font_pnl.setLayout(null);

		font_pnl.setBounds((dm.width-600)/2,(dm.height-400)/2,600,450);

		/*List of fonts on to the font dialog*/ 
		font_list=new List();
		font_list.setBounds(50, 100, 240, 143);
		font_pnl.add(font_list);


		/*Getting all the font list from graphics class because the method getAvailableFontNames() is denfied 
		in GraphicsEnvironment class so we can call the method by getting the instance of GraphicsEnvironment class by 
		getLocalGraphicsEnvironment which is a static method*/
		GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		allfont=ge.getAvailableFontFamilyNames();

		/*getting all the available font and setting it to the list*/
		for(int i=0; i<allfont.length; i++){

		font_list.add(allfont[i]);
	}

		font_list.select(1);

		/*Attribute of font type getting added to the list.*/
		font_sz=new List();
		font_sz.setBounds(310,100,70,143);

		for(int i=1; i<=100; i++)
		{
			font_sz.add(String.valueOf(i));
		}

		font_pnl.add(font_sz);
		font_sz.select(1);

		fn_type=new List();
		fn_type.add("BOLD");
		fn_type.add("ITALIC");
		fn_type.add("PLAIN");
		fn_type.add("ROMAN_BASELINE");
		fn_type.select(1);

		font_pnl.add(fn_type);
		fn_type.setBounds(390,100,100,143);

		/*Creating JButton instance to apply fonts on field.*/
		btn_apply=new JButton("Apply");
		btn_apply.setBounds(50, 300, 80, 30);
		font_pnl.add(btn_apply);

		/*Creating Text field for each list so that user can easily search of apply the font size or font*/
		font_tf= new JTextField();
		font_tf.setBounds(50, 70, 240, 25);
		font_pnl.add(font_tf);
		font_list.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				font_tf.setText(font_list.getSelectedItem());

			}
		});

		sz_tf=new JTextField();
		sz_tf.setBounds(310,70,70,25);
		font_pnl.add(sz_tf);
		font_sz.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				sz_tf.setText(font_sz.getSelectedItem());

			}
		});

		type_tf=new JTextField();
		type_tf.setBounds(390,70,100,25);
		font_pnl.add(type_tf);
		fn_type.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				type_tf.setText(fn_type.getSelectedItem());

			}
		});

		//Creating close Button
		btn_close=new JButton("Close");
		btn_close.setBounds(140, 300, 80, 30);
		font_pnl.add(btn_close);
		btn_close.addMouseListener(new MouseAdapter()
			{
				public void mouseClicked(MouseEvent me)
				{
					user_action=CANCEL_BUTTON;
					font_pnl.dispose();
				}
			});


		btn_apply.addMouseListener(new MouseAdapter()
			 {
			 	public void mouseClicked(MouseEvent me)
			 	{
			 		user_action=APPROVE_BUTTON;
			 		font_pnl.dispose();
			 	}
			 });

		
		/*Closing event for font dialog*/
		font_pnl.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				font_pnl.dispose();
			}
		});


	}


	//To check use selection whether he has selected approve or cancel button

		public int getUserAction()
		{	 
			 	return user_action;
		}


	/*Function will return selected font Name.*/
	public String fontName(){

		String name=font_list.getSelectedItem();

		if(name.length()==0)
		{
			throw new NullPointerException("Font is not selected or found");
		}
		
		return name;
	}

	public int fontSize()
	{
		int size=Integer.valueOf(font_sz.getSelectedItem());

		return size;
	}

/*This method will set the font frame visible and will return int value 
*	@param int given user selection
*	@param boolean b is for frame visibility
*
*/

	public int show(boolean b)
	{
		int selection;

		font_pnl.setVisible(b);

		//Garbage code need to be removed
		if(fontName().length()==0)
		{
			selection=CANCEL_BUTTON;
		}
		else
		{
			selection=APPROVE_BUTTON;
		}

		return selection;
	}

	//To dispose current running jDialog
	public void close()
	{
		font_pnl.dispose();
	}


}