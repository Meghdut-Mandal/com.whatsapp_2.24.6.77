package X;

import com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Ad  reason: invalid class name and case insensitive filesystem */
public final class C83634Ad extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ PrivacyInfoBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83634Ad(PrivacyInfoBottomSheet privacyInfoBottomSheet) {
        super(0);
        this.this$0 = privacyInfoBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C222813r r0 = UserJid.Companion;
        PrivacyInfoBottomSheet privacyInfoBottomSheet = this.this$0;
        UserJid A00 = C222813r.A00(privacyInfoBottomSheet.A04);
        if (A00 != null) {
            if (privacyInfoBottomSheet.A03 != null) {
                privacyInfoBottomSheet.A1C(AnonymousClass190.A0u(privacyInfoBottomSheet.A0a(), A00));
                privacyInfoBottomSheet.A1c();
            } else {
                throw C36331k8.A0X();
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
