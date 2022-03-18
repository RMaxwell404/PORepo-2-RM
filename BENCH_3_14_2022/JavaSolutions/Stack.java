class StackImpl{
    private Int[] sta;
    private Int top;
    private int capacity;

    public StackImpl(int cap){
        sta = new Int[cap];
        capacity = cap;
        top = -1;
    }

    public void push(Int val){
        if (top == capacity - 1){
            System.out.println("Overflow!")
        }
        sta[++top] = val;
    }

    public Int pop(){
        if(top != -1){
            return arr[top--]

        }
        else throw error;
    }
    public Int max(){
        if(top != -1){
            Int highest = 0;
            for(Int i = 0; i < capacity; i++){
                if (sta[i] > highest){
                    highest = sta[i]
                }
            }
            return highest;
        }
        else throw error;
    }

}