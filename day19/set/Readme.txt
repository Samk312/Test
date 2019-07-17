1. A Set contains no duplicate elements
2. There are 3 commonly used implementations of Set: 
	a. HashSet -- If we need a fast Set then we should go for HashSet.
	b. LinkedHashSet -- If we need a Set that can store the insertion order then we should go for Linked HashSet
	c. TreeSet - If we need a sorted Set then we should fo for TreeSet.
	
3. Underlying Data Structures :
	a. HashSet -- Hashtable
	b. Linked HashSet -- LinkedList+Hashtable
	c. TreeSet -- Tree Structure (red-black tree in algorith book)

4. Time Complexity :
	a. HashSet -- O(1)
	b. Linked HashSet -- O(1)
	c. TreeSet -- O (log(n))