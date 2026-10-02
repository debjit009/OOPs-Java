# ☕ Java OOPs

This folder contains my **Java Object-Oriented Programming (OOPs)** practice and concepts.

I am learning OOPs concepts step by step and practicing them with simple Java programs.

## 📚 Topics Covered

* Class and Object
* Constructor
* `this` Keyword
* Access Modifiers

  * `public`
  * `private`
  * `protected`
  * Default
* Encapsulation
* Inheritance
* `super` Keyword
* Method Overloading
* Method Overriding
* Polymorphism
* Abstraction
* Interface

## 🔐 Access Modifiers

Access Modifiers are used to control the **visibility and accessibility** of classes, methods, variables, and constructors.

| Modifier    | Same Class | Same Package | Subclass | Other Package |
| ----------- | ---------- | ------------ | -------- | ------------- |
| `public`    | ✅          | ✅            | ✅        | ✅             |
| `protected` | ✅          | ✅            | ✅        | ❌             |
| Default     | ✅          | ✅            | ❌        | ❌             |
| `private`   | ✅          | ❌            | ❌        | ❌             |

### Example

```java
public class Student {

    public String name;
    private int age;
    protected String college;
    String course; // Default

}
```

## 📂 Folder Structure

```text
OOP/

│
├── Class_Object/
├── Constructor/
├── Access_Modifiers/
├── Encapsulation/
├── Inheritance/
├── Polymorphism/
├── Abstraction/
└── Interface/
```

## 🛠️ Language

* Java

## 👨‍💻 Author

**Debjit Das**


