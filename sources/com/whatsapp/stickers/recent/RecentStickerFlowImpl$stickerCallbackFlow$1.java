package com.whatsapp.stickers.recent;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1BB;
import X.AnonymousClass6ST;
import X.AnonymousClass7OC;
import X.C009003v;
import X.C023509x;
import X.C05770Qz;
import X.C162907pL;
import X.C18000sQ;
import X.C36381kD;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.recent.RecentStickerFlowImpl$stickerCallbackFlow$1", f = "RecentStickerFlowImpl.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
public final class RecentStickerFlowImpl$stickerCallbackFlow$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass1BB $stickerObservers;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass6ST this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentStickerFlowImpl$stickerCallbackFlow$1(AnonymousClass1BB r2, AnonymousClass6ST r3, C023509x r4) {
        super(2, r4);
        this.$stickerObservers = r2;
        this.this$0 = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        RecentStickerFlowImpl$stickerCallbackFlow$1 recentStickerFlowImpl$stickerCallbackFlow$1 = new RecentStickerFlowImpl$stickerCallbackFlow$1(this.$stickerObservers, this.this$0, r5);
        recentStickerFlowImpl$stickerCallbackFlow$1.L$0 = obj;
        return recentStickerFlowImpl$stickerCallbackFlow$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C18000sQ r5 = (C18000sQ) this.L$0;
            C162907pL r4 = new C162907pL(this.this$0, r5, 3);
            this.$stickerObservers.registerObserver(r4);
            AnonymousClass6ST r3 = this.this$0;
            C36381kD.A1R(r3.A03, new RecentStickerFlowImpl$updateStickerList$1(r3, (C023509x) null, r5), r5);
            AnonymousClass7OC r0 = new AnonymousClass7OC(r4, this.$stickerObservers);
            this.label = 1;
            if (C05770Qz.A00(this, r0, r5) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RecentStickerFlowImpl$stickerCallbackFlow$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
