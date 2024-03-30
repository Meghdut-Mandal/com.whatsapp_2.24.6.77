package com.whatsapp.privacy.protocol.http;

import X.AnonymousClass00C;
import X.AnonymousClass13E;
import X.C111285c2;
import X.C128076At;
import X.C131156Ny;
import X.C18800tq;
import X.C19550w8;
import X.C20050ww;
import X.C21080yd;
import X.C24681Dj;
import X.C24741Dp;
import X.C36321k7;
import X.C36371kC;
import X.C36381kD;
import X.C90494aF;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class DisclosureIconsWorker extends Worker {
    public final C24681Dj A00;
    public final C131156Ny A01;
    public final C20050ww A02;
    public final AnonymousClass13E A03;
    public final C24741Dp A04;
    public final C21080yd A05;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 == false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0086, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0089, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(com.whatsapp.privacy.protocol.http.DisclosureIconsWorker r7, java.lang.String r8, int r9) {
        /*
            X.1Dp r6 = r7.A04
            java.io.File r0 = r6.A00(r8, r9)
            if (r0 == 0) goto L_0x000f
            boolean r1 = r0.exists()
            r0 = 1
            if (r1 != 0) goto L_0x00a7
        L_0x000f:
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            r5 = 0
            X.13E r1 = r7.A03     // Catch:{ IOException -> 0x0095, Exception -> 0x008e }
            X.0yd r0 = r7.A05     // Catch:{ IOException -> 0x0095, Exception -> 0x008e }
            r4 = 0
            X.6v1 r3 = r1.A02(r0, r8, r4)     // Catch:{ IOException -> 0x0095, Exception -> 0x008e }
            java.net.HttpURLConnection r2 = r3.A01     // Catch:{ all -> 0x0087 }
            int r1 = r2.getResponseCode()     // Catch:{ all -> 0x0087 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x003c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "disclosureiconworker/downloadAndSave/createDownloadableFilesConnection failed "
            r1.append(r0)     // Catch:{ all -> 0x0087 }
            int r0 = r2.getResponseCode()     // Catch:{ all -> 0x0087 }
            X.C36351kA.A1R(r1, r0)     // Catch:{ all -> 0x0087 }
            r3.close()     // Catch:{ IOException -> 0x0095, Exception -> 0x008e }
            goto L_0x009b
        L_0x003c:
            X.0ww r1 = r7.A02     // Catch:{ all -> 0x0087 }
            java.lang.Integer r0 = X.C90514aH.A0k()     // Catch:{ all -> 0x0087 }
            X.5RE r4 = r3.B8D(r1, r4, r0)     // Catch:{ all -> 0x0087 }
            X.AnonymousClass00C.A0B(r4)     // Catch:{ all -> 0x0080 }
            r0 = 2
            X.AnonymousClass00C.A0D(r4, r0)     // Catch:{ all -> 0x0080 }
            java.io.File r0 = r6.A00(r8, r9)     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0078
            java.io.FileOutputStream r2 = X.C90524aI.A0W(r0)     // Catch:{ IOException -> 0x006e, Exception -> 0x0066 }
            X.AnonymousClass6YY.A0J(r4, r2)     // Catch:{ all -> 0x005f }
            r2.close()     // Catch:{ IOException -> 0x006e, Exception -> 0x0066 }
            r0 = 1
            goto L_0x0079
        L_0x005f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x006e, Exception -> 0x0066 }
            throw r0     // Catch:{ IOException -> 0x006e, Exception -> 0x0066 }
        L_0x0066:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "PrivacyDisclosureFileCache/saveDisclosureIcon exception: "
            goto L_0x0075
        L_0x006e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "PrivacyDisclosureFileCache/saveDisclosureIcon can not write to file "
        L_0x0075:
            X.C36321k7.A1J(r2, r0, r1)     // Catch:{ all -> 0x0080 }
        L_0x0078:
            r0 = 0
        L_0x0079:
            r4.close()     // Catch:{ all -> 0x0087 }
            r3.close()     // Catch:{ IOException -> 0x0095, Exception -> 0x008e }
            goto L_0x00a4
        L_0x0080:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x0087 }
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ IOException -> 0x0095, Exception -> 0x008e }
            throw r0     // Catch:{ IOException -> 0x0095, Exception -> 0x008e }
        L_0x008e:
            r1 = move-exception
            java.lang.String r0 = "disclosureiconworker/downloadAndSave failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x009f }
            goto L_0x009b
        L_0x0095:
            r1 = move-exception
            java.lang.String r0 = "disclosureiconworker/downloadAndSave io failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x009f }
        L_0x009b:
            android.net.TrafficStats.clearThreadStatsTag()
            return r5
        L_0x009f:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x00a4:
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x00a7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.privacy.protocol.http.DisclosureIconsWorker.A00(com.whatsapp.privacy.protocol.http.DisclosureIconsWorker, java.lang.String, int):boolean");
    }

    public C128076At A08() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || i < 23) {
            super.A08();
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        Context context = this.A00;
        AnonymousClass00C.A08(context);
        Notification A002 = C111285c2.A00(context);
        if (A002 != null) {
            return new C128076At(59, A002, C19550w8.A06() ? 1 : 0);
        }
        super.A08();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisclosureIconsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A02 = C36381kD.A0U(A0P);
        this.A03 = C90494aF.A0L(A0P);
        this.A05 = (C21080yd) A0P.A7U.get();
        this.A00 = (C24681Dj) A0P.A6f.get();
        this.A01 = (C131156Ny) A0P.AfI.A00.A3K.get();
        this.A04 = (C24741Dp) A0P.A6g.get();
    }
}
