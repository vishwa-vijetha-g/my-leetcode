class TimeMap {

    HashMap<String,TreeMap<Integer,String>> keyTreeMap;
    
    TreeMap<Integer,String> timeValueMap;

    public TimeMap() {

        keyTreeMap = new HashMap<>();

    }
    
    public void set(String key, String value, int timestamp) {

        timeValueMap = keyTreeMap.getOrDefault(key,new TreeMap<>());

        timeValueMap.put(timestamp,value);

        keyTreeMap.put(key,timeValueMap);
    }
    
    public String get(String key, int timestamp) {

        if(!keyTreeMap.containsKey(key)) return "";

        timeValueMap = keyTreeMap.get(key);

        Integer floorTimestamp = timeValueMap.floorKey(timestamp);

        return (floorTimestamp==null) ? ("") : (timeValueMap.get(floorTimestamp));

    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */