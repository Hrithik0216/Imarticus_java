const pi = 3.14159;

class Circle {
  #radius; // Private variable for radius
  #color; // Private variable for color

  constructor(radius, color) {
    this.#radius = radius;
    this.#color = color;
  }

  // Getter method for radius
  get radius() {
    return this.#radius;
  }

  // Setter method for radius
  set radius(radius) {
    if (radius > 0) {
      this.#radius = radius;
    } else {
      console.log("Radius must be greater than 0.");
    }
  }

  // Getter method for color
  get color() {
    return this.#color;
  }

  // Setter method for color
  set color(color) {
    this.#color = color;
  }

  // Method to calculate and return the area
  getArea() {
    return pi * this.#radius ** 2;
  }

  // Method to calculate and return the circumference
  getCircumference() {
    return 2 * pi * this.#radius;
  }
}

// Example usage
const circle = new Circle(10, "red");

// Get and print the initial values
console.log("Initial Radius:", circle.radius);
console.log("Initial Color:", circle.color);

// Calculate and print the initial area and circumference
console.log("Initial Area:", circle.getArea());
console.log("Initial Circumference:", circle.getCircumference());

// Set new values for radius and color
circle.radius = 15;
circle.color = "blue";

// Get and print the updated values
console.log("Updated Radius:", circle.radius);
console.log("Updated Color:", circle.color);

// Calculate and print the updated area and circumference
console.log("Updated Area:", circle.getArea());
console.log("Updated Circumference:", circle.getCircumference());
