package X;

import java.util.Locale;

/* renamed from: X.7XS  reason: invalid class name */
public final class AnonymousClass7XS extends AnonymousClass00R implements C006302t {
    public static final AnonymousClass7XS A00 = new AnonymousClass7XS();

    public AnonymousClass7XS() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        AnonymousClass00C.A0D(str, 0);
        String A1D = C36431kI.A1D(Locale.ROOT, str);
        if (A1D.length() <= 0) {
            return A1D;
        }
        return C90464aC.A0f(C90494aF.A0d(A1D, 1), AnonymousClass000.A0u(), Character.toTitleCase(A1D.charAt(0)));
    }
}
