package X;

import com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Ij  reason: invalid class name and case insensitive filesystem */
public final class C85774Ij extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CallLogMessageParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85774Ij(CallLogMessageParticipantBottomSheet callLogMessageParticipantBottomSheet) {
        super(1);
        this.this$0 = callLogMessageParticipantBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UserJid userJid = (UserJid) obj;
        AnonymousClass00C.A0D(userJid, 0);
        CallLogMessageParticipantBottomSheet callLogMessageParticipantBottomSheet = this.this$0;
        C24801Dv r3 = callLogMessageParticipantBottomSheet.A00;
        if (r3 != null) {
            r3.A06(callLogMessageParticipantBottomSheet.A0a(), C36431kI.A0E(callLogMessageParticipantBottomSheet.A0a(), userJid, (Integer) null));
            return AnonymousClass0AJ.A00;
        }
        throw C36331k8.A0d("activityUtils");
    }
}
