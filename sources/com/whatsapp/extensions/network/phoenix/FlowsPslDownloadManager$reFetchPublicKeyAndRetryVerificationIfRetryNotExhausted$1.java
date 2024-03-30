package com.whatsapp.extensions.network.phoenix;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C26491Kj;
import X.C26561Kq;
import com.whatsapp.extensions.network.assetverification.FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2;
import java.util.concurrent.CountDownLatch;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.extensions.network.phoenix.FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1", f = "FlowsPslDownloadManager.kt", i = {}, l = {392}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ CountDownLatch $latch;
    public int label;
    public final /* synthetic */ C26491Kj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1(C26491Kj r2, CountDownLatch countDownLatch, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$latch = countDownLatch;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1(this.this$0, this.$latch, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C26561Kq r3 = this.this$0.A02;
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r3.A03, new FlowsAssetVerificationManager$fetchFlowsAssetPublicKeySuspended$2(r3, (C023509x) null)) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        this.$latch.countDown();
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsPslDownloadManager$reFetchPublicKeyAndRetryVerificationIfRetryNotExhausted$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
