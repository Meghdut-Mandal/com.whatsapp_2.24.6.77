package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass05G;
import X.AnonymousClass05H;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass5IJ;
import X.AnonymousClass5IK;
import X.AnonymousClass5IL;
import X.AnonymousClass690;
import X.C019408g;
import X.C023509x;
import X.C06820Vf;
import X.C106105Ij;
import X.C106115Ik;
import X.C106125Il;
import X.C111375cB;
import X.C15330nA;
import X.C18500tG;
import X.C36321k7;
import X.C36441kJ;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1", f = "AvatarOnDemandStickers.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1 extends AnonymousClass0A1 implements C019408g {
    public final /* synthetic */ Integer $qplInstanceKey$inlined;
    public final /* synthetic */ C111375cB $searchType$inlined;
    public final /* synthetic */ List $stableIds$inlined;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1(C111375cB r2, AvatarOnDemandStickers avatarOnDemandStickers, Integer num, List list, C023509x r6) {
        super(3, r6);
        this.$qplInstanceKey$inlined = num;
        this.this$0 = avatarOnDemandStickers;
        this.$searchType$inlined = r2;
        this.$stableIds$inlined = list;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        Integer num = this.$qplInstanceKey$inlined;
        AvatarOnDemandStickers avatarOnDemandStickers = this.this$0;
        AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1 avatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1 = new AvatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1(this.$searchType$inlined, avatarOnDemandStickers, num, this.$stableIds$inlined, (C023509x) obj3);
        avatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1.L$0 = obj;
        avatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1.L$1 = obj2;
        return avatarOnDemandStickers$observeStickersWithAvatarStickerPack$$inlined$flatMapLatest$1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        AnonymousClass05H r2;
        int A00;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05G r3 = (AnonymousClass05G) this.L$0;
            Object obj3 = this.L$1;
            if (obj3 instanceof C106105Ij) {
                Integer num = this.$qplInstanceKey$inlined;
                if (num != null) {
                    A00 = num.intValue();
                } else {
                    A00 = this.this$0.A01.A00();
                    this.this$0.A01.A01(A00, "sticker_category_fetch_initiated");
                }
                r2 = new C15330nA(new AvatarOnDemandStickers$getOnDemandResultsStickerFlow$1(this.$searchType$inlined, this.this$0, this.$stableIds$inlined, (C023509x) null, A00));
            } else {
                if (obj3 instanceof C106115Ik) {
                    Integer num2 = this.$qplInstanceKey$inlined;
                    if (num2 != null) {
                        this.this$0.A01.A01(num2.intValue(), "sticker_pack_loading");
                    }
                    C111375cB r7 = this.$searchType$inlined;
                    List<AnonymousClass690> list = this.$stableIds$inlined;
                    ArrayList A0J = C36321k7.A0J(list);
                    for (AnonymousClass690 r0 : list) {
                        A0J.add(new AnonymousClass5IL(r0.A00));
                    }
                    obj2 = new AnonymousClass5IK(r7, A0J);
                } else if (obj3 instanceof C106125Il) {
                    this.this$0.A00.A02(3, "observe_stickers_failed", "avatar sticker pack not available");
                    Integer num3 = this.$qplInstanceKey$inlined;
                    if (num3 != null) {
                        this.this$0.A01.A01(num3.intValue(), "sticker_pack_unavailable");
                    }
                    obj2 = new AnonymousClass5IJ(this.$searchType$inlined, AnonymousClass001.A09("Avatar sticker pack not available"));
                } else {
                    throw C36441kJ.A18();
                }
                r2 = new C18500tG(obj2, 0);
            }
            this.label = 1;
            if (C06820Vf.A00(this, r2, r3) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
