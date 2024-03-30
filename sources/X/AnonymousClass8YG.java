package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8YG  reason: invalid class name */
public class AnonymousClass8YG extends AnonymousClass1LZ {
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
        return "deleteChat";
    }

    private void A00(C176048bU r9) {
        C220412q r0 = this.A03;
        AnonymousClass11F r7 = r9.A01;
        if (r0.A09(r7, false) != null) {
            Log.i("delete-chat-handler/deleteChat deleteMessagesForRange");
            C198949eS r5 = this.A05;
            boolean z = r9.A02;
            C202679mP r3 = r9.A00;
            int A002 = C202679mP.A00(r5.A01.A04(r7, true), r3);
            if (A002 == 2 || A002 == 1) {
                r5.A00.A0Q(r7, z, false);
                AnonymousClass3SS.A03(r5.A02, r7);
                return;
            }
            r5.A01(r3, r7, z, true);
        }
    }

    public C201669k5 A0A(C202599mH r18, String str, boolean z) {
        String A0q;
        C202599mH r3 = r18;
        String[] strArr = r3.A06;
        C199769fw r7 = r3.A01;
        AnonymousClass8SS r4 = r3.A03;
        if (strArr.length == 3 && "deleteChat".equals(C165617ti.A0a(strArr))) {
            AnonymousClass11F A0N = C36421kH.A0N(strArr[1]);
            if (A0N == null) {
                A0q = "delete-chat-mutation/from-key-value unable to create chat jid";
            } else {
                String str2 = strArr[2];
                Boolean A002 = C201839kV.A00(str2);
                if (A002 == null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("delete-chat-mutation/from-key-value value=");
                    A0u.append(str2);
                    A0u.append(" at index=");
                    A0u.append(2);
                    A0q = AnonymousClass000.A0q(" is not one of the valid strings", A0u);
                } else if (C199769fw.A03.equals(r7) && r4 != null && C165577te.A1W(r4.bitField0_) && (r4.bitField0_ & C132986Wc.A0F) != 0) {
                    AnonymousClass8OA r2 = r4.deleteChatAction_;
                    if (r2 == null) {
                        r2 = AnonymousClass8OA.DEFAULT_INSTANCE;
                    }
                    boolean A1W = C165577te.A1W(r2.bitField0_);
                    AnonymousClass8QJ r0 = r2.messageRange_;
                    if (r0 == null) {
                        r0 = AnonymousClass8QJ.DEFAULT_INSTANCE;
                    }
                    C202679mP A022 = C202679mP.A02(r0, A1W);
                    boolean booleanValue = A002.booleanValue();
                    return new C176048bU(r3.A02, A022, A0N, str, r4.timestamp_, booleanValue, z);
                }
            }
            Log.e(A0q);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0F(C201669k5 r3) {
        C176048bU r32 = (C176048bU) r3;
        if (C36371kC.A0W(this.A03, r32.A01) == null) {
            A04(r32);
            return;
        }
        A00(r32);
        A06(r32);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r8.A04 <= r5.A04) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0G(X.C201669k5 r18, X.C201669k5 r19) {
        /*
            r17 = this;
            r8 = r19
            r5 = r18
            X.8bU r5 = (X.C176048bU) r5
            X.8bU r8 = (X.C176048bU) r8
            X.9mP r7 = r5.A00
            r4 = r17
            if (r8 == 0) goto L_0x003e
            X.9mP r6 = r8.A00
            int r1 = X.C202679mP.A00(r7, r6)
            if (r1 == 0) goto L_0x004d
            r0 = 1
            if (r1 == r0) goto L_0x0053
            r0 = 2
            if (r1 == r0) goto L_0x0045
            r9 = 0
            X.11F r11 = r8.A01
            boolean r15 = r8.A02
            long r2 = r5.A04
            long r0 = r8.A04
            long r13 = java.lang.Math.max(r2, r0)
            r16 = 1
            X.9mP r10 = X.C202679mP.A01(r7, r6)
            X.8bU r8 = new X.8bU
            r12 = r9
            r8.<init>(r9, r10, r11, r12, r13, r15, r16)
            X.1AC r1 = r4.A00
            java.util.Set r0 = java.util.Collections.singleton(r8)
            r1.A0G(r0)
        L_0x003e:
            r4.A08(r5)
            r4.A00(r5)
            return
        L_0x0045:
            long r6 = r8.A04
            long r1 = r5.A04
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0053
        L_0x004d:
            X.1AC r0 = r4.A00
            r0.A0F(r8)
            goto L_0x003e
        L_0x0053:
            r4.A07(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8YG.A0G(X.9k5, X.9k5):void");
    }

    public boolean A0H() {
        return this.A04.A09(C21100yf.A0X);
    }

    public AnonymousClass8YG(C21100yf r1, C198949eS r2, C21158AAs aAs, AnonymousClass1AB r4, C19970wo r5, C220412q r6, AnonymousClass1AC r7) {
        super(r7);
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r1;
        this.A00 = aAs;
        this.A01 = r4;
        this.A05 = r2;
    }

    public List A0D(boolean z) {
        return Collections.emptyList();
    }
}
