# Lab 4 - Inserting Initial Data into the Database

## Objective
Use Entity Framework Core to insert initial data into a SQL Server database using AddRangeAsync() and SaveChangesAsync().

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
3. Created the initial migration.
4. Updated the SQL Server database.
5. Inserted initial Categories:
   - Electronics
   - Groceries
6. Inserted initial Products:
   - Laptop
   - Rice Bag
7. Saved the data using SaveChangesAsync().

## Output
- Migration created successfully.
- Database updated successfully.
- Initial data inserted successfully.
