package Game;

import java.util.Scanner;

public class Main {
	
	Scanner myScanner = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
	int playerHP;
	int playerScore;
	String playerName;
	String playerWeapon;
	String playerItem;
	int choice;
	int monsterHP;
	int silverRing;
	int bukuTugas;
		
	public static void main(String[] args) {

		Main dublin;
		dublin = new Main();	
		
		dublin.playerSetUp(); 	
		dublin.kosKosan();
	}
	
	public void playerSetUp(){
		
		System.out.println("Please enter your name:");
		playerName = myScanner.nextLine();
		System.out.println("Hello " + playerName + ", let's start the game!");
		
		playerScore = 10;
		System.out.println("Your Score: "+ playerScore);
		System.out.println("Your Item: "+ playerItem);	
	}
	
	
	
	
	
	
	
	
	
	public void kosKosan(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Kamu bangun kesiangan. ");
		System.out.println("");
		System.out.println("Apa yang akan kamu lakukan? ");
		System.out.println("");
		System.out.println("1: Langsung Berangkat, ga usah mandi");
		System.out.println("2: Mandi dulu, baru berangkat");
		System.out.println("3: Lanjut tidur");
		System.out.println("\n------------------------------------------------------------------\n");

		choice = myScanner.nextInt();
		
		if(choice==1){
			System.out.println(playerName + "Berlari tergesa-gesa");
			enterScanner.nextLine();
			kampusTercinta();
			}
		else if(choice==2){
			playerScore = playerScore-1;
			System.out.println("Kamu memilih mandi terlebih dahulu, membuat mu makin terlambat. ");
			System.out.println(playerName +": Astaga dragon aku terlambat \n(Your score -1)\n");
			System.out.println("Your Score: " + playerScore);
			enterScanner.nextLine();
			kampusTercinta();
			}
		else if(choice==3){
			ending2();
			}
		}
	
	public void kampusTercinta(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Kamu sudah berada di kampus. Kamu bisa memilih kembali atau lanjut ke kampus.\n\n");
		System.out.println("1: Kampus");
		System.out.println("2: Kembali");
		System.out.println("\n------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			kelasTercinta();
		}
		else if(choice==2){
			kosKosan2();
		}
	}
	
	public void kosKosan2(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Kamu memilih untuk kembali ke kosan.\n\n");
		System.out.println("Dan ternyata kamu mendapati bahwa buku tugas mu masih belum di bawa tadi.\n\n");
		System.out.println(playerName + "bersyukur karena kembali dan mengambil buku tugasnya.\n\n");
		playerItem = "Buku Tugas";
		System.out.println("Your Item: "+ playerItem);
		bukuTugas = 1;
		System.out.println("\n------------------------------------------------------------------\n");
		
		kelasTercinta();
	}
	
	public void kelasTercinta(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Kamu sudah sampai di kelas, seketika seisi kelas melihatmu...");
		System.out.println("Dosen: " + playerName + "kenapa kamu terlambat? ");
		System.out.println("");
		System.out.println("Apa yang akan kamu lakukan? ");
		System.out.println("");
		System.out.println("1: Langsung duduk, tidak menjawab");
		System.out.println("2: Menjawab");
		System.out.println("\n------------------------------------------------------------------\n");

		choice = myScanner.nextInt();
		
		if(choice==1){
			playerScore = playerScore-2;
			System.out.println("Kamu memilih untuk langsung duduk, dengan tidak menjawab. ");
			System.out.println("Dosen mu tidak suka dengan perilaku mu. ");
			System.out.println("\n(Your score -1)\n");
			System.out.println("Your score: " + playerScore);
			enterScanner.nextLine();
			tugas();
			
		}
		else if(choice==2){
			playerHP = playerHP-1;
			System.out.println(playerName + ": Saya bangun kesiangan pak...");
			System.out.println("Dosen: Baik, lainkali jangan di ulang, punya hp di pake buat alarm. ");
			System.out.println(playerName + ": Baik pak...saya minta maaf. ");
			enterScanner.nextLine();
			tugas();
		}
	}
	
	public void tugas(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Saatnya Pengumpulan Tugas. ");
		System.out.println("Dosen: Baiklah anak-anak, jadi hari ini jangan lupa untuk mengumpulkan tugas yang minggu kemarin saya sudah sampaikan. ");
		System.out.println("Dosen: Karena ini merupakan tugas besar, jadi ini akan sangat berpengaruh dengan nilai akhir kalian. ");
		System.out.println("Dosen: Saya tidak akan memberikan toleransi apapun. ");
		System.out.println("");
		System.out.println("Apa yang akan kamu lakukan? ");
		System.out.println("");
		System.out.println("1: Maju kedepan, mengumpulkan tugas");
		System.out.println("2: Membentak dan mengancam dosen");
		System.out.println("\n------------------------------------------------------------------\n");

		choice = myScanner.nextInt();
		
		if(choice==1){
			if(bukuTugas==1){
				playerScore = playerScore+5;
				System.out.println("Kamu merasa lega karena membawa buku tugas. ");
				System.out.println("Dosen mu merasa senang walaupun kamu terlambat, kamu tidak lupa dengan tugasmu. ");
				System.out.println("\n(Your score +5)\n");
				System.out.println("Your score: " + playerScore);
				enterScanner.nextLine();
				highScore();
			}
			else {
				playerScore = playerScore-5;
				System.out.println("Kamu ternyata lupa tidak membawa buku tugasmu.");
				System.out.println(playerName + ": Bajingan, buku tugas ku ketinggalan !");
				System.out.println("Dosenmu mendengar perkataanmu.");
				System.out.println("Dosen: Kamu ini sudah terlambat, tidak mengerjakan tugas pula !");
				System.out.println("Dosen: Saya tidak akan memberikan toleransi atas perilaku kamu ini !");
				System.out.println(playerName + ": Loh kok gitu pak !?");
				System.out.println("Kamu pun merasa panik.");
				System.out.println("Dosen: Saya tidak mau tau, pokoknya nilai kamu akan saya kurangi ! \\n(Your score -5)\\n");
				System.out.println("Your score: " + playerScore);
				enterScanner.nextLine();
				lowScore();
			}
			
			
		}
		else if(choice==2){
			playerScore = playerScore-10;
			System.out.println("Dosen: Yang tidak mengumpulkan tugas nanti akan saya kurangi nilainya. ");
			System.out.println(playerName + ": Jancok !!! saya ini sudah capek-capek mengerjakan !");
			System.out.println("Dosen: Kamu ngomong apa barusan ? ");
			System.out.println(playerName + ": Tidak bisa memberi toleransi...bapak ini manusia apa bukan ? ");
			System.out.println("Dosen: Loh kamu kok mengatur cara saya mengajar ? ");
			System.out.println("Dosen: Saya tidak suka dengan perilaku mu, saya akan mengambil tindakan tegas \\\\n(Your score -10)\\\\n");
			System.out.println("Your score: " + playerScore);
			enterScanner.nextLine();
			lowScore();
		}
	}
	
	public void lowScore(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Nilai mu sudah tidak bisa tertolongkan.");
		System.out.println("\n------------------------------------------------------------------\n");
		ending3();
		
	}
	
	public void highScore(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Nilai mu sangat memuaskan");
		ending1();
	}
	
	public void ending1(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Dosen: performa belajar mu hari ini bagus sekali. ");
		System.out.println("Dosen: saya ucapkan selamat untuk kamu. ");
		System.out.println(playerName + "lulus mata kuliah dan tidak akan mengulang semester depan...");
		System.out.println("Orang tua mu sangat bangga denganmu, mereka memberimu cilok sebagai hadiah. ");
		System.out.println("\n\n           THE END                    ");
		System.out.println("\n------------------------------------------------------------------\n");
	}
	public void ending2(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Kamu memilih untuk lanjut tidur dan tidak pergi kuliah. ");
		System.out.println("Karena ternyata hari ini ada penilaian besar dan kamu tidak masuk...");
		System.out.println(playerName + "Terpaksa untuk mengulang mata kuliah semester depan...");
		System.out.println("Orang tua mu sangat kecewa denganmu, dasar anak goblok!");
		System.out.println("\n\n           GAME OVER                    ");
		System.out.println("\n------------------------------------------------------------------\n");
	}
	public void ending3(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Performa belajar mu sangat buruk. ");
		System.out.println("Kamu mendapat nilai yang rendah...");
		System.out.println(playerName + "Terpaksa untuk mengulang mata kuliah semester depan...");
		System.out.println("Orang tua mu sangat kecewa denganmu, dasar anak goblok!");
		System.out.println("\n\n           GAME OVER                    ");
		System.out.println("\n------------------------------------------------------------------\n");
	}
}