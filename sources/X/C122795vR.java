package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.5vR  reason: invalid class name and case insensitive filesystem */
public class C122795vR {
    public final Jid A00;
    public final VoipStanzaChildNode A01;
    public final String A02;
    public final String A03;

    public C122795vR(Jid jid, String str, String str2, VoipStanzaChildNode voipStanzaChildNode) {
        if (AnonymousClass143.A0F(jid)) {
            this.A03 = str;
            this.A00 = jid;
            this.A02 = str2;
            this.A01 = voipStanzaChildNode;
            return;
        }
        throw C90464aC.A0P(jid, "CallStanza:Wrong jid type: ", AnonymousClass000.A0u());
    }
}
