package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.6sr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C144816sr implements C22934Ayk {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass11F A01;
    public final /* synthetic */ DeviceJid A02;
    public final /* synthetic */ C31731cI A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C144816sr(AnonymousClass11F r1, DeviceJid deviceJid, C31731cI r3, String str, long j) {
        this.A03 = r3;
        this.A02 = deviceJid;
        this.A01 = r1;
        this.A04 = str;
        this.A00 = j;
    }

    public final void BJg(byte[] bArr) {
        C63593Kq r0;
        C31731cI r7 = this.A03;
        DeviceJid deviceJid = this.A02;
        AnonymousClass11F r10 = this.A01;
        String str = this.A04;
        long j = this.A00;
        byte[] A022 = C200429hO.A02((C45832Sw) null, (C177808eP) null, bArr);
        if (A022 != null) {
            try {
                AnonymousClass8SX A0i = AnonymousClass8SX.A0i(A022);
                if ((A0i.bitField0_ & 65536) != 0) {
                    AnonymousClass1P5 r8 = r7.A06;
                    UserJid userJid = deviceJid.userJid;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("LocationSharingManager/onReceiveFinalLocation/jid=");
                    A0u.append(r10);
                    A0u.append("; senderJid=");
                    A0u.append(userJid);
                    C36321k7.A1Q("; msgId=", str, A0u);
                    C46902br A032 = AnonymousClass1P5.A03(r8, C90504aG.A0T(r10, str));
                    if (A032 == null) {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("LocationSharingManager/onReceiveFinalLocation/Live location message not found; jid=");
                        A0u2.append(r10);
                        C36321k7.A1Q("; msgId=", str, A0u2);
                        return;
                    }
                    C63593Kq A023 = AnonymousClass1P5.A02(userJid, A0i, A032);
                    if (j > 0) {
                        A023.A05 = j;
                    }
                    synchronized (r8.A0Q) {
                        C63593Kq r02 = (C63593Kq) r8.A0Z.get(userJid);
                        if (r02 != null && r02.A05 < A023.A05) {
                            r8.A0h(A023);
                        }
                        Map A15 = C90514aH.A15(r10, AnonymousClass1P5.A05(r8));
                        if ((A15 == null || !A15.containsKey(userJid)) && ((r0 = A032.A02) == null || r0.A05 < A023.A05)) {
                            r8.A0a(A023, A032);
                        }
                    }
                    return;
                }
                C36321k7.A1L(deviceJid, "LocationNotificationHandler/onFinalLocationNotification/axolotl e2eMessage is missing live location message; senderJid=", AnonymousClass000.A0u());
            } catch (AnonymousClass186 e) {
                Log.w(AnonymousClass000.A0l(deviceJid, "LocationNotificationHandler/onFinalLocationNotification/axolotl derived plaintext does not represent valid protocol buffer; senderJid=", AnonymousClass000.A0u()), e);
            }
        }
    }
}
