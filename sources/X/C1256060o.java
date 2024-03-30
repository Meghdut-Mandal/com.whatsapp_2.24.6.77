package X;

import com.whatsapp.calling.service.OutgoingSignalingHandler;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.60o  reason: invalid class name and case insensitive filesystem */
public class C1256060o {
    public final /* synthetic */ AnonymousClass6YM A00;

    public C1256060o(AnonymousClass6YM r1) {
        this.A00 = r1;
    }

    public void A00(DeviceJid deviceJid) {
        C36321k7.A1K(deviceJid, "VoiceService/notifyNewSessionEstablished ", AnonymousClass000.A0u());
        AnonymousClass6YM r1 = this.A00;
        AtomicInteger atomicInteger = AnonymousClass6YM.A3X;
        OutgoingSignalingHandler outgoingSignalingHandler = r1.A2O;
        outgoingSignalingHandler.sendPendingCallOfferStanza(deviceJid, Voip.getCurrentCallId(), false);
        outgoingSignalingHandler.sendOfferRetryRequest(deviceJid);
        outgoingSignalingHandler.sendPendingRekeyRequest(deviceJid);
    }
}
