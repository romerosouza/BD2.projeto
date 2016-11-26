package moldel;
public class Link {
	private int idLink;
	private String link;
	
	public Link(int idLink, String link) {
		this.idLink = idLink;
		this.link = link;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getIdLink() {
		return idLink;
	}

	@Override
	public String toString() {
		return "Link [link=" + link + "]";
	}
		
}
