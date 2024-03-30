package X;

import com.whatsapp.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.6ES  reason: invalid class name */
public class AnonymousClass6ES {
    public final AnonymousClass6YM A00;
    public final C19970wo A01;

    public void A00(DeviceJid deviceJid, DeviceJid deviceJid2, String str, long j, long j2, long j3, boolean z, boolean z2) {
        AnonymousClass6YM r1 = this.A00;
        DeviceJid deviceJid3 = deviceJid;
        String str2 = str;
        r1.A0Z(deviceJid3.userJid, str2);
        boolean z3 = z;
        if (z) {
            C90464aC.A14(r1);
        }
        int peekIncomingOffer = Voip.peekIncomingOffer(str2, deviceJid3, deviceJid2, z3, j2, j3, z2);
        if (peekIncomingOffer == 0) {
            r1.A3U = true;
            r1.A2L.A02(deviceJid3, deviceJid3.userJid, str2, -1, j, z3);
        } else if (peekIncomingOffer != 70020) {
            C36321k7.A1S("voip/service/peekIncomingOffer: Voip.peekIncomingOffer failed: ", AnonymousClass000.A0u(), peekIncomingOffer);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C106235Iw r18) {
        /*
            r17 = this;
            r3 = r18
            java.lang.String r7 = r3.A03
            com.whatsapp.jid.Jid r1 = r3.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.DeviceJid
            r12 = 0
            if (r0 == 0) goto L_0x000e
            r12 = r1
            com.whatsapp.jid.DeviceJid r12 = (com.whatsapp.jid.DeviceJid) r12
        L_0x000e:
            X.C18740tg.A06(r12)
            com.whatsapp.jid.DeviceJid r11 = r3.A03
            if (r11 != 0) goto L_0x0016
            r11 = r12
        L_0x0016:
            r0 = r17
            X.6YM r2 = r0.A00
            X.0yC r1 = r2.A2t
            r0 = 5588(0x15d4, float:7.83E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x004e
            boolean r0 = r3.A01()
        L_0x0028:
            if (r0 == 0) goto L_0x0073
            X.1Pi r0 = r2.A2M
            X.19A r4 = r0.A03
            X.9YT r2 = new X.9YT
            r2.<init>()
            java.lang.String r0 = "call"
            r2.A05 = r0
            r2.A07 = r7
            java.lang.String r0 = "offer"
            r2.A08 = r0
            X.C18740tg.A06(r12)
            r2.A02 = r12
            long r0 = r3.A02
            r2.A00 = r0
            X.9uj r0 = r2.A01()
            r4.A0H(r0)
            return
        L_0x004e:
            com.whatsapp.protocol.VoipStanzaChildNode r4 = r3.A01
            java.lang.String r1 = r4.tag
            java.lang.String r0 = "offer"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "silence"
            com.whatsapp.protocol.VoipStanzaChildNode r1 = r4.getFirstChildByTag(r0)
            if (r1 == 0) goto L_0x0073
            java.lang.String r0 = "reason"
            X.1AL r0 = r1.getFirstAttributeByName(r0)
            if (r0 == 0) goto L_0x0073
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "privacy"
            boolean r0 = r1.equals(r0)
            goto L_0x0028
        L_0x0073:
            X.19L r1 = r2.A2v
            long r8 = r3.A02
            r0 = 3
            X.9ju r1 = X.AnonymousClass19L.A00(r1, r0, r8)
            if (r1 == 0) goto L_0x0082
            r0 = 4
            r1.A04(r0)
        L_0x0082:
            java.lang.String r14 = r3.A02
            X.1Pi r0 = r2.A2M
            X.19A r2 = r0.A03
            X.0yC r4 = r0.A02
            X.0wN r3 = r0.A00
            r10 = 1
            java.lang.String r5 = "call"
            java.lang.String r6 = "offer"
            X.C203429o0.A0B(r3, r4, r5, r6, r7, r8, r10)
            r0 = 4
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r0)
            r13 = r7
            r15 = r8
            X.C203429o0.A09(r10, r11, r12, r13, r14, r15)
            r3 = 0
            r1 = 0
            r0 = 71
            android.os.Message r0 = android.os.Message.obtain(r3, r1, r0, r1, r10)
            r2.A0C(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ES.A01(X.5Iw):void");
    }

    public void A02(String str) {
        if (str == null || C90484aE.A1V(str)) {
            AnonymousClass6YM r3 = this.A00;
            r3.A0R(13, r3.A22.getString(R.string.f12nameremoved));
            return;
        }
        Voip.clearVoipParam(str);
    }

    public boolean A03(String str) {
        AnonymousClass6YM r3 = this.A00;
        boolean A0m = r3.A0m();
        if (C90484aE.A1V(str)) {
            return false;
        }
        int i = r3.A0R;
        if (i == 1 || (i != 0 && !A0m)) {
            return true;
        }
        return false;
    }

    public AnonymousClass6ES(AnonymousClass6YM r1, C19970wo r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
