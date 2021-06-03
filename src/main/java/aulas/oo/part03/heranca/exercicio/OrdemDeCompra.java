//package aulas.oo.part03.heranca.exercicio;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//public class OrdemDeCompra {
//    private List<Produto> produtos = new ArrayList<>();
//    public void adicionarProduto(Produto produto){ produtos.add(produto);}
//    public void removerProduto(Produto produto){ produtos.remove(produto);}
//
//    public BigDecimal calcularTotal(){
//        return produtos.stream()
//                .map(Produto::getValor)
//                .reduce(BigDecimal.ZERO, BigDecimal::add);
//    }
//
//    public List<OrdemDeCompra> buscarOrdemDeCompra(){
//        return new ArrayList<>();
//    }
//
//    public void salvarOrdemCompra(){
//
//    }
//    public void enviarEmail(String email){
//
//    }
//
//    public void imprimiOrdemDeCompra(){
//
//    }
//
//
//}
