package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8YH  reason: invalid class name */
public class AnonymousClass8YH extends AnonymousClass1LZ {
    public final C21158AAs A00;
    public final AnonymousClass1AB A01;
    public final C19970wo A02;
    public final AnonymousClass1DP A03;
    public final AnonymousClass163 A04;
    public final C220412q A05;
    public final AnonymousClass1AC A06;
    public final AnonymousClass1CR A07;
    public final C21100yf A08;

    public String A0B() {
        return "regular_low";
    }

    public String A0C() {
        return "pin_v1";
    }

    private void A00(List list) {
        C65073Qp A0W;
        ArrayList A042 = AnonymousClass1AC.A04(this.A06, "pin_v1", false);
        HashMap A0J = AnonymousClass001.A0J();
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            C201669k5 r1 = (C201669k5) it.next();
            A0J.put(r1.A06(), r1);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C201669k5 r12 = (C201669k5) it2.next();
            A0J.put(r12.A06(), r12);
        }
        ArrayList A15 = C36441kJ.A15(A0J.values());
        Iterator it3 = A15.iterator();
        while (it3.hasNext()) {
            if (!((C176108ba) it3.next()).A01) {
                it3.remove();
            }
        }
        Collections.sort(A15, AXY.A00);
        List<C176108ba> subList = A15.subList(0, Math.min(A15.size(), 3));
        AnonymousClass1CR r3 = this.A07;
        Set<AnonymousClass11F> A0X = r3.A0X();
        for (AnonymousClass11F r5 : A0X) {
            Iterator it4 = subList.iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (((C176108ba) it4.next()).A00.equals(r5)) {
                        break;
                    }
                } else {
                    this.A01.A07(2);
                    r3.A0T(r5);
                    break;
                }
            }
        }
        for (C176108ba r13 : subList) {
            AnonymousClass11F r8 = r13.A00;
            if (!A0X.contains(r8)) {
                long j = r13.A04;
                r3.A0U(r8, j);
                C220412q r14 = this.A05;
                if (r14.A0M(r8) && (A0W = C36371kC.A0W(r14, r8)) != null && A0W.A0i) {
                    Log.i("PinChatHandler/setArchive - false");
                    A0W.A0i = false;
                    this.A04.A0E(A0W);
                    this.A03.A00();
                    this.A00.A0G(Collections.singleton(new C176078bX(this.A00.A04(r8, false), r8, j, false)));
                }
            }
        }
        list.retainAll(subList);
    }

    public C201669k5 A0A(C202599mH r15, String str, boolean z) {
        String[] strArr = r15.A06;
        C199769fw r4 = r15.A01;
        AnonymousClass8SS r2 = r15.A03;
        if (strArr.length == 2 && "pin_v1".equals(C165617ti.A0a(strArr))) {
            AnonymousClass11F A0N = C36421kH.A0N(strArr[1]);
            if (A0N == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("pin-chat-mutation/from-key-value unable to create chat jid from ");
                C36321k7.A1Z(A0u, strArr[1]);
            } else if (C199769fw.A03.equals(r4) && r2 != null && C165577te.A1W(r2.bitField0_) && (r2.bitField0_ & 16) != 0) {
                AnonymousClass8OI r0 = r2.pinAction_;
                AnonymousClass8OI r1 = r0;
                if (r0 == null) {
                    r0 = AnonymousClass8OI.DEFAULT_INSTANCE;
                }
                if ((r0.bitField0_ & 1) != 0) {
                    if (r1 == null) {
                        r1 = AnonymousClass8OI.DEFAULT_INSTANCE;
                    }
                    boolean z2 = r1.pinned_;
                    return new C176108ba(r15.A02, A0N, str, r2.timestamp_, z2, z);
                }
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r4) {
        A00(AnonymousClass1AC.A04(this.A06, "pin_v1", true));
        A05(r4);
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r4) {
        A00(AnonymousClass1AC.A04(this.A06, "pin_v1", true));
        A06(r4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r1.A04 > r8.A04) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r1.A04 > r8.A04) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0G(X.C201669k5 r8, X.C201669k5 r9) {
        /*
            r7 = this;
            X.8ba r8 = (X.C176108ba) r8
            if (r9 == 0) goto L_0x000c
            long r3 = r9.A04
            long r1 = r8.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
        L_0x000c:
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x0064
            X.11F r2 = r8.A00
            java.lang.String[] r1 = X.C36441kJ.A1S()
            java.lang.String r0 = "archive"
            X.C165567td.A14(r2, r0, r1)
            java.lang.String r6 = X.C201669k5.A00(r1)
            X.1AC r5 = r7.A00
            X.9k5 r1 = r5.A0B(r6)
            if (r1 == 0) goto L_0x0044
            X.8SS r0 = r1.A05()
            X.C18740tg.A06(r0)
            X.8PN r0 = r0.archiveChatAction_
            if (r0 != 0) goto L_0x0034
            X.8PN r0 = X.AnonymousClass8PN.DEFAULT_INSTANCE
        L_0x0034:
            boolean r0 = r0.archived_
            if (r0 == 0) goto L_0x0044
            long r3 = r1.A04
            long r1 = r8.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0044
        L_0x0040:
            r7.A07(r8)
            return
        L_0x0044:
            X.9k5 r1 = r5.A0A(r6)
            if (r1 == 0) goto L_0x0064
            X.8SS r0 = r1.A05()
            X.C18740tg.A06(r0)
            X.8PN r0 = r0.archiveChatAction_
            if (r0 != 0) goto L_0x0057
            X.8PN r0 = X.AnonymousClass8PN.DEFAULT_INSTANCE
        L_0x0057:
            boolean r0 = r0.archived_
            if (r0 == 0) goto L_0x0064
            long r3 = r1.A04
            long r1 = r8.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0064
            goto L_0x0040
        L_0x0064:
            r7.A09(r8, r9)
            X.1AC r2 = r7.A06
            java.lang.String r1 = "pin_v1"
            r0 = 1
            java.util.ArrayList r0 = X.AnonymousClass1AC.A04(r2, r1, r0)
            r7.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8YH.A0G(X.9k5, X.9k5):void");
    }

    public boolean A0H() {
        return this.A08.A09(C21100yf.A0Z);
    }

    public AnonymousClass8YH(C21100yf r1, C21158AAs aAs, AnonymousClass1AB r3, C19970wo r4, AnonymousClass1DP r5, AnonymousClass163 r6, C220412q r7, AnonymousClass1AC r8, AnonymousClass1CR r9) {
        super(r8);
        this.A02 = r4;
        this.A04 = r6;
        this.A05 = r7;
        this.A08 = r1;
        this.A03 = r5;
        this.A00 = aAs;
        this.A01 = r3;
        this.A07 = r9;
        this.A06 = r8;
    }

    public List A0D(boolean z) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator A0y = AnonymousClass000.A0y(this.A07.A0W());
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            A0I.add(new C176108ba((AnonymousClass11F) A11.getKey(), C36431kI.A09(A11.getValue()), true));
        }
        if (z) {
            A00(A0I);
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            C176108ba r1 = (C176108ba) it.next();
            this.A01.A07(1);
            AnonymousClass11F r7 = r1.A00;
            A0I2.add(new C176078bX(this.A00.A04(r7, false), r7, C19970wo.A00(this.A02), false));
            A0I2.add(r1);
        }
        return A0I2;
    }
}
