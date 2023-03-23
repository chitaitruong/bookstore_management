
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ban_vpp_nha_sach_pn;

import ban_vpp_nha_sach_pn.TaiKhoan.QuenMatKhau;
import com.barcodelib.barcode.Linear;
import java.awt.Font;
import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.TimeZone;
import javax.swing.JFrame;
/**
 *
 * @author ASUS
 */
import java.util.Calendar;
import java.util.HashSet;
import java.util.Scanner;
import java.util.UUID;
import java.util.Vector;
import org.mindrot.jbcrypt.BCrypt;
public class Ban_VPP_Nha_Sach_PN {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException, NoSuchAlgorithmException, Exception {
        // TODO code application logic here
//        Connection conn=ConnectionUtils.getSQLServerConnection();
//        java.util.Date date=new java.util.Date();
//        java.sql.Date sqlDate=new java.sql.Date(date.getTime());
//        java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
//        System.out.print(sqlTime);
////        PreparedStatement ps=conn.prepareStatement("insert into test values(?,?)");
////        ps.setDate(1,sqlDate);
////        ps.setTimestamp(2,sqlTime);
////        ps.executeUpdate();
////        ps.close();
//        conn.close();
        String data="10";
        Linear barcode = new Linear();
        barcode.setType(Linear.CODE128);
        // barcode data to encode
        barcode.setData(data);

        // unit of measure for X, Y, LeftMargin, RightMargin, TopMargin, BottomMargin
        barcode.setUOM(Linear.UOM_PIXEL);
        // barcode module width in pixel
        barcode.setX(3f);
        // barcode module height in pixel
        barcode.setY(75f);

        barcode.setLeftMargin(0f);
        barcode.setRightMargin(0f);
        barcode.setTopMargin(0f);
        barcode.setBottomMargin(0f);
        // barcode image resolution in dpi
        barcode.setResolution(72);

        // disply human readable text under the barcode
        barcode.setShowText(true);
        // human reable text font style
        barcode.setTextFont(new Font("Arial", 0, 12));
        //  ANGLE_0, ANGLE_90, ANGLE_180, ANGLE_270
        barcode.setRotate(Linear.ANGLE_0);

        barcode.renderBarcode("anh_barcode_vp\\"+data+".jpg");
    }
    
}
