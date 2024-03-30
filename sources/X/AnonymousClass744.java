package X;

import com.whatsapp.calling.service.OutgoingSignalingHandler;
import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import java.util.Map;

/* renamed from: X.744  reason: invalid class name */
public final /* synthetic */ class AnonymousClass744 implements Runnable {
    public final /* synthetic */ AnonymousClass64F A00;
    public final /* synthetic */ OutgoingSignalingHandler A01;
    public final /* synthetic */ Jid A02;
    public final /* synthetic */ VoipStanzaChildNode A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ AnonymousClass744(AnonymousClass64F r1, OutgoingSignalingHandler outgoingSignalingHandler, Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, Map map, boolean z) {
        this.A01 = outgoingSignalingHandler;
        this.A07 = z;
        this.A02 = jid;
        this.A04 = str;
        this.A06 = map;
        this.A00 = r1;
        this.A03 = voipStanzaChildNode;
        this.A05 = str2;
    }

    public final void run() {
        this.A01.m8lambda$sendOfferStanza$1$comwhatsappcallingserviceOutgoingSignalingHandler(this.A07, this.A02, this.A04, this.A06, this.A00, this.A03, this.A05);
    }
}
