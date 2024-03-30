package X;

import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8YM  reason: invalid class name */
public final class AnonymousClass8YM extends AnonymousClass1LZ {
    public final C21158AAs A00;
    public final AnonymousClass1DP A01;
    public final AnonymousClass163 A02;
    public final C220412q A03;
    public final AnonymousClass1AC A04;
    public final AnonymousClass1CR A05;
    public final AnonymousClass1AB A06;
    public final C19970wo A07;
    public final C24381Cf A08;
    public final C20810yC A09;
    public final AnonymousClass004 A0A;

    public C201669k5 A0A(C202599mH r15, String str, boolean z) {
        AnonymousClass11F A022;
        AnonymousClass00C.A0D(r15, 2);
        AnonymousClass8SS r2 = r15.A03;
        if (r2 == null) {
            return null;
        }
        String[] strArr = r15.A06;
        if (!AnonymousClass00C.A0J(C165617ti.A0a(strArr), "lock") || strArr.length != 2 || !AnonymousClass00C.A0J(r15.A01, C199769fw.A03) || !C165577te.A1W(r2.bitField0_) || (r2.bitField1_ & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0 || (A022 = AnonymousClass11F.A00.A02(strArr[1])) == null) {
            return null;
        }
        long j = r2.timestamp_;
        C201539jo r7 = r15.A02;
        AnonymousClass8OE r0 = r2.lockChatAction_;
        if (r0 == null) {
            r0 = AnonymousClass8OE.DEFAULT_INSTANCE;
        }
        return new C176088bY(r7, A022, str, j, z, r0.locked_);
    }

    public String A0B() {
        return "regular_low";
    }

    public String A0C() {
        return "lock";
    }

    public /* bridge */ /* synthetic */ void A0E(C201669k5 r4) {
        AnonymousClass00C.A0D(r4, 0);
        A01(AnonymousClass1AC.A04(this.A04, "lock", true));
        A05(r4);
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r4) {
        AnonymousClass00C.A0D(r4, 0);
        A01(AnonymousClass1AC.A04(this.A04, "lock", true));
        A06(r4);
    }

    public final C176088bY A0I(AnonymousClass11F r9, boolean z) {
        AnonymousClass00C.A0D(r9, 0);
        return new C176088bY((C201539jo) null, r9, (String) null, C19970wo.A00(this.A07), false, z);
    }

    private final void A00(AnonymousClass11F r4, boolean z) {
        C220412q r2 = this.A03;
        C65073Qp A0W = C36371kC.A0W(r2, r4);
        if (A0W != null) {
            A0W.A0j = z;
            this.A02.A06(A0W);
            HashSet hashSet = r2.A01;
            if (z) {
                hashSet.add(r4);
            } else {
                hashSet.remove(r4);
            }
        }
        this.A08.A00();
        ((C29411Wn) this.A0A.get()).A03();
    }

    private final void A01(List list) {
        ArrayList A042 = AnonymousClass1AC.A04(this.A04, "lock", false);
        HashMap A0J = AnonymousClass001.A0J();
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            C201669k5 r1 = (C201669k5) it.next();
            String A062 = r1.A06();
            AnonymousClass00C.A08(A062);
            A0J.put(A062, r1);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C201669k5 r12 = (C201669k5) it2.next();
            String A063 = r12.A06();
            AnonymousClass00C.A08(A063);
            A0J.put(A063, r12);
        }
        ArrayList A15 = C36441kJ.A15(A0J.values());
        Iterator it3 = A15.iterator();
        while (it3.hasNext()) {
            if (!((C176088bY) it3.next()).A01) {
                it3.remove();
            }
        }
        AnonymousClass03X.A08(A15, new C23176B8k(C22553Aoe.A00, 5));
        C220412q r4 = this.A03;
        Iterator it4 = r4.A0E().iterator();
        while (it4.hasNext()) {
            C65073Qp r3 = (C65073Qp) it4.next();
            AnonymousClass11F A064 = r3.A06();
            AnonymousClass00C.A08(A064);
            Iterator it5 = A15.iterator();
            while (true) {
                if (it5.hasNext()) {
                    if (AnonymousClass00C.A0J(((C176088bY) it5.next()).A00, A064)) {
                        break;
                    }
                } else {
                    AnonymousClass11F A065 = r3.A06();
                    AnonymousClass00C.A08(A065);
                    A00(A065, false);
                    break;
                }
            }
        }
        Iterator it6 = A15.iterator();
        while (it6.hasNext()) {
            C176088bY r13 = (C176088bY) it6.next();
            AnonymousClass11F r9 = r13.A00;
            if (!r4.A0Q(r9)) {
                A00(r9, true);
                if (r4.A0M(r9)) {
                    C65073Qp A0W = C36371kC.A0W(r4, r9);
                    if (A0W != null && A0W.A0i) {
                        Log.i("LockChatHandler/setArchive - false");
                        A0W.A0i = false;
                        this.A02.A0E(A0W);
                        this.A01.A00();
                        this.A00.A0G(C36411kG.A15(new C176078bX(this.A00.A04(r9, false), r9, r13.A04, false)));
                    }
                    if (this.A05.A0k(r9)) {
                        Log.i("LockChatHandler/setPin - false");
                        this.A00.A0G(C36411kG.A15(new C176108ba(r9, r13.A04, false)));
                    }
                }
            }
        }
        list.retainAll(A15);
    }

    public static final boolean A02(C176088bY r6, C201669k5 r7) {
        if (!(r7 instanceof C176078bX)) {
            return false;
        }
        AnonymousClass8SS A052 = r7.A05();
        if (A052 != null) {
            AnonymousClass8PN r0 = A052.archiveChatAction_;
            if ((r0 != null || (r0 = AnonymousClass8PN.DEFAULT_INSTANCE) != null) && r0.archived_ && r7.A04 > r6.A04) {
                return true;
            }
            return false;
        }
        throw C36381kD.A0l();
    }

    public static final boolean A03(C176088bY r6, C201669k5 r7) {
        if (!(r7 instanceof C176108ba)) {
            return false;
        }
        AnonymousClass8SS A052 = r7.A05();
        if (A052 != null) {
            AnonymousClass8OI r0 = A052.pinAction_;
            if ((r0 != null || (r0 = AnonymousClass8OI.DEFAULT_INSTANCE) != null) && r0.pinned_ && r7.A04 > r6.A04) {
                return true;
            }
            return false;
        }
        throw C36381kD.A0l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        if (A03(r6, r1) == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0G(X.C201669k5 r6, X.C201669k5 r7) {
        /*
            r5 = this;
            X.8bY r6 = (X.C176088bY) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            if (r7 == 0) goto L_0x0010
            long r3 = r7.A04
            long r1 = r6.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0060
        L_0x0010:
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0064
            X.11F r2 = r6.A00
            java.lang.String[] r1 = X.C36441kJ.A1S()
            java.lang.String r0 = "archive"
            X.C165567td.A14(r2, r0, r1)
            java.lang.String r4 = X.C201669k5.A00(r1)
            X.AnonymousClass00C.A08(r4)
            java.lang.String[] r1 = X.C36441kJ.A1S()
            java.lang.String r0 = "pin_v1"
            X.C165567td.A14(r2, r0, r1)
            java.lang.String r3 = X.C201669k5.A00(r1)
            X.AnonymousClass00C.A08(r3)
            X.1AC r2 = r5.A00
            X.9k5 r0 = r2.A0B(r4)
            X.9k5 r1 = r2.A0B(r3)
            boolean r0 = A02(r6, r0)
            if (r0 != 0) goto L_0x0060
            boolean r0 = A03(r6, r1)
            if (r0 != 0) goto L_0x0060
            X.9k5 r0 = r2.A0A(r4)
            X.9k5 r1 = r2.A0A(r3)
            boolean r0 = A02(r6, r0)
            if (r0 != 0) goto L_0x0060
            boolean r0 = A03(r6, r1)
            if (r0 == 0) goto L_0x0064
        L_0x0060:
            r5.A07(r6)
            return
        L_0x0064:
            r5.A09(r6, r7)
            X.1AC r2 = r5.A04
            java.lang.String r1 = "lock"
            r0 = 1
            java.util.ArrayList r0 = X.AnonymousClass1AC.A04(r2, r1, r0)
            r5.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8YM.A0G(X.9k5, X.9k5):void");
    }

    public boolean A0H() {
        return this.A09.A0E(7280);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YM(C21158AAs aAs, AnonymousClass1AB r3, C19970wo r4, AnonymousClass1DP r5, AnonymousClass163 r6, C220412q r7, C24381Cf r8, AnonymousClass1AC r9, C20810yC r10, AnonymousClass1CR r11, AnonymousClass004 r12) {
        super(r9);
        C36321k7.A1B(r4, r10, r6, r7, r5);
        C36321k7.A1C(r3, aAs, r11, r9, r8);
        AnonymousClass00C.A0D(r12, 11);
        this.A07 = r4;
        this.A09 = r10;
        this.A02 = r6;
        this.A03 = r7;
        this.A01 = r5;
        this.A06 = r3;
        this.A00 = aAs;
        this.A05 = r11;
        this.A04 = r9;
        this.A08 = r8;
        this.A0A = r12;
    }

    public List A0D(boolean z) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = this.A03.A0E().iterator();
        while (it.hasNext()) {
            long A002 = C19970wo.A00(this.A07);
            AnonymousClass11F A062 = ((C65073Qp) it.next()).A06();
            AnonymousClass00C.A08(A062);
            A0I.add(new C176088bY((C201539jo) null, A062, (String) null, A002, false, true));
        }
        if (z) {
            A01(A0I);
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it2 = A0I.iterator();
        while (it2.hasNext()) {
            C176088bY r2 = (C176088bY) it2.next();
            this.A06.A07(1);
            AnonymousClass11F r7 = r2.A00;
            long j = r2.A04;
            A0I2.add(new C176078bX(this.A00.A04(r7, false), r7, j, false));
            A0I2.add(new C176108ba(r7, j, false));
            A0I2.add(r2);
        }
        return A0I2;
    }
}
