public class BinaryTree {
    Node rootNode;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.leftChild = addRecursive(current.leftChild, value);
        } else if (value > current.value) {
            current.rightChild = addRecursive(current.rightChild, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }


    public void add(int value) {
        rootNode = addRecursive(rootNode, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.leftChild, value)
                : containsNodeRecursive(current.rightChild, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(rootNode, value);
    }

    public int countOfNodes(Node rootNode) {
        int result = (rootNode== null) ? 0 : 1;
        if (rootNode.leftChild != null) {
            result += countOfNodes(rootNode.leftChild);
        }
        if (rootNode.rightChild != null) {
            result += countOfNodes(rootNode.rightChild);
        }
        return result;
    }



//    public void insertNode(int value) { // метод вставки нового элемента
//        Node newNode = new Node(); // создание нового узла
//        newNode.setValue(value); // вставка данных
//        if (rootNode == null) { // если корневой узел не существует
//            rootNode = newNode;// то новый элемент и есть корневой узел
//        } else { // корневой узел занят
//            Node currentNode = rootNode; // начинаем с корневого узла
//            Node parentNode;
//            while (true) // мы имеем внутренний выход из цикла
//            {
//                parentNode = currentNode;
//                if (value == currentNode.getValue()) {   // если такой элемент в дереве уже есть, не сохраняем его
//                    return;    // просто выходим из метода
//                } else if (value < currentNode.getValue()) {   // движение влево?
//                    currentNode = currentNode.getLeftChild();
//                    if (currentNode == null) { // если был достигнут конец цепочки,
//                        parentNode.setLeftChild(newNode); //  то вставить слева и выйти из методы
//                        return;
//                    }
//                } else { // Или направо?
//                    currentNode = currentNode.getRightChild();
//                    if (currentNode == null) { // если был достигнут конец цепочки,
//                        parentNode.setRightChild(newNode);  //то вставить справа
//                        return; // и выйти
//                    }
//                }
//            }
//        }
//    }

}
