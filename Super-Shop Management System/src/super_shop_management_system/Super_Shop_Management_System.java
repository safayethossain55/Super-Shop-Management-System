
package super_shop_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class Super_Shop_Management_System {

   
    public static void main(String[] args) {
        
    JFrame j,j2,j3,j4,j5,j6;
            JLabel l1,l2,l3,l4,l5,l6,l7;
            JTextField tf1,tf2,tf3,tf4,tf5,text;
            JPasswordField p1,p2,value;
            JButton b1,b2,b3,b4,b5,b6,b7,b8;
            JRadioButton r1,r2;
            JTable tb1;
            JScrollPane sp;
            JPanel pn1,pn2;
            Font font,font2;
            JCheckBox   c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,
                        c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,
                        c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53,c54,c55,c56,
                        c57,c58,c59,c60,c61,c62,c63,c64,c65,c66,c67,c68,c69,c70,c71,c72,c73,c74,
                        c75,c76,c77,c78,c79,c80,c81,c82,c83,c84,c85,c86;
            
          
  //Frame      
           
            j=new JFrame("Super Shop Management System");
            j2=new JFrame("Super Shop Management System");
            j3=new JFrame("Super Shop Management System");
            j4=new JFrame("Super Shop Management System");
            j5=new JFrame("Super Shop Management System");
            j6=new JFrame("Super Shop Management System");

//Label
            l1=new JLabel("First Name:");
            l2=new JLabel("Last Name:");
            l3=new JLabel("E-mail:");
            l4=new JLabel("Create Password:");
            l5=new JLabel("Confirm Password:");
            l6=new JLabel("Username:");
            l7=new JLabel("Password:");
            
            


//TextField
            tf1=new JTextField();
            tf2=new JTextField();
            tf3=new JTextField();
            tf4=new JTextField();
            tf5=new JTextField();
           
            
//PasswordField
            p1=new JPasswordField();
            p2=new JPasswordField();
            p1.setBounds(450, 170, 250, 30);
            p2.setBounds(450, 210, 250, 30);
            value = new JPasswordField();   
            value.setBounds(350, 300, 250, 30);
            
//Table         
            
            font=new Font("TimesRoman",Font.PLAIN,14);
           String data[][]={{"01","Holud Gura(200gm)","Consumer","80"},
               {"02","Morich Gura(200gm)","Consumer","88"},
               {"03","Dhoniya Gura(100gm)","Consumer","30"},{"04","Zira Gura(100gm)","Consumer","80"},{"05","Gorom Mosla Gura","Consumer","55"},{"06","Pachforon Achta","Consumer","18"},
               {"07","Borhani Mosla","Consumer","30"},{"08","Sorishar Tel (500gm)","Consumer","115"},{"09","Biriyani Mosla (40gm)","Consumer","45"},{"10","Rost Mosla (35gm)","Consumer","50"},
               {"11","Kabab Mosla (50gm)","Consumer","85"},{"12","Radhuni Mangser Mosla(100gm)","Consumer","60"},{"13","Goru Mosla(100)","Consumer","60"},{"14","Murgi Mosla(100gm)","Consumer","55"},
               {"15","	Maser Mosla(100gm)","Consumer","45"},{"16","Chicken Tandori Mosla 50gm)","Consumer","75"},{"17","Halim Mix(200gm)","Consumer","45"},{"18","Kasundi (285gm)","Consumer","45"},
               {"19","Halim Mix(200gm)","Consumer","55"},{"20","Hair Removal Cream(25mg)","Cosmetics","75"},{"21","Neem Soap","Cosmetics","35"},{"22","Mango Screen Cream","Cosmetics","150"},{"23","Honey Rose Cream","Cosmetics","150"},
               {"24","Mesta Guard(30gm)","Cosmetics","115"},{"25","Soft rose water Glycerin","Cosmetics","100"},{"26","Soft Olive oil","Consumer","200"},{"27","Rupchada Oil(5L)","Consumer","540"},
               {"28","Rupchada Oil(2L)","Consumer","220"},{"29","Pushti Oil(4.5Ltr)","Consumer","530"},{"30","Leather Shoes100","Leather","580"},{"31","Leather Shoes111","Leather","565"},{"32","Leather Shoes103","Leather","520"},
               {"33","Leather Shoes112","Leather","310"} ,{"34","WhiteTon Face Powder(30gm)","Cosmetics","100"},{"35","WhiteTon Face Powder(50gm)","Cosmetics","155"},{"36","WhiteTon Face Powder(70gm)","Cosmetics","190"},{"37","Noborotno(100mg)","Cosmetics","150"},
               {"38","Noborotno(200mg)","Cosmetics","280"},{"39","Noborotno(300mg)","Cosmetics","330"},{"40","Party S P","Cosmetics","35"},{"41","Hot Ice","Cosmetics","250"},{"42","Marquris","Cosmetics","250"},{"43","Engage Spray","Cosmetics","350"},{"44","Fogg Body Spray","Cosmetics","250"},{"45","Math Wash(Siruini)","Cosmetics","280"},
               {"46","Moov Spray","Cosmetics","200"},{"47","Jhnsons baby Soa(50mg)","Cosmetics","75"},{"48","Johnsons Baby Soap(75mg)","Cosmetics","95"},{"49","Johnsons Baby Soap(150mg)","Cosmetics","120"},
               {"50","Johnsons Lotion(200ml)","Cosmetics","270"},{"51","Johnsons oil(100ml)","Cosmetics","195"},{"52","Johnsons oil(50ml)","Cosmetics","95"},
               {"53","Dove shampoo Nourishing Solution(180gm)","Cosmetics","190"},{"54","Dove shampoo Nourishing Solution(180gm)","Cosmetics","200"},{"55","Dove shampoo Hair Fall Rescue(180ML)","Cosmetics","190"},
               {"56","Dove Body Lotion(250ML)","Cosmetics","340"},{"57","Dove Body Lotion(300ML)","Cosmetics","145"},{"58","Sunsilk lusciously Thick & long Shampoo(180ml)","Cosmetics","145"},
               {"59","Sunsilk Stunning Black Shine Shampoo(180ml)","Cosmetics","145"},{"60","Sunsilk Perfect Straight Shampoo(375ml)","Cosmetics","245"},
               {"61","Sunsilk Stunning Black Shine Shampoo(375ml)","Cosmetics","270"},{"62","Clear Complete Active Care Shampoo(375 ml)","","330"},
               {"63","Clear Anti Hair Fall Shampoo(375ml)","Cosmetics","330"},{"64","RAW GOLD Face Wash","Cosmetics","600"},{"65","Garnier Cream Small Size","Cosmetics","175"},{"66","Garnier Clour Small Size","Cosmetics","180"},
               {"67","Clean and Clear Face Wash 100ml","Cosmetics","170"},{"68","Clean and Clear Face Wash 50ml","Cosmetics","175"},{"69","Chomok fabrics Braitenar(50mg)","Cosmetics","35"},
               {"70","Chomok fabrics Braitenar(100mg)","Cosmetics","70"},{"71","Jui Coconut oil(200mg)","Cosmetics","110"},{"72","Jui Coconut oil(350mg)","Cosmetics","190"},{"73","Cocacola 1 Liter","Drinks","50"},
               {"74","Cocacola 2.250 Liter","Drinks","110"},{"75","Cocacola 1.25 Liter","Drinks","65"},{"76","Sprite 1 Liter","Drinks","50"},{"77","Sprite 2.250 Liter","Drinks","100"},
               {"78","Sprite 1.25 Liter","Drinks","65"},{"79","Himalaya Face Wash(100ml)","Cosmetics","185"},{"80","Ovaltine Chocolate(400g)","Food","395"},{"81","Ovaltine(400g)","Food","395"},
               {"82","Nocilla 200g","Food","225"},{"83","Nocilla 320g","Food","362"},{"84","Jacker 110g","Food","110"},{"85","Pasta 500g","Food","130"},{"86","Olive Achar 330g","Food","160"}};
               
            String colum[]={"Serial No","Name","Catagory","Price"};
            
            tb1=new JTable(data,colum);
            tb1.setBounds(10, 100, 900, 900);
            tb1.setFont(font);
            sp=new JScrollPane(tb1);
     
//Label SetBounds
            final JLabel label = new JLabel();
            label.setBounds(250,150, 200,50);
            l1.setBounds(300, 40, 200, 60);
            l2.setBounds(300, 75, 200, 60);
            l3.setBounds(300, 130, 200, 30);
            l4.setBounds(300, 170, 200, 30);
            l5.setBounds(300, 210, 200, 30);
            l6.setBounds(280, 235, 200, 60);
            l7.setBounds(280, 285, 200, 60);

 //TextField SetBounds           
            tf1.setBounds(450, 50, 250, 30);
            tf2.setBounds(450, 90, 250, 30);
            tf3.setBounds(450, 130, 250, 30);
            text = new JTextField();  
            text.setBounds(350, 250, 250, 30);

//Button
            b1=new JButton("Submit");    
            b2=new JButton("Exit");
            b3=new JButton("Sign in");
            b4=new JButton("Login");
            b5=new JButton("Product List");
            b6=new JButton("Buy Product");
            b7=new JButton("Order");
            b8=new JButton("Pay");
           
//Button SetBounds
            b1.setBounds(300, 350, 100, 30);
            b2.setBounds(500, 350, 100, 30);
            b3.setBounds(400, 450, 100, 30);
            b4.setBounds(400, 400, 100, 30);
            b5.setBounds(350, 300, 300, 100);
            b6.setBounds(350, 500, 300, 100);
            b7.setBounds(350, 900, 120, 30);
            b8.setBounds(350, 600, 200, 50);
         


 //comboBox 
             
            c1=new JCheckBox("Holud Gura(200gm) @ 80");  
            c1.setBounds(40,30,250,20);
            c2=new JCheckBox("Morich Gura(200gm) @ 88");  
            c2.setBounds(40,50,250,20);
            c3=new JCheckBox("Dhoniya Gura(100gm) @ 30");  
            c3.setBounds(40,70,250,20);
            c4=new JCheckBox("Zira Gura(100gm) @ 80");  
            c4.setBounds(40,90,250,20);
            c5=new JCheckBox("Gorom Mosla Gura @ 55");  
            c5.setBounds(40,110,250,20);
            c6=new JCheckBox("Pachforon Achta @ 18");  
            c6.setBounds(40,130,250,20);
            c7=new JCheckBox("Borhani Mosla @ 30");  
            c7.setBounds(40,150,250,20);
            c8=new JCheckBox("Sorishar Tel (500gm) @ 115");  
            c8.setBounds(40,170,250,20);
            c9=new JCheckBox("PizzBiriyani Mosla (40gm)a @ 45");  
            c9.setBounds(40,190,250,20);
            c10=new JCheckBox("Rost Mosla (35gm) @ 50");  
            c10.setBounds(40,210,250,20);
            c11=new JCheckBox("Kabab Mosla (50gm) @ 85");  
            c11.setBounds(40,230,250,20);
            c12=new JCheckBox("Radhuni Mangser Mosla(100gm) @ 60");  
            c12.setBounds(40,250,250,20);
            c13=new JCheckBox("Goru Mosla(100) @ 60");  
            c13.setBounds(40,270,250,20);
            c14=new JCheckBox("Murgi Mosla(100gm) @ 55");  
            c14.setBounds(40,290,250,20);
            c15=new JCheckBox("Maser Mosla(100gm) @ 45");  
            c15.setBounds(40,310,250,20);
            c16=new JCheckBox("Chicken Tandori Mosla(50gm) @ 75");  
            c16.setBounds(40,330,250,20);
            c17=new JCheckBox("Halim Mix(200gm) @ 45");  
            c17.setBounds(40,350,250,20);
            c18=new JCheckBox("Kasundi(285gm) @ 45");  
            c18.setBounds(40,370,250,20);
            c19=new JCheckBox("Halim Mix(200gm) @ 55");  
            c19.setBounds(40,390,250,20);
            c20=new JCheckBox("Hair Removal Cream(25mg) @ 75");  
            c20.setBounds(40,410,250,20);
            c21=new JCheckBox("Neem Soap @ 35");  
            c21.setBounds(40,430,250,20);
            c22=new JCheckBox("Mango Screen Cream @ 150");  
            c22.setBounds(40,450,250,20);
            c23=new JCheckBox("Honey Rose Cream @ 150");  
            c23.setBounds(40,470,250,20);
            c24=new JCheckBox("Mesta Guard(30gm) @ 115");  
            c24.setBounds(40,490,250,20);
            c25=new JCheckBox("Soft rose water Glycerin @ 100");  
            c25.setBounds(40,510,250,20);
            c26=new JCheckBox("Soft Olive oil @ 200");  
            c26.setBounds(40,530,250,20);
            c27=new JCheckBox("Rupchada Oil(5L) @ 540");  
            c27.setBounds(40,550,250,20);
            c28=new JCheckBox("Rupchada Oil(2L) @ 220");  
            c28.setBounds(40,570,250,20);
            c29=new JCheckBox("Pushti Oil(4.5Ltr) @ 530");  
            c29.setBounds(40,590,250,20);
            c30=new JCheckBox("Leather Shoes100 @ 580");  
            c30.setBounds(40,610,250,20);
            c31=new JCheckBox("Leather Shoes111 @ 565");  
            c31.setBounds(40,630,250,20);
            c32=new JCheckBox("Leather Shoes103 @ 520");  
            c32.setBounds(40,650,250,20);
            c33=new JCheckBox("Leather Shoes112 @ 310");  
            c33.setBounds(40,670,250,20);
            c34=new JCheckBox("WhiteTon Face Powder(30gm) @ 100");  
            c34.setBounds(40,690,250,20);
            c35=new JCheckBox("WhiteTon Face Powder(50gm) @ 115");  
            c35.setBounds(40,710,250,20);
            c36=new JCheckBox("WhiteTon Face Powder(70gm) @ 190");  
            c36.setBounds(40,730,250,20);
            c37=new JCheckBox("Noborotno(100mg @ 180");  
            c37.setBounds(40,750,250,20);
            c38=new JCheckBox("Noborotno(200mg) @ 280");  
            c38.setBounds(40,770,250,20);
            c39=new JCheckBox("Noborotno(300mg) @ 330");  
            c39.setBounds(40,790,250,20);
            c40=new JCheckBox("Party S P @ 35");  
            c40.setBounds(40,810,250,20);
            c41=new JCheckBox("Hot Ice @ 250");  
            c41.setBounds(40,830,250,20);
            c42=new JCheckBox("Marquris @ 250");  
            c42.setBounds(40,850,250,20);
            c43=new JCheckBox("Engage Spray @ 350");  
            c43.setBounds(40,870,250,20);
            c44=new JCheckBox("Fogg Body Spray @ 250");  
            c44.setBounds(500,30,250,20);
            c45=new JCheckBox("Math Wash(Siruini) @ 280");  
            c45.setBounds(500,50,250,20);
            c46=new JCheckBox("Moov Spray @ 200");  
            c46.setBounds(500,70,250,20);
            c47=new JCheckBox("Jhnsons baby Soa(50mg) @ 75");  
            c47.setBounds(500,90,250,20);
            c48=new JCheckBox("Johnsons Baby Soap(75mg) @ 95");  
            c48.setBounds(500 ,110,250,20);
            c49=new JCheckBox("Johnsons Baby Soap(150mg) @ 120");  
            c49.setBounds(500,130,250,20);
            c50=new JCheckBox("Johnsons Lotion(200ml) @ 270");  
            c50.setBounds(500,150,250,20);
            c51=new JCheckBox("Johnsons oil(100ml) @ 190");  
            c51.setBounds(500,170,250,20);
            c52=new JCheckBox("Johnsons oil(50ml) @ 95");  
            c52.setBounds(500,190,250,20);
            c53=new JCheckBox("Dove shampoo Nourishing Solution(180gm) @ 190");  
            c53.setBounds(500,210,250,20);
            c54=new JCheckBox("Dove shampoo Nourishing Solution(180gm) @ 200");  
            c54.setBounds(500,230,250,20);
            c55=new JCheckBox("Dove shampoo Hair Fall Rescue(180ML) @ 190");  
            c55.setBounds(500,250,250,20);
            c56=new JCheckBox("Dove Body Lotion(250ML) @ 340");  
            c56.setBounds(500,270,250,20);
            c57=new JCheckBox("Dove Body Lotion(300ML) @ 400");  
            c57.setBounds(500,290,250,20);
            c58=new JCheckBox("Sunsilk lusciously Thick & long Shampoo(180ml) @ 145");  
            c58.setBounds(500,310,250,20);
            c59=new JCheckBox("Sunsilk Stunning Black Shine Shampoo(180ml) @ 145");  
            c59.setBounds(500,330,250,20);
            c60=new JCheckBox("Sunsilk Perfect Straight Shampoo(375ml) @ 245");  
            c60.setBounds(500,350,250,20);
            c61=new JCheckBox("Sunsilk Stunning Black Shine Shampoo(375ml) @ 270");  
            c61.setBounds(500,370,250,20);
            c62=new JCheckBox("Clear Complete Active Care Shampoo(375 ml) @ 330");  
            c62.setBounds(500,390,250,20);
            c63=new JCheckBox("Clear Anti Hair Fall Shampoo(375ml @ 330");  
            c63.setBounds(500,410,250,20);
            c64=new JCheckBox("RAW GOLD Face Wash @ 600");  
            c64.setBounds(500,430,250,20);
            c65=new JCheckBox("Garnier Cream Small Size @ 180");  
            c65.setBounds(500,450,250,20);
            c66=new JCheckBox("Garnier Clour Small Size @ 180");  
            c66.setBounds(500,470,250,20);
            c67=new JCheckBox("Clean and Clear Face Wash(100ml) @ 170");  
            c67.setBounds(500,490,250,20);
            c68=new JCheckBox("Clean and Clear Face Wash(50ml) @ 175");  
            c68.setBounds(500,510,250,20);
            c69=new JCheckBox("Chomok fabrics Braitenar(50mg) @ 35");  
            c69.setBounds(500,530,250,20);
            c70=new JCheckBox("Chomok fabrics Braitenar(100mg) @ 70");  
            c70.setBounds(500,550,250,20);
            c71=new JCheckBox("Jui Coconut oil(200mg) @ 190");  
            c71.setBounds(500,570,250,20);
            c72=new JCheckBox("Jui Coconut oil(350mg) @ 110");  
            c72.setBounds(500,590,250,20);
            c73=new JCheckBox("Cocacola 1 Liter @ 50");  
            c73.setBounds(500,610,250,20);
            c74=new JCheckBox("Cocacola 2.250 Liter @ 110");  
            c74.setBounds(500,630,250,20);
            c75=new JCheckBox("Cocacola 1.25 Liter @ 65");  
            c75.setBounds(500,650,250,20);
            c76=new JCheckBox("Sprite 1 Liter @ 50");  
            c76.setBounds(500,670,250,20);
            c77=new JCheckBox("Sprite 2.250 Liter @ 110");  
            c77.setBounds(500,690,250,20);
            c78=new JCheckBox("Sprite 1.25 Liter @ 65");  
            c78.setBounds(500,710,250,20);
            c79=new JCheckBox("Himalaya Face Wash(100ml) @ 185");  
            c79.setBounds(500,730,250,20);
            c80=new JCheckBox("Ovaltine Chocolate(400g) @ 395");  
            c80.setBounds(500,750,250,20);
            c81=new JCheckBox("Ovaltine(400g) @ 395");  
            c81.setBounds(500,770,250,20);
            c82=new JCheckBox("Nocilla 200g @ 225");  
            c82.setBounds(500,790,250,20);
            c83=new JCheckBox("Nocilla 320g @ 362");  
            c83.setBounds(500,810,250,20);
            c84=new JCheckBox("Jacker 110g @ 110");  
            c84.setBounds(500,830,250,20);
            c85=new JCheckBox("Pasta 500g @ 130");  
            c85.setBounds(500,850,250,20);
            c86=new JCheckBox("Olive Achar 330g @ 130");  
            c86.setBounds(500,870,250,20);
          
            
             
//RadioButton            
             r1=new JRadioButton("Cash");
             r2=new JRadioButton("Card");
             r1.setBounds(400, 300, 300, 100);
             r2.setBounds(400, 450, 300, 100);
             font2=new Font("TimesRoman",Font.PLAIN,30);
             r1.setFont(font2);
             r2.setFont(font2);
             
             
 //1stFrame
            j.add(l1);
            j.add(l2);
            j.add(l3);
            j.add(l4);
            j.add(l5);
            j.add(b1);
            j.add(b2);
            j.add(b3);

            j.add(tf1);
            j.add(tf2);
            j.add(tf3);

            j.add(p1);
            j.add(p2);
          

//2nd Frame            
            j2.add(l6);
            j2.add(label);
            j2.add(l7);
            j2.add(b4);
            j2.add(text);
            j2.add(value);
            
//3rd Frame          
            j3.add(b5);
            j3.add(b6);
           
            
  //4th Frame         
            j4.add(sp);
           
            
 //5th Frame           
            j5.add(c1);      
            j5.add(c2);
            j5.add(c3);
            j5.add(c4);
            j5.add(c5);
            j5.add(c6);
            j5.add(c7);
            j5.add(c8);
            j5.add(c9);
            j5.add(c10);
            j5.add(c11);
            j5.add(c12);
            j5.add(c13);
            j5.add(c14);
            j5.add(c15);
            j5.add(c16);
            j5.add(c17);
            j5.add(c18);
            j5.add(c19);
            j5.add(c20);
            j5.add(c21);
            j5.add(c22);
            j5.add(c23);
            j5.add(c24);
            j5.add(c25);
            j5.add(c26);
            j5.add(c27);
            j5.add(c28);
            j5.add(c29);
            j5.add(c30);
            j5.add(c31);
            j5.add(c32);
            j5.add(c33);
            j5.add(c34);
            j5.add(c35);
            j5.add(c36);
            j5.add(c37);
            j5.add(c38);
            j5.add(c39);
            j5.add(c40);
            j5.add(c41);      
            j5.add(c42);
            j5.add(c43);
            j5.add(c44);
            j5.add(c45);
            j5.add(c46);
            j5.add(c47);
            j5.add(c48);
            j5.add(c49);
            j5.add(c50);
            j5.add(c51);      
            j5.add(c52);
            j5.add(c53);
            j5.add(c54);
            j5.add(c55);
            j5.add(c56);
            j5.add(c57);
            j5.add(c58);
            j5.add(c59);
            j5.add(c60);
            j5.add(c61);      
            j5.add(c62);
            j5.add(c63);
            j5.add(c64);
            j5.add(c65);
            j5.add(c66);
            j5.add(c67);
            j5.add(c68);
            j5.add(c69);
            j5.add(c70);
            
            j5.add(c71);      
            j5.add(c72);
            j5.add(c73);
            j5.add(c74);
            j5.add(c75);
            j5.add(c76);
            j5.add(c77);
            j5.add(c78);
            j5.add(c79);
            j5.add(c80);
            j5.add(c81);      
            j5.add(c82);
            j5.add(c83);
            j5.add(c84);
            j5.add(c85);
            j5.add(c86);
            
           j5.add(b7);
                      
           
 //6th Frame          
           j6.add(r1);
           j6.add(r2);
           j6.add(b8);
           
                 
     
     
     
     
            j.setSize(1000, 1000);
            j.setLayout(null);
            j.setVisible(true);

            j2.setSize(1000, 1000);
            j2.setLayout(null);
            j2.setVisible(false);

            j3.setSize(1000, 1000);
            j3.setLayout(null);
            j3.setVisible(false);
            
            
            j4.setSize(1000, 1000);          
            j4.setVisible(false);
            
            j5.setSize(1000, 1000);
            j5.setLayout(null);
            j5.setVisible(false);
            
            j6.setSize(1000, 1000);
            j6.setLayout(null);
            j6.setVisible(false);
            
            b1.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent ae) {
                       
                       
                       
                      
                       try {
                           File f1= new File("E:\\admin.txt");
                    FileWriter  fw = new FileWriter(f1, true);
                           BufferedWriter bw= new BufferedWriter(fw);
                           PrintWriter pw= new PrintWriter(bw);
                          Scanner in=new Scanner(f1);
                         String email= tf3.getText();
                         String password=new String(p1.getPassword());
                        
                         
                         String str=email+","+password;
                         pw.println(str);
                        
                           
                           pw.flush();
                           pw.close();
                           
                                
                           
                           
                           
                           if (ae.getSource() == b1)
                           {
                               int x = 0;
                               String s1 = tf1.getText();
                               String s2 = tf2.getText();
                               
                               char[] s3 = p1.getPassword();
                               char[] s4 = p2.getPassword();
                               String s8 = new String(s3);
                               String s9 = new String(s4);
                               
                               
                               
                               
                               String s5 = tf5.getText();
                               
                               if (s8.equals(s9))
                               {
                                   x++;
                                   if (x > 0)
                                   {
                                       JOptionPane.showMessageDialog(b1, "Data Saved Successfully");
                                   }
                                   else
                                   {
                                       JOptionPane.showMessageDialog(b1, "Data not Saved");
                                   }
                               }
                               
                               else
                               {
                                   tf1.setText("");
                                   tf2.setText("");
                                   p1.setText("");
                                   p2.setText("");
                                   tf3.setText("");
                                   
                               }
                               j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                           }
                       } catch (IOException ex) {
                           Logger.getLogger(Super_Shop_Management_System.class.getName()).log(Level.SEVERE, null, ex);
                       }
 }          
                                        
               });
            b4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                          
                            try {
                                File f1= new File("E:\\admin.txt");
                                
                              
                                String email=text.getText();
                                String password=new String(value.getPassword());
                              
                               
                                Scanner in=new Scanner(f1);
                                while(in.hasNextLine()){
                                    
                                    String line=in.nextLine();
                                    String word[]= line.split("[,]");
                                   
                                    if(email.equals(word[0])&& password.equals(word[1])){
                                      j2.setVisible(false);
                                      j3.setVisible(true);
                                    }
                                    else{
                                        
                                      // JOptionPane.showMessageDialog(b4, "Invalid");
                                      
                                      
                                       
                                        text.setText("");
                                        value.setText("");
                                        j.dispose();
                                        j2.setVisible(true);
                                        j3.setVisible(false);
                                    
                                   }            
                                }
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(Super_Shop_Management_System.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            } 
               
                        
                        });
             
    
    
             
            b3.addActionListener(new ActionListener() {
                           @Override
                           public void actionPerformed(ActionEvent ae) {
                               j.setVisible(false);
                               j2.setVisible(true);
                           
                              }
                       });
                     
            b2.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent ae) {
                       System.exit(0);
                       }
               });
            b5.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent ae) {
                          
                          j3.setVisible(true);
                          j4.setVisible(true);
                         }
                  });
            b6.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent ae) {
                          j3.setVisible(false);
                          j5.setVisible(true);
                       }
                  });
            b7.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent ae) {
                          float amount=0;
                          String msg="";
                         int count=0;
                          if(c1.isSelected()){
                              amount+=80;
                              msg+="Holud Gura(200gm):80\n";
                              count++;
                          }if(c2.isSelected()){
                              amount+=88;
                              msg+="Morich Gura(200gm):88\n";
                              count++;
                          }if(c3.isSelected()){
                              amount+=30;
                              msg+="Dhoniya Gura(100gm):30\n";
                              count++;
                          }if(c4.isSelected()){
                              amount+=80;
                              msg+="Zira Gura(100gm):\n";
                              count++;
                          }if(c5.isSelected()){
                              amount+=55;
                              msg+="Gorom Mosla Gura:55\n";
                              count++;
                          }if(c6.isSelected()){
                              amount+=18;
                              msg+="Pachforon Achta:18\n";
                              count++;
                          }if(c7.isSelected()){
                              amount+=30;
                              msg+="Borhani Mosla:30\n";
                              count++;
                          }if(c8.isSelected()){
                              amount+=115;
                              msg+="Sorishar Tel(500gm):115\n";
                              count++;
                          }if(c9.isSelected()){
                              amount+=45;
                              msg+="Biriyani Mosla(40gm):45\n";
                              count++;
                          }if(c10.isSelected()){
                              amount+=50;
                              msg+="Rost Mosla(35gm):50\n";
                              count++;
                          }if(c11.isSelected()){
                              amount+=85;
                              msg+="Kabab Mosla(50gm):85\n";
                              count++;
                          }if(c12.isSelected()){
                              amount+=60;
                              msg+="Radhuni Mangser Mosla(100gm):60\n";
                              count++;
                          }if(c13.isSelected()){
                              amount+=60;
                              msg+="Goru Mosla(100):60\n";
                              count++;
                          }if(c14.isSelected()){
                              amount+=55;
                              msg+="Murgi Mosla(100gm):55\n";
                              count++;
                          }if(c15.isSelected()){
                              amount+=45;
                              msg+="Maser Mosla(100gm):45\n";
                              count++;
                          }if(c16.isSelected()){
                              amount+=75;
                              msg+="Chicken Tandori Mosla(50gm):75\n";
                              count++;
                          }if(c17.isSelected()){
                              amount+=45;
                              msg+="Halim Mix(200gm):45\n";
                              count++;
                          }if(c18.isSelected()){
                              amount+=45;
                              msg+="Kasundi(285gm):45\n";
                              count++;
                          }if(c19.isSelected()){
                              amount+=55;
                              msg+="Halim Mix(200gm):55\n";
                              count++;
                          }if(c20.isSelected()){
                              amount+=75;
                              msg+="Hair Removal Cream(25mg):75\n";
                              count++;
                          }if(c21.isSelected()){
                              amount+=35;
                              msg+="Neem Soap:35\n";
                              count++;
                          }if(c22.isSelected()){
                              amount+=150;
                              msg+="Mango Screen Cream:150\n";
                              count++;
                          }if(c23.isSelected()){
                              amount+=150;
                              msg+="Honey Rose Cream:150\n";
                              count++;
                          }if(c24.isSelected()){
                              amount+=115;
                              msg+="Mesta Guard(30gm):115\n";
                              count++;
                          }if(c25.isSelected()){
                              amount+=100;
                              msg+="Soft rose water Glycerin:100\n";
                              count++;
                          }if(c26.isSelected()){
                              amount+=200;
                              msg+="Soft Olive oil:200\n";
                              count++;
                          }if(c27.isSelected()){
                              amount+=540;
                              msg+="Rupchada Oil(5L):540\n";
                              count++;
                          }if(c28.isSelected()){
                              amount+=220;
                              msg+="Rupchada Oil(2L):220\n";
                              count++;
                          }if(c29.isSelected()){
                              amount+=530;
                              msg+="Pushti Oil(4.5Ltr):530\n";
                              count++;
                          }if(c30.isSelected()){
                              amount+=580;
                              msg+="Leather Shoes100:580\n";
                              count++;
                          }if(c31.isSelected()){
                              amount+=565;
                              msg+="Leather Shoes111:565";
                              count++;
                          }if(c32.isSelected()){
                              amount+=520;
                              msg+="Leather Shoes103:520\n";
                              count++;
                          }if(c33.isSelected()){
                              amount+=310;
                              msg+="Leather Shoes112:310\n";
                              count++;
                          }if(c34.isSelected()){
                              amount+=100;
                              msg+="WhiteTon Face Powder(30gm):100\n";
                              count++;
                          }if(c35.isSelected()){
                              amount+=115;
                              msg+="WhiteTon Face Powder(50gm):115\n";
                              count++;
                          }if(c36.isSelected()){
                              amount+=190;
                              msg+="WhiteTon Face Powder(70gm):190\n";
                              count++;
                          }if(c37.isSelected()){
                              amount+=180;
                              msg+="Noborotno(100mg):180\n";
                              count++;
                          }if(c38.isSelected()){
                              amount+=280;
                              msg+="Noborotno(200mg):280\n";
                              count++;
                          }if(c39.isSelected()){
                              amount+=330;
                              msg+="Noborotno(300mg):330\n";
                              count++;
                          }if(c40.isSelected()){
                              amount+=35;
                              msg+="Party S P:35\n";
                              count++;
                          }if(c41.isSelected()){
                              amount+=250;
                              msg+="Hot Ice:250\n";
                              count++;
                          }if(c42.isSelected()){
                              amount+=250;
                              msg+="Marquris:250\n";
                              count++;
                          }if(c43.isSelected()){
                              amount+=250;
                              msg+="Engage Spray:250\n";
                              count++;
                          }if(c44.isSelected()){
                              amount+=250;
                              msg+="Fogg Body Spray:250\n";
                              count++;
                          }if(c45.isSelected()){
                              amount+=280;
                              msg+="Math Wash(Siruini):280\n";
                              count++;
                          }if(c46.isSelected()){
                              amount+=200;
                              msg+="Moov Spray:200\n";
                              count++;
                          }if(c47.isSelected()){
                              amount+=75;
                              msg+="Jhnsons baby Soa(50mg):75\n";
                              count++;
                          }if(c48.isSelected()){
                              amount+=95;
                              msg+="Johnsons Baby Soap(75mg):95\n";
                              count++;
                          }if(c49.isSelected()){
                              amount+=120;
                              msg+="Johnsons Baby Soap(150mg):120\n";
                              count++;
                          }if(c50.isSelected()){
                              amount+=270;
                              msg+="Johnsons Lotion(200ml):270\n";
                              count++;
                          }if(c51.isSelected()){
                              amount+=190;
                              msg+="Johnsons oil(100ml):190\n";
                              count++;
                          }if(c52.isSelected()){
                              amount+=95;
                              msg+="Johnsons oil(50ml):95\n";
                              count++;
                          }if(c53.isSelected()){
                              amount+=190;
                              msg+="Dove shampoo Nourishing Solution(180gm):190\n";
                              count++;
                          }if(c54.isSelected()){
                              amount+=190;
                              msg+="Dove shampoo Nourishing Solution(180gm):190\n";
                              count++;
                          }if(c55.isSelected()){
                              amount+=190;
                              msg+="Dove shampoo Hair Fall Rescue(180ML):190\n";
                              count++;
                          }if(c56.isSelected()){
                              amount+=340;
                              msg+="Dove Body Lotion(250ML):340\n";
                              count++;
                          }if(c57.isSelected()){
                              amount+=400;
                              msg+="Dove Body Lotion(300ML):400\n";
                              count++;
                          }if(c58.isSelected()){
                              amount+=145;
                              msg+="Sunsilk lusciously Thick & long Shampoo(180ml):145\n";
                              count++;
                          }if(c59.isSelected()){
                              amount+=145;
                              msg+="Sunsilk Stunning Black Shine Shampoo(180ml):145\n";
                              count++;
                          }if(c60.isSelected()){
                              amount+=245;
                              msg+="Sunsilk Perfect Straight Shampoo(375ml):245\n";
                              count++;
                          }if(c61.isSelected()){
                              amount+=270;
                              msg+="Sunsilk Stunning Black Shine Shampoo(375ml):270\n";
                              count++;
                          }if(c62.isSelected()){
                              amount+=330;
                              msg+="Clear Complete Active Care Shampoo(375 ml):330\n";
                              count++;
                          }if(c63.isSelected()){
                              amount+=330;
                              msg+="Clear Anti Hair Fall Shampoo(375ml):330\n";
                              count++;
                          }if(c64.isSelected()){
                              amount+=600;
                              msg+="RAW GOLD Face Wash:600\n";
                              count++;
                          }if(c65.isSelected()){
                              amount+=180;
                              msg+="Garnier Cream Small Size:180\n";
                              count++;
                          }if(c66.isSelected()){
                              amount+=180;
                              msg+="Garnier Clour Small Size:180\n";
                              count++;
                          }if(c67.isSelected()){
                              amount+=170;
                              msg+="Clean and Clear Face Wash(100ml):170\n";
                              count++;
                          }if(c68.isSelected()){
                              amount+=175;
                              msg+="Clean and Clear Face Wash(50ml):175\n";
                              count++;
                          }if(c69.isSelected()){
                              amount+=35;
                              msg+="Chomok fabrics Braitenar(50mg):35\n";
                              count++;
                          }if(c70.isSelected()){
                              amount+=70;
                              msg+="Chomok fabrics Braitenar(100mg):70\n";
                              count++;
                          }if(c71.isSelected()){
                              amount+=90;
                              msg+="Jui Coconut oil(200mg):90\n";
                              count++;
                          }if(c72.isSelected()){
                              amount+=110;
                              msg+="Jui Coconut oil(350mg):110\n";
                              count++;
                          }if(c73.isSelected()){
                              amount+=50;
                              msg+="Cocacola 1 Liter:50\n";
                              count++;
                          }if(c74.isSelected()){
                              amount+=110;
                              msg+="Cocacola 2.250 Liter:110\n";
                              count++;
                          }if(c75.isSelected()){
                              amount+=65;
                              msg+="Cocacola 1.25 Liter:65\n";
                              count++;
                          }if(c76.isSelected()){
                              amount+=50;
                              msg+="Sprite 1 Liter:50\n";
                              count++;
                          }if(c77.isSelected()){
                              amount+=110;
                              msg+="Sprite 2.250 Liter:110\n";
                              count++;
                          }if(c78.isSelected()){
                              amount+=65;
                              msg+="Sprite 1.25 Liter:65\n";
                              count++;
                          }if(c79.isSelected()){
                              amount+=185;
                              msg+="Himalaya Face Wash(100ml):185\n";
                              count++;
                          }if(c80.isSelected()){
                              amount+=395;
                              msg+="Ovaltine Chocolate(400g):395\n";
                              count++;
                          }if(c81.isSelected()){
                              amount+=395;
                              msg+="Ovaltine(400g):395\n";
                              count++;
                          }if(c82.isSelected()){
                              amount+=225;
                              msg+="Nocilla 200g:225\n";
                              count++;
                          }if(c83.isSelected()){
                              amount+=362;
                              msg+="Nocilla 320g:362\n";
                              count++;
                          }if(c84.isSelected()){
                              amount+=110;
                              msg+="Jacker 110g:110\n";
                              count++;
                          }if(c85.isSelected()){
                              amount+=130;
                              msg+="Pasta 500g:130\n";
                              count++;
                          }if(c86.isSelected()){
                              amount+=130;
                              msg+="Olive Achar 330g:130\n";
                              count++;
                          }
                          msg+="-----------\n";
                          
                   JOptionPane.showMessageDialog(label, msg+"Total"+amount);
                         
                                  if(count==0){
                              JOptionPane.showMessageDialog(label, "Order first");
                             j5.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                          }
                                  else{
                                      j5.setVisible(false);
                                      j6.setVisible(true);
                                  }
            
                          
                      } 
                  });
            b8.addActionListener(new ActionListener() {
                      @Override
                      public void actionPerformed(ActionEvent ae) {
                                if(r1.isSelected()){
               JOptionPane.showMessageDialog(label, "Paid by cash");
           }
                                if(r2.isSelected()){
                             JOptionPane.showMessageDialog(label, "Paid by card");         
                                }
                                System.exit(0);
                          }
                  });
         
    }
    
}
       
   