package pregunta2;

public class RedditSharerAdapter implements Sharing{

	RedditPoster poster;
	
	public RedditSharerAdapter() {
		this.poster = new RedditPoster();
	}
	@Override
	public void share(String message) {
		this.poster.post(message);
	}

	
}
