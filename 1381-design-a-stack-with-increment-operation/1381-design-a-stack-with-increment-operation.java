class CustomStack {
    int[] stack;
    int[] inc;
    int maxSize;
    int index;

    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
        stack=new int[maxSize];
        inc = new int[maxSize];
        index=-1;
    }
    
    public void push(int x) {
        if(index == maxSize-1){
            return;
        }
        index++;
        stack[index]=x;
    }
    
    public int pop() {
        if(index==-1){
            return -1;
        }
        int res = stack[index]+inc[index];
        if(index>0){
            inc[index-1]+=inc[index];
        }
        inc[index]=0;
        index--;
        return res;
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k-1,index);
        if(limit >=0){
            inc[limit]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */