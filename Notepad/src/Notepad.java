import java.awt.Frame;
import java.awt.event.*;
import java.awt.Color;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;	
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import javax.swing.*;

public class Notepad implements ActionListener
{
	String load;
	JFrame body;
	JTextArea txt_area;
	JMenuBar mb;
	JMenu file,format,edit,help;
	JMenuItem it_new,open, save, save_a,exit,info,font;
	Button cfu;
	JButton apply, close;
	Label version, developer;
	String str;
	JLabel background_about;
	FileDialog oo;
	FileWriter fr;
	Dialog ab_pnl;
	JFileChooser save_f;

	public void readFile() throws Exception {
		//here we'll read files
		BufferedReader br=new BufferedReader(new FileReader(load));
		//StringBuilder sb=new StringBuilder();

		String line=null;
		
		while((line=br.readLine())!=null)
		{ 
			txt_area.setFont(new Font("Cursive",Font.PLAIN,22));
			txt_area.setText(txt_area.getText()+line+"\n");	
		}
		
	}

	public Notepad()
	{

		/*Initialising the main frame pannel of program 
		diamension is for taking the windows size to the frame*/
		Dimension body_sz=Toolkit.getDefaultToolkit().getScreenSize();
		body = new JFrame();
		body.setTitle("Notepad");
		body.setSize(body_sz.width,body_sz.height);
		body.setBackground(Color.white);

		
		/*Creating menubar's Instance*/
		mb=new JMenuBar();

		/*Creating menu items here*/
		file= new JMenu("File");
		mb.add(file);
		file.setMnemonic('F');
				
				/*Menu items are new open save, save as, exit etc are here 
				put on to the menu File */
				it_new=new JMenuItem("    New    ");
				file.add(it_new);
				it_new.addActionListener(this);

				open=new JMenuItem("     Open     ");
				file.add(open);
				open.addActionListener(this);

				file.addSeparator();

				save=new JMenuItem("    Save     ");
				file.add(save);
				save.addActionListener(this);

				save_a=new JMenuItem("    Save as     ");
				file.add(save_a);

				file.addSeparator();

				exit=new JMenuItem("    Exit     ");
				file.add(exit);
				exit.addActionListener(this);


				edit=new JMenu("    Edit      ");
				mb.add(edit);

				format=new JMenu("    Format     ");
				mb.add(format);

				font=new JMenuItem("    Font     ");
				format.add(font);
				font.addActionListener(this);


				help=new JMenu("    Help     ");	
				mb.add(help);

				info=new JMenuItem("     About    ");
				help.add(info);
				info.addActionListener(this);



		

		//Text area of the Notepad
		txt_area= new JTextArea();
		JScrollPane jp=new JScrollPane(txt_area);
		jp.setHorizontalScrollBar(jp.createHorizontalScrollBar());
		body.add(jp);
		//txt_area.getScrollableTracksViewportWidth();
		
		
		body.setJMenuBar(mb);

		body.setVisible(true);
		body.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{
		
		/*Getting the generated event sources to perform specific actions*/
		if(e.getSource()==it_new)
		{
			/*For new button it will clear the the notepad blank*/
			txt_area.setText(" ");
		}	

		if(e.getSource()==open)
		{
			try{

				/*For open button it will open the File dialog in load mode*/
				oo=new FileDialog(body,"Open",FileDialog.LOAD);
				oo.setVisible(true);
				/*Getting the selected path and storing the name to a string*/
				load=oo.getDirectory()+oo.getFile();
				/*Once the file has been loaded then calling the method readfile to read the file*/
				readFile();
				
				}
			catch(Exception efdo){}		
		}

		if(e.getSource()==font){

			/*Once we've got the font event generated then we'll call font method to 
			complete process related to font*/
			FontData f=new FontData(body);

			f.show(true);

			int user_choice=f.getUserAction();

			if(user_choice==1)
			{
				
				txt_area.setFont(new Font(f.fontName(),Font.PLAIN,22));
				f.close();
			}
			else
			{
				JOptionPane.showMessageDialog(body,"Font not applied","Error",JOptionPane.WARNING_MESSAGE);
			}
		}


		if(e.getSource()==exit)
		{
			/*For exit button it will dispose the frame*/
			body.dispose();
		}

		if(e.getSource()==save)
		{
			/*Here there are two onditions on of them is writing on existing file
			and other one is writing to a fresh file*/
			try
			{
				/*If you're trying to save a opened file then it won't it will open in append mode */
				if(txt_area.getText().length()!=0){

					/*Getting available data on TextArea so that we can save in file*/

					String data=txt_area.getText()+System.getProperty("line.separator");

					/*When Length of text on text area*/

					if(data.length()!=0)
					{

						/*Opening save mode FileDialog*/
						save_f=new JFileChooser();
						save_f.setDialogTitle("Save File");

						//Noted user selection on File
						int user_selection=save_f.showSaveDialog(body);

						/*When user selects approve save button*/
						if(user_selection==JFileChooser.APPROVE_OPTION)
						{
							/*To get filename from the directory using getSelectedFile 
							it will return the current file either it is new or available
							then we write the file using fileoutput stream */
							File filename=save_f.getSelectedFile();

							/*Here I've used FileOutputStream but you're free to use any of the stream
							either by buffered writer, File writer*/
							FileOutputStream fos=new FileOutputStream(filename);
							fos.write(data.getBytes(), 0, data.length());

						}

					}
				}
				
				else
				{
					JOptionPane.showMessageDialog(body, "Can't create an empty File.","Error",JOptionPane.WARNING_MESSAGE);
				}
			}
			catch(Exception efds){}
		}

		if(e.getActionCommand()=="About")
		{
			AboutPannel();
		}
	}

	//Creating a frame for help sections
	//For about pannel

	private void AboutPannel()
	{
		/*Creating dialog for about panne*/
		ab_pnl=new Dialog(body,"About",true);
		ab_pnl.setLayout(null);
		ab_pnl.setSize(500,400);

		/*Giving a label on to the about dialog*/
		version=new Label();
		version.setBackground(Color.PINK);
		version.setText("This is the Enterprise Release of this Notepad");
		version.setAlignment(Label.CENTER);
		ab_pnl.add(version);

		/*Setting a background Image to the dialog through a label*/
		background_about=new JLabel();
		background_about.setSize(500,400);
		background_about.setIcon(new ImageIcon("C:\\java\\Projects\\PngFiles\\ApplicationBackgrounds\\PanoramaBackground.png"));
		ab_pnl.add(background_about);

		cfu= new Button("Updates");
		ab_pnl.add(cfu);
		cfu.setBounds(300,200,50,30);

		/*Closing event for about pannel dialog*/		
		ab_pnl.addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent we)
					{
						ab_pnl.dispose();
					}
				}
			);
		ab_pnl.setVisible(true);

	}

	//Invoking main method here
	public static void main(String...args)
	{
		new Notepad();
	}
}