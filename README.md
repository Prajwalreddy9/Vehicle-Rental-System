# Vehicle Rental System

## Overview

This is a simple vehicle rental system implemented in Java using Object-Oriented Programming (OOP) principles. It models a vehicle rental scenario with different types of vehicles, customers, and rental details. The system includes classes for vehicles, customers, and rentals, as well as specific implementations for cars and bikes.

## Classes

### `Vehicle`
- **Description**: Abstract class representing a general vehicle.
- **Attributes**:
  - `vehicleID`: Unique identifier for the vehicle.
  - `model`: Model of the vehicle.
  - `rentalRate`: Rental rate per day in Rs.
- **Methods**:
  - `getVehicleID()`: Returns the vehicle ID.
  - `getModel()`: Returns the model of the vehicle.
  - `getRentalRate()`: Returns the rental rate.
  - `displayVehicleInfo()`: Abstract method to display vehicle information.

### `Car` (extends `Vehicle`)
- **Description**: Represents a car with additional details.
- **Attributes**:
  - `doors`: Number of doors in the car.
- **Methods**:
  - `displayVehicleInfo()`: Displays car-specific information including the number of doors.

### `Bike` (extends `Vehicle`)
- **Description**: Represents a bike with additional details.
- **Attributes**:
  - `hasCarrier`: Indicates if the bike has a carrier.
- **Methods**:
  - `displayVehicleInfo()`: Displays bike-specific information including whether it has a carrier.

### `Customer`
- **Description**: Represents a customer in the system.
- **Attributes**:
  - `customerID`: Unique identifier for the customer.
  - `name`: Name of the customer.
- **Methods**:
  - `getCustomerID()`: Returns the customer ID.
  - `getName()`: Returns the name of the customer.

### `Rental`
- **Description**: Represents a rental transaction.
- **Attributes**:
  - `vehicle`: The vehicle being rented.
  - `customer`: The customer renting the vehicle.
  - `rentalDays`: Number of days the vehicle is rented.
- **Methods**:
  - `calculateTotalRent()`: Calculates the total rental amount based on the rental rate and number of days.
  - `displayRentalDetails()`: Displays rental details including customer information, vehicle information, rental days, and total rent.

