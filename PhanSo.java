public class PhanSo {
    private int tuSo; // thuộc tính lưu trữ tử số của phân số
    private int mauSo; // thuộc tính lưu trữ mẫu số của phân số
    
    public PhanSo(int tuSo, int mauSo) { // phương thức khởi tạo với tham số truyền vào là tử số và mẫu số của phân số
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public PhanSo cong(PhanSo other) { // phương thức tính tổng với tham số truyền vào là phân số cần cộng với phân số hiện tại
        int tuSoMoi = this.tuSo * other.mauSo - other.tuSo * this.mauSo; // tính tử số mới của phân số tổng
        int mauSoMoi = this.mauSo * other.mauSo; // tính mẫu số mới của phân số tổng
        return new PhanSo(tuSoMoi, mauSoMoi); // trả về một đối tượng PhanSo mới với tử số và mẫu số mới tính được
    }
    
    public PhanSo tru(PhanSo other) { // phương thức tính hiệu với tham số truyền vào là phân số cần trừ với phân số hiện tại
        int tuSoMoi = this.tuSo * other.mauSo - other.tuSo * this.mauSo; // tính tử số mới của phân số hiệu
        int mauSoMoi = this.mauSo * other.mauSo; // tính mẫu số mới của phân số hiệu
        return new PhanSo(tuSoMoi, mauSoMoi); // trả về một đối tượng PhanSo mới với tử số và mẫu số mới tính được
    }
    
    public PhanSo nhan(PhanSo other) { // phương thức tính tích với tham số truyền vào là phân số cần nhân với phân số hiện tại
        int tuSoMoi = this.tuSo * other.tuSo; // tính tử số mới của phân số tích
        int mauSoMoi = this.mauSo * other.mauSo; // tính mẫu số mới của phân số tích
        return new PhanSo(tuSoMoi, mauSoMoi); // trả về một đối tượng PhanSo mới với tử số và mẫu số mới tính được
    }
    
    
    public PhanSo chia(PhanSo other) {
        int tuSoMoi = this.tuSo * other.mauSo; // tính tử số mới của phân số thương
        int mauSoMoi = this.mauSo * other.tuSo; // tính mẫu số mới của phân số thương
        return new PhanSo(tuSoMoi, mauSoMoi);    // trả về một đối tượng PhanSo mới với tử số và mẫu số mới tính được
    }
    public int getTuSo() { // phương thức trả về giá trị của thuộc tính tử số
        return tuSo;
    }
    
    public int getMauSo() { // phương thức trả về giá trị của thuộc tính mẫu số
        return mauSo;
    }
    
    public boolean bangNhau(PhanSo other) { // phương thức kiểm tra hai phân số có bằng nhau không
        return this.tuSo == other.tuSo && this.mauSo == other.mauSo;
    }
    
    public String toString() { // phương thức trả về chuỗi biểu diễn cho phân số
        return this.tuSo + "/" + this.mauSo;
    }
} 
    