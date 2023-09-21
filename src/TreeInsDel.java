public class TreeInsDel {

    Node root;

    class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data = data;
        }
    }

    void insert_fun(int data){
        root = insert(root, data);
    }

    Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(root.data > data){
            root.left = insert(root.left, data);
        }
        else{
            root.right = insert(root.right, data);
        }
        return root;
    }

    void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }



    public static void main(String[] args) {

        TreeInsDel treeInsDel = new TreeInsDel();

        treeInsDel.insert_fun(50);
        treeInsDel.insert_fun(30);
        treeInsDel.insert_fun(20);
        treeInsDel.insert_fun(40);
        treeInsDel.insert_fun(70);
        treeInsDel.insert_fun(60);
        treeInsDel.insert_fun(80);
        treeInsDel.inorder(treeInsDel.root);

    }

}
