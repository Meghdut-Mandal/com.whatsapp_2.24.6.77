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

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$1", f = "ChatLockPasscodeManager.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$setPasscode$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C006302t $callback;
    public final /* synthetic */ String $firstPasscode;
    public int label;
    public final /* synthetic */ C63603Kr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$setPasscode$1(C63603Kr r2, String str, C023509x r4, C006302t r5) {
        super(2, r4);
        this.this$0 = r2;
        this.$firstPasscode = str;
        this.$callback = r5;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ChatLockPasscodeManager$setPasscode$1(this.this$0, this.$firstPasscode, r6, this.$callback);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C63603Kr r4 = this.this$0;
            String str = this.$firstPasscode;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r4.A04, new ChatLockPasscodeManager$setPasscode$3(r4, str, (C023509x) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        this.$callback.invoke(obj);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatLockPasscodeManager$setPasscode$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
