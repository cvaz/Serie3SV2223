
data class Node<E>(var item: E, var left:Node<E>?, var right:Node<E>?)

fun <E> contains(root: Node<E>?, min:E, max:E, cmp:(e1:E, e2:E)->Int):Boolean{
    TODO()
}

fun <E> isBalanced(root: Node<E>?): Boolean {
    TODO()
}

fun createBSTFromRange(start:Int,end:Int): Node<Int>? {
   TODO()
}

