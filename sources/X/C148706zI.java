package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6zI  reason: invalid class name and case insensitive filesystem */
public final class C148706zI implements AnonymousClass4UH {
    public final C19890wg A00;
    public final AnonymousClass00T A01 = C36431kI.A1I(new AnonymousClass7M9(this));

    public C148706zI(C19890wg r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BOc(String str) {
        AnonymousClass00C.A0D(str, 0);
        Map<String, ?> all = C36411kG.A0E(this.A01).getAll();
        AnonymousClass00C.A08(all);
        Iterator A0y = AnonymousClass000.A0y(all);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            String A0f = C90494aF.A0f(A11);
            Object value = A11.getValue();
            AnonymousClass00C.A0B(A0f);
            if (!AnonymousClass098.A07(A0f, "ab_props:sys:", false)) {
                StringBuilder A0v = AnonymousClass000.A0v(str);
                A0v.append("/abprops config code key: ");
                A0v.append(A0f);
                C36321k7.A1K(value, " config value: ", A0v);
            }
        }
    }

    public /* synthetic */ void BOg(AnonymousClass37W r1) {
    }

    public /* synthetic */ void BOw(String str) {
    }
}
