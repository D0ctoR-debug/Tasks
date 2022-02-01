import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tes {

    private BinaryTree createBinaryTree() {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(5);
        bt.add(8);
        bt.add(9);
        bt.add(7);
        bt.add(10);
        bt.add(3);
        bt.add(1);

        return bt;
    }
    BinaryTree bt = createBinaryTree();

    @Test
    public void testContains() {
        Assertions.assertTrue(bt.containsNode(6));
        Assertions.assertTrue(bt.containsNode(4));
        Assertions.assertTrue(bt.containsNode(8));
//        Assertions.assertTrue(bt.containsNode(3));
        Assertions.assertTrue(bt.containsNode(5));
//        Assertions.assertTrue(bt.containsNode(7));
//        Assertions.assertTrue(bt.containsNode(9));
    }

    @Test
    public void countTest() {
        Assertions.assertEquals(8,bt.countOfNodes(bt.rootNode));
    }
}
