package X;

import android.graphics.RectF;
import android.net.Uri;
import com.whatsapp.jid.UserJid;
import java.io.File;

/* renamed from: X.1Yq  reason: invalid class name and case insensitive filesystem */
public class C29951Yq {
    public final C20690y0 A00;
    public final C19970wo A01;
    public final C24891Ee A02;
    public final C20810yC A03;
    public final AnonymousClass1D0 A04;
    public final C19600wD A05;
    public final AnonymousClass1D5 A06;
    public final C29961Yr A07;
    public final C19770wU A08;

    public static C65233Rg A00(C135066c4 r27, String str) {
        File file;
        Uri uri;
        C135066c4 r3 = r27;
        String str2 = r3.A0A;
        if (str2 != null) {
            if (r3.A01 == 3) {
                uri = Uri.parse(str2);
                file = null;
            } else {
                file = new File(str2);
                uri = null;
            }
            if (uri != null) {
                return C65233Rg.A00(uri, (C132046Rx) null, (C1262263a) null, new AnonymousClass3Ot(true, false, true), C25471Gl.A0d, r3.A04, str, 0, false, true, true);
            } else if (file != null) {
                AnonymousClass3Ot r1 = new AnonymousClass3Ot(true, false, true);
                C25471Gl r6 = C25471Gl.A0d;
                String str3 = r3.A0E;
                String str4 = r3.A0D;
                AnonymousClass3S2 r7 = r3.A04;
                AnonymousClass00C.A0D(r6, 0);
                return new C65233Rg(AnonymousClass3M4.A00((C132046Rx) null, r6, 0, true), new AnonymousClass65P((RectF) null, (C1262263a) null, r6, r7, file, (String) null, file.getName(), str3, str4, 0, 0, 0, 0, 0, 0, false, AnonymousClass6Y1.A06(r6), true, true, false, false, false, false), r1, (String) null, 0);
            }
        }
        return null;
    }

    public C79593ty A01(C135106c9 r12, AnonymousClass11F r13, UserJid userJid, AnonymousClass3T1 r15, C135066c4 r16, Integer num) {
        C79593ty r6 = new C79593ty();
        if (!this.A05.A09()) {
            r6.A0C(new C122725vK());
            return r6;
        }
        AnonymousClass3T1 r5 = r15;
        C135066c4 r2 = r16;
        Integer num2 = num;
        this.A08.Boy(new C35471ik(r2, num2, this, r5, r6, userJid, r12, r13, 1));
        return r6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C46962bx A02(X.AnonymousClass11F r18, com.whatsapp.jid.UserJid r19, X.AnonymousClass3T1 r20, X.C135066c4 r21, java.lang.Integer r22) {
        /*
            r17 = this;
            X.3Qj r5 = new X.3Qj
            r5.<init>()
            r2 = r21
            java.lang.String r3 = r2.A0A
            if (r3 == 0) goto L_0x005e
            int r1 = r2.A01
            r0 = 3
            if (r1 != r0) goto L_0x0057
            android.net.Uri r4 = android.net.Uri.parse(r3)
        L_0x0014:
            int r0 = r2.A03
            r5.A0A = r0
            int r0 = r2.A02
            r5.A06 = r0
            r0 = r17
            X.1D5 r3 = r0.A06
            r14 = 0
            r13 = 20
            r6 = 0
            r10 = r6
            r11 = r6
            r12 = r6
            r15 = 0
            r16 = 0
            r7 = r18
            r8 = r20
            r9 = r6
            X.2bU r1 = r3.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.2bx r1 = (X.C46962bx) r1
            boolean r0 = X.AnonymousClass143.A0G(r7)
            if (r0 == 0) goto L_0x0040
            r0 = r19
            r1.A0q(r0)
        L_0x0040:
            java.lang.String r0 = r2.A0E
            r1.A04 = r0
            java.lang.String r0 = r2.A0D
            r1.A05 = r0
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "image/webp"
            r1.A05 = r0
        L_0x004e:
            X.3S2 r0 = r2.A04
            r1.A05 = r0
            r0 = r22
            r1.A06 = r0
            return r1
        L_0x0057:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r5.A0I = r0
        L_0x005e:
            r4 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29951Yq.A02(X.11F, com.whatsapp.jid.UserJid, X.3T1, X.6c4, java.lang.Integer):X.2bx");
    }

    public void A03(C135106c9 r27, C29941Yp r28) {
        C29961Yr r8 = this.A07;
        C25471Gl r10 = C25471Gl.A0Z;
        C135106c9 r7 = r27;
        String str = r7.A0F;
        String str2 = r7.A04;
        String str3 = r7.A03;
        String str4 = r7.A02;
        String str5 = r7.A0G;
        byte[] bArr = r7.A08;
        byte[] bArr2 = bArr;
        String str6 = str5;
        String str7 = str4;
        r8.A0A(new C146466ve(r7, r28, this), r10, (C25711Hj) null, (C25711Hj) null, str, str2, str3, (String) null, str7, str6, bArr2, 3, 1, 1, 0, r7.A0E);
    }

    public C29951Yq(C20690y0 r1, C19600wD r2, C19970wo r3, C24891Ee r4, C20810yC r5, AnonymousClass1D5 r6, AnonymousClass1D0 r7, C29961Yr r8, C19770wU r9) {
        this.A01 = r3;
        this.A03 = r5;
        this.A08 = r9;
        this.A00 = r1;
        this.A06 = r6;
        this.A04 = r7;
        this.A07 = r8;
        this.A02 = r4;
        this.A05 = r2;
    }
}
