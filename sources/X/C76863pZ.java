package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.3pZ  reason: invalid class name and case insensitive filesystem */
public class C76863pZ implements C236119d {
    public C20760y7 A00;
    public final AnonymousClass4T3 A01;
    public final AnonymousClass19A A02;
    public final String A03;

    public void BVN(String str) {
        this.A01.BWc(this.A00, -1);
    }

    public void BiM(C203399nx r3, String str) {
        this.A01.Bi3(this.A00);
    }

    public C76863pZ(AnonymousClass4T3 r1, AnonymousClass19A r2, String str) {
        this.A02 = r2;
        this.A03 = str;
        this.A01 = r1;
    }

    public void A00(DeviceJid deviceJid) {
        this.A00 = C20760y7.of(deviceJid);
        AnonymousClass19A r7 = this.A02;
        String A09 = r7.A09();
        String str = this.A03;
        C18740tg.A06(deviceJid);
        C203399nx r4 = new C203399nx("remove-companion-device", new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) deviceJid, "jid"), new AnonymousClass1AL("reason", str)});
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[4];
        C36341k9.A1V(r2, 0);
        C36331k8.A1R(A09, r2, 1);
        C36341k9.A1L("xmlns", "md", r2, 2);
        C36361kB.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r2);
        boolean A0K = r7.A0K(this, C36391kE.A0m(r4, r2), A09, 237, 32000);
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DeviceRemoveRequestProtocolHelper/sendRemoveDeviceRequest success: ");
        A0u.append(A0K);
        A0u.append("; reason=");
        A0u.append(str);
        C36321k7.A1K(deviceJid, "; jid=", A0u);
        if (!A0K) {
            this.A01.BWc(this.A00, -1);
        }
    }

    public void BWw(C203399nx r4, String str) {
        this.A01.BWc(this.A00, AnonymousClass3ME.A00(r4));
    }
}
