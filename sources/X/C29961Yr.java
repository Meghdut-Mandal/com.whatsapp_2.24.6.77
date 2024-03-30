package X;

import com.whatsapp.stickers.WebpUtils;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: X.1Yr  reason: invalid class name and case insensitive filesystem */
public class C29961Yr extends AnonymousClass1GM {
    public static final C18950u5 A07 = new C18950u5(1, 60, 200, false);
    public final C19700wN A00;
    public final AnonymousClass1TO A01;
    public final C20690y0 A02;
    public final WebpUtils A03;
    public final C19770wU A04;
    public final Executor A05;
    public final Executor A06;

    public C29961Yr(C19700wN r4, AnonymousClass1TO r5, C20690y0 r6, AnonymousClass17Y r7, WebpUtils webpUtils, C19770wU r9) {
        super(new C18910u1((Object) null, new C36251k0(r9, 12)));
        this.A00 = r4;
        this.A04 = r9;
        this.A03 = webpUtils;
        this.A02 = r6;
        this.A01 = r5;
        Objects.requireNonNull(r7);
        this.A05 = new C36131jo(r7, 1);
        Objects.requireNonNull(r9);
        this.A06 = new C36131jo(r9, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0118, code lost:
        if (r1 != 2) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C160107kT r52, X.C25471Gl r53, X.C25711Hj r54, X.C25711Hj r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, byte[] r62, int r63, int r64, int r65, int r66, long r67) {
        /*
            r51 = this;
            r3 = r57
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r9 = 0
            r0 = r51
            r1 = r63
            r2 = r62
            if (r4 != 0) goto L_0x011b
            if (r62 == 0) goto L_0x011b
            r33 = r66
            r21 = r58
            r23 = r60
            if (r66 != 0) goto L_0x00a2
            boolean r4 = android.text.TextUtils.isEmpty(r23)
            if (r4 != 0) goto L_0x0025
            boolean r4 = android.text.TextUtils.isEmpty(r21)
            if (r4 == 0) goto L_0x00a2
        L_0x0025:
            X.0u5 r2 = A07
            boolean r2 = r2.A00()
            if (r2 == 0) goto L_0x0061
            X.0wN r8 = r0.A00
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = ", createMediaDownloadRequestDataForFile/direct_path is "
            r7.append(r2)
            boolean r6 = android.text.TextUtils.isEmpty(r23)
            java.lang.String r5 = "null"
            java.lang.String r4 = "not null"
            r2 = r4
            if (r6 == 0) goto L_0x0045
            r2 = r5
        L_0x0045:
            r7.append(r2)
            java.lang.String r2 = " encHash is "
            r7.append(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r21)
            if (r2 != 0) goto L_0x0054
            r5 = r4
        L_0x0054:
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4 = 1
            java.lang.String r2 = "FileDownloadManager/createMediaDownloadForFMessage"
            r8.A0E(r2, r5, r4)
        L_0x0061:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "FileDownloadManager/queueFileDownload auto download documentType "
            r4.append(r2)
            r11 = r65
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            if (r2 != 0) goto L_0x009d
            r2 = 0
        L_0x0074:
            r4.append(r2)
            java.lang.String r2 = ", fileDownloadRequestData is "
            r4.append(r2)
            if (r9 != 0) goto L_0x009a
            java.lang.String r2 = "null"
        L_0x0080:
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r5 = r52
            if (r9 != 0) goto L_0x0139
            java.util.concurrent.Executor r2 = r0.A05
            r1 = 7
            X.1j8 r0 = new X.1j8
            r0.<init>(r5, r1)
            r2.execute(r0)
            return
        L_0x009a:
            java.lang.String r2 = "no null"
            goto L_0x0080
        L_0x009d:
            java.lang.String r2 = r2.toString()
            goto L_0x0074
        L_0x00a2:
            X.0y0 r5 = r0.A02
            r4 = 1
            if (r1 != r4) goto L_0x010e
            X.2o7 r13 = X.C51622o7.ACCOUNT
        L_0x00a9:
            r40 = 0
        L_0x00ab:
            r12 = r53
            r17 = r59
            r6 = r12
            r7 = r13
            r8 = r21
            r9 = r3
            r10 = r17
            r11 = r40
            java.io.File r16 = r5.A0K(r6, r7, r8, r9, r10, r11)
            r28 = 0
            r10 = 0
            r4 = r5
            r5 = r12
            r6 = r13
            r7 = r3
            r8 = r17
            r9 = r11
            java.io.File r15 = r4.A0L(r5, r6, r7, r8, r9, r10)
            r10 = 0
            r36 = 0
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r20 = r4.toString()
            r30 = 2
            r32 = 1
            r14 = r10
            r24 = r10
            r25 = r10
            r26 = r10
            r29 = 0
            r38 = 0
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            X.68C r9 = new X.68C
            r31 = r64
            r34 = r67
            r19 = r56
            r22 = r61
            r11 = r10
            r18 = r3
            r27 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            goto L_0x0061
        L_0x010e:
            r4 = 5
            if (r1 != r4) goto L_0x0114
            X.2o7 r13 = X.C51622o7.NEWSLETTER
            goto L_0x00a9
        L_0x0114:
            r13 = 0
            r4 = 2
            r40 = 1
            if (r1 == r4) goto L_0x00ab
            goto L_0x00a9
        L_0x011b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = "FileDownloadManager/createMediaDownloadForFMessage/unable to download due to missing media data; mediaKey="
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = ", fileHash="
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x0061
        L_0x0139:
            X.3IW r4 = new X.3IW
            r4.<init>(r1, r3)
            X.1TO r7 = r0.A01
            r8 = 0
            r10 = 1
            r12 = 1
            r14 = 0
            X.4xN r3 = r7.A00(r8, r9, r10, r11, r12, r14)
            r3.B0M(r5)
            r5 = r54
            if (r54 == 0) goto L_0x0157
            java.util.concurrent.Executor r2 = r0.A06
            X.1Hk r1 = r3.A0H
            r1.A03(r5, r2)
        L_0x0157:
            r5 = r55
            if (r55 == 0) goto L_0x0162
            java.util.concurrent.Executor r2 = r0.A05
            X.1Hk r1 = r3.A0I
            r1.A03(r5, r2)
        L_0x0162:
            r0.A04(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29961Yr.A0A(X.7kT, X.1Gl, X.1Hj, X.1Hj, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, byte[], int, int, int, int, long):void");
    }
}
