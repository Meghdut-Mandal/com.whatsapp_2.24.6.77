package com.whatsapp.expressionstray.avatars.datasource;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C05770Qz;
import X.C104645Ao;
import X.C130616Lt;
import X.C138176hQ;
import X.C14540ln;
import X.C18000sQ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.datasource.AvatarExpressionsDataFlow$searchabilityFlow$1", f = "AvatarExpressionsDataFlow.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsDataFlow$searchabilityFlow$1 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C130616Lt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$searchabilityFlow$1(C130616Lt r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        AvatarExpressionsDataFlow$searchabilityFlow$1 avatarExpressionsDataFlow$searchabilityFlow$1 = new AvatarExpressionsDataFlow$searchabilityFlow$1(this.this$0, r4);
        avatarExpressionsDataFlow$searchabilityFlow$1.L$0 = obj;
        return avatarExpressionsDataFlow$searchabilityFlow$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C18000sQ r3 = (C18000sQ) this.L$0;
            C104645Ao r2 = this.this$0.A04;
            r2.A00 = new C138176hQ(r3, 0);
            r2.A01((Integer) null);
            this.label = 1;
            if (C05770Qz.A00(this, C14540ln.A00, r3) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsDataFlow$searchabilityFlow$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
