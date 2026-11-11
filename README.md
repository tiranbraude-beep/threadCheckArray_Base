# Braude College Parking, LPR, and EV Network Project

This project implements a multithreaded Subset Sum algorithm to manage parking spots in a smart campus environment. It includes features such as license plate recognition, live map discovery, reservation, and enforcement of rules for electric vehicle charging and idle penalties.

## Table of Contents
1. [Recursive Multithreaded Subset Sum Algorithm](#recursive-multithreaded-subset-sum-algorithm)
2. [Data Structure Refactoring to ArrayList<Integer>](#data-structure-refactoring-to-arraylistinteger)
3. [Code Documentation with Javadoc](#code-documentation-with-javadoc)
4. [Authors and Git Collaboration Roles](#authors-and-git-collaboration-roles)
5. [Licensing](#licensing)

## Recursive Multithreaded Subset Sum Algorithm

The Subset Sum problem is a classic combinatorial optimization problem where the goal is to determine if there exists a subset of a given set of integers that sums up to a specified target value. In this project, we use a recursive approach with multithreading to solve this problem efficiently.

### Multithreading
- **ThreadCheckArray Class**: This class implements `Runnable` and contains methods for the recursive Subset Sum algorithm.
- **rec Method**: The primary method that performs the recursive search for subsets. It uses two threads: one for subtracting the current element from the target sum, and another for continuing with the same target sum.
- **Thread Synchronization**: To prevent race conditions when accessing shared data such as `flag` and `winArray`, synchronization blocks are used.

## Data Structure Refactoring to ArrayList<Integer>

The original code used an integer array to store the parking spot values. To improve flexibility and accommodate potential changes, the project refactored this to use an `ArrayList<Integer>` instead. This change allows for dynamic resizing of the array and simplifies operations such as adding or removing elements.

### Key Changes:
- **Constructor**: The constructor now initializes an integer array by copying values from an `ArrayList<Integer>` obtained from the `SharedData` object.
- **Synchronization**: Synchronization blocks are used to ensure thread safety when accessing and modifying shared data (`array`).

## Code Documentation with Javadoc

Comprehensive documentation is provided using Javadoc, ensuring that all methods, classes, and parameters are clearly explained. This helps other developers understand the codebase more quickly.

### Key Points:
- **Generic Types**: Proper formatting of generic types like `<Integer>` ensures that Javadoc generates correct HTML without 'unknown tag' errors.
- **Comments**: Each method and class has detailed comments describing its purpose and usage.

## Authors and Git Collaboration Roles

This project was developed by a team of students at Braude College. Below are the roles and contributions of each author:

### Authors:
1. **Author 1**
    - Role: Primary Developer
    - Contributions: Design, implementation of the recursive multithreaded Subset Sum algorithm.

2. **Author 2**
    - Role: Data Structure Refactoring
    - Contributions: Refactored integer array to `ArrayList<Integer>`.

3. **Author 3**
    - Role: Code Documentation
    - Contributions: Wrote Javadoc comments for all classes and methods.

### Git Collaboration Roles:
- **Branching**: Authors created separate branches (`feature/subset-sum`, `refactor/arraylist`, `docs/javadoc`) for different aspects of the project.
- **Pull Requests**: Each author submitted pull requests for their changes, which were reviewed by other team members before merging into the main branch.

## Licensing

This project is licensed under the 'Braude College Academic License'. The license details can be found in the LICENSE file included in the repository. This license ensures that the code can be used and modified by students and academic staff for educational purposes only.

### Key Points:
- **Purpose**: The license allows for free use, distribution, and modification of the software.
- **Restrictions**: The license prohibits commercial use and requires attribution to Braude College.

By following these guidelines, we ensure that our project is transparent, documented, and compliant with academic standards.