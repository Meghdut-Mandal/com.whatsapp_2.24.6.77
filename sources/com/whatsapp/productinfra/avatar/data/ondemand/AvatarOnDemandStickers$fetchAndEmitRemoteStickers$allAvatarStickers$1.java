package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass5IM;
import X.AnonymousClass5IN;
import X.AnonymousClass5IO;
import X.AnonymousClass5IP;
import X.C009003v;
import X.C023509x;
import X.C111395cD;
import X.C135066c4;
import X.C23871Ae;
import X.C36321k7;
import X.C36331k8;
import X.C36441kJ;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1", f = "AvatarOnDemandStickers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $remoteStickerList;
    public final /* synthetic */ List $stickerLocations;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1(AvatarOnDemandStickers avatarOnDemandStickers, List list, List list2, C023509x r5) {
        super(2, r5);
        this.$remoteStickerList = list;
        this.$stickerLocations = list2;
        this.this$0 = avatarOnDemandStickers;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1(this.this$0, this.$remoteStickerList, this.$stickerLocations, r6);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object r0;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            List list = this.$remoteStickerList;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(list));
            for (Object next : list) {
                linkedHashMap.put(((C135066c4) next).A06, next);
            }
            List<C111395cD> list2 = this.$stickerLocations;
            AvatarOnDemandStickers avatarOnDemandStickers = this.this$0;
            ArrayList A0I = AnonymousClass001.A0I();
            for (C111395cD r1 : list2) {
                if (r1 instanceof AnonymousClass5IO) {
                    r0 = new AnonymousClass5IM(((AnonymousClass5IO) r1).A00);
                } else if (r1 instanceof AnonymousClass5IP) {
                    String str2 = ((AnonymousClass5IP) r1).A00.A00;
                    C135066c4 r2 = (C135066c4) linkedHashMap.get(str2);
                    if (r2 != null) {
                        String str3 = r2.A06;
                        String str4 = r2.A0H;
                        if (str3 == null) {
                            str = "sticker stable id is null";
                        } else if (str4 != null) {
                            r0 = new AnonymousClass5IN(r2, str3);
                        } else {
                            str = "sticker url is null";
                        }
                    } else {
                        str = "sticker is null";
                    }
                    C23871Ae r3 = avatarOnDemandStickers.A00;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("invalid / null data for sticker (");
                    r3.A02(3, "observe_stickers_failed", C36321k7.A0E(str, A0u));
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("AvatarOnDemandStickers/unable to fetch remote sticker for id ");
                    A0u2.append(str2);
                    C36321k7.A1Z(A0u2, ", invalid / null data");
                } else {
                    throw C36441kJ.A18();
                }
                A0I.add(r0);
            }
            return A0I;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarOnDemandStickers$fetchAndEmitRemoteStickers$allAvatarStickers$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
