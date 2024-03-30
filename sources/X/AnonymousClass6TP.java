package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6TP  reason: invalid class name */
public class AnonymousClass6TP {
    public final C19730wQ A00;
    public final C34631hO A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass171 A03;
    public final C19970wo A04;
    public final C20810yC A05;
    public final C20350xQ A06;
    public final AnonymousClass1C6 A07;
    public final List A08 = Collections.synchronizedList(AnonymousClass001.A0I());
    public final Map A09;
    public final boolean A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r5.A0A == 3) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C19730wQ r3, X.C135006by r4, X.C107265Nh r5) {
        /*
            X.5Ng r0 = r5.A0F
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0018
            boolean r0 = r5.A0N()
            if (r0 == 0) goto L_0x0018
            X.C107265Nh.A01(r5)
            int r1 = r5.A0A
            r0 = 3
            if (r1 != r0) goto L_0x0018
        L_0x0017:
            return r2
        L_0x0018:
            X.6by r0 = r5.A04
            boolean r0 = r0.equals(r4)
            r1 = 1
            if (r0 != 0) goto L_0x0035
            boolean r0 = r5.A0M()
            if (r0 == 0) goto L_0x0047
            X.3Ir r0 = r5.A0C
            if (r0 == 0) goto L_0x0047
            java.util.ArrayList r0 = r5.A0C()
            boolean r0 = A01(r3, r0)
            if (r0 != 0) goto L_0x0047
        L_0x0035:
            X.5Ng r0 = r5.A0F
            if (r0 == 0) goto L_0x0043
            java.util.ArrayList r0 = r5.A0C()
            boolean r0 = A01(r3, r0)
            if (r0 != 0) goto L_0x0047
        L_0x0043:
            int r0 = r5.A08
            if (r0 != r1) goto L_0x0017
        L_0x0047:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6TP.A00(X.0wQ, X.6by, X.5Nh):boolean");
    }

    public void A02(C135006by r10, ArrayList arrayList) {
        AnonymousClass72P r1;
        AnonymousClass72P r3;
        Object obj;
        if (this.A0A) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C107265Nh r5 = (C107265Nh) it.next();
                if (A00(this.A00, r10, r5)) {
                    boolean A1S = AnonymousClass000.A1S(r5.A08, 2);
                    GroupJid groupJid = r5.A0D;
                    AnonymousClass16D r7 = this.A02;
                    if (AnonymousClass3UL.A01(r7, this.A06, groupJid, this.A07, A1S) != null) {
                        obj = r5.A0D;
                    } else {
                        if (!r5.A0M()) {
                            obj = r5.A04.A01;
                        }
                        r3 = new AnonymousClass72P(r7, this.A03, this.A04, this.A05);
                        this.A08.add(r3);
                        r3.A03.add(r5);
                    }
                    if (obj != null) {
                        Map map = this.A09;
                        r3 = (AnonymousClass72P) map.get(obj);
                        if (r3 == null) {
                            r3 = new AnonymousClass72P(r7, this.A03, this.A04, this.A05);
                            this.A08.add(r3);
                            map.put(obj, r3);
                        }
                        r3.A03.add(r5);
                    }
                    r3 = new AnonymousClass72P(r7, this.A03, this.A04, this.A05);
                    this.A08.add(r3);
                    r3.A03.add(r5);
                }
            }
            return;
        }
        List list = this.A08;
        if (list.isEmpty()) {
            r1 = new AnonymousClass72P(this.A02, this.A03, this.A04, this.A05);
        } else {
            int A062 = C36421kH.A06(list, 1);
            r1 = (AnonymousClass72P) list.get(A062);
            list.remove(A062);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C107265Nh r52 = (C107265Nh) it2.next();
            boolean A1S2 = AnonymousClass000.A1S(r52.A08, 2);
            GroupJid groupJid2 = r52.A0D;
            AnonymousClass16D r6 = this.A02;
            boolean A1V = AnonymousClass000.A1V(AnonymousClass3UL.A01(r6, this.A06, groupJid2, this.A07, A1S2));
            if (A00(this.A00, r10, r52)) {
                if (!r1.A09(r52, A1V)) {
                    if (!r1.A03.isEmpty()) {
                        list.add(r1);
                    }
                    r1 = new AnonymousClass72P(r6, this.A03, this.A04, this.A05);
                }
                r1.A03.add(r52);
            }
        }
        if (!r1.A03.isEmpty()) {
            list.add(r1);
        }
    }

    public AnonymousClass6TP(C19730wQ r2, C34631hO r3, AnonymousClass16D r4, AnonymousClass171 r5, C19970wo r6, C20810yC r7, C20350xQ r8, AnonymousClass1C6 r9) {
        HashMap hashMap;
        this.A05 = r7;
        this.A02 = r4;
        this.A06 = r8;
        this.A01 = r3;
        this.A07 = r9;
        this.A04 = r6;
        this.A03 = r5;
        this.A00 = r2;
        boolean A0E = r7.A0E(3918);
        this.A0A = A0E;
        if (A0E) {
            hashMap = AnonymousClass001.A0J();
        } else {
            hashMap = null;
        }
        this.A09 = hashMap;
    }

    public static boolean A01(C19730wQ r4, List list) {
        if (list.size() > 1) {
            return true;
        }
        if (list.size() == 1) {
            UserJid userJid = ((C107255Nf) list.get(0)).A00;
            AnonymousClass00C.A0D(userJid, 0);
            AnonymousClass00C.A0D(r4, 1);
            if (userJid.equals(C36441kJ.A0n(r4)) || userJid.equals(r4.A08())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
