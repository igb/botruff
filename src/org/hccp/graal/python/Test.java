package org.hccp.graal.python;

import org.graalvm.polyglot.*;


public class Test  {
    public static void main(String[] args) throws Exception {
	Context context = Context.create();
	System.out.println(context.eval("python", "'Hello Python!'").asString());
    }
    

}
