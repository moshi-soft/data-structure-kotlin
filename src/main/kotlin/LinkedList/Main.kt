package LinkedList

fun main() {
//    "creating and linking nodes" example{
    /* val node1 = LinkedList.Node(value = 1)
     val node2 = LinkedList.Node(value = 2)
     val node3 = LinkedList.Node(value = 3)

     node1.nextNodeReference=node2
     node2.nextNodeReference=node3
     println(node1)*/
//    }
//    "push" example {
    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    println(list)
//    }
}