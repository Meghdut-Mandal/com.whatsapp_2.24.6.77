package com.whatsapp.status.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C17170qq;
import X.C36371kC;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.viewmodels.StatusesViewModel$onStatusChanged$1$1", f = "StatusesViewModel.kt", i = {0}, l = {493}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
public final class StatusesViewModel$onStatusChanged$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ UserJid $userJid;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ StatusesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusesViewModel$onStatusChanged$1$1(UserJid userJid, StatusesViewModel statusesViewModel, C023509x r4) {
        super(2, r4);
        this.this$0 = statusesViewModel;
        this.$userJid = userJid;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new StatusesViewModel$onStatusChanged$1$1(this.$userJid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        StatusesViewModel statusesViewModel;
        C17170qq r2;
        Object obj2;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            statusesViewModel = this.this$0;
            r2 = statusesViewModel.A0I;
            obj2 = this.$userJid;
            this.L$0 = r2;
            this.L$1 = statusesViewModel;
            this.L$2 = obj2;
            this.label = 1;
            if (r2.BOV((Object) null, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            obj2 = this.L$2;
            statusesViewModel = (StatusesViewModel) this.L$1;
            r2 = (C17170qq) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        try {
            List A11 = C36371kC.A11(obj2);
            Set A0e = C007103b.A0e(statusesViewModel.A02);
            A0e.addAll(A11);
            statusesViewModel.A02 = A0e;
            return AnonymousClass0AJ.A00;
        } finally {
            r2.BwJ((Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusesViewModel$onStatusChanged$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
