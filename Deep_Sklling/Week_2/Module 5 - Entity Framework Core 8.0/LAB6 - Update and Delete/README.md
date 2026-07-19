# Lab 6 - Updating and Deleting Records

## Objective
Update and delete records using Entity Framework Core.

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
3. Created and applied the initial migration.
4. Inserted sample data.
5. Updated the Laptop price from ₹75000 to ₹70000.
6. Deleted the Rice Bag product.
7. Displayed the remaining products.

## Output

Laptop price updated successfully.
Rice Bag deleted successfully.

Remaining Products:
Laptop - ₹70000
