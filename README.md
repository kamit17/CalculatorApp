# 📱 CalculatorApp

A simple Java-based Calculator application built using **Apache Ant** for build automation. This project also features a **CI/CD pipeline** powered by **GitHub Actions** and **Ansible** for automated deployment.

---

## 🚀 Features
- Basic arithmetic operations: Addition, Subtraction, Multiplication, and Division.
- Interactive CLI-based interface.
- Automated build and deployment using GitHub Actions and Ansible.

---

## 🗂️ Project Structure

```
CalculatorApp/
├── .github/
│   └── workflows/
│       └── ci-cd-pipeline.yml    # GitHub Actions CI/CD pipeline
├── ansible/
│   ├── hosts                     # Ansible inventory file
│   └── deploy.yml                # Ansible playbook for deployment
├── src/
│   └── com/example/calculator/   # Java source files
│       └── Calculator.java
├── build.xml                     # Apache Ant build script
└── dist/                         # Compiled JAR file (after build)
```

---

## ⚙️ Prerequisites
- **Java Development Kit (JDK)** (version 8 or higher)
- **Apache Ant** (version 1.9 or higher)
- **Git**
- **Ansible** (for deployment automation)

---

## 🏗️ Build and Run the Application

### 1️⃣ **Clone the Repository:**
```bash
git clone https://github.com/kamit17/CalculatorApp.git
cd CalculatorApp
```

### 2️⃣ **Build the Application Using Ant:**
```bash
ant clean   # Clean previous builds
ant compile # Compile the source code
ant jar     # Package the compiled code into a JAR file
```

### 3️⃣ **Run the Application:**
```bash
# Using Ant
ant run

# OR Run the JAR directly
java -jar dist/CalculatorApp.jar
```

---

## 🔄 CI/CD Pipeline with GitHub Actions & Ansible

### 🚀 **CI/CD Workflow**
- **Build Stage:**
  - Compiles the Java code using Ant.
  - Packages the application into a JAR file.
  - Uploads the JAR as an artifact.
- **Deployment Stage:**
  - Uses Ansible to deploy the JAR to the target environment.

### ⚡ **Trigger the Pipeline:**
The pipeline runs automatically on:
- Pushes to the `main` branch
- Pull requests targeting `main`

---

## 📦 Deployment Using Ansible

### 1️⃣ **Configure the Inventory (`ansible/hosts`):**
```ini
[app_servers]
localhost ansible_connection=local
```

### 2️⃣ **Run the Ansible Playbook:**
```bash
ansible-playbook -i ansible/hosts ansible/deploy.yml
```

---

## 👨‍💻 Contributing
1. Fork this repository.
2. Create your feature branch (`git checkout -b feature-xyz`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-xyz`).
5. Open a pull request.

---

## 📜 License
This project is licensed under the **MIT License**.

---

## 🤝 Acknowledgments
- **Apache Ant** for build automation.
- **GitHub Actions** for CI/CD workflows.
- **Ansible** for deployment automation.




