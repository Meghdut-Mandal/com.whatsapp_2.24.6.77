package X;

/* renamed from: X.0kJ  reason: invalid class name and case insensitive filesystem */
public abstract class C13700kJ extends AnonymousClass09z {
    public C13700kJ(C023509x r3) {
        super(r3);
        if (r3 != null && r3.getContext() != C008903u.A00) {
            throw AnonymousClass001.A08("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    public C005102h getContext() {
        return C008903u.A00;
    }
}
