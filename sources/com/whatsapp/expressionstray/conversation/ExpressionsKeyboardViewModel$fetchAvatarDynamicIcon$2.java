package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass55Q;
import X.AnonymousClass6SF;
import X.C001700s;
import X.C009003v;
import X.C023509x;
import X.C18740tg;
import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$fetchAvatarDynamicIcon$2", f = "ExpressionsKeyboardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardViewModel$fetchAvatarDynamicIcon$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ ExpressionsKeyboardViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardViewModel$fetchAvatarDynamicIcon$2(ExpressionsKeyboardViewModel expressionsKeyboardViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = expressionsKeyboardViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ExpressionsKeyboardViewModel$fetchAvatarDynamicIcon$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ExpressionsKeyboardViewModel$fetchAvatarDynamicIcon$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass55Q r1;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass6SF r2 = this.this$0.A0F;
            C18740tg.A00();
            Bitmap A00 = AnonymousClass6SF.A00(r2, AnonymousClass6SF.A01(r2, "meta-avatar-tab-icon"), "meta-avatar-tab-icon");
            if (A00 == null) {
                return null;
            }
            ExpressionsKeyboardViewModel expressionsKeyboardViewModel = this.this$0;
            expressionsKeyboardViewModel.A01 = A00;
            C001700s r22 = expressionsKeyboardViewModel.A05;
            Object A04 = r22.A04();
            if ((A04 instanceof AnonymousClass55Q) && (r1 = (AnonymousClass55Q) A04) != null) {
                r22.A0C(new AnonymousClass55Q(A00, r1.A02, r1.A03, r1.A00, r1.A04));
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
