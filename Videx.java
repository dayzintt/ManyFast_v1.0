package ManyFast;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Videx extends Nota {
    public static String N_nota;
    public static void main(String[]args){



        // Crie uma janela (JFrame) com título
        JFrame janela = new JFrame("ManyFast - Food App");

        // Defina o tamanho da janela
        janela.setSize(1366, 768);

        // Defina o comportamento padrão ao fechar a janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crie um painel (JPanel) para adicionar componentes
        JPanel painel = new JPanel();
        JPanel[] tela_atual = {new JPanel()};
        JPanel cardapio_H = new JPanel();
        JPanel Menu = new JPanel();
        JPanel cardapio_A = new JPanel();
        JPanel cadapio_C = new JPanel();



        //definir as telas
        tela_atual[0] = painel;
        janela.add(tela_atual[0]);


        // Crie um botão (JButton)
        JButton lanc = new JButton("Lanchonete");
        JButton viag = new JButton("Viagem");
        JButton ham = new JButton("hamburguers");
        JButton aca = new JButton("açai");
        JButton past = new JButton("pasteis");
        JButton combs = new JButton("combos");
        JButton botao7 = new JButton("opção 1");
        JButton voltar1 = new JButton("voltar");
        JButton voltar2 = new JButton("voltar");

        // Adicione o botão ao painel
        viag.setPreferredSize(new Dimension(200, 100));
        lanc.setPreferredSize(new Dimension(200, 100));
        ham.setPreferredSize(new Dimension(200,100));
        aca.setPreferredSize(new Dimension(200, 100));
        past.setPreferredSize(new Dimension(200, 100));
        combs.setPreferredSize(new Dimension(200,100));

        painel.add(lanc);
        painel.add(viag);

        // Adicione o painel à janela
        Menu.add(ham);
        Menu.add(aca);
        Menu.add(past);
        Menu.add(combs);

        cardapio_H.add(botao7);
        cardapio_H.add(voltar1);

        // Defina a ação do botão quando clicado
        lanc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //valor da string na nota

                // Ação a ser executada quando o botão for clicado

                if (tela_atual[0] == painel){
                    tela_atual[0] = Menu;
                }else {
                    tela_atual[0] = painel;
                }
                janela.getContentPane().removeAll();
                janela.add(tela_atual[0]);
                janela.revalidate();
                janela.repaint();
            }
        });
        viag.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // Ação a ser executada quando o botão for clicado
                //JOptionPane.showMessageDialog(janela, "Você escolheu viagem");
                if (tela_atual[0] == painel){
                    tela_atual[0] = Menu;
                }else {
                    tela_atual[0] = painel;
                }
                N_nota = "f";
                janela.getContentPane().removeAll();
                janela.add(tela_atual[0]);
                janela.revalidate();
                janela.repaint();



            }

        });


        ham.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ação a ser executada quando o botão for clicado
                //JOptionPane.showMessageDialog(janela, "Você escolheu viagem");
                if (tela_atual[0] == Menu){
                    tela_atual[0] = cardapio_H;
                }else {
                    tela_atual[0] = painel;
                }
                janela.getContentPane().removeAll();
                janela.add(tela_atual[0]);
                janela.revalidate();
                janela.repaint();


            }
        });
        voltar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ação a ser executada quando o botão for clicado
                //JOptionPane.showMessageDialog(janela, "Você escolheu viagem");
                if (tela_atual[0] == cardapio_H){
                    tela_atual[0] = Menu;
                }else {
                    tela_atual[0] = painel;
                }
                janela.getContentPane().removeAll();
                janela.add(tela_atual[0]);
                janela.revalidate();
                janela.repaint();


            }
        });

        voltar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ação a ser executada quando o botão for clicado
                //JOptionPane.showMessageDialog(janela, "Você escolheu viagem");
                if (tela_atual[0] == cardapio_H){
                    tela_atual[0] = Menu;
                }else {
                    tela_atual[0] = painel;
                }
                janela.getContentPane().removeAll();
                janela.add(tela_atual[0]);
                janela.revalidate();
                janela.repaint();


            }
        });

        // Torne a janela visível
        janela.setVisible(true);
    }
    String voltaCoisa(String N_nota){
        return N_nota;
    }
    void printaCoisa(){
        System.out.println(" " + this.N_nota);
    }
}


