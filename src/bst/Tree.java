/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author hhlopez
 */
public class Tree {
    Node root;

    public Tree() {
    }
    
    public void insert(Node root, int newKey){
        if(root == null){
            this.root = new Node(newKey);
        }else{
            if(newKey < root.getKey()){
                if(root.LeftNode != null){
                    insert(root.LeftNode, newKey);
                }else{
                    root.setLeftNode(new Node(newKey));
                }
            }
            if(newKey > root.getKey()){
                if(root.RightNode != null){
                    insert(root.RightNode, newKey);
                }else{
                    root.setRightNode(new Node(newKey));
                }
            }
            if(newKey == root.getKey()){
                System.out.println("El nodo ya existe");
            }
        }
    }
    
    public void OrderLevel(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            System.out.println(temp.key);
            if(temp.LeftNode!=null){
                queue.add(temp.LeftNode);
            }
            if(temp.RightNode!=null){
                queue.add(temp.RightNode);
            }
        }
    }
}
