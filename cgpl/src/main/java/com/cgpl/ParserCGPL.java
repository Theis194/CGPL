package com.cgpl;

import com.cgpl.AST.Program;

public interface ParserCGPL {
    Program parse(String code);
}
