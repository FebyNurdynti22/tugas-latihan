public class MainBalok 
{
	public static void main(String[] ar)
	{
	
		Balok b = new Balok(); //Membuat objek b dari class Balok / instansiasi
		b.setPanjang(10); //Memberikan nilai method setPanjang
		b.setLebar(20); //Memberikan nilai method setLebar
		b.setTinggi(10);//Memberikan nilai method setTinggi
		
		System.out.println("======================================");
		System.out.println("Panjang : " + b.getPanjang()); //Mengambil nilai dari method getPanjang
		System.out.println("Lebar : " + b.getLebar()); //Mengambil nilai dari method getLebar
		System.out.println("Tinggi : " + b.getTinggi()); //Mengambil nilai dari method getTinggi
		System.out.println("=======================================");
		System.out.println("Volume Balok : " + b.getVoume()); //Mengambil nilai dari method getVolume
		System.out.println("Luas Permukaan Balok : " + b.getLuasPemukaan()); //Mengambil nilai dari method getLuasPemukaan
		
	
	}
	
}
