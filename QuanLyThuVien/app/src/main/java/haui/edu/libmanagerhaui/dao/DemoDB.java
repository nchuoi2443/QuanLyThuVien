package haui.edu.libmanagerhaui.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import haui.edu.libmanagerhaui.database.DbHelper;
import haui.edu.libmanagerhaui.model.ThanhVien;
import haui.edu.libmanagerhaui.model.ThuThu;

public class DemoDB {
    private SQLiteDatabase db;
    ThanhVienDAO thanhVienDAO;
    ThuThuDAO thuThuDAO;
    static final  String TAG = "//=========";
    public DemoDB(Context context) {
        DbHelper dbHelper = new DbHelper(context);
        db = dbHelper.getWritableDatabase();
        thanhVienDAO = new ThanhVienDAO(context);
        thuThuDAO = new ThuThuDAO(context);
    }
    public void thanhVien(){
        ThanhVien tv = new ThanhVien(1,"Nguyễn Đức Lương", "2003");
        thanhVienDAO.insert(tv);
        Log.i(TAG,"=====================");
        Log.i(TAG, "Tong so thanh vien: "+ thanhVienDAO.getAll().size());

//        Log.i(TAG,"==========sau khi sua===========");
//        tv = new ThanhVien(1,"Long 11", "2003");
//        thanhVienDAO.update(tv);
//        Log.i(TAG, "Tong so thanh vien: "+ thanhVienDAO.getAll().size());

//        thanhVienDAO.delete("2");
//        Log.i(TAG,"==========sau khi xoa===========");
//        Log.i(TAG, "Tong so thanh vien: "+ thanhVienDAO.getAll().size());
    }
    public void thuThu(){
        Log.i(TAG,"===========THEM==========");
        ThuThu tt = new ThuThu("admin1", "Nguyen Van Admin", "admin123" );
        thuThuDAO.insert(tt);
        Log.i(TAG, "Tong so thu thu: "+ thuThuDAO.getAll().size());

        Log.i(TAG,"===========SUA==========");
        tt = new ThuThu("admin1", "Nguyen Admin", "123456");
        thuThuDAO.updatePass(tt);
        Log.i(TAG, "Tong so thu thu: "+ thuThuDAO.getAll().size());

//        Log.i(TAG,"===========XOA==========");
//        thuThuDAO.delete("1");
//        Log.i(TAG, "Tong so thu thu: "+ thuThuDAO.getAll().size());

        if(thuThuDAO.checkLogin("admin", "123456") >0){
            Log.i(TAG,"Dang nhap thanh cong");
        }

    }
}
