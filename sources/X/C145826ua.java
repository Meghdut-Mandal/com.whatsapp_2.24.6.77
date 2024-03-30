package X;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.6ua  reason: invalid class name and case insensitive filesystem */
public class C145826ua implements C159487jR {
    public final String A00;
    public final /* synthetic */ C1265264j A01;

    public C145826ua(C1265264j r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public void BWx(C1261662u r6, int i) {
        C95384kj r4 = this.A01.A02;
        if (r4 != null) {
            r4.A09.A0H(new C80373vI(r4, this.A00, i, 1));
            r4.A0H.A03();
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ArrayList A0I;
        AnonymousClass08S r8;
        C124875yw r14 = (C124875yw) obj;
        C95384kj r4 = this.A01.A02;
        if (r4 != null) {
            List<C144416s9> list = r14.A09;
            String str = this.A00;
            LinkedList linkedList = r4.A0K;
            synchronized (linkedList) {
                if (linkedList.contains(str)) {
                    while (!str.equals(linkedList.peek())) {
                        linkedList.poll();
                    }
                    linkedList.poll();
                    if (list.isEmpty()) {
                        r8 = r4.A05;
                        A0I = AnonymousClass6XV.newArrayList(new C1025450p((C158137fr) null, str, 1));
                    } else {
                        A0I = AnonymousClass001.A0I();
                        for (int i = 0; i < list.size(); i++) {
                            C144416s9 r6 = (C144416s9) list.get(i);
                            A0I.add(new AnonymousClass5E0(r6, new C147036wZ(r4, r6, i), 62));
                        }
                        A0I.add(new AnonymousClass5EE(C65103Qt.A01(r4.A00, 12.0f)));
                        A0I.add(new C105035Dc());
                        A0I.add(new C105065Df());
                        r8 = r4.A05;
                    }
                    r8.A0C(A0I);
                    r4.A0H.A04();
                    AnonymousClass6OF r7 = r4.A0F;
                    long size = (long) list.size();
                    int i2 = 0;
                    for (C144416s9 r0 : list) {
                        if (r0.A08 == 2) {
                            i2++;
                        }
                    }
                    r7.A02(0, size, (long) i2);
                    if (r4.A0A.A00(r4.A0J)) {
                        long size2 = (long) list.size();
                        int i3 = 0;
                        for (C144416s9 r02 : list) {
                            if (r02.A08 == 2) {
                                i3++;
                            }
                        }
                        r7.A02(0, size2, (long) i3);
                    }
                }
            }
        }
    }
}
