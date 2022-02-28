package algorithms


internal class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val ans: ArrayList<List<Int>> = ArrayList()
        val index = 0
        backtracking(ans, ArrayList(), nums, index)
        return ans
    }

    private fun backtracking(ans: MutableList<List<Int>>, list: MutableList<Int>, nums: IntArray, index: Int) {
        if (index == nums.size) {
            ans.add(ArrayList(list))
            return
        }
        list.add(nums[index])
        backtracking(ans, list, nums, index + 1)
        list.removeLast()
        backtracking(ans, list, nums, index + 1)


    }

}