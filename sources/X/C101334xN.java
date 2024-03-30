package X;

import android.net.Uri;
import android.os.ConditionVariable;
import com.whatsapp.Mp4Ops;
import com.whatsapp.media.magi.Magi;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4xN  reason: invalid class name and case insensitive filesystem */
public class C101334xN extends C101344xO implements Comparable, C159517jU {
    public AnonymousClass620 A00;
    public C124935z2 A01;
    public C104905Bx A02;
    public File A03;
    public File A04;
    public URL A05;
    public boolean A06;
    public final int A07;
    public final long A08;
    public final ConditionVariable A09;
    public final C19700wN A0A;
    public final C20690y0 A0B;
    public final AnonymousClass17Y A0C;
    public final AnonymousClass1DT A0D;
    public final Mp4Ops A0E;
    public final C20050ww A0F;
    public final AnonymousClass1AV A0G;
    public final C25721Hk A0H;
    public final C25721Hk A0I;
    public final C25721Hk A0J = C90524aI.A0I();
    public final C25721Hk A0K = C90524aI.A0I();
    public final C25721Hk A0L = C90524aI.A0I();
    public final C25721Hk A0M = C90524aI.A0I();
    public final C25721Hk A0N = C90524aI.A0I();
    public final C19970wo A0O;
    public final C19630wG A0P;
    public final C20060wx A0Q;
    public final AnonymousClass1BW A0R;
    public final AnonymousClass1E3 A0S;
    public final AnonymousClass1DF A0T;
    public final C20810yC A0U;
    public final C21010yW A0V;
    public final AnonymousClass1BV A0W;
    public final AnonymousClass1BU A0X;
    public final AnonymousClass1D5 A0Y;
    public final AnonymousClass1D4 A0Z;
    public final C24811Dw A0a;
    public final AnonymousClass66Q A0b;
    public final AnonymousClass1DE A0c;
    public final AnonymousClass1GO A0d;
    public final C129166Fp A0e;
    public final AnonymousClass68C A0f;
    public final C119695qI A0g;
    public final Magi A0h;
    public final AnonymousClass1GJ A0i;
    public final AnonymousClass6Fk A0j;
    public final C19890wg A0k;
    public final AnonymousClass7hU A0l;
    public final AnonymousClass1BS A0m;
    public final AnonymousClass1CR A0n;
    public final WebpUtils A0o;
    public final AnonymousClass1B0 A0p;
    public final AnonymousClass6Fc A0q;
    public final C25561Gu A0r;
    public final AnonymousClass6ML A0s;
    public final C25541Gs A0t;
    public final C19770wU A0u;
    public final AnonymousClass1D7 A0v;
    public final C21570zS A0w;
    public final Object A0x;
    public final LinkedList A0y = C90524aI.A0l();
    public final CountDownLatch A0z = new CountDownLatch(1);
    public final AtomicBoolean A10 = new AtomicBoolean();
    public final boolean A11;
    public final AnonymousClass1GX A12;
    public final AnonymousClass1YI A13;
    public volatile int A14;
    public volatile boolean A15;
    public volatile boolean A16;

    public static C104885Bv A01(C101334xN r8, boolean z) {
        C101334xN r7 = r8;
        C19970wo r3 = r8.A0O;
        C20810yC r5 = r8.A0U;
        C104885Bv r1 = new C104885Bv(r8.A0F, r3, r8.A0Q, r5, r7.A0W, r7, r8.A0m, z);
        r1.B0M(new C146436vb(r7));
        return r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.C101334xN r12, X.C129166Fp r13, java.io.File r14, java.lang.String r15, boolean r16) {
        /*
            r6 = r15
            long r0 = r14.length()
            r13.A0C(r0)
            X.68C r2 = r12.A0f
            java.io.File r0 = r2.A0E
            if (r0 == 0) goto L_0x0025
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0025
            int r1 = com.whatsapp.files.FileUtils$OsRename.attempt(r14, r0)
            if (r1 <= 0) goto L_0x00ae
            int r1 = com.whatsapp.files.FileUtils$OsRename.attempt(r14, r0)
            if (r1 <= 0) goto L_0x00a9
            java.lang.String r1 = "media-file-utils/Second try rename failed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x0025:
            boolean r9 = r2.A0Y
            X.2o7 r4 = r2.A0B
            boolean r10 = r2.A0V
            boolean r11 = r2.A0b
            X.1Gl r3 = r2.A0A
            int r7 = r2.A04
            int r8 = r2.A01
            java.lang.String r5 = r2.A0K
            java.lang.String r1 = r2.A0L
            if (r15 != 0) goto L_0x003f
            if (r1 == 0) goto L_0x00a7
            java.lang.String r6 = X.AnonymousClass6YY.A07(r1)
        L_0x003f:
            X.0y0 r1 = r12.A0B
            X.0wg r2 = r12.A0k
            java.io.File r2 = X.AnonymousClass1GW.A0E(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.A0E(r2)
            int r1 = com.whatsapp.files.FileUtils$OsRename.attempt(r14, r2)
            if (r1 <= 0) goto L_0x005b
            int r1 = com.whatsapp.files.FileUtils$OsRename.attempt(r14, r2)
            if (r1 <= 0) goto L_0x00a4
            java.lang.String r1 = "media-file-utils/Second try rename failed"
        L_0x0058:
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x005b:
            if (r16 != 0) goto L_0x00b3
            java.io.File r5 = r13.A03()
            java.io.File r4 = r12.A04
            if (r5 == 0) goto L_0x00a3
            X.1Gl r1 = X.C25471Gl.A0D
            boolean r1 = X.AnonymousClass6Y1.A04(r1)
            if (r1 == 0) goto L_0x00a3
            X.0yC r3 = r12.A0U
            r2 = 3116(0xc2c, float:4.366E-42)
            if (r9 == 0) goto L_0x0075
            r2 = 6269(0x187d, float:8.785E-42)
        L_0x0075:
            X.0yV r1 = X.C21000yV.A01
            boolean r1 = X.C20800yB.A01(r1, r3, r2)
            if (r1 == 0) goto L_0x00a3
            if (r0 == 0) goto L_0x0090
            java.lang.String r2 = r5.getAbsolutePath()
            java.lang.String r1 = r0.getAbsolutePath()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0090
            X.C90464aC.A18(r0)
        L_0x0090:
            if (r4 == 0) goto L_0x00a3
            java.lang.String r1 = r5.getAbsolutePath()
            java.lang.String r0 = r4.getAbsolutePath()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a3
            X.C90464aC.A18(r4)
        L_0x00a3:
            return
        L_0x00a4:
            java.lang.String r1 = "media-file-utils/Second try rename succeeded"
            goto L_0x0058
        L_0x00a7:
            r6 = 0
            goto L_0x003f
        L_0x00a9:
            java.lang.String r1 = "media-file-utils/Second try rename succeeded"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x00ae:
            r13.A0E(r0)
            if (r16 == 0) goto L_0x00a3
        L_0x00b3:
            java.io.File r0 = r13.A03()
            if (r0 == 0) goto L_0x00a3
            X.1GX r1 = r12.A12
            java.io.File r0 = r13.A03()
            r1.A0k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101334xN.A07(X.4xN, X.6Fp, java.io.File, java.lang.String, boolean):void");
    }

    public static AnonymousClass64M A02(C101334xN r6) {
        String str;
        Integer valueOf;
        String A012 = AnonymousClass1Ax.A01(r6.A07);
        int i = r6.A14;
        if (i == 0) {
            str = "manual";
        } else if (i == 1) {
            str = "full";
        } else if (i == 2) {
            str = "prefetch";
        } else if (i != 3) {
            str = "unknown";
        } else {
            str = "aggressive_prefetch";
        }
        C20810yC r1 = r6.A0U;
        String str2 = r6.A0f.A0A.A02;
        AnonymousClass620 r0 = r6.A00;
        if (r0 == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(r0.A01.get());
        }
        return new AnonymousClass64M(r1, valueOf, A012, str2, str, false);
    }

    private void A03(C133136Wx r5) {
        AnonymousClass68C r3 = this.A0f;
        C110995bZ.A01(r3);
        URL url = this.A0j.A0Z;
        if (url != null) {
            url.toString();
        }
        if (this.A16) {
            this.A0m.unregisterObserver(this.A0l);
        }
        this.A0e.A0D(r5, r3.A01, r5.A03());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0255, code lost:
        if (r11 == 2) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x027b, code lost:
        if (r4 == 15) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009e, code lost:
        if (r3 == 23) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d3, code lost:
        if (r1 == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ee, code lost:
        if (r14 == X.C25471Gl.A0W) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0148, code lost:
        if (r14 == 82) goto L_0x014a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C133136Wx r18, X.C101334xN r19) {
        /*
            r9 = r19
            X.6Fk r8 = r9.A0j
            r0 = 0
            r10 = r18
            X.AnonymousClass00C.A0D(r10, r0)
            r8.A0G = r10
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.A05 = r0
            r0 = 4
            r8.A03 = r0
            X.0wo r0 = r9.A0O
            long r0 = X.C19970wo.A00(r0)
            r8.A06 = r0
            boolean r0 = r9.A11
            if (r0 == 0) goto L_0x003e
            boolean r0 = r8 instanceof X.C104875Bu
            if (r0 == 0) goto L_0x003e
            X.68C r0 = r9.A0f
            java.lang.String r0 = r0.A0G
            if (r0 == 0) goto L_0x003e
            X.0yC r2 = r9.A0U
            X.0yV r1 = X.C21000yV.A01
            r0 = 7201(0x1c21, float:1.0091E-41)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 != 0) goto L_0x003e
            X.0wU r1 = r9.A0u
            r0 = 19
            X.C1503074t.A00(r1, r9, r0)
        L_0x003e:
            int r3 = r10.A01
            r0 = 22
            if (r3 != r0) goto L_0x005e
            X.1BW r2 = r9.A0R
            java.lang.Exception r1 = r8.A0J
            boolean r0 = r1 instanceof X.AnonymousClass5V2
            if (r0 == 0) goto L_0x005e
            r1.getCause()
            X.0yC r1 = r2.A01
            r0 = 5478(0x1566, float:7.676E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = ""
            r2.A01(r0)
        L_0x005e:
            X.5z2 r2 = r9.A01
            if (r2 == 0) goto L_0x0088
            long r4 = r8.A04()
            long r0 = r2.A07
            long r0 = r0 + r4
            r2.A07 = r0
            X.6Fc r0 = r9.A0q
            if (r0 == 0) goto L_0x0079
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0079
            int r0 = r2.A02
            int r0 = r0 + 1
            r2.A02 = r0
        L_0x0079:
            boolean r2 = r10.A03()
            X.0wU r1 = r9.A0u
            r0 = 17
            if (r2 == 0) goto L_0x0085
            r0 = 20
        L_0x0085:
            X.C1503074t.A00(r1, r9, r0)
        L_0x0088:
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "MediaDownload/sendStat skipping reporting events as we found media in the cache"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0091:
            return
        L_0x0092:
            X.6Fp r2 = r9.A0e
            monitor-enter(r2)
            boolean r0 = r2.A0G     // Catch:{ all -> 0x038b }
            monitor-exit(r2)
            if (r0 != 0) goto L_0x00a0
            r0 = 23
            r18 = 0
            if (r3 != r0) goto L_0x00a2
        L_0x00a0:
            r18 = 1
        L_0x00a2:
            X.68C r7 = r9.A0f
            boolean r0 = r7.A0R
            if (r0 != 0) goto L_0x00c8
            X.58z r1 = r10.A00
            if (r1 == 0) goto L_0x00c8
            X.0yW r0 = r9.A0V
            r0.Bly(r1)
        L_0x00b1:
            X.0wU r5 = r9.A0u
            r0 = 18
            X.C1503074t.A00(r5, r9, r0)
            long r3 = r8.A05()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            r0 = 39
            X.C80293vA.A00(r5, r9, r10, r0)
            return
        L_0x00c8:
            X.1DT r6 = r9.A0D
            X.5z2 r5 = r9.A01
            X.6Fc r0 = r9.A0q
            if (r0 == 0) goto L_0x00d5
            boolean r1 = r0.A0D
            r0 = 1
            if (r1 != 0) goto L_0x00d6
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            int r15 = r9.A07
            java.lang.Integer r11 = r2.A06
            if (r0 != 0) goto L_0x00b1
            X.6Wx r0 = r8.A0G
            if (r0 != 0) goto L_0x0387
            r0 = -1
        L_0x00e1:
            int r4 = X.AnonymousClass6UH.A00(r0)
            X.1Gl r14 = r8.A0g
            X.1Gl r0 = X.C25471Gl.A0K
            if (r14 == r0) goto L_0x00f0
            X.1Gl r0 = X.C25471Gl.A0W
            r3 = 0
            if (r14 != r0) goto L_0x00f1
        L_0x00f0:
            r3 = 1
        L_0x00f1:
            X.58z r2 = new X.58z
            r2.<init>()
            int r12 = r7.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r2.A0J = r0
            boolean r0 = r8.A0b
            if (r0 == 0) goto L_0x0383
            r0 = 4
        L_0x0104:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0Z = r0
            long r0 = r8.A0D
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0b = r0
            long r0 = r7.A07
            java.lang.Double r0 = X.C90524aI.A0Z(r0)
            r2.A0A = r0
            r13 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r2.A05 = r0
            r2.A06 = r0
            int r0 = r8.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0E = r0
            java.lang.Integer r0 = r8.A0M
            r2.A0B = r0
            java.lang.String r0 = r8.A0U
            r2.A0h = r0
            java.net.URL r0 = r8.A0Z
            if (r0 == 0) goto L_0x0380
            java.lang.String r0 = r0.getHost()
        L_0x013b:
            r2.A0i = r0
            int r14 = r14.A00
            boolean r0 = X.C66013Ui.A0K(r14)
            if (r0 != 0) goto L_0x014a
            r1 = 82
            r0 = 0
            if (r14 != r1) goto L_0x014b
        L_0x014a:
            r0 = 1
        L_0x014b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A04 = r0
            long r0 = r8.A0C
            r16 = 0
            int r14 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x037c
            long r16 = X.C36441kJ.A0A(r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r16 = r16 / r0
        L_0x0162:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r2.A0K = r0
            r0 = 8
            if (r4 == r0) goto L_0x0192
            r0 = 6
            if (r4 == r0) goto L_0x0192
            r0 = 9
            if (r4 == r0) goto L_0x0192
            r0 = 29
            if (r4 == r0) goto L_0x0192
            r0 = 10
            if (r4 == r0) goto L_0x0192
            r0 = 35
            if (r4 == r0) goto L_0x0192
            r0 = 36
            if (r4 == r0) goto L_0x0192
            r0 = 37
            if (r4 == r0) goto L_0x0192
            r0 = 38
            if (r4 == r0) goto L_0x0192
            r0 = 39
            if (r4 == r0) goto L_0x0192
            r0 = 2
            if (r4 != r0) goto L_0x01a0
        L_0x0192:
            X.0yC r1 = r6.A0D
            r0 = 3820(0xeec, float:5.353E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01a0
            java.lang.String r0 = r8.A0T
            r2.A0d = r0
        L_0x01a0:
            X.3IX r1 = r7.A09
            if (r1 == 0) goto L_0x01b1
            X.0yC r14 = r6.A0D
            r0 = 2
            if (r12 != r0) goto L_0x035f
            r0 = 3349(0xd15, float:4.693E-42)
            boolean r0 = r14.A0E(r0)
            if (r0 != 0) goto L_0x036a
        L_0x01b1:
            int r0 = r8.A01
            long r0 = (long) r0
            r16 = 32
            int r12 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r12 > 0) goto L_0x01bc
            r0 = 32
        L_0x01bc:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0L = r0
            if (r18 == 0) goto L_0x01c8
            java.lang.Integer r11 = X.C36361kB.A0j()
        L_0x01c8:
            r2.A0C = r11
            long r11 = r8.A04()
            r18 = 0
            int r0 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x01de
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r0, r3)
            r2.A0c = r0
        L_0x01de:
            long r0 = r8.A08
            r16 = -1
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x0357
            r0 = 0
        L_0x01e7:
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r0, r3)
            r2.A0a = r0
            java.lang.Long r0 = r8.A0S
            if (r0 == 0) goto L_0x01f3
            r2.A0W = r0
        L_0x01f3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.A0I = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r2.A0H = r0
            int r11 = r8.A00
            boolean r0 = r7.A0Z
            if (r0 == 0) goto L_0x034b
            r1 = 5
        L_0x0206:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A0G = r0
            java.lang.Long r0 = r8.A0P
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r0, r3)
            r2.A0Y = r0
            long r0 = r8.A07
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x021c
            r0 = 0
        L_0x021c:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0P = r0
            long r0 = r8.A01()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r0, r3)
            r2.A0M = r0
            long r0 = r8.A02()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r0, r3)
            r2.A0O = r0
            java.lang.Boolean r0 = r8.A0H
            r2.A00 = r0
            java.lang.Long r0 = r8.A0R
            r2.A0N = r0
            java.lang.String r0 = r8.A0X
            java.lang.Integer r0 = X.C132976Wa.A01(r0)
            r2.A0D = r0
            int r11 = r7.A02
            r0 = 3
            if (r11 == r0) goto L_0x0257
            r1 = 2
            r0 = 0
            if (r11 != r1) goto L_0x0258
        L_0x0257:
            r0 = 1
        L_0x0258:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            long r0 = r8.A05()
            java.lang.Double r0 = X.C90524aI.A0Z(r0)
            r2.A07 = r0
            long r0 = r8.A03()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r0, r3)
            r2.A0Q = r0
            if (r4 == r13) goto L_0x027d
            r0 = 15
            r11 = 1
            if (r4 != r0) goto L_0x027e
        L_0x027d:
            r11 = 0
        L_0x027e:
            r1 = 0
            if (r11 == 0) goto L_0x0348
            java.lang.String r0 = r8.A0Y
        L_0x0283:
            r2.A0f = r0
            java.lang.String r0 = r8.A0W
            r2.A0j = r0
            if (r11 == 0) goto L_0x0345
            java.net.URL r0 = r8.A0Z
            if (r0 == 0) goto L_0x0342
            java.lang.String r0 = r0.toString()
        L_0x0293:
            r2.A0g = r0
            if (r11 == 0) goto L_0x0299
            java.lang.String r1 = r8.A0V
        L_0x0299:
            r2.A0e = r1
            if (r5 == 0) goto L_0x032f
            int r0 = r5.A03
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r2.A0V = r0
            long r0 = r5.A07
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r0, r3)
            r2.A0X = r0
            java.lang.String r0 = r5.A0D
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            long r3 = r0.getMostSignificantBits()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r3 = r3 & r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.A0U = r0
        L_0x02c7:
            java.lang.Float r1 = r8.A0K
            if (r1 == 0) goto L_0x02e1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r1.floatValue()
            float r1 = X.C90494aF.A01(r0, r3)
            r0 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e1
            double r0 = (double) r3
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A08 = r0
        L_0x02e1:
            java.lang.String r0 = r7.A0F
            java.lang.String r4 = r7.A0L
            int r0 = r6.A0D(r0, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0F = r0
            boolean r0 = r8.A0a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            long r0 = r8.A09
            java.lang.Double r0 = X.C90524aI.A0Z(r0)
            r2.A09 = r0
            long r0 = r8.A0A
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0R = r0
            boolean r0 = r7.A0W
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A03 = r0
            X.0yW r3 = r6.A0E
            boolean r0 = X.C25161Ff.A00(r4)
            if (r0 == 0) goto L_0x032b
            X.0yC r1 = r6.A0D
            r0 = 2810(0xafa, float:3.938E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x032b
            X.0u5 r0 = X.C25161Ff.A05
            r3.Blx(r2, r0)
        L_0x0326:
            r3.BP7()
            goto L_0x00b1
        L_0x032b:
            r3.Bly(r2)
            goto L_0x0326
        L_0x032f:
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
            r2.A0b = r0
            r2.A0V = r0
            r2.A0U = r0
            java.lang.Long r0 = r2.A0c
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r0, r3)
            r2.A0X = r0
            goto L_0x02c7
        L_0x0342:
            r0 = 0
            goto L_0x0293
        L_0x0345:
            r0 = r1
            goto L_0x0293
        L_0x0348:
            r0 = r1
            goto L_0x0283
        L_0x034b:
            r0 = 2
            r1 = 2
            if (r11 == r13) goto L_0x0206
            r1 = 3
            if (r11 == r0) goto L_0x0206
            if (r11 == r1) goto L_0x0206
            r1 = 1
            goto L_0x0206
        L_0x0357:
            long r11 = r8.A0f
            java.lang.Long r0 = X.C90504aG.A0h(r0, r11)
            goto L_0x01e7
        L_0x035f:
            r0 = 3
            if (r12 != r0) goto L_0x01b1
            r0 = 4468(0x1174, float:6.261E-42)
            boolean r0 = r14.A0E(r0)
            if (r0 == 0) goto L_0x01b1
        L_0x036a:
            int r0 = r1.A00
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r2.A0S = r0
            int r0 = r1.A01
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r2.A0T = r0
            goto L_0x01b1
        L_0x037c:
            r16 = -1
            goto L_0x0162
        L_0x0380:
            r0 = 0
            goto L_0x013b
        L_0x0383:
            r0 = 3
            goto L_0x0104
        L_0x0387:
            int r0 = r0.A01
            goto L_0x00e1
        L_0x038b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101334xN.A04(X.6Wx, X.4xN):void");
    }

    public static void A06(C101334xN r6) {
        File file = r6.A03;
        if (file != null) {
            synchronized (file) {
                if (file.exists() && file.length() == 0) {
                    A09(r6.A0B, file);
                }
            }
        }
    }

    private void A08(File file) {
        C20810yC r2 = this.A0U;
        int i = this.A0f.A04;
        long length = file.length();
        if (i == 7 && length < C36441kJ.A0B(r2, 6736) * 1024) {
            try {
                List A002 = C200709i5.A00(this.A13.A01(Uri.fromFile(file)));
                if (A002 != null) {
                    C129166Fp r1 = this.A0e;
                    Integer valueOf = Integer.valueOf(A002.size());
                    synchronized (r1) {
                        r1.A05 = valueOf;
                    }
                }
            } catch (IOException e) {
                Log.e("vcardloader/splitvcards/exception", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c4, code lost:
        if (r4 == 2) goto L_0x01c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02c3 A[SYNTHETIC, Splitter:B:118:0x02c3] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0634  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0F() {
        /*
            r33 = this;
            r0 = r33
            boolean r1 = r0.A11
            if (r1 == 0) goto L_0x0128
            X.68C r15 = r0.A0f
            java.lang.String r14 = r15.A0L
            r13 = 0
            r2 = 0
            if (r14 != 0) goto L_0x001b
            java.lang.String r0 = "MediaDownload/call/expressPathDownload download url is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 8
        L_0x0015:
            X.6Wx r1 = new X.6Wx
            r1.<init>(r0, r2, r13)
            return r1
        L_0x001b:
            java.lang.String r11 = r15.A0G
            if (r11 != 0) goto L_0x0027
            java.lang.String r0 = "MediaDownload/call/expressPathDownload enc hash is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 27
            goto L_0x0015
        L_0x0027:
            java.io.File r1 = r15.A0D
            r24 = r1
            X.C18740tg.A06(r24)
            boolean r1 = r24.exists()
            if (r1 != 0) goto L_0x0043
            boolean r1 = r24.createNewFile()
            if (r1 != 0) goto L_0x0043
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "MediaDownload/create unable to create encrypted file; mediaEncHash="
            X.C36321k7.A1R(r1, r11, r2)
        L_0x0043:
            android.os.ConditionVariable r2 = r0.A09
            if (r2 == 0) goto L_0x004e
            boolean r1 = r0.A15
            if (r1 != 0) goto L_0x004e
            r2.block()
        L_0x004e:
            r0.A0G()
            X.0wx r1 = r0.A0Q
            r18 = r1
            long r7 = r18.A01()
            long r9 = r18.A03()
            long r5 = r15.A07
            r16 = 16
            long r1 = r5 % r16
            long r3 = r5 - r1
            long r3 = r3 + r16
            r1 = 10
            long r3 = r3 + r1
            long r5 = r5 + r3
            r3 = 32000000(0x1e84800, double:1.58101007E-316)
            X.0yC r12 = r0.A0U
            r1 = 1291(0x50b, float:1.809E-42)
            int r1 = r12.A07(r1)
            long r1 = X.C90504aG.A0E(r1)
            long r2 = java.lang.Math.max(r3, r1)
            long r2 = r2 + r5
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00a3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MediaDownload/call/nospace total: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " free: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " need: "
            X.C36341k9.A1M(r0, r1, r5)
            r13 = 4
        L_0x009d:
            X.6Wx r1 = new X.6Wx
            r1.<init>(r13)
            return r1
        L_0x00a3:
            X.1DF r2 = r0.A0T     // Catch:{ Exception -> 0x00ba }
            X.1CR r1 = r0.A0n     // Catch:{ Exception -> 0x00ba }
            X.2bU r1 = X.AnonymousClass6YC.A05(r2, r15, r1)     // Catch:{ Exception -> 0x00ba }
            X.C18740tg.A06(r1)     // Catch:{ Exception -> 0x00ba }
            X.3Qj r1 = X.AnonymousClass2bU.A00(r1)     // Catch:{ Exception -> 0x00ba }
            java.io.File r1 = r1.A0I     // Catch:{ Exception -> 0x00ba }
            X.C18740tg.A06(r1)     // Catch:{ Exception -> 0x00ba }
            if (r1 == 0) goto L_0x00bf
            goto L_0x009d
        L_0x00ba:
            java.lang.String r1 = "MediaDownload/call/unable to find existing file."
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x00bf:
            r0.A0G()
            X.0wo r3 = r0.A0O
            X.0ww r7 = r0.A0F
            X.1BS r6 = r0.A0m
            X.1BV r4 = r0.A0W
            X.1Gl r1 = r15.A0A
            X.6Fk r5 = r0.A0j
            X.64M r23 = A02(r0)
            X.5Bx r2 = new X.5Bx
            r19 = r4
            r20 = r5
            r21 = r1
            r22 = r6
            r25 = r14
            r14 = r2
            r15 = r7
            r16 = r3
            r17 = r18
            r18 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.7r7 r1 = new X.7r7
            r1.<init>(r0, r13)
            r2.B0M(r1)
            java.lang.Object r1 = r0.A0x
            monitor-enter(r1)
            r0.A02 = r2     // Catch:{ all -> 0x0125 }
            monitor-exit(r1)     // Catch:{ all -> 0x0125 }
            X.5mC r4 = r2.A02()
            boolean r1 = r5 instanceof X.C104875Bu
            if (r1 == 0) goto L_0x011c
            X.0yV r2 = X.C21000yV.A01
            r1 = 7201(0x1c21, float:1.0091E-41)
            boolean r1 = X.C20800yB.A01(r2, r12, r1)
            if (r1 == 0) goto L_0x011c
            X.66Q r10 = r0.A0b
            X.5Bu r5 = (X.C104875Bu) r5
            long r12 = r5.A0D()
            long r14 = r24.length()
            long r16 = X.C19970wo.A00(r3)
            r10.A00(r11, r12, r14, r16)
        L_0x011c:
            r24.getCanonicalPath()
            r24.length()
            X.6Wx r1 = r4.A00
            return r1
        L_0x0125:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0125 }
            throw r0
        L_0x0128:
            X.68C r2 = r0.A0f
            java.lang.String r1 = r2.A0H
            r19 = r1
            r15 = 0
            if (r1 != 0) goto L_0x01a8
            java.lang.String r1 = "MediaDownload/call/media hash is null"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            r4 = 28
        L_0x0138:
            r3 = 0
            X.6Wx r1 = new X.6Wx
            r1.<init>(r4, r15, r3)
        L_0x013e:
            X.0wo r6 = r0.A0O
            X.C19970wo.A00(r6)
            boolean r3 = r1.A03()
            if (r3 == 0) goto L_0x0634
            r0.A03(r1)
            X.6Fp r8 = r0.A0e
            java.io.File r3 = r0.A03
            long r3 = r3.length()
            r8.A0C(r3)
            X.6Fc r7 = r0.A0q
            if (r7 == 0) goto L_0x015f
            r3 = 2
            r7.A05(r3)
        L_0x015f:
            boolean r3 = r2.A0Z
            if (r3 != 0) goto L_0x018f
            int r4 = r8.A00()
            r3 = 1
            if (r4 == r3) goto L_0x018f
            int r4 = r8.A00()
            r3 = 3
            if (r4 != r3) goto L_0x0176
            java.lang.String r3 = "MediaDownload/updateMessageAfterExecution/keeping suspicious download file"
            com.whatsapp.util.Log.i((java.lang.String) r3)
        L_0x0176:
            java.io.File r4 = r1.A02
            if (r4 == 0) goto L_0x019f
            r4.getAbsolutePath()
            java.io.File r3 = r0.A03
            r3.getAbsolutePath()
            java.io.File r3 = r0.A03
            r3.getAbsolutePath()
            r8.A0E(r4)
            java.io.File r0 = r0.A03
            r0.delete()
        L_0x018f:
            if (r7 == 0) goto L_0x0637
            java.io.File r0 = r8.A03()
            r7.A07(r0)
            r0 = 3
            r7.A05(r0)
            monitor-enter(r7)
            goto L_0x061f
        L_0x019f:
            java.io.File r5 = r0.A03
            java.lang.String r4 = r1.A03
            r3 = 0
            A07(r0, r8, r5, r4, r3)
            goto L_0x018f
        L_0x01a8:
            java.io.File r1 = r2.A0C
            X.C18740tg.A06(r1)
            r0.A03 = r1
            X.6Fk r8 = r0.A0j
            X.1D4 r1 = r0.A0Z
            r32 = r1
            r3 = 1
            java.lang.Float r1 = r1.A01(r3)
            r8.A0K = r1
            int r4 = r2.A02
            r1 = 3
            if (r4 == r1) goto L_0x01c6
            r1 = 2
            r18 = 0
            if (r4 != r1) goto L_0x01c8
        L_0x01c6:
            r18 = 1
        L_0x01c8:
            r16 = 0
            if (r18 == 0) goto L_0x01e9
            X.6Fc r4 = r0.A0q
            java.io.File r1 = r0.A03
            r4.A07(r1)
            r4.A05(r3)
            java.io.File r1 = r0.A03
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x058e
            java.io.File r1 = r0.A03
            boolean r1 = r1.createNewFile()
            if (r1 != 0) goto L_0x01e9
            X.C110995bZ.A00(r19)
        L_0x01e9:
            int r1 = r0.A14
            if (r1 == 0) goto L_0x0244
            android.os.ConditionVariable r4 = r0.A09
            if (r4 == 0) goto L_0x01f8
            boolean r1 = r0.A15
            if (r1 != 0) goto L_0x01f8
            r4.block()
        L_0x01f8:
            r0.A0G()
            X.0wx r1 = r0.A0Q
            long r6 = r1.A01()
            long r13 = r1.A03()
            long r4 = r2.A07
            r11 = 32000000(0x1e84800, double:1.58101007E-316)
            X.0yC r9 = r0.A0U
            r1 = 1291(0x50b, float:1.809E-42)
            int r1 = r9.A07(r1)
            long r9 = X.C90504aG.A0E(r1)
            long r9 = java.lang.Math.max(r11, r9)
            boolean r1 = r2.A0Z
            if (r1 != 0) goto L_0x0244
            long r9 = r9 + r4
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x0244
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "MediaDownload/call/nospace total: "
            r3.append(r1)
            r3.append(r13)
            java.lang.String r1 = " free: "
            r3.append(r1)
            r3.append(r6)
            java.lang.String r1 = " need: "
            X.C36341k9.A1M(r1, r3, r4)
            r3 = 4
        L_0x023d:
            X.6Wx r1 = new X.6Wx
            r1.<init>(r3)
            goto L_0x013e
        L_0x0244:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r8.A08 = r4
            r1 = 0
            r8.A03 = r1
            X.1D5 r1 = r0.A0Y
            r31 = r1
            java.lang.String r5 = r2.A0I
            int r1 = r0.A14
            boolean r7 = X.AnonymousClass000.A1Q(r1)
            boolean r6 = r2.A0Z
            if (r5 == 0) goto L_0x0281
            r1 = r31
            X.1DE r4 = r1.A0H
            r1 = 1
            if (r6 == 0) goto L_0x0265
            r1 = 3
        L_0x0265:
            X.5z2 r4 = r4.A03(r5, r1)
            if (r4 == 0) goto L_0x0281
            if (r7 == 0) goto L_0x0273
            int r1 = r4.A03
            int r1 = r1 + 1
            r4.A03 = r1
        L_0x0273:
            r0.A01 = r4
            java.lang.String r4 = r4.A0D
            boolean r1 = r4.equals(r5)
            if (r1 != 0) goto L_0x02a0
            X.6Fp r1 = r0.A0e
            monitor-enter(r1)
            goto L_0x028e
        L_0x0281:
            r1 = r31
            X.1DE r4 = r1.A0H
            r1 = 1
            if (r6 == 0) goto L_0x0289
            r1 = 3
        L_0x0289:
            X.5z2 r4 = r4.A02(r5, r1)
            goto L_0x0273
        L_0x028e:
            r1.A0D = r4     // Catch:{ all -> 0x063b }
            monitor-exit(r1)
            X.5z2 r1 = r0.A01
            java.lang.String r4 = r1.A0D
            X.1Hk r1 = r0.A0N
            r1.A04(r4)
            X.5z2 r1 = r0.A01
            int r1 = r1.A02
            r8.A04 = r1
        L_0x02a0:
            X.0wo r1 = r0.A0O
            r30 = r1
            long r4 = android.os.SystemClock.elapsedRealtime()
            X.1BS r1 = r0.A0m
            r28 = r1
            r28.A0D()
            java.lang.Long r1 = X.C90494aF.A0V(r4)
            r8.A0S = r1
            r0.A0G()
            X.0wg r4 = r0.A0k
            X.0y0 r1 = r0.A0B
            r29 = r1
            X.AnonymousClass1GW.A0P(r1, r4)
            if (r6 == 0) goto L_0x02ee
            int r4 = r2.A05     // Catch:{ Exception -> 0x03b3 }
            r1 = 9
            if (r4 != r1) goto L_0x02ee
            java.lang.String r4 = r2.A0F     // Catch:{ Exception -> 0x03b3 }
            if (r4 == 0) goto L_0x02ee
            r1 = r29
            java.io.File r10 = r1.A0Z(r4)     // Catch:{ Exception -> 0x03b3 }
            long r4 = r10.length()     // Catch:{ Exception -> 0x03b3 }
            int r1 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x02ee
            java.lang.String r1 = r10.getAbsolutePath()     // Catch:{ Exception -> 0x03b3 }
            java.lang.String r11 = X.AnonymousClass6YY.A07(r1)     // Catch:{ Exception -> 0x03b3 }
            r12 = 0
            X.6Wx r1 = new X.6Wx     // Catch:{ Exception -> 0x03b3 }
            r13 = 0
            r14 = 1
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x03b3 }
            goto L_0x013e
        L_0x02ee:
            X.0wN r7 = r0.A0A     // Catch:{ Exception -> 0x03b3 }
            X.1DF r4 = r0.A0T     // Catch:{ Exception -> 0x03b3 }
            X.1CR r1 = r0.A0n     // Catch:{ Exception -> 0x03b3 }
            X.2bU r1 = X.AnonymousClass6YC.A05(r4, r2, r1)     // Catch:{ Exception -> 0x03b3 }
            X.C18740tg.A06(r1)     // Catch:{ Exception -> 0x03b3 }
            X.3Qj r5 = X.AnonymousClass2bU.A00(r1)     // Catch:{ Exception -> 0x03b3 }
            java.io.File r4 = r5.A0I     // Catch:{ Exception -> 0x03b3 }
            X.C18740tg.A06(r4)     // Catch:{ Exception -> 0x03b3 }
            if (r4 == 0) goto L_0x03b8
            X.C110995bZ.A00(r19)
            r4.getAbsolutePath()
            X.0yW r9 = r0.A0V
            X.1GJ r3 = r0.A0i
            X.6Fp r6 = r0.A0e
            X.1AV r1 = r0.A0G
            X.1B0 r8 = r0.A0p
            r20 = r29
            r21 = r1
            r22 = r9
            r23 = r0
            r24 = r6
            r25 = r2
            r26 = r3
            r27 = r8
            r28 = r4
            X.AnonymousClass6YC.A0B(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.6Fc r1 = r0.A0q
            if (r1 == 0) goto L_0x0360
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()
            X.C18740tg.A06(r19)
            r9 = 47
            r3 = 45
            r1 = r19
            java.lang.String r1 = r1.replace(r9, r3)
            r10.append(r1)
            java.lang.String r1 = ".chk.tmp"
            java.lang.String r3 = X.AnonymousClass000.A0q(r1, r10)
            r1 = r29
            java.io.File r3 = r1.A0X(r3)
            boolean r1 = r3.exists()
            if (r1 == 0) goto L_0x0360
            boolean r1 = r3.delete()
            if (r1 != 0) goto L_0x0360
            java.lang.String r1 = "MediaDownload/call/unable to delete chunk store file on file hash match"
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x0360:
            X.1Gl r9 = r2.A0A
            boolean r3 = r2.A0Y
            boolean r1 = X.AnonymousClass1Ax.A04(r9)
            if (r1 != 0) goto L_0x0378
            boolean r1 = X.AnonymousClass6Y1.A07(r9)
            if (r1 != 0) goto L_0x0378
            boolean r1 = X.AnonymousClass6Y1.A04(r9)
            if (r1 == 0) goto L_0x039e
            if (r3 == 0) goto L_0x039e
        L_0x0378:
            X.1Gu r3 = r0.A0r
            X.1Gs r1 = r0.A0t
            r5 = r7
            r7 = r2
            r9 = r3
            r10 = r1
            r11 = r4
            X.AnonymousClass6YC.A0A(r5, r6, r7, r8, r9, r10, r11)
            r0.A0H()
        L_0x0387:
            r0.A08(r4)
            java.lang.String r1 = r4.getAbsolutePath()
            java.lang.String r5 = X.AnonymousClass6YY.A07(r1)
            r6 = 34
            r7 = 0
            X.6Wx r1 = new X.6Wx
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x013e
        L_0x039e:
            int r1 = r5.A02
            monitor-enter(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0654 }
            r6.A07 = r1     // Catch:{ all -> 0x0654 }
            monitor-exit(r6)
            int r1 = r5.A03
            monitor-enter(r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0654 }
            r6.A08 = r1     // Catch:{ all -> 0x0654 }
            monitor-exit(r6)
            goto L_0x0387
        L_0x03b3:
            java.lang.String r1 = "MediaDownload/call/unable to find existing file."
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x03b8:
            java.io.File r1 = r0.A03
            long r4 = r1.length()
            r8.A07 = r4
            java.io.File r13 = r2.A0D
            java.lang.String r1 = r2.A0G
            if (r13 == 0) goto L_0x045d
            long r5 = r13.length()
            int r4 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x045d
            if (r1 == 0) goto L_0x045d
            X.0yC r10 = r0.A0U
            X.0yV r7 = X.C21000yV.A01
            r4 = 1539(0x603, float:2.157E-42)
            boolean r4 = X.C20800yB.A01(r7, r10, r4)
            if (r4 == 0) goto L_0x045d
            X.66Q r6 = r0.A0b
            monitor-enter(r6)
            X.1DD r4 = r6.A01     // Catch:{ all -> 0x0654 }
            X.1M0 r11 = r4.get()     // Catch:{ all -> 0x0654 }
            X.14e r12 = r11.A02     // Catch:{ all -> 0x064a }
            java.lang.String r9 = "SELECT + enc_file_hash, ep_saved_time_ms, ep_saved_bytes, enc_file_restored, last_update_time FROM express_path_download_data WHERE enc_file_hash=?"
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch:{ all -> 0x064a }
            r4 = 0
            r5[r4] = r1     // Catch:{ all -> 0x064a }
            java.lang.String r4 = "ExpressPathDownloadDataStore/get"
            android.database.Cursor r4 = r12.A09(r9, r4, r5)     // Catch:{ all -> 0x064a }
            boolean r5 = r4.moveToLast()     // Catch:{ all -> 0x063e }
            if (r5 == 0) goto L_0x0431
            java.lang.String r5 = "ep_saved_time_ms"
            int r14 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x063e }
            java.lang.String r5 = "ep_saved_bytes"
            int r12 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x063e }
            java.lang.String r5 = "last_update_time"
            int r9 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x063e }
            java.lang.String r5 = "enc_file_restored"
            int r5 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x063e }
            long r22 = r4.getLong(r14)     // Catch:{ all -> 0x063e }
            long r24 = r4.getLong(r12)     // Catch:{ all -> 0x063e }
            long r26 = r4.getLong(r9)     // Catch:{ all -> 0x063e }
            X.C224014d.A03(r4, r5)     // Catch:{ all -> 0x063e }
            X.63Z r9 = new X.63Z     // Catch:{ all -> 0x063e }
            r20 = r9
            r21 = r1
            r20.<init>(r21, r22, r24, r26)     // Catch:{ all -> 0x063e }
            r4.close()     // Catch:{ all -> 0x064a }
            r11.close()     // Catch:{ all -> 0x0654 }
            goto L_0x0439
        L_0x0431:
            r4.close()     // Catch:{ all -> 0x064a }
            r11.close()     // Catch:{ all -> 0x0654 }
            monitor-exit(r6)
            goto L_0x045d
        L_0x0439:
            monitor-exit(r6)
            r8.A0a = r3
            long r4 = r9.A01
            r8.A0A = r4
            long r4 = r9.A00
            r8.A09 = r4
            if (r18 == 0) goto L_0x044e
            r4 = 7020(0x1b6c, float:9.837E-42)
            boolean r4 = X.C20800yB.A01(r7, r10, r4)
            if (r4 != 0) goto L_0x045d
        L_0x044e:
            boolean r4 = r6.A01(r1)
            if (r4 != 0) goto L_0x045d
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "MediaDownload/download failed to delete EP gain metric in DB with encHash: "
            X.C36321k7.A1P(r4, r1, r5)
        L_0x045d:
            r0.A0G()
            if (r1 == 0) goto L_0x0469
            byte[] r4 = r2.A0d
            if (r4 != 0) goto L_0x0469
            r4 = 5
            goto L_0x0138
        L_0x0469:
            java.lang.Boolean r4 = r31.A05()
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x04f5
            if (r18 != 0) goto L_0x04f5
            int r4 = r0.A14
            if (r4 == r3) goto L_0x047d
            int r4 = r0.A14
            if (r4 != 0) goto L_0x04f5
        L_0x047d:
            java.lang.String r3 = "MediaDownload/download media using native API's"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.1D7 r4 = r0.A0v
            X.5u3 r3 = new X.5u3
            r3.<init>(r0, r4)
            X.1Gl r4 = r2.A0A
            int r25 = X.C111945d6.A00(r4)
            int r4 = r0.A14
            boolean r26 = X.AnonymousClass000.A1P(r4)
            X.C18740tg.A06(r13)
            r4 = 2
            byte[] r23 = android.util.Base64.decode(r1, r4)
            r1 = r19
            byte[] r24 = android.util.Base64.decode(r1, r4)
            X.5yq r4 = r28.A0B()
            r1 = r30
            java.lang.String r20 = X.AnonymousClass6HI.A00(r1, r4)
            X.C18740tg.A06(r20)
            java.lang.String r21 = r2.toString()
            java.lang.String r17 = r13.getPath()
            java.io.File r1 = r0.A03
            java.lang.String r18 = r1.getPath()
            java.lang.String r4 = r2.A0F
            byte[] r1 = r2.A0d
            X.C18740tg.A06(r1)
            X.654 r5 = new X.654
            r19 = r4
            r22 = r1
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = 0
            X.7pU r1 = new X.7pU
            r1.<init>(r5, r3, r3, r4)
            r3.A00 = r1
            java.lang.Object r1 = X.AnonymousClass3PM.A00(r1)
            X.6Wx r1 = (X.C133136Wx) r1
            if (r1 != 0) goto L_0x04e7
            r3 = 17
            X.6Wx r1 = new X.6Wx
            r1.<init>(r3, r15, r4)
        L_0x04e7:
            X.C19970wo.A00(r30)
            if (r1 != 0) goto L_0x0598
            java.lang.String r1 = "MediaDownload/call/didn't get a selected route"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            r3 = 11
            goto L_0x023d
        L_0x04f5:
            int r4 = r2.A03
            r6 = 2
            if (r4 != r6) goto L_0x0502
            java.lang.String r4 = r2.A0L
            if (r4 != 0) goto L_0x0529
            r3 = 8
            goto L_0x023d
        L_0x0502:
            X.1Gl r4 = r2.A0A
            java.lang.String r5 = r4.A02
            boolean r4 = X.AnonymousClass6Y1.A06(r4)
            if (r4 != 0) goto L_0x050e
            r19 = r1
        L_0x050e:
            java.lang.String r4 = r2.A0F
            int r1 = r0.A14
            if (r1 == 0) goto L_0x0515
            r6 = 1
        L_0x0515:
            X.C18740tg.A0C(r3)
            r21 = 0
            r16 = r28
            r17 = r5
            r18 = r19
            r19 = r4
            r20 = r6
            X.620 r1 = X.AnonymousClass1BS.A00(r16, r17, r18, r19, r20, r21)
            goto L_0x055e
        L_0x0529:
            X.6yj r6 = new X.6yj
            r6.<init>(r4)
            android.net.Uri r5 = android.net.Uri.parse(r4)
            java.lang.String r4 = "category"
            java.lang.String r5 = r5.getQueryParameter(r4)
            java.lang.String r4 = "PSA"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0587
            X.0yC r5 = r0.A0U
            r4 = 2037(0x7f5, float:2.854E-42)
            boolean r4 = r5.A0E(r4)
            if (r4 == 0) goto L_0x0587
            X.1Gl r4 = r2.A0A
            java.lang.String r4 = r4.A02
            r20 = 1
            r21 = 1
            r16 = r28
            r17 = r4
            r18 = r1
            r19 = r15
            X.620 r1 = X.AnonymousClass1BS.A00(r16, r17, r18, r19, r20, r21)
        L_0x055e:
            r0.A00 = r1
            boolean r1 = r2.A0N
            if (r1 == 0) goto L_0x056d
            r0.A16 = r3
            X.7hU r4 = r0.A0l
            r1 = r28
            r1.registerObserver(r4)
        L_0x056d:
            X.620 r4 = r0.A00
            X.6jc r1 = new X.6jc
            r1.<init>(r0, r13, r3)
            java.lang.Object r1 = r4.A00(r1)
            X.6Wx r1 = (X.C133136Wx) r1
            X.620 r3 = r0.A00
            java.util.concurrent.atomic.AtomicInteger r3 = r3.A01
            int r3 = r3.get()
            long r3 = (long) r3
            r8.A0D = r3
            goto L_0x04e7
        L_0x0587:
            r1 = r28
            X.620 r1 = r1.A0A(r6, r3)
            goto L_0x055e
        L_0x058e:
            java.lang.System.currentTimeMillis()
            java.io.File r1 = r0.A03
            r1.lastModified()
            goto L_0x01e9
        L_0x0598:
            boolean r3 = r1.A03()
            if (r3 == 0) goto L_0x05ea
            X.1Gl r3 = r8.A0g
            long r9 = r8.A05()
            long r11 = r8.A02()
            r8 = 1
            r6 = r32
            r7 = r3
            r6.A02(r7, r8, r9, r11)
            X.C19970wo.A00(r30)
            X.0wN r9 = r0.A0A
            X.0yW r10 = r0.A0V
            X.1GJ r5 = r0.A0i
            X.6Fp r8 = r0.A0e
            X.1AV r4 = r0.A0G
            X.1B0 r7 = r0.A0p
            java.io.File r3 = r0.A03
            r6 = 13
            r16 = r29
            r17 = r4
            r18 = r10
            r19 = r0
            r20 = r8
            r21 = r2
            r22 = r5
            r23 = r7
            r24 = r3
            X.AnonymousClass6YC.A0B(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.C19970wo.A00(r30)
            java.util.concurrent.FutureTask r3 = r0.A02
            boolean r3 = r3.isCancelled()
            if (r3 == 0) goto L_0x05ed
            r3 = 0
            X.6Wx r1 = new X.6Wx
            r1.<init>(r6, r15, r3)
            goto L_0x013e
        L_0x05ea:
            r6 = 13
            goto L_0x060f
        L_0x05ed:
            X.1Gu r5 = r0.A0r
            X.1Gs r4 = r0.A0t
            java.io.File r3 = r0.A03
            r18 = r2
            r19 = r7
            r20 = r5
            r21 = r4
            r22 = r3
            r16 = r9
            r17 = r8
            X.AnonymousClass6YC.A0A(r16, r17, r18, r19, r20, r21, r22)
            X.C19970wo.A00(r30)
            java.io.File r3 = r0.A03
            r0.A08(r3)
            X.C19970wo.A00(r30)
        L_0x060f:
            java.util.concurrent.FutureTask r3 = r0.A02
            boolean r3 = r3.isCancelled()
            if (r3 == 0) goto L_0x013e
            r3 = 0
            X.6Wx r1 = new X.6Wx
            r1.<init>(r6, r15, r3)
            goto L_0x013e
        L_0x061f:
            java.util.List r0 = r7.A0G     // Catch:{ all -> 0x0631 }
            r0.clear()     // Catch:{ all -> 0x0631 }
            monitor-exit(r7)
            r7.A03()
            java.io.File r0 = r2.A0D
            X.C18740tg.A06(r0)
            r0.delete()
            goto L_0x0637
        L_0x0631:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0634:
            A05(r1, r0, r15)
        L_0x0637:
            X.C19970wo.A00(r6)
            return r1
        L_0x063b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x063e:
            r1 = move-exception
            if (r4 == 0) goto L_0x0649
            r4.close()     // Catch:{ all -> 0x0645 }
            goto L_0x0649
        L_0x0645:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x064a }
        L_0x0649:
            throw r1     // Catch:{ all -> 0x064a }
        L_0x064a:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x064f }
            goto L_0x0653
        L_0x064f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0654 }
        L_0x0653:
            throw r1     // Catch:{ all -> 0x0654 }
        L_0x0654:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101334xN.A0F():java.lang.Object");
    }

    public void A0H() {
        byte[] A0H2 = this.A0e.A0H();
        if (A0H2 != null) {
            this.A0M.A04(A0H2);
        } else if (this.A0U.A0E(2959) || this.A0f.A05 == 53) {
            this.A0M.A04(new byte[0]);
        }
    }

    public void A0I(long j) {
        this.A0L.A04(Long.valueOf(j));
    }

    public void A0J(C133136Wx r5) {
        C129166Fp r2 = this.A0e;
        C110995bZ.A01(this.A0f);
        r2.toString();
        this.A0H.A04(r2.A02());
        LinkedList linkedList = this.A0y;
        synchronized (linkedList) {
            C129166Fp A022 = r2.A02();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((C160107kT) it.next()).BW7(r5, A022);
            }
            linkedList.clear();
        }
    }

    public void B0M(C160107kT r3) {
        LinkedList linkedList = this.A0y;
        synchronized (linkedList) {
            linkedList.add(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r3 == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B2X(boolean r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x0005
            r12.A0E()
        L_0x0005:
            X.68C r5 = r12.A0f
            java.lang.String r4 = r5.A0H
            X.C110995bZ.A00(r4)
            java.lang.Object r2 = r12.A0x
            monitor-enter(r2)
            X.5Bx r1 = r12.A02     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0017
            r0 = 1
            X.AnonymousClass75I.A00(r1, r0)     // Catch:{ all -> 0x0071 }
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
            r12.cancel()
            X.6Fp r2 = r12.A0e
            java.lang.Boolean r0 = r2.A04()
            r10 = 0
            if (r0 == 0) goto L_0x0053
            java.lang.Boolean r0 = r2.A04()
            boolean r3 = r0.booleanValue()
            if (r3 != 0) goto L_0x004f
        L_0x002e:
            r7 = 0
            r9 = 13
            X.6Wx r6 = new X.6Wx
            r11 = 0
            r8 = r7
            r6.<init>(r7, r8, r9, r10, r11)
            int r0 = r5.A01
            r2.A0D(r6, r0, r10)
            r2.A05()
            X.C110995bZ.A00(r4)
            r2.toString()
            X.1Hk r1 = r12.A0H
            X.6Fp r0 = r2.A02()
            r1.A04(r0)
        L_0x004f:
            java.util.LinkedList r2 = r12.A0y
            monitor-enter(r2)
            goto L_0x0055
        L_0x0053:
            r3 = 0
            goto L_0x002e
        L_0x0055:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x006e }
        L_0x0059:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x006e }
            X.7kT r0 = (X.C160107kT) r0     // Catch:{ all -> 0x006e }
            r0.BW6(r3)     // Catch:{ all -> 0x006e }
            goto L_0x0059
        L_0x0069:
            r2.clear()     // Catch:{ all -> 0x006e }
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            return
        L_0x006e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006e }
            throw r0
        L_0x0071:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0071 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101334xN.B2X(boolean):void");
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof C101334xN)) {
            return 0;
        }
        long j = ((C101334xN) obj).A08;
        long j2 = this.A08;
        if (j < j2) {
            return -1;
        }
        if (j2 >= j) {
            return 0;
        }
        return 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(X.C133136Wx r6, X.C101334xN r7, java.lang.Runnable r8) {
        /*
            r7.A03(r6)
            X.6Fc r2 = r7.A0q
            r5 = 4
            if (r2 == 0) goto L_0x0022
            int r1 = r6.A01
            boolean r0 = X.C133136Wx.A02(r1)
            monitor-enter(r2)
            r2.A0C = r0     // Catch:{ all -> 0x001e }
            r2.A02 = r1     // Catch:{ all -> 0x001e }
            monitor-exit(r2)
            r2.A05(r5)
            monitor-enter(r2)
            java.util.List r0 = r2.A0G     // Catch:{ all -> 0x001e }
            r0.clear()     // Catch:{ all -> 0x001e }
            goto L_0x0021
        L_0x001e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0021:
            monitor-exit(r2)
        L_0x0022:
            X.0yC r1 = r7.A0U
            r0 = 6039(0x1797, float:8.462E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0053
            boolean r0 = X.C224714l.A02()
            if (r0 == 0) goto L_0x004f
            X.0wU r1 = r7.A0u
            r0 = 21
        L_0x0036:
            X.C1503074t.A00(r1, r7, r0)
        L_0x0039:
            int r1 = r6.A01
            r0 = 5
            if (r1 == r0) goto L_0x0044
            r0 = 12
            if (r1 == r0) goto L_0x0044
            if (r1 != r5) goto L_0x0049
        L_0x0044:
            X.6Fp r0 = r7.A0e
            r0.A05()
        L_0x0049:
            if (r8 == 0) goto L_0x004e
            r8.run()
        L_0x004e:
            return
        L_0x004f:
            A06(r7)
            goto L_0x0039
        L_0x0053:
            java.io.File r0 = r7.A03
            if (r0 == 0) goto L_0x0039
            long r3 = r0.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0039
            boolean r0 = X.C224714l.A02()
            if (r0 == 0) goto L_0x006c
            X.0wU r1 = r7.A0u
            r0 = 16
            goto L_0x0036
        L_0x006c:
            java.io.File r1 = r7.A03
            if (r1 == 0) goto L_0x0076
            X.0y0 r0 = r7.A0B
            A09(r0, r1)
            goto L_0x0039
        L_0x0076:
            java.lang.String r0 = "MediaDownload/deleteDownloadFileLegacyFlow/download file is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101334xN.A05(X.6Wx, X.4xN, java.lang.Runnable):void");
    }

    public static boolean A09(C20690y0 r2, File file) {
        File A0N2 = r2.A0N(file);
        if (A0N2.exists() && !A0N2.delete()) {
            C36321k7.A1L(A0N2, "MediaDownload/MMS failed to delete stream check success file ", AnonymousClass000.A0u());
        }
        return file.delete();
    }

    public void A0E() {
        super.A0E();
        this.A0L.A01();
        this.A0J.A01();
        this.A0M.A01();
        this.A0I.A01();
        this.A0H.A01();
        this.A0K.A01();
    }

    public C101334xN(ConditionVariable conditionVariable, C19700wN r11, C20690y0 r12, AnonymousClass17Y r13, AnonymousClass1DT r14, Mp4Ops mp4Ops, C20050ww r16, AnonymousClass1AV r17, C19970wo r18, C19630wG r19, C20060wx r20, AnonymousClass1BW r21, AnonymousClass1E3 r22, AnonymousClass1DF r23, C20810yC r24, C21010yW r25, AnonymousClass1BV r26, AnonymousClass1BU r27, AnonymousClass1D5 r28, AnonymousClass1D4 r29, C24811Dw r30, AnonymousClass66Q r31, AnonymousClass1DE r32, AnonymousClass1GO r33, AnonymousClass68C r34, C119695qI r35, Magi magi, AnonymousClass1GJ r37, C19890wg r38, AnonymousClass1BS r39, AnonymousClass1CR r40, WebpUtils webpUtils, AnonymousClass1B0 r42, C25561Gu r43, AnonymousClass1GX r44, AnonymousClass6ML r45, C25541Gs r46, C19770wU r47, AnonymousClass1YI r48, AnonymousClass1D7 r49, C21570zS r50, int i, int i2, long j, boolean z) {
        AnonymousClass6Fk r1;
        boolean z2 = true;
        C25721Hk A0I2 = C90524aI.A0I();
        this.A0I = A0I2;
        this.A0H = C90524aI.A0I();
        boolean z3 = false;
        this.A0l = new AnonymousClass6RP(this, 0);
        this.A0x = C36441kJ.A11();
        this.A0h = magi;
        this.A0O = r18;
        this.A0E = mp4Ops;
        this.A0U = r24;
        this.A0C = r13;
        this.A0P = r19;
        this.A0A = r11;
        this.A0u = r47;
        this.A0o = webpUtils;
        this.A0B = r12;
        this.A0F = r16;
        this.A0V = r25;
        this.A0v = r49;
        this.A13 = r48;
        this.A0Y = r28;
        this.A0Q = r20;
        this.A0R = r21;
        this.A0m = r39;
        this.A0r = r43;
        this.A0p = r42;
        this.A0D = r14;
        this.A0i = r37;
        this.A0t = r46;
        this.A12 = r44;
        this.A0w = r50;
        this.A0Z = r29;
        this.A0G = r17;
        this.A0n = r40;
        this.A0T = r23;
        this.A0c = r32;
        this.A0d = r33;
        this.A0s = r45;
        this.A0X = r27;
        this.A0S = r22;
        this.A0W = r26;
        this.A0k = r38;
        this.A0g = r35;
        this.A09 = conditionVariable;
        this.A0b = r31;
        AnonymousClass68C r7 = r34;
        this.A0f = r7;
        this.A14 = i;
        this.A0a = r30;
        int i3 = r7.A03;
        boolean A1S = AnonymousClass000.A1S(i3, 3);
        this.A11 = A1S;
        C25471Gl r5 = r7.A0A;
        int i4 = this.A14;
        if (A1S) {
            r1 = new C104875Bu(r5, i4);
        } else {
            AnonymousClass00C.A0D(r5, 1);
            r1 = new AnonymousClass6Fk(r5, i4);
        }
        this.A0j = r1;
        r1.A0b = AnonymousClass000.A1Q(i3);
        this.A15 = false;
        this.A08 = j;
        this.A07 = i2;
        this.A0e = new C129166Fp();
        int i5 = r7.A02;
        z3 = (i5 == 3 || i5 == 2) ? true : z3;
        C164977sg r0 = new C164977sg(this, 4);
        Executor executor = r13.A04;
        A0B(r0, executor);
        this.A00.A03(new C164977sg(this, 5), executor);
        this.A00.A03(new C164977sg(this, 6), executor);
        if (z3) {
            AnonymousClass6Fc r52 = new AnonymousClass6Fc();
            this.A0q = r52;
            long j2 = r7.A07;
            synchronized (r52) {
                r52.A04 = j2;
            }
        } else {
            this.A0q = null;
        }
        if (!(2 == this.A14 || 3 == this.A14)) {
            z2 = false;
        }
        A0I2.A04(new C596834w(z2, z3));
        this.A06 = z;
    }
}
