package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.73r  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1500273r implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass11F A02;
    public final /* synthetic */ DeviceJid A03;
    public final /* synthetic */ C31731cI A04;
    public final /* synthetic */ C207209uj A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ C1500273r(AnonymousClass11F r1, DeviceJid deviceJid, C31731cI r3, C207209uj r4, String str, int i, int i2) {
        this.A04 = r3;
        this.A05 = r4;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r1;
        this.A03 = deviceJid;
        this.A06 = str;
    }

    public final void run() {
        AnonymousClass1AL[] r4;
        StringBuilder A0u;
        C31731cI r7 = this.A04;
        C207209uj r6 = this.A05;
        int i = this.A00;
        int i2 = this.A01;
        AnonymousClass11F r3 = this.A02;
        DeviceJid deviceJid = this.A03;
        String str = this.A06;
        C36321k7.A1K(r6, "LocationNotificationHandler/onFinalLocationNotification/need to send retry receipt; stanzaKey=", AnonymousClass000.A0u());
        if (i > 1) {
            r7.A01.A06();
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("LocationNotificationHandler/onFinalLocationNotification/axolotl sending retry receipt; stanzaKey=");
        A0u2.append(r6);
        C36321k7.A1T("; localRegistrationId=", A0u2, i2);
        AnonymousClass1P5 r62 = r7.A06;
        UserJid userJid = deviceJid.userJid;
        byte[] A022 = C203239na.A02(i2);
        int i3 = i + 1;
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("LocationSharingManager/sendFinalLocationRetryRequest/jid=");
        A0u3.append(r3);
        A0u3.append("; participant=");
        A0u3.append(userJid);
        A0u3.append("; msgId=");
        A0u3.append(str);
        C36321k7.A1T("; retryCount=", A0u3, i3);
        if (i3 > 4) {
            A0u = AnonymousClass000.A0u();
            A0u.append("LocationSharingManager/sendFinalLocationRetryRequest/reached max retry; remote_resource=");
            A0u.append(userJid);
        } else if (AnonymousClass1P5.A03(r62, new C64933Qa(r3, str, false)) == null) {
            A0u = AnonymousClass000.A0u();
            A0u.append("LocationSharingManager/sendFinalLocationRetryRequest/can't find the live location message; jid=");
            A0u.append(r3);
            A0u.append("; senderJid=");
            A0u.append(userJid);
            A0u.append("; msgId=");
            A0u.append(str);
        } else {
            AnonymousClass19A r5 = r62.A0L.A01;
            AnonymousClass1AL[] r63 = new AnonymousClass1AL[3];
            C36331k8.A1R(r5.A09(), r63, 0);
            r63[1] = new AnonymousClass1AL((Jid) userJid, "to");
            r63[2] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "location");
            if (AnonymousClass143.A0G(r3)) {
                r4 = new AnonymousClass1AL[2];
                C36341k9.A1L("final", str, r4, 0);
                C90504aG.A1E(r3, "context", r4, 1);
            } else {
                r4 = new AnonymousClass1AL[1];
                C36341k9.A1L("final", str, r4, 0);
            }
            AnonymousClass1AL[] r2 = new AnonymousClass1AL[1];
            C36341k9.A1L("retry", String.valueOf(i3), r2, 0);
            r5.A0G(new C203399nx(new C203399nx("location", r4, new C203399nx[]{new C203399nx("request", r2), new C203399nx("registration", A022, (AnonymousClass1AL[]) null)}), "notification", r63), 191);
            return;
        }
        C36321k7.A1U("; retryCount=", A0u, i3);
    }
}
