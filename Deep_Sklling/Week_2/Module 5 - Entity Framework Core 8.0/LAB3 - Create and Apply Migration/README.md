# Lab 3 - Using EF Core CLI to Create and Apply Migrations

## Objective
Learn how to use EF Core CLI to create and apply database migrations.

## Tools Used
- C#
- .NET 10 Console Application
- Entity Framework Core 10
- SQL Server LocalDB

## Steps Performed
1. Installed EF Core packages.
2. Created Product and Category models.
3. Created AppDbContext.
4. Generated the initial migration using:
   dotnet ef migrations add InitialCreate
5. Applied the migration using:
   dotnet ef database update
6. Verified that the Products and Categories tables were created in SQL Server LocalDB.

## Output
- Migration created successfully.
- Database updated successfully.
- Products and Categories tables created.
