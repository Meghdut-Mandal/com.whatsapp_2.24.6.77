package X;

import java.security.PrivilegedAction;
import java.security.Security;

public class BAE implements PrivilegedAction {
    public String A00;
    public final int A01;

    public BAE(String str, int i) {
        this.A01 = i;
        this.A00 = str;
    }

    public Object run() {
        if (this.A01 != 0) {
            return System.getProperty(this.A00);
        }
        return Security.getProperty(this.A00);
    }
}
