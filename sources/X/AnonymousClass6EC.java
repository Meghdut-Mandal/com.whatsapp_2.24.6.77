package X;

import java.io.File;

/* renamed from: X.6EC  reason: invalid class name */
public class AnonymousClass6EC {
    public AnonymousClass6OY A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final AnonymousClass6D7 A0F;
    public final C131456Pc A0G;
    public final AnonymousClass5TE A0H;
    public final File A0I;
    public final boolean A0J;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6EC(android.media.MediaFormat r8, X.AnonymousClass6D7 r9, X.C131456Pc r10, X.AnonymousClass6OY r11, X.AnonymousClass5TE r12, java.io.File r13, int r14, int r15, long r16, long r18, long r20, long r22, boolean r24) {
        /*
            r7 = this;
            r4 = -1
            r2 = -1
            r7.<init>()
            r7.A0I = r13
            r0 = r16
            r7.A0A = r0
            r0 = r18
            r7.A0B = r0
            r7.A03 = r14
            r7.A02 = r15
            r0 = r20
            r7.A0C = r0
            r5 = r22
            r7.A0E = r5
            r5 = r24
            r7.A0J = r5
            r7.A0H = r12
            boolean r5 = r10.A0T
            if (r5 == 0) goto L_0x0057
            r7.A09 = r14
            r7.A07 = r15
            r7.A0D = r0
        L_0x002c:
            r7.A06 = r4
            r7.A08 = r4
        L_0x0030:
            r7.A0G = r10
            r7.A0F = r9
            if (r8 == 0) goto L_0x0055
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0055
            java.lang.String r1 = "color-standard"
            boolean r0 = r8.containsKey(r1)
            if (r0 == 0) goto L_0x0055
            int r0 = r8.getInteger(r1)
            r7.A04 = r0
            java.lang.String r0 = "color-transfer"
            int r0 = r8.getInteger(r0)
        L_0x0050:
            r7.A05 = r0
            r7.A00 = r11
            return
        L_0x0055:
            r0 = 0
            goto L_0x0050
        L_0x0057:
            if (r11 != 0) goto L_0x0060
            r7.A09 = r4
            r7.A07 = r4
            r7.A0D = r2
            goto L_0x002c
        L_0x0060:
            int r0 = r11.A09
            r7.A09 = r0
            int r0 = r11.A07
            r7.A07 = r0
            int r0 = r11.A00()
            long r0 = (long) r0
            r7.A0D = r0
            int r0 = r11.A01
            r7.A06 = r0
            int r0 = r11.A08
            r7.A08 = r0
            X.6Ay r0 = r11.A0C
            if (r0 == 0) goto L_0x0030
            X.5Tf r0 = r0.A02
            java.lang.String r0 = r0.name()
            r7.A01 = r0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6EC.<init>(android.media.MediaFormat, X.6D7, X.6Pc, X.6OY, X.5TE, java.io.File, int, int, long, long, long, long, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6EC r7 = (AnonymousClass6EC) obj;
            if (this.A0A != r7.A0A || this.A0B != r7.A0B || this.A03 != r7.A03 || this.A02 != r7.A02 || this.A0C != r7.A0C || this.A09 != r7.A09 || this.A07 != r7.A07 || this.A0D != r7.A0D || this.A06 != r7.A06 || this.A08 != r7.A08 || this.A0E != r7.A0E || Double.compare(0.0d, 0.0d) != 0 || this.A0J != r7.A0J || this.A0H.mValue != r7.A0H.mValue || !this.A0I.equals(r7.A0I) || !this.A0G.equals(r7.A0G)) {
                return false;
            }
            AnonymousClass6D7 r1 = this.A0F;
            AnonymousClass6D7 r0 = r7.A0F;
            if (r1 == null) {
                if (r0 != null) {
                    return false;
                }
            } else if (r0 == null || !r1.equals(r0)) {
                return false;
            }
            String str = this.A01;
            String str2 = r7.A01;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (str2 == null || !str.equals(str2)) {
                return false;
            }
            if (!(this.A05 == r7.A05 && this.A04 == r7.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[23];
        objArr[0] = this.A0I;
        C36421kH.A1P(objArr, this.A0A);
        C36361kB.A1W(objArr, this.A0B);
        C36341k9.A1T(objArr, this.A03);
        C36341k9.A1U(objArr, this.A02);
        objArr[5] = Long.valueOf(this.A0C);
        C36381kD.A1T(objArr, -1);
        C36361kB.A1V(objArr, this.A09);
        objArr[8] = Integer.valueOf(this.A07);
        objArr[9] = Long.valueOf(this.A0D);
        objArr[10] = Integer.valueOf(this.A06);
        objArr[11] = Integer.valueOf(this.A08);
        objArr[12] = Long.valueOf(this.A0E);
        objArr[13] = C90494aF.A0S();
        objArr[14] = Boolean.valueOf(this.A0J);
        objArr[15] = Integer.valueOf(this.A0H.mValue);
        objArr[16] = this.A0G;
        objArr[17] = this.A0F;
        objArr[18] = -1L;
        objArr[19] = this.A01;
        objArr[20] = C36381kD.A0j();
        objArr[21] = Integer.valueOf(this.A04);
        return AnonymousClass000.A0M(Integer.valueOf(this.A05), objArr, 22);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VideoResizeResult{outputFile=");
        A0u.append(this.A0I);
        A0u.append(", originalFileSize=");
        A0u.append(this.A0A);
        A0u.append(", outputFileSize=");
        A0u.append(this.A0B);
        A0u.append(", sourceWidth=");
        A0u.append(this.A03);
        A0u.append(", sourceHeight=");
        A0u.append(this.A02);
        A0u.append(", sourceBitRate=");
        A0u.append(this.A0C);
        A0u.append(", sourceFrameRate=");
        A0u.append(-1);
        A0u.append(", targetWidth=");
        A0u.append(this.A09);
        A0u.append(", targetHeight=");
        A0u.append(this.A07);
        A0u.append(", targetRotationDegreesClockwise=");
        A0u.append(this.A08);
        A0u.append(", targetBitRate=");
        A0u.append(this.A0D);
        A0u.append(", targetFrameRate=");
        A0u.append(this.A06);
        A0u.append(", videoTime=");
        A0u.append(this.A0E);
        A0u.append(", frameDropPercent=");
        A0u.append(0.0d);
        A0u.append(", mediaResizeStatus=");
        A0u.append(this.A0G);
        A0u.append(", mIsLastSegment=");
        A0u.append(this.A0J);
        A0u.append(", mTrackType=");
        A0u.append(this.A0H);
        A0u.append(", mediaDemuxerStats=");
        A0u.append(this.A0F);
        C90514aH.A1S(A0u, ", mOutputIndex=");
        A0u.append(", framePts=");
        A0u.append(-1);
        A0u.append(", targetCodec=");
        A0u.append(this.A01);
        C90474aD.A1N(A0u, ", useHLGHdrTranscode=");
        A0u.append(", targetColorTransfer=");
        A0u.append(this.A05);
        A0u.append(", targetColorSpace=");
        A0u.append(this.A04);
        return AnonymousClass000.A0s(A0u);
    }
}
