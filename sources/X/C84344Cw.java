package X;

import android.os.Bundle;
import com.whatsapp.pininchat.expirationDialog.PinInChatExpirationDialogFragment;

/* renamed from: X.4Cw  reason: invalid class name and case insensitive filesystem */
public final class C84344Cw extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ PinInChatExpirationDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84344Cw(PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment) {
        super(0);
        this.this$0 = pinInChatExpirationDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C64933Qa A03;
        Bundle bundle = this.this$0.A0A;
        if (bundle != null && (A03 = AnonymousClass3UJ.A03(bundle, "")) != null) {
            return A03;
        }
        throw AnonymousClass001.A09("Could not retrieve message key from arguments bundle.");
    }
}
