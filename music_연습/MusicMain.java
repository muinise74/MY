package music_����;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;


public class MusicMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player();
		
		ArrayList<Music> musicList = new ArrayList<Music>();
		musicList.add(new Music("��","Rain",100,"C://music/Rain - ��.mp3"));
		musicList.add(new Music("Dalla Dalla","Itzy",120,"C://music/Itzy - Dalla Dalla.mp3"));
		musicList.add(new Music("SOLO","JENNIE",200,"C://music/JENNIE - SOLO.mp3"));
		
		int startEnd = 0;
		int i = 0;
		
		while (startEnd != 5) {
			
			System.out.print("[ 1. ��� 2. ���� 3. ������ 4. ������ 5. ���� ] ");
			startEnd = sc.nextInt();
			switch(startEnd) {
				case 1 :
					musicList.get(i).show();
					mp3.play(musicList.get(i).getPath());
					break;
				case 2 :
					System.out.println("����");
					mp3.stop();
					mp3.
					break;
				case 3 :
					i++;
					if (i >= musicList.size()) {
						i = i - musicList.size();
					}
					musicList.get(i).show();
					if (mp3.isPlaying()) {
						mp3.stop();
					}
					mp3.play(musicList.get(i).getPath());
					break;
				case 4 :
					i--;
					if (i < 0) {
						i = i + musicList.size();
					}
					musicList.get(i).show();
					if (mp3.isPlaying()) {
						mp3.stop();
					}
					mp3.play(musicList.get(i).getPath());
					break;
				case 5 :
					System.out.println(" << ���α׷� ���� >> ");
					break;
					
			}
		}
		sc.close();
	}

}
