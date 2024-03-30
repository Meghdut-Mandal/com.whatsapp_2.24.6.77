package com.whatsapp.expressionstray;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass55D;
import X.AnonymousClass55E;
import X.AnonymousClass6SF;
import X.C001700s;
import X.C009003v;
import X.C023509x;
import X.C110615ax;
import X.C18740tg;
import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2", f = "ExpressionsSearchViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2(ExpressionsSearchViewModel expressionsSearchViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = expressionsSearchViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object r4;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            if (this.this$0.A0F.A01()) {
                AnonymousClass6SF r2 = this.this$0.A0H;
                C18740tg.A00();
                Bitmap A00 = AnonymousClass6SF.A00(r2, AnonymousClass6SF.A01(r2, "meta-avatar-tab-icon"), "meta-avatar-tab-icon");
                if (A00 != null) {
                    ExpressionsSearchViewModel expressionsSearchViewModel = this.this$0;
                    expressionsSearchViewModel.A02 = A00;
                    C001700s r3 = expressionsSearchViewModel.A07;
                    C110615ax r22 = (C110615ax) r3.A04();
                    if (r22 instanceof AnonymousClass55E) {
                        AnonymousClass55E r23 = (AnonymousClass55E) r22;
                        r4 = new AnonymousClass55E(A00, r23.A02, r23.A03, r23.A00, r23.A04);
                    } else if (r22 instanceof AnonymousClass55D) {
                        AnonymousClass55D r24 = (AnonymousClass55D) r22;
                        r4 = new AnonymousClass55D(A00, r24.A01, r24.A02);
                    }
                    r3.A0C(r4);
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
