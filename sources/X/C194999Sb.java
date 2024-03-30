package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9Sb  reason: invalid class name and case insensitive filesystem */
public class C194999Sb {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public final DeviceJid A04;
    public final String A05;
    public final Map A06 = AnonymousClass001.A0J();
    public final Set A07;
    public final /* synthetic */ C30641aX A08;

    public C194999Sb(C30641aX r2, DeviceJid deviceJid, String str, Set set) {
        this.A08 = r2;
        this.A05 = str;
        this.A04 = deviceJid;
        this.A07 = set;
    }

    public void A00(AnonymousClass918 r21, C135066c4 r22, String str, boolean z) {
        C170918Hz r0;
        C135066c4 r5 = r22;
        boolean A1V = AnonymousClass000.A1V(r5);
        Map map = this.A06;
        if (A1V) {
            AnonymousClass8N5 r7 = (AnonymousClass8N5) AnonymousClass8SA.DEFAULT_INSTANCE.A0p();
            if (!TextUtils.isEmpty(r5.A0H)) {
                String str2 = r5.A0H;
                AnonymousClass8SA r1 = (AnonymousClass8SA) C90524aI.A0H(r7);
                str2.getClass();
                r1.bitField0_ |= 1;
                r1.url_ = str2;
            }
            String str3 = r5.A0E;
            if (!TextUtils.isEmpty(str3)) {
                byte[] decode = Base64.decode(str3, 0);
                AnonymousClass8I5 A012 = C21674AUx.A01(decode, 0, decode.length);
                AnonymousClass8SA A0B = AnonymousClass8NN.A0B(r7);
                A0B.bitField0_ |= 2;
                A0B.fileSha256_ = A012;
            }
            String str4 = r5.A09;
            if (!TextUtils.isEmpty(str4)) {
                AnonymousClass8I5 A022 = AnonymousClass8NN.A02(r7, str4);
                AnonymousClass8SA r12 = (AnonymousClass8SA) r7.A00;
                r12.bitField0_ |= 4;
                r12.fileEncSha256_ = A022;
            }
            String str5 = r5.A0C;
            if (!TextUtils.isEmpty(str5)) {
                AnonymousClass8I5 A032 = AnonymousClass8NN.A03(r7, Base64.decode(str5, 1));
                AnonymousClass8SA r13 = (AnonymousClass8SA) r7.A00;
                r13.bitField0_ |= 8;
                r13.mediaKey_ = A032;
            }
            String str6 = r5.A0D;
            if (!TextUtils.isEmpty(str6)) {
                AnonymousClass8SA r14 = (AnonymousClass8SA) C90524aI.A0H(r7);
                str6.getClass();
                r14.bitField0_ |= 16;
                r14.mimetype_ = str6;
            }
            int i = r5.A02;
            AnonymousClass8SA r15 = (AnonymousClass8SA) C90524aI.A0H(r7);
            r15.bitField0_ |= 32;
            r15.height_ = i;
            int i2 = r5.A03;
            AnonymousClass8SA r16 = (AnonymousClass8SA) C90524aI.A0H(r7);
            r16.bitField0_ |= 64;
            r16.width_ = i2;
            String str7 = r5.A07;
            if (!TextUtils.isEmpty(str7)) {
                AnonymousClass8SA r17 = (AnonymousClass8SA) C90524aI.A0H(r7);
                str7.getClass();
                r17.bitField0_ |= 128;
                r17.directPath_ = str7;
            }
            long j = (long) r5.A00;
            AnonymousClass8SA r18 = (AnonymousClass8SA) C90524aI.A0H(r7);
            r18.bitField0_ |= 256;
            r18.fileLength_ = j;
            r0 = r7.A0R();
        } else {
            r0 = null;
        }
        AnonymousClass918 r52 = r21;
        map.put(str, C36441kJ.A0Q(r52, r0));
        Set set = this.A07;
        set.size();
        map.size();
        if (r52 == AnonymousClass918.SUCCESS) {
            if (z) {
                this.A03++;
            } else {
                this.A01++;
            }
        } else if (r52 == AnonymousClass918.GENERAL_ERROR) {
            this.A00++;
        } else {
            this.A02++;
        }
        if (map.size() == set.size()) {
            C30641aX r9 = this.A08;
            C30741ah r11 = r9.A04;
            DeviceJid deviceJid = this.A04;
            String str8 = this.A05;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("NonMessageDataRequestSendMethod/sendStickerRequestResponseMessage sticker stanzaId=");
            A0u.append(str8);
            A0u.append("; remoteDeviceJid");
            A0u.append(deviceJid);
            A0u.append("; stickerSize=");
            C36321k7.A1Y(A0u, map.size());
            if (map.isEmpty()) {
                Log.w("NonMessageDataRequestSendMethod/sendStickerRequestResponseMessage sticker result is empty");
            } else {
                AnonymousClass8Y0 r8 = new AnonymousClass8Y0(C36411kG.A0o(C36441kJ.A0n(r11.A00), r11.A04), str8, C19970wo.A00(r11.A02));
                r8.A00 = deviceJid;
                r8.A00 = map;
                if (r11.A03.A01(r8) < 0) {
                    Log.e("NonMessageDataRequestSendMethod/sendStickerRequestResponseMessage unable to add sticker peer message");
                } else {
                    r11.A01.A01(new SendPeerMessageJob(deviceJid, r8));
                }
            }
            r9.A03.A01(str8, 0, set.size(), this.A03, this.A01, 0, this.A00, this.A02);
        }
    }
}
