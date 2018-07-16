package com.datastructure;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        ArrayList<Integer> result = null;
        try {
            list.addNodeAtPosition(100, 0);
            list.addNodeAtPosition(20, 1);
            list.addNodeAtPosition(45, 2);
            list.addNodeAtPosition(70, 3);
            result = list.getAllValues();
            System.out.println("List after Adding a node");
            for (int i = 0; result != null && i < result.size(); i++) {
                System.out.println("Position:" + i + "   Value:" + result.get(i));
            }
            LinkListNode resultVal = list.nNodeFromEndUsingHashTable(1);
            System.out.println("Nth Node from End " + resultVal.getNodeValue());
            // list.getnthNodefromEnd2Pointers(0);

            //list.getNthNodefromEnd(1);
		    /*list.deleteNode(0);
			result = list.getAllValues();
			System.out.println("List after Deleting a node");
			if (result == null)
				System.out.println("List is Empty after deletion");
			for (int i = 0; result != null && i < result.size(); i++) {
				System.out.println("Position:" + i + "   Value:" + result.get(i));
			}*/
		/*	list.updateNode(54, 1);
			result = list.getAllValues();
			System.out.println("List after Updating a node");
			if (result == null)
				System.out.println("List is Empty");
			for (int i = 0; result != null && i < result.size(); i++) {
				System.out.println("Position:" + i + "   Value:" + result.get(i));
			}*/

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
