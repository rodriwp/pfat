package AST;

import Errors.*;
import java.io.IOException;
import java.io.BufferedWriter;

public class SentSimp1 implements Sentencia {
	public final Asign asign;

	public SentSimp1(Asign asign) {
		this.asign = asign;
	}
        public void computeAH1() throws CompilerExc {
                        asign.computeAH1();
        }
        public void checkBreak(int num_breaks) throws CompilerExc {
        }
        public void generateCode(BufferedWriter w, String tabs) throws IOException {
            asign.generateCode(w,tabs);
        }
}
