学习笔记

一、deque接口继承queue接口：

​	deque有以下方法：

1. void addFirst(E e);插入一个元素到队列前面
2. void addLast(E e);插入一个元素到队列后面
3. boolean offerFirst(E e);插入一个元素到队列前面，如果违反容量限制，就抛出异常
4. boolean offerLast(E e);插入一个元素到队列后面，如果违反容量限制，就抛出异常
5. E removeFirst();检索并删除此deque的第一个元素
6. E removeLast();检索并删除此deque的最后一个元素
7. E pollFirst();还回第一个元素，如果队列是空则还回null值
8. E pollLast();还回最后一个元素，如果队列是空则还回null值
9. E getFirst();还回第一个元素，如果是空的队列就抛异常
10. E getLast();还回最后一个元素，如果是空的队列就抛异常
11. E peekFirst();还回第一个元素，如果是空的队列就返回null
12. E peekLast();还回最后一个元素，如果是空的队列就返回null
13. boolean removeFirstOccurrence(Object o);从此deque中删除指定元素的第一个出现，未成功抛异常
14. boolean removeLastOccurrence(Object o);从此deque中删除指定元素的最后一个出现，未成功抛异常

二、priorityqueue

​	1.Java中PriorityQueue通过二叉小顶堆实现，可以用一棵完全二叉树表示。即优先队列。**优先队列的作用是能保证每次取出的元素都是队列中权值最小的**（Java的优先队列每次取最小元素，C++的优先队列每次取最大元素）。这里牵涉到了大小关系，**元素大小的评判可以通过元素本身的自然顺序（\*natural ordering\*），也可以通过构造时传入的比较器**（*Comparator*），Java中*PriorityQueue*实现了*Queue*接口，不允许放入null元素。

​	2.*PriorityQueue*的`peek()`和`element`操作是常数时间，`add()`, `offer()`, 无参数的`remove()`以及`poll()`方法的时间复杂度都是*log(N)*

​	3.`add(E e)`和`offer(E e)`的语义相同，都是向优先队列中插入元素，只是`Queue`接口规定二者对插入失败时的处理不同，前者在插入失败时抛出异常，后则则会返回`false`。对于*PriorityQueue*这两个方法其实没什么差别。

​	4.`element()`和`peek()`的语义完全相同，都是获取但不删除队首元素，也就是队列中权值最小的那个元素，二者唯一的区别是当方法失败时前者抛出异常，后者返回`null`。根据小顶堆的性质，堆顶那个元素就是全局最小的那个；由于堆用数组表示，根据下标关系，`0`下标处的那个元素既是堆顶元素。所以**直接返回数组`0`下标处的那个元素即可**。

​	5.`remove()`和`poll()`方法的语义也完全相同，都是获取并删除队首元素，区别是当方法失败时前者抛出异常，后者返回`null`。



