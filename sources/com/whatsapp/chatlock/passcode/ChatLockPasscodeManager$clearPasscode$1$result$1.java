package com.whatsapp.chatlock.passcode;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass6YY;
import X.C009003v;
import X.C023509x;
import X.C25751Hn;
import X.C36331k8;
import X.C36381kD;
import X.C63603Kr;
import com.whatsapp.util.Log;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatlock.passcode.ChatLockPasscodeManager$clearPasscode$1$result$1", f = "ChatLockPasscodeManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatLockPasscodeManager$clearPasscode$1$result$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C63603Kr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatLockPasscodeManager$clearPasscode$1$result$1(C63603Kr r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ChatLockPasscodeManager$clearPasscode$1$result$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ChatLockPasscodeManager$clearPasscode$1$result$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            try {
                C25751Hn r2 = this.this$0.A02;
                boolean z = false;
                try {
                    boolean A0P = AnonymousClass6YY.A0P(r2.A01());
                    if (A0P) {
                        r2.A00 = null;
                        r2.A01.A02(false);
                    }
                    z = A0P;
                } catch (IOException e) {
                    Log.e(C36331k8.A0i("ChatLockUserPasscodeStorage/unsetStoredPasscode: ", AnonymousClass000.A0u(), e), e.getCause());
                }
                this.this$0.A03.A00();
                return Boolean.valueOf(AnonymousClass000.A1P(z ? 1 : 0));
            } catch (Exception e2) {
                Log.e(C36331k8.A0i("ChatLockPasscodeManager/clearPasscode: ", AnonymousClass000.A0u(), e2), e2.getCause());
                return C36381kD.A0j();
            }
        } else {
            throw AnonymousClass000.A0e();
        }
    }
}
