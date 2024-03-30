package com.whatsapp.status.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C10810fG;
import X.C17170qq;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.viewmodels.StatusesViewModel$consumeNewStatusesEvent$1", f = "StatusesViewModel.kt", i = {0}, l = {493}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
public final class StatusesViewModel$consumeNewStatusesEvent$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C10810fG $userJids;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ StatusesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusesViewModel$consumeNewStatusesEvent$1(StatusesViewModel statusesViewModel, C023509x r3, C10810fG r4) {
        super(2, r3);
        this.this$0 = statusesViewModel;
        this.$userJids = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new StatusesViewModel$consumeNewStatusesEvent$1(this.this$0, r5, this.$userJids);
    }

    public final Object invokeSuspend(Object obj) {
        C10810fG r8;
        StatusesViewModel statusesViewModel;
        C17170qq r5;
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            statusesViewModel = this.this$0;
            r5 = statusesViewModel.A0I;
            r8 = this.$userJids;
            this.L$0 = r5;
            this.L$1 = statusesViewModel;
            this.L$2 = r8;
            this.label = 1;
            if (r5.BOV((Object) null, this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            r8 = (C10810fG) this.L$2;
            statusesViewModel = (StatusesViewModel) this.L$1;
            r5 = (C17170qq) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        try {
            Set set = statusesViewModel.A02;
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object next : set) {
                if (!((List) r8.element).contains((UserJid) next)) {
                    A0I.add(next);
                }
            }
            statusesViewModel.A02 = C007103b.A0f(A0I);
            return AnonymousClass0AJ.A00;
        } finally {
            r5.BwJ((Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusesViewModel$consumeNewStatusesEvent$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
