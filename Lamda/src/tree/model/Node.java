package tree.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dragos on 5/13/17.
 */
public class Node {

    private Integer id;
    private Integer parentId;
    private String name;
    private List<Node> children;

    public Node() {
        this(null, null, null, new ArrayList<>());
    }

    public Node(Integer id, Integer parentId, String name) {
        this(id, parentId, name, new ArrayList<>());
    }

    public Node(Integer id, Integer parentId, String name, List<Node> children) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", children=" + children +
                "}";
    }
}
