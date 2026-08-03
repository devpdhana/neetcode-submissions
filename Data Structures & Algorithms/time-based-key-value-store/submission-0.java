class PairValue {
    String value;
    int key;
    PairValue(String value, int key) {
        this.value = value;
        this.key = key;
    }
}
class TimeMap {
        
    HashMap<String, ArrayList<PairValue>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        PairValue values = new PairValue(value, timestamp);
        ArrayList<PairValue> listValues = map.get(key);
        listValues.add(values);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }

        String result = "";
        ArrayList<PairValue> listValues = map.get(key);
        int left = 0;
        int right = listValues.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            PairValue pair = listValues.get(mid);
            if (pair.key == timestamp) {
                result = pair.value;
                return result;
            } else if (timestamp > pair.key) {
                result = pair.value;
                left = mid + 1;
            } else if (timestamp < pair.key) {
                right = mid - 1;
            }
        }
        return result;
    }
}
