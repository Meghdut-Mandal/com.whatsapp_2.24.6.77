package X;

/* renamed from: X.5VR  reason: invalid class name */
public class AnonymousClass5VR extends Exception implements AnonymousClass7h1 {
    public final int errorCode;

    public AnonymousClass5VR(int i) {
        super("received error message");
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
}
