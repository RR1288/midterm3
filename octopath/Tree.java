package octopath;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tree<E> {
    private TreeNode<E> root;

    public Tree(E value) {
        root = new TreeNode<E>(value);
    }

    public void add(E parent, E child){
        TreeNode<E> pNode =  root.findNode(parent);
        if(pNode != null){
            pNode.addChild(new TreeNode<E>(child));
        }
    }

    public List<E> getChildren(E value){
        TreeNode<E> node =  root.findNode(value);
        if(node == null){
            return new LinkedList<>();
        }
        Set<TreeNode<E>> s = node.getChildren();
        List<E> l = new LinkedList<>();
        for(TreeNode<E> child : s){
            l.add(child.getValue());
        }
        return l;
    }

    public boolean search(E target){
        TreeNode<E> node =  root.findNode(target);
        if(node == null){
            return false;
        }
        return true;
    }

    public String prefixTraversal(){
        return root.prefixTraversal();
    }

    public static void main(String[] args){
        Tree<Character> tree = new Tree<>('P');

        tree.add('P',  'Q');
        tree.add('P',  'R');
        
        tree.add('Q',  'A');
        tree.add('Q',  'B');
        
        tree.add('A',  'D');
        
        tree.add('D',  'L');
        tree.add('D',  'M');
        
        tree.add('B',  'E');
        tree.add('B',  'F');
        tree.add('B',  'G');
        
        tree.add('R',  'C');
        
        tree.add('C',  'H');
        tree.add('C',  'I');
        tree.add('C',  'J');
        tree.add('C',  'K');

        System.out.println(tree.prefixTraversal());


    }
}
