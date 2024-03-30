package com.whatsapp.group.iq;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass147;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.group.iq.GetGroupInfoProtocolHelper$sendGetGroupInfoRequest$3", f = "GetGroupInfoProtocolHelper.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
public final class GetGroupInfoProtocolHelper$sendGetGroupInfoRequest$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass147 $groupJid;
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ String $requestType;
    public final /* synthetic */ int $syncDeviceType;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ GetGroupInfoProtocolHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetGroupInfoProtocolHelper$sendGetGroupInfoRequest$3(GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, AnonymousClass147 r3, String str, String str2, C023509x r6, int i) {
        super(2, r6);
        this.this$0 = getGroupInfoProtocolHelper;
        this.$iqId = str;
        this.$groupJid = r3;
        this.$syncDeviceType = i;
        this.$requestType = str2;
    }

    public final C023509x create(Object obj, C023509x r9) {
        GetGroupInfoProtocolHelper getGroupInfoProtocolHelper = this.this$0;
        String str = this.$iqId;
        return new GetGroupInfoProtocolHelper$sendGetGroupInfoRequest$3(getGroupInfoProtocolHelper, this.$groupJid, str, this.$requestType, r9, this.$syncDeviceType);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        if (r4.A03.A0E(7119) != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bf, code lost:
        if (r4.A03.A0E(7053) == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c1, code lost:
        r5 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r3 = r17
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r1 = r16
            int r0 = r1.label
            r15 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 != r15) goto L_0x00c6
            X.AnonymousClass0AN.A00(r3)
        L_0x0010:
            return r3
        L_0x0011:
            X.AnonymousClass0AN.A00(r3)
            com.whatsapp.group.iq.GetGroupInfoProtocolHelper r4 = r1.this$0
            java.lang.String r9 = r1.$iqId
            X.147 r8 = r1.$groupJid
            int r3 = r1.$syncDeviceType
            java.lang.String r5 = r1.$requestType
            r1.L$0 = r4
            r1.L$1 = r9
            r1.L$2 = r8
            r1.L$3 = r5
            r1.I$0 = r3
            r1.label = r15
            X.0AR r1 = X.C36371kC.A12(r1)
            X.C36321k7.A0v(r9, r15, r8)
            r10 = 0
            if (r5 == 0) goto L_0x00c3
            X.2l9 r0 = new X.2l9
            r0.<init>(r5)
            X.1jR r6 = new X.1jR
            r6.<init>((X.C50582l9) r0)
        L_0x003e:
            X.17b r0 = r4.A04
            int r0 = r0.A01(r8)
            if (r0 == 0) goto L_0x00b6
            r7 = 1
            X.0yC r5 = r4.A03
            r0 = 7119(0x1bcf, float:9.976E-42)
            boolean r0 = r5.A0E(r0)
            if (r0 == 0) goto L_0x00c1
        L_0x0051:
            r5 = 1
        L_0x0052:
            X.12q r0 = r4.A01
            int r0 = r0.A05(r8)
            if (r0 == r15) goto L_0x0062
            if (r5 == 0) goto L_0x0062
            X.17X r0 = r4.A02
            java.lang.String r10 = r0.A04(r8, r7)
        L_0x0062:
            X.6QB r7 = X.C36421kH.A0T()
            java.lang.String r5 = "xmlns"
            java.lang.String r0 = "w:g2"
            X.C36331k8.A1D(r7, r5, r0)
            java.lang.String r5 = "type"
            java.lang.String r0 = "get"
            X.C36331k8.A1D(r7, r5, r0)
            java.lang.String r0 = "to"
            X.C36351kA.A1I(r8, r7, r0)
            X.C36331k8.A1C(r7, r9)
            java.lang.String r0 = "query"
            X.6QB r5 = X.C36441kJ.A0q(r0)
            if (r10 == 0) goto L_0x0093
            r11 = 10
            r13 = 10
            boolean r0 = X.C203539oF.A0P(r10, r11, r13, r15)
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = "phash"
            X.C36331k8.A1D(r5, r0, r10)
        L_0x0093:
            if (r6 == 0) goto L_0x009a
            X.9nx r0 = r6.A00
            r5.A06(r0)
        L_0x009a:
            X.C36361kB.A1H(r5, r7)
            X.9nx r8 = r7.A03()
            X.19A r6 = r4.A05
            X.3pA r7 = new X.3pA
            r7.<init>(r4, r1, r3)
            long r11 = com.whatsapp.group.iq.GetGroupInfoProtocolHelper.A09
            r10 = 20
            r6.A0E(r7, r8, r9, r10, r11)
            java.lang.Object r3 = r1.A0G()
            if (r3 != r2) goto L_0x0010
            return r2
        L_0x00b6:
            r7 = 0
            X.0yC r5 = r4.A03
            r0 = 7053(0x1b8d, float:9.883E-42)
            boolean r0 = r5.A0E(r0)
            if (r0 != 0) goto L_0x0051
        L_0x00c1:
            r5 = 0
            goto L_0x0052
        L_0x00c3:
            r6 = r10
            goto L_0x003e
        L_0x00c6:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.iq.GetGroupInfoProtocolHelper$sendGetGroupInfoRequest$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetGroupInfoProtocolHelper$sendGetGroupInfoRequest$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
