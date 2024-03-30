package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass565;
import X.C009003v;
import X.C023509x;
import X.C125385zp;
import X.C125415zs;
import X.C130616Lt;
import com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$fetchCategory$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$updateItemsByStickerSection$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$updateItemsByStickerSection$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C125385zp $section;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$updateItemsByStickerSection$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C125385zp r3, C023509x r4) {
        super(2, r4);
        this.$section = r3;
        this.this$0 = avatarExpressionsViewModel;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new AvatarExpressionsViewModel$updateItemsByStickerSection$1(this.this$0, this.$section, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C125385zp r1 = this.$section;
            if (r1 instanceof AnonymousClass565) {
                C130616Lt r4 = this.this$0.A03;
                C125415zs r3 = ((AnonymousClass565) r1).A00;
                this.label = 1;
                if (AnonymousClass0A2.A00(this, r4.A08, new AvatarExpressionsDataFlow$fetchCategory$2(r4, r3, (C023509x) null)) == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsViewModel$updateItemsByStickerSection$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
