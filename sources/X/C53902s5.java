package X;

import com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet;

/* renamed from: X.2s5  reason: invalid class name and case insensitive filesystem */
public abstract class C53902s5 {
    public static final PrivacyInfoBottomSheet A00(AnonymousClass11F r5, int i) {
        AnonymousClass00C.A0D(r5, 0);
        PrivacyInfoBottomSheet privacyInfoBottomSheet = new PrivacyInfoBottomSheet();
        AnonymousClass011[] r2 = new AnonymousClass011[2];
        C36341k9.A1J("jid", r5.getRawString(), r2, 0);
        r2[1] = C36441kJ.A19("business_state_id", Integer.valueOf(i));
        privacyInfoBottomSheet.A17(C05430Pr.A00(r2));
        return privacyInfoBottomSheet;
    }
}
