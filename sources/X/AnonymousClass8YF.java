package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8YF  reason: invalid class name */
public class AnonymousClass8YF extends AnonymousClass1LZ {
    public final C21158AAs A00;
    public final AnonymousClass1AB A01;
    public final C19970wo A02;
    public final C220412q A03;
    public final C21100yf A04;
    public final C198949eS A05;

    public String A0B() {
        return "regular_high";
    }

    public String A0C() {
        return "clearChat";
    }

    private void A00(C176058bV r9) {
        C220412q r0 = this.A03;
        AnonymousClass11F r5 = r9.A01;
        if (C36371kC.A0W(r0, r5) != null) {
            Log.i("clear-chat-handler/clearChat deleteMessagesForRange");
            C198949eS r7 = this.A05;
            boolean z = r9.A02;
            boolean z2 = r9.A03;
            C202679mP r3 = r9.A00;
            int A002 = C202679mP.A00(r7.A01.A04(r5, true), r3);
            if (A002 == 2 || A002 == 1) {
                Log.i("DeleteMessagesForRange/clearChat use default service");
                if (z2) {
                    r7.A05.A03(r5, (Long) null);
                }
                C20310xM r1 = r7.A04;
                r1.A0g(r5, true);
                r1.A0d(r5, (Long) null, true, z);
                return;
            }
            Log.i("DeleteMessagesForRange/clearChat use deleteMessages");
            r7.A01(r3, r5, z, z2);
        }
    }

    public C201669k5 A0A(C202599mH r22, String str, boolean z) {
        String obj;
        C202599mH r3 = r22;
        String[] strArr = r3.A06;
        C199769fw r9 = r3.A01;
        AnonymousClass8SS r4 = r3.A03;
        if (strArr.length == 4 && "clearChat".equals(C165617ti.A0a(strArr))) {
            AnonymousClass11F A0N = C36421kH.A0N(strArr[1]);
            if (A0N == null) {
                obj = "clear-chat-mutation/from-key-value unable to create chat jid";
            } else {
                int i = 2;
                Boolean A002 = C201839kV.A00(strArr[2]);
                if (A002 != null) {
                    i = 3;
                    Boolean A003 = C201839kV.A00(strArr[3]);
                    if (A003 != null) {
                        if (C199769fw.A03.equals(r9) && r4 != null && C165577te.A1W(r4.bitField0_) && (r4.bitField0_ & 65536) != 0) {
                            AnonymousClass8O8 r2 = r4.clearChatAction_;
                            if (r2 == null) {
                                r2 = AnonymousClass8O8.DEFAULT_INSTANCE;
                            }
                            boolean A1W = C165577te.A1W(r2.bitField0_);
                            AnonymousClass8QJ r0 = r2.messageRange_;
                            if (r0 == null) {
                                r0 = AnonymousClass8QJ.DEFAULT_INSTANCE;
                            }
                            C202679mP A022 = C202679mP.A02(r0, A1W);
                            boolean booleanValue = A002.booleanValue();
                            boolean booleanValue2 = A003.booleanValue();
                            return new C176058bV(r3.A02, A022, A0N, str, r4.timestamp_, booleanValue, booleanValue2, z);
                        }
                    }
                }
                StringBuilder A0v = AnonymousClass000.A0v("clear-chat-mutation/from-key-value value=");
                C165617ti.A0g(A0v, strArr, i);
                C36351kA.A1M(" at index=", " is not one of the valid strings", A0v, i);
                obj = A0v.toString();
            }
            Log.e(obj);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r3) {
        C176058bV r32 = (C176058bV) r3;
        if (C36371kC.A0W(this.A03, r32.A01) == null) {
            A04(r32);
            return;
        }
        A00(r32);
        A06(r32);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (r9.A04 <= r5.A04) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0G(X.C201669k5 r21, X.C201669k5 r22) {
        /*
            r20 = this;
            r9 = r22
            r5 = r21
            X.8bV r5 = (X.C176058bV) r5
            X.8bV r9 = (X.C176058bV) r9
            X.9mP r10 = r5.A00
            r4 = r20
            if (r9 == 0) goto L_0x0044
            X.9mP r8 = r9.A00
            int r1 = X.C202679mP.A00(r10, r8)
            if (r1 == 0) goto L_0x0053
            r0 = 1
            if (r1 == r0) goto L_0x0059
            r0 = 2
            if (r1 == r0) goto L_0x004b
            r11 = 0
            X.11F r13 = r9.A01
            boolean r7 = r9.A03
            boolean r6 = r9.A02
            long r2 = r5.A04
            long r0 = r9.A04
            long r15 = java.lang.Math.max(r2, r0)
            r19 = 1
            X.9mP r12 = X.C202679mP.A01(r10, r8)
            X.8bV r10 = new X.8bV
            r14 = r11
            r18 = r6
            r17 = r7
            r10.<init>(r11, r12, r13, r14, r15, r17, r18, r19)
            X.1AC r1 = r4.A00
            java.util.Set r0 = java.util.Collections.singleton(r10)
            r1.A0G(r0)
        L_0x0044:
            r4.A08(r5)
            r4.A00(r5)
            return
        L_0x004b:
            long r6 = r9.A04
            long r1 = r5.A04
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0059
        L_0x0053:
            X.1AC r0 = r4.A00
            r0.A0F(r9)
            goto L_0x0044
        L_0x0059:
            r4.A07(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8YF.A0G(X.9k5, X.9k5):void");
    }

    public boolean A0H() {
        return this.A04.A09(C21100yf.A0X);
    }

    public AnonymousClass8YF(C21100yf r1, C198949eS r2, C21158AAs aAs, AnonymousClass1AB r4, C19970wo r5, C220412q r6, AnonymousClass1AC r7) {
        super(r7);
        this.A02 = r5;
        this.A04 = r1;
        this.A03 = r6;
        this.A00 = aAs;
        this.A01 = r4;
        this.A05 = r2;
    }

    public List A0D(boolean z) {
        return Collections.emptyList();
    }
}
