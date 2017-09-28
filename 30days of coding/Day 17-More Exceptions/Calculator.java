//Write your code here
/*
* https://www.hackerrank.com/challenges/30-more-exceptions/problem
* most of the code was in the editor already. I learned that exceptions can be passed to the next function like this.
*/
class Calculator{
    
    public int power(int n ,int p) throws Exception{
        if(n<0 || p<0){
            throw new Exception("n and p should be non-negative");
        }
        else{
            return (int)Math.pow(n,p);
        }
    }
}