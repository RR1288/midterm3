package octopath;

import java.util.HashSet;
import java.util.Set;

public class TreeNode<E> {
    private E value;
    private Set<TreeNode<E>> children;
    
    public TreeNode(E value) {
        this.value = value;
        this.children = new HashSet<TreeNode<E>>();
    }

    public E getValue() {
        return value;
    }

    public void addChild(TreeNode<E> child){
        children.add(child);
    }

    public Set<TreeNode<E>> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        if(children.size() == 0){
            return "TreeNode [value=" + value + "]";    
        }
        return "TreeNode [value=" + value + ", children=" + children + "]";
    }

    public static void main(String[] args){
        TreeNode<Character> a = new TreeNode<>('A');
        TreeNode<Character> b = new TreeNode<>('B');
        TreeNode<Character> c = new TreeNode<>('C');
        TreeNode<Character> d = new TreeNode<>('D');
        TreeNode<Character> e = new TreeNode<>('E');
        TreeNode<Character> f = new TreeNode<>('F');
        TreeNode<Character> g = new TreeNode<>('G');
        TreeNode<Character> h = new TreeNode<>('H');
        TreeNode<Character> i = new TreeNode<>('I');
        TreeNode<Character> j = new TreeNode<>('J');
        TreeNode<Character> k = new TreeNode<>('K');
        TreeNode<Character> l = new TreeNode<>('L');
        TreeNode<Character> m = new TreeNode<>('M');
        TreeNode<Character> n = new TreeNode<>('N');
        TreeNode<Character> o = new TreeNode<>('O');
        TreeNode<Character> p = new TreeNode<>('P');
        TreeNode<Character> q = new TreeNode<>('Q');
        TreeNode<Character> r = new TreeNode<>('R');

        p.addChild(q);
        p.addChild(r);

        q.addChild(a);
        q.addChild(b);

        a.addChild(d);

        d.addChild(l);
        d.addChild(m);

        b.addChild(e);
        b.addChild(f);
        b.addChild(g);

        r.addChild(c);

        c.addChild(h);
        c.addChild(i);
        c.addChild(j);
        c.addChild(k);

        System.out.println(p);


        

        



    }
    
}
