package main

import "fmt"

func generateMatrix(n int) [][]int {
	left, right, top, bottom := 0, n-1, 0, n-1
	matrix := make([][]int,n)
	for i := 0; i < n; i++ {
		matrix[i] = make([]int, n)
	}
	max := n * n
	count := 1

	for i := count; i <= max; i++ {
		for i := left; i <= right; i++ {
			matrix[top][i] = count
			count++
		}
		top++

		for i := top; i <= bottom; i++ {
			matrix[i][right] = count
			count++
		}
		right--

		for i := right; i >= left; i-- {
			matrix[bottom][i] = count
			count++
		}
		bottom--

		for i := bottom; i >= top; i-- {
			matrix[i][left] = count
			count++
		}
		left++

	}
	return matrix
}

func main() {
	matrix := generateMatrix(5)
	for index, value := range matrix {
		fmt.Println(index,value)
	}
}
