package lv1.customStringSorter

class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        val dictionary = ('a'..'z').associateWith { mutableListOf<String>() }
        
        for (str in strings) {
            val key = str.getOrNull(n) ?: continue

            dictionary[key]?.add(str)
        }
        
        dictionary.forEach { (_, list) -> list.sort() }
        
        return dictionary.toSortedMap().values.flatten().toTypedArray()
    }
}