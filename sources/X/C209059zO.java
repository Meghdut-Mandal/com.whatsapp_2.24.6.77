package X;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.android.exoplayer2.util.Util;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: X.9zO  reason: invalid class name and case insensitive filesystem */
public class C209059zO implements B28 {
    public int A00;
    public int A01;
    public HandlerThread A02;
    public C15870o7 A03;
    public C166047uw A04;
    public C187268xZ A05;
    public byte[] A06 = null;
    public byte[] A07;
    public final AnonymousClass9MN A08;
    public final C166057ux A09;
    public final C191019Bg A0A;
    public final C200129gf A0B;
    public final C201699k8 A0C;
    public final UUID A0D;
    public final String A0E;
    public final byte[] A0F;

    public C209059zO(Looper looper, C191019Bg r4, C200129gf r5, C201699k8 r6, AnonymousClass9MN r7, String str, UUID uuid, byte[] bArr) {
        this.A0D = uuid;
        this.A0B = r5;
        this.A0C = r6;
        this.A08 = r7;
        this.A0A = r4;
        this.A01 = 2;
        this.A09 = new C166057ux(looper, this);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.A02 = handlerThread;
        handlerThread.start();
        this.A04 = new C166047uw(this.A02.getLooper(), this);
        this.A0F = bArr;
        this.A0E = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a A[Catch:{ NumberFormatException -> 0x0051 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C209059zO r7, boolean r8) {
        /*
            r3 = 1
            r5 = 2
            byte[] r2 = r7.A06
            if (r2 != 0) goto L_0x000a
            r7.A01(r3, r8)
        L_0x0009:
            return
        L_0x000a:
            int r0 = r7.A01
            r6 = 4
            if (r0 == r6) goto L_0x0016
            X.9k8 r1 = r7.A0C     // Catch:{ Exception -> 0x00b0 }
            byte[] r0 = r7.A07     // Catch:{ Exception -> 0x00b0 }
            r1.A0A(r0, r2)     // Catch:{ Exception -> 0x00b0 }
        L_0x0016:
            java.util.UUID r1 = X.AnonymousClass9B7.A04
            java.util.UUID r0 = r7.A0D
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0096
            byte[] r1 = r7.A07
            if (r1 == 0) goto L_0x004f
            X.9k8 r0 = r7.A0C
            java.util.HashMap r3 = r0.A04(r1)
            if (r3 == 0) goto L_0x004f
            java.lang.String r0 = "LicenseDurationRemaining"
            java.lang.String r0 = X.C90504aG.A0l(r0, r3)     // Catch:{ NumberFormatException -> 0x0039 }
            if (r0 == 0) goto L_0x0039
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0039 }
            goto L_0x003e
        L_0x0039:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x003e:
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "PlaybackDurationRemaining"
            java.lang.String r0 = X.C90504aG.A0l(r0, r3)     // Catch:{ NumberFormatException -> 0x0051 }
            if (r0 == 0) goto L_0x0051
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0051 }
            goto L_0x0056
        L_0x004f:
            r1 = 0
            goto L_0x005e
        L_0x0051:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0056:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Pair r1 = X.C36441kJ.A0Q(r2, r0)
        L_0x005e:
            java.lang.Object r0 = r1.first
            long r2 = X.C36431kI.A09(r0)
            java.lang.Object r0 = r1.second
            long r0 = X.C36431kI.A09(r0)
            long r3 = java.lang.Math.min(r2, r0)
            r1 = 60
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0087
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Offline license has expired or will expire soon. Remaining seconds: "
            java.lang.String r1 = X.C36381kD.A0z(r0, r1, r3)
            java.lang.String r0 = "DefaultDrmSession"
            android.util.Log.d(r0, r1)
            r7.A01(r5, r8)
            return
        L_0x0087:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0096
            X.91U r0 = new X.91U
            r0.<init>()
            A02(r7, r0, r5)
            return
        L_0x0096:
            r7.A01 = r6
            X.9Bg r0 = r7.A0A
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0009
            r1.next()
            java.lang.String r0 = "listener"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00b0:
            r2 = move-exception
            java.lang.String r1 = "DefaultDrmSession"
            java.lang.String r0 = "Error trying to restore Widevine keys."
            android.util.Log.e(r1, r0, r2)
            A02(r7, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209059zO.A03(X.9zO, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r4 = r2.split("_", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if ("neg".equals(r4[r3 - 2]) == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.lang.Throwable r5) {
        /*
            android.media.MediaDrm$MediaDrmStateException r5 = (android.media.MediaDrm.MediaDrmStateException) r5
            java.lang.String r2 = r5.getDiagnosticInfo()
            r5 = 0
            if (r2 == 0) goto L_0x0032
            java.lang.String r1 = "_"
            r0 = -1
            java.lang.String[] r4 = r2.split(r1, r0)
            int r3 = r4.length
            r1 = 2
            if (r3 < r1) goto L_0x0032
            int r0 = r3 + -1
            r2 = r4[r0]
            r0 = 3
            if (r3 < r0) goto L_0x0027
            int r3 = r3 - r1
            r1 = r4[r3]
            java.lang.String r0 = "neg"
            boolean r1 = r0.equals(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            java.util.Objects.requireNonNull(r2)     // Catch:{ NumberFormatException -> 0x0032 }
            int r5 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0032 }
            if (r0 == 0) goto L_0x0032
            int r5 = -r5
        L_0x0032:
            int r0 = com.facebook.android.exoplayer2.util.Util.A01(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209059zO.A00(java.lang.Throwable):int");
    }

    private void A01(int i, boolean z) {
        byte[] bArr = this.A07;
        try {
            AnonymousClass9GD A012 = this.A0C.A01(this.A0E, bArr, this.A0F, i);
            if (AnonymousClass9B7.A00.equals(this.A0D)) {
                byte[] bArr2 = A012.A01;
                if (Util.A00 < 27) {
                    Charset charset = C114085gc.A05;
                    bArr2 = new String(bArr2, charset).replace('+', '-').replace('/', '_').getBytes(charset);
                }
                A012 = new AnonymousClass9GD(bArr2, A012.A00);
            }
            this.A04.obtainMessage(1, z ? 1 : 0, 0, A012).sendToTarget();
        } catch (Exception e) {
            if (e instanceof NotProvisionedException) {
                this.A0B.A02(this);
            } else {
                A02(this, e, 1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (r4 != 2) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C209059zO r2, java.lang.Exception r3, int r4) {
        /*
            int r1 = com.facebook.android.exoplayer2.util.Util.A00
            boolean r0 = A06(r3)
            if (r0 == 0) goto L_0x0032
            int r1 = A00(r3)
        L_0x000c:
            X.8xZ r0 = new X.8xZ
            r0.<init>(r1, r3)
            r2.A05 = r0
            java.lang.String r1 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            android.util.Log.e(r1, r0, r3)
            X.9Bg r0 = r2.A0A
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006e
            r1.next()
            java.lang.String r0 = "listener"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0032:
            r0 = 23
            if (r1 < r0) goto L_0x003f
            boolean r0 = X.C1893293g.A00(r3)
            if (r0 == 0) goto L_0x003f
        L_0x003c:
            r1 = 6006(0x1776, float:8.416E-42)
            goto L_0x000c
        L_0x003f:
            boolean r0 = A07(r3)
            if (r0 != 0) goto L_0x006b
            boolean r0 = A05(r3)
            if (r0 == 0) goto L_0x004e
            r1 = 6007(0x1777, float:8.418E-42)
            goto L_0x000c
        L_0x004e:
            boolean r0 = r3 instanceof X.AnonymousClass924
            if (r0 == 0) goto L_0x0055
            r1 = 6001(0x1771, float:8.409E-42)
            goto L_0x000c
        L_0x0055:
            boolean r0 = r3 instanceof X.AnonymousClass91T
            if (r0 == 0) goto L_0x005c
            r1 = 6003(0x1773, float:8.412E-42)
            goto L_0x000c
        L_0x005c:
            boolean r0 = r3 instanceof X.AnonymousClass91U
            if (r0 == 0) goto L_0x0063
            r1 = 6008(0x1778, float:8.419E-42)
            goto L_0x000c
        L_0x0063:
            r0 = 1
            if (r4 == r0) goto L_0x003c
            r0 = 2
            r1 = 6004(0x1774, float:8.413E-42)
            if (r4 == r0) goto L_0x000c
        L_0x006b:
            r1 = 6002(0x1772, float:8.41E-42)
            goto L_0x000c
        L_0x006e:
            int r1 = r2.A01
            r0 = 4
            if (r1 == r0) goto L_0x0076
            r0 = 1
            r2.A01 = r0
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209059zO.A02(X.9zO, java.lang.Exception, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r2 == 4) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(X.C209059zO r4, boolean r5) {
        /*
            int r2 = r4.A01
            r0 = 3
            if (r2 == r0) goto L_0x0009
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            r3 = 1
            if (r0 != 0) goto L_0x0032
            r2 = 3
            X.9k8 r1 = r4.A0C     // Catch:{ NotProvisionedException -> 0x001f, Exception -> 0x002c }
            byte[] r0 = r1.A0B()     // Catch:{ NotProvisionedException -> 0x001f, Exception -> 0x002c }
            r4.A07 = r0     // Catch:{ NotProvisionedException -> 0x001f, Exception -> 0x002c }
            X.9zL r0 = r1.A03(r0)     // Catch:{ NotProvisionedException -> 0x001f, Exception -> 0x002c }
            r4.A03 = r0     // Catch:{ NotProvisionedException -> 0x001f, Exception -> 0x002c }
            r4.A01 = r2     // Catch:{ NotProvisionedException -> 0x001f, Exception -> 0x002c }
            return r3
        L_0x001f:
            r0 = move-exception
            if (r5 == 0) goto L_0x0028
            X.9gf r0 = r4.A0B
            r0.A02(r4)
            goto L_0x0030
        L_0x0028:
            A02(r4, r0, r2)
            goto L_0x0030
        L_0x002c:
            r0 = move-exception
            A02(r4, r0, r3)
        L_0x0030:
            r0 = 0
            return r0
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209059zO.A04(X.9zO, boolean):boolean");
    }

    public final C187268xZ BBc() {
        if (this.A01 == 1) {
            return this.A05;
        }
        return null;
    }

    public final C15870o7 BAT() {
        return this.A03;
    }

    public final int BHt() {
        return this.A01;
    }

    public static boolean A05(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean A06(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static boolean A07(Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
