package X;

import android.app.PendingIntent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0Ja  reason: invalid class name and case insensitive filesystem */
public final class C04040Ja extends C12030hO {
    public final Map A00;
    public final /* synthetic */ C10300e1 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C04040Ja(C10300e1 r1, Map map) {
        super(r1);
        this.A01 = r1;
        this.A00 = map;
    }

    public final void A00() {
        C17580re r1;
        C10300e1 r3 = this.A01;
        C07140Wm r5 = new C07140Wm(r3.A0C);
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        Map map = this.A00;
        Iterator A10 = AnonymousClass000.A10(map);
        while (A10.hasNext()) {
            C17590rf r12 = (C17590rf) A10.next();
            if (!r12.BoR() || ((C10390eA) map.get(r12)).A00) {
                A0I2.add(r12);
            } else {
                A0I.add(r12);
            }
        }
        int i = -1;
        int i2 = 0;
        if (A0I.isEmpty()) {
            int size = A0I2.size();
            while (i2 < size) {
                i = r5.A00(r3.A0B, (C17590rf) A0I2.get(i2));
                i2++;
                if (i == 0) {
                }
            }
            AnonymousClass0L0 r13 = new AnonymousClass0L0(i, (PendingIntent) null);
            C10340e5 r0 = r3.A0D;
            AnonymousClass000.A14(r0.A08, new C04080Je(r13, this, r3), 1);
            return;
        }
        int size2 = A0I.size();
        while (true) {
            if (i2 < size2) {
                i = r5.A00(r3.A0B, (C17590rf) A0I.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            } else if (i == 0) {
            }
        }
        AnonymousClass0L0 r132 = new AnonymousClass0L0(i, (PendingIntent) null);
        C10340e5 r02 = r3.A0D;
        AnonymousClass000.A14(r02.A08, new C04080Je(r132, this, r3), 1);
        return;
        if (r3.A03 && (r1 = r3.A01) != null) {
            C07560Yg r14 = (C07560Yg) r1;
            r14.B3T(new C10380e9(r14));
        }
        Iterator A102 = AnonymousClass000.A10(map);
        while (A102.hasNext()) {
            C17590rf r2 = (C17590rf) A102.next();
            C16840qB r15 = (C16840qB) map.get(r2);
            if (!r2.BoR() || r5.A00(r3.A0B, r2) == 0) {
                r2.B3T(r15);
            } else {
                C10340e5 r03 = r3.A0D;
                AnonymousClass000.A14(r03.A08, new C04070Jd(r3, r15), 1);
            }
        }
    }
}
