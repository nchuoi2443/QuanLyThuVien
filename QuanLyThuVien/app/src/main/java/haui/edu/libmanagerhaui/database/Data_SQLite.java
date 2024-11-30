package haui.edu.libmanagerhaui.database;

public class Data_SQLite {
    public static final String INSERT_THUTHU = "insert into ThuThu(MaTT, HoTen, MatKhau) values" +
            "('admin1', 'Nguyen admin','111111')," +
            "('longpt', 'Nguyen Văn Long','222222')," +
            "('namtt', 'Tran Tuan Nam','333333')," +
            "('phunq', 'Nguyen Que Phu','444444')," +
            "('huynv', 'Nguyen Van Huy','555555')";
    public static final String INSERT_THANHVIEN = "insert into ThanhVien(hoTen, namSinh) values" +
            "('Hoàng Văn Ái','2003')," +
            "('Đặng Phan Anh','2003')," +
            "('Ngô Doãn Anh','2003')," +
            "('Nguyễn Ngọc Hải Anh','2003')," +
            "('Nguyễn Văn Việt Anh','2003')," +
            "('Ngọ Công Bình','2003')," +
            "('Nguyễn Đức Bình','2003')," +
            "('Phạm Đình Bình','2003')," +
            "('Nguyễn Khắc Cảnh','2003')," +
            "('Nguyễn Thị Kim Chi','2003')," +
            "('Phùng Quang Chiến','2003')," +
            "('Nguyễn Đức Chung','2003')," +
            "('Võ Mạnh Cường','2003')," +
            "('Phạm Tiến Đạt','2003')," +
            "('Lê Quý Độ','2003')," +
            "('Đỗ Văn Doanh','2003')," +
            "('Đoàn Văn Du','2003')," +
            "('Lã Văn Đức','2003')," +
            "('Nguyễn Anh Đức','2003')," +
            "('Nguyễn Hữu Đức','2003')," +
            "('Nguyễn Việt Đức','2003')," +
            "('Nguyễn Đăng Dũng','2003')," +
            "('Nguyễn Hữu Dũng','2003')," +
            "('Đinh Văn Dương','2003')," +
            "('Giàng Tùng Dương','2003')," +
            "('Đinh Văn Duy','2003')," +
            "('Nguyễn Duy','2003')," +
            "('Triệu Trường Giang','2003')," +
            "('Nguyễn Thanh Hà','2003')," +
            "('Đào Minh Hiếu','2003')";

    public static final String INSERT_LOAI_SACH = "insert into LoaiSach(tenLoai) values" +
            "('Truong Ngoai Ngu')," +
            "('Khoa CTPL')," +
            "('Khoa CNTT')," +
            "('Khoa Dien')," +
            "('Khoa CN O to')," +
            "('Khoa Du lich')," +
            "('Khoa Dien tu')";
    public static final String INSERT_SACH = "insert into Sach(tenSach, tacGia, giaThue, maLoai) values" +
            "('Word Power Made Easy','Norman Lewis','3000','1')," +
            "('English Grammar in Use','Raymond Murphy','3000','1')," +
            "('Fluent English: Perfect Natural Speech, Sharpen Your Grammar, Master Idioms, Speak Fluently','Barbara Raifsnider','3000','1')," +
            "('English Idioms in Use','Michael McCarthy và Felicity O Dell','3000','1')," +
            "('The Elements of Style','William Strunk Jr. và E.B. White','3000','1')," +
            "('Kinh tế Việt Nam: Nghiên cứu và Thực tiễn','Nguyễn Đình Đức','3000','2')," +
            "('Chính trị kinh tế Việt Nam','Phạm Quang Minh','3000','2')," +
            "('Kinh tế Việt Nam 30 năm đổi mới','Trần Thọ Đạt','3000','2')," +
            "('Chính trị kinh tế và phát triển Việt Nam','Nguyễn Văn Nghệ','3000','2')," +
            "('Kinh tế Việt Nam: Nhìn từ trong','Võ Quang Thành','3000','2')," +
            "('Clean Code: A Handbook of Agile Software Craftsmanship','Robert C. Martin','3000','3')," +
            "('The Pragmatic Programmer: Your Journey to Mastery','Dave Thomas and Andy Hunt','3000','3')," +
            "('Design Patterns: Elements of Reusable Object-Oriented Software','Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides','3000','3')," +
            "('The Phoenix Project: A Novel About IT, DevOps, and Helping Your Business Win','Gene Kim, Kevin Behr, and George Spafford','3000','3')," +
            "('Sapiens: A Brief History of Humankind','Yuval Noah Harari','3000','3')," +
            "('The Lean Startup: How Todays Entrepreneurs Use Continuous Innovation to Create Radically Successful Businesses','Eric Ries','3000','3')," +
            "('Code: The Hidden Language of Computer Hardware and Software','Charles Petzold','3000','3')," +
            "('Artificial Intelligence: A Modern Approach','Stuart Russell and Peter Norvig','3000','3')," +
            "('Cracking the Coding Interview: 189 Programming Questions and Solutions','Gayle Laakmann McDowell','3000','3')," +
            "('Steve Jobs','Walter Isaacson','3000','3')," +
            "('Introduction to Electric Machines and Drives','Paul C. Krause','3000','4')," +
            "('Electric Power Systems: A Conceptual Introduction','Alexandra von Meier','3000','4')," +
            "('Electricity and Magnetism','Edward M. Purcell','3000','4')," +
            "('Power System Analysis and Design','J. Duncan Glover, Thomas Overbye, and Mulukutla S. Sarma','3000','4')," +
            "('Electric Power Transformer Engineering','James H. Harlow','3000','4')," +
            "('Autonomous Vehicles: Opportunities, Strategies, and Disruptions','Christopher W. Mayer và Christof Spieler','3000','5')," +
            "('Driverless: Intelligent Cars and the Road Ahead','Hod Lipson và Melba Kurman','3000','5')," +
            "('Automotive Engineering: Lightweight, Functional, and Novel Materials','Brian Cantor, P. Grant, C. Johnston','3000','5')," +
            "('The Car Hackers Handbook: A Guide for the Penetration Tester','Craig Smith','3000','5')," +
            "('Autonomous Driving: Technical, Legal and Social Aspects','Markus Maurer, J. Christian Gerdes, Barbara Lenz, and Hermann Winner','3000','5')," +
            "('Into the Wild','Jon Krakauer','3000','6')," +
            "('Eat, Pray, Love','Elizabeth Gilbert','3000','6')," +
            "('A Walk in the Woods: Rediscovering America on the Appalachian Trail','Bill Bryson','3000','6')," +
            "('The Alchemist','Paulo Coelho','3000','6')," +
            "('Wild: From Lost to Found on the Pacific Crest Trail','Cheryl Strayed','3000','6')," +
            "('Microelectronic Circuits','Adel S. Sedra và Kenneth C. Smith','3000','7')," +
            "('The Art of Electronics','Paul Horowitz và Winfield Hill','3000','7')," +
            "('Electronic Devices and Circuit Theory','Robert L. Boylestad và Louis Nashelsky','3000','7')," +
            "('Practical Electronics for Inventors','Paul Scherz và Simon Monk','3000','7')," +
            "('Introduction to Electric Circuits','James A. Svoboda và Richard C. Dorf','3000','7')" +
            "";
    public static final String INSERT_PHIEU_MUON = "insert into PhieuMuon(MaTT,MaTV,MaSach,TienThue,Ngay,Trasach) values" +
            "('admin1','1','1','3000','2023/10/01',1)," +
            "('admin1','2','2','3500','2023/10/02',1)," +
            "('admin1','3','3','4000','2023/10/03',0)," +
            "('admin1','4','4','4500','2023/10/04',0)," +
            "('admin1','5','5','5000','2023/10/05',1)," +
            "('admin1','6','6','5500','2023/10/06',0)," +
            "('admin1','7','7','6000','2023/10/07',0)," +
            "('admin1','8','8','6500','2023/10/08',0)," +
            "('admin1','9','9','7000','2023/10/09',1)," +
            "('admin1','10','10','7500','2023/10/10',1)," +
            "('admin1','11','11','8000','2023/10/11',1)," +
            "('admin1','12','12','8500','2023/10/12',0)," +
            "('admin1','13','13','9000','2023/10/13',1)," +
            "('admin1','14','14','9500','2023/10/14',1)," +
            "('admin1','15','15','10000','2023/10/15',1)," +
            "('admin1','16','16','10500','2023/10/16',1)," +
            "('admin1','17','17','11000','2023/10/17',1)," +
            "('admin1','18','18','11500','2023/10/18',0)," +
            "('admin1','19','19','12000','2023/10/19',1)," +
            "('admin1','20','20','12500','2023/10/20',1)," +
            "('admin1','21','21','13000','2023/10/21',1)," +
            "('admin1','22','22','13500','2023/10/22',0)," +
            "('admin1','23','23','14000','2023/10/23',0)," +
            "('admin1','24','24','14500','2023/10/24',1)," +
            "('admin1','25','25','15000','2023/10/25',1)," +
            "('admin1','26','26','15500','2023/10/26',1)," +
            "('admin1','27','27','16000','2023/10/27',0)," +
            "('admin1','28','28','16500','2023/10/28',0)," +
            "('admin1','29','29','17000','2023/10/29',0)," +
            "('admin1','30','30','17500','2023/10/30',0)";

}
