package com.whatsapp.stickers.starred;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1BB;
import X.AnonymousClass7OE;
import X.C009003v;
import X.C023509x;
import X.C05770Qz;
import X.C130566Lo;
import X.C162907pL;
import X.C18000sQ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.starred.StarredStickersFlow$stickerCallbackFlow$1", f = "StarredStickersFlow.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
public final class StarredStickersFlow$stickerCallbackFlow$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass1BB $stickerObservers;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C130566Lo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarredStickersFlow$stickerCallbackFlow$1(AnonymousClass1BB r2, C130566Lo r3, C023509x r4) {
        super(2, r4);
        this.$stickerObservers = r2;
        this.this$0 = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        StarredStickersFlow$stickerCallbackFlow$1 starredStickersFlow$stickerCallbackFlow$1 = new StarredStickersFlow$stickerCallbackFlow$1(this.$stickerObservers, this.this$0, r5);
        starredStickersFlow$stickerCallbackFlow$1.L$0 = obj;
        return starredStickersFlow$stickerCallbackFlow$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C18000sQ r3 = (C18000sQ) this.L$0;
            C162907pL r2 = new C162907pL(this.this$0, r3, 5);
            this.$stickerObservers.registerObserver(r2);
            C130566Lo.A00(this.this$0, r3, 1);
            AnonymousClass7OE r0 = new AnonymousClass7OE(r2, this.$stickerObservers);
            this.label = 1;
            if (C05770Qz.A00(this, r0, r3) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StarredStickersFlow$stickerCallbackFlow$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
