# Factory Method Pattern Example

## 📖 Overview

This exercise demonstrates the implementation of the **Factory Method Design Pattern** using C#. The Factory Method Pattern provides an interface for creating objects while allowing subclasses to decide which object to instantiate.

---

## 🎯 Scenario

A document management system needs to create different document types such as:

- Word Document
- PDF Document
- Excel Document

without tightly coupling the client code to the concrete classes.

---

## 🎯 Objective

- Understand the Factory Method Pattern.
- Create different document objects using factory classes.
- Achieve loose coupling between object creation and usage.

---

## 🛠 Project Structure

```text
FactoryMethodPatternCSharp
│
├── IDocument.cs
├── DocumentFactory.cs
├── WordDocument.cs
├── PdfDocument.cs
├── ExcelDocument.cs
├── WordFactory.cs
├── PdfFactory.cs
├── ExcelFactory.cs
├── Program.cs
├── FactoryMethodPatternCSharp.csproj
└── README.md
```

---

## ▶️ Build and Run

```powershell
cd "Exercise_2-FactoryMethod\FactoryMethodPatternCSharp"
dotnet run --project "FactoryMethodPatternCSharp.csproj"
```

---

## 📂 Files

| File | Description |
|------|-------------|
| IDocument.cs | Defines the common interface for all document types. |
| DocumentFactory.cs | Abstract factory class responsible for creating documents. |
| WordDocument.cs | Implementation of the Word document. |
| PdfDocument.cs | Implementation of the PDF document. |
| ExcelDocument.cs | Implementation of the Excel document. |
| WordFactory.cs | Factory class for creating Word documents. |
| PdfFactory.cs | Factory class for creating PDF documents. |
| ExcelFactory.cs | Factory class for creating Excel documents. |
| Program.cs | Entry point that demonstrates the Factory Method Pattern. |
| FactoryMethodPatternCSharp.csproj | .NET project configuration file. |
| README.md | Project documentation. |

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
2. Implemented the concrete document classes:
   - `WordDocument`
   - `PdfDocument`
   - `ExcelDocument`
3. Created the abstract `DocumentFactory` class.
4. Implemented concrete factory classes:
   - `WordFactory`
   - `PdfFactory`
   - `ExcelFactory`
5. Used the factory classes to create document objects.
6. Verified the implementation through the `Program.cs` file.

---

## ✅ Expected Output

```text
Opening Word Document...
Opening PDF Document...
Opening Excel Document...
```

---

## 🏆 Learning Outcome

Successfully implemented the **Factory Method Design Pattern**, enabling flexible and scalable object creation while following object-oriented design principles. This exercise improved my understanding of abstraction, polymorphism, and loose coupling in object-oriented software design.
