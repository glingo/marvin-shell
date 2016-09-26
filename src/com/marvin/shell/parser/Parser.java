package com.marvin.shell.parser;

import com.marvin.shell.MethodReference;

public abstract class Parser implements ParserInterface {

    @Override
    public abstract MethodReference parse(String line);
    
}
