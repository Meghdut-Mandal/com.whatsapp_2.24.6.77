package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Dg  reason: invalid class name and case insensitive filesystem */
public final class C61743Dg {
    public final AnonymousClass17Y A00;
    public final C32691e2 A01;
    public final C21060yb A02;

    public final C429721s A00(Context context, AnonymousClass3T1 r12, String str) {
        int i;
        Context context2 = context;
        AnonymousClass3T1 r8 = r12;
        C429721s r3 = new C429721s(context2, (C24791Du) this.A01, this.A00, this.A02, r8, str);
        if (r12 instanceof AnonymousClass2bV) {
            r3.A01 = ((AnonymousClass2bV) r8).A00;
            r3.A03 = true;
        }
        AnonymousClass11F r1 = r12.A1J.A00;
        if (AnonymousClass143.A0G(r1)) {
            i = 3;
        } else if (r1 instanceof UserJid) {
            r3.A00 = 2;
            return r3;
        } else if (r1 instanceof C177528dw) {
            i = 1;
        } else {
            if (r1 instanceof C28981Uw) {
                i = 6;
            }
            return r3;
        }
        r3.A00 = i;
        return r3;
    }

    public C61743Dg(AnonymousClass17Y r1, C32691e2 r2, C21060yb r3) {
        C36321k7.A11(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
