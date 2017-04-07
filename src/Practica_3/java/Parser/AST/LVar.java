package AST;

import Errors.*;
import java.io.IOException;
import java.io.BufferedWriter;

public interface LVar {
    public void computeAH1(int type) throws CompilerExc;
    public void generateCode(BufferedWriter w, String tabs) throws IOException;
}
