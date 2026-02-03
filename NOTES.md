# ELang – Learning Notes

## Day 1 – Project Setup
- Created Java project
- Created GitHub repository
- Learned javac and java commands
- Understood folder structure
- Goal is to build a small programming language

## Day 2 – File Reading
- Program takes file name from command line
- Only .el files are accepted
- Used FileReader
- Used BufferedReader
- Read file line by line
- Printed each line

## Day 3 – Tokenization
- Source code is broken into tokens
- Tokens are small meaningful parts of a line
- Used String.split(" ") to tokenize
- Tokenization does not execute code
- This is the first real step of a language

## Day 4 – Token Class
- Created Token class
- Token has type and value
- Created TokenType enum
- Types include NUMBER, KEYWORD, OPERATOR, STRING, IDENTIFIER
- Tokens are now objects instead of strings

## Day 5 – Lexer
- Created Lexer class
- Reads characters one by one
- Builds tokens manually
- Detects numbers
- Detects keywords
- Detects strings
- Detects operators
- Returns List of Token

## Day 6 – AST Introduction
- AST means Abstract Syntax Tree
- Tree represents code structure
- Created Node base class
- Created NumberNode
- Created BinaryNode
- Nodes represent structure not calculation

## Day 7 – Evaluation
- Added evaluate() method in Node
- NumberNode returns number
- BinaryNode evaluates left and right
- BinaryNode applies operator
- Tree can now calculate result

## Day 8 – Pipeline
- File is read
- Lexer creates tokens
- Parser will build AST
- AST is evaluated
- Flow: File → Tokens → AST → Result

## Day 9 – Parser Basics
- Created Parser class
- Parser stores token list
- Parser tracks current position
- peek() looks at current token
- consume() moves to next token
- match() checks expected token

## Day 9 – parseFactor
- Handles numbers
- Handles parentheses
- Creates NumberNode
- Calls parseExpression for brackets

## Day 9 – parseTerm
- Handles * and /
- Calls parseFactor
- Builds BinaryNode
- Returns left node

## Day 9 – parseExpression
- Handles + and -
- Calls parseTerm
- Builds BinaryNode
- Returns root of AST
