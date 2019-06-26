package circleLinked

import leetcode707.LinkedNode
import leetcode707.MyLinkedList

fun main() {

    var head = LinkedNode(1)
    var body2 = LinkedNode(2)
    var body3 = LinkedNode(3)
    var body4 = LinkedNode(4)

    head.next = body2
    body2.next = body3
    body3.next = body4
    body4.next = body2


    var solution = Solution()
    if (solution.hasCircle(head)){
        System.out.println("has circle")
    }else{
        System.out.println("no circle")
    }

}