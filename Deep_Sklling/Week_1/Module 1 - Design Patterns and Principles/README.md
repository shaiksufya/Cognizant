# Module 1 – Design Patterns and Principles

This module introduces fundamental software design principles and commonly used design patterns that help build scalable, maintainable, and reusable applications. The hands-on exercises focus on implementing the **Singleton Pattern** and the **Factory Method Pattern** using C#.

---

# 📌 Exercise 1 – Singleton Pattern

## 📖 Overview

The Singleton Pattern ensures that a class has only one instance throughout the application's lifecycle while providing a global point of access to that instance.

### 🎯 Scenario

A logging utility is required to maintain a **single shared instance** across the application to ensure consistent logging.

### 🎯 Objective

- Understand the Singleton Design Pattern.
- Restrict object creation to one instance.
- Provide global access to the object.
- Verify that only one instance exists.

---

## 📂 Project Structure

```text
SingletonPatternExample
│
├── README.md
├── SingletonPatternExample.cs
├── SingletonPatternExample.csproj
└── image.png
```

---

## 🛠 Files Description

| File | Description |
|------|-------------|
| SingletonPatternExample.cs | Implements the Logger Singleton class and test program |
| SingletonPatternExample.csproj | Project configuration |
| image.png | Output screenshot |
| README.md | Project documentation |

---

## 💡 Concepts Covered

- Singleton Design Pattern
- Private Constructor
- Static Instance
- Global Access Point
- Object-Oriented Programming

---

## ▶️ Implementation Steps

1. Created the `Logger` class.
2. Declared a private static instance.
3. Made the constructor private.
4. Implemented the `GetInstance()` method.
5. Tested that multiple object references point to the same instance.

---

## ✅ Expected Output

The application confirms that only one Logger instance is created and reused throughout the program.

---

# 📌 Exercise 2 – Factory Method Pattern

## 📖 Overview

The Factory Method Pattern provides an interface for creating objects while allowing subclasses to determine which concrete object to instantiate.

### 🎯 Scenario

A document management system needs to create different document types such as:

- Word Document
- PDF Document
- Excel Document

without tightly coupling the client code to the implementation classes.

### 🎯 Objective

- Understand the Factory Method Pattern.
- Create objects using factory classes.
- Achieve loose coupling.
- Improve code maintainability.

---

## 📂 Project Structure

```text
FactoryMethodPatternCSharp
│
├── DocumentFactory.cs
├── ExcelDocument.cs
├── ExcelFactory.cs
├── FactoryMethodPatternCSharp.csproj
├── IDocument.cs
├── PdfDocument.cs
├── PdfFactory.cs
├── Program.cs
├── README.md
├── WordDocument.cs
└── WordFactory.cs
```

---

## 🛠 Files Description

| File | Description |
|------|-------------|
| IDocument.cs | Common interface for all document types |
| DocumentFactory.cs | Abstract Factory class |
| WordDocument.cs | Word document implementation |
| PdfDocument.cs | PDF document implementation |
| ExcelDocument.cs | Excel document implementation |
| WordFactory.cs | Factory for Word documents |
| PdfFactory.cs | Factory for PDF documents |
| ExcelFactory.cs | Factory for Excel documents |
| Program.cs | Demonstrates the Factory Method implementation |
| FactoryMethodPatternCSharp.csproj | Project configuration |
| README.md | Project documentation |

---

## 💡 Concepts Covered

- Factory Method Pattern
- Interfaces
- Abstract Classes
- Inheritance
- Polymorphism
- Loose Coupling

---

## ▶️ Implementation Steps

1. Created the `IDocument` interface.
2. Implemented `WordDocument`, `PdfDocument`, and `ExcelDocument`.
3. Created the abstract `DocumentFactory` class.
4. Implemented `WordFactory`, `PdfFactory`, and `ExcelFactory`.
5. Used factory classes to create document objects.
6. Verified the implementation using the main program.

---

## ✅ Expected Output

```text
Opening Word Document...
Opening PDF Document...
Opening Excel Document...
```

---

# 🛠 Technologies Used

- C#
- .NET
- Object-Oriented Programming
- Design Patterns

---

# 📚 Design Patterns Learned

## Singleton Pattern

- Ensures a class has only one instance.
- Provides a global access point.
- Prevents unnecessary object creation.
- Commonly used for logging, configuration, and caching.

## Factory Method Pattern

- Encapsulates object creation.
- Promotes loose coupling.
- Improves maintainability.
- Makes the application easily extensible.

---

# 🎯 Learning Outcomes

After completing these exercises, I gained practical experience in:

- Implementing the Singleton Design Pattern.
- Implementing the Factory Method Design Pattern.
- Applying Object-Oriented Programming principles.
- Writing reusable and maintainable C# applications.
- Understanding software design best practices.

---

⭐ These exercises are part of the **Cognizant Digital Nurture 5.0 – Deep Skilling Program**.
