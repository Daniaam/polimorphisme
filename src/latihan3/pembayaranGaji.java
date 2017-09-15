package latihan3;
public class pembayaranGaji {
    public int hitunganGaji(pegawai peg){
    int uang=peg.gaji();
    if(peg instanceof direktur)
        uang+=((direktur)peg).tunjangan();
    if(peg instanceof staff)
        uang+=((staff)peg).Bonus();
    return uang;
    }
    public static void main(String[] args){
    pembayaranGaji pg=new pembayaranGaji();
    staff ali=new staff();
    direktur tony=new direktur();
    System.out.println("Gaji yang dibayarkan staff ="+pg.hitunganGaji(ali));
    System.out.println("gaji yang dibayarkan kepada direktur ="+pg.hitunganGaji(tony));
    }
}
