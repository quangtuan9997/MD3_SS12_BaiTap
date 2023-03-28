package bai2_3_4;

public abstract class AbstractTree<E> extends Tree<E> {
    public abstract void postorder();
    public abstract void preorder();

    @Override
    public void postorder(TreeNode<E> root) {}

    @Override
    public void preorder(TreeNode<E> root) {}
}
