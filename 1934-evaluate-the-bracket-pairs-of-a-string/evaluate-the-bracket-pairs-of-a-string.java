class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        var map = new HashMap<String, String>();
        for (var pair : knowledge) {
            var key = pair.get(0);
            var value = pair.get(1);
            map.put(key, value);
        }

        var res = new StringBuilder();
        var start = 0;
        while (start < s.length()) {
            var cur = s.charAt(start);
            if (cur == '(') {
                var end = s.indexOf(')', start+1);
                var key = s.substring(start+1, end);
                var value = map.get(key);
                res.append(value == null ? "?" : value);
                start = end + 1;
            } else {
                res.append(cur);
                start++;
            }
        }
        return res.toString();
    }
}