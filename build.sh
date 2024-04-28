#!/bin/bash

# Change directory to the folder containing your Java files
cd cgpl/src/main/antlr4/com/cgpl

# Run the ANTLR command
antlr -o .antlr CGPL.g4
