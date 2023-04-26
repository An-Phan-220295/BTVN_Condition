import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("Danh sách các bài test.");
		System.out.println("1. Nhập 2 số nguyên và tìm số nguyên lớn nhất.");
		System.out.println("2. Nhập 3 số nguyên và sắp xếp theo thứ tự tăng dần.");
		System.out.println("3. Nhập 3 số nguyên và chọn cách sắp xếp theo thứ tự tăng hoặc giảm dần.");
		System.out.println("4. Cách đọc một số nguyên có 2 chữ số.");
		System.out.println("5. Chào hỏi các thành viên của gia đình.");
		System.out.println("0. Thoát chương trình.");
		System.out.println();
		
		do {
			System.out.print("Vui lòng nhập lựa chọn từ 0 đến 5: ");
			int luaChon= input(0, 5);
			switch (luaChon) {
			case 1:
				System.out.println();
				System.out.println("Bạn đã chọn chương trình tìm số nguyên lớn nhất.");
				soNguyenLonNhat();
				break;
				
			case 2:
				System.out.println();
				System.out.println("Bạn đã chọn chương trình sắp xếp theo thứ tự tăng dần.");
				thuTuTangDan();
				break;
				
			case 3:
				System.out.println();
				System.out.println("Bạn đã chọn chương trình sắp xếp theo lựa chọn.");
				SapXepThuTuTheoLuaChon();
				break;
				
			case 4:
				System.out.println();
				System.out.println("Bạn đã chọn chương trình đọc một số nguyên có 2 chữ số.");
				Doc2SoNguyen();
				break;
				
			case 5:
				System.out.println();
				System.out.println("Bạn đã chọn chương trình chào hỏi các thành viên của gia đình");
				chaoHoi();
				break;
				
			case 0:
				System.out.println("Kết thúc chương trình.");
				System.exit(0);
			default:
				break;
			}
			System.out.println();
		}while(true);
	}

	public static void soNguyenLonNhat() {
		//Code đầu vào
		System.out.print("Nhập số nguyên M: ");
		int soM = input(Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		System.out.print("Nhập số nguyên N: ");
		int soN = input(Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		//Code xử lý
		int Max = soM;
		if (Max < soN)
			Max = soN;
		
		//Code đầu ra
		System.out.println("Vậy số lớn nhất là:"+ Max);
	}
	public static void thuTuTangDan() {
		//Khối đầu vào
		System.out.print("Nhập số thứ nhất: ");
		int sothuNhat = input(Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		System.out.print("Nhập số thứ hai: ");
		int sothuHai = input(Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		System.out.print("Nhập số thứ ba: ");
		int sothuBa = input(Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		int temp;
		
		//Khối xử lý
		if(sothuNhat>sothuHai){
			temp = sothuNhat;
			sothuNhat = sothuHai;
			sothuHai= temp;}
		
		if(sothuNhat>sothuBa){
			temp = sothuNhat;
			sothuNhat = sothuBa;
			sothuBa= temp;}
		
		if(sothuHai>sothuBa){
			temp = sothuHai;
			sothuHai = sothuBa;
			sothuBa= temp;}
			
		//Khối đầu ra
		System.out.println("Vậy thứ tự tăng dần 3 số là:"+sothuNhat+" "+sothuHai+" "+sothuBa);
	}
	public static void SapXepThuTuTheoLuaChon() {
		//Khối đầu vào
		System.out.print("Nhập số A: ");
		int soA = input(Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		System.out.print("Nhập số B: ");
		int soB = input(Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		System.out.print("Nhập số C: ");
		int soC = input(Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		System.out.print("Nhập lựa chọn sắp xếp, tăng chọn 1, giảm chọn 2: ");
		int luaChon = input(1,2);
		
		int temp;
		
		//Khối xử lý
		switch (luaChon) {
		case 1:
			
			if(soA>soB){
				temp = soA;
				soA = soB;
				soB= temp;}
			
			if(soA>soC){
				temp = soA;
				soA = soC;
				soC= temp;}
			
			if(soB>soC){
				temp = soB;
				soB = soC;
				soC= temp;}
			
			break;

		case 2:
		
			if(soA<soB){
				temp = soB;
				soB = soA;
				soA= temp;}
			
			if(soA<soC){
				temp = soC;
				soC = soA;
				soA= temp;}
			
			if(soB<soC){
				temp = soC;
				soC = soB;
				soB= temp;}
		
			break;
		
		default:
			break;
		}
		
		//Khối đầu ra
		System.out.println("Vậy thứ tự 3 số là:"+soA+" "+soB+" "+soC);

	}
	public static void Doc2SoNguyen() {
		//Khối đầu vào
		System.out.print("Vui lòng nhập một số nguyên 2 chữ số : ");
		int soA = input(-99,99);
		int temp = Math.abs(soA);
		//Khối xử lý
		
		int soDonVi =temp % 10;
		int soHangChuc = (temp - soDonVi) / 10;
		
		String donVi = "";
		String hangChuc = "";
		
		switch (soDonVi) {
		case 0:
			donVi = ""; 
			break;
			
		case 1:
			if (soDonVi == 1 & soHangChuc== 0 )
				donVi = "một"; 
			else
				donVi = "mốt"; 
			break;	
			
		case 2:
			donVi = "hai"; 
			break;
			
		case 3:
			donVi = "ba"; 
			break;
			
		case 4:
			donVi = "bốn"; 
			break;
			
		case 5:
			if (soDonVi == 5 & soHangChuc== 0 )
				donVi = "năm"; 
			else
				donVi = "lăm"; 
			break;
			
		case 6:
			donVi = "sáu"; 
			break;
			
		case 7:
			donVi = "bảy"; 
			break;
			
		case 8:
			donVi = "tám"; 
			break;
			
		case 9:
			donVi = "chín"; 
			break;
			
		default:
			break;
		}
		
		switch (soHangChuc) {
		case 0:
			hangChuc = "không"; 
			break;
			
		case 1:
			hangChuc = "mười"; 
			break;	
			
		case 2:
			hangChuc = "hai mươi"; 
			break;
			
		case 3:
			hangChuc = "ba mươi"; 
			break;
		case 4:
			hangChuc = "bốn mươi"; 
			break;
			
		case 5:
			hangChuc = "năm mươi"; 
			break;
			
		case 6:
			hangChuc = "sáu mươi"; 
			break;
			
		case 7:
			hangChuc = "bảy mươi"; 
			break;
			
		case 8:
			hangChuc = "tám mươi"; 
			break;
			
		case 9:
			hangChuc = "chín mươi"; 
			break;
			
		default:
			break;
		}
		//Khối đầu ra
		if (soA>0)
		System.out.println("Cách đọc số bằng chữ là: "+hangChuc+" "+donVi);
		if (soA<0)
		System.out.println("Cách đọc số bằng chữ là: âm "+hangChuc+" "+donVi);
	}
	public static void chaoHoi() {
		//Khối đầu vào
		Scanner scan = new Scanner(System.in);
		System.out.println("Xin chào! Cho hỏi ai đang sử dụng máy : ");
		System.out.println("Vui lòng điền vào Bố(B), Mẹ(M), Anh trai(A), hoặc Em gái(E)");
		
		//Lệnh scan ký tự.
		char thanhVien = scan.next().charAt(0);
		char temp = Character.toUpperCase(thanhVien);
		String loiChao = "";
				
		//Khối xử lý	
		switch (temp) {
		case 'B':
			loiChao = "Xin chào Ba";
			break;
			
		case 'M':
			loiChao = "Xin chào Mẹ";
			break;
			
		case 'A':
			loiChao = "Xin chào anh trai";
			break;
			
		case 'E':
			loiChao = "Xin chào em gái";
			break;
			
		default:
			System.out.println("Vui lòng điền vào B, M, A, hoặc E");
			break;}
		
		//Khối đầu vào
		System.out.println(loiChao);
	}
	public static int input(int m, int n) {
		int luaChon = 0;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				do 
				{
					luaChon = sc.nextInt();
					if(luaChon<m || luaChon>n)
					System.out.println("Thông tin nhập không hợp lệ. Vui lòng nhập từ "+m+ " đến "+ n);
					
				}while(luaChon<m || luaChon>n);
				break;
				
			} catch (InputMismatchException mme) {
				// TODO: handle exception
				System.out.println("Thông tin nhập không hợp lệ. Vui lòng nhập từ "+m+ " đến "+ n);
				sc.next();
			}
		}while (true);
		return luaChon;
	}
}
