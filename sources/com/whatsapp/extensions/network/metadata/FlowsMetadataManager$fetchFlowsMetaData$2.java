package com.whatsapp.extensions.network.metadata;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C26461Kg;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2", f = "FlowsMetadataManager.kt", i = {}, l = {225, 227}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsMetadataManager$fetchFlowsMetaData$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ String $flowId;
    public final /* synthetic */ Integer $instanceKey;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ boolean $shouldDownloadPSL;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ C26461Kg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsMetadataManager$fetchFlowsMetaData$2(C26461Kg r2, UserJid userJid, Integer num, String str, String str2, String str3, C023509x r8, boolean z) {
        super(2, r8);
        this.this$0 = r2;
        this.$instanceKey = num;
        this.$flowId = str;
        this.$bizJid = userJid;
        this.$shouldDownloadPSL = z;
        this.$messageId = str2;
        this.$sessionId = str3;
    }

    public final C023509x create(Object obj, C023509x r11) {
        C26461Kg r1 = this.this$0;
        Integer num = this.$instanceKey;
        String str = this.$flowId;
        FlowsMetadataManager$fetchFlowsMetaData$2 flowsMetadataManager$fetchFlowsMetaData$2 = new FlowsMetadataManager$fetchFlowsMetaData$2(r1, this.$bizJid, num, str, this.$messageId, this.$sessionId, r11, this.$shouldDownloadPSL);
        flowsMetadataManager$fetchFlowsMetaData$2.L$0 = obj;
        return flowsMetadataManager$fetchFlowsMetaData$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r24
            java.lang.String r11 = "metadata_network_start"
            X.0AO r9 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r5 = r23
            int r0 = r5.label
            r12 = 2
            r10 = 1
            r14 = 0
            if (r0 == 0) goto L_0x0050
            if (r0 == r10) goto L_0x0034
            if (r0 != r12) goto L_0x002f
            boolean r8 = r5.Z$0
            java.lang.Object r7 = r5.L$5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r5.L$4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r5.L$3
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r3 = r5.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r5.L$1
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r15 = r5.L$0
            X.1Kg r15 = (X.C26461Kg) r15
            goto L_0x010a
        L_0x002f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0034:
            boolean r8 = r5.Z$0
            java.lang.Object r7 = r5.L$5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r5.L$4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r5.L$3
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r3 = r5.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r5.L$1
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r15 = r5.L$0
            X.1Kg r15 = (X.C26461Kg) r15
            goto L_0x00dc
        L_0x0050:
            X.AnonymousClass0AN.A00(r1)
            X.1Kg r15 = r5.this$0
            java.lang.Integer r2 = r5.$instanceKey
            java.lang.String r3 = r5.$flowId
            com.whatsapp.jid.UserJid r4 = r5.$bizJid
            boolean r8 = r5.$shouldDownloadPSL
            java.lang.String r6 = r5.$messageId
            java.lang.String r7 = r5.$sessionId
            boolean r0 = r15.A0B(r2)     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x0076
            java.lang.String r2 = "extensions-metadata-response-error"
            r1 = 3
            java.lang.Short r0 = new java.lang.Short     // Catch:{ all -> 0x0124 }
            r0.<init>(r1)     // Catch:{ all -> 0x0124 }
            X.6CM r4 = new X.6CM     // Catch:{ all -> 0x0124 }
            r4.<init>(r14, r0, r2, r10)     // Catch:{ all -> 0x0124 }
            goto L_0x0129
        L_0x0076:
            X.1Kf r13 = r15.A03     // Catch:{ all -> 0x0124 }
            r13.A08(r2, r11)     // Catch:{ all -> 0x0124 }
            X.1KT r1 = r15.A02     // Catch:{ all -> 0x0124 }
            if (r3 == 0) goto L_0x008b
            int r0 = r3.hashCode()     // Catch:{ all -> 0x0124 }
            java.lang.Integer r0 = X.C90524aI.A0a(r0)     // Catch:{ all -> 0x0124 }
        L_0x0087:
            r1.A08(r0, r11)     // Catch:{ all -> 0x0124 }
            goto L_0x008d
        L_0x008b:
            r0 = r14
            goto L_0x0087
        L_0x008d:
            if (r3 == 0) goto L_0x00e2
            X.0yC r1 = r15.A04     // Catch:{ all -> 0x0124 }
            r0 = 7352(0x1cb8, float:1.0302E-41)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0124 }
            if (r0 == 0) goto L_0x00e2
            if (r2 == 0) goto L_0x00a4
            int r1 = r2.intValue()     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = "flow_id"
            r13.A03(r1, r0, r3)     // Catch:{ all -> 0x0124 }
        L_0x00a4:
            java.lang.String r11 = "optional"
            if (r2 == 0) goto L_0x00b1
            int r1 = r2.intValue()     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = "endpoint_public_key_fetch_mode"
            r13.A03(r1, r0, r11)     // Catch:{ all -> 0x0124 }
        L_0x00b1:
            X.1Kh r12 = r15.A00     // Catch:{ all -> 0x0124 }
            java.lang.String r11 = r4.getRawString()     // Catch:{ all -> 0x0124 }
            X.AnonymousClass00C.A0D(r11, r10)     // Catch:{ all -> 0x0124 }
            r0 = 6848666948572627(0x1854d388a795d3, double:3.383691059098134E-308)
            X.5AZ r1 = r12.A00(r11, r3, r0)     // Catch:{ all -> 0x0124 }
            r5.L$0 = r15     // Catch:{ all -> 0x0124 }
            r5.L$1 = r2     // Catch:{ all -> 0x0124 }
            r5.L$2 = r3     // Catch:{ all -> 0x0124 }
            r5.L$3 = r4     // Catch:{ all -> 0x0124 }
            r5.L$4 = r6     // Catch:{ all -> 0x0124 }
            r5.L$5 = r7     // Catch:{ all -> 0x0124 }
            r5.Z$0 = r8     // Catch:{ all -> 0x0124 }
            r5.label = r10     // Catch:{ all -> 0x0124 }
            X.02m r0 = X.AnonymousClass19R.A01     // Catch:{ all -> 0x0124 }
            java.lang.Object r1 = com.whatsapp.graphql.GraphqlRequest$postAwait$2.A01(r1, r5, r0)     // Catch:{ all -> 0x0124 }
            if (r1 != r9) goto L_0x00df
            return r9
        L_0x00dc:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ all -> 0x0124 }
        L_0x00df:
            X.5x8 r1 = (X.C123815x8) r1     // Catch:{ all -> 0x0124 }
            goto L_0x010f
        L_0x00e2:
            X.1Kh r11 = r15.A00     // Catch:{ all -> 0x0124 }
            java.lang.String r10 = r4.getRawString()     // Catch:{ all -> 0x0124 }
            r0 = 6712734982081747(0x17d93268140cd3, double:3.316531744283347E-308)
            X.5AZ r1 = r11.A00(r10, r14, r0)     // Catch:{ all -> 0x0124 }
            r5.L$0 = r15     // Catch:{ all -> 0x0124 }
            r5.L$1 = r2     // Catch:{ all -> 0x0124 }
            r5.L$2 = r3     // Catch:{ all -> 0x0124 }
            r5.L$3 = r4     // Catch:{ all -> 0x0124 }
            r5.L$4 = r6     // Catch:{ all -> 0x0124 }
            r5.L$5 = r7     // Catch:{ all -> 0x0124 }
            r5.Z$0 = r8     // Catch:{ all -> 0x0124 }
            r5.label = r12     // Catch:{ all -> 0x0124 }
            X.02m r0 = X.AnonymousClass19R.A01     // Catch:{ all -> 0x0124 }
            java.lang.Object r1 = com.whatsapp.graphql.GraphqlRequest$postAwait$2.A01(r1, r5, r0)     // Catch:{ all -> 0x0124 }
            if (r1 != r9) goto L_0x010d
            return r9
        L_0x010a:
            X.AnonymousClass0AN.A00(r1)     // Catch:{ all -> 0x0124 }
        L_0x010d:
            X.5x8 r1 = (X.C123815x8) r1     // Catch:{ all -> 0x0124 }
        L_0x010f:
            boolean r22 = X.AnonymousClass000.A1P(r8)
            r21 = r3
            r20 = r7
            r19 = r6
            r18 = r2
            r17 = r4
            r16 = r1
            X.6CM r4 = X.C26461Kg.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0124 }
            goto L_0x0129
        L_0x0124:
            r0 = move-exception
            X.03N r4 = X.C90524aI.A0t(r0)
        L_0x0129:
            X.1Kg r3 = r5.this$0
            java.lang.Integer r2 = r5.$instanceKey
            java.lang.String r1 = r5.$flowId
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r4)
            if (r0 == 0) goto L_0x0139
            X.6CM r4 = X.C26461Kg.A01(r14, r3, r2, r1, r0)
        L_0x0139:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.extensions.network.metadata.FlowsMetadataManager$fetchFlowsMetaData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsMetadataManager$fetchFlowsMetaData$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
