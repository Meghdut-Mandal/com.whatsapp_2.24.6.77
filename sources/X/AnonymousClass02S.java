package X;

/* renamed from: X.02S  reason: invalid class name */
public class AnonymousClass02S extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass02S(String str) {
        super(str != null ? str.toString() : "The operation has been canceled.");
    }

    public AnonymousClass02S() {
        super("The operation has been canceled.");
    }
}
