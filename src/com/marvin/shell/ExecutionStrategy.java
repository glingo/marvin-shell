package com.marvin.shell;

public interface ExecutionStrategy extends Terminable {
    
    Object execute(MethodReference reference);
    
    boolean isReady();
}
