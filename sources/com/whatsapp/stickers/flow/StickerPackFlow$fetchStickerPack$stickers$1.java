package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass1BI;
import X.AnonymousClass1BM;
import X.AnonymousClass68B;
import X.C009003v;
import X.C023409w;
import X.C023509x;
import X.C23991Aq;
import X.C36351kA;
import X.C90524aI;
import android.util.Pair;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$fetchStickerPack$stickers$1", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$fetchStickerPack$stickers$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass68B $stickerPack;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$fetchStickerPack$stickers$1(AnonymousClass68B r2, StickerPackFlow stickerPackFlow, C023509x r4) {
        super(2, r4);
        this.$stickerPack = r2;
        this.this$0 = stickerPackFlow;
    }

    public final C023509x create(Object obj, C023509x r5) {
        StickerPackFlow$fetchStickerPack$stickers$1 stickerPackFlow$fetchStickerPack$stickers$1 = new StickerPackFlow$fetchStickerPack$stickers$1(this.$stickerPack, this.this$0, r5);
        stickerPackFlow$fetchStickerPack$stickers$1.L$0 = obj;
        return stickerPackFlow$fetchStickerPack$stickers$1;
    }

    public final Object invokeSuspend(Object obj) {
        List list;
        Object obj2;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass68B r3 = this.$stickerPack;
            boolean z = r3.A0S;
            StickerPackFlow stickerPackFlow = this.this$0;
            if (z) {
                try {
                    AnonymousClass1BI r2 = stickerPackFlow.A0A;
                    Pair A00 = AnonymousClass1BM.A00(r3.A0F);
                    if (A00 != null) {
                        Object obj3 = A00.first;
                        AnonymousClass00C.A07(obj3);
                        Object obj4 = A00.second;
                        AnonymousClass00C.A07(obj4);
                        obj2 = r2.A00((String) obj3, (String) obj4).A05;
                        AnonymousClass00C.A0B(obj2);
                    } else {
                        obj2 = C023409w.A00;
                    }
                } catch (Throwable th) {
                    obj2 = C90524aI.A0t(th);
                }
                AnonymousClass68B r32 = this.$stickerPack;
                Throwable A002 = AnonymousClass0AK.A00(obj2);
                if (A002 != null) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("StickerPackFlow/packFlow failed to get stickers from pack ");
                    C36351kA.A1Q(r32.A0F, A0u, A002);
                    obj2 = C023409w.A00;
                }
                list = (List) obj2;
            } else {
                C23991Aq r1 = stickerPackFlow.A09;
                String str = r3.A0F;
                AnonymousClass00C.A08(str);
                list = r1.A02(str);
            }
            this.this$0.A03.A05(list);
            return list;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackFlow$fetchStickerPack$stickers$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
