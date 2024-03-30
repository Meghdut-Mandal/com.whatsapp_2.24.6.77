package X;

import java.io.IOException;

/* renamed from: X.5R6  reason: invalid class name */
public class AnonymousClass5R6 extends IOException implements AnonymousClass7h1 {
    public final int errorCode = 201;

    public AnonymousClass5R6(String str) {
        super(str);
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
}
