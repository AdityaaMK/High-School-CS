public class ScienceFictionBook extends Book
{
	private boolean nebula;
	private boolean hugo;
	private boolean bradbury;
	public ScienceFictionBook(String a, String t, String d, boolean n, boolean h, boolean b)
	{
		super(a,t,d);
		nebula=n;
		hugo=h;
		bradbury=b;
	}
	public boolean wonNebula()
	{
		return nebula;
	}
	public boolean wonHugo()
	{
		return hugo;
	}
	public boolean wonBradbury()
	{
		return bradbury;
	}
}