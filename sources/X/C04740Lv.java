package X;

/* renamed from: X.0Lv  reason: invalid class name and case insensitive filesystem */
public final class C04740Lv extends AnonymousClass0Y9 {
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            AnonymousClass0Y9.A01(obj, "Invalid long value for ", this.A01, AnonymousClass000.A0u());
            return null;
        }
    }

    public C04740Lv(AnonymousClass0WY r1, Long l, String str) {
        super(r1, l, str);
    }
}
