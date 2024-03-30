package X;

import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.6LI  reason: invalid class name */
public final class AnonymousClass6LI {
    public final AnonymousClass171 A00;
    public final AnonymousClass13J A01;
    public final AnonymousClass00T A02 = C36431kI.A1I(new C152347Kd(this));
    public final AnonymousClass00T A03 = C36431kI.A1I(new C152357Ke(this));
    public final AnonymousClass00T A04 = C36431kI.A1I(new C152367Kf(this));
    public final AnonymousClass00T A05 = C36431kI.A1I(new C152377Kg(this));

    public static final C16260os A00(C119425pn r4, AnonymousClass6LI r5) {
        C16260os r0;
        String A0T;
        C47862ft A0O;
        C16250or r1;
        AnonymousClass6OZ r12 = r4.A00;
        if (r12.A0M) {
            A0O = C90524aI.A0O(new Object[0], R.string.f12nameremoved);
            r1 = new C144086rb(false, true);
        } else if (r12.A0I) {
            Object[] objArr = new Object[1];
            UserJid userJid = r12.A08;
            if (userJid == null) {
                Log.i("InCallControlUseCase/getDisplayName/null peer jid");
                A0T = null;
            } else {
                A0T = r5.A00.A0T(userJid);
                if (A0T == null) {
                    Log.i("InCallControlUseCase/getDisplayName/null display name");
                }
            }
            objArr[0] = A0T;
            A0O = C90524aI.A0O(objArr, R.string.f12nameremoved);
            r1 = C144076ra.A00;
        } else {
            r0 = C144106rd.A00;
            return r0;
        }
        r0 = new C144096rc(r1, A0O);
        return r0;
    }

    public AnonymousClass6LI(AnonymousClass171 r2, AnonymousClass13J r3) {
        C36321k7.A0x(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }
}
