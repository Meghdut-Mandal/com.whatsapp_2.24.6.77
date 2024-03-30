package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.5Pe  reason: invalid class name and case insensitive filesystem */
public final class C107495Pe extends C592133b {
    public static final ArrayList A00 = C36351kA.A10(new String[]{"audio", "video"});
    public static final ArrayList A01 = C36351kA.A10(new String[]{"audio_record_fatal_error", "crash", "detect_identity_change", "ended_by_peer", "ended_by_self", "ended_by_user", "peer-interrupted", "reconnecting", "self-interrupted", PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT, "unknown", "video_decoder_fatal_error", "video_encoder_fatal_error"});

    public C107495Pe(UserJid userJid, UserJid userJid2, UserJid userJid3, UserJid userJid4, UserJid userJid5, Long l, String str, String str2, String str3) {
        AnonymousClass6QB A0q = C36441kJ.A0q("call");
        C36351kA.A1I(userJid, A0q, "to");
        C36351kA.A1I(userJid2, A0q, "from");
        String str4 = str;
        if (C203539oF.A0P(str4, 0, 9007199254740991L, false)) {
            C36331k8.A1D(A0q, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4);
        }
        AnonymousClass6QB A0q2 = C36441kJ.A0q("call_info");
        Long l2 = l;
        if (C203539oF.A0L(l2, 0, 9007199254740991L, false)) {
            C36411kG.A1K(A0q2, "duration", l2.longValue());
        }
        C36351kA.A1I(userJid3, A0q2, "terminator");
        if (userJid4 != null) {
            C36351kA.A1I(userJid4, A0q2, "adder");
        }
        if (userJid5 != null) {
            C36351kA.A1I(userJid5, A0q2, "creator");
        }
        A0q2.A09(str2, "reason", A01);
        A0q2.A08(str3, "mediatype", A00);
        C36361kB.A1H(A0q2, A0q);
        this.A00 = A0q.A03();
    }
}
