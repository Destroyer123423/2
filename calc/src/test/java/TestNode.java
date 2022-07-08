import com.sun.org.apache.xpath.internal.operations.Equals;
import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;
import ru.ac.uniyar.mf.summer.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNode {
    @Test
    void create_tree(){
        Node node = new Node("name");
        assertEquals("name", node.getName());
    }
    @Test
    void addNode(){
        Node root = new Node("name");
        Node chil = new Node("list");
        Node  roo = new Node("ttt");
        assertEquals("name", root.getName());
        assertEquals("list", chil.getName());
        chil.addl("hhhh");
        assertEquals("hhhh", chil.getName1("hhhh"));
        chil.removeChild("hhhh");
        assertEquals(false, chil.find_node("hhhh"));

    }
}
