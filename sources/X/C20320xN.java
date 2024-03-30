package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.0xN  reason: invalid class name and case insensitive filesystem */
public class C20320xN implements AnonymousClass00M {
    public final C19770wU A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;
    public final AnonymousClass005 A05;
    public final AnonymousClass005 A06;
    public final C19700wN A07;
    public final AnonymousClass19A A08;
    public final AnonymousClass005 A09;

    public static void A00(C20320xN r3, DeviceJid deviceJid, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("recvmessagelistener/on-get-identity-error/jid = ");
        sb.append(deviceJid);
        sb.append(" errorCode = ");
        sb.append(i);
        Log.w(sb.toString());
        for (AnonymousClass4UK BYX : ((C19580wB) r3.A09.get()).getObservers()) {
            BYX.BYX(deviceJid, i);
        }
        if (deviceJid.getDevice() == 0) {
            return;
        }
        if (((AnonymousClass189) r3.A04.get()).A0X()) {
            r3.A00.Boy(new C35261iP((Object) r3, i, 23, (Object) deviceJid));
            return;
        }
        ((AnonymousClass187) r3.A05.get()).A00.execute(new C35261iP((Object) r3, i, 24, (Object) deviceJid));
    }

    public void A01(List list) {
        AnonymousClass19A r7 = this.A08;
        String A092 = r7.A09();
        C203399nx[] r6 = new C203399nx[list.size()];
        for (int i = 0; i < list.size(); i++) {
            r6[i] = new C203399nx(PublicKeyCredentialControllerUtility.JSON_KEY_USER, new AnonymousClass1AL[]{new AnonymousClass1AL((Jid) list.get(i), "jid")});
        }
        r7.A0K(new C165467tT(this, list, 0), new C203399nx(new C203399nx("identity", (AnonymousClass1AL[]) null, r6), "iq", new AnonymousClass1AL[]{new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A092), new AnonymousClass1AL("xmlns", "encrypt"), new AnonymousClass1AL((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1AL((Jid) C177588e2.A00, "to")}), A092, 153, 32000);
    }

    public C20320xN(C19700wN r1, AnonymousClass19A r2, C19770wU r3, AnonymousClass005 r4, AnonymousClass005 r5, AnonymousClass005 r6, AnonymousClass005 r7, AnonymousClass005 r8, AnonymousClass005 r9, AnonymousClass005 r10) {
        this.A07 = r1;
        this.A00 = r3;
        this.A08 = r2;
        this.A03 = r4;
        this.A06 = r5;
        this.A05 = r6;
        this.A09 = r7;
        this.A04 = r8;
        this.A02 = r9;
        this.A01 = r10;
    }
}
