/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.vendas;

import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JOptionPane;
import sistema.de.vendas.departamento.Departamentoo;
import sistema.de.vendas.encomenda.Encomendaa;
import sistema.de.vendas.fornecedor.Fornecedorr;
import sistema.de.vendas.funcionario.Funcionarioo;
import sistema.de.vendas.io.Leitura;
import sistema.de.vendas.produto.Produtoo;

/**
 *
 * @author Mula
 */
public class MenuProg {

    public void menuFinal() throws IOException {
        int opc;
        String menu1 = "Menu:";
        menu1 += "\n 1 - Gerir Pessoal";
        menu1 += "\n 2 - Gerir Stock";
        menu1 += "\n 3 - Efectuar Encomenda";
        menu1 += "\n 4 - Sair";
        menu1 += "\n Escolha uma Opção:";

        String menuP = "Gestão de pessoal:";
        menuP += "\n 1 - Criar Departamento";
        menuP += "\n 2 - Registrar Funcionario";
        menuP += "\n 3 - Visualizar Departamentos";
        menuP += "\n 0 - Voltar";
        menuP += "\n Escolha uma Opção:";

        String menu2 = "Menu:";
        menu2 += "\n 1 - Registrar Produto";
        menu2 += "\n 2 - Registrar Fornecedor";
        menu2 += "\n 3 - Visualizar Produtos";
        menu2 += "\n 0 - Voltar";
        menu2 += "\n Escolha uma Opção:";

        String menuQ = "Deseja realizar outra Operacao?";
        menuQ += "\n 1 - Sim";
        menuQ += "\n 2 - Nao";
        menuQ += "\n Escolha uma Opção:";

        Fornecedorr forn = new Fornecedorr();
        Funcionarioo fun = new Funcionarioo();
        Encomendaa en = new Encomendaa();
        Departamentoo dep = new Departamentoo();
        Produtoo pro = new Produtoo();
        Leitura l = new Leitura();
        
        int opcQ;
        for (int i = 1; i <= 3; i++) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, menu1, "Sistema de Vendas", JOptionPane.INFORMATION_MESSAGE));
            switch (opc) {
                case 1:
                    for (int j = 1; j <= 3; j++) {
                        int op = Integer.parseInt(JOptionPane.showInputDialog(null, menuP, "Sistema de Vendas", JOptionPane.INFORMATION_MESSAGE));
                        switch (op) {
                            case 1:
                                dep.registraDados();
                                opcQ = Integer.parseInt(JOptionPane.showInputDialog(null, menuQ, "Menu", JOptionPane.INFORMATION_MESSAGE));
                                if (opcQ == 1) {
                                    j = 1;
                                    break;
                                } else {
                                    j = 3;
                                    break;
                                }
                            case 2:
                                fun.registraDados();
                                opcQ = Integer.parseInt(JOptionPane.showInputDialog(null, menuQ, "Menu", JOptionPane.INFORMATION_MESSAGE));
                                if (opcQ == 1) {
                                    j = 1;
                                    break;
                                } else {
                                    j = 3;
                                    break;
                                }
                            case 3:
                                l.leDepartamento();
                                break;
                            case 0:
                                i=1;
                                System.out.println("voltar!");
                                j = 3;
                                break;
                            default:
                                System.out.println("Opção invalida!");
                        }
                    }
                    break;
                case 2:
                    for (int j = 1; j <= 3; j++) {
                        int op = Integer.parseInt(JOptionPane.showInputDialog(null, menu2, "Sistema de Vendas", JOptionPane.INFORMATION_MESSAGE));
                        switch (op) {
                            case 1:
                                System.out.println("Registrar Produto");
                                pro.registraDados();
                                opcQ = Integer.parseInt(JOptionPane.showInputDialog(null, menuQ, "Menu", JOptionPane.INFORMATION_MESSAGE));
                                if (opcQ == 1) {
                                    j = 1;
                                    break;
                                } else {
                                    j = 3;
                                    break;
                                }
                            case 2:
                                System.out.println("Registrar Fornecedor");
                                forn.registraDados();
                                opcQ = Integer.parseInt(JOptionPane.showInputDialog(null, menuQ, "Menu", JOptionPane.INFORMATION_MESSAGE));
                                if (opcQ == 1) {
                                    j = 1;
                                    break;
                                } else {
                                    j = 3;
                                    break;
                                }
                            case 3:
                                l.leProduto();
                                break;
                            case 0:
                                i=1;
                                System.out.println("voltar!");
                                j = 3;
                                break;
                            default:
                                System.out.println("Opção invalida!");
                        }
                    }
                    break;
                case 3:
                    en.registracolectaDados();
                    opcQ = Integer.parseInt(JOptionPane.showInputDialog(null, menuQ, "Menu", JOptionPane.INFORMATION_MESSAGE));
                    if (opcQ == 1) {
                        i = 1;
                        break;
                    } else {
                        
                        i = 2;
                        break;
                    }
                case 4:
                    System.out.println("Sair Do Sistema");
                    JOptionPane.showMessageDialog(null, "Saindo do sistema!", "Estado", JOptionPane.INFORMATION_MESSAGE);
                    i = 3;
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        MenuProg m = new MenuProg();
        m.menuFinal();
    }
}
