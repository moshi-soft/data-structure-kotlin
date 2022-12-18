package LinkedList

class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    private fun isEmpty():Boolean{
        return size==0
    }

    override fun toString(): String {
        return if (isEmpty()){
            "Empty list"
        }else{
            head.toString()
        }
    }
    fun push(value: T):LinkedList<T>{
        head = Node(value = value, nextNodeReference = head)
        if (tail == null){
            tail = head
        }
        size++
        return this
    }
}