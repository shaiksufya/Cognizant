# Lab 5 - Retrieving Data from the Database

## Objective
Retrieve data from SQL Server using Entity Framework Core methods such as ToListAsync(), FindAsync(), and FirstOrDefaultAsync().

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
1. Created Product and Category entity classes.
2. Configured AppDbContext.
3. Created and applied migration.
4. Inserted sample data.
5. Retrieved all products using ToListAsync().
6. Retrieved a product using FindAsync().
7. Retrieved an expensive product using FirstOrDefaultAsync().

## Output

All Products:
- Laptop - ₹75000
- Rice Bag - ₹1200

Found: Laptop

Expensive: Laptop
