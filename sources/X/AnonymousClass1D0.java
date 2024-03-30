package X;

import android.os.SystemClock;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.1D0  reason: invalid class name */
public class AnonymousClass1D0 {
    public final C20690y0 A00;
    public final AnonymousClass17Y A01;
    public final C19600wD A02;
    public final C20810yC A03;
    public final C21010yW A04;
    public final C20840yF A05;
    public final AnonymousClass1D5 A06;
    public final AnonymousClass1DE A07;
    public final AnonymousClass1GO A08;
    public final C25161Ff A09;
    public final AnonymousClass1E1 A0A;
    public final AnonymousClass1GV A0B;
    public final AnonymousClass1D1 A0C;
    public final AnonymousClass1GN A0D;
    public final C24051Aw A0E;
    public final C19770wU A0F;
    public final Executor A0G;
    public final C19700wN A0H;
    public final C24041Av A0I;
    public final AnonymousClass1BW A0J;
    public final C25531Gr A0K;
    public final AnonymousClass1GJ A0L;

    public void A0B(C145166tS r16, C160447l1 r17, boolean z) {
        String str;
        byte[] bArr;
        C25471Gl r0;
        C145166tS r02 = r16;
        if (r16 != null && (str = r02.A0Z) != null && (bArr = r02.A0R) != null) {
            C20690y0 r3 = this.A00;
            String obj = UUID.randomUUID().toString();
            File file = r3.A08().A0Q;
            C20690y0.A07(file, false);
            C18740tg.A06(obj);
            File A022 = C20690y0.A02(file, obj);
            try {
                AnonymousClass6YY.A0I(A022, bArr);
                Pair A0B2 = AnonymousClass1GW.A0B(A022);
                AnonymousClass3L1 r1 = new AnonymousClass3L1();
                r1.A01 = ((Number) A0B2.second).intValue();
                r1.A00 = ((Number) A0B2.first).intValue();
                r1.A07 = A022.getName();
                C160447l1 r7 = r17;
                r7.BrF(r1, str);
                if (z) {
                    r0 = C25471Gl.A0W;
                } else {
                    r0 = C25471Gl.A0K;
                }
                C124995z9 A012 = AnonymousClass3M4.A01((C119765qQ) null, r0, A022, 1);
                C146496vh A023 = this.A06.A02(UUID.randomUUID().toString(), 0, 0, false);
                C131516Pj r10 = new C131516Pj(A00(A012), A023.A00, A012, new AnonymousClass3Ot(false, false, true));
                C132976Wa r12 = A023.A01;
                r12.A09(-1, 0, true);
                r12.A0B(r10.A04);
                long currentTimeMillis = System.currentTimeMillis();
                r7.BrH(A023, str);
                C101314xL A0A2 = this.A0D.A0A(A023, r10);
                A0A2.A0H.A03(new AnonymousClass70W(A0B2, r7, this, A023, r10, A022, str, currentTimeMillis), this.A0G);
            } catch (IOException e) {
                Log.w(String.format("MediaJobManager/writeLinkThumbnailFileAsLocalResource create thumbnail fail at %s.", new Object[]{A022}), e);
                AnonymousClass6YY.A0P(A022);
            }
        }
    }

    public static C159427jL A00(C124995z9 r2) {
        boolean z;
        C25471Gl r1 = r2.A06;
        if (AnonymousClass6Y1.A06(r1)) {
            z = r2.A0D;
        } else {
            z = r2.A0C;
        }
        if (z) {
            return new C144886sy(r1);
        }
        return new C144896sz(r1);
    }

    public static void A01(AnonymousClass1D0 r3, C146506vi r4, C124465yE r5) {
        r5.A02.A03(r4.A0Q, (Executor) null);
        r5.A03.A03(r4.A0R, (Executor) null);
        r5.A04.A03(new C164947sd(r3, r4, r5, 0), (Executor) null);
        r5.A01.A03(new C164987sh(r3, r4, 3), (Executor) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r4 != null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AnonymousClass1D0 r5, X.C146506vi r6, X.C122615v9 r7) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.A0V
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x001a
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x001b
            boolean r1 = r6.A08()
            r0 = 1
            if (r1 == 0) goto L_0x0017
            r0 = 32
        L_0x0017:
            r5.A04(r6, r0)
        L_0x001a:
            return
        L_0x001b:
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x005c
            byte[] r4 = r7.A03
            boolean r1 = r6.A07()
            X.5z9 r0 = r6.A02()
            if (r1 == 0) goto L_0x0056
            X.5BP r3 = new X.5BP
            r3.<init>(r6, r0)
        L_0x0030:
            X.65P r0 = r6.A03()
            X.1Gl r2 = r0.A08
            X.3Rg r0 = r6.A0O
            X.3Ot r0 = r0.A03
            boolean r1 = r0.A02
            X.5z9 r0 = r6.A02()
            int[] r0 = r0.A0H
            boolean r0 = r5.A0G(r2, r0, r1)
            if (r0 == 0) goto L_0x0054
            if (r4 == 0) goto L_0x004c
        L_0x004a:
            r6.A05 = r4
        L_0x004c:
            boolean r0 = r6.A04
            if (r0 != 0) goto L_0x005f
            r5.A0D(r6, r3)
            return
        L_0x0054:
            r4 = 0
            goto L_0x004a
        L_0x0056:
            X.6Pj r3 = new X.6Pj
            r3.<init>(r6, r0)
            goto L_0x0030
        L_0x005c:
            r0 = 20
            goto L_0x0017
        L_0x005f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "mediatranscodequeue/success/all-cancelled "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1D0.A02(X.1D0, X.6vi, X.5v9):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r3 == 0) goto L_0x005e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00e6 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0122 A[Catch:{ FileNotFoundException -> 0x0102, IOException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0123 A[Catch:{ FileNotFoundException -> 0x0102, IOException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0134 A[Catch:{ FileNotFoundException -> 0x0102, IOException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0154 A[Catch:{ FileNotFoundException -> 0x0102, IOException -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.AnonymousClass1D0 r13, X.C146506vi r14, X.C123865xD r15) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r2 = r14.A0W
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0017
            boolean r0 = r14.A08()
            if (r0 == 0) goto L_0x0018
            int r0 = r15.A00
            if (r0 == 0) goto L_0x0018
            r13.A04(r14, r0)
        L_0x0017:
            return
        L_0x0018:
            int r3 = r15.A00
            r0 = 12
            r7 = 0
            if (r3 != r0) goto L_0x0045
            X.6Pj r1 = r15.A01
            X.5z9 r0 = r1.A02
            X.1Gl r4 = r0.A06
            java.io.File r2 = r1.A01()
            X.6Fj r1 = r15.A02
            monitor-enter(r1)
            java.lang.String r0 = r1.A0B     // Catch:{ all -> 0x002f }
            goto L_0x0032
        L_0x002f:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0032:
            monitor-exit(r1)
            X.5v4 r1 = new X.5v4
            r1.<init>(r4, r2, r0, r7)
            X.1Gr r0 = r13.A0K
            X.5v5 r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x0045
            X.1Hk r0 = r14.A07
            r0.A04(r1)
        L_0x0045:
            java.lang.Object r6 = r14.A0U
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ all -> 0x021c }
            r1.<init>()     // Catch:{ all -> 0x021c }
            X.1Hk r0 = r14.A09     // Catch:{ all -> 0x021c }
            r0.A04(r1)     // Catch:{ all -> 0x021c }
            int r5 = r1.get()     // Catch:{ all -> 0x021c }
            boolean r0 = r15.A05     // Catch:{ all -> 0x021c }
            r2 = 1
            if (r0 == 0) goto L_0x005e
            r0 = 1
            if (r3 != 0) goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r5 <= 0) goto L_0x0170
            if (r0 != 0) goto L_0x0170
            X.6Pj r1 = r15.A01     // Catch:{ all -> 0x021c }
            java.io.File r0 = r1.A01()     // Catch:{ all -> 0x021c }
            A05(r0)     // Catch:{ all -> 0x021c }
            java.io.File r4 = r15.A03     // Catch:{ all -> 0x021c }
            A05(r4)     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x0088
            long r10 = r4.length()     // Catch:{ all -> 0x021c }
            java.io.File r0 = r1.A01()     // Catch:{ all -> 0x021c }
            long r8 = r0.length()     // Catch:{ all -> 0x021c }
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = "mediajobmanager/handleMediaUploadResponse/upload dedup with wrong size"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x021c }
        L_0x0088:
            X.1Av r11 = r13.A0I     // Catch:{ all -> 0x021c }
            java.io.File r10 = r1.A01()     // Catch:{ all -> 0x021c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x00a8
            boolean r0 = r4.exists()     // Catch:{ all -> 0x021c }
            if (r0 == 0) goto L_0x00a8
            X.5vB r0 = new X.5vB     // Catch:{ all -> 0x021c }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x021c }
        L_0x009f:
            android.util.Pair r4 = android.util.Pair.create(r8, r0)     // Catch:{ all -> 0x021c }
        L_0x00a3:
            java.lang.Object r8 = r4.second     // Catch:{ all -> 0x021c }
            X.5vB r8 = (X.C122635vB) r8     // Catch:{ all -> 0x021c }
            goto L_0x0120
        L_0x00a8:
            r4 = 0
            X.0y0 r9 = r11.A00     // Catch:{ IOException -> 0x0110 }
            boolean r0 = r9.A0h(r10)     // Catch:{ IOException -> 0x0110 }
            if (r0 != 0) goto L_0x010a
            java.lang.String r12 = r10.getCanonicalPath()     // Catch:{ IOException -> 0x0110 }
            X.3BP r0 = r9.A08()     // Catch:{ IOException -> 0x0110 }
            java.io.File r0 = r0.A08     // Catch:{ IOException -> 0x0110 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0110 }
            boolean r0 = r12.startsWith(r0)     // Catch:{ IOException -> 0x0110 }
            if (r0 != 0) goto L_0x010a
            X.5z9 r0 = r1.A02     // Catch:{ all -> 0x021c }
            X.1Gl r12 = r0.A06     // Catch:{ all -> 0x021c }
            int r1 = r0.A01     // Catch:{ all -> 0x021c }
            X.0wg r0 = r11.A04     // Catch:{ all -> 0x021c }
            java.io.File r1 = X.AnonymousClass1GW.A0F(r9, r0, r12, r10, r1)     // Catch:{ all -> 0x021c }
            boolean r0 = r9.A0i(r10)     // Catch:{ IOException -> 0x00e6 }
            if (r0 == 0) goto L_0x00e6
            X.1Ay r11 = r11.A02     // Catch:{ IOException -> 0x00e6 }
            java.lang.String r0 = r10.getAbsolutePath()     // Catch:{ IOException -> 0x00e6 }
            int r0 = r11.A00(r0)     // Catch:{ IOException -> 0x00e6 }
            int r0 = r0 + 1
            if (r0 != r5) goto L_0x00e6
            goto L_0x00ea
        L_0x00e6:
            r9.A0e(r10, r1)     // Catch:{ FileNotFoundException -> 0x0102, IOException -> 0x00f7 }
            goto L_0x00ed
        L_0x00ea:
            r9.A0f(r10, r1)     // Catch:{ FileNotFoundException -> 0x0102, IOException -> 0x00f7 }
        L_0x00ed:
            X.5vB r0 = new X.5vB     // Catch:{ FileNotFoundException -> 0x0102, IOException -> 0x00f7 }
            r0.<init>(r1, r7)     // Catch:{ FileNotFoundException -> 0x0102, IOException -> 0x00f7 }
            android.util.Pair r4 = android.util.Pair.create(r8, r0)     // Catch:{ FileNotFoundException -> 0x0102, IOException -> 0x00f7 }
            goto L_0x00a3
        L_0x00f7:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/moveFile/copy-failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x021c }
            android.util.Pair r4 = android.util.Pair.create(r8, r4)     // Catch:{ all -> 0x021c }
            goto L_0x00a3
        L_0x0102:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/moveFile/file-not-found"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x021c }
            r0 = 7
            goto L_0x0117
        L_0x010a:
            X.5vB r0 = new X.5vB     // Catch:{ all -> 0x021c }
            r0.<init>(r10, r7)     // Catch:{ all -> 0x021c }
            goto L_0x009f
        L_0x0110:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/moveFile/inmediafolder/ "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x021c }
            r0 = 3
        L_0x0117:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x021c }
            android.util.Pair r4 = android.util.Pair.create(r0, r4)     // Catch:{ all -> 0x021c }
            goto L_0x00a3
        L_0x0120:
            if (r8 == 0) goto L_0x0123
            goto L_0x0125
        L_0x0123:
            r0 = 0
            goto L_0x0127
        L_0x0125:
            java.io.File r0 = r8.A01     // Catch:{ all -> 0x021c }
        L_0x0127:
            A05(r0)     // Catch:{ all -> 0x021c }
            java.lang.Object r0 = r4.first     // Catch:{ all -> 0x021c }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x021c }
            int r0 = r0.intValue()     // Catch:{ all -> 0x021c }
            if (r0 == 0) goto L_0x0152
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x021c }
            r1.<init>()     // Catch:{ all -> 0x021c }
            java.lang.String r0 = "app/mediajobmanager/handleMediaUploadResponse/failed to move file; mediaJob="
            r1.append(r0)     // Catch:{ all -> 0x021c }
            r1.append(r14)     // Catch:{ all -> 0x021c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x021c }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x021c }
            if (r3 != 0) goto L_0x0152
            java.lang.Object r0 = r4.first     // Catch:{ all -> 0x021c }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x021c }
            int r3 = r0.intValue()     // Catch:{ all -> 0x021c }
        L_0x0152:
            if (r8 == 0) goto L_0x0170
            java.util.concurrent.atomic.AtomicInteger r4 = r8.A03     // Catch:{ all -> 0x021c }
            int r1 = r4.get()     // Catch:{ all -> 0x021c }
            r0 = 0
            if (r1 != 0) goto L_0x015e
            r0 = 1
        L_0x015e:
            X.C18740tg.A0C(r0)     // Catch:{ all -> 0x021c }
            X.1Hk r0 = r14.A0A     // Catch:{ all -> 0x021c }
            r0.A04(r8)     // Catch:{ all -> 0x021c }
            int r0 = r4.get()     // Catch:{ all -> 0x021c }
            if (r0 != r5) goto L_0x016d
            r7 = 1
        L_0x016d:
            X.C18740tg.A0C(r7)     // Catch:{ all -> 0x021c }
        L_0x0170:
            monitor-exit(r6)     // Catch:{ all -> 0x021c }
            if (r3 != 0) goto L_0x01e5
            X.6Pj r0 = r15.A01
            X.5z9 r1 = r0.A02
            boolean r0 = r1.A0E
            if (r0 == 0) goto L_0x01e5
            X.1Gl r0 = r1.A06
            boolean r0 = X.AnonymousClass6Y1.A06(r0)
            if (r0 != 0) goto L_0x01cc
            X.6Fj r4 = r15.A02
            java.lang.String r0 = r4.A07()
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01a4 }
            r1.<init>(r0)     // Catch:{ MalformedURLException -> 0x01a4 }
            java.lang.String r0 = r1.getHost()     // Catch:{ MalformedURLException -> 0x01a4 }
            if (r0 == 0) goto L_0x019e
            java.lang.String r0 = r1.getHost()     // Catch:{ MalformedURLException -> 0x01a4 }
            int r0 = r0.length()     // Catch:{ MalformedURLException -> 0x01a4 }
            if (r0 != 0) goto L_0x01cc
        L_0x019e:
            java.lang.String r0 = "mediaupload/url/no-host"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x01a4 }
            goto L_0x01aa
        L_0x01a4:
            r1 = move-exception
            java.lang.String r0 = "mediaupload/url/error "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x01aa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/mediajobmanager/handleMediaUploadResponse/url/error; url="
            r1.append(r0)
            java.lang.String r0 = r4.A07()
            r1.append(r0)
            java.lang.String r0 = "; mediaJob="
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r3 = 19
        L_0x01cc:
            boolean r0 = r15.A04
            if (r0 != 0) goto L_0x01e5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/mediajobmanager/handleMediaUploadResponse/results not received; mediaJob="
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r3 = 3
        L_0x01e5:
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x01f2
            boolean r0 = r14.A08()
            if (r0 == 0) goto L_0x01f1
            r2 = 32
        L_0x01f1:
            r3 = r2
        L_0x01f2:
            r0 = 28
            if (r3 != r0) goto L_0x01fc
            X.1BW r1 = r13.A0J
            r0 = 0
            r1.A01(r0)
        L_0x01fc:
            r14.A00 = r3
            if (r3 != 0) goto L_0x0212
            byte[] r0 = r14.A05
            if (r0 == 0) goto L_0x0212
            r0 = 1
            X.7sf r2 = new X.7sf
            r2.<init>(r14, r0)
            java.util.concurrent.Executor r1 = r13.A0G
            X.1Hk r0 = r14.A0H
            r0.A03(r2, r1)
            return
        L_0x0212:
            X.1Hk r1 = r14.A0C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A04(r0)
            return
        L_0x021c:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x021c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1D0.A03(X.1D0, X.6vi, X.5xD):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r4.A04() != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(X.C146506vi r4, int r5) {
        /*
            r3 = this;
            r4.A00 = r5
            X.1Hk r0 = r4.A0G
            java.lang.Object r0 = r0.A00()
            r2 = 1
            if (r0 != 0) goto L_0x0012
            X.5xD r1 = r4.A04()
            r0 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            X.C18740tg.A0C(r0)
            if (r5 == r2) goto L_0x001c
            r0 = 32
            if (r5 != r0) goto L_0x0039
        L_0x001c:
            X.1Hk r0 = r4.A0A
            java.lang.Object r0 = r0.A00()
            X.5vB r0 = (X.C122635vB) r0
            if (r0 == 0) goto L_0x0039
            java.io.File r1 = r0.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0039
            boolean r0 = X.AnonymousClass6YY.A0P(r1)
            if (r0 == 0) goto L_0x0039
            r1.getAbsolutePath()
        L_0x0039:
            X.1Hk r1 = r4.A0C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1D0.A04(X.6vi, int):void");
    }

    public static void A05(File file) {
        if (file != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("size=");
            sb.append(file.length());
            sb.append(" exists=");
            sb.append(file.exists());
            sb.toString();
        }
    }

    public C146506vi A06(C159427jL r13, C65233Rg r14, boolean z) {
        AnonymousClass1D5 r2 = this.A06;
        AnonymousClass1DE r6 = r2.A0H;
        C65233Rg r11 = r14;
        String str = r14.A04;
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        C124935z2 A022 = r6.A02(str, 0);
        C159427jL r7 = r13;
        C146506vi r62 = new C146506vi(r7, r2.A0A, A022, new C132976Wa(r2.A06, A022, r6, r2.A0O, z), r11);
        String str2 = r62.A0M.A0D;
        AnonymousClass00C.A0D(str2, 0);
        r62.A0B.A04(str2);
        r62.A0N.A07();
        return r62;
    }

    public C146506vi A07(C65233Rg r2, boolean z) {
        return A06(A00(r2.A01), r2, z);
    }

    public C146506vi A08(C65233Rg r4, boolean z) {
        C146506vi A012 = this.A06.A01(r4, z);
        if (A012 == null) {
            return A07(r4, z);
        }
        if (z) {
            A012.A0M.A03++;
        }
        AnonymousClass1DE r1 = this.A07;
        C124935z2 r0 = A012.A0M;
        r1.A04(r0);
        String str = r0.A0D;
        AnonymousClass00C.A0D(str, 0);
        A012.A0B.A04(str);
        A012.A0N.A07();
        return A012;
    }

    public AnonymousClass6AN A09(C124935z2 r16, C132976Wa r17, C123865xD r18, int i, int i2, int i3) {
        C123865xD r3;
        int i4;
        List list;
        int i5 = i;
        int i6 = i3;
        C132976Wa r8 = r17;
        if (i6 == 4) {
            r8.A08(i6);
        }
        synchronized (r8) {
            r3 = r18;
            if (i == 0) {
                r8.A03 = SystemClock.uptimeMillis();
                C132976Wa.A02(r8);
                if (i6 != 3) {
                    this.A0F.Boy(new C35721j9(this, r16, 45));
                }
            } else {
                r8.A03 = SystemClock.uptimeMillis();
                C132976Wa.A02(r8);
                if (!this.A02.A09() && ((r18 != null && r3.A01.A04.A0A == null && (i5 == 17 || i5 == 22 || i5 == 13 || i5 == 33)) || i5 == 14)) {
                    i5 = 25;
                }
            }
        }
        int i7 = i2;
        AnonymousClass590 A042 = r8.A04(this.A03, i5, i7);
        if (r18 == null) {
            list = Collections.emptyList();
        } else {
            AnonymousClass1E1 r5 = this.A0A;
            List<String> A002 = r5.A00(r3.A01.A02.A0B);
            ArrayList arrayList = new ArrayList(AnonymousClass03U.A06(A002, 10));
            for (String str : A002) {
                C19600wD r12 = r5.A00;
                C45772Sq r4 = new C45772Sq();
                C124935z2 r10 = r8.A0K;
                r4.A09 = Long.valueOf(UUID.fromString(r10.A0D).getLeastSignificantBits() & Long.MAX_VALUE);
                r4.A0E = str;
                C125105zK r9 = r8.A07;
                if (r9 != null) {
                    r4.A00 = r9.A02;
                    r4.A01 = r9.A03;
                    r4.A02 = Double.valueOf((double) AnonymousClass6UH.A02(r9.A0C));
                    r4.A03 = Double.valueOf((double) AnonymousClass6UH.A02(r9.A08));
                    r4.A0B = r9.A0G;
                    r4.A0C = AnonymousClass6UH.A03(r9.A0I, r8.A0G);
                }
                int i8 = r8.A02;
                if (r10.A0B == 2) {
                    i4 = 7;
                } else if (i8 == 0 || i8 == 2) {
                    i4 = 1;
                } else {
                    i4 = 5;
                    if (i8 != 3) {
                        if (i8 == 4) {
                            i4 = 8;
                        } else {
                            throw new AssertionError("Unreachable code");
                        }
                    }
                }
                r4.A04 = Integer.valueOf(i4);
                r4.A05 = AnonymousClass1M9.A00(r12.A04());
                r4.A06 = r8.A09;
                Integer A052 = r8.A05(i5);
                Integer A003 = C132976Wa.A00(r8, i5);
                if (A003 != null && A003.intValue() == 12 && A052 != null && A052.intValue() == 1) {
                    A003 = 30;
                }
                r4.A07 = A003;
                r4.A08 = Integer.valueOf(i7);
                r4.A0A = Long.valueOf(AnonymousClass6UH.A02(Long.valueOf(r10.A07)));
                r4.A0D = AnonymousClass6UH.A03(Long.valueOf(r8.A05), r8.A0G);
                arrayList.add(r4);
            }
            list = arrayList;
        }
        return new AnonymousClass6AN(A042, list);
    }

    public AnonymousClass6AN A0A(C146506vi r8, int i, int i2) {
        int A032;
        C124935z2 r1 = r8.A0M;
        C132976Wa r2 = r8.A0N;
        C123865xD A042 = r8.A04();
        if (r8.A07()) {
            A032 = 4;
        } else {
            A032 = r2.A03();
        }
        return A09(r1, r2, A042, i, i2, A032);
    }

    public void A0D(C146506vi r8, C131516Pj r9) {
        C101314xL A0A2 = this.A0D.A0A(r8, r9);
        r8.A0N.A0B(A0A2.A0H().A04);
        boolean z = true;
        if (r9.A00() != 3) {
            z = false;
            A0A2.A0C.A03(r8.A0S, this.A0G);
        }
        AnonymousClass70N r1 = new AnonymousClass70N(this, r8, r9, A0A2);
        Executor executor = this.A0G;
        A0A2.A0H.A03(r1, executor);
        A0A2.A0E.A03(new C164987sh(this, r8, 2), (Executor) null);
        Objects.requireNonNull(r8);
        A0A2.A0F.A03(new C164967sf(r8, 2), (Executor) null);
        if (!z) {
            A0A2.A0G.A03(r8.A0T, executor);
        }
        A0A2.A0D.A03(r8.A0P, executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fc, code lost:
        if (r5 != null) goto L_0x0113;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.C146506vi r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/mediajobmanager/enqueuemediaupload "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.65P r8 = r11.A03()
            X.1Gl r6 = r8.A08
            boolean r9 = r8.A0M
            boolean r7 = r8.A0F
            java.io.File r5 = r8.A0A
            java.lang.String r4 = r8.A0E
            if (r9 == 0) goto L_0x004e
            X.1GJ r0 = r10.A0L
            boolean r0 = r0.A0G(r6, r5)
            if (r0 != 0) goto L_0x004e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/mediajobmanager/enqueuemediaupload we cannot transcode media that needs transcoding "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 34
        L_0x0042:
            r11.A00 = r0
            X.1Hk r1 = r11.A0C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x004a:
            r1.A04(r0)
            return
        L_0x004e:
            X.1Gl r1 = X.C25471Gl.A0A
            if (r6 != r1) goto L_0x0072
            java.lang.String r0 = r8.A0D
            int r2 = X.AnonymousClass1GW.A05(r0)
            r0 = -1
            if (r2 != r0) goto L_0x0072
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/mediajobmanager/enqueuemediaupload we are unable to determine the mimetype of this document "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 35
            goto L_0x0042
        L_0x0072:
            X.1Hk r0 = r11.A0G
            java.lang.Object r0 = r0.A00()
            java.lang.String r2 = " "
            if (r0 == 0) goto L_0x0080
            r10.A0C(r11)
            return
        L_0x0080:
            if (r5 == 0) goto L_0x00a8
            if (r4 != 0) goto L_0x00a8
            boolean r0 = X.AnonymousClass6Y1.A05(r6)
            if (r0 == 0) goto L_0x00a8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "app/mediajobmanager queuing media into upload queue with null media name, "
            r3.append(r0)
            r3.append(r12)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.net.URI r0 = r5.toURI()
            java.lang.String r0 = r0.toString()
            r11.A03 = r0
        L_0x00a8:
            r3 = 7
            if (r9 != 0) goto L_0x00e9
            boolean r0 = X.AnonymousClass6Y1.A0A(r6)
            if (r0 != 0) goto L_0x00e9
            X.1GJ r0 = r10.A0L
            boolean r0 = r0.A0H(r6, r5)
            if (r0 != 0) goto L_0x00e9
            if (r7 == 0) goto L_0x00fc
            if (r5 != 0) goto L_0x0113
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/mediajobmanager queuing media into upload queue with null file, media_type="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; media_name="
            r1.append(r0)
            r1.append(r4)
            r1.append(r2)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00df:
            r11.A00 = r3
            X.1Hk r1 = r11.A0C
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x004a
        L_0x00e9:
            if (r7 == 0) goto L_0x00fc
            if (r4 != 0) goto L_0x00fe
            boolean r0 = X.AnonymousClass6Y1.A05(r6)
            if (r0 == 0) goto L_0x00fe
            X.0wN r2 = r10.A0H
            r1 = 0
            java.lang.String r0 = "app/mediajobmanager/enqueuemediaupload media file and image name is null"
            r2.A0E(r0, r12, r1)
            goto L_0x00df
        L_0x00fc:
            if (r5 != 0) goto L_0x0113
        L_0x00fe:
            X.65P r1 = r11.A03()
            X.1GV r0 = r10.A0B
            X.5yE r2 = r0.A01(r11, r1)
            X.6Wa r1 = r11.A0N
            X.6Tv r0 = r2.A00
            r1.A0A(r0)
            A01(r10, r11, r2)
            return
        L_0x0113:
            if (r6 != r1) goto L_0x012b
            java.lang.String r0 = r8.A0D
            boolean r0 = X.AnonymousClass1GX.A0c(r0)
            if (r0 == 0) goto L_0x012b
            X.65P r1 = r11.A03()
            X.1GV r0 = r10.A0B
            X.5yE r0 = r0.A01(r11, r1)
            A01(r10, r11, r0)
            return
        L_0x012b:
            boolean r0 = r11.A07()
            X.5z9 r1 = r11.A02()
            if (r0 == 0) goto L_0x013e
            X.5BP r0 = new X.5BP
            r0.<init>(r11, r1)
        L_0x013a:
            r10.A0D(r11, r0)
            return
        L_0x013e:
            X.6Pj r0 = new X.6Pj
            r0.<init>(r11, r1)
            goto L_0x013a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1D0.A0E(X.6vi, java.lang.String):void");
    }

    public boolean A0G(C25471Gl r5, int[] iArr, boolean z) {
        C20810yC r3 = this.A03;
        C21000yV r2 = C21000yV.A02;
        if (C20800yB.A01(r2, r3, 247) && r5 == C25471Gl.A0A) {
            return true;
        }
        if (!C20800yB.A01(r2, r3, 246)) {
            return false;
        }
        if (((r5 != C25471Gl.A0D || (iArr != null && iArr.length >= 2 && !C20800yB.A01(r2, r3, 7835))) && r5 != C25471Gl.A0i && r5 != C25471Gl.A04) || !z) {
            return false;
        }
        return true;
    }

    public AnonymousClass1D0(C19700wN r3, C20690y0 r4, AnonymousClass17Y r5, C24041Av r6, C19600wD r7, AnonymousClass1BW r8, C20810yC r9, C21010yW r10, C20840yF r11, AnonymousClass1D5 r12, AnonymousClass1DE r13, AnonymousClass1GO r14, C25161Ff r15, AnonymousClass1E1 r16, AnonymousClass1GV r17, C25531Gr r18, AnonymousClass1D1 r19, AnonymousClass1GJ r20, AnonymousClass1GN r21, C24051Aw r22, C19770wU r23) {
        this.A03 = r9;
        this.A01 = r5;
        this.A0F = r23;
        this.A0H = r3;
        this.A00 = r4;
        this.A04 = r10;
        this.A0C = r19;
        this.A06 = r12;
        this.A0J = r8;
        this.A0L = r20;
        this.A09 = r15;
        this.A0D = r21;
        this.A07 = r13;
        this.A08 = r14;
        this.A0B = r17;
        this.A0A = r16;
        this.A0E = r22;
        this.A02 = r7;
        this.A0I = r6;
        this.A05 = r11;
        Objects.requireNonNull(r5);
        this.A0G = new C36131jo(r5, 1);
        this.A0K = r18;
    }

    public void A0C(C146506vi r2) {
        C123865xD A042 = r2.A04();
        if (A042 != null) {
            A03(this, r2, A042);
            return;
        }
        C122615v9 r0 = (C122615v9) r2.A0G.A00();
        if (r0 != null) {
            A02(this, r2, r0);
        }
    }

    public void A0F(AnonymousClass4R0 r2) {
        r2.BDI();
        this.A0D.A08(r2);
    }
}
