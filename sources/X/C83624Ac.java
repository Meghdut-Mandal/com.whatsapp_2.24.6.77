package X;

import com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Ac  reason: invalid class name and case insensitive filesystem */
public final class C83624Ac extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ BusinessTransitionInfoBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83624Ac(BusinessTransitionInfoBottomSheet businessTransitionInfoBottomSheet) {
        super(0);
        this.this$0 = businessTransitionInfoBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C222813r r0 = UserJid.Companion;
        BusinessTransitionInfoBottomSheet businessTransitionInfoBottomSheet = this.this$0;
        UserJid A00 = C222813r.A00(businessTransitionInfoBottomSheet.A07);
        if (A00 != null) {
            if (businessTransitionInfoBottomSheet.A03 != null) {
                businessTransitionInfoBottomSheet.A1C(AnonymousClass190.A0u(businessTransitionInfoBottomSheet.A0a(), A00));
                businessTransitionInfoBottomSheet.A1c();
            } else {
                throw C36331k8.A0X();
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
