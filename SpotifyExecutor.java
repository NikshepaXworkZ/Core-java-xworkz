class SpotifyExecutor{
	public static void main(String songs[]){
		Spotify spotify=new Spotify();
		spotify.addSongs("Arala Mallige");
		spotify.addSongs("Ra Ra Rakkamma");
		spotify.addSongs("Exam Song");
		spotify.addSongs("Minchagi Neenu");
		spotify.addSongs("Belakina Kavithe");
		spotify.addSongs("Singara Siriye");
		spotify.addSongs("Ondu Malebillu");
		spotify.addSongs("Eradu Jadeyannu");
		spotify.addSongs("Cheluve Ondu Kelthini");
		spotify.addSongs("Yenammi Yenammi");
		spotify.addSongs("Nannavale Nannavale");
		
		spotify.getSongNames();
	}
}