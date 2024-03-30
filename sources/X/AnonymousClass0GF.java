package X;

/* renamed from: X.0GF  reason: invalid class name */
public class AnonymousClass0GF extends AnonymousClass0f7 {
    public final /* synthetic */ C10720f6 A00;

    public AnonymousClass0GF(C10720f6 r1) {
        this.A00 = r1;
    }

    public String A04() {
        AnonymousClass0UQ r2 = (AnonymousClass0UQ) this.A00.A00.get();
        if (r2 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("tag=[");
        A0u.append(r2.A02);
        return AnonymousClass000.A0q("]", A0u);
    }
}
