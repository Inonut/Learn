package tree.util;

import tree.model.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dragos on 5/13/17.
 */
public class TreeMock {

    public List<Node> buldData(){
        List<Node> data = new ArrayList<>();

        data.add(new Node(1, null, "1"));
        data.add(new Node(2, null, "2"));
        data.add(new Node(3, null, "3"));
        data.add(new Node(4, 1, "4"));
        data.add(new Node(5, 1, "5"));
        data.add(new Node(6, 1, "6"));
        data.add(new Node(7, 2, "7"));
        data.add(new Node(8, 2, "8"));
        data.add(new Node(9, 5, "9"));
        data.add(new Node(10, 7, "10"));


        return data;
    }
}
/*
*
* [Node{id=1, parentId=0, name='1', children=[
*          Node{id=4, parentId=1, name='4', children=null},
*          Node{id=5, parentId=1, name='5', children=[
*                       Node{id=9, parentId=5, name='9', children=null}
                    ]
            },
           Node{id=6, parentId=1, name='6', children=null}
      ]
   },
   Node{id=2, parentId=0, name='2', children=[
           Node{id=7, parentId=2, name='7', children=[
                    Node{id=10, parentId=7, name='10', children=null}]},
           Node{id=8, parentId=2, name='8', children=null}]},
   Node{id=3, parentId=0, name='3', children=null}]
* */