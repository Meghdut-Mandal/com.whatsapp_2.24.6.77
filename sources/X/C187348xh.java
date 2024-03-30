package X;

import java.io.IOException;

/* renamed from: X.8xh  reason: invalid class name and case insensitive filesystem */
public class C187348xh extends IOException {
    public Throwable cause;

    public C187348xh(String str) {
        super(str);
    }

    public C187348xh(String str, Throwable th) {
        super(str);
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }
}
