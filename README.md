# Saucedemo Automation Testing Project

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)  
![TestNG](https://img.shields.io/badge/TestNG-7.x-blue)  
![Cucumber](https://img.shields.io/badge/Cucumber-7.x-green)  
![License](https://img.shields.io/badge/license-MIT-orange)

This project automates the **functional testing of [Saucedemo](https://www.saucedemo.com/)** using **Java, Selenium WebDriver, Maven, TestNG, Cucumber BDD, and Page Object Model (POM)**.

## 📌 Features
- **Page Object Model (POM)** for maintainable and scalable code  
- **Cucumber BDD** for behavior-driven testing  
- **Maven** for dependency management  
- **TestNG** for test execution and reporting  
- Covers **15–20 test cases**:
  - Login & Logout  
  - Product Listing & Sorting  
  - Add/Remove Items from Cart  
  - Checkout Process  
  - Order Completion  

## 🏗 Project Structure
```
saucedemo-automation/
│── src/main/java
│   ├── pages/          # Page Object classes
│   ├── utils/          # Driver setup, Config, Waits
│── src/test/java
│   ├── stepdefinitions/ # Cucumber Step Definitions
│   ├── runners/         # TestNG & Cucumber runners
│── src/test/resources
│   ├── features/        # Cucumber feature files
│   ├── config.properties# App configurations
│── pom.xml              # Maven configuration
│── testng.xml           # TestNG suite
```

## 🧪 Test Coverage
- **Smoke Tests** – Critical flows (login, add to cart, checkout)  
- **Sanity Tests** – Basic functionality after minor changes  
- **Regression Tests** – Full suite (11 total test cases)  

## 🚀 How to Run
1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/saucedemo-automation.git
   cd saucedemo-automation
   ```

2. **Install dependencies**
   ```bash
   mvn clean install
   ```

3. **Run with TestNG**
   ```bash
   mvn test -DsuiteXmlFile=testng.xml
   ```

4. **Run with Cucumber**
   ```bash
   mvn test -Dcucumber.options="--tags @smoke"
   ```

## 🧰 Tools & Technologies
- **Java 17+**
- **Selenium WebDriver 4.x**
- **TestNG 7.x**
- **Cucumber 7.x**
- **Maven 3.x**
- **WebDriverManager** for driver setup

## 📊 Reports
- **TestNG Reports** → `target/surefire-reports`  
- **Cucumber HTML Reports** → `target/cucumber-reports`

## 👤 Author
- **Kiran Kumar**  
- Role: Test Automation Engineer  
- Skills: Java | Selenium | TestNG | BDD | Maven | POM  
