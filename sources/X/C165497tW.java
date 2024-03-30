package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7tW  reason: invalid class name and case insensitive filesystem */
public class C165497tW implements C160227kf {
    public Object A00;
    public final int A01;

    public C165497tW(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BVK() {
        switch (this.A01) {
            case 0:
                AnonymousClass3TI.A00("LinkActionIqHelper/Iq delivery fail");
                ((C160227kf) this.A00).BVK();
                return;
            case 1:
                ((C124315xx) this.A00).A00.A0t();
                return;
            default:
                AnonymousClass5u1 r6 = (AnonymousClass5u1) this.A00;
                AnonymousClass66M r5 = (AnonymousClass66M) r6.A01.A05.get();
                AnonymousClass6DN r2 = r6.A02;
                String str = r2.A04;
                C23931Ak r0 = r2.A02;
                ArrayList A0z = C36351kA.A0z(r0);
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    C90464aC.A1T(A0z, it);
                }
                C23931Ak r02 = r2.A01;
                ArrayList A0z2 = C36351kA.A0z(r02);
                Iterator it2 = r02.iterator();
                while (it2.hasNext()) {
                    C127986Ak.A00(A0z2, it2);
                }
                r5.A01(str, A0z, A0z2);
                AnonymousClass62H r22 = r6.A00;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("CrosspostRequestSessionManager/Crosspost delivery failure for session: ");
                String str2 = r22.A01.A04;
                AnonymousClass00C.A0D(AnonymousClass000.A0p("CrosspostRequestSessionManager/[Retry]Delivery Failure encountered for session: ", str2, C36401kF.A0t(str2, C90464aC.A1Z(str2, A0u) ? 1 : 0)), 0);
                return;
        }
    }

    public void BWl(Exception exc, Integer num) {
        switch (this.A01) {
            case 0:
                StringBuilder A0i = C36341k9.A0i(exc);
                A0i.append("LinkActionIqHelper/Iq sent error with code ");
                A0i.append(num);
                AnonymousClass3TI.A02(AnonymousClass000.A0t(A0i, ' '), exc);
                ((C160227kf) this.A00).BWl(exc, num);
                return;
            case 1:
                ((C124315xx) this.A00).A00.A0t();
                return;
            default:
                AnonymousClass5u1 r3 = (AnonymousClass5u1) this.A00;
                AnonymousClass3TI.A00("CrosspostRequestManager/crosspostRequestIQ unknown error");
                AnonymousClass6DN r2 = r3.A02;
                C23931Ak r0 = r2.A01;
                ArrayList A0z = C36351kA.A0z(r0);
                Iterator it = r0.iterator();
                while (it.hasNext()) {
                    C127986Ak.A00(A0z, it);
                }
                C23931Ak r02 = r2.A02;
                ArrayList A0z2 = C36351kA.A0z(r02);
                Iterator it2 = r02.iterator();
                while (it2.hasNext()) {
                    C90464aC.A1T(A0z2, it2);
                }
                AnonymousClass6LN r03 = r3.A01;
                AnonymousClass6R9.A00(r03.A00, r03.A02, r03.A04, A0z2, A0z, 4);
                r3.A00.A00(new AnonymousClass5P0(-1));
                return;
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C1511478k r0;
        Long A15;
        switch (this.A01) {
            case 0:
                C120395rR r11 = (C120395rR) obj;
                AnonymousClass00C.A0D(r11, 0);
                ((C160227kf) this.A00).onSuccess(Boolean.valueOf(r11.A01));
                return;
            case 1:
                if (AnonymousClass000.A1X(obj)) {
                    C1262963i r3 = ((C124315xx) this.A00).A03;
                    if (r3.A00.A00(C113435fX.A00) == null) {
                        r3.A03.A01();
                    } else {
                        r3.A02.A00(new C165037sm(r3, 1));
                    }
                }
                ((C124315xx) this.A00).A00.A0t();
                return;
            default:
                C128236Bl r112 = (C128236Bl) obj;
                AnonymousClass00C.A0D(r112, 0);
                AnonymousClass5u1 r32 = (AnonymousClass5u1) this.A00;
                AnonymousClass6LN r6 = r32.A01;
                Map map = r32.A02.A05;
                HashMap A0J = AnonymousClass001.A0J();
                Iterator A0y = AnonymousClass000.A0y(map);
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    long A09 = C36431kI.A09(A11.getKey());
                    String str = ((AnonymousClass6D4) A11.getValue()).A03;
                    if (str == null || (A15 = C36431kI.A15(str)) == null) {
                        C18740tg.A0D(false, "CrosspostRequestManager/UniqueId field is empty while iterating through crosspostingInfoMap");
                    } else {
                        C36421kH.A1K(A15, A0J, A09);
                    }
                }
                Map map2 = r112.A00;
                Iterator A0y2 = AnonymousClass000.A0y(map2);
                while (A0y2.hasNext()) {
                    Map.Entry A112 = AnonymousClass000.A11(A0y2);
                    C108475Tq r8 = (C108475Tq) A112.getKey();
                    C128226Bk r7 = (C128226Bk) A112.getValue();
                    List list = r7.A02;
                    if (C36401kF.A1a(list)) {
                        AnonymousClass6LN.A00(r8, r6, list, A0J, 3);
                    }
                    List list2 = r7.A00;
                    if (C36401kF.A1a(list2)) {
                        AnonymousClass6LN.A00(r8, r6, list2, A0J, 3);
                    }
                    List list3 = r7.A01;
                    if (C36401kF.A1a(list3)) {
                        AnonymousClass6LN.A00(r8, r6, list3, A0J, 4);
                    }
                }
                if (!r112.A01) {
                    r32.A00.A00(C107445Oz.A00);
                }
                AnonymousClass62H r33 = r32.A00;
                Iterator A0y3 = AnonymousClass000.A0y(map2);
                while (A0y3.hasNext()) {
                    C128226Bk r1 = (C128226Bk) C36351kA.A0u(A0y3);
                    if (C36401kF.A1a(r1.A00)) {
                        r0 = AnonymousClass5Oy.A00;
                    } else if (C36401kF.A1a(r1.A01)) {
                        r0 = C107435Ox.A00;
                    }
                    r33.A00(r0);
                    return;
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("CrosspostRequestSessionManager/Crosspost success for session: ");
                AnonymousClass6DN r82 = r33.A01;
                String str2 = r82.A04;
                C90464aC.A1R(A0u, str2);
                C34951hu r62 = r33.A00.A00;
                Iterator it = r82.A01.iterator();
                while (it.hasNext()) {
                    C127986Ak r4 = (C127986Ak) it.next();
                    Iterator it2 = r82.A02.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass3T1 A0l = C36391kE.A0l(it2);
                        AnonymousClass00C.A0B(A0l);
                        C34951hu.A00(r4.A00, A0l, r62, str2, 1);
                    }
                }
                return;
        }
    }
}
