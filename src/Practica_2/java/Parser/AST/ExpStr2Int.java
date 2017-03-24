package AST;

import Errors.*;
import Compiler.SymbolTable;

public class ExpStr2Int implements Exp {
	public final Exp exp;

        public ExpStr2Int(Exp exp) {
		this.exp = exp;
	}
        public int computeType() throws CompilerExc {
            int expType = exp.computeType()
            if (expType == SymbolTable.STRING) {
                return SymbolTable.STRING;
            }

            throw new IlegalTypeExc("Ilegal types: Str2Int( " +SymbolTable.typeToString(expType)+ " )\n" );
        }
}
