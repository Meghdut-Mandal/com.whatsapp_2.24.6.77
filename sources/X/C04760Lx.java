package X;

/* renamed from: X.0Lx  reason: invalid class name and case insensitive filesystem */
public final class C04760Lx extends AnonymousClass0Y9 {
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            AnonymousClass0Y9.A01(obj, "Invalid double value for ", this.A01, AnonymousClass000.A0u());
            return null;
        }
    }

    public C04760Lx(AnonymousClass0WY r1, Double d, String str) {
        super(r1, d, str);
    }
}
