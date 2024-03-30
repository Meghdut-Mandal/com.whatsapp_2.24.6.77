package com.whatsapp.stickers.recent;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass5Kw;
import X.AnonymousClass6ST;
import X.C009003v;
import X.C023509x;
import X.C05760Qy;
import X.C104655Aq;
import X.C106695Kx;
import X.C146796wB;
import X.C161307mX;
import X.C18000sQ;
import X.C36321k7;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateShapeStickerList$1", f = "RecentStickerFlowImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RecentStickerFlowImpl$updateShapeStickerList$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C18000sQ $this_updateShapeStickerList;
    public int label;
    public final /* synthetic */ AnonymousClass6ST this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentStickerFlowImpl$updateShapeStickerList$1(AnonymousClass6ST r2, C023509x r3, C18000sQ r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$this_updateShapeStickerList = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new RecentStickerFlowImpl$updateShapeStickerList$1(this.this$0, r5, this.$this_updateShapeStickerList);
    }

    public final Object invokeSuspend(Object obj) {
        Object r0;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C104655Aq r02 = this.this$0.A00;
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = r02.A04().iterator();
            while (it.hasNext()) {
                C161307mX r1 = (C161307mX) it.next();
                if (r1.BHQ() == 1) {
                    A0I.add(r1);
                }
            }
            ArrayList A0J = C36321k7.A0J(A0I);
            Iterator it2 = A0I.iterator();
            while (it2.hasNext()) {
                C161307mX r12 = (C161307mX) it2.next();
                AnonymousClass00C.A0E(r12, "null cannot be cast to non-null type com.whatsapp.mediacomposer.doodle.shapepicker.StickerShapeCreator");
                A0J.add(((C146796wB) r12).A00);
            }
            boolean isEmpty = A0J.isEmpty();
            C18000sQ r13 = this.$this_updateShapeStickerList;
            if (isEmpty) {
                r0 = C106695Kx.A00;
            } else {
                r0 = new AnonymousClass5Kw(A0J);
            }
            C05760Qy.A00(r0, r13);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RecentStickerFlowImpl$updateShapeStickerList$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
