public int minimumCardPickup(int[] cards) {
        int n = cards.length;
        int res = n + 1;
        
        Map<Integer, Integer> map = new HashMap();
        
        for (int i = 0; i < n; i++) {
            if (map.containsKey(cards[i])) {
                res = Math.min(res, i - map.get(cards[i]) + 1);
            }

            map.put(cards[i], i);
        }
        
        return res == n + 1 ? -1 : res;
    }