package com.whatsapp.chatlock.passcode;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C63603Kr;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$validatePasscode$1", f = "ChatLockPasscodeManager.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$validatePasscode$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $attempt;
    public final /* synthetic */ C006302t $callback;
    public Object L$0;
    public int label;
    public final /* synthetic */ C63603Kr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$validatePasscode$1(C63603Kr r2, String str, C023509x r4, C006302t r5) {
        super(2, r4);
        this.$callback = r5;
        this.this$0 = r2;
        this.$attempt = str;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ChatLockPasscodeManager$validatePasscode$1(this.this$0, this.$attempt, r6, this.$callback);
    }

    public final Object invokeSuspend(Object obj) {
        C006302t r5;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            r5 = this.$callback;
            C63603Kr r4 = this.this$0;
            String str = this.$attempt;
            this.L$0 = r5;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r4.A04, new ChatLockPasscodeManager$validatePasscode$3(r4, str, (C023509x) null));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            r5 = (C006302t) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        r5.invoke(obj);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatLockPasscodeManager$validatePasscode$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
