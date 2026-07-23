# Lab 2 - Setting Up the Database Context for a Retail Store

## Objective
Configure Entity Framework Core DbContext and connect a .NET Console Application to SQL Server LocalDB.

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

## Steps Performed
1. Created Product and Category model classes.
2. Created AppDbContext class inheriting from DbContext.
3. Added DbSet properties for Products and Categories.
4. Configured SQL Server LocalDB connection using UseSqlServer().
5. Installed EF Core SqlServer and Design packages.
6. Created Initial Migration.
7. Updated the SQL Server database.

## Commands Used

```bash
dotnet add package Microsoft.EntityFrameworkCore.SqlServer
dotnet add package Microsoft.EntityFrameworkCore.Design

dotnet ef migrations add InitialCreate

dotnet ef database update
```

## Output
- Database Context configured successfully.
- SQL Server database created successfully.
- Products and Categories tables created using EF Core Migration.
