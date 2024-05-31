class RandomizedSet {

    public LinkedHashSet<Integer> randomSet;
    public Random random;

    public RandomizedSet() {
        randomSet = new LinkedHashSet<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        return randomSet.add(val);

    }
    
    public boolean remove(int val) {
        return randomSet.remove(val);
    }
    
    public int getRandom() {
        int count = random.nextInt(randomSet.size());
        for(int i:randomSet){
            if(count==0){
                return i;
            }
            count--;
        }

        return 0;

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */