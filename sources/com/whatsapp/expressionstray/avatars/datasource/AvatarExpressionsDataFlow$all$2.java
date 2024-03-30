package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass000;
import X.AnonymousClass05H;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass5IG;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C130616Lt;
import X.C164487rt;
import X.C36321k7;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$all$2", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$all$2 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ C130616Lt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$all$2(C130616Lt r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AvatarExpressionsDataFlow$all$2 avatarExpressionsDataFlow$all$2 = new AvatarExpressionsDataFlow$all$2(this.this$0, r4);
        avatarExpressionsDataFlow$all$2.Z$0 = AnonymousClass000.A1X(obj);
        return avatarExpressionsDataFlow$all$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            List<AvatarOnDemandStickerCategory> list = this.this$0.A06;
            ArrayList A0J = C36321k7.A0J(list);
            for (AvatarOnDemandStickerCategory avatarOnDemandStickerCategory : list) {
                A0J.add(avatarOnDemandStickerCategory.A01.A02(new AnonymousClass5IG(avatarOnDemandStickerCategory.A00), avatarOnDemandStickerCategory.A03));
            }
            return new C164487rt(this.this$0, C007103b.A0Y(A0J).toArray(new AnonymousClass05H[0]), 3);
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsDataFlow$all$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
