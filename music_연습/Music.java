package music_연습;

public class Music {
	
	private String musicName;
	private String singer;
	private int playTime;
	private String path;
	
	public Music(String musicName, String singer, int playTime) {
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
	}
	
	public Music(String musicName, String singer, int playTime, String path) {
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}

	public String getMusicName() {
		return musicName;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}
	
	public String getPath() {
		return path;
	}
	
	public void show() {
		System.out.printf("재생 >> [%s - %s(%d:%02d)]\n",musicName,singer,playTime/60,playTime%60);
	}
}
