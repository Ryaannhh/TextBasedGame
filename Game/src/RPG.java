import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class RPG {
	
	JFrame window;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel titleNameLabel, scoreLabel, scoreLabelNumber, weaponLabel, weaponLabelName;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);
	JButton startButton, choice1, choice2, choice3, choice4;
	JTextArea mainTextArea;
	int playerScore, monsterHP, bukuTugas;
	String weapon, position;
	
	TitleScreenHandler tsHandler = new TitleScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();


	public static void main(String[] args) {

		new RPG();
	}
	
	public RPG(){
		
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.black);
		titleNameLabel = new JLabel("Student Life");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);	
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);
		
		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel);
	}
	
	public void createGameScreen(){
		
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea("This is the main text are. This game is going to be great. I'm sure of it!!!!!!!");
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250, 350, 300, 150);
		choiceButtonPanel.setBackground(Color.black);
		choiceButtonPanel.setLayout(new GridLayout(4,1));
		con.add(choiceButtonPanel);
		
		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(choiceHandler);
		choice1.setActionCommand("c1");
		choiceButtonPanel.add(choice1);
		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("c2");
		choiceButtonPanel.add(choice2);
		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("c3");
		choiceButtonPanel.add(choice3);
		choice4 = new JButton("Choice 4");
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		choice4.setFont(normalFont);
		choice4.setFocusPainted(false);
		choice4.addActionListener(choiceHandler);
		choice4.setActionCommand("c4");
		choiceButtonPanel.add(choice4);
		
		playerPanel = new JPanel();
		playerPanel.setBounds(100, 15, 600, 50);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1,4));
		con.add(playerPanel);
		scoreLabel = new JLabel("Score:");
		scoreLabel.setFont(normalFont);
		scoreLabel.setForeground(Color.white);
		playerPanel.add(scoreLabel);
		scoreLabelNumber = new JLabel();
		scoreLabelNumber.setFont(normalFont);
		scoreLabelNumber.setForeground(Color.white);
		playerPanel.add(scoreLabelNumber);
		weaponLabel = new JLabel("Weapon:");
		weaponLabel.setFont(normalFont);
		weaponLabel.setForeground(Color.white);
		playerPanel.add(weaponLabel);
		weaponLabelName = new JLabel();
		weaponLabelName.setFont(normalFont);
		weaponLabelName.setForeground(Color.white);
		playerPanel.add(weaponLabelName);

		playerSetup();

	}
	public void playerSetup(){
		playerScore = 15;
	
		weapon = "Knife";
		weaponLabelName.setText(weapon);
		scoreLabelNumber.setText("" + playerScore);
		
		kosKosan();
	}
	
	public void kosKosan(){
		position = "kosKosan";
		mainTextArea.setText("Kamu bangun kesiangan. \nApa yang akan kamu lakukan?");		
		choice1.setText("Langsung Berangkat, ga usah mandi");
		choice2.setText("Mandi dulu, baru berangkat");
		choice3.setText("Lanjut tidur");
		choice4.setText("");
	}
	public void langsungBerangkat(){
		position = "langsungBerangkat";
		mainTextArea.setText("Kamu berlari tergesa-gesa.");
		kampusTercinta();
	}
	public void mandiDulu(){
		position = "mandiDulu";
		mainTextArea.setText("Kamu memilih mandi terlebih dahulu, membuat mu makin terlambat.\nAstaga dragon aku terlambat \n(Your score -1)");
		playerScore = playerScore -1;
		scoreLabelNumber.setText(""+playerScore);
		kampusTercinta();
	}
	public void lanjutTidur(){
		position = "lanjutTidur";
		ending2();
	}
	
	public void kampusTercinta(){
		position = "kampusTercinta";
		mainTextArea.setText("Kamu sudah berada di kampus. Kamu bisa memilih kembali atau lanjut ke kampus.\\n\\n");
		choice1.setText("Kampus");
		choice2.setText("Kembali");
		choice3.setText("");
	}
	public void kampus() {
		position = "kampus";
		kelasTercinta();
	}
	public void kembali() {
		position = "kembali";
		kosKosan2();
	}
	public void kosKosan2() {
		position = "kosKosan2";
		mainTextArea.setText("Kamu memilih untuk kembali ke kosan.\nDan ternyata kamu mendapati bahwa buku tugas mu masih belum di bawa tadi.\nKamu bersyukur karena kembali dan mengambil buku tugasnya.\\n\\n");
		bukuTugas = 1;
	}
	
	public void kelasTercinta() {
		position = "kelasTercinta";
		mainTextArea.setText("Kamu sudah sampai di kelas, seketika seisi kelas melihatmu\nDosen: kenapa kamu terlambat? \nApa yang akan kamu lakukan?\n\n");
		choice1.setText("Langsung duduk, tidak menjawab");
		choice2.setText("Menjawab");
	}
	public void duduk() {
		position = "duduk";
		mainTextArea.setText("Kamu memilih untuk langsung duduk, dengan tidak menjawab.\nADosen mu tidak suka dengan perilaku mu. \n(Your score -1)");
		playerScore = playerScore -1;
		scoreLabelNumber.setText(""+playerScore);
		tugas();
	}
	public void jawab() {
		position = "jawab";
		mainTextArea.setText("Kamu menjawab dengan jujur\n Dosen: Baik, lainkali jangan di ulang, punya hp di pake buat alarm.");
		tugas();
	}
	
	public void tugas() {
		position = "tugas";
		mainTextArea.setText("Saatnya Pengumpulan Tugas.\n Dosen: Baiklah anak-anak, jadi hari ini jangan lupa untuk mengumpulkan tugas yang minggu kemarin saya sudah sampaikan. \nDosen: Karena ini merupakan tugas besar, jadi ini akan sangat berpengaruh dengan nilai akhir kalian, Saya tidak akan memberikan toleransi apapun."
				+ "\nApa yang akan kamu lakukan?\n\n");
		choice1.setText("Maju kedepan, mengumpulkan tugas");
		choice2.setText("Membentak dan mengancam dosen");
	}
	public void maju() {
		position = "maju";
		choice1.setText(">");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
	}
	public void ancam() {
		position = "mengancam";
		ending3();
	}
	
	public void ending(){
		position = "ending";
		mainTextArea.setText("Dosen: performa belajar mu hari ini bagus sekali, saya ucapkan selamat untuk kamu.\nKamu lulus mata kuliah dan tidak akan mengulang semester depan...\n\n");
		
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice1.setVisible(false);
		choice2.setVisible(false);
		choice3.setVisible(false);
		choice4.setVisible(false);
	}
	public void ending2(){
		position = "ending2";
		mainTextArea.setText("Kamu memilih untuk lanjut tidur dan tidak pergi kuliah.\nKarena ternyata hari ini ada penilaian besar dan kamu tidak masuk..."
				+ "\n Kamu terpaksa untuk mengulang mata kuliah semester depan...\nOrang tua mu sangat kecewa denganmu, dasar anak goblok!\nGAME OVER\n\n");
		
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice1.setVisible(false);
		choice2.setVisible(false);
		choice3.setVisible(false);
		choice4.setVisible(false);
	}
	public void ending3(){
		position = "ending3";
		mainTextArea.setText("Performa belajar mu sangat buruk.\nKamu mendapat nilai yang rendah..."
				+ "\n Kamu terpaksa untuk mengulang mata kuliah semester depan...\nOrang tua mu sangat kecewa denganmu, dasar anak goblok!\nGAME OVER\n\n");
		
		choice1.setText("");
		choice2.setText("");
		choice3.setText("");
		choice4.setText("");
		choice1.setVisible(false);
		choice2.setVisible(false);
		choice3.setVisible(false);
		choice4.setVisible(false);
	}



	
	
	
		
	
	
	
	public class TitleScreenHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			createGameScreen();
		}
	}
	public class ChoiceHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			String yourChoice = event.getActionCommand();
			
			switch(position){
			case "kosKosan":
				switch(yourChoice){
				case "c1": langsungBerangkat();break;
				case "c2": mandiDulu();break;
				case "c3": ending2();break;
				}
				break;
			case "langsungBerangkat":
				switch(yourChoice){
				case "c1": kampusTercinta(); break;
				}
				break;
			case "mandiDulu":
				switch(yourChoice){
				case "c1": kampusTercinta(); break;
				}
				break;
				
			case "kampusTercinta":
				switch(yourChoice) {
				case "c1": kampus(); break;
				case "c2": kembali(); break;
				}
				break;
			case "kampus":
				switch(yourChoice) {
				case "c1": kelasTercinta(); break;
				}
				break;
			case "kembali":
				switch(yourChoice) {
				case "c1": kosKosan2(); break;
				}
				break;
			case "kosKosan2":
				switch(yourChoice) {
				case "c1" : kelasTercinta(); break;
				}
				break;
				
			case "kelasTercinta":
				switch(yourChoice) {
				case "c1": duduk(); break;
				case "c2": jawab(); break;
				}
				break;
			case "duduk":
				switch(yourChoice) {
				case "c1": tugas(); break;
				}
				break;
			case "jawab":
				switch(yourChoice) {
				case "c1": tugas(); break;
				}
				break;
				
			case "tugas":
				switch(yourChoice) {
				case "c1": maju(); break;
				case "c2": ending3(); break;
				}
				break;
			case "maju":
				switch(yourChoice) {
				case "c1":
					if(bukuTugas==1){
						ending();
					}
					else{
						ending3();
					}
					break;
				}
				break;
				}
			}
		}
	}