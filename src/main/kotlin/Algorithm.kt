

class Algorithm {
    class SearchingAlgorithms {
        companion object{
            fun LinearSearch(arr:MutableList<Int>, target: Int): Int {
                var y = -1
                for (i in arr.indices) {
                    if (arr[i] == target) {
                        y = i
                        break
                    }
                }
                return y
            }

            fun BinarySearch(arr: MutableList<Int>, target: Int): Int {
                var index = -1
                return try {
                    var start = 0
                    var end = arr.size - 1
                    var middle = arr.size / 2
                    if (arr[middle] == target) {
                        index = middle
                    } else {
                        while (middle != target && start <= end) {
                            if (arr[middle] < target) {
                                start = middle + 1
                                if (arr[start] == target) {
                                    index = start
                                    break
                                }
                            } else if (arr[middle] > target) {
                                end = middle - 1
                                if (arr[end] == target) {
                                    index = end
                                    break
                                }
                            }
                            middle = (start + end) / 2
                            if (arr[middle] == target) {
                                index = middle
                                break
                            }
                        }
                    }
                    index
                } catch (e: Exception) {
                    -1
                }
            }
        }
    }

    class SortingAlgorithms {
        companion object{
            fun bubble_sort(a: MutableList<Int>): MutableList<Int> {
                for (i in 0 until a.size - 1) {
                    for (j in i until a.size - i - 1) {
                        if (a[j] > a[j + 1]) {
                            val temp = a[j]
                            a[j] = a[j + 1]
                            a[j + 1] = temp
                        }
                    }
                }
                return a
            }

            fun selection_sort(a: MutableList<Int>): MutableList<Int> {
                for (i in a.indices) {
                    var min = i
                    for (j in i until a.size) {
                        if (a[j] < a[min]) {
                            min = j
                        }
                    }
                    if (min != i) {
                        val w = a[i]
                        val b = a[min]
                        a[i] = b
                        a[min] = w
                    }
                }
                return a
            }

            fun quick_sort(a: MutableList<Int>, start: Int, end: Int) {
                if (end <= start) {
                    return
                }
                val pivot = partition(a, start, end)
                quick_sort(a, start, pivot - 1)
                quick_sort(a, pivot + 1, end)
            }

            private fun partition(a: MutableList<Int>, start: Int, end: Int): Int {
                val pivot = a[end]
                var i = start - 1
                for (j in start..end - 1) {
                    if (a[j] < pivot) {
                        i++
                        val y = a[i]
                        val u = a[j]
                        a[i] = u
                        a[j] = y
                    }
                }
                i++
                val y = a[i]
                val u = a[end]
                a[i] = u
                a[end] = y
                return i
            }
        }
    }
}