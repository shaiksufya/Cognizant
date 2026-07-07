# Exercise 2 – E-commerce Platform Search Function

## 📖 Overview

This exercise focuses on implementing efficient searching techniques for an e-commerce platform. Since customers frequently search for products using their **Product ID**, **Product Name**, or **Category**, selecting an appropriate searching algorithm is essential for improving application performance and user experience.

The exercise demonstrates the implementation of **Linear Search** and **Binary Search**, compares their efficiency using **Big O Notation**, and evaluates which algorithm is more suitable for handling large product datasets.

---

## 🎯 Scenario

You are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance while handling a large number of products efficiently.

---

## 🎯 Learning Objectives

After completing this exercise, I was able to:

- Understand Big O Notation and algorithm analysis.
- Explain Best, Average, and Worst Case scenarios.
- Create a Product class for searching.
- Implement Linear Search.
- Implement Binary Search.
- Compare the performance of searching algorithms.
- Analyze which algorithm is better suited for an e-commerce application.

---

# 🛠 Implementation Steps

## Step 1 – Understanding Asymptotic Notation

Studied **Big O Notation**, which measures the efficiency of algorithms based on input size.

### Big O helps to:

- Measure algorithm efficiency.
- Compare different algorithms.
- Predict performance on large datasets.
- Optimize application response time.

### Common Time Complexities

| Complexity | Description |
|------------|-------------|
| O(1) | Constant Time |
| O(log n) | Logarithmic Time |
| O(n) | Linear Time |
| O(n log n) | Linearithmic Time |
| O(n²) | Quadratic Time |
| O(2ⁿ) | Exponential Time |

---

## Step 2 – Product Class

Created a **Product** class containing:

- Product ID
- Product Name
- Category

These attributes are used during product search operations.

---

## Step 3 – Search Algorithms

Implemented two searching algorithms:

### Linear Search

- Searches elements sequentially.
- Works on unsorted arrays.
- Easy to implement.

### Binary Search

- Searches by repeatedly dividing the search space.
- Requires the array to be sorted.
- Faster than Linear Search for large datasets.

Products are stored:

- In an array for Linear Search.
- In a sorted array for Binary Search.

---

## Step 4 – Performance Analysis

Compared the efficiency of both algorithms using Big O Notation.

### Linear Search

| Case | Complexity |
|------|------------|
| Best | O(1) |
| Average | O(n) |
| Worst | O(n) |

### Binary Search

| Case | Complexity |
|------|------------|
| Best | O(1) |
| Average | O(log n) |
| Worst | O(log n) |

---

# 📊 Algorithm Comparison

| Feature | Linear Search | Binary Search |
|---------|---------------|---------------|
| Data Requirement | Unsorted | Sorted |
| Best Case | O(1) | O(1) |
| Average Case | O(n) | O(log n) |
| Worst Case | O(n) | O(log n) |
| Large Dataset Performance | Slow | Fast |
| Ease of Implementation | Easy | Moderate |

---

# 📂 Project Structure

```text
Exercise_2-EcommerceSearch
│
├── Product.cs
├── Program.cs
├── README.md
└── image.png
```

---

# 📂 Files Included

| File | Description |
|------|-------------|
| Product.cs | Defines the Product class with Product ID, Product Name, and Category |
| Program.cs | Implements Linear Search and Binary Search |
| README.md | Project documentation |
| image.png | Output screenshot |

---

# 💡 Key Concepts Covered

- Big O Notation
- Best, Average & Worst Case Analysis
- Linear Search
- Binary Search
- Arrays
- Searching Algorithms
- Time Complexity
- Algorithm Optimization

---

# ▶️ Build and Run

```powershell
cd "Exercise_2-EcommerceSearch"
dotnet run
```

---

# 📸 Output

Refer to **image.png** for the execution result.

---

# 🏆 Analysis

Linear Search is simple and suitable for small or unsorted datasets. However, it becomes inefficient as the number of products increases.

Binary Search significantly reduces the number of comparisons by repeatedly dividing the search space into halves. Although it requires the data to be sorted, it offers much better performance for large datasets.

For an e-commerce platform containing thousands or millions of products, **Binary Search** is the preferred choice because it provides faster search results and improves the overall user experience.

---

# ✅ Learning Outcome

Successfully implemented **Linear Search** and **Binary Search**, analyzed their performance using **Big O Notation**, and understood why Binary Search is more efficient for large sorted datasets. This exercise strengthened my understanding of searching algorithms, algorithm analysis, and their practical applications in real-world software systems.

---

⭐ This exercise is part of the **Cognizant Digital Nurture 5.0 – Deep Skilling Program**.
