package com.whatsapp.workers.ntp;

import X.AnonymousClass636;
import X.C18800tq;
import X.C19970wo;
import X.C20810yC;
import X.C221112x;
import X.C90464aC;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class NtpSyncWorker extends Worker {
    public static volatile long A05;
    public final Context A00;
    public final C19970wo A01;
    public final C221112x A02;
    public final C20810yC A03;
    public final AnonymousClass636 A04;

    public NtpSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = context;
        C18800tq A0I = C90464aC.A0I(context);
        this.A01 = A0I.Bvc();
        this.A03 = A0I.Azp();
        this.A02 = (C221112x) A0I.A2r.get();
        this.A04 = (AnonymousClass636) A0I.AfI.A00.A31.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013a A[SYNTHETIC, Splitter:B:48:0x013a] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ba A[Catch:{ UnknownHostException -> 0x026c, all -> 0x029b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C109385Xj A00(android.content.Context r22, X.C19970wo r23, X.C221112x r24, X.C20810yC r25, X.AnonymousClass636 r26) {
        /*
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = A05
            long r5 = r5 - r0
            long r3 = A05
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0020
            r1 = 21600000(0x1499700, double:1.0671818E-316)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            java.lang.String r0 = "NtpSyncWorker/executeNtpSync(); another sync happened recently, skipping..."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4ox r2 = X.C97344ox.A00()
            return r2
        L_0x0020:
            java.lang.String r0 = "/ntp/started"
            r4 = r26
            r4.A00(r0)
            java.lang.String r9 = " at resolved address "
            android.content.res.Resources r5 = r22.getResources()
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            java.lang.String r1 = "android:string/config_ntpServer"
            r0 = 0
            int r0 = r2.getIdentifier(r1, r0, r0)
            java.lang.String r3 = "2.android.pool.ntp.org"
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r5.getString(r0)     // Catch:{ NotFoundException -> 0x004c }
            boolean r0 = r1.isEmpty()     // Catch:{ NotFoundException -> 0x004c }
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = "NtpSyncWorker/ntp-server; empty ntp server configuration"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ NotFoundException -> 0x004c }
            goto L_0x0054
        L_0x004c:
            r1 = move-exception
            java.lang.String r0 = "NtpSyncWorker/ntp-server; unresolvable ntp server configuration"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0054
        L_0x0053:
            r3 = r1
        L_0x0054:
            r0 = 4
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x029b }
            r0 = 1
            r8 = 0
            r1 = r24
            X.6L6 r0 = r1.A02(r3, r0, r8)     // Catch:{ UnknownHostException -> 0x026c }
            java.net.InetAddress[] r0 = r0.A04     // Catch:{ UnknownHostException -> 0x026c }
            java.util.Arrays.toString(r0)     // Catch:{ UnknownHostException -> 0x026c }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ UnknownHostException -> 0x026c }
            r22 = 0
            r21 = r22
            r20 = 0
            java.util.Iterator r19 = r0.iterator()     // Catch:{ all -> 0x029b }
        L_0x0073:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x029b }
            if (r0 == 0) goto L_0x025e
            java.lang.Object r10 = r19.next()     // Catch:{ all -> 0x029b }
            java.net.InetAddress r10 = (java.net.InetAddress) r10     // Catch:{ all -> 0x029b }
            java.net.DatagramSocket r2 = new java.net.DatagramSocket     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r2.<init>()     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r21 = r2
            r0 = 20000(0x4e20, float:2.8026E-41)
            r2.setSoTimeout(r0)     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r20 = 1
            r5 = 123(0x7b, float:1.72E-43)
            X.6TB r6 = new X.6TB     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r6.<init>()     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            byte[] r13 = r6.A00     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            byte r0 = r13[r8]     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r0 = 3
            r0 = r0 | r1
            byte r0 = (byte) r0     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r13[r8] = r0     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r1 = r0 & 199(0xc7, float:2.79E-43)
            r0 = 24
            r0 = r0 | r1
            byte r0 = (byte) r0     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r13[r8] = r0     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            java.net.DatagramPacket r12 = r6.A02()     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r12.setAddress(r10)     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r12.setPort(r5)     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            X.6TB r7 = new X.6TB     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r7.<init>()     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            java.net.DatagramPacket r11 = r7.A02()     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r14 = 2085978496000(0x1e5ae01dc00, double:1.030610312837E-311)
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            r18 = 0
            if (r5 >= 0) goto L_0x00d0
            r18 = 1
            r14 = -2208988800000(0xfffffdfdae01dc00, double:NaN)
        L_0x00d0:
            long r0 = r0 - r14
            r16 = 1000(0x3e8, double:4.94E-321)
            long r14 = r0 / r16
            long r0 = r0 % r16
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 * r5
            long r0 = r0 / r16
            if (r18 == 0) goto L_0x00e7
            r5 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r14 = r14 | r5
        L_0x00e7:
            r5 = 32
            long r14 = r14 << r5
            long r0 = r0 | r14
            X.72Y r5 = new X.72Y     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r5.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            long r5 = r5.ntpTime     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r16 = 7
        L_0x00f4:
            int r15 = r16 + 40
            r0 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r5
            int r14 = (int) r0     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            byte r0 = (byte) r14     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r13[r15] = r0     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r0 = 8
            long r5 = r5 >>> r0
            int r16 = r16 + -1
            if (r16 >= 0) goto L_0x00f4
            r2.send(r12)     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r2.receive(r11)     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ SocketTimeoutException -> 0x0122, IOException -> 0x0110 }
            r13 = 0
            goto L_0x0143
        L_0x0110:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0255 }
            java.lang.String r0 = "NtpSyncWorker/sync; unable to retrieve ntp time from "
            X.AnonymousClass000.A1D(r0, r3, r9, r1)     // Catch:{ all -> 0x0255 }
            java.lang.String r0 = X.AnonymousClass000.A0o(r10, r1)     // Catch:{ all -> 0x0255 }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x0255 }
            goto L_0x0136
        L_0x0122:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0255 }
            java.lang.String r0 = "NtpSyncWorker/sync; socket timeout occurred while retrieving ntp time from "
            X.AnonymousClass000.A1D(r0, r3, r9, r1)     // Catch:{ all -> 0x0255 }
            java.lang.String r0 = X.AnonymousClass000.A0o(r10, r1)     // Catch:{ all -> 0x0255 }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x0255 }
            if (r20 == 0) goto L_0x0073
            goto L_0x0138
        L_0x0136:
            if (r20 == 0) goto L_0x0073
        L_0x0138:
            if (r21 == 0) goto L_0x013d
            r21.close()     // Catch:{ all -> 0x029b }
        L_0x013d:
            r21 = r22
            r20 = 0
            goto L_0x0073
        L_0x0143:
            r2.close()     // Catch:{ all -> 0x029b }
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x029b }
            r0 = 24
            X.72Y r2 = X.AnonymousClass6TB.A01(r7, r0)     // Catch:{ all -> 0x029b }
            long r0 = r2.ntpTime     // Catch:{ all -> 0x029b }
            long r19 = X.AnonymousClass72Y.A00(r0)     // Catch:{ all -> 0x029b }
            r0 = 32
            X.72Y r12 = X.AnonymousClass6TB.A01(r7, r0)     // Catch:{ all -> 0x029b }
            long r0 = r12.ntpTime     // Catch:{ all -> 0x029b }
            long r17 = X.AnonymousClass72Y.A00(r0)     // Catch:{ all -> 0x029b }
            r0 = 40
            X.72Y r11 = X.AnonymousClass6TB.A01(r7, r0)     // Catch:{ all -> 0x029b }
            long r9 = r11.ntpTime     // Catch:{ all -> 0x029b }
            long r7 = X.AnonymousClass72Y.A00(r9)     // Catch:{ all -> 0x029b }
            long r0 = r2.ntpTime     // Catch:{ all -> 0x029b }
            r15 = 0
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x0187
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0181
            java.lang.Long r13 = X.C90504aG.A0h(r7, r5)     // Catch:{ all -> 0x029b }
            java.lang.String r0 = "Error: zero orig time -- cannot compute delay"
            goto L_0x0183
        L_0x0181:
            java.lang.String r0 = "Error: zero orig time -- cannot compute delay/offset"
        L_0x0183:
            r3.add(r0)     // Catch:{ all -> 0x029b }
            goto L_0x01e9
        L_0x0187:
            long r1 = r12.ntpTime     // Catch:{ all -> 0x029b }
            java.lang.String r12 = "Error: OrigTime > DestRcvTime"
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01bb
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01bb
            long r13 = r5 - r19
            int r0 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x019c
            java.lang.String r0 = "Error: xmitTime < rcvTime"
            goto L_0x01b3
        L_0x019c:
            long r9 = r7 - r17
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b6
            long r9 = r9 - r13
            r1 = 1
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01ae
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01b6
            goto L_0x01b1
        L_0x01ae:
            java.lang.String r0 = "Warning: processing time > total network time"
            goto L_0x01b3
        L_0x01b1:
            java.lang.String r0 = "Info: processing time > total network time by 1 ms -> assume zero delay"
        L_0x01b3:
            r3.add(r0)     // Catch:{ all -> 0x029b }
        L_0x01b6:
            int r0 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d1
            goto L_0x01ce
        L_0x01bb:
            java.lang.String r0 = "Warning: zero rcvNtpTime or xmitNtpTime"
            r3.add(r0)     // Catch:{ all -> 0x029b }
            int r0 = (r19 > r5 ? 1 : (r19 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c7
            r3.add(r12)     // Catch:{ all -> 0x029b }
        L_0x01c7:
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x01df
            long r17 = r17 - r19
            goto L_0x01da
        L_0x01ce:
            r3.add(r12)     // Catch:{ all -> 0x029b }
        L_0x01d1:
            long r17 = r17 - r19
            long r7 = r7 - r5
            long r17 = r17 + r7
            r0 = 2
            long r17 = r17 / r0
        L_0x01da:
            java.lang.Long r13 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x029b }
            goto L_0x01e9
        L_0x01df:
            long r1 = r11.ntpTime     // Catch:{ all -> 0x029b }
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x024b
            java.lang.Long r13 = X.C90504aG.A0h(r7, r5)     // Catch:{ all -> 0x029b }
        L_0x01e9:
            if (r13 == 0) goto L_0x024b
            long r2 = r13.longValue()     // Catch:{ all -> 0x029b }
            long r5 = r5 + r2
            r11 = r23
            long r7 = r11.A04()     // Catch:{ all -> 0x029b }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x029b }
            long r0 = r5 - r7
            long r7 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x029b }
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x022d
            long r0 = r5 - r12
            long r7 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x029b }
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x022d
            r0 = 2225(0x8b1, float:3.118E-42)
            r1 = r25
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x029b }
            if (r0 == 0) goto L_0x022d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x029b }
            java.lang.String r0 = "NtpSyncWorker/sync; NTP time too far from server or device time; ntpTimeMs="
            java.lang.String r0 = X.C36381kD.A0z(r0, r1, r5)     // Catch:{ all -> 0x029b }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x029b }
            X.4ov r2 = X.C97324ov.A00()     // Catch:{ all -> 0x029b }
            goto L_0x027d
        L_0x022d:
            X.C19970wo.A01(r11, r2)     // Catch:{ all -> 0x029b }
            X.0wh r0 = r11.A00     // Catch:{ all -> 0x029b }
            android.content.SharedPreferences r5 = r0.A01     // Catch:{ all -> 0x029b }
            android.content.SharedPreferences$Editor r1 = r5.edit()     // Catch:{ all -> 0x029b }
            java.lang.String r0 = "client_ntp_time_diff"
            X.C36341k9.A0w(r1, r0, r2)     // Catch:{ all -> 0x029b }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x029b }
            android.content.SharedPreferences$Editor r1 = r5.edit()     // Catch:{ all -> 0x029b }
            java.lang.String r0 = "last_ntp_client_time"
            X.C36341k9.A0w(r1, r0, r2)     // Catch:{ all -> 0x029b }
            goto L_0x0281
        L_0x024b:
            java.lang.String r0 = "NtpSyncWorker/sync; NTP offset is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x029b }
            X.4ov r2 = X.C97324ov.A00()     // Catch:{ all -> 0x029b }
            goto L_0x027d
        L_0x0255:
            r0 = move-exception
            if (r20 == 0) goto L_0x025d
            if (r21 == 0) goto L_0x025d
            r21.close()     // Catch:{ all -> 0x029b }
        L_0x025d:
            throw r0     // Catch:{ all -> 0x029b }
        L_0x025e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x029b }
            java.lang.String r0 = "NtpSyncWorker/sync; unable to retrieve ntp time from any of the resolved addresses for "
            X.C36321k7.A1R(r0, r3, r1)     // Catch:{ all -> 0x029b }
            X.4ov r2 = X.C97324ov.A00()     // Catch:{ all -> 0x029b }
            goto L_0x027d
        L_0x026c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x029b }
            java.lang.String r0 = "NtpSyncWorker/sync; unable to resolve ntp server "
            r1.append(r0)     // Catch:{ all -> 0x029b }
            X.C36351kA.A1P(r3, r1, r2)     // Catch:{ all -> 0x029b }
            X.4ov r2 = X.C97324ov.A00()     // Catch:{ all -> 0x029b }
        L_0x027d:
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0288
        L_0x0281:
            android.net.TrafficStats.clearThreadStatsTag()
            X.4ox r2 = X.C97344ox.A00()
        L_0x0288:
            boolean r0 = r2 instanceof X.C97344ox
            if (r0 == 0) goto L_0x0298
            long r0 = android.os.SystemClock.elapsedRealtime()
            A05 = r0
            java.lang.String r0 = "/ntp/succeeded"
        L_0x0294:
            r4.A00(r0)
            return r2
        L_0x0298:
            java.lang.String r0 = "/ntp/failed"
            goto L_0x0294
        L_0x029b:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.workers.ntp.NtpSyncWorker.A00(android.content.Context, X.0wo, X.12x, X.0yC, X.636):X.5Xj");
    }
}
