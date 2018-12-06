package br.com.fundamento.sql;

public class SQLUtil {
    
    public static class Rua {

        public static final String NOME_TABELA = "rua";
        public static final String COL_NOME = "nome";
        public static final String COL_CEP = "cep";        

        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_NOME + ","
                + COL_CEP + "" + " ) values (?,?) returning id";
    }
    
    public static class Cidade {

        public static final String NOME_TABELA = "cidade";
        public static final String COL_NOME = "nome";
        public static final String COL_CEP = "cep";
        public static final String COL_RUA_ID = "rua";        

        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_NOME + ","
                + COL_CEP + "," + COL_RUA_ID + "" + " ) values (?,?,?) returning id";
    }

    public static class Endereco {

        public static final String NOME_TABELA = "endereco";
        public static final String COL_NUMERO = "numero";
        public static final String COL_CIDADE_ID = "cidade";        

        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_NUMERO + ","
                + COL_CIDADE_ID + "" + " ) values (?,?) returning id";
    }
    
    public static class EnderecoFarmacia {

        public static final String NOME_TABELA = "enderecofarmacia";
        public static final String COL_NUMERO = "numero";
        public static final String COL_CIDADE_ID = "cidade";        

        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_NUMERO + ","
                + COL_CIDADE_ID + "" + " ) values (?,?) returning id";
    }
    
    public static class Cliente {

        public static final String NOME_TABELA = "cliente";
        public static final String COL_NOME = "nome";
        public static final String COL_CPF = "cpf";
        public static final String COL_ENDERECO_ID = "endereco";

        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_NOME + ","
                + COL_CPF + ","
                + COL_ENDERECO_ID + "" + " ) values (?,?,?) returning id";
    }
    
    public static class Funcionario {

        public static final String NOME_TABELA = "funcionario";
        public static final String COL_NOME = "nome";
        public static final String COL_CPF = "cpf";
        public static final String COL_LOGIN = "login";
        public static final String COL_SENHA = "senha";
        public static final String COL_FUNCAO = "funcao";
        public static final String COL_ENDERECO_ID = "endereco";

        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_NOME + ","
                + COL_CPF + ","
                + COL_LOGIN + ","
                + COL_SENHA + ","
                + COL_FUNCAO + ","
                + COL_ENDERECO_ID + "" + " ) values (?,?,?,?,?,?) returning id";
    }

    public static class Produto {

        public static final String NOME_TABELA = "produto";
        public static final String COL_NOME = "nome";
        public static final String COL_CODIGO = "codigo";
        public static final String COL_FABRICANTE = "fabricante";
        public static final String COL_FINALIDADE = "finalidade";
        public static final String COL_PRECO = "preco";

        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_NOME + ","
                + COL_CODIGO + ","
                + COL_FABRICANTE + ","
                + COL_FINALIDADE + ","
                + COL_PRECO + "" + " ) values (?,?,?,?,?) returning id";
    }

    public static class Venda {

        public static final String NOME_TABELA = "venda";
        public static final String COL_QUANTIDADE = "quantidade";
        public static final String COL_VALOR = "valor";
        public static final String COL_PRODUTO_ID = "produto";
        public static final String COL_CLIENTE_ID = "cliente";
        public static final String COL_FUNCIONARIO_ID = "funcionario";

        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_QUANTIDADE + ","
                + COL_VALOR + ","
                + COL_PRODUTO_ID + ","
                + COL_CLIENTE_ID + ","
                + COL_FUNCIONARIO_ID + "" + " ) values (?,?,?,?,?) returning id";
    }

    public static class Reserva {

        public static final String NOME_TABELA = "reserva";
        public static final String COL_QUANTIDADE = "quantidade";
        public static final String COL_PRODUTO_ID = "produto";
        public static final String COL_CLIENTE_ID = "cliente";
 
        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_QUANTIDADE + ","
                + COL_PRODUTO_ID + ","
                + COL_CLIENTE_ID + "" + " ) values (?,?,?) returning id";
    }

    public static class Estoque {

        public static final String NOME_TABELA = "estoque";
        public static final String COL_QUANTIDADE = "quantidade";
        public static final String COL_PRODUTO_ID = "produto";
 
        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_QUANTIDADE + ","
                + COL_PRODUTO_ID + "" + " ) values (?,?) returning id";
    }

    public static class Farmacia {

        public static final String NOME_TABELA = "farmacia";
        public static final String COL_NOME = "nome";
        public static final String COL_ESTOQUE_ID = "estoque";
        public static final String COL_FUNCIONARIO_ID = "funcionario";        
        public static final String COL_ENDERECOFARMACIA_ID = "enderecofarmacia";

        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_NOME + ","
        		+ COL_ESTOQUE_ID + ","
        		+ COL_FUNCIONARIO_ID + ","
                + COL_ENDERECOFARMACIA_ID + "" + " ) values (?,?,?,?) returning id";
    }
   
    public static String selectAll(String nomeTabela) {
        return "select * from " + nomeTabela;
    }

    public static String selectById(String nomeTabela, int id) {
        return "select * from " + nomeTabela + " where id = " + id;
    }

}
