package X;

import java.io.IOException;

/* renamed from: X.5R7  reason: invalid class name */
public class AnonymousClass5R7 extends IOException implements AnonymousClass7h1 {
    public final int errorCode;

    public AnonymousClass5R7(String str, Throwable th, int i) {
        super(str, th);
        this.errorCode = i;
    }

    public int BEE() {
        return this.errorCode;
    }

    public String getMessage() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(super.getMessage());
        A0u.append(" (error_code=");
        A0u.append(this.errorCode);
        return C90474aD.A0f(A0u);
    }

    public AnonymousClass5R7(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public AnonymousClass5R7(Throwable th) {
        super(th);
        this.errorCode = 200;
    }

    public AnonymousClass5R7() {
        this.errorCode = 605;
    }
}
