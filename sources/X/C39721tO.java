package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1tO  reason: invalid class name and case insensitive filesystem */
public final class C39721tO extends AnonymousClass04R {
    public int A00 = -1;
    public final C001700s A01 = C36431kI.A0S();
    public final C34831hi A02 = C36441kJ.A0s(C023409w.A00);
    public final C28201Rs A03 = C36441kJ.A0t();

    public final void A0S(AnonymousClass3PH r10, AnonymousClass3ID r11, Collection collection) {
        int i;
        AnonymousClass00C.A0D(r10, 1);
        Set keySet = ((Map) r11.A00.getValue()).keySet();
        AnonymousClass00C.A0D(keySet, 0);
        List A002 = AnonymousClass4YZ.A00(keySet, new AnonymousClass4NP(r10), 6);
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            C88784Ua A003 = r11.A00(C36341k9.A0A(it));
            if (A003 != null) {
                A0I.add(A003);
            }
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it2 = A0I.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((C88784Ua) next).BtJ(collection)) {
                A0I2.add(next);
            }
        }
        C34831hi r3 = this.A02;
        ArrayList A0I3 = AnonymousClass001.A0I();
        C62333Ft r7 = null;
        for (C88784Ua r6 : AnonymousClass4YZ.A00(A0I2, r10, 7)) {
            boolean z = false;
            if (r7 != null) {
                i = r7.A00.size();
            } else {
                i = 0;
            }
            if (A0I3.size() == 1 && i > 0 && r10.A01(r6.getId()) == C51492nu.OVERFLOW) {
                z = true;
            }
            if (r7 == null || i == 5 || z) {
                r7 = new C62333Ft(this);
                A0I3.add(r7);
            }
            r7.A00(r6);
        }
        if (!A0I3.isEmpty() && A0I3.size() <= 2) {
            C62333Ft r4 = (C62333Ft) C007103b.A0L(A0I3);
            if (A0I3.size() == 1) {
                if (r4.A01() && r4.A01()) {
                    r4.A00.removeLast();
                }
            } else if (A0I3.size() == 2) {
                C62333Ft r1 = (C62333Ft) A0I3.get(1);
                if (r1.A01()) {
                    LinkedList linkedList = r1.A00;
                    if (linkedList.size() <= 2 && !(C007103b.A0L(linkedList) instanceof C70723fc)) {
                        if (r4.A01()) {
                            r4.A00.removeLast();
                        }
                        r4.A00((C88784Ua) C007103b.A0L(linkedList));
                        AnonymousClass03Y.A0A(A0I3);
                    }
                }
            }
        }
        r3.A0D(A0I3);
        this.A00 = 0;
        this.A01.A0D(C36401kF.A0w(r3).get(0));
    }
}
