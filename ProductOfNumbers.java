class ProductOfNumbers {

    List<Integer> temp;

    public ProductOfNumbers() {
        temp = new ArrayList<>();
    }
    
    public void add(int num) {
        temp.add(num);
    }
    
    public int getProduct(int k) {
        int out = 1;
        int size = temp.size();
        for(int i=size-1; i>=size-k; i--){
            out *= temp.get(i);
        }
        return out;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
