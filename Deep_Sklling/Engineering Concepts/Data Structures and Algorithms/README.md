# Exercise 2 – E-commerce Platform Search Function

## 📖 Overview

This exercise demonstrates the implementation and comparison of **Linear Search** and **Binary Search** algorithms for an e-commerce platform. Since customers frequently search for products using Product ID, Product Name, or Category, choosing an efficient searching algorithm is essential for improving application performance and user experience. The exercise also introduces **Big O Notation** to analyze algorithm efficiency and compares the best, average, and worst-case performance of both searching techniques.

---

## 🎯 Scenario

An e-commerce platform contains a large collection of products. To provide faster search results, both Linear Search and Binary Search are implemented and their performance is analyzed to determine the most suitable searching algorithm.

---

## 🎯 Learning Objectives

After completing this exercise, I was able to:

- Understand Big O Notation and algorithm analysis.
- Explain best, average, and worst-case scenarios.
- Create a Product class with Product ID, Product Name, and Category.
- Implement Linear Search and Binary Search algorithms.
- Store products in arrays for searching.
- Compare the time complexity of both algorithms.
- Analyze which search algorithm is more suitable for large-scale applications.

---

## 🛠 Implementation

The implementation consists of:

- Understanding Big O Notation.
- Creating a Product class.
- Implementing Linear Search.
- Implementing Binary Search on sorted data.
- Comparing both algorithms based on execution efficiency and time complexity.

---

## 📊 Time Complexity

### Linear Search

- Best Case – **O(1)**
- Average Case – **O(n)**
- Worst Case – **O(n)**

### Binary Search

- Best Case – **O(1)**
- Average Case – **O(log n)**
- Worst Case – **O(log n)**

---

## 💡 Conclusion

Linear Search is simple and works with unsorted data but becomes inefficient for large datasets. Binary Search requires sorted data but significantly reduces search time, making it the preferred choice for large e-commerce platforms.

---

# Exercise 7 – Financial Forecasting

## 📖 Overview

This exercise demonstrates the use of **Recursion** to forecast future financial values based on historical growth rates. Financial forecasting is widely used for estimating future investments, business revenue, savings, and profits. The exercise focuses on implementing a recursive algorithm, understanding recursive function calls, analyzing complexity, and exploring optimization techniques.

---

## 🎯 Scenario

A financial forecasting application predicts future investment values by repeatedly applying a fixed annual growth rate. The forecasting process is implemented using recursion to calculate future values over a specified number of years.

---

## 🎯 Learning Objectives

After completing this exercise, I was able to:

- Understand recursion and recursive algorithms.
- Differentiate between base case and recursive case.
- Implement a recursive financial forecasting solution.
- Analyze the time and space complexity of recursive algorithms.
- Explore optimization techniques such as tail recursion, iteration, and memoization.

---

## 🛠 Implementation

The implementation consists of:

- Understanding recursion.
- Creating a recursive forecasting method.
- Calculating future values using annual growth rates.
- Implementing base and recursive cases.
- Analyzing algorithm complexity.
- Discussing optimization techniques to improve recursive performance.

---

## 📊 Complexity Analysis

### Recursive Solution

- Time Complexity – **O(n)**
- Space Complexity – **O(n)**

Each recursive call processes one forecasting year and occupies stack memory until the base condition is reached.

---

## 💡 Optimization Techniques

The recursive solution can be optimized using:

- Tail Recursion
- Iterative Approach
- Memoization

These techniques reduce memory usage and improve performance for larger forecasting periods.

---

## 💡 Conclusion

This exercise provided practical experience in applying recursion to solve financial forecasting problems. While recursion offers a simple and intuitive solution, iterative approaches or optimized recursive techniques are generally preferred for large datasets due to better memory efficiency and performance.
