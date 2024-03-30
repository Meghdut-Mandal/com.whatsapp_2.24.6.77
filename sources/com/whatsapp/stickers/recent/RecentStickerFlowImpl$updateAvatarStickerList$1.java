package com.whatsapp.stickers.recent;

import X.AnonymousClass000;
import X.AnonymousClass001;
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
import X.C135066c4;
import X.C18000sQ;
import X.C36441kJ;
import X.C90504aG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateAvatarStickerList$1", f = "RecentStickerFlowImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RecentStickerFlowImpl$updateAvatarStickerList$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C18000sQ $this_updateAvatarStickerList;
    public int label;
    public final /* synthetic */ AnonymousClass6ST this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentStickerFlowImpl$updateAvatarStickerList$1(AnonymousClass6ST r2, C023509x r3, C18000sQ r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$this_updateAvatarStickerList = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new RecentStickerFlowImpl$updateAvatarStickerList$1(this.this$0, r5, this.$this_updateAvatarStickerList);
    }

    public final Object invokeSuspend(Object obj) {
        C18000sQ r1;
        Object r0;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            ArrayList A0F = ((C104665Ar) this.this$0.A01.get()).A0F();
            if (A0F.isEmpty()) {
                r1 = this.$this_updateAvatarStickerList;
                r0 = C106695Kx.A00;
            } else {
                HashSet A16 = C36441kJ.A16();
                ArrayList A0I = AnonymousClass001.A0I();
                Iterator it = A0F.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    C90504aG.A1H(((C135066c4) next).A06, next, A16, A0I);
                }
                r1 = this.$this_updateAvatarStickerList;
                r0 = new AnonymousClass5Kw(A0I);
            }
            C05760Qy.A00(r0, r1);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RecentStickerFlowImpl$updateAvatarStickerList$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
