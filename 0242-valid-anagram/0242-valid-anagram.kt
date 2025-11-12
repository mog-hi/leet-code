class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sMap = s.toMap()
        val tMap = t.toMap()
        
        return sMap == tMap
    }

    fun String.toMap(): Map<Char, Int> {
        val map = mutableMapOf<Char, Int>()
        for (i in this) {
            map[i] = map.getOrDefault(i, 0) + 1
        }
        return map
    }
}