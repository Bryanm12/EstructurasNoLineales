package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.List;



import main.Materia.Models.Node;

public class ListLevels {
    public List<List<Node>> listLevels(Node root){
        List<List<Node>> resultado = new ArrayList<>();
        levelListsHelper(root, 0, resultado);
        return resultado;
    }

    private void levelListsHelper(Node node, int nivel, List<List<Node>> resultado) {
        if (node == null)
        return;      
        if (nivel == resultado.size()) {
            resultado.add(new ArrayList<>());
        }
        resultado.get(nivel).add(node);
        levelListsHelper(node.getLeft(), nivel + 1, resultado);
        levelListsHelper(node.getRight(), nivel + 1, resultado);
    }
}
