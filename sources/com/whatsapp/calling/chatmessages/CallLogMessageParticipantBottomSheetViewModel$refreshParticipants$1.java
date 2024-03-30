package com.whatsapp.calling.chatmessages;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1", f = "CallLogMessageParticipantBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ CallLogMessageParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1(CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = callLogMessageParticipantBottomSheetViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r0 != 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f0, code lost:
        if (r8.equals(r3.A01) != false) goto L_0x00f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r4 = r17
            int r0 = r4.label
            if (r0 != 0) goto L_0x01b6
            X.AnonymousClass0AN.A00(r18)
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r0 = r4.this$0
            X.1HK r1 = r0.A0D
            X.6by r0 = r0.A0I
            X.5Nh r7 = r1.A05(r0)
            if (r7 == 0) goto L_0x01b3
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r1 = r4.this$0
            int r0 = r7.A08
            r2 = 2
            boolean r0 = X.AnonymousClass000.A1S(r0, r2)
            r1.A04 = r0
            X.6X4 r0 = r1.A07
            com.whatsapp.jid.GroupJid r6 = r7.A0D
            if (r6 == 0) goto L_0x0173
            X.0yC r5 = r0.A06
            X.0wQ r3 = r0.A00
            X.17X r0 = r0.A05
            X.17r r0 = r0.A07
            int r0 = r0.A0B(r6)
            boolean r0 = X.C34681hT.A0C(r3, r5, r0)
        L_0x0036:
            r1.A01 = r0
            boolean r5 = r7.A0K
            r1.A03 = r5
            r1.A00 = r7
            X.05L r3 = r1.A0L
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0169
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0169
            r0 = 2131887447(0x7f120557, float:1.9409501E38)
        L_0x004b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.setValue(r0)
            X.05L r5 = r1.A0O
            X.5Nh r0 = r1.A00
            r3 = 1
            if (r0 == 0) goto L_0x0159
            boolean r0 = r0.A0N()
            if (r0 != r3) goto L_0x0159
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x014d
            X.5Nh r0 = r1.A00
            if (r0 == 0) goto L_0x0071
            X.C107265Nh.A01(r0)
            int r0 = r0.A0A
            r3 = 2131887442(0x7f120552, float:1.9409491E38)
            if (r0 == 0) goto L_0x0074
        L_0x0071:
            r3 = 2131887439(0x7f12054f, float:1.9409485E38)
        L_0x0074:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r5.setValue(r0)
            int r13 = r7.A09
            int r11 = r7.A06()
            X.05L r10 = r1.A0N
            X.0yC r3 = r1.A0F
            r0 = 5579(0x15cb, float:7.818E-42)
            boolean r0 = r3.A0E(r0)
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x013d
            X.0wG r12 = r1.A0B
            r9 = 2131887448(0x7f120558, float:1.9409503E38)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            X.0ts r3 = r1.A0C
            long r0 = X.C36371kC.A07(r13)
            java.lang.String r0 = X.AnonymousClass3UY.A06(r3, r0)
            r8[r5] = r0
            X.AnonymousClass000.A1L(r8, r11, r6)
            java.lang.String r0 = r12.A02(r9, r8)
        L_0x00a9:
            r10.setValue(r0)
            java.util.ArrayList r0 = r7.A0C()
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r7 = r4.this$0
            java.util.ArrayList r1 = X.C36321k7.A0J(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x00ba:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0176
            java.lang.Object r9 = r10.next()
            X.5Nf r9 = (X.C107255Nf) r9
            X.16D r0 = r7.A09
            com.whatsapp.jid.UserJid r8 = r9.A00
            X.141 r12 = r0.A0D(r8)
            X.AnonymousClass00C.A07(r8)
            X.5Nh r3 = r7.A00
            r13 = 0
            if (r3 == 0) goto L_0x0100
            X.6by r0 = r3.A04
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x00e4
            X.0wQ r0 = r7.A05
            boolean r0 = r0.A0M(r8)
            if (r0 != 0) goto L_0x00f2
        L_0x00e4:
            X.6by r3 = r3.A04
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0100
            com.whatsapp.jid.UserJid r0 = r3.A01
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0100
        L_0x00f2:
            boolean r3 = r7.A04
            r0 = 2131887443(0x7f120553, float:1.9409493E38)
            if (r3 == 0) goto L_0x00fc
            r0 = 2131887444(0x7f120554, float:1.9409495E38)
        L_0x00fc:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
        L_0x0100:
            X.0wQ r8 = r7.A05
            boolean r0 = X.C36361kB.A1X(r8, r12)
            if (r0 == 0) goto L_0x0133
            X.0wG r0 = r7.A0B
            android.content.Context r3 = r0.A00
            r0 = 2131896229(0x7f1227a5, float:1.9427313E38)
            java.lang.String r14 = r3.getString(r0)
        L_0x0113:
            if (r14 != 0) goto L_0x0117
            java.lang.String r14 = ""
        L_0x0117:
            int r3 = r9.A01
            r0 = 5
            if (r3 == r0) goto L_0x0125
            int r3 = r9.A01
            r0 = 100
            if (r3 == r0) goto L_0x0125
            r15 = 0
            if (r13 == 0) goto L_0x0126
        L_0x0125:
            r15 = 1
        L_0x0126:
            boolean r16 = X.C36361kB.A1X(r8, r12)
            X.2DW r11 = new X.2DW
            r11.<init>(r12, r13, r14, r15, r16)
            r1.add(r11)
            goto L_0x00ba
        L_0x0133:
            X.171 r3 = r7.A0A
            r0 = 7
            X.34G r0 = r3.A0E(r12, r0, r5, r6)
            java.lang.String r14 = r0.A01
            goto L_0x0113
        L_0x013d:
            X.0wG r3 = r1.A0B
            r1 = 2131887449(0x7f120559, float:1.9409505E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.AnonymousClass000.A1L(r0, r11, r5)
            java.lang.String r0 = r3.A02(r1, r0)
            goto L_0x00a9
        L_0x014d:
            boolean r0 = r1.A03
            r3 = 2131887441(0x7f120551, float:1.940949E38)
            if (r0 == 0) goto L_0x0074
            r3 = 2131887440(0x7f120550, float:1.9409487E38)
            goto L_0x0074
        L_0x0159:
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0071
            boolean r0 = r1.A03
            r3 = 2131887438(0x7f12054e, float:1.9409483E38)
            if (r0 == 0) goto L_0x0074
            r3 = 2131887437(0x7f12054d, float:1.9409481E38)
            goto L_0x0074
        L_0x0169:
            r0 = 2131887446(0x7f120556, float:1.94095E38)
            if (r5 == 0) goto L_0x004b
            r0 = 2131887445(0x7f120555, float:1.9409497E38)
            goto L_0x004b
        L_0x0173:
            r0 = 0
            goto L_0x0036
        L_0x0176:
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r0 = r4.this$0
            X.05L r7 = r0.A0P
            r8 = 1
            r6 = 3
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r1.iterator()
        L_0x0184:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.2DW r0 = (X.AnonymousClass2DW) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0184
            r4.add(r1)
            goto L_0x0184
        L_0x0199:
            X.02t[] r1 = new X.C006302t[r6]
            X.4Mr r0 = X.C86894Mr.A00
            r1[r5] = r0
            X.4Ms r0 = X.C86904Ms.A00
            r1[r8] = r0
            X.4Mt r0 = X.C86914Mt.A00
            r1[r2] = r0
            X.0t6 r0 = new X.0t6
            r0.<init>(r1, r2)
            java.util.List r0 = X.C007103b.A0c(r4, r0)
            r7.setValue(r0)
        L_0x01b3:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x01b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$refreshParticipants$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
