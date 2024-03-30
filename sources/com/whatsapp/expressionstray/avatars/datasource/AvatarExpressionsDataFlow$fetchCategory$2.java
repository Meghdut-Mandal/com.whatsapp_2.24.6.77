package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C125415zs;
import X.C130616Lt;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$fetchCategory$2", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$fetchCategory$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C125415zs $category;
    public int label;
    public final /* synthetic */ C130616Lt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$fetchCategory$2(C130616Lt r2, C125415zs r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$category = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarExpressionsDataFlow$fetchCategory$2(this.this$0, this.$category, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object A00;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            List list = this.this$0.A06;
            C125415zs r3 = this.$category;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (AnonymousClass00C.A0J(((AvatarOnDemandStickerCategory) obj2).A00, r3)) {
                    break;
                }
            }
            AvatarOnDemandStickerCategory avatarOnDemandStickerCategory = (AvatarOnDemandStickerCategory) obj2;
            if (avatarOnDemandStickerCategory == null) {
                return null;
            }
            this.label = 1;
            A00 = avatarOnDemandStickerCategory.A00(this);
            if (A00 == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
            A00 = ((AnonymousClass0AK) obj).value;
        } else {
            throw AnonymousClass000.A0e();
        }
        return new AnonymousClass0AK(A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsDataFlow$fetchCategory$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
