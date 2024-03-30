package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Xz  reason: invalid class name and case insensitive filesystem */
public class C133356Xz {
    public C78053rU A00;
    public C95494lK A01;
    public C107175Mv A02;
    public C160667lO A03;
    public List A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public final C19420v0 A07;
    public final C129156Fn A08 = new C162897pK(this, 2);
    public final C129156Fn A09 = new C162897pK(this, 1);
    public final C129156Fn A0A = new C162897pK(this, 3);
    public final AnonymousClass1BB A0B;
    public final AnonymousClass1AP A0C;
    public final AnonymousClass3GT A0D;
    public final C19770wU A0E;
    public final AnonymousClass005 A0F;
    public final HashMap A0G;
    public final HashMap A0H;
    public final HashSet A0I;

    public static void A00(C133356Xz r6) {
        C133356Xz r5 = r6;
        if (r6.A01 != null) {
            C36331k8.A1E(r6.A02);
            C106575Kk r1 = new C106575Kk(r6.A07, r6.A0C, r6.A0D, r5, true);
            r5.A02 = r1;
            C36331k8.A1F(r1, r5.A0E);
        }
    }

    public static void A02(C133356Xz r6, String str, List list) {
        List list2 = list;
        r6.A04 = list;
        C160667lO r0 = r6.A03;
        if (r0 != null) {
            String str2 = str;
            r0.BsL(str2, r6.A0H, r6.A0G, r6.A0I, list2);
        }
    }

    public void A04() {
        C36331k8.A1E(this.A02);
        AnonymousClass1AP r3 = this.A0C;
        C106575Kk r1 = new C106575Kk(this.A07, r3, this.A0D, this, false);
        this.A02 = r1;
        C36391kE.A1Q(r1, this.A0E);
    }

    public static void A01(C133356Xz r4, String str, List list) {
        HashSet hashSet = r4.A0I;
        hashSet.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass68B A0g = C90514aH.A0g(it);
            if (A0g.A0S) {
                hashSet.add(A0g.A0F);
            }
        }
        if (str == null) {
            A02(r4, (String) null, list);
        } else {
            A02(r4, str, list);
        }
    }

    public C133356Xz(C19420v0 r3, AnonymousClass1BB r4, AnonymousClass1AP r5, AnonymousClass3GT r6, C19770wU r7, AnonymousClass005 r8) {
        this.A0C = r5;
        this.A0E = r7;
        this.A0B = r4;
        this.A07 = r3;
        this.A0F = r8;
        this.A0I = C36441kJ.A16();
        this.A0D = r6;
        this.A0H = AnonymousClass001.A0J();
        this.A0G = AnonymousClass001.A0J();
    }

    public ArrayList A03(List list, List list2) {
        HashSet A16 = C36441kJ.A16();
        HashSet A162 = C36441kJ.A16();
        ArrayList A0I2 = AnonymousClass001.A0I();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C135066c4 A0U = C90504aG.A0U(it);
                String str = A0U.A0B;
                if (!A162.contains(str)) {
                    if (!AnonymousClass14B.A0F(str)) {
                        A162.add(str);
                    }
                    A0I2.add(A0U);
                    A16.add(A0U.A0E);
                }
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C135066c4 A0U2 = C90504aG.A0U(it2);
                String str2 = A0U2.A0B;
                if (!A162.contains(str2)) {
                    if (!AnonymousClass14B.A0F(str2)) {
                        A162.add(str2);
                    }
                    C90504aG.A1H(A0U2.A0E, A0U2, A16, A0I2);
                }
            }
        }
        List list3 = this.A04;
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Iterator it4 = C90514aH.A0g(it3).A05.iterator();
                while (it4.hasNext()) {
                    C135066c4 A0U3 = C90504aG.A0U(it4);
                    String str3 = A0U3.A0B;
                    if (!A162.contains(str3)) {
                        if (!AnonymousClass14B.A0F(str3)) {
                            A162.add(str3);
                        }
                        C90504aG.A1H(A0U3.A0E, A0U3, A16, A0I2);
                    }
                }
            }
        }
        return A0I2;
    }
}
