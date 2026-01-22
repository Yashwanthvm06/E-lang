# ELang – Learning Notes

## Day 1
- Created GitHub repository
- Defined project goal
- Decided to build an interpreted language in Java
- Learned basic Git workflow (clone, commit, push)

This file will track my understanding and progress while building ELang.

## Day 2 – Reading Source Files

- A programming language starts by reading source code as plain text
- .el is just a text file and not a real language yet
- Used Java BufferedReader and FileReader to read files line by line
- Learned how args[] works to accept file names from the command line

Added validation:

- A file must be provided
- Only one file is allowed
- Only .el extension is accepted
- Used trim() to remove extra spaces
- Skipped empty lines
- Understood that reading code does not mean executing it
- Main.java is acting as a temporary interpreter runner

Learned basic project structure:

- src/ → Java source files
- Programs/ → E-lang programs

Learned Git workflow:

-  Create a branch for each day
-  Commit changes
- Push branch to GitHub
- Merge using Pull Request

Result:
E-lang can now safely read .el files and prepare input for further processing.

## Day 3 – Tokenization (Understanding Code)

- Learned that programming languages do not understand full lines directly
- Code is broken into small parts called tokens
- Tokens represent meaningful pieces like keywords, values, and symbols

In E-lang:

- print is treated as a keyword
- Words and symbols after print are values
- One instruction is written per line
- Implemented basic tokenization by splitting lines using spaces
- Each line is processed independently
- No execution logic is added yet
- Focused only on identifying structure, not running commands

Result:
E-lang can now break source code into tokens, which is the foundation for execution logic.

# Day 4 - Lexer + File Handling

## What I learned
- How Java reads files using BufferedReader
- Difference between FileReader and BufferedReader
- What a Lexer is in compiler design
- Why split() is not used in real languages
- How to tokenize input character by character

## Key Concepts
- Token
- TokenType
- Lexer
- Character scanning
- Enum usage

## Current Features
- Keywords (print)
- Numbers
- Operators (+ - * /)

## Next
- Strings
- Parentheses
- Parser
