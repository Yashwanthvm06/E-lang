# E-lang – Core Programming Language Development Notes

---

## Day 1 – Language Idea & Scope
- Decided to build a simple interpreted language (E-lang)
- Language goals:
  - Variables
  - Expressions
  - Print/output
  - Step-by-step compiler architecture
- Chose Java for implementation

---

## Day 2 – Source Code Handling
- Read source code from file
- Process code line by line
- Maintain line numbers for error reporting
- Understood difference between source text vs program structure

---

## Day 3 – Tokenization (Lexer Basics)
- Broke source code into tokens
- Tokens represent smallest meaningful units
- Implemented:
  - Numbers
  - Identifiers
  - Operators
  - Parentheses
- Lexer does NOT execute code

---

## Day 4 – Token Metadata
- Added:
  - TokenType enum
  - Token value
  - Line number
  - Column number
- Improved error messages
- Lexer now produces rich tokens

---

## Day 5 – Keywords & Strings
- Added keyword support (`emit`)
- Implemented string literals
- Handled unterminated strings
- Differentiated keywords vs identifiers

---

## Day 6 – Expression Parsing (Parser Basics)
- Introduced recursive descent parser
- Implemented:
  - parseFactor
  - parseTerm
  - parseExpression
- Handled operator precedence (* / before + -)

---

## Day 7 – Abstract Syntax Tree (AST)
- Introduced Node base class
- Each syntax construct = AST node
- Separated parsing from execution
- AST represents program structure

---

## Day 8 – Expression Evaluation
- Implemented evaluation logic inside nodes
- Created:
  - NumberNode
  - StringNode
  - BinaryNode
- Expressions now execute correctly

---

## Day 9 – Variables & Assignment
- Implemented variable assignment
- Added AssignNode
- Introduced Environment for variable storage
- Variables persist across expressions

---

## Day 10 – Output / Emit Statement
- Implemented emit(expr)
- Added EmitNode
- Enabled visible program output
- Differentiated statements vs expressions (conceptually)

---

## Day 11 – Program-Level Thinking
- Realized single-line parsing is insufficient
- Identified need for:
  - Program root
  - Multiple statement execution
- Understood real interpreter flow

---

## Day 12 – Program-Level Lexing
- Lexer upgraded to handle full programs
- Combined tokens from all lines
- Added EOF token
- Parser now receives complete token stream

---

## Day 13 – Program-Level Parsing
- Introduced ProgramNode as AST root
- Added parseProgram() to parser
- Parser now:
  - Consumes tokens until EOF
  - Builds list of statements
- Program executes sequentially

---

## Current Architecture Summary
Source Code  
→ Lexer (tokenizeProgram)  
→ Tokens + EOF  
→ Parser (parseProgram)  
→ AST (ProgramNode)  
→ Environment  
→ Evaluation  

---

## Next Planned Steps
- Block parsing `{ }`
- Nested scopes
- if / while control flow
- Functions
- Return statements

---

## Key Learnings
- Lexer ≠ Parser ≠ AST ≠ Execution
- Programs are sequences, not single expressions
- EOF is critical for safe parsing
- Environment controls program state
- Clean structure matters more than features

---

## Status
- Core interpreter foundation complete
- Ready for control flow and functions
