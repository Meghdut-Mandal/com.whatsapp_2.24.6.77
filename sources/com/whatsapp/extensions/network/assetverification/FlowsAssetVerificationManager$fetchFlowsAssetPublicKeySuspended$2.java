package com.whatsapp.extensions.network.assetverification;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass19R;
import X.AnonymousClass5AV;
import X.C009003v;
import X.C023509x;
import X.C1037356r;
import X.C1037556t;
import X.C117225lu;
import X.C123815x8;
import X.C26561Kq;
import X.C90524aI;
import com.whatsapp.graphql.GraphqlRequest$postAwait$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.network.assetverification.FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2", f = "FlowsAssetVerificationManager.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C26561Kq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2(C26561Kq r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2 flowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2 = new FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2(this.this$0, r4);
        flowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2.L$0 = obj;
        return flowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C26561Kq r2;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            r2 = this.this$0;
            try {
                if (!r2.A02.compareAndSet(false, true)) {
                    return C1037556t.A00;
                }
                AnonymousClass5AV A00 = r2.A00.A00();
                this.L$0 = r2;
                this.label = 1;
                obj = GraphqlRequest$postAwait$2.A01(A00, this, AnonymousClass19R.A01);
                if (obj == r6) {
                    return r6;
                }
            } catch (Throwable th) {
                obj2 = C90524aI.A0t(th);
            }
        } else if (i == 1) {
            r2 = (C26561Kq) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        obj2 = C26561Kq.A00(r2, (C117225lu) null, (C123815x8) obj);
        C26561Kq r3 = this.this$0;
        Throwable A002 = AnonymousClass0AK.A00(obj2);
        if (A002 == null) {
            return obj2;
        }
        r3.A02.set(false);
        return r3.A01(C1037356r.A00, (C117225lu) null, A002.getMessage(), A002);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
