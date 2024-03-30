package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6vS  reason: invalid class name and case insensitive filesystem */
public class C146346vS implements AnonymousClass4U8 {
    public final /* synthetic */ C142466ov A00;

    public C146346vS(C142466ov r1) {
        this.A00 = r1;
    }

    public void BeG(C63593Kq r7) {
        AnonymousClass375 r1;
        C142466ov r5 = this.A00;
        AnonymousClass1P5 r3 = r5.A12;
        AnonymousClass11F r2 = r5.A0I;
        UserJid userJid = r7.A06;
        synchronized (r3.A0Q) {
            Map A15 = C90514aH.A15(r2, AnonymousClass1P5.A05(r3));
            if (A15 != null) {
                if (userJid == null) {
                    r1 = (AnonymousClass375) A15.get(r2);
                } else {
                    r1 = (AnonymousClass375) A15.get(userJid);
                }
                if (r1 != null) {
                    if (AnonymousClass1P5.A0G(r1.A00, C19970wo.A00(r3.A0D))) {
                        C142466ov.A0B(r5, r7);
                    }
                }
            }
        }
    }

    public void BeI(AnonymousClass11F r3, UserJid userJid) {
        C142466ov r1 = this.A00;
        if (r1.A0I.equals(r3)) {
            C142466ov.A06(r1);
        }
    }

    public void BeJ(AnonymousClass11F r4, UserJid userJid) {
        C142466ov r2 = this.A00;
        if (r2.A0I.equals(r4)) {
            if (userJid == null) {
                userJid = C36401kF.A0b(r4);
            }
            C63593Kq r0 = r2.A0Q;
            if (r0 != null && r0.A06.equals(userJid)) {
                r2.A0Q = null;
            }
            Set set = r2.A1B;
            synchronized (set) {
                set.add(userJid);
            }
            C142466ov.A06(r2);
        }
    }
}
