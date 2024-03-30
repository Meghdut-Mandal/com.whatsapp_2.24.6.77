package X;

import java.io.IOException;

/* renamed from: X.8xm  reason: invalid class name and case insensitive filesystem */
public class C187388xm extends IOException {
    public final int reason;

    public C187388xm(int i, Throwable th) {
        super(th);
        this.reason = i;
    }

    public C187388xm(String str, Throwable th, int i) {
        super(str, th);
        this.reason = i;
    }

    public C187388xm(String str, int i) {
        super(str);
        this.reason = i;
    }

    public C187388xm() {
        this.reason = 2008;
    }
}
