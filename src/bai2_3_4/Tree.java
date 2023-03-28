package bai2_3_4;

public abstract class Tree <E>{
    public abstract boolean insert(E e);
    public abstract void postorder(TreeNode<E> root);
    public abstract int getSize();
    public abstract TreeNode<E> deleteElement(TreeNode<E> root, E key);
    public abstract boolean search(E e);

    abstract void preorder(TreeNode<E> root);
}
