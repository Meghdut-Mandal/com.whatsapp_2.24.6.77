package com.whatsapp.usernames;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C145026tE;
import X.C223313w;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.UsernameMessageObserver$onMessageAdded$1", f = "UsernameMessageObserver.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameMessageObserver$onMessageAdded$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C223313w $jid;
    public int label;
    public final /* synthetic */ C145026tE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameMessageObserver$onMessageAdded$1(C223313w r2, C145026tE r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$jid = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new UsernameMessageObserver$onMessageAdded$1(this.$jid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C145026tE r4 = this.this$0;
            C223313w r3 = this.$jid;
            this.label = 1;
            if (AnonymousClass0A2.A00(this, r4.A02, new UsernameMessageObserver$markOwnPnShared$2(r3, r4, (C023509x) null)) == r5) {
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
        return ((UsernameMessageObserver$onMessageAdded$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
