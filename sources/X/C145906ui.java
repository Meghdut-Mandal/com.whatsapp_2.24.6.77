package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6ui  reason: invalid class name and case insensitive filesystem */
public class C145906ui implements C159487jR {
    public final String A00;
    public final /* synthetic */ C145896uh A01;

    public static final List A00(String str, List list) {
        AnonymousClass00C.A0D(list, 0);
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C144416s9 r1 = (C144416s9) it.next();
            if (AnonymousClass00C.A0J(str, r1.A03)) {
                r1 = C144416s9.A00(r1);
                r1.A01 = 2;
            }
            A0J.add(r1);
        }
        return A0J;
    }

    public C145906ui(C145896uh r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public void BWx(C1261662u r7, int i) {
        C143516qg r3 = this.A01.A09;
        if (r3 != null) {
            String str = this.A00;
            if (r3.A0A.BMb()) {
                C125025zC r5 = r3.A09;
                if (r5.A05 != null) {
                    AnonymousClass6L1 r4 = r3.A0D;
                    List list = r4.A03;
                    List A002 = A00(str, list);
                    list.clear();
                    list.addAll(A002);
                    List A003 = A00(str, r4.A01);
                    r4.A01.clear();
                    r4.A01.addAll(A003);
                    List list2 = r5.A05.A09;
                    list2.clear();
                    list2.addAll(list);
                    C143516qg.A06(r3);
                    return;
                }
                return;
            }
            C125025zC r2 = r3.A09;
            C128836Du r0 = r2.A05;
            if (r0 != null) {
                List A004 = A00(str, r0.A09);
                List list3 = r2.A05.A09;
                list3.clear();
                list3.addAll(A004);
                r2.A0J.clear();
                C143516qg.A05(r3);
            }
        }
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Map map = (Map) obj;
        C143516qg r0 = this.A01.A09;
        if (r0 != null) {
            r0.A0E(map);
        }
    }
}
