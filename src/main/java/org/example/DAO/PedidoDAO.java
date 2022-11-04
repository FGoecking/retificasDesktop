package org.example.DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.ConexaoBanco;
import org.example.model.PedidoModel;
import org.example.model.ServicoModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PedidoDAO extends ConexaoBanco {

   /* public boolean salvarPedido(PedidoModel pedido){
        conectar();
        String sql = "INSERT INTO TBL_PEDIDO(observacao) VALUES (?)";

        PreparedStatement preparedStatement = criarPreparedStatement(sql, Statement.RETURN_GENERATED_KEYS);

        try {
            preparedStatement.setString(1, pedido.getObservacao());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        desconectar();
        return true;
    }

    public ObservableList<PedidoModel> buscarListagemPedido() {
        conectar();
        String sql = "SELECT * FROM TBL_PEDIDO t";
        ObservableList<PedidoModel> obsListModel = FXCollections.observableArrayList();
        try{
            PreparedStatement preparedStatement = criarPreparedStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                PedidoModel pedidoModel = new PedidoModel();
                pedidoModel.setObservacao(resultSet.getString(1));
                obsListModel.add(pedidoModel);
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            desconectar();
        }
        return obsListModel;
    }

    public ObservableList<ServicoModel> buscarListagemServico() {
        conectar();
        String sql = "SELECT * FROM TBL_SERVICO ts";
        ObservableList<ServicoModel> obsListModel = FXCollections.observableArrayList();
        try{
            PreparedStatement preparedStatement = criarPreparedStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                ServicoModel servicoModel = new ServicoModel();
                servicoModel.setId(resultSet.getLong(1));
                servicoModel.setValorUnitario(resultSet.getBigDecimal(3));
                servicoModel.setTipoServico(resultSet.getString(4));
                servicoModel.setNome(resultSet.getString(1));
                obsListModel.add(servicoModel);
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            desconectar();


        }
        return obsListModel;
    }*/
}
