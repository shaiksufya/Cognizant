# Lab 7 - Writing Queries with LINQ

## Objective
Use LINQ queries with Entity Framework Core to retrieve, filter, sort, and project data.

## Technologies Used
- C#
- .NET
- Entity Framework Core
- SQL Server LocalDB

## Files
- Program.cs
- Product.cs
- Category.cs
- AppDbContext.cs

## Commands Used

```bash
dotnet ef migrations add InitialCreate
dotnet ef database update
dotnet run
```

## Steps Performed
1. Created Product and Category models.
2. Configured AppDbContext.
3. Inserted sample product data.
4. Retrieved products using LINQ.
5. Filtered products with `Where()`.
6. Sorted products using `OrderByDescending()`.
7. Projected data into DTOs using `Select()`.

## Output

Products with Price > 1000

- Laptop - ₹75000
- Mouse - ₹1500

Product DTOs

- Laptop - ₹75000
- Mouse - ₹1500
- Keyboard - ₹800
