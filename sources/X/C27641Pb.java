package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallParticipantJid;
import java.util.HashSet;

/* renamed from: X.1Pb  reason: invalid class name and case insensitive filesystem */
public class C27641Pb {
    public final AnonymousClass1DM A00;
    public final AnonymousClass12O A01;
    public final C231417i A02;
    public final C20810yC A03;

    public CallParticipantJid A00(UserJid userJid, String str) {
        PhoneUserJid phoneUserJid;
        byte[] bArr;
        HashSet A0B = this.A02.A0B(userJid);
        AnonymousClass6XG.A01(C67613aC.A00, A0B);
        DeviceJid[] deviceJidArr = (DeviceJid[]) A0B.toArray(new DeviceJid[0]);
        if (AnonymousClass143.A0I(userJid)) {
            phoneUserJid = this.A01.A0A((C223313w) userJid);
        } else {
            phoneUserJid = null;
        }
        C192449Ha A07 = this.A00.A07(userJid);
        if (A07 == null) {
            bArr = null;
        } else {
            bArr = A07.A01;
        }
        int length = deviceJidArr.length;
        if (length > 5) {
            if (C20800yB.A01(C21000yV.A02, this.A03, 1525)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" calling to primary device only because callee has too many devices");
                Log.i(sb.toString());
                int i = 0;
                while (true) {
                    DeviceJid deviceJid = deviceJidArr[i];
                    if (deviceJid.getDevice() != 0) {
                        i++;
                        if (i >= length) {
                            break;
                        }
                    } else {
                        deviceJidArr = new DeviceJid[]{deviceJid};
                        break;
                    }
                }
            }
        }
        return new CallParticipantJid(userJid, bArr, deviceJidArr, phoneUserJid);
    }

    public C27641Pb(AnonymousClass1DM r1, AnonymousClass12O r2, C231417i r3, C20810yC r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
