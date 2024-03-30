package X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.9ln  reason: invalid class name and case insensitive filesystem */
public final class C202419ln {
    public static final C202419ln A00 = new C202419ln();

    public static final ArrayList A00(AnonymousClass8Q1 r5) {
        C23122B6c<AnonymousClass8P5> b6c;
        if (r5 == null || (b6c = r5.buttons_) == null) {
            return AnonymousClass001.A0I();
        }
        ArrayList A0J = C36321k7.A0J(b6c);
        for (AnonymousClass8P5 r0 : b6c) {
            A0J.add(new C206569tc(new C206969uL(r0.name_, r0.buttonParamsJson_), false));
        }
        return C36361kB.A0q(A0J);
    }

    public static final boolean A01(AnonymousClass8SV r2, String str) {
        AnonymousClass8P5 r22;
        AnonymousClass8Q1 A0u = r2.A0u();
        if (A0u == null || A0u.buttons_.size() != 1) {
            r22 = null;
        } else {
            r22 = (AnonymousClass8P5) A0u.buttons_.get(0);
        }
        if (r22 == null || !str.equals(r22.name_) || TextUtils.isEmpty(r22.buttonParamsJson_)) {
            return false;
        }
        return true;
    }
}
