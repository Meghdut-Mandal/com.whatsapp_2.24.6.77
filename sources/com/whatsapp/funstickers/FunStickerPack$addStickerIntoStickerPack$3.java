package com.whatsapp.funstickers;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1BB;
import X.AnonymousClass68B;
import X.C009003v;
import X.C023509x;
import X.C129016Ep;
import X.C129156Fn;
import X.C36361kB;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.FunStickerPack$addStickerIntoStickerPack$3", f = "FunStickerPack.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickerPack$addStickerIntoStickerPack$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass68B $stickerPack;
    public int label;
    public final /* synthetic */ C129016Ep this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickerPack$addStickerIntoStickerPack$3(C129016Ep r2, AnonymousClass68B r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$stickerPack = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new FunStickerPack$addStickerIntoStickerPack$3(this.this$0, this.$stickerPack, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass1BB r0 = this.this$0.A03;
            AnonymousClass68B r2 = this.$stickerPack;
            Iterator A0s = C36361kB.A0s(r0);
            while (A0s.hasNext()) {
                ((C129156Fn) A0s.next()).A07(r2);
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FunStickerPack$addStickerIntoStickerPack$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
