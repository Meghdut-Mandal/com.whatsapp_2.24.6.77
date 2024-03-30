package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3gW  reason: invalid class name and case insensitive filesystem */
public final class C71283gW implements C30631aW {
    public final AnonymousClass16E A00;
    public final C20810yC A01;
    public final AnonymousClass16G A02;
    public final C29731Xt A03;

    public /* synthetic */ void BV2() {
    }

    public void BV3() {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor clear;
        Long l;
        if (this.A01.A0E(7705)) {
            AnonymousClass16G r7 = this.A02;
            AnonymousClass2QR r6 = new AnonymousClass2QR();
            AnonymousClass00T r5 = r7.A03;
            SharedPreferences A0E = C36411kG.A0E(r5);
            int i = 0;
            if (A0E != null) {
                i = A0E.getInt("num_statuses_received_key", 0);
            }
            r6.A00 = C36441kJ.A0y(i);
            SharedPreferences A0E2 = C36411kG.A0E(r5);
            int i2 = 0;
            if (A0E2 != null) {
                i2 = A0E2.getInt("num_statuses_viewed_key", 0);
            }
            r6.A02 = C36441kJ.A0y(i2);
            r6.A01 = C36441kJ.A0y(r7.A00("contacts_with_statuses_key").size());
            r6.A03 = C36441kJ.A0y(r7.A00("contacts_with_statuses_viewed_key").size());
            Long l2 = r6.A00;
            if ((l2 == null || l2.longValue() != 0) && ((l = r6.A01) == null || l.longValue() != 0)) {
                r7.A01.Blw(r6);
            }
            SharedPreferences A0E3 = C36411kG.A0E(r5);
            if (A0E3 != null && (edit = A0E3.edit()) != null && (clear = edit.clear()) != null) {
                clear.apply();
                return;
            }
            return;
        }
        C29731Xt r52 = this.A03;
        ArrayList A09 = this.A00.A09();
        AnonymousClass2QR r4 = new AnonymousClass2QR();
        Long A0t = C36411kG.A0t();
        r4.A01 = A0t;
        r4.A03 = A0t;
        r4.A00 = A0t;
        r4.A02 = A0t;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A09.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C36391kE.A1V(next, A0I, ((C65663Sz) next).A0B() ? 1 : 0);
        }
        Iterator it2 = A0I.iterator();
        while (it2.hasNext()) {
            C65663Sz A0h = C36441kJ.A0h(it2);
            r4.A01 = Long.valueOf(C36371kC.A0A(r4.A01) + 1);
            if (A0h.A02() != A0h.A03()) {
                r4.A03 = Long.valueOf(C36371kC.A0A(r4.A03) + 1);
            }
            r4.A00 = Long.valueOf(C36371kC.A0A(r4.A00) + ((long) A0h.A02()));
            r4.A02 = Long.valueOf(C36371kC.A0A(r4.A02) + ((long) (A0h.A02() - A0h.A03())));
        }
        r52.A07.Blw(r4);
    }

    public C71283gW(AnonymousClass16E r1, C20810yC r2, AnonymousClass16G r3, C29731Xt r4) {
        C36321k7.A18(r2, r4, r1, r3);
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
    }
}
