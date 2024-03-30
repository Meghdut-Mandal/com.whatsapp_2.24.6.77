package X;

import java.security.PrivilegedAction;

public final class AXC implements PrivilegedAction {
    public final /* synthetic */ String A00;

    public AXC(String str) {
        this.A00 = str;
    }

    public Object run() {
        try {
            return Class.forName(this.A00);
        } catch (Exception unused) {
            return null;
        }
    }
}
