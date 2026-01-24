# E-Lang

A simple interpreted programming language built from scratch using Java.

---

## Overview

E-Lang is a small educational programming language created to understand
how real programming languages work internally.

This project focuses on building a language step by step instead of
only learning syntax or frameworks.

The goal is learning, not production use.

---

## Motivation

Most developers know how to write code, but not how a language:

- Reads a source file
- Breaks code into tokens
- Understands expressions
- Executes instructions

E-Lang is built to understand these concepts by implementing them.

---

## How E-Lang Works (High Level)

1. User provides a `.el` source file
2. The file is read line by line
3. Code is converted into tokens (Lexer)
4. Tokens will be parsed into structure (Parser - upcoming)
5. Code will be interpreted and executed

This follows the same basic pipeline used by real languages.

---

## Project Structure

E-lang/
|
|-- src/          Java source code (lexer, parser, interpreter)
|-- Programs/     Sample .el programs
|-- NOTES.md      Day-wise learning notes
|-- README.md     Project documentation

---

## Day-wise Development

The project is developed incrementally.
Each day represents a learning milestone.

Day-wise mentions are used to:
- Track progress
- Avoid rushing complex concepts
- Keep the code understandable
- Show consistent development

These are progress notes, not tutorials.

---

## Current Features

- Accepts .el source files
- Validates file input
- Reads files using Java I/O
- Tokenizes source code into:
  - Keywords
  - Numbers
# E-Lang

A simple interpreted programming language built from scratch using Java.

---

## Overview

E-Lang is a small educational programming language created to understand
how real programming languages work internally.

This project focuses on building a language step by step instead of
only learning syntax or frameworks.

The goal is learning, not production use.

---

## Motivation

Most developers know how to write code, but not how a language:

- Reads a source file
- Breaks code into tokens
- Understands expressions
- Executes instructions

E-Lang is built to understand these concepts by implementing them.

---

## How E-Lang Works (High Level)

1. User provides a `.el` source file
2. The file is read line by line
3. Code is converted into tokens (Lexer)
4. Tokens will be parsed into structure (Parser - upcoming)
5. Code will be interpreted and executed

This follows the same basic pipeline used by real languages.

---

## Project Structure

E-lang/
|
|-- src/          Java source code (lexer, parser, interpreter)
|-- Programs/     Sample .el programs
|-- NOTES.md      Day-wise learning notes
|-- README.md     Project documentation

---

## Day-wise Development

The project is developed incrementally.
Each day represents a learning milestone.

Day-wise mentions are used to:
- Track progress
- Avoid rushing complex concepts
- Keep the code understandable
- Show consistent development

These are progress notes, not tutorials.

---

## Current Features

- Accepts .el source files
- Validates file input
- Reads files using Java I/O
- Tokenizes source code into:
  - Keywords
  - Numbers
  - Operators
  - Identifiers
- Prints token stream for inspection

---

## Technologies Used

- Java (core implementation)
- Git and GitHub (version control)
- Command-line interface

No external libraries are used.

---

## Future Plans

- Character-based lexer
- Parser with grammar rules
- Abstract Syntax Tree (AST)
- Expression evaluation
- Variables and memory
- Error handling
- Multi-line programs

---

## Project Status

Under active development.
Focused on learning and clarity.

---

## Disclaimer

This project is for educational purposes only
and is not intended for production use.


