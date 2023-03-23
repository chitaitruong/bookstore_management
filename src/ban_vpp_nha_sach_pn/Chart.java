/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ban_vpp_nha_sach_pn;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartUtils;

public class Chart extends JFrame {
    private String urlHinh;
    private String titleBD="THỐNG KÊ DOANH THU";
    public static ArrayList<Vector> ds;

    public ArrayList<Vector> getDs() {
        return ds;
    }

    public void setDs(ArrayList<Vector> ds) {
        this.ds = ds;
    }
    
    public String getUrlHinh() {
        return urlHinh;
    }
    public void setUrlHinh(String urlHinh) {
        this.urlHinh = urlHinh;
    }

    public String getTitleBD() {
        return titleBD;
    }

    public void setTitleBD(String titleBD) {
        this.titleBD = titleBD;
    }
    
    public Chart() {
        
        initUI();
    }

    private void initUI() {

        XYDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        add(chartPanel);
        setIconImage(new ImageIcon("D:\\Java\\Ban_VPP_Nha_Sach_PN\\src\\ban_vpp_nha_sach_pn\\logo_mini.jpg").getImage());
        pack();
        setTitle("Line chart");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private XYDataset createDataset() {
        var dataset = new XYSeriesCollection();
        Vector tam=ds.get(0);
        if (tam.get(0).equals("Doanh thu"))
        {
            for (int i=0;i<4;i++)
            {
                Vector x=ds.get(i);
                var series = new XYSeries((String)x.get(0));
                series.add(1, (long)x.get(1));
                series.add(2, (long)x.get(2));
                series.add(3, (long)x.get(3));
                series.add(4, (long)x.get(4));
                series.add(5, (long)x.get(5));
                series.add(6, (long)x.get(6));
                series.add(7, (long)x.get(7));
                series.add(8, (long)x.get(8));
                series.add(9, (long)x.get(9));
                series.add(10, (long)x.get(10));
                series.add(11, (long)x.get(11));
                series.add(12, (long)x.get(12));
                dataset.addSeries(series);
            }
        } else
        {
            for (int i=0;i<ds.size();i++)
            {
                Vector x=ds.get(i);
                var series = new XYSeries((String)x.get(0));
                series.add(1, (long)x.get(1));
                series.add(2, (long)x.get(2));
                series.add(3, (long)x.get(3));
                series.add(4, (long)x.get(4));
                series.add(5, (long)x.get(5));
                series.add(6, (long)x.get(6));
                series.add(7, (long)x.get(7));
                series.add(8, (long)x.get(8));
                series.add(9, (long)x.get(9));
                series.add(10, (long)x.get(10));
                series.add(11, (long)x.get(11));
                series.add(12, (long)x.get(12));
                dataset.addSeries(series);
            }
        }
        return dataset;
    }

    private JFreeChart createChart(XYDataset dataset) {

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Doanh thu và lợi nhuận",
                "Tháng",
                "Số tiền (vnđ)",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        XYPlot plot = chart.getXYPlot();

        var renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);

        chart.getLegend().setFrame(BlockBorder.NONE);

        chart.setTitle(new TextTitle(titleBD,
                        new Font("Serif", java.awt.Font.BOLD, 18)
                )
        );

        return chart;
    }
    public void inBieuDo(String url,int width,int height){
        try{
            ChartUtils.saveChartAsPNG(new File(url), createChart(createDataset()), 450, 400);
            JOptionPane.showMessageDialog(null, "In biểu đồ thành công.");
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Lỗi! In biểu đồ không thành công!");
            e.printStackTrace();
        }
    }
}
