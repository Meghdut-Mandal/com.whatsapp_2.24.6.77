package com.whatsapp.chatlock.passcode;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass2Ea;
import X.AnonymousClass2Ec;
import X.C009003v;
import X.C023509x;
import X.C198419dW;
import X.C36331k8;
import X.C63603Kr;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$setPasscode$3", f = "ChatLockPasscodeManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$setPasscode$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $passcode;
    public int label;
    public final /* synthetic */ C63603Kr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$setPasscode$3(C63603Kr r2, String str, C023509x r4) {
        super(2, r4);
        this.$passcode = str;
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ChatLockPasscodeManager$setPasscode$3(this.this$0, this.$passcode, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            try {
                C198419dW r4 = C198419dW.A00;
                String str = this.$passcode;
                C63603Kr r0 = this.this$0;
                if (!this.this$0.A02.A02(r4.A01(r0.A00, r0.A01, str, AnonymousClass001.A0I(), 64))) {
                    return new AnonymousClass2Ea(2);
                }
                this.this$0.A03.A00();
                return AnonymousClass2Ec.A00;
            } catch (Exception e) {
                Log.e(C36331k8.A0i("ChatLockPasscodeManager/setPasscode ", AnonymousClass000.A0u(), e), e.getCause());
                return new AnonymousClass2Ea(2);
            }
        } else {
            throw AnonymousClass000.A0e();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatLockPasscodeManager$setPasscode$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
