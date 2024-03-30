package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass01N;
import X.AnonymousClass01P;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C007403e;
import X.C009003v;
import X.C023509x;
import X.C13010j1;
import X.C15390nG;
import X.C164237rU;
import X.C52992qW;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.stickers.StickerExpressionsFragment$observeShapeStickersLayoutData$1", f = "StickerExpressionsFragment.kt", i = {}, l = {456}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsFragment$observeShapeStickersLayoutData$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsFragment$observeShapeStickersLayoutData$1(StickerExpressionsFragment stickerExpressionsFragment, C023509x r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsFragment;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new StickerExpressionsFragment$observeShapeStickersLayoutData$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StickerExpressionsFragment$observeShapeStickersLayoutData$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C13010j1 r2 = new C13010j1((C007403e) null, StickerExpressionsFragment.A03(this.this$0).A0H.A02);
            AnonymousClass01N r1 = this.this$0.A0P;
            AnonymousClass00C.A08(r1);
            C15390nG A00 = C52992qW.A00(AnonymousClass01P.STARTED, r1, r2);
            C164237rU r0 = new C164237rU(this.this$0, 19);
            this.label = 1;
            if (A00.B36(this, r0) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
