package AST;

import Errors.*;
import java.io.IOException;
import java.io.BufferedWriter;

public interface S {
    public void computeAH1() throws CompilerExc;
    public void generateCode(BufferedWriter w, String tabs) throws IOException;
}
