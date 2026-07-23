# Exercise 7 – Financial Forecasting

## 📖 Overview

This exercise demonstrates the implementation of **Recursion** to predict future financial values based on historical growth rates. Financial forecasting is widely used in investment planning, revenue estimation, business growth prediction, and retirement planning. The exercise focuses on understanding recursive algorithms, implementing a recursive forecasting solution, analyzing its time complexity, and exploring optimization techniques.

---

## 🎯 Scenario

You are developing a financial forecasting tool that predicts future financial values based on past growth rates. The application should calculate the forecasted value recursively while maintaining simplicity and correctness.

---

## 🎯 Learning Objectives

After completing this exercise, I was able to:

- Understand the concept of recursion.
- Differentiate between the base case and recursive case.
- Implement a recursive algorithm for financial forecasting.
- Analyze the time and space complexity of recursive algorithms.
- Learn optimization techniques to improve recursive solutions.

---

# 🛠 Implementation Steps

## Step 1 – Understanding Recursive Algorithms

Studied recursion as a programming technique where a method calls itself to solve a smaller instance of the same problem.

A recursive solution consists of:

### Base Case

The condition that stops further recursive calls.

### Recursive Case

The part where the function calls itself with a smaller input until the base case is reached.

---

## Step 2 – Financial Forecast Method

Created a recursive method that accepts:

- Initial Investment Amount
- Annual Growth Rate
- Number of Years

The method calculates the future value recursively until the required number of years is completed.

---

## Step 3 – Recursive Formula

The recursive formula used is:

```
FutureValue(n) = FutureValue(n-1) × (1 + GrowthRate)
```

### Base Case

```
FutureValue(0) = InitialValue
```

### Recursive Case

```
FutureValue(n) = FutureValue(n-1) × (1 + GrowthRate)
```

---

## Step 4 – Performance Analysis

Analyzed the recursive solution based on:

- Time Complexity
- Space Complexity
- Stack Memory Usage

Also studied optimization techniques to improve recursive performance.

---

# 📊 Complexity Analysis

## Recursive Solution

| Complexity | Value |
|------------|-------|
| Time Complexity | O(n) |
| Space Complexity | O(n) |

Each recursive call processes one forecasting year and occupies stack memory until the base case is reached.

---

# 🚀 Optimization Techniques

To improve performance, the recursive solution can be optimized using:

### Tail Recursion

- Passes the current calculated value as a parameter.
- Reduces intermediate computations.

### Iterative Approach

- Eliminates recursive stack overhead.
- Uses constant space.

Time Complexity:

```
O(n)
```

Space Complexity:

```
O(1)
```

### Memoization

- Stores previously computed results.
- Prevents redundant calculations.
- Improves efficiency when overlapping subproblems exist.

---

# 💡 Key Concepts Covered

- Recursion
- Base Case
- Recursive Case
- Financial Forecasting
- Time Complexity
- Space Complexity
- Tail Recursion
- Memoization
- Iterative Optimization

---

# 📂 Project Structure

```text
Exercise_7-FinancialForecasting
│
├── Exercise-07-Finanial_Forecast.csproj
├── Program.cs
├── README.md
└── image.png
```

---

# 📂 Files Included

| File | Description |
|------|-------------|
| Exercise-07-Finanial_Forecast.csproj | The .NET SDK how to build, compile, and run the project |
| Program.cs | Implements the recursive financial forecasting algorithm |
| README.md | Project documentation |
| image.png | Output screenshot |

---

# ▶️ Build and Run

```powershell
cd "Exercise_7-FinancialForecasting"
dotnet run
```

---

# 📸 Output

Refer to **image.png** for the execution result.

---

# 🏆 Analysis

The recursive approach provides a simple and intuitive solution for financial forecasting by repeatedly applying the annual growth rate until the desired forecast period is reached.

Although recursion makes the implementation easier to understand, each recursive call consumes stack memory. For larger forecasting periods, iterative solutions or optimized recursive techniques such as tail recursion and memoization are generally preferred because they improve performance and reduce memory usage.

---

# ✅ Learning Outcome

Successfully implemented a recursive financial forecasting solution and gained practical experience in applying recursion to real-world financial problems. This exercise improved my understanding of recursive algorithms, complexity analysis, and optimization techniques such as tail recursion, iteration, and memoization.

---

⭐ This exercise is part of the **Cognizant Digital Nurture 5.0 – Deep Skilling Program**.
