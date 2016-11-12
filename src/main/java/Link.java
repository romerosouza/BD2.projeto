public class Link {
	private int idLink;
	private String link;
	private int idProjeto;
	
	public Link(int idLink, String link, int idProjeto) {
		this.idLink = idLink;
		this.link = link;
		this.idProjeto = idProjeto;
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

	public int getIdProjeto() {
		return idProjeto;
	}

	@Override
	public String toString() {
		return "Link [link=" + link + "]";
	}
		
}
