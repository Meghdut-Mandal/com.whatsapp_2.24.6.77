package com.whatsapp.chatlock.passcode;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C005502l;
import X.C006302t;
import X.C009003v;
import X.C023509x;
import X.C63603Kr;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$clearPasscode$1", f = "ChatLockPasscodeManager.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$clearPasscode$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C006302t $isSuccessCallback;
    public int label;
    public final /* synthetic */ C63603Kr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$clearPasscode$1(C63603Kr r2, C023509x r3, C006302t r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$isSuccessCallback = r4;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ChatLockPasscodeManager$clearPasscode$1(this.this$0, r5, this.$isSuccessCallback);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C63603Kr r3 = this.this$0;
            C005502l r2 = r3.A04;
            ChatLockPasscodeManager$clearPasscode$1$result$1 chatLockPasscodeManager$clearPasscode$1$result$1 = new ChatLockPasscodeManager$clearPasscode$1$result$1(r3, (C023509x) null);
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r2, chatLockPasscodeManager$clearPasscode$1$result$1);
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        this.$isSuccessCallback.invoke(obj);
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatLockPasscodeManager$clearPasscode$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
