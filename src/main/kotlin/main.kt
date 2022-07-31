fun main() {
    var lista = mutableListOf(1,2,5,4,3,8,7,9,10,6)
    Algorithm.SortingAlgorithms.quick_sort(lista,0,lista.size-1)
    println(lista)
    println(Algorithm.SearchingAlgorithms.BinarySearch(lista,7))
}