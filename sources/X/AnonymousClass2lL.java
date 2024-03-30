package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.2lL  reason: invalid class name */
public final class AnonymousClass2lL extends C50502l1 {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"block", "unblock"});
    public static final ArrayList A01 = C36351kA.A10(new String[]{"calls", "marketing_messages"});
    public static final ArrayList A02 = C36351kA.A10(new String[]{"profile_view", "quick_action", "suspicious_chat_banner", "system_event_message"});
    public static final ArrayList A03 = C36351kA.A10(new String[]{"no_longer_relevant", "no_sign_up", "spammy_messages", "too_many_messages"});

    public AnonymousClass2lL(UserJid userJid, String str, String str2, String str3, String str4) {
        AnonymousClass6QB A0T = C36421kH.A0T();
        C36341k9.A1C(A0T);
        C36331k8.A1D(A0T, "xmlns", "optoutlist");
        C36331k8.A1D(A0T, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C36331k8.A1C(A0T, str);
        AnonymousClass6QB A0q = C36441kJ.A0q("item");
        C36351kA.A1I(userJid, A0q, "jid");
        A0q.A09("marketing_messages", "category", A01);
        A0q.A09(str2, "action", A00);
        A0q.A08(str3, "reason", A03);
        A0q.A08(str4, "entry_point", A02);
        C36361kB.A1H(A0q, A0T);
        C592133b.A00(A0T, this);
    }
}
