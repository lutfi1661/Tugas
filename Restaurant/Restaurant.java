package Restaurant;

public class Restaurant {
	private  String[]  nama_makanan; 
	private  double[]  harga_makanan; 
	private int[] stok;
	public static byte id = 0;

	public Restaurant() { 
		setNama_makanan(new String[10]); 
		setHarga_makanan(new double[10]); 
		setStok(new int[10]);
	}

	public String[] getNama_makanan() {
		return  nama_makanan;
	}

	public void setNama_makanan(String[] nama_makanan) {
		this.nama_makanan  =  nama_makanan;
	}

	public double[] getHarga_makanan() {
		return  harga_makanan;
	}

	public void setHarga_makanan(double[] harga_makanan) {
		this.harga_makanan  =  harga_makanan;
	}

	public int[] getStok() {
		return stok;
	}

	public void setStok(int[] stok) {
		this.stok = stok;
	}
	
	public static void nextId() {
		id++;
	}
	
	public  void  tambahMenuMakanan(String  nama,  double  harga,  int
	stok) {
		this.nama_makanan[id]  =  nama; 
		this.harga_makanan[id]  =  harga; 
		this.stok[id] = stok;

	}

	public void tampilMenuMakanan(){
		for(int  i  =0;  i<=id;i++){
			if(!isOutOfStock(i)){
				System.out.println(nama_makanan[i] + "["+stok[i]+"]"+"\tRp.  " + harga_makanan[i]);
			}
		}
	}

	private boolean isOutOfStock(int i) {
		if( stok[id] == 0) {
			return true;
		}else {
			return false;
		}
	}
}
