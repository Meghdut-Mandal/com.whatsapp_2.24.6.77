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
import X.C135066c4;
import X.C146796wB;
import X.C161307mX;
import X.C18000sQ;
import X.C36321k7;
import X.C36441kJ;
import X.C90504aG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateShapeAvatarStickerList$1", f = "RecentStickerFlowImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RecentStickerFlowImpl$updateShapeAvatarStickerList$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C18000sQ $this_updateShapeAvatarStickerList;
    public int label;
    public final /* synthetic */ AnonymousClass6ST this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentStickerFlowImpl$updateShapeAvatarStickerList$1(AnonymousClass6ST r2, C023509x r3, C18000sQ r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$this_updateShapeAvatarStickerList = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new RecentStickerFlowImpl$updateShapeAvatarStickerList$1(this.this$0, r5, this.$this_updateShapeAvatarStickerList);
    }

    public final Object invokeSuspend(Object obj) {
        C18000sQ r1;
        Object r0;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C104655Aq r02 = this.this$0.A00;
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = r02.A04().iterator();
            while (it.hasNext()) {
                C161307mX r12 = (C161307mX) it.next();
                if (r12.BHQ() == 2) {
                    A0I.add(r12);
                }
            }
            ArrayList A0J = C36321k7.A0J(A0I);
            Iterator it2 = A0I.iterator();
            while (it2.hasNext()) {
                C161307mX r13 = (C161307mX) it2.next();
                AnonymousClass00C.A0E(r13, "null cannot be cast to non-null type com.whatsapp.mediacomposer.doodle.shapepicker.StickerShapeCreator");
                A0J.add(((C146796wB) r13).A00);
            }
            if (A0J.isEmpty()) {
                r1 = this.$this_updateShapeAvatarStickerList;
                r0 = C106695Kx.A00;
            } else {
                HashSet A16 = C36441kJ.A16();
                ArrayList A0I2 = AnonymousClass001.A0I();
                for (Object next : A0J) {
                    C90504aG.A1H(((C135066c4) next).A06, next, A16, A0I2);
                }
                r1 = this.$this_updateShapeAvatarStickerList;
                r0 = new AnonymousClass5Kw(A0I2);
            }
            C05760Qy.A00(r0, r1);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RecentStickerFlowImpl$updateShapeAvatarStickerList$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
