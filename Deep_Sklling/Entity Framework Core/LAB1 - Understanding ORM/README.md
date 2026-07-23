# Lab 1 - Understanding ORM with EF Core 8.0

## Objective
To understand Object Relational Mapping (ORM) and implement Entity Framework Core with SQL Server in a Retail Inventory System.

## Technologies Used
- C#
- .NET
- Entity Framework Core
- SQL Server LocalDB

## Features
- Created Product and Category entity classes.
- Configured DbContext (RetailContext).
- Connected to SQL Server LocalDB.
- Created Initial Migration.
- Generated RetailInventoryDB using EF Core Migrations.

## Commands Used

```bash
dotnet add package Microsoft.EntityFrameworkCore.SqlServer
dotnet add package Microsoft.EntityFrameworkCore.Design

dotnet ef migrations add InitialCreate

dotnet ef database update
