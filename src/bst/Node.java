/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author hhlopez
 */
public class Node {
    int key;
    Node LeftNode, RightNode;

    public Node(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getLeftNode() {
        return LeftNode;
    }

    public void setLeftNode(Node LeftNode) {
        this.LeftNode = LeftNode;
    }

    public Node getRightNode() {
        return RightNode;
    }

    public void setRightNode(Node RightNode) {
        this.RightNode = RightNode;
    }
    
    
}
