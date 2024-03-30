package X;

import java.io.File;

/* renamed from: X.5Br  reason: invalid class name and case insensitive filesystem */
public class C104855Br extends C104865Bt {
    public final File A00;
    public final File A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final /* synthetic */ C25971Ij A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C104855Br(X.C25971Ij r14, X.C100024uL r15, java.lang.String r16) {
        /*
            r13 = this;
            r5 = r13
            r13.A06 = r14
            X.0wo r7 = r14.A01
            X.0yC r9 = r14.A03
            X.0ww r6 = r14.A00
            X.0wx r8 = r14.A02
            X.1BS r11 = r14.A06
            X.1BV r10 = r14.A05
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.0yF r0 = r14.A04     // Catch:{ IOException -> 0x0083 }
            X.0yG r2 = r0.A00     // Catch:{ IOException -> 0x0083 }
            java.lang.String r1 = ""
            java.io.File r0 = r2.A01(r1)     // Catch:{ IOException -> 0x0083 }
            r13.A01 = r0     // Catch:{ IOException -> 0x0083 }
            java.io.File r0 = r2.A01(r1)     // Catch:{ IOException -> 0x0083 }
            r13.A00 = r0     // Catch:{ IOException -> 0x0083 }
            int r1 = r15.bitField0_
            r0 = r1 & 1
            r2 = r16
            if (r0 == 0) goto L_0x007b
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0073
            r0 = r1 & 16
            if (r0 == 0) goto L_0x006b
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0063
            X.AUx r0 = r15.mediaKey_
            byte[] r4 = r0.A06()
            X.AUx r0 = r15.fileSha256_
            byte[] r3 = r0.A06()
            X.AUx r0 = r15.fileEncSha256_
            byte[] r2 = r0.A06()
            java.lang.String r0 = r15.directPath_
            r13.A03 = r0
            r1 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r4, r1)
            r13.A02 = r0
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r1)
            r13.A05 = r0
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r1)
            r13.A04 = r0
            return
        L_0x0063:
            r1 = 52
            X.198 r0 = new X.198
            r0.<init>(r1, r2)
            throw r0
        L_0x006b:
            r1 = 51
            X.198 r0 = new X.198
            r0.<init>(r1, r2)
            throw r0
        L_0x0073:
            r1 = 50
            X.198 r0 = new X.198
            r0.<init>(r1, r2)
            throw r0
        L_0x007b:
            r1 = 49
            X.198 r0 = new X.198
            r0.<init>(r1, r2)
            throw r0
        L_0x0083:
            r2 = move-exception
            java.lang.String r0 = "external-mutations-downloader: Failed to prepare location for encryptedFile/destinationFile"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "Failed to prepare location for encryptedFile/destinationFile "
            X.54o r0 = new X.54o
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104855Br.<init>(X.1Ij, X.4uL, java.lang.String):void");
    }

    public void A03() {
        if (this.A01.delete()) {
            this.A00.delete();
        }
    }
}
