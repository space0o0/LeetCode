package circleLinked

import leetcode707.ListNode

fun main() {

    var head = ListNode(1)
    var body2 = ListNode(2)
    var body3 = ListNode(3)
    var body4 = ListNode(4)
    var body5 = ListNode(5)

    head.next = body2
    body2.next = body3
    body3.next = body4
    body4.next = body5


    var solution = Solution()
    solution.removeNthFromEnd(head, 2)

}