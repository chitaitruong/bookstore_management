/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ban_vpp_nha_sach_pn;

/**
 *
 * @author ASUS
 */
public class VatPham {
    private String ma;
    private String ten;
    private int slt;//so luong ton
    private long giaBan;
    private String urlHinh;
    private boolean active ;
    private String kieuDang;
    private String dvt;
    private String kichThuoc;
    private String moTaNgan;
    private String moTaChiTiet;
    private String maNCC;//ma nha cung cap
    private String maTH;// ma thuong hieu
    private String maLoai;// ma loai

    public VatPham() {
    }

    public VatPham(String ma, String ten, int slt, long giaBan,String urlHinh, boolean active, String kieuDang, String dvt, String kichThuoc, String moTaNgan, String moTaChiTiet, String maNCC, String maTH, String maLoai) {
        this.ma = ma;
        this.ten = ten;
        this.slt = slt;
        this.giaBan = giaBan;
        this.urlHinh=urlHinh;
        this.active = active;
        this.kieuDang = kieuDang;
        this.dvt = dvt;
        this.kichThuoc = kichThuoc;
        this.moTaNgan = moTaNgan;
        this.moTaChiTiet = moTaChiTiet;
        this.maTH = maTH;
        this.maLoai = maLoai;
        this.maNCC=maNCC;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getUrlHinh() {
        return urlHinh;
    }

    public void setUrlHinh(String urlHinh) {
        this.urlHinh = urlHinh;
    }
    

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSlt() {
        return slt;
    }

    public void setSlt(int slt) {
        this.slt = slt;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getKieuDang() {
        return kieuDang;
    }

    public void setKieuDang(String kieuDang) {
        this.kieuDang = kieuDang;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    public String getMoTaNgan() {
        return moTaNgan;
    }

    public void setMoTaNgan(String moTaNgan) {
        this.moTaNgan = moTaNgan;
    }

    public String getMoTaChiTiet() {
        return moTaChiTiet;
    }

    public void setMoTaChiTiet(String moTaChiTiet) {
        this.moTaChiTiet = moTaChiTiet;
    }

    public String getMaTH() {
        return maTH;
    }

    public void setMaTH(String maTH) {
        this.maTH = maTH;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }
    
    
}
