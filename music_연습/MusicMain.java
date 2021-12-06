package music_연습;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;


public class MusicMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player();
		
		ArrayList<Music> musicList = new ArrayList<Music>();
		musicList.add(new Music("깡","Rain",100,"C://music/Rain - 깡.mp3"));
		musicList.add(new Music("Dalla Dalla","Itzy",120,"C://music/Itzy - Dalla Dalla.mp3"));
		musicList.add(new Music("SOLO","JENNIE",200,"C://music/JENNIE - SOLO.mp3"));
		
		int startEnd = 0;
		int i = 0;
		
		while (startEnd != 5) {
			
			System.out.print("[ 1. 재생 2. 정지 3. 다음곡 4. 이전곡 5. 종료 ] ");
			startEnd = sc.nextInt();
			switch(startEnd) {
				case 1 :
					musicList.get(i).show();
					mp3.play(musicList.get(i).getPath());
					break;
				case 2 :
					System.out.println("정지");
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
					System.out.println(" << 프로그램 종료 >> ");
					break;
					
			}
		}
		sc.close();
	}

}
