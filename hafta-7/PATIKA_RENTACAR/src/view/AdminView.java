package view;

import business.BrandManager;
import entity.Brand;
import entity.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class AdminView extends Layout{
    private JPanel comtainer;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JTabbedPane tab_menu;
    private JButton btn_logout;
    private JPanel pnl_brand;
    private JScrollPane scl_brand;
    private JTable tbl_brand;
    private User user;
    private DefaultTableModel tmdl_brand = new DefaultTableModel();
    private BrandManager brandManager;
    private JPopupMenu brandMenu;


    public AdminView(User user){
        this.brandManager = new BrandManager();
        this.add(comtainer);
        this.guiInitilaze(1000,500);
        this.user = user;
        if (this.user == null){
            dispose();
        }
        this.lbl_welcome.setText("Hosgeldiniz : " +this.user.getUsername());

        loadBrandTable();
        this.tbl_brand.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int selected_row = tbl_brand.rowAtPoint(e.getPoint());
                tbl_brand.setRowSelectionInterval(selected_row,selected_row);
            }
        });


        this.brandMenu = new JPopupMenu();
        this.brandMenu.add("Yeni").addActionListener(e -> {
            BrandView brandView = new BrandView(null);
            brandView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBrandTable();
                }
            });
        });

        this.brandMenu.add("Guncelle").addActionListener(e -> {
            int selectBrandId = Integer.parseInt(tbl_brand.getValueAt(tbl_brand.getSelectedRow(),0).toString());
            BrandView brandView = new BrandView(this.brandManager.getById(selectBrandId));
            brandView.addWindowListener((new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBrandTable();
                }
            }));
        });
        this.brandMenu.add("Sil");

        this.tbl_brand.setComponentPopupMenu(brandMenu);

    }

    public void loadBrandTable(){
        Object[] col_brand = {"Marka ID", "Marka Adi"};
        ArrayList<Brand> brandList = this.brandManager.findAll();
        this.tmdl_brand.setColumnIdentifiers(col_brand);


        this.tbl_brand.setModel(this.tmdl_brand);
        this.tbl_brand.getTableHeader().setReorderingAllowed(false);
        this.tbl_brand.setEnabled(false);


        DefaultTableModel clearModel = (DefaultTableModel) tbl_brand.getModel();
        clearModel.setRowCount(0);
        for (Brand brand:brandList){
            Object[] obj = {brand.getId(),brand.getName()};
            this.tmdl_brand.addRow(obj);
        }


    }
}
