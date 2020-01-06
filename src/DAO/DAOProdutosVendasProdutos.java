/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelVendasProdutos;

/**
 *
 * @author leme_
 */
public class DAOProdutosVendasProdutos extends ConexaoMySql{
    public ArrayList<ModelProdutosVendasProdutos>getListaProdutosVendasProdutosDAO(int pCodigoVenda){
        ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
        ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
        ModelProdutos modelProdutos = new ModelProdutos();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try{
            this.conectar();
            this.executarSQL("SELECT tbl_produto.pk_id_produto, "
                    + "tbl_produto.pro_estoque, "
                    + "tbl_produto.pro_nome, "
                    + "tbl_produto.pro_valor, "
                    + "tbl_vendas_produtos.fk_produtos, "
                    + "tbl_vendas_produtos.fk_vendas, "
                    + "tbl_vendas_produtos.pk_id_venda_produtos, "
                    + "tbl_vendas_produtos.ven_produto_quantidade, "
                    + "tbl_vendas_produtos.ven_pro_valor "
                    + "FROM tbl_vendas_produtos "
                    + "INNER JOIN tbl_produto ON tbl_produto.pk_id_produto = tbl_vendas_produtos "
                    + "WHERE tbl_vendas_produtos.fk_vendas = '"+pCodigoVenda+"';");
            
            
        }catch (Exception e){
            
        }
        
        
        
    }
    
}
