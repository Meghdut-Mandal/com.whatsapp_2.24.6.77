package X;

import android.app.Application;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7y9  reason: invalid class name and case insensitive filesystem */
public class C167497y9 extends AnonymousClass08X {
    public final C001700s A00 = C36431kI.A0S();
    public final C63553Km A01;
    public final AnonymousClass1KK A02;
    public final UserJid A03;
    public final C19730wQ A04;
    public final AnonymousClass16A A05;
    public final C26421Kc A06;
    public final AnonymousClass185 A07;
    public final C19770wU A08;

    public void A0R() {
        this.A06.unregisterObserver(this.A05);
    }

    public void A0T() {
        AVW.A00(this.A08, this, 2);
    }

    public C167497y9(Application application, C19730wQ r4, C63553Km r5, AnonymousClass1KK r6, C26421Kc r7, AnonymousClass185 r8, UserJid userJid, C19770wU r10) {
        super(application);
        BAP bap = new BAP(this, 1);
        this.A05 = bap;
        this.A08 = r10;
        this.A04 = r4;
        this.A07 = r8;
        this.A02 = r6;
        this.A06 = r7;
        this.A01 = r5;
        this.A03 = userJid;
        r7.registerObserver(bap);
    }

    public static long A01(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass6B4 A0M = C165617ti.A0M(it);
            if (A0M.A02.A0F.equals(str)) {
                return A0M.A00;
            }
        }
        return 0;
    }

    public static HashSet A02(List list, List list2) {
        HashSet A16 = C36441kJ.A16();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A16.add(C165617ti.A0M(it).A02.A0F);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            A16.add(C165617ti.A0M(it2).A02.A0F);
        }
        return A16;
    }

    public String A0S(C18820ts r6, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = (int) (((long) i) + C165617ti.A0M(it).A00);
        }
        if (i == 0) {
            return "";
        }
        if (i <= 999) {
            return r6.A0M().format((long) i);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(r6.A0M().format(999));
        return AnonymousClass000.A0q("+", A0u);
    }
}
