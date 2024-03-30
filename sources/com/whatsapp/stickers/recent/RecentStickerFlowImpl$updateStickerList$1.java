package com.whatsapp.stickers.recent;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass5Kw;
import X.AnonymousClass6ST;
import X.C009003v;
import X.C023509x;
import X.C05760Qy;
import X.C104665Ar;
import X.C106695Kx;
import X.C18000sQ;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateStickerList$1", f = "RecentStickerFlowImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RecentStickerFlowImpl$updateStickerList$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C18000sQ $this_updateStickerList;
    public int label;
    public final /* synthetic */ AnonymousClass6ST this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentStickerFlowImpl$updateStickerList$1(AnonymousClass6ST r2, C023509x r3, C18000sQ r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$this_updateStickerList = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new RecentStickerFlowImpl$updateStickerList$1(this.this$0, r5, this.$this_updateStickerList);
    }

    public final Object invokeSuspend(Object obj) {
        Object r0;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            ArrayList A0F = ((C104665Ar) this.this$0.A02.get()).A0F();
            boolean isEmpty = A0F.isEmpty();
            C18000sQ r1 = this.$this_updateStickerList;
            if (isEmpty) {
                r0 = C106695Kx.A00;
            } else {
                r0 = new AnonymousClass5Kw(A0F);
            }
            C05760Qy.A00(r0, r1);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RecentStickerFlowImpl$updateStickerList$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
