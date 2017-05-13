package tree;


import tree.model.Node;
import tree.util.TreeMock;

import java.util.*;
import java.util.stream.Collectors;

public class TreeCollect {

    public static void main(String[] args){

        TreeMock mock = new TreeMock();
        List<Node> data = mock.buldData();

        Map<Integer, List<Node>> store = data.stream().collect(Collectors.groupingBy(o -> Optional.ofNullable(o.getParentId()).orElse(0)));
        data.forEach(d -> d.setChildren(store.get(d.getId())));

        System.out.println(store.get(0));

        //data.forEach(d -> store.put(d.getParentId(), d));
        //data.forEach(d -> d.setChildren(store.get(d.getId())));
    }
}
