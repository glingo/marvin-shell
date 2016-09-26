package com.marvin.shell.parser;

import com.marvin.shell.MethodReference;

public interface ParserInterface {
    
    MethodReference parse(String line);
    
}
