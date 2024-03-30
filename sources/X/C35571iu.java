package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.1iu  reason: invalid class name and case insensitive filesystem */
public class C35571iu implements Runnable {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public String A08;

    public final void run() {
        AnonymousClass189 r2;
        String str;
        C131106Nt A072;
        C31731cI r10 = (C31731cI) this.A02;
        C207209uj r11 = (C207209uj) this.A03;
        String str2 = this.A08;
        AnonymousClass630 r6 = (AnonymousClass630) this.A04;
        int i = this.A00;
        long j = this.A01;
        AnonymousClass11F r8 = (AnonymousClass11F) this.A05;
        DeviceJid deviceJid = (DeviceJid) this.A06;
        C22934Ayk ayk = (C22934Ayk) this.A07;
        StringBuilder sb = new StringBuilder();
        sb.append("LocationNotificationHandler/onFinalLocationNotification/axolotl received a location notification; jid=");
        sb.append(r8);
        sb.append("senderJid=");
        sb.append(deviceJid);
        sb.append("; retryCount=");
        sb.append(i);
        Log.i(sb.toString());
        AnonymousClass6EZ A022 = C133256Xm.A02(deviceJid);
        int i2 = r6.A00;
        if (i2 == 3) {
            AnonymousClass6EU r4 = new AnonymousClass6EU(A022, C177518dv.A00.getRawString());
            r2 = r10.A03;
            int i3 = r2.A08(ayk, r4, r6.A02).A00;
            if (i3 != 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("axolotl error while decrypt-group-using-fast-fatchet; status=");
                sb2.append(i3);
                Log.w(sb2.toString());
                if (i3 == -1001) {
                    if (j != 0) {
                        return;
                    }
                } else if (i3 == -1005 || i3 == -1203 || i3 == -1202 || i3 == -1204 || i3 == -1205 || i3 == -1206 || i3 == -1008) {
                    str = "axolotl|should try to send retry";
                    Log.w(str);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (i2 == 0) {
                r2 = r10.A03;
                A072 = r2.A06(ayk, A022, r6.A02);
            } else if (i2 == 1) {
                r2 = r10.A03;
                A072 = r2.A07(ayk, A022, r6.A02);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("LocationNotificationHandler/onFinalLocationNotification/axolotl unrecognized ciphertext type; stanzaKey=");
                sb3.append(r11);
                sb3.append("; type=");
                sb3.append(i2);
                Log.w(sb3.toString());
                return;
            }
            int i4 = A072.A00;
            if (i4 != 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("axolotl error; status=");
                sb4.append(i4);
                Log.w(sb4.toString());
            }
            if (A072.A00()) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("axolotl|should try to send retry; status=");
                sb5.append(i4);
                str = sb5.toString();
                Log.w(str);
            } else {
                return;
            }
        }
        r10.A00.A0H(new C1500273r(r8, deviceJid, r10, r11, str2, i, r2.A07.A03()));
    }

    public C35571iu(C22934Ayk ayk, AnonymousClass11F r2, DeviceJid deviceJid, C31731cI r4, AnonymousClass630 r5, C207209uj r6, String str, int i, long j) {
        this.A02 = r4;
        this.A03 = r6;
        this.A08 = str;
        this.A04 = r5;
        this.A00 = i;
        this.A01 = j;
        this.A05 = r2;
        this.A06 = deviceJid;
        this.A07 = ayk;
    }
}
