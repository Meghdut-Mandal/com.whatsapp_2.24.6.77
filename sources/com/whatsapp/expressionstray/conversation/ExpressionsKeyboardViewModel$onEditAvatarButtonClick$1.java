package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass55C;
import X.AnonymousClass6O1;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$onEditAvatarButtonClick$1", f = "ExpressionsKeyboardViewModel.kt", i = {}, l = {281}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardViewModel$onEditAvatarButtonClick$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ ExpressionsKeyboardViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardViewModel$onEditAvatarButtonClick$1(ExpressionsKeyboardViewModel expressionsKeyboardViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = expressionsKeyboardViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ExpressionsKeyboardViewModel$onEditAvatarButtonClick$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ExpressionsKeyboardViewModel$onEditAvatarButtonClick$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.this$0.A0E.A03((Boolean) null, 13);
            AnonymousClass05J r2 = this.this$0.A0I;
            AnonymousClass55C r0 = new AnonymousClass55C("expressions_sheet");
            this.label = 1;
            if (r2.B6N(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        AnonymousClass6O1.A00(this.this$0.A07, 40, 3);
        return AnonymousClass0AJ.A00;
    }
}
