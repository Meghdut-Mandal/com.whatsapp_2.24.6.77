package X;

/* renamed from: X.78P  reason: invalid class name */
public class AnonymousClass78P extends RuntimeException {
    public final int mCameraError;

    public AnonymousClass78P(int i, String str) {
        super(str);
        this.mCameraError = i;
    }

    public String getMessage() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        int i = this.mCameraError;
        if (i == 1) {
            str = "unknown";
        } else if (i == 2) {
            str = "evicted";
        } else if (i != 100) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("other(");
            A0u2.append(i);
            str = C90474aD.A0f(A0u2);
        } else {
            str = "server_died";
        }
        C90494aF.A1M(A0u, str);
        return AnonymousClass000.A0q(super.getMessage(), A0u);
    }
}
