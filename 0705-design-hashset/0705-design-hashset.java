class MyHashSet {
   private HashSet<Integer> MyHashSet;

    public MyHashSet() {
      
         MyHashSet =new HashSet<>();
        
    }
    
    public void add(int key) {
       MyHashSet.add(key);
        
    }
    
    public void remove(int key) {
    MyHashSet.remove(key);
    }
    
    public boolean contains(int key) {
    return MyHashSet.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */