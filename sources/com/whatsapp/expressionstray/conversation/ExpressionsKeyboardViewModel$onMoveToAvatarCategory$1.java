package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass55F;
import X.AnonymousClass55M;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$onMoveToAvatarCategory$1", f = "ExpressionsKeyboardViewModel.kt", i = {}, l = {408}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardViewModel$onMoveToAvatarCategory$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $avatarCategory;
    public int label;
    public final /* synthetic */ ExpressionsKeyboardViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardViewModel$onMoveToAvatarCategory$1(ExpressionsKeyboardViewModel expressionsKeyboardViewModel, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = expressionsKeyboardViewModel;
        this.$avatarCategory = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ExpressionsKeyboardViewModel$onMoveToAvatarCategory$1(this.this$0, this.$avatarCategory, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.this$0.A0S(AnonymousClass55M.A00);
            AnonymousClass05J r2 = this.this$0.A0H;
            AnonymousClass55F r0 = new AnonymousClass55F(this.$avatarCategory);
            this.label = 1;
            if (r2.B6N(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ExpressionsKeyboardViewModel$onMoveToAvatarCategory$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
