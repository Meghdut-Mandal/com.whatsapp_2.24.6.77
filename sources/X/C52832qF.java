package X;

/* renamed from: X.2qF  reason: invalid class name and case insensitive filesystem */
public class C52832qF extends Exception {
    public final String message;

    public C52832qF() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Package ");
        A0u.append("com.facebook.stella");
        this.message = AnonymousClass000.A0q(" not authorized", A0u);
    }

    public String getMessage() {
        return this.message;
    }
}
