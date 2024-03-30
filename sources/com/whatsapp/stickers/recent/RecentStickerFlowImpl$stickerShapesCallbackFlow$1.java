package com.whatsapp.stickers.recent;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass6ST;
import X.AnonymousClass7QP;
import X.C009003v;
import X.C023509x;
import X.C05770Qz;
import X.C18000sQ;
import X.C36381kD;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.recent.RecentStickerFlowImpl$stickerShapesCallbackFlow$1", f = "RecentStickerFlowImpl.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
public final class RecentStickerFlowImpl$stickerShapesCallbackFlow$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnonymousClass6ST this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentStickerFlowImpl$stickerShapesCallbackFlow$1(AnonymousClass6ST r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        RecentStickerFlowImpl$stickerShapesCallbackFlow$1 recentStickerFlowImpl$stickerShapesCallbackFlow$1 = new RecentStickerFlowImpl$stickerShapesCallbackFlow$1(this.this$0, r4);
        recentStickerFlowImpl$stickerShapesCallbackFlow$1.L$0 = obj;
        return recentStickerFlowImpl$stickerShapesCallbackFlow$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C18000sQ r4 = (C18000sQ) this.L$0;
            AnonymousClass6ST r3 = this.this$0;
            C36381kD.A1R(r3.A03, new RecentStickerFlowImpl$updateShapeStickerList$1(r3, (C023509x) null, r4), r4);
            AnonymousClass7QP r0 = AnonymousClass7QP.A00;
            this.label = 1;
            if (C05770Qz.A00(this, r0, r4) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RecentStickerFlowImpl$stickerShapesCallbackFlow$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
