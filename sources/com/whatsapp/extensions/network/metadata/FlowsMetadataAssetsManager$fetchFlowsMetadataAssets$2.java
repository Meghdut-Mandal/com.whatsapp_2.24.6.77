package com.whatsapp.extensions.network.metadata;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C26601Ku;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.network.metadata.FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2", f = "FlowsMetadataAssetsManager.kt", i = {}, l = {88, 90}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ String $flowId;
    public final /* synthetic */ Integer $instanceKey;
    public final /* synthetic */ boolean $isRequired;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ C26601Ku this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2(C26601Ku r2, UserJid userJid, Integer num, String str, C023509x r6, boolean z) {
        super(2, r6);
        this.this$0 = r2;
        this.$instanceKey = num;
        this.$flowId = str;
        this.$isRequired = z;
        this.$bizJid = userJid;
    }

    public final C023509x create(Object obj, C023509x r9) {
        FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2 flowsMetadataAssetsManager$fetchFlowsMetadataAssets$2 = new FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2(this.this$0, this.$bizJid, this.$instanceKey, this.$flowId, r9, this.$isRequired);
        flowsMetadataAssetsManager$fetchFlowsMetadataAssets$2.L$0 = obj;
        return flowsMetadataAssetsManager$fetchFlowsMetadataAssets$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x018d A[Catch:{ all -> 0x0194 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r9 = r24
            X.0AO r4 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r2 = r23
            int r0 = r2.label
            r6 = 2
            r3 = 0
            r7 = 0
            r5 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 == r5) goto L_0x0019
            if (r0 != r6) goto L_0x0014
            goto L_0x018e
        L_0x0014:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0019:
            boolean r11 = r2.Z$0
            java.lang.Object r15 = r2.L$3
            com.whatsapp.jid.UserJid r15 = (com.whatsapp.jid.UserJid) r15
            java.lang.Object r13 = r2.L$2
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r10 = r2.L$1
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r8 = r2.L$0
            X.1Ku r8 = (X.C26601Ku) r8
            goto L_0x00ad
        L_0x002d:
            X.AnonymousClass0AN.A00(r9)
            X.1Ku r8 = r2.this$0
            java.lang.Integer r10 = r2.$instanceKey
            java.lang.String r13 = r2.$flowId
            boolean r11 = r2.$isRequired
            com.whatsapp.jid.UserJid r15 = r2.$bizJid
            X.1Kg r0 = r8.A03     // Catch:{ all -> 0x0194 }
            boolean r0 = r0.A0B(r10)     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x0051
            java.lang.String r4 = "extensions-metadata-response-error"
            r1 = 3
            java.lang.Short r0 = new java.lang.Short     // Catch:{ all -> 0x0194 }
            r0.<init>(r1)     // Catch:{ all -> 0x0194 }
            X.6CL r9 = new X.6CL     // Catch:{ all -> 0x0194 }
            r9.<init>(r0, r4, r3, r5)     // Catch:{ all -> 0x0194 }
            goto L_0x0199
        L_0x0051:
            X.1Kf r12 = r8.A05     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = "metadata_network_start"
            r12.A08(r10, r0)     // Catch:{ all -> 0x0194 }
            X.1KT r9 = r8.A04     // Catch:{ all -> 0x0194 }
            if (r13 == 0) goto L_0x0066
            int r1 = r13.hashCode()     // Catch:{ all -> 0x0194 }
        L_0x0060:
            java.lang.String r0 = "fetch_key_network_start"
            X.C90494aF.A0x(r9, r0, r1)     // Catch:{ all -> 0x0194 }
            goto L_0x0068
        L_0x0066:
            r1 = -1
            goto L_0x0060
        L_0x0068:
            if (r11 == 0) goto L_0x006d
            java.lang.String r9 = "required"
            goto L_0x006f
        L_0x006d:
            java.lang.String r9 = "optional"
        L_0x006f:
            if (r10 == 0) goto L_0x007a
            int r1 = r10.intValue()     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = "endpoint_public_key_fetch_mode"
            r12.A03(r1, r0, r9)     // Catch:{ all -> 0x0194 }
        L_0x007a:
            X.1Kh r12 = r8.A01     // Catch:{ all -> 0x0194 }
            java.lang.String r9 = r15.getRawString()     // Catch:{ all -> 0x0194 }
            boolean r0 = X.AnonymousClass000.A1P(r11)
            X.AnonymousClass00C.A0D(r9, r5)     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x008f
            r0 = 6948263101939337(0x18af6891ff3e89, double:3.4328980969345616E-308)
            goto L_0x0094
        L_0x008f:
            r0 = 7141081849274528(0x195ec6aef020a0, double:3.528163215867023E-308)
        L_0x0094:
            X.5AZ r1 = r12.A00(r9, r7, r0)     // Catch:{ all -> 0x0194 }
            r2.L$0 = r8     // Catch:{ all -> 0x0194 }
            r2.L$1 = r10     // Catch:{ all -> 0x0194 }
            r2.L$2 = r13     // Catch:{ all -> 0x0194 }
            r2.L$3 = r15     // Catch:{ all -> 0x0194 }
            r2.Z$0 = r11     // Catch:{ all -> 0x0194 }
            r2.label = r5     // Catch:{ all -> 0x0194 }
            X.02m r0 = X.AnonymousClass19R.A01     // Catch:{ all -> 0x0194 }
            java.lang.Object r9 = com.whatsapp.graphql.GraphqlRequest$postAwait$2.A01(r1, r2, r0)     // Catch:{ all -> 0x0194 }
            if (r9 != r4) goto L_0x00b0
            return r4
        L_0x00ad:
            X.AnonymousClass0AN.A00(r9)     // Catch:{ all -> 0x0194 }
        L_0x00b0:
            X.5x8 r9 = (X.C123815x8) r9     // Catch:{ all -> 0x0194 }
            boolean r14 = X.AnonymousClass000.A1P(r11)
            r2.L$0 = r7     // Catch:{ all -> 0x0194 }
            r2.L$1 = r7     // Catch:{ all -> 0x0194 }
            r2.L$2 = r7     // Catch:{ all -> 0x0194 }
            r2.L$3 = r7     // Catch:{ all -> 0x0194 }
            r2.label = r6     // Catch:{ all -> 0x0194 }
            X.1Kf r11 = r8.A05     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = "metadata_network_end"
            r11.A08(r10, r0)     // Catch:{ all -> 0x0194 }
            X.1KT r12 = r8.A04     // Catch:{ all -> 0x0194 }
            if (r13 == 0) goto L_0x0104
            int r1 = r13.hashCode()     // Catch:{ all -> 0x0194 }
        L_0x00cf:
            java.lang.String r0 = "fetch_key_network_end"
            X.C90494aF.A0x(r12, r0, r1)     // Catch:{ all -> 0x0194 }
            int r0 = r9.A00     // Catch:{ all -> 0x0194 }
            r13 = 0
            if (r0 != 0) goto L_0x0147
            X.60z r0 = r9.A03     // Catch:{ all -> 0x0194 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0194 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x0194 }
            X.6BQ r0 = (X.AnonymousClass6BQ) r0     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x00e6
            X.6AF r13 = r0.A01     // Catch:{ all -> 0x0194 }
        L_0x00e6:
            X.1Kg r0 = r8.A03     // Catch:{ all -> 0x0194 }
            r0.A08(r9, r10)     // Catch:{ all -> 0x0194 }
            java.lang.String r12 = "endpoint_public_key_received"
            if (r13 == 0) goto L_0x0130
            java.lang.String r1 = r13.A00     // Catch:{ all -> 0x0194 }
            if (r1 == 0) goto L_0x0130
            int r0 = r1.length()     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = r13.A01     // Catch:{ all -> 0x0194 }
            if (r0 == 0) goto L_0x0130
            int r9 = r0.length()     // Catch:{ all -> 0x0194 }
            if (r9 == 0) goto L_0x0130
            goto L_0x0106
        L_0x0104:
            r1 = -1
            goto L_0x00cf
        L_0x0106:
            if (r10 == 0) goto L_0x010f
            int r6 = r10.intValue()     // Catch:{ all -> 0x0194 }
            r11.A04(r6, r12, r5)     // Catch:{ all -> 0x0194 }
        L_0x010f:
            X.0iM r6 = X.C36411kG.A16(r2)     // Catch:{ all -> 0x0194 }
            X.1KY r13 = r8.A02     // Catch:{ all -> 0x0194 }
            X.7t5 r14 = new X.7t5     // Catch:{ all -> 0x0194 }
            r14.<init>(r8, r10, r6, r3)     // Catch:{ all -> 0x0194 }
            r21 = -1
            r20 = r7
            r22 = 0
            r18 = r7
            r19 = r7
            r17 = r0
            r16 = r1
            r13.A02(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0194 }
            java.lang.Object r9 = r6.A00()     // Catch:{ all -> 0x0194 }
            goto L_0x018b
        L_0x0130:
            if (r10 == 0) goto L_0x0139
            int r0 = r10.intValue()     // Catch:{ all -> 0x0194 }
            r11.A04(r0, r12, r3)     // Catch:{ all -> 0x0194 }
        L_0x0139:
            if (r14 == 0) goto L_0x013c
            goto L_0x017b
        L_0x013c:
            java.lang.Short r0 = new java.lang.Short     // Catch:{ all -> 0x0194 }
            r0.<init>(r6)     // Catch:{ all -> 0x0194 }
            X.6CL r9 = new X.6CL     // Catch:{ all -> 0x0194 }
            r9.<init>(r0, r7, r5, r3)     // Catch:{ all -> 0x0194 }
            goto L_0x018b
        L_0x0147:
            X.66O r0 = r9.A04     // Catch:{ all -> 0x0194 }
            java.lang.Object r1 = r0.A00(r7)     // Catch:{ all -> 0x0194 }
            r0 = 2498098(0x261e32, float:3.500581E-39)
            java.lang.Integer r0 = X.C90524aI.A0a(r0)     // Catch:{ all -> 0x0194 }
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)     // Catch:{ all -> 0x0194 }
            java.lang.String r6 = "extensions-metadata-response-error"
            if (r0 == 0) goto L_0x016b
            r11.A07(r10)     // Catch:{ all -> 0x0194 }
            r1 = 3
            java.lang.Short r0 = new java.lang.Short     // Catch:{ all -> 0x0194 }
            r0.<init>(r1)     // Catch:{ all -> 0x0194 }
            X.6CL r9 = new X.6CL     // Catch:{ all -> 0x0194 }
            r9.<init>(r0, r6, r3, r5)     // Catch:{ all -> 0x0194 }
            goto L_0x018b
        L_0x016b:
            r11.A0E(r10, r6, r7)     // Catch:{ all -> 0x0194 }
            X.0wN r1 = r8.A00     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = ""
            r1.A0E(r6, r0, r5)     // Catch:{ all -> 0x0194 }
            java.lang.String r0 = "FlowsLogger/FlowsMetadataAssetsManager/handleAssetsSuccessResponse()/ - Response is not success"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0194 }
            goto L_0x0180
        L_0x017b:
            java.lang.String r6 = "flows-endpoint-public-key-missing"
            r11.A0E(r10, r6, r7)     // Catch:{ all -> 0x0194 }
        L_0x0180:
            r1 = 3
            java.lang.Short r0 = new java.lang.Short     // Catch:{ all -> 0x0194 }
            r0.<init>(r1)     // Catch:{ all -> 0x0194 }
            X.6CL r9 = new X.6CL     // Catch:{ all -> 0x0194 }
            r9.<init>(r0, r6, r3, r3)     // Catch:{ all -> 0x0194 }
        L_0x018b:
            if (r9 != r4) goto L_0x0191
            return r4
        L_0x018e:
            X.AnonymousClass0AN.A00(r9)     // Catch:{ all -> 0x0194 }
        L_0x0191:
            X.6CL r9 = (X.AnonymousClass6CL) r9     // Catch:{ all -> 0x0194 }
            goto L_0x0199
        L_0x0194:
            r0 = move-exception
            X.03N r9 = X.C90524aI.A0t(r0)
        L_0x0199:
            X.1Ku r8 = r2.this$0
            java.lang.Integer r7 = r2.$instanceKey
            java.lang.String r1 = r2.$flowId
            java.lang.Throwable r6 = X.AnonymousClass0AK.A00(r9)
            if (r6 == 0) goto L_0x01d8
            X.1Kf r4 = r8.A05
            java.lang.String r0 = "metadata_network_end"
            r4.A08(r7, r0)
            X.1KT r2 = r8.A04
            if (r1 == 0) goto L_0x01d9
            int r1 = r1.hashCode()
        L_0x01b4:
            java.lang.String r0 = "fetch_key_network_end"
            X.C90494aF.A0x(r2, r0, r1)
            java.lang.String r0 = r6.getMessage()
            java.lang.String r2 = "extensions-metadata-graphql-response-error"
            r4.A0E(r7, r2, r0)
            X.0wN r1 = r8.A00
            java.lang.String r0 = ""
            r1.A0E(r2, r0, r5)
            java.lang.String r0 = "FlowsLogger/FlowsMetadataAssetsManager/handleAssetsErrorResponse()"
            com.whatsapp.util.Log.w(r0, r6)
            r0 = 3
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            X.6CL r9 = new X.6CL
            r9.<init>(r0, r2, r3, r3)
        L_0x01d8:
            return r9
        L_0x01d9:
            r1 = -1
            goto L_0x01b4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.network.metadata.FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsMetadataAssetsManager$fetchFlowsMetadataAssets$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
