import org.junit.Test;
import static org.junit.Assert.*;

public class PhanSoTest {

    @Test //Đây là một chú thích (annotation) sử dụng trong JUnit để chỉ ra rằng phương thức tiếp theo là một phương thức kiểm thử.

    public void testCong() { //Khai báo một phương thức kiểm thử, trong trường hợp này là phương thức testCong() để kiểm tra phép tính cộng.
    
        PhanSo ps1 = new PhanSo(3, 0);  
    
        PhanSo ps2 = new PhanSo(1, 3); 
    
        PhanSo ketQua = ps1.cong(ps2);  //Thực hiện phép tính cộng giữa hai phân số ps1 và ps2, kết quả được lưu vào đối tượng ketQua.
    
        assertEquals(ketQua.getTuSo(),11); 
    
        assertEquals(ketQua.getMauSo(), 6);
    
    }
    // Các phương thức kiểm thử testTru(), testNhan(), testChia(), testBangNhau() và testToString()
    //  cũng được thực hiện tương tự như phương thức testCong(), nhưng sử dụng các phép tính trừ, nhân, chia, so sánh bằng nhau và chuyển đổi thành chuỗi (toString)
    //   thay vì phép tính cộng.
    
    @Test
    public void testTru() {
        PhanSo ps1 = new PhanSo(1, 2);
        PhanSo ps2 = new PhanSo(1, 3);
        PhanSo ketQua = ps1.tru(ps2);
        assertEquals(ketQua.getTuSo(), 1);
        assertEquals(ketQua.getMauSo(), 6);
    }

    @Test
    public void testNhan() {
        PhanSo ps1 = new PhanSo(1, 2);
        PhanSo ps2 = new PhanSo(1, 3);
        PhanSo ketQua = ps1.nhan(ps2);
        assertEquals(ketQua.getTuSo(), 1);
        assertEquals(ketQua.getMauSo(), 6);
    }

    @Test
    public void testChia() {
        PhanSo ps1 = new PhanSo(1, 2);
        PhanSo ps2 = new PhanSo(1, 3);
        PhanSo ketQua = ps1.chia(ps2);
        assertEquals(ketQua.getTuSo(), 3);
        assertEquals(ketQua.getMauSo(), 2);
    }

    @Test
    public void testBangNhau() {
        PhanSo ps1 = new PhanSo(1, 2);
        PhanSo ps2 = new PhanSo(2, 4);
        PhanSo ps3 = new PhanSo(2, 3);
        assertTrue(ps1.bangNhau(ps2));
        assertFalse(ps1.bangNhau(ps3));
    }

    @Test
    public void testToString() {
        PhanSo ps1 = new PhanSo(1, 2);
        assertEquals(ps1.toString(), "1/2");
    }
}
