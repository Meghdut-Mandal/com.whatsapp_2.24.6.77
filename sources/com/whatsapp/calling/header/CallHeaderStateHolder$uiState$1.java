package com.whatsapp.calling.header;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C019508h;
import X.C023509x;
import X.C124795yo;
import X.C27631Pa;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.header.CallHeaderStateHolder$uiState$1", f = "CallHeaderStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallHeaderStateHolder$uiState$1 extends AnonymousClass0A1 implements C019508h {
    public final /* synthetic */ C27631Pa $voipSharedPreferences;
    public /* synthetic */ int I$0;
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ C124795yo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallHeaderStateHolder$uiState$1(C27631Pa r2, C124795yo r3, C023509x r4) {
        super(4, r4);
        this.$voipSharedPreferences = r2;
        this.this$0 = r3;
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [X.2fr] */
    /* JADX WARNING: type inference failed for: r9v5, types: [X.52z] */
    /* JADX WARNING: type inference failed for: r9v6, types: [X.531] */
    /* JADX WARNING: type inference failed for: r9v8, types: [X.533] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r2 == com.whatsapp.voipcalling.CallState.RECEIVED_CALL) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
        if (r4.A06 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b5, code lost:
        if (r7 != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bf, code lost:
        if (r2 == com.whatsapp.voipcalling.CallState.REJOINING) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0116, code lost:
        r5 = r3.A02.A0D(r1);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r5 = r16
            int r0 = r5.label
            if (r0 != 0) goto L_0x0171
            X.AnonymousClass0AN.A00(r17)
            java.lang.Object r4 = r5.L$0
            X.6OZ r4 = (X.AnonymousClass6OZ) r4
            int r6 = r5.I$0
            boolean r8 = r5.Z$0
            r0 = 1
            if (r6 == r0) goto L_0x002b
            X.1Pa r0 = r5.$voipSharedPreferences
            java.lang.String r3 = r4.A0A
            android.content.SharedPreferences r2 = X.C27631Pa.A00(r0)
            java.lang.String r1 = "e2ee_shown_for_callid"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.getString(r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002b
            r6 = 1
        L_0x002b:
            X.5yo r1 = r5.this$0
            java.lang.String r0 = r4.A0A
            r1.A00 = r0
            X.6Uf r3 = r1.A03
            boolean r5 = r1.A01
            com.whatsapp.voipcalling.CallState r1 = r3.A01
            com.whatsapp.voipcalling.CallState r2 = r4.A09
            int r0 = r4.A01
            boolean r0 = X.C34681hT.A0U(r1, r2, r0)
            r9 = 0
            if (r0 == 0) goto L_0x0052
            r0 = 1
            X.6BI r0 = X.C132546Uf.A02(r4, r3, r0, r0, r5)
            X.533 r9 = new X.533
            r9.<init>(r0)
        L_0x004c:
            X.AnonymousClass00C.A07(r2)
            r3.A01 = r2
            return r9
        L_0x0052:
            boolean r7 = r4.A0J
            if (r7 != 0) goto L_0x0060
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r2 != r0) goto L_0x0060
        L_0x005a:
            X.531 r9 = new X.531
            r9.<init>()
            goto L_0x004c
        L_0x0060:
            X.AnonymousClass00C.A07(r2)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r2 == r0) goto L_0x005a
            if (r8 != 0) goto L_0x005a
            boolean r0 = X.C131856Qx.A01(r2)
            if (r0 != 0) goto L_0x00b5
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 == r0) goto L_0x00b5
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r2 == r0) goto L_0x00b5
            if (r7 == 0) goto L_0x004c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r2 != r0) goto L_0x004c
        L_0x007d:
            X.147 r0 = r4.A06
            if (r0 == 0) goto L_0x00b8
            r0 = 3
        L_0x0082:
            r3.A00 = r0
            if (r7 == 0) goto L_0x008b
            X.147 r1 = r4.A06
            r0 = 1
            if (r1 == 0) goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            java.lang.String r10 = "Required value was null."
            if (r0 == 0) goto L_0x010f
            X.16D r8 = r3.A02
            X.171 r7 = r3.A03
            X.0wy r0 = r4.A04
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r9 = X.C36411kG.A13(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x00a2:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r1 = r5.next()
            r0 = r1
            X.6EE r0 = (X.AnonymousClass6EE) r0
            boolean r0 = r0.A0J
            X.C36391kE.A1V(r1, r9, r0)
            goto L_0x00a2
        L_0x00b5:
            if (r7 == 0) goto L_0x00b8
            goto L_0x007d
        L_0x00b8:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r2 == r0) goto L_0x00c1
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.REJOINING
            r0 = 2
            if (r2 != r1) goto L_0x0082
        L_0x00c1:
            r0 = 0
            goto L_0x0082
        L_0x00c3:
            java.util.ArrayList r5 = X.C36321k7.A0J(r9)
            java.util.Iterator r1 = r9.iterator()
        L_0x00cb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00db
            X.6EE r0 = X.C90524aI.A0J(r1)
            com.whatsapp.jid.UserJid r0 = r0.A08
            r5.add(r0)
            goto L_0x00cb
        L_0x00db:
            r1 = 0
            r0 = 3
            X.3Bc r13 = X.AnonymousClass3UD.A04(r8, r7, r5, r0, r1)
            boolean r0 = r4.A0N
            if (r13 == 0) goto L_0x010d
            r1 = 2131895920(0x7f122670, float:1.9426687E38)
            if (r0 == 0) goto L_0x00ed
            r1 = 2131895918(0x7f12266e, float:1.9426683E38)
        L_0x00ed:
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r13)
            X.2ft r14 = X.C90524aI.A0O(r0, r1)
        L_0x00f5:
            r1 = 0
            X.6BI r12 = X.C132546Uf.A02(r4, r3, r6, r1, r1)
            if (r12 == 0) goto L_0x0162
            X.6BH r10 = X.C132546Uf.A01(r4)
            int r0 = r3.A00
            X.6BH r11 = X.C132546Uf.A00(r0, r1)
            X.52z r9 = new X.52z
            r9.<init>(r10, r11, r12, r13, r14)
            goto L_0x004c
        L_0x010d:
            r14 = 0
            goto L_0x00f5
        L_0x010f:
            r5 = 0
            if (r7 != 0) goto L_0x015f
            com.whatsapp.jid.UserJid r1 = r4.A08
        L_0x0114:
            if (r1 == 0) goto L_0x012b
            X.16D r0 = r3.A02
            X.11F r1 = (X.AnonymousClass11F) r1
            X.141 r5 = r0.A0D(r1)
            X.171 r0 = r3.A03
            java.lang.String r0 = X.C36381kD.A0v(r0, r5)
            if (r0 == 0) goto L_0x012b
            X.2fr r9 = new X.2fr
            r9.<init>(r0)
        L_0x012b:
            boolean r0 = r4.A0N
            if (r9 == 0) goto L_0x015d
            r1 = 2131895920(0x7f122670, float:1.9426687E38)
            if (r0 == 0) goto L_0x0137
            r1 = 2131895918(0x7f12266e, float:1.9426683E38)
        L_0x0137:
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r9)
            X.2ft r15 = X.C90524aI.A0O(r0, r1)
        L_0x013f:
            r0 = 0
            X.6BI r13 = X.C132546Uf.A02(r4, r3, r6, r0, r0)
            if (r13 == 0) goto L_0x016c
            X.6BH r11 = X.C132546Uf.A01(r4)
            int r1 = r3.A00
            boolean r0 = r4.A0I
            X.6BH r12 = X.C132546Uf.A00(r1, r0)
            if (r12 == 0) goto L_0x0167
            X.530 r9 = new X.530
            r10 = r9
            r14 = r5
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x004c
        L_0x015d:
            r15 = 0
            goto L_0x013f
        L_0x015f:
            X.147 r1 = r4.A06
            goto L_0x0114
        L_0x0162:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r10)
            throw r0
        L_0x0167:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r10)
            throw r0
        L_0x016c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r10)
            throw r0
        L_0x0171:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.header.CallHeaderStateHolder$uiState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object BKu(Object obj, Object obj2, Object obj3, Object obj4) {
        int A0I = AnonymousClass000.A0I(obj2);
        boolean A1X = AnonymousClass000.A1X(obj3);
        CallHeaderStateHolder$uiState$1 callHeaderStateHolder$uiState$1 = new CallHeaderStateHolder$uiState$1(this.$voipSharedPreferences, this.this$0, (C023509x) obj4);
        callHeaderStateHolder$uiState$1.L$0 = obj;
        callHeaderStateHolder$uiState$1.I$0 = A0I;
        callHeaderStateHolder$uiState$1.Z$0 = A1X;
        return callHeaderStateHolder$uiState$1.invokeSuspend(AnonymousClass0AJ.A00);
    }
}
