package X;

import com.whatsapp.Me;
import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.66w  reason: invalid class name */
public final class AnonymousClass66w {
    public final C20810yC A00;
    public final C24261Bt A01;
    public final C19730wQ A02;

    public final String A00() {
        String A012;
        if (this.A00.A0E(4501)) {
            C19730wQ r0 = this.A02;
            r0.A0G();
            Me me = r0.A00;
            if (me == null || (A012 = AnonymousClass1M4.A01(me.cc, me.number)) == null) {
                return "";
            }
            return A012;
        }
        return "";
    }

    public AnonymousClass66w(C19730wQ r1, C20810yC r2, C24261Bt r3) {
        C36321k7.A11(r2, r1, r3);
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = r3;
    }

    public final String A01() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID);
        A0u.append(",");
        A0u.append("weights");
        A0u.append(",");
        A0u.append("smallhead");
        C20810yC r1 = this.A00;
        if (r1.A0E(4196)) {
            A0u.append(",");
            A0u.append("animated");
        }
        if (r1.A0E(7949)) {
            A0u.append(",");
            A0u.append("squidF");
        }
        String A19 = C36431kI.A19(r1, 6112);
        if (A19.length() > 0) {
            A0u.append(",");
            A0u.append(A19);
        }
        return C36381kD.A0y(A0u);
    }
}
