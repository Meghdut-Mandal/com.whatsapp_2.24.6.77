package com.whatsapp.privacy.usernotice.badge;

import X.AnonymousClass13E;
import X.AnonymousClass1Z8;
import X.AnonymousClass1Z9;
import X.C18800tq;
import X.C20050ww;
import X.C21080yd;
import X.C24691Dk;
import X.C29371Wj;
import X.C36321k7;
import X.C36371kC;
import X.C36381kD;
import X.C90494aF;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public final class UserNoticeCmsContentWorker extends Worker {
    public final C20050ww A00;
    public final C24691Dk A01;
    public final C29371Wj A02;
    public final AnonymousClass1Z9 A03;
    public final AnonymousClass1Z8 A04;
    public final AnonymousClass13E A05;
    public final C21080yd A06;

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0216, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x021a, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00da A[Catch:{ IOException | JSONException -> 0x00cc, all -> 0x0202 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5 A[Catch:{ IOException | JSONException -> 0x00cc, all -> 0x0202 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C109385Xj A09() {
        /*
            r33 = this;
            r9 = r33
            androidx.work.WorkerParameters r4 = r9.A01
            X.6X2 r2 = r4.A01
            java.lang.String r0 = "notices_id"
            int[] r10 = r2.A04(r0)
            if (r10 == 0) goto L_0x0237
            int r0 = r10.length
            if (r0 == 0) goto L_0x0237
            java.lang.String r1 = "url"
            java.util.Map r0 = r2.A00
            java.lang.String r3 = X.C90474aD.A0c(r1, r0)
            if (r3 == 0) goto L_0x0237
            int r1 = r4.A00
            r0 = 4
            if (r1 > r0) goto L_0x0237
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.13E r1 = r9.A05     // Catch:{ IOException -> 0x021b }
            X.0yd r0 = r9.A06     // Catch:{ IOException -> 0x021b }
            r2 = 0
            X.6v1 r8 = r1.A02(r0, r3, r2)     // Catch:{ IOException -> 0x021b }
            X.AnonymousClass00C.A0B(r8)     // Catch:{ all -> 0x0214 }
            java.net.HttpURLConnection r0 = r8.A01     // Catch:{ all -> 0x0202 }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x0202 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x004d
            X.1Wj r1 = r9.A02     // Catch:{ all -> 0x0202 }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ all -> 0x0202 }
            X.C29371Wj.A02(r1, r0)     // Catch:{ all -> 0x0202 }
            r8.close()     // Catch:{ all -> 0x0202 }
            X.4ov r0 = X.C97324ov.A00()     // Catch:{ all -> 0x0202 }
            goto L_0x0210
        L_0x004d:
            X.0ww r1 = r9.A00     // Catch:{ all -> 0x0202 }
            java.lang.Integer r0 = X.C90514aH.A0k()     // Catch:{ all -> 0x0202 }
            X.5RE r0 = r8.B8D(r1, r2, r0)     // Catch:{ all -> 0x0202 }
            byte[] r0 = X.AnonymousClass14X.A04(r0)     // Catch:{ all -> 0x0202 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0202 }
            java.io.ByteArrayInputStream r1 = X.C90524aI.A0P(r0)     // Catch:{ all -> 0x0202 }
            X.1Dk r14 = r9.A01     // Catch:{ all -> 0x0202 }
            java.lang.String r2 = "results"
            java.lang.String r13 = "Failed to parse user notice content list"
            r0 = 18
            X.7qx r12 = new X.7qx     // Catch:{ all -> 0x0202 }
            r12.<init>(r0)     // Catch:{ all -> 0x0202 }
            java.util.LinkedHashMap r11 = X.C36431kI.A1G()     // Catch:{ all -> 0x0202 }
            org.json.JSONObject r1 = X.AnonymousClass14X.A01(r1)     // Catch:{ IOException | JSONException -> 0x00cc }
            X.C18740tg.A06(r1)     // Catch:{ IOException | JSONException -> 0x00cc }
            boolean r0 = r1.has(r2)     // Catch:{ IOException | JSONException -> 0x00cc }
            if (r0 != 0) goto L_0x0085
            java.util.Map r1 = X.C000400e.A0B(r11)     // Catch:{ IOException | JSONException -> 0x00cc }
            goto L_0x00d4
        L_0x0085:
            org.json.JSONArray r7 = r1.getJSONArray(r2)     // Catch:{ IOException | JSONException -> 0x00cc }
            r6 = 0
            int r5 = r7.length()     // Catch:{ IOException | JSONException -> 0x00cc }
        L_0x008e:
            if (r6 >= r5) goto L_0x00d0
            org.json.JSONObject r2 = r7.getJSONObject(r6)     // Catch:{ IOException | JSONException -> 0x00cc }
            java.lang.String r0 = "notice_id"
            int r1 = r2.getInt(r0)     // Catch:{ IOException | JSONException -> 0x00cc }
            java.lang.String r0 = "channel"
            java.lang.String r4 = r2.optString(r0)     // Catch:{ IOException | JSONException -> 0x00cc }
            if (r4 != 0) goto L_0x00a4
            java.lang.String r4 = "default"
        L_0x00a4:
            X.6Db r3 = X.C24691Dk.A00(r14, r2, r1)     // Catch:{ IOException | JSONException -> 0x00cc }
            if (r3 == 0) goto L_0x00c9
            java.lang.Object r2 = r11.get(r4)     // Catch:{ IOException | JSONException -> 0x00cc }
            r1 = 1
            if (r2 != 0) goto L_0x00b6
            java.util.PriorityQueue r2 = new java.util.PriorityQueue     // Catch:{ IOException | JSONException -> 0x00cc }
            r2.<init>(r1, r12)     // Catch:{ IOException | JSONException -> 0x00cc }
        L_0x00b6:
            java.util.PriorityQueue r2 = (java.util.PriorityQueue) r2     // Catch:{ IOException | JSONException -> 0x00cc }
            java.lang.Object r0 = r11.get(r4)     // Catch:{ IOException | JSONException -> 0x00cc }
            if (r0 != 0) goto L_0x00c3
            java.util.PriorityQueue r0 = new java.util.PriorityQueue     // Catch:{ IOException | JSONException -> 0x00cc }
            r0.<init>(r1, r12)     // Catch:{ IOException | JSONException -> 0x00cc }
        L_0x00c3:
            r2.offer(r3)     // Catch:{ IOException | JSONException -> 0x00cc }
            r11.put(r4, r2)     // Catch:{ IOException | JSONException -> 0x00cc }
        L_0x00c9:
            int r6 = r6 + 1
            goto L_0x008e
        L_0x00cc:
            r0 = move-exception
            com.whatsapp.util.Log.e(r13, r0)     // Catch:{ all -> 0x0202 }
        L_0x00d0:
            java.util.Map r1 = X.C000400e.A0B(r11)     // Catch:{ all -> 0x0202 }
        L_0x00d4:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x00f5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0202 }
            java.lang.String r0 = "UserNoticeCmsContentWorker/storeUserNoticeContent/cannot parse response for notice: "
            X.C36321k7.A1J(r10, r0, r1)     // Catch:{ all -> 0x0202 }
            X.1Wj r1 = r9.A02     // Catch:{ all -> 0x0202 }
            java.lang.Integer r0 = X.C36371kC.A0n()     // Catch:{ all -> 0x0202 }
            X.C29371Wj.A02(r1, r0)     // Catch:{ all -> 0x0202 }
            r8.close()     // Catch:{ all -> 0x0202 }
            X.4ov r0 = X.C97324ov.A00()     // Catch:{ all -> 0x0202 }
            goto L_0x0210
        L_0x00f5:
            X.1Z9 r7 = r9.A03     // Catch:{ all -> 0x0202 }
            r12 = 0
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0202 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0202 }
            if (r0 != 0) goto L_0x01d7
            X.00T r0 = r7.A07     // Catch:{ all -> 0x0202 }
            r32 = r0
            java.util.Map r0 = X.C90514aH.A16(r32)     // Catch:{ all -> 0x0202 }
            r0.clear()     // Catch:{ all -> 0x0202 }
            X.00T r0 = r7.A06     // Catch:{ all -> 0x0202 }
            r31 = r0
            java.util.Map r0 = X.C90514aH.A16(r31)     // Catch:{ all -> 0x0202 }
            r0.clear()     // Catch:{ all -> 0x0202 }
            X.00T r0 = r7.A08     // Catch:{ all -> 0x0202 }
            r30 = r0
            java.util.Map r0 = X.C90514aH.A16(r30)     // Catch:{ all -> 0x0202 }
            r0.clear()     // Catch:{ all -> 0x0202 }
            java.util.Iterator r17 = X.AnonymousClass000.A0y(r1)     // Catch:{ all -> 0x0202 }
        L_0x0127:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x01b2
            java.util.Map$Entry r16 = X.AnonymousClass000.A11(r17)     // Catch:{ all -> 0x0202 }
            java.lang.Object r1 = r16.getValue()     // Catch:{ all -> 0x0202 }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x0202 }
            r6 = 0
            X.6Db[] r0 = new X.C128646Db[r12]     // Catch:{ all -> 0x0202 }
            java.lang.Object[] r5 = r1.toArray(r0)     // Catch:{ all -> 0x0202 }
            int r10 = r5.length     // Catch:{ all -> 0x0202 }
        L_0x013f:
            if (r6 >= r10) goto L_0x0127
            r4 = r5[r6]     // Catch:{ all -> 0x0202 }
            X.6Db r4 = (X.C128646Db) r4     // Catch:{ all -> 0x0202 }
            java.util.Map r1 = X.C90514aH.A16(r30)     // Catch:{ all -> 0x0202 }
            java.lang.Object r0 = r16.getKey()     // Catch:{ all -> 0x0202 }
            java.lang.Object r2 = r1.get(r0)     // Catch:{ all -> 0x0202 }
            if (r2 != 0) goto L_0x0159
            r0 = 1
            java.util.PriorityQueue r2 = new java.util.PriorityQueue     // Catch:{ all -> 0x0202 }
            r2.<init>(r0)     // Catch:{ all -> 0x0202 }
        L_0x0159:
            java.util.PriorityQueue r2 = (java.util.PriorityQueue) r2     // Catch:{ all -> 0x0202 }
            int r0 = r4.A00     // Catch:{ all -> 0x0202 }
            r22 = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0202 }
            r2.offer(r3)     // Catch:{ all -> 0x0202 }
            java.util.Map r1 = X.C90514aH.A16(r30)     // Catch:{ all -> 0x0202 }
            java.lang.Object r0 = r16.getKey()     // Catch:{ all -> 0x0202 }
            r1.put(r0, r2)     // Catch:{ all -> 0x0202 }
            X.6CS r2 = r4.A05     // Catch:{ all -> 0x0202 }
            if (r2 == 0) goto L_0x01a8
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0202 }
            X.0wo r0 = r7.A01     // Catch:{ all -> 0x0202 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0202 }
            long r26 = r13.toSeconds(r0)     // Catch:{ all -> 0x0202 }
            java.lang.String r15 = r2.A03     // Catch:{ all -> 0x0202 }
            java.lang.String r14 = r2.A02     // Catch:{ all -> 0x0202 }
            r28 = -1
            r23 = 100
            r24 = 1
            int r13 = r2.A00     // Catch:{ all -> 0x0202 }
            X.6Pi r1 = r2.A01     // Catch:{ all -> 0x0202 }
            X.3Pa r0 = new X.3Pa     // Catch:{ all -> 0x0202 }
            r18 = r0
            r19 = r1
            r20 = r15
            r21 = r14
            r25 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r28)     // Catch:{ all -> 0x0202 }
            r11.add(r0)     // Catch:{ all -> 0x0202 }
            java.util.Map r1 = X.C90514aH.A16(r31)     // Catch:{ all -> 0x0202 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0202 }
        L_0x01a8:
            java.util.Map r0 = X.C90514aH.A16(r32)     // Catch:{ all -> 0x0202 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0202 }
            int r6 = r6 + 1
            goto L_0x013f
        L_0x01b2:
            X.1Wl r1 = r7.A04     // Catch:{ all -> 0x0202 }
            X.00T r0 = r7.A09     // Catch:{ all -> 0x0202 }
            java.util.Map r0 = X.C90514aH.A16(r0)     // Catch:{ all -> 0x0202 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0202 }
            r1.A06(r0)     // Catch:{ all -> 0x0202 }
            java.util.Map r0 = X.C90514aH.A16(r31)     // Catch:{ all -> 0x0202 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0202 }
            r1.A04(r0)     // Catch:{ all -> 0x0202 }
            java.util.Map r0 = X.C90514aH.A16(r32)     // Catch:{ all -> 0x0202 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0202 }
            r1.A05(r0)     // Catch:{ all -> 0x0202 }
        L_0x01d7:
            r8.close()     // Catch:{ all -> 0x0202 }
            java.util.Iterator r6 = r11.iterator()     // Catch:{ all -> 0x0202 }
        L_0x01de:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0202 }
            if (r0 == 0) goto L_0x020c
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0202 }
            X.3Pa r5 = (X.C64683Pa) r5     // Catch:{ all -> 0x0202 }
            X.1Z8 r4 = r9.A04     // Catch:{ all -> 0x0202 }
            X.38g r0 = r5.A05     // Catch:{ all -> 0x0202 }
            int r3 = r0.A00     // Catch:{ all -> 0x0202 }
            r2 = 1
            X.1Dn r1 = r4.A04     // Catch:{ all -> 0x0202 }
            r1.A00(r3, r2)     // Catch:{ all -> 0x0202 }
            r0 = 100
            r1.A00(r3, r0)     // Catch:{ all -> 0x0202 }
            r4.A00(r5, r2)     // Catch:{ all -> 0x0202 }
            r4.A00(r5, r0)     // Catch:{ all -> 0x0202 }
            goto L_0x01de
        L_0x0202:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0214 }
            java.lang.String r0 = "UserNoticeCmsContentWorker/parseResponse caught throwable "
            X.C36321k7.A1J(r2, r0, r1)     // Catch:{ all -> 0x0214 }
        L_0x020c:
            X.4ox r0 = X.C97344ox.A00()     // Catch:{ all -> 0x0214 }
        L_0x0210:
            r8.close()     // Catch:{ IOException -> 0x021b }
            goto L_0x022e
        L_0x0214:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0216 }
        L_0x0216:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ IOException -> 0x021b }
            throw r0     // Catch:{ IOException -> 0x021b }
        L_0x021b:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentWorker/doWork/fetch failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0232 }
            X.1Wj r1 = r9.A02     // Catch:{ all -> 0x0232 }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ all -> 0x0232 }
            X.C29371Wj.A02(r1, r0)     // Catch:{ all -> 0x0232 }
            X.4ow r0 = X.C97334ow.A00()     // Catch:{ all -> 0x0232 }
        L_0x022e:
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x0232:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0237:
            X.1Wj r1 = r9.A02
            java.lang.Integer r0 = X.C36361kB.A0j()
            X.C29371Wj.A02(r1, r0)
            X.4ow r0 = X.C97334ow.A00()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.privacy.usernotice.badge.UserNoticeCmsContentWorker.A09():X.5Xj");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserNoticeCmsContentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C36321k7.A0x(context, workerParameters);
        C18800tq A0P = C36371kC.A0P(context);
        this.A00 = C36381kD.A0U(A0P);
        this.A02 = (C29371Wj) A0P.A8p.get();
        this.A06 = (C21080yd) A0P.A7U.get();
        this.A05 = C90494aF.A0L(A0P);
        this.A04 = (AnonymousClass1Z8) A0P.A8m.get();
        this.A03 = (AnonymousClass1Z9) A0P.A8l.get();
        this.A01 = (C24691Dk) A0P.A8o.get();
    }
}
