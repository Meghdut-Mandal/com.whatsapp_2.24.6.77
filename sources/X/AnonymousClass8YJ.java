package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.8YJ  reason: invalid class name */
public class AnonymousClass8YJ extends AnonymousClass1LZ {
    public final C21158AAs A00;
    public final C19970wo A01;
    public final C220412q A02;
    public final AnonymousClass1Y3 A03;

    public String A0B() {
        return "regular_low";
    }

    public String A0C() {
        return "markChatAsRead";
    }

    public boolean A0H() {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: A00 */
    public void A0E(C176068bW r6) {
        C65073Qp A0W;
        AnonymousClass11F r3 = r6.A01;
        C220412q r2 = this.A02;
        if (r2.A09(r3, false) != null) {
            int A002 = C202679mP.A00(this.A00.A04(r3, false), r6.A00);
            if (A002 == 0 || !(A002 == 1 || A002 == 2)) {
                if (r6.A02 && (A0W = C36371kC.A0W(r2, r3)) != null && ((long) A0W.A08) == -1) {
                    A01(r6);
                }
                A07(r6);
                return;
            }
            A01(r6);
        }
        A08(r6);
    }

    private void A01(C176068bW r6) {
        boolean z = r6.A02;
        AnonymousClass1Y3 r3 = this.A03;
        AnonymousClass11F r2 = r6.A01;
        if (z) {
            r3.A01(r2, 3, false, true);
        } else {
            r3.A03(r2, false);
        }
    }

    public C201669k5 A0A(C202599mH r15, String str, boolean z) {
        String[] strArr = r15.A06;
        C199769fw r2 = r15.A01;
        AnonymousClass8SS r3 = r15.A03;
        if (strArr.length == 2 && "markChatAsRead".equals(C165617ti.A0a(strArr))) {
            AnonymousClass11F A0N = C36421kH.A0N(strArr[1]);
            if (A0N == null) {
                Log.e("mark-chat-as-read-mutation/from-key-value unable to create chat jid");
            } else if (C199769fw.A03.equals(r2) && r3 != null && C165577te.A1W(r3.bitField0_) && (r3.bitField0_ & 32768) != 0) {
                AnonymousClass8PQ r0 = r3.markChatAsReadAction_;
                AnonymousClass8PQ r22 = r0;
                if (r0 == null) {
                    r0 = AnonymousClass8PQ.DEFAULT_INSTANCE;
                }
                if ((r0.bitField0_ & 1) != 0) {
                    if (r22 == null) {
                        r22 = AnonymousClass8PQ.DEFAULT_INSTANCE;
                    }
                    boolean A1P = AnonymousClass000.A1P(r22.bitField0_ & 2);
                    AnonymousClass8QJ r02 = r22.messageRange_;
                    if (r02 == null) {
                        r02 = AnonymousClass8QJ.DEFAULT_INSTANCE;
                    }
                    C202679mP A022 = C202679mP.A02(r02, A1P);
                    boolean z2 = r22.read_;
                    return new C176068bW(r15.A02, A022, A0N, str, r3.timestamp_, z2, z);
                }
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r3) {
        C176068bW r32 = (C176068bW) r3;
        if (C36371kC.A0W(this.A02, r32.A01) == null) {
            A04(r32);
            return;
        }
        A01(r32);
        A06(r32);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        if (r8.A04 <= r5.A04) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0G(X.C201669k5 r19, X.C201669k5 r20) {
        /*
            r18 = this;
            r8 = r20
            r5 = r19
            X.8bW r5 = (X.C176068bW) r5
            X.8bW r8 = (X.C176068bW) r8
            r4 = r18
            if (r8 == 0) goto L_0x005b
            X.9mP r9 = r5.A00
            X.9mP r7 = r8.A00
            int r1 = X.C202679mP.A00(r9, r7)
            if (r1 == 0) goto L_0x0056
            r0 = 1
            if (r1 == r0) goto L_0x005f
            r0 = 2
            if (r1 == r0) goto L_0x004e
            r10 = 0
            X.11F r12 = r8.A01
            long r2 = r5.A04
            long r0 = r8.A04
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x004b
            boolean r6 = r5.A02
        L_0x0029:
            long r14 = java.lang.Math.max(r2, r0)
            r17 = 1
            X.9mP r11 = X.C202679mP.A01(r9, r7)
            X.8bW r9 = new X.8bW
            r13 = r10
            r16 = r6
            r9.<init>(r10, r11, r12, r13, r14, r16, r17)
            r4.A07(r5)
            X.1AC r1 = r4.A00
            java.util.Set r0 = java.util.Collections.singleton(r9)
            r1.A0G(r0)
            r4.A01(r9)
            return
        L_0x004b:
            boolean r6 = r8.A02
            goto L_0x0029
        L_0x004e:
            long r6 = r8.A04
            long r1 = r5.A04
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x005f
        L_0x0056:
            X.1AC r0 = r4.A00
            r0.A0F(r8)
        L_0x005b:
            r4.A0E(r5)
            return
        L_0x005f:
            r4.A07(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8YJ.A0G(X.9k5, X.9k5):void");
    }

    public AnonymousClass8YJ(C21158AAs aAs, AnonymousClass1Y3 r2, C19970wo r3, C220412q r4, AnonymousClass1AC r5) {
        super(r5);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = aAs;
        this.A03 = r2;
    }

    public List A0D(boolean z) {
        boolean z2;
        ArrayList A0I = AnonymousClass001.A0I();
        C220412q r6 = this.A02;
        ArrayList A0I2 = AnonymousClass001.A0I();
        ConcurrentHashMap A002 = C220412q.A00(r6);
        synchronized (r6) {
            z2 = r6.A00;
        }
        if (z2) {
            Iterator A10 = C36371kC.A10(A002);
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                AnonymousClass11F r3 = (AnonymousClass11F) A11.getKey();
                if (((C65073Qp) A11.getValue()).A08 == -1 && !r6.A0R(r3)) {
                    A0I2.add(r3);
                }
            }
            Iterator it = A0I2.iterator();
            while (it.hasNext()) {
                AnonymousClass11F r62 = (AnonymousClass11F) it.next();
                A0I.add(new C176068bW((C201539jo) null, this.A00.A04(r62, false), r62, (String) null, C19970wo.A00(this.A01), false, false));
            }
            return A0I;
        }
        throw AnonymousClass001.A09("ChatsCache/getMarkedAsUnreadChats: chat haven't initialized");
    }
}
