/*
*https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/forum
*In this implementation we take the low and high bond of the problem to decide if there is a binary search tree.
*my first implementation was sloopy since we traversed the tree such that we only keep track of the current node.
*Creating a minimum and maximum value was needed to keep track of values that are at the current scoope of the
*problem. This way we compared we the upper and lower bind accordingly.
*There is another way to solve the problem and it used another data structure to keep track of the elements in the
*tree, since an innorder operation could bring the data in the appropriate form it was easier to manage in 
*another data structure. but it used more space in memory. That was my first guess.
*/

boolean checkBST(Node root) {
	return check(root,0,100000);
}
boolean check(Node n, int min, int max){
	if(n==null)
		return true;
	if(n.data <= min || n.data >= max)
		return false;
	return check(n.left, min, n.data) 
		&& check(n.right, n.data, max);
}

/*second answer*/

boolean checkBST(Node root) {
    ArrayList<Integer> arr=new ArrayList<Integer>();
    inorder(root,arr);
    int flag=0;
    for(int i=1;i<arr.size();i++)
        if(arr.get(i)>arr.get(i-1))
            continue;
        else
            return false;
    return true;
}

void inorder(Node root,ArrayList<Integer> ar)
{
    if(root==null)return;
    inorder(root.left,ar);
    ar.add(root.data);
    inorder(root.right,ar);
}