package X;

/* renamed from: X.1Su  reason: invalid class name and case insensitive filesystem */
public final class C28471Su {
    public static final C28481Sv A02 = new C28481Sv();
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    public C28471Su(AnonymousClass005 r2, AnonymousClass005 r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

    public final CharSequence A00(CharSequence charSequence) {
        if (charSequence != null) {
            C21060yb r6 = (C21060yb) this.A01.get();
            C19890wg r5 = (C19890wg) this.A00.get();
            if (((long) charSequence.length()) > 1024) {
                StringBuilder sb = new StringBuilder();
                sb.append(charSequence.subSequence(0, 1020));
                sb.append(8230);
                charSequence = sb.toString();
            }
            CharSequence A08 = AnonymousClass6YV.A08(r6, r5, AnonymousClass3TB.A02(charSequence));
            if (A08 != null) {
                return A08;
            }
        }
        return "";
    }
}
