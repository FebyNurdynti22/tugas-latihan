public class Balok extends PersegiPanjang //konsep inheritance java
{
	private int tinggi;
	
	public void setTinggi(int tinggi)
	{
		this.tinggi = tinggi; //memberikan nilai variabel tinggi dengan nilai yang ada di dalam parameter
	}
	
	public int getTinggi()
	{
		return tinggi; //memberikan nilai kembalian
	}
	
	public int getVoume()
	{
		return getPanjang() * getLebar() * getTinggi();  //Menghitung Volume dengan mengambil nilai dari masing masing method
	}
	
	public int getLuasPemukaan()
	{
		return 2 *(getPanjang() * getLebar() + getPanjang() * getTinggi() + getLebar() * getTinggi());//Menghitung Luas Pemukaan dengan mengambil nilai dari masing masing method
	}
}
