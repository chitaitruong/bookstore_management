/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ban_vpp_nha_sach_pn;

import com.barcodelib.barcode.Linear;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Account {
    public static String generateOTP()
    {
        int randomPin   =(int) (Math.random()*9000)+1000;
        String otp  = String.valueOf(randomPin);
        return otp;
    }
    static String getNumericString(int n)
    {
  
        // chose a Character random from this String
        String NumericString = "0123456789";
  
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
  
        for (int i = 0; i < n; i++) {
  
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                = (int)(NumericString.length()
                        * Math.random());
  
            // add Character one by one in end of sb
            sb.append(NumericString
                          .charAt(index));
        }
        return sb.toString();
    }
    public static boolean isNumeric(String number)
    {
        boolean check = true;
        check = number.matches("\\d+(\\.\\d+)?");
        return check;
    }
    public static boolean isInteger(String number)
    {
        boolean check = true;
        check = number.matches("\\d+");
        return check;
    }
    public static String generateCode(int num,int size)
    {
        String result=String.valueOf(num);
        while (result.length()<size)
            result="0"+result;
        return result;
    }
    public static String dateToString(Date date,String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String strDate = sdf.format(date);
        return strDate;
    }
    public static void generateBarcode(String data){
        try{
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
            JOptionPane.showMessageDialog(null, "Tạo barcode thành công.");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Tạo barcode thất bại!");
            e.printStackTrace();
        }
        
    }
}
