package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.9cb  reason: invalid class name and case insensitive filesystem */
public final class C197919cb {
    public final C001600r A00;
    public final AnonymousClass00T A01;
    public final AnonymousClass6LU A02;
    public final AnonymousClass9ES A03;

    public static final void A00(C187818ya r7, C197919cb r8, UserJid userJid, String str) {
        AnonymousClass6A4 r3 = new AnonymousClass6A4(userJid, str);
        C22468An7 an7 = new C22468An7(r7, r8);
        ArrayList A0I = AnonymousClass001.A0I();
        int i = 0;
        do {
            A0I.add(AnonymousClass8XI.A00);
            i++;
        } while (i < 3);
        Object r5 = new AnonymousClass8XQ(A0I);
        Object r2 = new AnonymousClass8XP(A0I);
        int ordinal = r7.ordinal();
        if (ordinal != 0) {
            r5 = r2;
        }
        ((C001600r) r8.A01.getValue()).A0D(r5);
        if (ordinal != 0) {
            AnonymousClass6LU.A00(r8.A02, r3, an7);
            return;
        }
        AnonymousClass6LU r22 = r8.A02;
        C119465pr r1 = r22.A04;
        r1.A00 = null;
        ((AtomicReference) r1.A01.getValue()).set(r3);
        AnonymousClass6LU.A00(r22, r3, an7);
    }

    public C197919cb(AnonymousClass6LU r2, AnonymousClass9ES r3) {
        this.A02 = r2;
        this.A03 = r3;
        AnonymousClass00U A1I = C36431kI.A1I(C22272AjZ.A00);
        this.A01 = A1I;
        this.A00 = (C001600r) A1I.getValue();
    }
}
