package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.6PX  reason: invalid class name */
public class AnonymousClass6PX {
    public C001700s A00;
    public C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final C142646pD A03;
    public final C1269566j A04;
    public final C129006Eo A05;
    public final C19970wo A06;
    public final C19770wU A07;
    public final C142616pA A08;
    public final AnonymousClass16D A09;
    public final AnonymousClass1QW A0A;

    public static void A00(AnonymousClass7g1 r7, AnonymousClass6PX r8, int i, int i2, boolean z) {
        List A0w;
        Integer valueOf;
        Integer num = null;
        if (z) {
            A0w = null;
        } else {
            A0w = C36401kF.A0w(r8.A00);
        }
        C142646pD r4 = r8.A03;
        Integer A032 = r8.A05.A03();
        Integer valueOf2 = Integer.valueOf(i2);
        if (A0w == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(A0w.size());
            num = Integer.valueOf(A0w.indexOf(r7) + 1);
        }
        LinkedHashMap A1G = C36431kI.A1G();
        if (valueOf != null) {
            A1G.put("recent_search_count", Integer.valueOf(valueOf.intValue()));
        }
        if (num != null) {
            A1G.put("position", Integer.valueOf(num.intValue()));
        }
        r4.A08(A032, valueOf2, A1G, 1, i, 1);
    }

    public void A02(AnonymousClass7g1 r8) {
        C1269566j r4 = this.A04;
        List A002 = r4.A00();
        boolean z = false;
        for (int i = 0; i < A002.size(); i++) {
            if (A002.get(i).equals(r8)) {
                A002.set(i, r8);
                z = true;
            }
        }
        if (!z) {
            A002.add(r8);
        }
        Collections.sort(A002, r4.A01);
        C1272167k r3 = r4.A00;
        C1501874h.A01(r3.A03, r3, A002.subList(0, Math.min(50, A002.size())), 23);
        this.A00.A0D(r4.A00());
    }

    public void A03(AnonymousClass7g1 r6) {
        C1269566j r4 = this.A04;
        List A002 = r4.A00();
        A002.remove(r6);
        C1272167k r2 = r4.A00;
        C1501874h.A01(r2.A03, r2, A002, 23);
        this.A00.A0D(r4.A00());
    }

    public AnonymousClass6PX(C142616pA r3, C142646pD r4, C1272167k r5, C129006Eo r6, AnonymousClass16D r7, C19970wo r8, AnonymousClass1QW r9, C19770wU r10) {
        this.A06 = r8;
        this.A07 = r10;
        this.A09 = r7;
        this.A0A = r9;
        this.A05 = r6;
        this.A08 = r3;
        this.A03 = r4;
        this.A04 = new C1269566j(r5);
        this.A00 = C36431kI.A0S();
        C1497172m.A00(this.A07, this, 28);
    }

    public ArrayList A01(List list, boolean z) {
        AnonymousClass5EN r1;
        ArrayList A0I = AnonymousClass001.A0I();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass7g1 r6 = (AnonymousClass7g1) it.next();
                boolean z2 = z;
                if (r6 instanceof C135116cA) {
                    C135116cA r62 = (C135116cA) r6;
                    r1 = new AnonymousClass5EN(new C163407q9(r62, this, 1, !z), r62.A01, z2);
                } else if (r6 instanceof C135126cB) {
                    C135126cB r63 = (C135126cB) r6;
                    try {
                        AnonymousClass16D r12 = this.A09;
                        String str = r63.A03;
                        C222713q r0 = AnonymousClass11F.A00;
                        AnonymousClass11F A012 = C222713q.A01(str);
                        C18740tg.A06(A012);
                        AnonymousClass141 A082 = r12.A08(A012);
                        if (A082 != null) {
                            A0I.add(new AnonymousClass5E4(new C119265pX(r63, this), A082, r63.A01, str, C36351kA.A10(r63.A02.split(","))));
                        }
                    } catch (C19740wR e) {
                        Log.i("DirectoryRecentSearchDelegate/createRecentSearchListDirectoryRecentSearchDelegates: one of the business profiles could not be loaded", e);
                    }
                } else if (r6 instanceof C135136cC) {
                    C135136cC r64 = (C135136cC) r6;
                    r1 = new AnonymousClass5EN(new C163407q9(r64, this, 0, !z), r64.A02, r64.A03, z2);
                } else {
                    Log.i("DirectoryRecentSearchDelegate/createRecentSearchListItems: one of the recent searches is of unknown type");
                }
                A0I.add(r1);
            }
        }
        return A0I;
    }
}
