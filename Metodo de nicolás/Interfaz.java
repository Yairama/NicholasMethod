package ppack;
import javax.swing.*;
import javax.swing.border.StrokeBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormat;

public class Interfaz {

	public static void main(String[] args) {
		
		Ventanas MarcoPrincipal = new Ventanas();
		MarcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MarcoPrincipal.setVisible(true);
		
		
		
	}
	
}

class Ventanas extends JFrame{
	

	public Ventanas() {
		setLayout(new GridLayout(1,2));
		setTitle("Método de Nicolás");
		setSize(1350,720);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLocation(5,5);
		
		LaminaPrincipalForm=new LaminaPrincipal();
		GrafEstadis=new Graficsalfa();
		//Labels
		LabelBuild("Características del Yacimiento", 30, 30, 220, 30, "Arial",Font.BOLD,14);
		
		LabelBuild("Geometría y grado de distribución", 30,70, 200, 30, "Arial",Font.ITALIC,12);
		LabelBuild("Forma General del yacimiento",50,110,200,30,"Arial",Font.CENTER_BASELINE,11);
		LabelBuild("Potencia del Yacimiento", 50, 135, 200, 30, "Arial", Font.CENTER_BASELINE, 11);
		LabelBuild("Inclinación del Yacimiento", 50, 160, 200, 30, "Arial", Font.CENTER_BASELINE, 11);
		LabelBuild("Profundidad del Yacimiento", 50, 185, 200, 30, "Arial", Font.CENTER_BASELINE, 11);
		LabelBuild("Grado de distribución", 50, 210, 200, 30, "Arial", Font.CENTER_BASELINE, 11);
		
		LabelBuild("Característica geotécnicas del Yacimiento", 30, 250, 300, 30, "Arial", Font.ITALIC, 12);
		LabelBuild("Resistencia de la roca intacta",50,290,200,30,"Arial",Font.CENTER_BASELINE,11);
		LabelBuild("Número de estructuras",50,315,200,30,"Arial",Font.CENTER_BASELINE,11);
		LabelBuild("Condición de las estructuras",50,340,200,30,"Arial",Font.CENTER_BASELINE,11);
		LabelBuild("Resistencia de la roca intacta",50,390,200,30,"Arial",Font.CENTER_BASELINE,11);
		LabelBuild("Número de estructuras",50,415,200,30,"Arial",Font.CENTER_BASELINE,11);
		LabelBuild("Condición de las estructuras",50,440,200,30,"Arial",Font.CENTER_BASELINE,11);
		LabelBuild("Resistencia de la roca intacta",50,490,200,30,"Arial",Font.CENTER_BASELINE,11);
		LabelBuild("Número de estructuras",50,515,200,30,"Arial",Font.CENTER_BASELINE,11);
		LabelBuild("Condición de las estructuras",50,540,200,30,"Arial",Font.CENTER_BASELINE,11);
		LabelBuild("Mineral", 370, 282, 60, 15, "Arial", Font.CENTER_BASELINE, 10);
		LabelBuild("Pared colgante", 370, 382, 90, 15, "Arial", Font.CENTER_BASELINE, 10);
		LabelBuild("Pared yaciente", 370, 482, 90, 15, "Arial", Font.CENTER_BASELINE, 10);
		codeEventos = new Eventos();

		EventoKey = new KeyEscucha();
		WomboCombos();
		
		add(LaminaPrincipalForm);
		add(GrafEstadis);
	}
	
	public void LabelBuild(String Texto,int PosX,int PosY,int DimX,int DimY,String Letra, int Fuente, int Tamanio) {
		JLabel Label = new JLabel(Texto);
		Label.setBounds(PosX, PosY, DimX, DimY);
		//Label.setOpaque(true);
		Label.setFont(new Font(Letra, Fuente, Tamanio));
		LaminaPrincipalForm.add(Label);
	}
	
	
	class LaminaPrincipal extends JPanel{
		public LaminaPrincipal() {
			setLayout(null);
		}
		public void paintComponent(Graphics g) {
			Graphics2D g2 = (Graphics2D)g;
			super.paintComponent(g2);
			g2.setStroke(new BasicStroke(3));
			g2.draw(new Rectangle(25,250,450,400));
			g2.draw(new Rectangle(25,70,450,175));
			g2.setStroke(new BasicStroke(1));
			g2.draw(new Rectangle(45, 295,400,70));
			g2.draw(new Rectangle(45, 395,400,70));
			g2.draw(new Rectangle(45, 495,400,70));
			
			
		}
	}
	
	class Graficsalfa extends JPanel{
		public Graficsalfa(){
			setLayout(null);
			setBackground(Color.LIGHT_GRAY);
			LRajoAbierto = new JLabel("");
			LRajoAbierto.setBounds(80, 20, 35, 10);
			LRajoAbierto.setFont(new Font("Arial",Font.ITALIC,10));
			add(LRajoAbierto);
			
			LBlockCaving = new JLabel("");
			LBlockCaving.setBounds(115, 20, 35, 10);
			LBlockCaving.setFont(new Font("Arial",Font.ITALIC,10));
			add(LBlockCaving);
			
			LSublevelStoping = new JLabel("");
			LSublevelStoping.setBounds(150, 20, 35, 10);
			LSublevelStoping.setFont(new Font("Arial",Font.ITALIC,10));
			add(LSublevelStoping);

			LSublevelCaving = new JLabel("");
			LSublevelCaving.setBounds(185, 20, 35, 10);
			LSublevelCaving.setFont(new Font("Arial",Font.ITALIC,10));
			add(LSublevelCaving);
			
			LLongWallmining = new JLabel("");
			LLongWallmining.setBounds(220, 20, 35, 10);
			LLongWallmining.setFont(new Font("Arial",Font.ITALIC,10));
			add(LLongWallmining);
			
			LRoomandPillar = new JLabel("");
			LRoomandPillar.setBounds(255, 20, 35, 10);
			LRoomandPillar.setFont(new Font("Arial",Font.ITALIC,10));
			add(LRoomandPillar);
			
			LShirinkageStoping = new JLabel("");
			LShirinkageStoping.setBounds(290, 20, 35, 10);
			LShirinkageStoping.setFont(new Font("Arial",Font.ITALIC,10));
			add(LShirinkageStoping);
			
			LCutandFillStoping = new JLabel("");
			LCutandFillStoping.setBounds(325, 20, 35, 10);
			LCutandFillStoping.setFont(new Font("Arial",Font.ITALIC,10));
			add(LCutandFillStoping);
			
			LTopSlicing = new JLabel("");
			LTopSlicing.setBounds(360, 20, 35, 10);
			LTopSlicing.setFont(new Font("Arial",Font.ITALIC,10));
			add(LTopSlicing);
			
			LSquareset = new JLabel("");
			LSquareset.setBounds(395, 20, 35, 10);
			LSquareset.setFont(new Font("Arial",Font.ITALIC,10));
			add(LSquareset);
			
			JLabel LtxRajoAbierto = new JLabel(" RAJO ABIERTO"); 
			LtxRajoAbierto.setBounds(500,200,150,30);
			LtxRajoAbierto.setOpaque(true);
			LtxRajoAbierto.setBackground(Color.YELLOW);
			add(LtxRajoAbierto);
			
			JLabel LtxBlockCaving = new JLabel(" BLOCK CAVING"); 
			LtxBlockCaving.setBounds(500,235,150,30);
			LtxBlockCaving.setOpaque(true);
			LtxBlockCaving.setBackground(Color.ORANGE);
			add(LtxBlockCaving);
			
			JLabel LtxSublevelStoping = new JLabel(" SUBLEVEL STOPING"); 
			LtxSublevelStoping.setBounds(500,270,150,30);
			LtxSublevelStoping.setOpaque(true);
			LtxSublevelStoping.setBackground(Color.GREEN);
			add(LtxSublevelStoping);
			
			JLabel LtxSublevelCaving = new JLabel(" SUBLEVEL CAVING"); 
			LtxSublevelCaving.setBounds(500,305,150,30);
			LtxSublevelCaving.setOpaque(true);
			LtxSublevelCaving.setBackground(Color.BLUE);
			add(LtxSublevelCaving);
			
			JLabel LtxLongWallmining = new JLabel(" LONG WALL MINING"); 
			LtxLongWallmining.setBounds(500,340,150,30);
			LtxLongWallmining.setOpaque(true);
			LtxLongWallmining.setBackground(Color.RED);
			add(LtxLongWallmining);
			
			JLabel LtxRoomandPillar = new JLabel(" ROOM AND PILLAR"); 
			LtxRoomandPillar.setBounds(500,375,150,30);
			LtxRoomandPillar.setOpaque(true);
			LtxRoomandPillar.setBackground(Color.CYAN);
			add(LtxRoomandPillar);
			
			JLabel LtxShirinkageStoping = new JLabel(" SHIRINKAGE STOPING"); 
			LtxShirinkageStoping.setBounds(500,410,150,30);
			LtxShirinkageStoping.setOpaque(true);
			LtxShirinkageStoping.setBackground(Color.MAGENTA);
			add(LtxShirinkageStoping);
			
			JLabel LtxCutandFillStoping = new JLabel(" CUT AND FILL STOPING"); 
			LtxCutandFillStoping.setBounds(500,445,150,30);
			LtxCutandFillStoping.setOpaque(true);
			LtxCutandFillStoping.setBackground(new Color(100,200,10));
			add(LtxCutandFillStoping);
			
			JLabel LtxTopSlicing = new JLabel(" TOP SLICING"); 
			LtxTopSlicing.setBounds(500,480,150,30);
			LtxTopSlicing.setOpaque(true);
			LtxTopSlicing.setBackground(new Color(100,140,50));
			add(LtxTopSlicing);
			
			JLabel LtxSquareset = new JLabel(" SAQUARE SET"); 
			LtxSquareset.setBounds(500,480,150,30);
			LtxSquareset.setOpaque(true);
			LtxSquareset.setBackground(new Color(127, 150, 15));
			add(LtxSquareset);
			
			JLabel Info = new JLabel("Software desarrollado por el Grupo de desarrollo de Software Minero del CMMSB-UNI");
			Info.setBounds(100, 660, 500, 20);
			add(Info);
		}
		public void paintComponent(Graphics gd) {
			Graphics2D g2d = (Graphics2D)gd;
			super.paintComponent(g2d);
			
			
			GRajoAbierto = (int)RRajoAbierto*4;
			GBlockCaving = (int)RBlockCaving*4;
			GSublevelStoping=(int)RSublevelStoping*4;
			GSublevelCaving=(int)RSublevelCaving*4;
			GLongWallmining=(int)RLongWallmining*4;
			GRoomandPillar=(int)RRoomandPillar*4;
			GShirinkageStoping=(int)RShirinkageStoping*4;
			GCutandFillStoping=(int)RCutandFillStoping*4;
			GTopSlicing=(int)RTopSlicing*4;
			GSquareset=(int)RSquareset*4;
			
			
			
			if (GRajoAbierto>=0) {
			g2d.setColor(Color.YELLOW);
			g2d.fillRect(80, 360-GRajoAbierto, 30, GRajoAbierto);
			}else {g2d.setColor(Color.YELLOW);
			g2d.fillRect(80, 360, 30, -GRajoAbierto);}
			
			if(GBlockCaving>=0) {
			g2d.setColor(Color.ORANGE);
			g2d.fillRect(115, 360-GBlockCaving, 30, GBlockCaving);
			}else {g2d.setColor(Color.ORANGE);
			g2d.fillRect(115, 360, 30, -GBlockCaving);}
			
			if(GSublevelStoping>=0) {
				g2d.setColor(Color.GREEN);
				g2d.fillRect(155, 360-GSublevelStoping, 30, GSublevelStoping);
			}else {g2d.setColor(Color.GREEN);
			g2d.fillRect(155, 360, 30, -GSublevelStoping);}
			
			if(GSublevelCaving>=0) {
				g2d.setColor(Color.BLUE);
				g2d.fillRect(190, 360-GSublevelCaving, 30, GSublevelCaving);
			}else {g2d.setColor(Color.BLUE);
			g2d.fillRect(190, 360, 30, -GSublevelCaving);}
			
			if(GLongWallmining>=0) {
				g2d.setColor(Color.RED);
				g2d.fillRect(225, 360-GLongWallmining, 30, GLongWallmining);
			}else {g2d.setColor(Color.RED);
			g2d.fillRect(225, 360, 30, -GLongWallmining);}
			
			if(GRoomandPillar>=0) {
				g2d.setColor(Color.CYAN);
				g2d.fillRect(260, 360-GRoomandPillar, 30, GRoomandPillar);
			}else {g2d.setColor(Color.CYAN.brighter());
			g2d.fillRect(260, 360, 30, -GRoomandPillar);}
			
			if(GShirinkageStoping>=0) {
				g2d.setColor(Color.MAGENTA);
				g2d.fillRect(295, 360-GShirinkageStoping, 30, GShirinkageStoping);
			}else {g2d.setColor(Color.MAGENTA);
			g2d.fillRect(295, 360, 30, -GShirinkageStoping);}
			
			if(GCutandFillStoping>=0) {
				g2d.setColor(new Color(100,200,10));
				g2d.fillRect(330, 360-GCutandFillStoping, 30, GCutandFillStoping);
			}else {g2d.setColor(new Color(100,200,10));
			g2d.fillRect(330, 360, 30, -GCutandFillStoping);}
			
			if(GTopSlicing>=0) {
				g2d.setColor(new Color(100,140,50));
				g2d.fillRect(365, 360-GTopSlicing, 30, GTopSlicing);
			}else {g2d.setColor(new Color(100,140,50));
			g2d.fillRect(365, 360, 30, -GTopSlicing);}
			
			if(GSquareset>=0) {
				g2d.setColor(new Color(127, 150, 15));
				g2d.fillRect(400, 360-GSquareset, 30, GSquareset);
			}else {g2d.setColor(new Color(127, 150, 15));
			g2d.fillRect(400, 360, 30, -GSquareset);}
			
			g2d.setColor(Color.BLACK);
			g2d.setStroke(new BasicStroke(2));
			g2d.drawLine(70, 70, 70, 650);
			g2d.drawLine(70, 360, 450, 360);
		}
	}
	
	

	public void WomboCombos() {
		
		Combo1.setBounds(250, 110, 180, 25);
		Combo1.addItem("Equidimensional o masivo");
		Combo1.addItem("Tabular o elongado");
		Combo1.addItem("Irregular");
		Combo1.setSelectedItem(null);
		LaminaPrincipalForm.add(Combo1);
		
		
		Combo2.setBounds(250, 135, 180, 25);
		Combo2.addItem("Baja (0-10m)");
		Combo2.addItem("Intermedia (10-30m)");
		Combo2.addItem("Potente (30-100)");
		Combo2.addItem("Muy Potente (>100)");
		Combo2.setSelectedItem(null);
		LaminaPrincipalForm.add(Combo2);
		
		
		Combo3.setBounds(250, 160, 180, 25);
		Combo3.addItem("Horizontal (0-20°)");
		Combo3.addItem("Intermedia (20°-55°)");
		Combo3.addItem("Potente (>55°)");
		Combo3.setSelectedItem(null);
		LaminaPrincipalForm.add(Combo3);
		
		
		CuadroTexto1.setBounds(250, 185, 180, 25);
		CuadroTexto1.setBackground(SystemColor.control);
		CuadroTexto1.addKeyListener(EventoKey);
		LaminaPrincipalForm.add(CuadroTexto1);
	
		
		Combo4.setBounds(250, 210, 180, 25);
		Combo4.addItem("Uniforme");
		Combo4.addItem("Gradacional");
		Combo4.addItem("Errática");
		Combo4.setSelectedItem(null);
		LaminaPrincipalForm.add(Combo4);
		//Mineral
		
		CuadroTexto2.setBounds(250, 300, 180, 20);
		CuadroTexto2.setBackground(SystemColor.control);
		CuadroTexto2.addKeyListener(EventoKey);
		LaminaPrincipalForm.add(CuadroTexto2);
		
		
		Combo5.setBounds(250, 320, 180, 20);
		Combo5.addItem("Muy Fracturado (>16 ff/m)");
		Combo5.addItem("Fracturado (10-16 ff/m)");
		Combo5.addItem("Poco Fracturado(3-10 ff/m)");
		Combo5.addItem("Muy Poco Fracturado(3> ff/m)");
		Combo5.setSelectedItem(null);
		LaminaPrincipalForm.add(Combo5);
		
		
		Combo6.setBounds(250, 340, 180, 20);
		Combo6.addItem("Poco Competente");
		Combo6.addItem("Competente");
		Combo6.addItem("Muy Competente");
		Combo6.setSelectedItem(null);
		LaminaPrincipalForm.add(Combo6);
		//Pred colgante
		
		CuadroTexto3.setBounds(250, 400, 180, 20);
		CuadroTexto3.setBackground(SystemColor.control);
		CuadroTexto3.addKeyListener(EventoKey);
		LaminaPrincipalForm.add(CuadroTexto3);
		
		
		Combo7.setBounds(250, 420, 180, 20);
		Combo7.addItem("Muy Fracturado (>16 ff/m)");
		Combo7.addItem("Fracturado (10-16 ff/m)");
		Combo7.addItem("Poco Fracturado(3-10 ff/m)");
		Combo7.addItem("Muy Poco Fracturado(3> ff/m)");
		Combo7.setSelectedItem(null);
		LaminaPrincipalForm.add(Combo7);
		
		
		Combo8.setBounds(250, 440, 180, 20);
		Combo8.addItem("Poco Competente");
		Combo8.addItem("Competente");
		Combo8.addItem("Muy Competente");
		Combo8.setSelectedItem(null);
		LaminaPrincipalForm.add(Combo8);
		
		
		CuadroTexto4.setBounds(250, 500, 180, 20);
		CuadroTexto4.setBackground(SystemColor.control);
		CuadroTexto4.addKeyListener(EventoKey);
		LaminaPrincipalForm.add(CuadroTexto4);
		
		
		Combo9.setBounds(250, 520, 180, 20);
		Combo9.addItem("Muy Fracturado (>16 ff/m)");
		Combo9.addItem("Fracturado (10-16 ff/m)");
		Combo9.addItem("Poco Fracturado(3-10 ff/m)");
		Combo9.addItem("Muy Poco Fracturado(3> ff/m)");
		Combo9.setSelectedItem(null);
		LaminaPrincipalForm.add(Combo9);
		
		
		Combo10.setBounds(250, 540, 180, 20);
		Combo10.addItem("Poco Competente");
		Combo10.addItem("Competente");
		Combo10.addItem("Muy Competente");
		Combo10.setSelectedItem(null);
		LaminaPrincipalForm.add(Combo10);
		
		BotonCalcular = new JButton("Calcular");
		BotonCalcular.setBounds(200, 600, 90, 30);
		BotonCalcular.setEnabled(false);
		BotonCalcular.addActionListener(codeEventos);
		LaminaPrincipalForm.add(BotonCalcular);
		
	}
	
	private class Eventos implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			
			RajoAbierto1=RajoAbierto2=RajoAbierto3=RajoAbierto4=RajoAbierto5=RRajoAbierto=0;
			BlockCaving1=BlockCaving2=BlockCaving3=BlockCaving4=BlockCaving5=RBlockCaving=0;
			SublevelStoping1=SublevelStoping2=SublevelStoping3=SublevelStoping4=SublevelStoping5=RSublevelStoping=0;;
			SublevelCaving1=SublevelCaving2=SublevelCaving3=SublevelCaving4=SublevelCaving5=RSublevelCaving=0;
			LongWallmining1=LongWallmining2=LongWallmining3=LongWallmining4=LongWallmining5=RLongWallmining=0;
			RoomandPillar1=RoomandPillar2=RoomandPillar3=RoomandPillar4=RoomandPillar5=RRoomandPillar=0;
			ShirinkageStoping1=ShirinkageStoping2=ShirinkageStoping3=ShirinkageStoping4=ShirinkageStoping5=RShirinkageStoping=0;
			CutandFillStoping1=CutandFillStoping2=CutandFillStoping3=CutandFillStoping4=CutandFillStoping5=RCutandFillStoping=0;
			TopSlicing1=TopSlicing2=TopSlicing3=TopSlicing4=TopSlicing5=RTopSlicing=0;
			Squareset1=Squareset2=Squareset3=Squareset4=Squareset5=RSquareset=0;
			
			if (Combo1.getSelectedItem()==null) {JOptionPane.showMessageDialog(null, "Porfavor completar el primer campo");}
			else {
			TextoCombo1 = (String)Combo1.getSelectedItem();
			switch (TextoCombo1) {
			case "Equidimensional o masivo" : 
				RajoAbierto1+=3;
				BlockCaving1+=4;
				SublevelStoping1+=2;
				SublevelCaving1+=3;
				LongWallmining1-=49;
				RoomandPillar1+=0;
				ShirinkageStoping1+=2;
				CutandFillStoping1+=0;
				TopSlicing1+=3;
				Squareset1+=0;
				break;
			case "Tabular o elongado" : 
				RajoAbierto1+=2;
				BlockCaving1+=2;
				SublevelStoping1+=2;
				SublevelCaving1+=4;
				LongWallmining1+=4;
				RoomandPillar1+=4;
				ShirinkageStoping1+=2;
				CutandFillStoping1+=4;
				TopSlicing1+=3;
				Squareset1+=2;
				break;
			case "Irregular" : 
				RajoAbierto1+=3;
				BlockCaving1+=0;
				SublevelStoping1+=1;
				SublevelCaving1+=1;
				LongWallmining1-=49;
				RoomandPillar1+=2;
				ShirinkageStoping1+=1;
				CutandFillStoping1+=2;
				TopSlicing1+=0;
				Squareset1+=4;
				break;
			}
			}
			if (Combo2.getSelectedItem()==null) {JOptionPane.showMessageDialog(null, "Porfavor completar el segundo campo");}
			else {
			
			TextoCombo2 = (String)Combo2.getSelectedItem();
			switch (TextoCombo2) {
			case "Baja (0-10m)" : 
				RajoAbierto1+=2;
				BlockCaving1-=49;
				SublevelStoping1+=1;
				SublevelCaving1-=49;
				LongWallmining1+=4;
				RoomandPillar1+=4;
				ShirinkageStoping1+=1;
				CutandFillStoping1+=4;
				TopSlicing1-=49;
				Squareset1+=4;
				break;
			case "Intermedia (10-30m)" : 
				RajoAbierto1+=3;
				BlockCaving1+=0;
				SublevelStoping1+=2;
				SublevelCaving1+=0;
				LongWallmining1+=0;
				RoomandPillar1+=2;
				ShirinkageStoping1+=1;
				CutandFillStoping1+=4;
				TopSlicing1+=0;
				Squareset1+=4;
				break;
			case "Potente (30-100)" : 
				RajoAbierto1+=4;
				BlockCaving1+=2;
				SublevelStoping1+=4;
				SublevelCaving1+=4;
				LongWallmining1-=49;
				RoomandPillar1-=49;
				ShirinkageStoping1+=2;
				CutandFillStoping1+=0;
				TopSlicing1+=3;
				Squareset1+=4;
				break;
			case "Muy Potente (>100)": 
				RajoAbierto1+=4;
				BlockCaving1+=4;
				SublevelStoping1+=3;
				SublevelCaving1+=3;
				LongWallmining1-=49;
				RoomandPillar1-=49;
				ShirinkageStoping1+=4;
				CutandFillStoping1+=0;
				TopSlicing1+=4;
				Squareset1+=1;
				break;
			}
			}
			
			if (Combo3.getSelectedItem()==null) {JOptionPane.showMessageDialog(null, "Porfavor completar el tercer campo");}
			else {
			TextoCombo3 = (String)Combo3.getSelectedItem();
			switch (TextoCombo3) {
			case "Horizontal (0-20°)" : 
				RajoAbierto1+=			3;
				BlockCaving1+=			3;
				SublevelStoping1+=		2;
				SublevelCaving1+=		1;
				LongWallmining1+=		4;
				RoomandPillar1+=		4;
				ShirinkageStoping1+=	2;
				CutandFillStoping1+=	0;
				TopSlicing1+=			4;
				Squareset1+=			2;
				break;
			case "Intermedia (20°-55°)" : 
				RajoAbierto1+=			3;
				BlockCaving1+=			2;
				SublevelStoping1+=		1;
				SublevelCaving1+=		1;
				LongWallmining1+=		0;
				RoomandPillar1+=		1;
				ShirinkageStoping1+=	1;
				CutandFillStoping1+=	3;
				TopSlicing1+=			1;
				Squareset1+=			3;
				break;
			case "Potente (>55°)" : 
				RajoAbierto1+=			4;
				BlockCaving1+=			4;
				SublevelStoping1+=		4;
				SublevelCaving1+=		4;
				LongWallmining1-=		49;
				RoomandPillar1+=		0;
				ShirinkageStoping1+=	4;
				CutandFillStoping1+=	4;
				TopSlicing1+=			2;
				Squareset1+=			3;
				break;
			}
			}
			
			NumTexfield1 = Double.parseDouble(CuadroTexto1.getText());
			sv=NumTexfield1*0.027;
			
			if (Combo4.getSelectedItem()==null) {JOptionPane.showMessageDialog(null, "Porfavor completar el cuarto campo");}
			else {
			TextoCombo4 = (String)Combo4.getSelectedItem();
			switch (TextoCombo4) {
			case "Uniforme" : 
				RajoAbierto1+=			3;
				BlockCaving1+=			4;
				SublevelStoping1+=		3;
				SublevelCaving1+=		4;
				LongWallmining1+=		4;
				RoomandPillar1+=		3;
				ShirinkageStoping1+=	3;
				CutandFillStoping1+=	3;
				TopSlicing1+=			4;
				Squareset1+=			3;
				break;
			case "Gradacional" : 
				RajoAbierto1+=		3;
				BlockCaving1+=		2;
				SublevelStoping1+=	3;
				SublevelCaving1+=	2;
				LongWallmining1+=	2;
				RoomandPillar1+=		3;
				ShirinkageStoping1+=	2;
				CutandFillStoping1+=	3;
				TopSlicing1+=		2;
				Squareset1+=			3;
				break;
			case "Errática" : 
				RajoAbierto1+=		3;
				BlockCaving1+=		0;
				SublevelStoping1+=	1;
				SublevelCaving1+=	0;
				LongWallmining1+=	0;
				RoomandPillar1+=		3;
				ShirinkageStoping1+=	1;
				CutandFillStoping1+=	3;
				TopSlicing1+=		0;
				Squareset1+=			3;
				break;
			}
			}
			
			//MINERAL*********************************************
			NumTexfield2 = Double.parseDouble(CuadroTexto2.getText());
			rrocamineral=NumTexfield2/sv;
			if(rrocamineral<=8) {
				RajoAbierto2+=		3;
				BlockCaving2+=		4;
				SublevelStoping2-=	49;
				SublevelCaving2+=	0;
				LongWallmining2+=	4;
				RoomandPillar2+=		0;
				ShirinkageStoping2+=	1;
				CutandFillStoping2+=	3;
				TopSlicing2+=		2;
				Squareset2+=			4;
			}
			
			else if (rrocamineral<=15 && rrocamineral>8) {
				RajoAbierto2+=		4;
				BlockCaving2+=		1;
				SublevelStoping2+=	3;
				SublevelCaving2+=	3;
				LongWallmining2+=	1;
				RoomandPillar2+=		3;
				ShirinkageStoping2+=	3;
				CutandFillStoping2+=	2;
				TopSlicing2+=		3;
				Squareset2+=			1;
			}
			
			else if (rrocamineral>15) {
				RajoAbierto2+=		4;
				BlockCaving2+=		1;
				SublevelStoping2+=	4;
				SublevelCaving2+=	3;
				LongWallmining2+=	0;
				RoomandPillar2+=		4;
				ShirinkageStoping2+=	4;
				CutandFillStoping2+=	2;
				TopSlicing2+=		3;
				Squareset2+=			1;
			}
			
			if (Combo5.getSelectedItem()==null) {JOptionPane.showMessageDialog(null, "Porfavor completar el quinto campo");}
			else {
			TextoCombo5 = (String)Combo5.getSelectedItem();
			switch (TextoCombo5) {
			case "Muy Fracturado (>16 ff/m)" : 
				RajoAbierto3+=		4;
				BlockCaving3+=		0;
				SublevelStoping3+=	4;
				SublevelCaving3+=	4;
				LongWallmining3+=	0;
				RoomandPillar3+=		4;
				ShirinkageStoping3+=	4;
				CutandFillStoping3+=	2;
				TopSlicing3+=		4;
				Squareset3+=			1;
				break;
			case "Fracturado (10-16 ff/m)" : 
				RajoAbierto3+=		4;
				BlockCaving3+=		3;
				SublevelStoping3+=	1;
				SublevelCaving3+=	4;
				LongWallmining3+=	0;
				RoomandPillar3+=		2;
				ShirinkageStoping3+=	3;
				CutandFillStoping3+=	2;
				TopSlicing3+=		2;
				Squareset3+=			2;
				break;
			case "Poco Fracturado(3-10 ff/m)" : 
				RajoAbierto3+=		3;
				BlockCaving3+=		4;
				SublevelStoping3+=	0;
				SublevelCaving3+=	2;
				LongWallmining3+=	4;
				RoomandPillar3+=		1;
				ShirinkageStoping3+=	1;
				CutandFillStoping3+=	3;
				TopSlicing3+=		1;
				Squareset3+=			4;
				break;
			case "Muy Poco Fracturado(3> ff/m)" : 
				RajoAbierto3+=		2;
				BlockCaving3+=		4;
				SublevelStoping3+=	0;
				SublevelCaving3+=	0;
				LongWallmining3+=	4;
				RoomandPillar3+=		0;
				ShirinkageStoping3+=	0;
				CutandFillStoping3+=	3;
				TopSlicing3+=		1;
				Squareset3+=			4;
				break;
			}
			}
			
			if (Combo6.getSelectedItem()==null) {JOptionPane.showMessageDialog(null, "Porfavor completar el sexto campo");}
			else {
			TextoCombo6 = (String)Combo6.getSelectedItem();
			switch (TextoCombo6) {
			case "Poco Competente" : 
				RajoAbierto3+=		2;
				BlockCaving3+=		4;
				SublevelStoping3+=	0;
				SublevelCaving3+=	0;
				LongWallmining3+=	4;
				RoomandPillar3+=		0;
				ShirinkageStoping3+=	0;
				CutandFillStoping3+=	3;
				TopSlicing3+=		1;
				Squareset3+=			4;
				break;
			case "Competente" : 
				RajoAbierto3+=		3;
				BlockCaving3+=		3;
				SublevelStoping3+=	2;
				SublevelCaving3+=	2;
				LongWallmining3+=	3;
				RoomandPillar3+=		2;
				ShirinkageStoping3+=	2;
				CutandFillStoping3+=	3;
				TopSlicing3+=		2;
				Squareset3+=			3;
				break;
			case "Muy Competente" : 
				RajoAbierto3+=		4;
				BlockCaving3+=		0;
				SublevelStoping3+=	4;
				SublevelCaving3+=	2;
				LongWallmining3+=	0;
				RoomandPillar3+=		4;
				ShirinkageStoping3+=	4;
				CutandFillStoping3+=	2;
				TopSlicing3+=		4;
				Squareset3+=			2;
				break;
			}
			}
			//PARED COLGANTE
			
			NumTexfield3 = Double.parseDouble(CuadroTexto3.getText());
			rrocaparedcolgante=NumTexfield3/sv;
			if(rrocaparedcolgante<=8) {
				RajoAbierto4+=		3;
				BlockCaving4+=		4;
				SublevelStoping4-=	49;
				SublevelCaving4+=	3;
				LongWallmining4+=	4;
				RoomandPillar4+=		0;
				ShirinkageStoping4+=	4;
				CutandFillStoping4+=	3;
				TopSlicing4+=		4;
				Squareset4+=			3;
			}
			
			else if (rrocaparedcolgante<=15 && rrocaparedcolgante>8) {
				RajoAbierto4+=		4;
				BlockCaving4+=		2;
				SublevelStoping4+=	3;
				SublevelCaving4+=	2;
				LongWallmining4+=	2;
				RoomandPillar4+=		3;
				ShirinkageStoping4+=	2;
				CutandFillStoping4+=	2;
				TopSlicing4+=		2;
				Squareset4+=			2;
			}
			
			else if (rrocaparedcolgante>15) {
				RajoAbierto4+=		4;
				BlockCaving4+=		1;
				SublevelStoping4+=	4;
				SublevelCaving4+=	1;
				LongWallmining4+=	0;
				RoomandPillar4+=		4;
				ShirinkageStoping4+=	1;
				CutandFillStoping4+=	2;
				TopSlicing4+=		1;
				Squareset4+=			2;
			}
			
			if (Combo7.getSelectedItem()==null) {JOptionPane.showMessageDialog(null, "Porfavor completar séptimo campo");}
			else {
			TextoCombo7 = (String)Combo7.getSelectedItem();
			switch (TextoCombo7) {
			case "Muy Fracturado (>16 ff/m)" : 
				RajoAbierto4+=		4;
				BlockCaving4+=		0;
				SublevelStoping4+=	4;
				SublevelCaving4+=	1;
				LongWallmining4+=	0;
				RoomandPillar4+=		4;
				ShirinkageStoping4+=	0;
				CutandFillStoping4+=	2;
				TopSlicing4+=		0;
				Squareset4+=			2;
				break;
			case "Fracturado (10-16 ff/m)" : 
				RajoAbierto4+=		4;
				BlockCaving4+=		3;
				SublevelStoping4+=	1;
				SublevelCaving4+=	3;
				LongWallmining4+=	3;
				RoomandPillar4+=		2;
				ShirinkageStoping4+=	3;
				CutandFillStoping4+=	2;
				TopSlicing4+=		3;
				Squareset4+=			2;
				break;
			case "Poco Fracturado(3-10 ff/m)" : 
				RajoAbierto4+=		3;
				BlockCaving4+=		4;
				SublevelStoping4+=	0;
				SublevelCaving4+=	4;
				LongWallmining4+=	4;
				RoomandPillar4+=		1;
				ShirinkageStoping4+=	4;
				CutandFillStoping4+=	3;
				TopSlicing4+=		3;
				Squareset4+=			3;
				break;
			case "Muy Poco Fracturado(3> ff/m)" : 
				RajoAbierto4+=		2;
				BlockCaving4+=		3;
				SublevelStoping4-=	49;
				SublevelCaving4+=	3;
				LongWallmining4+=	4;
				RoomandPillar4+=		0;
				ShirinkageStoping4+=	4;
				CutandFillStoping4+=	3;
				TopSlicing4+=		3;
				Squareset4+=			3;
				break;
			}
			}
			
			if (Combo8.getSelectedItem()==null) {JOptionPane.showMessageDialog(null, "Porfavor completar el octavo");}
			else {
			TextoCombo8 = (String)Combo8.getSelectedItem();
			switch (TextoCombo8) {
			case "Poco Competente" : 
				RajoAbierto4+=		2;
				BlockCaving4+=		4;
				SublevelStoping4+=	0;
				SublevelCaving4+=	4;
				LongWallmining4+=	4;
				RoomandPillar4+=		0;
				ShirinkageStoping4+=	4;
				CutandFillStoping4+=	4;
				TopSlicing4+=		4;
				Squareset4+=			4;
				break;
			case "Competente" : 
				RajoAbierto4+=		3;
				BlockCaving4+=		2;
				SublevelStoping4+=	2;
				SublevelCaving4+=	2;
				LongWallmining4+=	2;
				RoomandPillar4+=		2;
				ShirinkageStoping4+=	2;
				CutandFillStoping4+=	3;
				TopSlicing4+=		2;
				Squareset4+=			3;
				break;
			case "Muy Competente" : 
				RajoAbierto4+=		4;
				BlockCaving4+=		0;
				SublevelStoping4+=	4;
				SublevelCaving4+=	0;
				LongWallmining4+=	0;
				RoomandPillar4+=		4;
				ShirinkageStoping4+=	0;
				CutandFillStoping4+=	2;
				TopSlicing4+=		0;
				Squareset4+=			2;
				break;
			}
			}
			
			//PARED YACIENTE
			
			NumTexfield4 = Double.parseDouble(CuadroTexto4.getText());
			rrocaparedyaciente=NumTexfield4/sv;
			if(rrocaparedyaciente<=8) {
				RajoAbierto5+=			3;
				BlockCaving5+=			2;
				SublevelStoping5+=		0;
				SublevelCaving5+=		0;
				LongWallmining5+=		2;
				RoomandPillar5+=		0;
				ShirinkageStoping5+=	2;
				CutandFillStoping5+=	4;
				TopSlicing5+=			2;
				Squareset5+=			4;
			}
			
			else if (rrocaparedyaciente<=15 && rrocaparedyaciente>8) {
				RajoAbierto5+=			4;
				BlockCaving5+=			3;
				SublevelStoping5+=		2;
				SublevelCaving5+=		2;
				LongWallmining5+=		3;
				RoomandPillar5+=		2;
				ShirinkageStoping5+=	3;
				CutandFillStoping5+=	2;
				TopSlicing5+=			3;
				Squareset5+=			2;
			}
			
			else if (rrocaparedyaciente>15) {
				RajoAbierto5+=			4;
				BlockCaving5+=			3;
				SublevelStoping5+=		4;
				SublevelCaving5+=		4;
				LongWallmining5+=		3;
				RoomandPillar5+=		4;
				ShirinkageStoping5+=	3;
				CutandFillStoping5+=	2;
				TopSlicing5+=			3;
				Squareset5+=			2;
			}
			
			if (Combo9.getSelectedItem()==null) {JOptionPane.showMessageDialog(null, "Porfavor completar el noveno campo");}
			else {
			TextoCombo9 = (String)Combo9.getSelectedItem();
			switch (TextoCombo9) {
			case "Muy Fracturado (>16 ff/m)" : 
				RajoAbierto5+=			4;
				BlockCaving5+=			3;
				SublevelStoping5+=		4;
				SublevelCaving5+=		4;
				LongWallmining5+=		3;
				RoomandPillar5+=		3;
				ShirinkageStoping5+=	2;
				CutandFillStoping5+=	2;
				TopSlicing5+=			3;
				Squareset5+=			2;
				break;
			case "Fracturado (10-16 ff/m)" : 
				RajoAbierto5+=			4;
				BlockCaving5+=			3;
				SublevelStoping5+=		2;
				SublevelCaving5+=		3;
				LongWallmining5+=		4;
				RoomandPillar5+=		3;
				ShirinkageStoping5+=	3;
				CutandFillStoping5+=	2;
				TopSlicing5+=			3;
				Squareset5+=			2;
				break;
			case "Poco Fracturado(3-10 ff/m)" : 
				RajoAbierto5+=			3;
				BlockCaving5+=			3;
				SublevelStoping5+=		0;
				SublevelCaving5+=		1;
				LongWallmining5+=		2;
				RoomandPillar5+=		1;
				ShirinkageStoping5+=	3;
				CutandFillStoping5+=	4;
				TopSlicing5+=			3;
				Squareset5+=			4;
				break;
			case "Muy Poco Fracturado(3> ff/m)" : 
				RajoAbierto5+=			2;
				BlockCaving5+=			1;
				SublevelStoping5+=		0;
				SublevelCaving5+=		0;
				LongWallmining5+=		1;
				RoomandPillar5+=		0;
				ShirinkageStoping5+=	2;
				CutandFillStoping5+=	4;
				TopSlicing5+=			1;
				Squareset5+=			4;
				break;
			}
			}
			
			if (Combo10.getSelectedItem()==null) {JOptionPane.showMessageDialog(null, "Porfavor completar el décimo campo");}
			else {
			TextoCombo10 = (String)Combo10.getSelectedItem();
			switch (TextoCombo10) {
			case "Poco Competente" : 
				RajoAbierto5+=			2;
				BlockCaving5+=			1;
				SublevelStoping5+=		0;
				SublevelCaving5+=		0;
				LongWallmining5+=		1;
				RoomandPillar5+=		0;
				ShirinkageStoping5+=	2;
				CutandFillStoping5+=	4;
				TopSlicing5+=			1;
				Squareset5+=			4;
				break;
			case "Competente" : 
				RajoAbierto5+=			3;
				BlockCaving5+=			3;
				SublevelStoping5+=		1;
				SublevelCaving5+=		2;
				LongWallmining5+=		3;
				RoomandPillar5+=		3;
				ShirinkageStoping5+=	2;
				CutandFillStoping5+=	4;
				TopSlicing5+=			2;
				Squareset5+=			4;
				break;
			case "Muy Competente" : 
				RajoAbierto5+=			4;
				BlockCaving5+=			3;
				SublevelStoping5+=		4;
				SublevelCaving5+=		4;
				LongWallmining5+=		3;
				RoomandPillar5+=		3;
				ShirinkageStoping5+=	3;
				CutandFillStoping5+=	2;
				TopSlicing5+=			3;
				Squareset5+=			2;
				break;
			}
			}
			RankingsCalc();
			BotonCalcular.setText("Recalcular");
			Graphics gt=GrafEstadis.getGraphics();
			GrafEstadis.paintComponent(gt);
			
			DecimalFormat df = new DecimalFormat("0.00");
			
			LRajoAbierto.setText(""+df.format(RRajoAbierto));
			if(GRajoAbierto>=0) {
			LRajoAbierto.setBounds(80, 360-GRajoAbierto, 30, 10);}
			else {LRajoAbierto.setBounds(80,360-GRajoAbierto, 30, 10);}
			
			LBlockCaving.setText(""+df.format(RBlockCaving));
			if(GBlockCaving>=0) {
			LBlockCaving.setBounds(115, 360-GBlockCaving, 30, 10);}
			else {LBlockCaving.setBounds(115,360-GBlockCaving, 30, 10);}
			
			LSublevelStoping.setText(""+df.format(RSublevelStoping));
			if(GSublevelStoping>=0) {
			LSublevelStoping.setBounds(150, 360-GSublevelStoping, 30, 10);}
			else {LSublevelStoping.setBounds(150,360-GSublevelStoping, 30, 10);}
			
			LSublevelCaving.setText(""+df.format(RSublevelCaving));
			if(GSublevelCaving>=0) {
			LSublevelCaving.setBounds(185, 360-GSublevelCaving, 30, 10);}
			else {LSublevelCaving.setBounds(185,360-GSublevelCaving, 30, 10);}
			
			LLongWallmining.setText(""+df.format(RLongWallmining));
			if(GLongWallmining>=0) {
			LLongWallmining.setBounds(220, 360-GLongWallmining, 30, 10);}
			else {LLongWallmining.setBounds(220,360-GLongWallmining, 30, 10);}
			
			LRoomandPillar.setText(""+df.format(RRoomandPillar));
			if(GRoomandPillar>=0) {
			LRoomandPillar.setBounds(255, 360-GRoomandPillar, 30, 10);}
			else {LRoomandPillar.setBounds(255,360-GRoomandPillar, 30, 10);}
			
			LShirinkageStoping.setText(""+df.format(RShirinkageStoping));
			if(GShirinkageStoping>=0) {
			LShirinkageStoping.setBounds(290, 360-GShirinkageStoping, 30, 10);}
			else {LShirinkageStoping.setBounds(290,360-GShirinkageStoping, 30, 10);}
			
			LCutandFillStoping.setText(""+df.format(RCutandFillStoping));
			if(GCutandFillStoping>=0) {
			LCutandFillStoping.setBounds(325, 360-GCutandFillStoping, 30, 10);}
			else {LCutandFillStoping.setBounds(325,360-GCutandFillStoping, 30, 10);}
			
			LTopSlicing.setText(""+df.format(RTopSlicing));
			if(GTopSlicing>=0) {
			LTopSlicing.setBounds(360, 360-GTopSlicing, 30, 10);}
			else {LTopSlicing.setBounds(360,360-GTopSlicing, 30, 10);}
			
			LSquareset.setText(""+df.format(RSquareset));
			if(GSquareset>=0) {
			LSquareset.setBounds(395, 360-GSquareset, 30, 10);}
			else {LSquareset.setBounds(395,360-GSquareset, 30, 10);}
			
			repaint();
		}

		
	}
	
	public void RankingsCalc() {
		
		RRajoAbierto=			RajoAbierto1+(RajoAbierto2+RajoAbierto3)*0.75+RajoAbierto4*0.6+RajoAbierto5*0.38;
		RBlockCaving=			BlockCaving1+(BlockCaving2+BlockCaving3)*0.75+BlockCaving4*0.6+BlockCaving5*0.38;
		RSublevelStoping=		SublevelStoping1+(SublevelStoping2+SublevelStoping3)*0.75+SublevelStoping4*0.6+SublevelStoping5*0.38;
		RSublevelCaving=		SublevelCaving1+(SublevelCaving2+SublevelCaving3)*0.75+SublevelCaving4*0.6+SublevelCaving5*0.38;
		RLongWallmining=		LongWallmining1+(LongWallmining2+LongWallmining3)*0.75+LongWallmining4*0.6+LongWallmining5*0.38;
		RRoomandPillar=			RoomandPillar1+(RoomandPillar2+RoomandPillar3)*0.75+RoomandPillar4*0.6+RoomandPillar5*0.38;
		RShirinkageStoping=		ShirinkageStoping1+(ShirinkageStoping2+ShirinkageStoping3)*0.75+ShirinkageStoping4*0.6+ShirinkageStoping5*0.38;
		RCutandFillStoping=		CutandFillStoping1+(CutandFillStoping2+CutandFillStoping3)*0.75+CutandFillStoping4*0.6+CutandFillStoping5*0.38;
		RTopSlicing=			TopSlicing1+(TopSlicing2+TopSlicing3)*0.75+TopSlicing4*0.6+TopSlicing5*0.38;
		RSquareset=				Squareset1+(Squareset2+Squareset3)*0.75+Squareset4*0.6+Squareset5*0.38;
		
		System.out.println(RRajoAbierto);
		System.out.println(RBlockCaving);
		System.out.println(RSublevelStoping);
		System.out.println(RSublevelCaving);
		System.out.println(RLongWallmining);
		System.out.println(RRoomandPillar);
		System.out.println(RShirinkageStoping);
		System.out.println(RCutandFillStoping);
		System.out.println(RTopSlicing);
		System.out.println(RSquareset);

		
	}
	
	
	
	public class KeyEscucha implements KeyListener {

		public void keyTyped(KeyEvent e) {
			char validarkey = e.getKeyChar();
			if(Character.isLetter(validarkey)) {
				getToolkit().beep();
				e.consume();
				JOptionPane.showMessageDialog(rootPane,"Solo se admiten números (las unidades son megapascales)");
			}
		}
		public void keyPressed(KeyEvent e) {
			if (CuadroTexto1.getText().equals("Profundidad en metros")) {
				CuadroTexto1.setText("");}	
			if (CuadroTexto2.getText().equals("Ingrese UCS en Mpa")) {
				CuadroTexto2.setText("");}	
			if (CuadroTexto3.getText().equals("Ingrese UCS en Mpa")) {
				CuadroTexto3.setText("");}	
			if (CuadroTexto4.getText().equals("Ingrese UCS en Mpa")) {
				CuadroTexto4.setText("");}	
			

		}
		public void keyReleased(KeyEvent e) {
			
			BotonCalcular.setEnabled(CuadroTexto2.getText().length()!=0 && CuadroTexto1.getText().length()!=0 && CuadroTexto3.getText().length()!=0 && CuadroTexto4.getText().length()!=0) ;
			
		}
	
	}
	
	private KeyEscucha EventoKey;
	private LaminaPrincipal LaminaPrincipalForm;
	private Graficsalfa GrafEstadis;
	private JComboBox Combo1 = new JComboBox();
	private JComboBox Combo2 = new JComboBox();
	private JComboBox Combo3 = new JComboBox();
	private JTextField CuadroTexto1 = new JTextField("Profundidad en metros");
	private JComboBox Combo4 = new JComboBox();
	private JTextField CuadroTexto2 = new JTextField("Ingrese UCS en Mpa");
	private JComboBox Combo5 = new JComboBox();
	private JComboBox Combo6 = new JComboBox();
	private JTextField CuadroTexto3 = new JTextField("Ingrese UCS en Mpa");
	private JComboBox Combo7 = new JComboBox();
	private JComboBox Combo8 = new JComboBox();
	private JTextField CuadroTexto4 = new JTextField("Ingrese UCS en Mpa");
	private JComboBox Combo9 = new JComboBox();
	private JComboBox Combo10 = new JComboBox();
	private JButton BotonCalcular;
	private Eventos codeEventos;

	//constantes de los combobox
	private String TextoCombo1;
	private String TextoCombo2;
	private String TextoCombo3;
	private String TextoCombo4;
	private String TextoCombo5;
	private String TextoCombo6;
	private String TextoCombo7;
	private String TextoCombo8;
	private String TextoCombo9;
	private String TextoCombo10;
	//constantes de los textos
	
	private double NumTexfield1;
	private double NumTexfield2;
	private double NumTexfield3;
	private double NumTexfield4;
	
	//Constantes de los métodos Tipo de yacimiento
	private double RajoAbierto1=0;
	private double BlockCaving1=0;
	private double SublevelStoping1=0;
	private double SublevelCaving1=0;
	private double LongWallmining1=0;
	private double RoomandPillar1=0;
	private double ShirinkageStoping1=0;
	private double CutandFillStoping1=0;
	private double TopSlicing1 =0;
	private double Squareset1=0;
	
	//Constantes de los métodos Condiciones geotecnicas del mineral
	private double RajoAbierto2=0;
	private double BlockCaving2=0;
	private double SublevelStoping2=0;
	private double SublevelCaving2=0;
	private double LongWallmining2=0;
	private double RoomandPillar2=0;
	private double ShirinkageStoping2=0;
	private double CutandFillStoping2=0;
	private double TopSlicing2=0;
	private double Squareset2=0;
	
	//Constantes de los métodos Condiciones geotecnicas del mineral (estructuras)
	private double RajoAbierto3=0;
	private double BlockCaving3=0;
	private double SublevelStoping3=0;
	private double SublevelCaving3=0;
	private double LongWallmining3=0;
	private double RoomandPillar3=0;
	private double ShirinkageStoping3=0;
	private double CutandFillStoping3=0;
	private double TopSlicing3=0;
	private double Squareset3=0;
	
	//Constantes de los métodos Condiciones geotecnicas de la pared colgante
	private double RajoAbierto4=0;
	private double BlockCaving4=0;
	private double SublevelStoping4=0;
	private double SublevelCaving4=0;
	private double LongWallmining4=0;
	private double RoomandPillar4=0;
	private double ShirinkageStoping4=0;
	private double CutandFillStoping4=0;
	private double TopSlicing4=0;
	private double Squareset4=0;
	
	//Constantes de los métodos Condiciones geotecnicas de la pared pendiente
	private double RajoAbierto5=0;
	private double BlockCaving5=0;
	private double SublevelStoping5=0;
	private double SublevelCaving5=0;
	private double LongWallmining5=0;
	private double RoomandPillar5=0;
	private double ShirinkageStoping5=0;
	private double CutandFillStoping5=0;
	private double TopSlicing5=0;
	private double Squareset5=0;
	
	//Constantes Rankings
	private double RRajoAbierto=0;
	private double RBlockCaving=0;
	private double RSublevelStoping=0;
	private double RSublevelCaving=0;
	private double RLongWallmining=0;
	private double RRoomandPillar=0;
	private double RShirinkageStoping=0;
	private double RCutandFillStoping=0;
	private double RTopSlicing=0;
	private double RSquareset=0;
	
	//Constantes adicionales
	private double sv;
	private double rrocamineral;
	private double rrocaparedcolgante;
	private double rrocaparedyaciente;
	
	private JLabel LRajoAbierto;
	private JLabel LBlockCaving;
	private JLabel LSublevelStoping;
	private JLabel LSublevelCaving;
	private JLabel LLongWallmining;
	private JLabel LRoomandPillar;
	private JLabel LShirinkageStoping;
	private JLabel LCutandFillStoping;
	private JLabel LTopSlicing;
	private JLabel LSquareset;
	
	int GRajoAbierto;
	int GBlockCaving;
	int GSublevelStoping;
	int GSublevelCaving;
	int GLongWallmining;
	int GRoomandPillar;
	int GShirinkageStoping;
	int GCutandFillStoping;
	int GTopSlicing;
	int GSquareset;
	
	
}



