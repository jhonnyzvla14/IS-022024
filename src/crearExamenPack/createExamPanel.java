package crearExamenPack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

class createExamPanel extends createPanel{
    private JLabel newLabel;
    public JTextField NameBox;
    public JTextField DurationBox;
    private JComboBox Levels;
    private JComboBox AsociatedCourses;
    public static JTextArea DominiumArea;
    public static JTextArea InstructionsArea;
    public addDominiumView dominiumWindow;
    public addInstructionView instrucWindow;
    public createExamPanel(){
        this.setLayout(null);
        this.setBackground(Fondo); 
        addTitulo(" Introduzca los datos del examen",40,90, 210, 30,14); 
        Button botonCrear= new Button();
        Button addEdit1 = new Button();
        Button addEdit2 = new Button();
        aggButtons(botonCrear,addEdit1,addEdit2);
        NameBox= new JTextField();
        addNameBox(NameBox);
        DurationBox= new JTextField();
        setDurationBox(DurationBox);
        String [] Prueba ={"Nivel 1", "NIVEL 2", "Nivel 3"};
        Levels = new JComboBox(Prueba);
        setLevelBox(Levels);
        String [] CursosP={"Java","Comer","No Matar"};
        AsociatedCourses = new JComboBox(CursosP);
        setCourseBox(AsociatedCourses);
        DominiumArea = new JTextArea();
        setDominumArea(DominiumArea);
        Rectangle dimensiones=DominiumArea.getBounds();
        JScrollPane Dominium = new JScrollPane(DominiumArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        Dominium.setBounds(dimensiones);
        this.add(Dominium);
        InstructionsArea= new JTextArea();
        addInstructionsArea(InstructionsArea);
        JScrollPane Instrucciones=new JScrollPane(InstructionsArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        dimensiones=InstructionsArea.getBounds();
        Instrucciones.setBounds(dimensiones);
        this.add(Instrucciones);
        ActionListener crearExamen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                JOptionPane.showMessageDialog(null, "Examen Creado");
                System.exit(0);
            }
        };
        ActionListener openDominium = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                dominiumWindow = new addDominiumView();
            }
        };
        ActionListener openInstructions = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                instrucWindow = new addInstructionView();
            }
        };
        botonCrear.addActionListener(crearExamen);
        addEdit1.addActionListener(openDominium);
        addEdit2.addActionListener(openInstructions);
    }

    protected void addLogo(JLabel label){
        this.newLabel = label;
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/CertiComp250.png"));
        Icon nuevaIcon = new ImageIcon(icon.getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH));
        newLabel.setBounds(15, 20, 200, 50);
        newLabel.setIcon(nuevaIcon); 
    }

    private void aggButtons(Button C, Button E1, Button E2 ){
       C.addButton("CREAR", 450, 700, 150, 40);
       C.setFont(new Font("Roboto", Font.BOLD, 16));
       E1.addButton("Añadir/Editar", 160, 325, 110, 30);
       E1.setFont(new Font("Myriad Pro", Font.BOLD, 11));
       this.add(E1);
       E2.addButton("Añadir/Editar", 160, 490, 110, 30);
       E2.setFont(new Font("Myriad Pro", Font.BOLD, 11));
       this.add(E2);
       this.add(C);
    }

    private void addNameBox(JTextField campo){
        addSideText("Nombre:", 100, 140, 80, 30);
        addTextBox(campo,160, 145, 220, 22);
        this.add(campo);
    }
    private void setLevelBox(JComboBox lista){
        addSideText("Nivel:", 120, 197, 80, 30);
        addComboBox(lista, 160,202 , 130, 22);
        this.add(lista);
    }
    private void setCourseBox(JComboBox lista){
        addSideText("Curso Asociado:", 54, 168, 120, 30);
        addComboBox(lista, 160,173 , 220, 22);
        this.add(lista);
    }
    private void setDurationBox(JTextField cont){
        addSideText("Duracion:", 95, 227, 80, 30);
        addTextBox(cont,160, 232, 70, 22);
        this.add(cont);
    }
    private void setDominumArea(JTextArea cont){
        addSideText("Dominio(S):", 83, 260, 80, 30);
        addTextArea(cont, 160, 265, 220,50,false);
        this.add(cont);
    }
    private void addInstructionsArea (JTextArea cont){
        addSideText("Instrucciones:", 71, 385, 90, 20);
        addTextArea(cont, 160, 385, 220, 90, false);
        this.add(cont);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(25, 104, 575, 500);
    }
   
    public static void setInstructionsArea(String instrucciones){
        InstructionsArea.setText(instrucciones);
    }
    public static void setDominumArea(String dominios){
        DominiumArea.setText(dominios);
    }
    private void getNameBox(){
    }
    private void getLevelBox(){  
    }
    private void getCourseBox(){
    }
    private void getDurationBox(){
    }
    private void getDominumArea(){
    }
    private void getInstructionsArea (){

}
}