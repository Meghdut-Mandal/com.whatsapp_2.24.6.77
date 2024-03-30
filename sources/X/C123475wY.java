package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.5wY  reason: invalid class name and case insensitive filesystem */
public class C123475wY {
    public final int A00;
    public final Jid A01;
    public final String A02;
    public final String A03;
    public final VoipStanzaChildNode[] A04;

    public C123475wY(Jid jid, String str, String str2, VoipStanzaChildNode[] voipStanzaChildNodeArr, int i) {
        if (AnonymousClass143.A0F(jid)) {
            this.A02 = str;
            this.A01 = jid;
            this.A03 = str2;
            this.A00 = i;
            this.A04 = voipStanzaChildNodeArr;
            return;
        }
        throw C90464aC.A0P(jid, "CallIncomingAck:Wrong jid type: ", AnonymousClass000.A0u());
    }
}
