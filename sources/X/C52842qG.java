package X;

/* renamed from: X.2qG  reason: invalid class name and case insensitive filesystem */
public final class C52842qG extends Exception {
    public final int errorCode;

    public String getMessage() {
        return String.valueOf(this.errorCode);
    }

    public C52842qG(int i) {
        this.errorCode = i;
    }
}
