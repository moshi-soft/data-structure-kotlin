data class Node<T>(var value: T, var nextNodeReference: Node<T>? = null) {
    override fun toString(): String {
        return if (nextNodeReference != null) {
            "$value->${nextNodeReference.toString()}"
        } else {
            "$value"
        }
    }
}