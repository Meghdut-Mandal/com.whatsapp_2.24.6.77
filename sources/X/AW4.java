package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final /* synthetic */ class AW4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C30641aX A03;
    public final /* synthetic */ DeviceJid A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ Map A07;
    public final /* synthetic */ Set A08;

    public /* synthetic */ AW4(C30641aX r1, DeviceJid deviceJid, String str, List list, Map map, Set set, int i, int i2, int i3) {
        this.A03 = r1;
        this.A06 = list;
        this.A07 = map;
        this.A04 = deviceJid;
        this.A05 = str;
        this.A08 = set;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void run() {
        C170918Hz r0;
        C30641aX r12 = this.A03;
        List<C193119Jx> list = this.A06;
        Map map = this.A07;
        DeviceJid deviceJid = this.A04;
        String str = this.A05;
        Set set = this.A08;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = 0;
        for (C193119Jx r02 : list) {
            if (r02 != null) {
                String str2 = r02.A02;
                AnonymousClass918 r13 = r02.A01;
                C198159d0 r7 = r02.A00;
                if (r7 != null) {
                    AnonymousClass8NN A0p = C173338Rh.DEFAULT_INSTANCE.A0p();
                    String str3 = r7.A06;
                    C173338Rh r1 = (C173338Rh) C90524aI.A0H(A0p);
                    r1.bitField0_ |= 1;
                    r1.url_ = str3;
                    String str4 = r7.A05;
                    if (!TextUtils.isEmpty(str4)) {
                        C173338Rh r14 = (C173338Rh) C90524aI.A0H(A0p);
                        str4.getClass();
                        r14.bitField0_ |= 2;
                        r14.title_ = str4;
                    }
                    String str5 = r7.A02;
                    if (!TextUtils.isEmpty(str5)) {
                        C173338Rh r15 = (C173338Rh) C90524aI.A0H(A0p);
                        str5.getClass();
                        r15.bitField0_ |= 4;
                        r15.description_ = str5;
                    }
                    byte[] bArr = r7.A07;
                    if (bArr != null) {
                        AnonymousClass8I5 A0O = C90474aD.A0O(A0p, bArr);
                        C173338Rh r16 = (C173338Rh) A0p.A00;
                        r16.bitField0_ |= 8;
                        r16.thumbData_ = A0O;
                    }
                    String str6 = r7.A01;
                    if (!TextUtils.isEmpty(str6)) {
                        C173338Rh r17 = (C173338Rh) C90524aI.A0H(A0p);
                        str6.getClass();
                        r17.bitField0_ |= 16;
                        r17.canonicalUrl_ = str6;
                    }
                    String str7 = r7.A03;
                    if (!TextUtils.isEmpty(str7)) {
                        C173338Rh r18 = (C173338Rh) C90524aI.A0H(A0p);
                        str7.getClass();
                        r18.bitField0_ |= 32;
                        r18.matchText_ = str7;
                    }
                    String str8 = r7.A04;
                    if (!TextUtils.isEmpty(str8)) {
                        C173338Rh r19 = (C173338Rh) C90524aI.A0H(A0p);
                        str8.getClass();
                        r19.bitField0_ |= 64;
                        r19.previewType_ = str8;
                    }
                    AnonymousClass9NX r5 = r7.A00;
                    if (r5 != null) {
                        AnonymousClass8NN A0p2 = AnonymousClass8RZ.DEFAULT_INSTANCE.A0p();
                        String str9 = r5.A03;
                        AnonymousClass8RZ r110 = (AnonymousClass8RZ) C90524aI.A0H(A0p2);
                        str9.getClass();
                        r110.bitField0_ |= 1;
                        r110.directPath_ = str9;
                        String str10 = r5.A05;
                        AnonymousClass8RZ r111 = (AnonymousClass8RZ) C90524aI.A0H(A0p2);
                        str10.getClass();
                        r111.bitField0_ |= 2;
                        r111.thumbHash_ = str10;
                        String str11 = r5.A04;
                        AnonymousClass8RZ r112 = (AnonymousClass8RZ) C90524aI.A0H(A0p2);
                        str11.getClass();
                        r112.bitField0_ |= 4;
                        r112.encThumbHash_ = str11;
                        AnonymousClass8I5 A0O2 = C90474aD.A0O(A0p2, r5.A06);
                        AnonymousClass8RZ r113 = (AnonymousClass8RZ) A0p2.A00;
                        r113.bitField0_ |= 8;
                        r113.mediaKey_ = A0O2;
                        long j = r5.A02;
                        AnonymousClass8RZ r114 = (AnonymousClass8RZ) C90524aI.A0H(A0p2);
                        r114.bitField0_ |= 16;
                        r114.mediaKeyTimestampMs_ = j;
                        int i5 = r5.A01;
                        AnonymousClass8RZ r115 = (AnonymousClass8RZ) C90524aI.A0H(A0p2);
                        r115.bitField0_ |= 32;
                        r115.thumbWidth_ = i5;
                        int i6 = r5.A00;
                        AnonymousClass8RZ r116 = (AnonymousClass8RZ) C90524aI.A0H(A0p2);
                        r116.bitField0_ |= 64;
                        r116.thumbHeight_ = i6;
                        C173338Rh r117 = (C173338Rh) C90524aI.A0H(A0p);
                        AnonymousClass8RZ r03 = (AnonymousClass8RZ) A0p2.A0R();
                        r03.getClass();
                        r117.hqThumbnail_ = r03;
                        r117.bitField0_ |= 128;
                    }
                    r0 = A0p.A0R();
                } else {
                    r0 = null;
                }
                map.put(str2, C36441kJ.A0Q(r13, r0));
                if (r7 != null && r7.A00 == null) {
                    i4++;
                }
            }
        }
        C30741ah r6 = r12.A04;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NonMessageDataRequestSendMethod/sendLinkPreviewRequestResponseMessage link preview stanzaId=");
        A0u.append(str);
        A0u.append("; remoteDeviceJid");
        A0u.append(deviceJid);
        A0u.append("; linkPreviewSize=");
        C36321k7.A1Y(A0u, map.size());
        if (map.isEmpty()) {
            Log.w("NonMessageDataRequestSendMethod/sendLinkPreviewRequestResponseMessage link preview result is empty");
        } else {
            C174668Xz r3 = new C174668Xz(C36411kG.A0o(C36441kJ.A0n(r6.A00), r6.A04), str, C19970wo.A00(r6.A02));
            r3.A00 = deviceJid;
            r3.A00 = map;
            if (r6.A03.A01(r3) < 0) {
                Log.e("NonMessageDataRequestSendMethod/sendLinkPreviewRequestResponseMessage unable to add link preview peer message");
            } else {
                r6.A01.A01(new SendPeerMessageJob(deviceJid, r3));
            }
        }
        r12.A03.A01(str, 2, set.size(), i, i2, i4, 0, i3);
    }
}
