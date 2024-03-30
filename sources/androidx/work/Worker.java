package androidx.work;

import X.AnonymousClass001;
import X.AnonymousClass75C;
import X.C128076At;
import X.C128916Ec;
import X.C17880sD;
import X.C97484pl;
import android.content.Context;

public abstract class Worker extends C128916Ec {
    public C97484pl A00;

    public C17880sD A05() {
        C97484pl r3 = new C97484pl();
        this.A01.A07.execute(new AnonymousClass75C((Object) this, (Object) r3, 10));
        return r3;
    }

    public C128076At A08() {
        throw AnonymousClass001.A09("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02ee, code lost:
        if (r2.length() == 0) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03a8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C109385Xj A09() {
        /*
            r13 = this;
            boolean r0 = r13 instanceof com.whatsapp.workers.ntp.NtpSyncWorker
            if (r0 == 0) goto L_0x0016
            r0 = r13
            com.whatsapp.workers.ntp.NtpSyncWorker r0 = (com.whatsapp.workers.ntp.NtpSyncWorker) r0
            android.content.Context r4 = r0.A00
            X.0wo r3 = r0.A01
            X.0yC r2 = r0.A03
            X.12x r1 = r0.A02
            X.636 r0 = r0.A04
            X.5Xj r1 = com.whatsapp.workers.ntp.NtpSyncWorker.A00(r4, r3, r1, r2, r0)
            return r1
        L_0x0016:
            boolean r0 = r13 instanceof com.whatsapp.privacy.usernotice.UserNoticeIconWorker
            if (r0 == 0) goto L_0x00d6
            r4 = r13
            com.whatsapp.privacy.usernotice.UserNoticeIconWorker r4 = (com.whatsapp.privacy.usernotice.UserNoticeIconWorker) r4
            androidx.work.WorkerParameters r3 = r4.A01
            X.6X2 r1 = r3.A01
            java.lang.String r0 = "notice_id"
            r2 = -1
            int r9 = r1.A02(r0, r2)
            java.lang.String r0 = "file_name_list"
            java.util.Map r1 = r1.A00
            java.lang.Object r8 = r1.get(r0)
            boolean r0 = r8 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x009d
            java.lang.String[] r8 = (java.lang.String[]) r8
        L_0x0036:
            java.lang.String r0 = "url_list"
            java.lang.Object r7 = r1.get(r0)
            boolean r0 = r7 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x009b
            java.lang.String[] r7 = (java.lang.String[]) r7
        L_0x0042:
            if (r9 == r2) goto L_0x00c8
            if (r8 == 0) goto L_0x00c8
            if (r7 == 0) goto L_0x00c8
            int r1 = r3.A00
            r0 = 4
            if (r1 > r0) goto L_0x00c8
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            r6 = 0
        L_0x0053:
            int r0 = r7.length
            if (r6 >= r0) goto L_0x00c3
            X.13E r2 = r4.A01     // Catch:{ IOException -> 0x00ae }
            r1 = r7[r6]     // Catch:{ IOException -> 0x00ae }
            X.0yd r0 = r4.A04     // Catch:{ IOException -> 0x00ae }
            r10 = 0
            X.6v1 r5 = r2.A02(r0, r1, r10)     // Catch:{ IOException -> 0x00ae }
            java.net.HttpURLConnection r0 = r5.A01     // Catch:{ all -> 0x00a4 }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x00a4 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0079
            X.1Wj r1 = r4.A03     // Catch:{ all -> 0x00a4 }
            java.lang.Integer r0 = X.C36371kC.A0o()     // Catch:{ all -> 0x00a4 }
            X.C29371Wj.A02(r1, r0)     // Catch:{ all -> 0x00a4 }
            X.4ow r1 = X.C97334ow.A00()     // Catch:{ all -> 0x00a4 }
            goto L_0x009f
        L_0x0079:
            X.1Wh r3 = r4.A02     // Catch:{ all -> 0x00a4 }
            r2 = r8[r6]     // Catch:{ all -> 0x00a4 }
            X.0ww r1 = r4.A00     // Catch:{ all -> 0x00a4 }
            java.lang.Integer r0 = X.C90514aH.A0k()     // Catch:{ all -> 0x00a4 }
            X.5RE r0 = r5.B8D(r1, r10, r0)     // Catch:{ all -> 0x00a4 }
            boolean r0 = r3.A09(r0, r2, r9)     // Catch:{ all -> 0x00a4 }
            if (r0 != 0) goto L_0x0092
            X.4ov r1 = X.C97324ov.A00()     // Catch:{ all -> 0x00a4 }
            goto L_0x009f
        L_0x0092:
            r5.close()     // Catch:{ IOException -> 0x00ae }
            android.net.TrafficStats.clearThreadStatsTag()
            int r6 = r6 + 1
            goto L_0x0053
        L_0x009b:
            r7 = 0
            goto L_0x0042
        L_0x009d:
            r8 = 0
            goto L_0x0036
        L_0x009f:
            r5.close()     // Catch:{ IOException -> 0x00ae }
            goto L_0x03c6
        L_0x00a4:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00a9 }
            goto L_0x00ad
        L_0x00a9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00ae }
        L_0x00ad:
            throw r1     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentWorker/doWork/fetch failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x03ca }
            X.1Wj r1 = r4.A03     // Catch:{ all -> 0x03ca }
            java.lang.Integer r0 = X.C36371kC.A0o()     // Catch:{ all -> 0x03ca }
            X.C29371Wj.A02(r1, r0)     // Catch:{ all -> 0x03ca }
            X.4ow r1 = X.C97334ow.A00()     // Catch:{ all -> 0x03ca }
            goto L_0x03c6
        L_0x00c3:
            X.4ox r1 = X.C97344ox.A00()
            return r1
        L_0x00c8:
            X.1Wj r1 = r4.A03
            java.lang.Integer r0 = X.C36371kC.A0o()
            X.C29371Wj.A02(r1, r0)
            X.4ow r1 = X.C97334ow.A00()
            return r1
        L_0x00d6:
            boolean r0 = r13 instanceof com.whatsapp.privacy.usernotice.UserNoticeContentWorker
            if (r0 == 0) goto L_0x020a
            r5 = r13
            com.whatsapp.privacy.usernotice.UserNoticeContentWorker r5 = (com.whatsapp.privacy.usernotice.UserNoticeContentWorker) r5
            androidx.work.WorkerParameters r6 = r5.A01
            X.6X2 r3 = r6.A01
            java.lang.String r0 = "notice_id"
            r2 = -1
            int r4 = r3.A02(r0, r2)
            java.lang.String r1 = "url"
            java.util.Map r0 = r3.A00
            java.lang.String r3 = X.C90474aD.A0c(r1, r0)
            if (r4 == r2) goto L_0x01fc
            if (r3 == 0) goto L_0x01fc
            int r1 = r6.A00
            r0 = 4
            if (r1 > r0) goto L_0x01fc
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.13E r1 = r5.A01     // Catch:{ IOException -> 0x01e7 }
            X.0yd r0 = r5.A05     // Catch:{ IOException -> 0x01e7 }
            r2 = 0
            X.6v1 r6 = r1.A02(r0, r3, r2)     // Catch:{ IOException -> 0x01e7 }
            java.net.HttpURLConnection r0 = r6.A01     // Catch:{ all -> 0x01dd }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x01dd }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0120
            X.1Wj r1 = r5.A04     // Catch:{ all -> 0x01dd }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ all -> 0x01dd }
            X.C29371Wj.A02(r1, r0)     // Catch:{ all -> 0x01dd }
            X.4ov r1 = X.C97324ov.A00()     // Catch:{ all -> 0x01dd }
            goto L_0x01d8
        L_0x0120:
            X.0ww r1 = r5.A00     // Catch:{ all -> 0x01dd }
            java.lang.Integer r0 = X.C90514aH.A0k()     // Catch:{ all -> 0x01dd }
            X.5RE r0 = r6.B8D(r1, r2, r0)     // Catch:{ all -> 0x01dd }
            byte[] r2 = X.AnonymousClass14X.A04(r0)     // Catch:{ all -> 0x01dd }
            java.io.ByteArrayInputStream r1 = X.C90524aI.A0P(r2)     // Catch:{ all -> 0x01dd }
            X.1Dk r0 = r5.A03     // Catch:{ all -> 0x01dd }
            X.6Db r3 = r0.A03(r1, r4)     // Catch:{ all -> 0x01dd }
            if (r3 != 0) goto L_0x0152
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "UserNoticeContentManager/storeUserNoticeContent/cannot parse response for notice: "
            X.C36321k7.A1T(r0, r1, r4)     // Catch:{ all -> 0x01dd }
            X.1Wj r1 = r5.A04     // Catch:{ all -> 0x01dd }
            java.lang.Integer r0 = X.C36371kC.A0n()     // Catch:{ all -> 0x01dd }
            X.C29371Wj.A02(r1, r0)     // Catch:{ all -> 0x01dd }
            X.4ov r1 = X.C97324ov.A00()     // Catch:{ all -> 0x01dd }
            goto L_0x01d8
        L_0x0152:
            java.io.ByteArrayInputStream r2 = X.C90524aI.A0P(r2)     // Catch:{ all -> 0x01dd }
            X.1Wh r1 = r5.A02     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "content.json"
            boolean r0 = r1.A09(r2, r0, r4)     // Catch:{ all -> 0x01dd }
            if (r0 != 0) goto L_0x0165
            X.4ov r1 = X.C97324ov.A00()     // Catch:{ all -> 0x01dd }
            goto L_0x01d8
        L_0x0165:
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01dd }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x01dd }
            X.5HN r1 = r3.A02     // Catch:{ all -> 0x01dd }
            if (r1 == 0) goto L_0x0185
            java.lang.String r0 = "banner_icon_light.png"
            r2.add(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = r1.A03     // Catch:{ all -> 0x01dd }
            r7.add(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "banner_icon_dark.png"
            r2.add(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = r1.A02     // Catch:{ all -> 0x01dd }
            r7.add(r0)     // Catch:{ all -> 0x01dd }
        L_0x0185:
            X.5HO r1 = r3.A04     // Catch:{ all -> 0x01dd }
            if (r1 == 0) goto L_0x019d
            java.lang.String r0 = "modal_icon_light.png"
            r2.add(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x01dd }
            r7.add(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "modal_icon_dark.png"
            r2.add(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = r1.A05     // Catch:{ all -> 0x01dd }
            r7.add(r0)     // Catch:{ all -> 0x01dd }
        L_0x019d:
            X.5HO r1 = r3.A03     // Catch:{ all -> 0x01dd }
            if (r1 == 0) goto L_0x01b5
            java.lang.String r0 = "blocking_modal_icon_light.png"
            r2.add(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x01dd }
            r7.add(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "blocking_modal_icon_dark.png"
            r2.add(r0)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = r1.A05     // Catch:{ all -> 0x01dd }
            r7.add(r0)     // Catch:{ all -> 0x01dd }
        L_0x01b5:
            X.6EH r4 = new X.6EH     // Catch:{ all -> 0x01dd }
            r4.<init>()     // Catch:{ all -> 0x01dd }
            r3 = 0
            java.lang.String[] r1 = X.C36371kC.A1b(r2, r3)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "file_name_list"
            java.util.Map r2 = r4.A00     // Catch:{ all -> 0x01dd }
            r2.put(r0, r1)     // Catch:{ all -> 0x01dd }
            java.lang.String[] r1 = X.C36371kC.A1b(r7, r3)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "url_list"
            r2.put(r0, r1)     // Catch:{ all -> 0x01dd }
            X.6X2 r0 = r4.A00()     // Catch:{ all -> 0x01dd }
            X.4ox r1 = new X.4ox     // Catch:{ all -> 0x01dd }
            r1.<init>(r0)     // Catch:{ all -> 0x01dd }
        L_0x01d8:
            r6.close()     // Catch:{ IOException -> 0x01e7 }
            goto L_0x03c6
        L_0x01dd:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x01e2 }
            goto L_0x01e6
        L_0x01e2:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x01e7 }
        L_0x01e6:
            throw r1     // Catch:{ IOException -> 0x01e7 }
        L_0x01e7:
            r1 = move-exception
            java.lang.String r0 = "UserNoticeContentWorker/doWork/fetch failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x03ca }
            X.1Wj r1 = r5.A04     // Catch:{ all -> 0x03ca }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ all -> 0x03ca }
            X.C29371Wj.A02(r1, r0)     // Catch:{ all -> 0x03ca }
            X.4ow r1 = X.C97334ow.A00()     // Catch:{ all -> 0x03ca }
            goto L_0x03c6
        L_0x01fc:
            X.1Wj r1 = r5.A04
            java.lang.Integer r0 = X.C36361kB.A0j()
            X.C29371Wj.A02(r1, r0)
            X.4ow r1 = X.C97334ow.A00()
            return r1
        L_0x020a:
            boolean r0 = r13 instanceof com.whatsapp.privacy.protocol.http.DisclosureIconsWorker
            if (r0 == 0) goto L_0x02f7
            r7 = r13
            com.whatsapp.privacy.protocol.http.DisclosureIconsWorker r7 = (com.whatsapp.privacy.protocol.http.DisclosureIconsWorker) r7
            androidx.work.WorkerParameters r2 = r7.A01
            X.6X2 r1 = r2.A01
            java.lang.String r0 = "disclosure_ids"
            int[] r6 = r1.A04(r0)
            if (r6 == 0) goto L_0x022f
            int r5 = r6.length
            if (r5 == 0) goto L_0x022f
            int r1 = r2.A00
            r0 = 4
            if (r1 <= r0) goto L_0x0232
            java.lang.String r0 = "disclosureiconworker/dowork exceed retry limit"
        L_0x0227:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.4ow r1 = X.C97334ow.A00()
            return r1
        L_0x022f:
            java.lang.String r0 = "disclosureiconworker/dowork no disclosureIds"
            goto L_0x0227
        L_0x0232:
            r4 = 0
            r0 = 1
        L_0x0234:
            r8 = r6[r4]
            if (r0 == 0) goto L_0x025b
            X.1Dj r0 = r7.A00
            X.C24681Dj.A00(r0)
            X.1Dl r0 = r0.A06
            X.C24701Dl.A02(r0)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A04
            java.lang.Object r0 = X.C90484aE.A0j(r0, r8)
            X.1gr r0 = (X.C34331gr) r0
            if (r0 != 0) goto L_0x02e7
            r2 = 0
        L_0x024d:
            r1 = 1
        L_0x024e:
            java.lang.String r9 = "disclosureiconworker/downloadDisclosureIcons/"
            if (r1 == 0) goto L_0x0267
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r8, r9)
            java.lang.String r0 = " notice content not found"
            X.C36321k7.A1Z(r1, r0)
        L_0x025b:
            r0 = 0
        L_0x025c:
            int r4 = r4 + 1
            if (r4 < r5) goto L_0x0234
            if (r0 == 0) goto L_0x02f2
            X.4ox r1 = X.C97344ox.A00()
            return r1
        L_0x0267:
            X.6Ny r1 = r7.A01     // Catch:{ 5VF -> 0x02dc }
            org.json.JSONObject r0 = X.C36441kJ.A1C(r2)     // Catch:{ 5VF -> 0x02dc }
            X.6AW r0 = r1.A00(r0, r8)     // Catch:{ 5VF -> 0x02dc }
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()     // Catch:{ 5VF -> 0x02dc }
            java.util.List r0 = r0.A01     // Catch:{ 5VF -> 0x02dc }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ 5VF -> 0x02dc }
        L_0x027b:
            boolean r0 = r12.hasNext()     // Catch:{ 5VF -> 0x02dc }
            if (r0 == 0) goto L_0x02b0
            java.lang.Object r1 = r12.next()     // Catch:{ 5VF -> 0x02dc }
            X.6bi r1 = (X.C134856bi) r1     // Catch:{ 5VF -> 0x02dc }
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()     // Catch:{ 5VF -> 0x02dc }
            X.6be r0 = r1.A02     // Catch:{ 5VF -> 0x02dc }
            if (r0 == 0) goto L_0x0292
            r10.add(r0)     // Catch:{ 5VF -> 0x02dc }
        L_0x0292:
            X.6bT[] r3 = r1.A09     // Catch:{ 5VF -> 0x02dc }
            r2 = 0
            int r1 = r3.length     // Catch:{ 5VF -> 0x02dc }
        L_0x0296:
            if (r2 >= r1) goto L_0x02ac
            r0 = r3[r2]     // Catch:{ 5VF -> 0x02dc }
            X.6be r0 = r0.A00     // Catch:{ 5VF -> 0x02dc }
            if (r0 == 0) goto L_0x02a6
            java.util.List r0 = X.C36371kC.A11(r0)     // Catch:{ 5VF -> 0x02dc }
        L_0x02a2:
            r10.addAll(r0)     // Catch:{ 5VF -> 0x02dc }
            goto L_0x02a9
        L_0x02a6:
            X.09w r0 = X.C023409w.A00     // Catch:{ 5VF -> 0x02dc }
            goto L_0x02a2
        L_0x02a9:
            int r2 = r2 + 1
            goto L_0x0296
        L_0x02ac:
            r11.addAll(r10)     // Catch:{ 5VF -> 0x02dc }
            goto L_0x027b
        L_0x02b0:
            java.util.Iterator r3 = r11.iterator()     // Catch:{ 5VF -> 0x02dc }
        L_0x02b4:
            r2 = 1
        L_0x02b5:
            boolean r0 = r3.hasNext()     // Catch:{ 5VF -> 0x02dc }
            if (r0 == 0) goto L_0x02d8
            java.lang.Object r1 = r3.next()     // Catch:{ 5VF -> 0x02dc }
            X.6be r1 = (X.C134816be) r1     // Catch:{ 5VF -> 0x02dc }
            if (r2 == 0) goto L_0x02d6
            java.lang.String r0 = r1.A03     // Catch:{ 5VF -> 0x02dc }
            boolean r0 = com.whatsapp.privacy.protocol.http.DisclosureIconsWorker.A00(r7, r0, r8)     // Catch:{ 5VF -> 0x02dc }
            if (r0 == 0) goto L_0x02d6
            java.lang.String r0 = r1.A02     // Catch:{ 5VF -> 0x02dc }
            if (r0 == 0) goto L_0x02b4
            boolean r0 = com.whatsapp.privacy.protocol.http.DisclosureIconsWorker.A00(r7, r0, r8)     // Catch:{ 5VF -> 0x02dc }
            if (r0 == 0) goto L_0x02d6
            goto L_0x02b4
        L_0x02d6:
            r2 = 0
            goto L_0x02b5
        L_0x02d8:
            r0 = 1
            if (r2 != 0) goto L_0x025c
            goto L_0x025b
        L_0x02dc:
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r8, r9)
            java.lang.String r0 = " failed to parse notice"
            X.C36321k7.A1Z(r1, r0)
            goto L_0x025b
        L_0x02e7:
            java.lang.String r2 = r0.A06
            int r0 = r2.length()
            r1 = 0
            if (r0 != 0) goto L_0x024e
            goto L_0x024d
        L_0x02f2:
            X.4ov r1 = X.C97324ov.A00()
            return r1
        L_0x02f7:
            boolean r0 = r13 instanceof com.whatsapp.privacy.protocol.http.DisclosureContentWorker
            if (r0 == 0) goto L_0x03e7
            r5 = r13
            com.whatsapp.privacy.protocol.http.DisclosureContentWorker r5 = (com.whatsapp.privacy.protocol.http.DisclosureContentWorker) r5
            androidx.work.WorkerParameters r7 = r5.A01
            X.6X2 r6 = r7.A01
            java.lang.String r0 = "disclosure_ids"
            int[] r3 = r6.A04(r0)
            if (r3 == 0) goto L_0x03e2
            int r0 = r3.length
            if (r0 == 0) goto L_0x03e2
            java.lang.String r1 = "url"
            java.util.Map r0 = r6.A00
            java.lang.String r2 = X.C90474aD.A0c(r1, r0)
            r4 = 2
            if (r2 == 0) goto L_0x03cf
            int r1 = r7.A00
            r0 = 4
            if (r1 > r0) goto L_0x03cf
            r1 = -1
            java.lang.String r0 = "handler"
            int r6 = r6.A02(r0, r1)
            r0 = 16
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.13E r1 = r5.A01     // Catch:{ IOException -> 0x03a9 }
            X.0yd r0 = r5.A03     // Catch:{ IOException -> 0x03a9 }
            r9 = 0
            X.6v1 r2 = r1.A02(r0, r2, r9)     // Catch:{ IOException -> 0x03a9 }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x03a2 }
            java.net.HttpURLConnection r0 = r2.A01     // Catch:{ all -> 0x03a2 }
            int r1 = r0.getResponseCode()     // Catch:{ all -> 0x03a2 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x034a
            com.whatsapp.privacy.protocol.http.DisclosureContentWorker.A00(r5, r3, r4)     // Catch:{ all -> 0x03a2 }
            r2.close()     // Catch:{ all -> 0x03a2 }
            X.4ov r1 = X.C97324ov.A00()     // Catch:{ all -> 0x03a2 }
            goto L_0x039e
        L_0x034a:
            X.1ZE r7 = r5.A02     // Catch:{ all -> 0x03a2 }
            X.1Z6 r8 = r7.A00(r6)     // Catch:{ all -> 0x03a2 }
            java.lang.String r6 = "null cannot be cast to non-null type com.whatsapp.privacy.protocol.xmpp.DisclosureHandler"
            X.AnonymousClass00C.A0E(r8, r6)     // Catch:{ all -> 0x03a2 }
            X.0ww r1 = r5.A00     // Catch:{ all -> 0x03a2 }
            java.lang.Integer r0 = X.C90514aH.A0k()     // Catch:{ all -> 0x03a2 }
            X.5RE r0 = r2.B8D(r1, r9, r0)     // Catch:{ all -> 0x03a2 }
            byte[] r0 = X.AnonymousClass14X.A04(r0)     // Catch:{ all -> 0x03a2 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x03a2 }
            java.io.ByteArrayInputStream r1 = X.C90524aI.A0P(r0)     // Catch:{ all -> 0x03a2 }
            java.io.BufferedReader r0 = X.C90484aE.A0b(r1)     // Catch:{ JSONException -> 0x0384 }
            java.lang.String r0 = X.C05610Qj.A00(r0)     // Catch:{ JSONException -> 0x0384 }
            org.json.JSONObject r0 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x0384 }
            r8.BJY(r0, r3)     // Catch:{ JSONException -> 0x0384 }
            r1.close()     // Catch:{ all -> 0x03a2 }
            r2.close()     // Catch:{ all -> 0x03a2 }
            X.4ox r1 = X.C97344ox.A00()     // Catch:{ all -> 0x03a2 }
            goto L_0x039e
        L_0x0384:
            r1 = move-exception
            java.lang.String r0 = "disclosureContentWorker/handleResponse malformed downloaded content"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x03a2 }
            r0 = 3
            com.whatsapp.privacy.protocol.http.DisclosureContentWorker.A00(r5, r3, r0)     // Catch:{ all -> 0x03a2 }
            r1 = 410(0x19a, float:5.75E-43)
            X.1Z6 r0 = r7.A00(r4)     // Catch:{ all -> 0x03a2 }
            X.AnonymousClass00C.A0E(r0, r6)     // Catch:{ all -> 0x03a2 }
            r0.BVo(r3, r1)     // Catch:{ all -> 0x03a2 }
            X.4ow r1 = X.C97334ow.A00()     // Catch:{ all -> 0x03a2 }
        L_0x039e:
            r2.close()     // Catch:{ IOException -> 0x03a9 }
            goto L_0x03c6
        L_0x03a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03a4 }
        L_0x03a4:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x03a9 }
            throw r0     // Catch:{ IOException -> 0x03a9 }
        L_0x03a9:
            r1 = move-exception
            java.lang.String r0 = "disclosureContentWorker/doWork/fetch failed "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x03ca }
            com.whatsapp.privacy.protocol.http.DisclosureContentWorker.A00(r5, r3, r4)     // Catch:{ all -> 0x03ca }
            r2 = 400(0x190, float:5.6E-43)
            X.1ZE r0 = r5.A02     // Catch:{ all -> 0x03ca }
            X.1Z6 r1 = r0.A00(r4)     // Catch:{ all -> 0x03ca }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.privacy.protocol.xmpp.DisclosureHandler"
            X.AnonymousClass00C.A0E(r1, r0)     // Catch:{ all -> 0x03ca }
            r1.BVo(r3, r2)     // Catch:{ all -> 0x03ca }
            X.4ow r1 = X.C97334ow.A00()     // Catch:{ all -> 0x03ca }
        L_0x03c6:
            android.net.TrafficStats.clearThreadStatsTag()
            return r1
        L_0x03ca:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x03cf:
            com.whatsapp.privacy.protocol.http.DisclosureContentWorker.A00(r5, r3, r4)
            r2 = 400(0x190, float:5.6E-43)
            X.1ZE r0 = r5.A02
            X.1Z6 r1 = r0.A00(r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.privacy.protocol.xmpp.DisclosureHandler"
            X.AnonymousClass00C.A0E(r1, r0)
            r1.BVo(r3, r2)
        L_0x03e2:
            X.4ow r1 = X.C97334ow.A00()
            return r1
        L_0x03e7:
            boolean r0 = r13 instanceof com.whatsapp.networkresources.NetworkResourceDownloadWorker
            if (r0 == 0) goto L_0x041b
            r4 = r13
            com.whatsapp.networkresources.NetworkResourceDownloadWorker r4 = (com.whatsapp.networkresources.NetworkResourceDownloadWorker) r4
            androidx.work.WorkerParameters r0 = r4.A01
            X.6X2 r3 = r0.A01
            java.lang.String r1 = "resource_id"
            java.util.Map r0 = r3.A00
            java.lang.String r2 = X.C90474aD.A0c(r1, r0)
            X.C18740tg.A06(r2)
            java.lang.String r1 = "resource_filename"
            java.util.Map r0 = r3.A00
            java.lang.String r1 = X.C90474aD.A0c(r1, r0)
            X.C18740tg.A06(r1)
            X.60c r0 = r4.A00     // Catch:{ IOException -> 0x0416 }
            X.657 r0 = r0.A00(r4, r2, r1)     // Catch:{ IOException -> 0x0416 }
            r0.A00()     // Catch:{ IOException -> 0x0416 }
            X.4ox r1 = X.C97344ox.A00()     // Catch:{ IOException -> 0x0416 }
            return r1
        L_0x0416:
            X.4ow r1 = X.C97334ow.A00()
            return r1
        L_0x041b:
            boolean r0 = r13 instanceof com.whatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker
            if (r0 == 0) goto L_0x0442
            r2 = r13
            com.whatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker r2 = (com.whatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker) r2
            X.6F7 r1 = r2.A01     // Catch:{ Exception -> 0x0431 }
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch:{ Exception -> 0x0431 }
            r0.<init>()     // Catch:{ Exception -> 0x0431 }
            r1.A02(r0)     // Catch:{ Exception -> 0x0431 }
            X.4ox r1 = X.C97344ox.A00()     // Catch:{ Exception -> 0x0431 }
            return r1
        L_0x0431:
            r3 = move-exception
            X.0wN r2 = r2.A00
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "xpm-export-prefetch-key"
            r2.A0D(r0, r1, r3)
            X.4ov r1 = X.C97324ov.A00()
            return r1
        L_0x0442:
            boolean r0 = r13 instanceof com.whatsapp.media.download.ExpressPathGarbageCollectWorker
            if (r0 == 0) goto L_0x0482
            r3 = r13
            com.whatsapp.media.download.ExpressPathGarbageCollectWorker r3 = (com.whatsapp.media.download.ExpressPathGarbageCollectWorker) r3
            androidx.work.WorkerParameters r0 = r3.A01
            X.6X2 r2 = r0.A01
            java.lang.String r1 = "file_path"
            java.util.Map r0 = r2.A00
            java.lang.String r0 = X.C90474aD.A0c(r1, r0)
            if (r0 != 0) goto L_0x0461
            java.lang.String r0 = "expressPathGarbageCollectWorker/doWork file path is null"
        L_0x0459:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x045c:
            X.4ow r1 = X.C97334ow.A00()
            return r1
        L_0x0461:
            java.io.File r0 = X.C90524aI.A0S(r0)
            X.AnonymousClass6YY.A0P(r0)
            java.lang.String r1 = "end_hash"
            java.util.Map r0 = r2.A00
            java.lang.String r1 = X.C90474aD.A0c(r1, r0)
            if (r1 != 0) goto L_0x0475
            java.lang.String r0 = "expressPathGarbageCollectWorker/doWork encrypted file hash is null"
            goto L_0x0459
        L_0x0475:
            X.66Q r0 = r3.A00
            boolean r0 = r0.A01(r1)
            if (r0 == 0) goto L_0x045c
            X.4ox r1 = X.C97344ox.A00()
            return r1
        L_0x0482:
            boolean r0 = r13 instanceof com.whatsapp.fieldstats.privatestats.PrivateStatsWorker
            if (r0 == 0) goto L_0x04a1
            r1 = r13
            com.whatsapp.fieldstats.privatestats.PrivateStatsWorker r1 = (com.whatsapp.fieldstats.privatestats.PrivateStatsWorker) r1
            java.lang.String r0 = "PrivateStatsWorker/doWork--->>> in doWork"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6X1 r3 = r1.A00
            X.0wU r2 = r3.A07
            r1 = 20
            X.3v5 r0 = new X.3v5
            r0.<init>(r3, r1)
            r2.Boy(r0)
            X.4ox r1 = X.C97344ox.A00()
            return r1
        L_0x04a1:
            boolean r0 = r13 instanceof com.whatsapp.cron.daily.RandomizedDailyCronWorker
            if (r0 == 0) goto L_0x04c3
            r0 = r13
            com.whatsapp.cron.daily.RandomizedDailyCronWorker r0 = (com.whatsapp.cron.daily.RandomizedDailyCronWorker) r0
            android.content.Context r0 = r0.A00
            X.0tq r0 = X.C36371kC.A0P(r0)
            X.0tq r0 = r0.AfI
            X.0tt r0 = r0.A00
            X.004 r0 = r0.A3X
            java.lang.Object r1 = r0.get()
            X.6pL r1 = (X.C142726pL) r1
            r0 = 1
            r1.A00(r0)
            X.4ox r1 = X.C97344ox.A00()
            return r1
        L_0x04c3:
            boolean r0 = r13 instanceof com.whatsapp.accountswitching.notifications.InactiveAccountNotificationDismissWorker
            if (r0 == 0) goto L_0x0534
            r3 = r13
            com.whatsapp.accountswitching.notifications.InactiveAccountNotificationDismissWorker r3 = (com.whatsapp.accountswitching.notifications.InactiveAccountNotificationDismissWorker) r3
            androidx.work.WorkerParameters r0 = r3.A01
            X.6X2 r5 = r0.A01
            java.lang.String r0 = "inactiveAccountNotificationId"
            r4 = -1
            int r2 = r5.A02(r0, r4)
            java.lang.String r1 = "inactiveAccountNotificationTag"
            java.util.Map r0 = r5.A00
            java.lang.String r1 = X.C90474aD.A0c(r1, r0)
            if (r2 == r4) goto L_0x052f
            if (r1 == 0) goto L_0x052f
            boolean r0 = X.AnonymousClass098.A06(r1)
            if (r0 != 0) goto L_0x052f
            X.0yb r0 = r3.A02
            android.app.NotificationManager r0 = r0.A07()
            X.C18740tg.A06(r0)
            r0.cancel(r1, r2)
            java.lang.String r0 = "InactiveAccountNotificationDismissWorker/doWork/call notification cancelled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "inactiveAccountNotificationLid"
            java.util.Map r0 = r5.A00
            java.lang.String r2 = X.C90474aD.A0c(r1, r0)
            java.lang.String r1 = "inactiveAccountNotificationCallId"
            java.util.Map r0 = r5.A00
            java.lang.String r1 = X.C90474aD.A0c(r1, r0)
            if (r2 == 0) goto L_0x052f
            int r0 = r2.length()
            if (r0 == 0) goto L_0x052f
            if (r1 == 0) goto L_0x052f
            int r0 = r1.length()
            if (r0 == 0) goto L_0x052f
            X.6On r0 = r3.A00
            r0.A03(r2, r1)
            X.6V1 r1 = r3.A01
            java.lang.String r0 = "InactiveAccountNotificationManager/showCallNotifications"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Z0 r0 = r1.A01
            X.3KU r0 = r0.A03(r2)
            if (r0 == 0) goto L_0x052f
            X.AnonymousClass6V1.A01(r0, r1)
        L_0x052f:
            X.4ox r1 = X.C97344ox.A00()
            return r1
        L_0x0534:
            androidx.work.WorkerParameters r0 = r13.A01
            X.6X2 r0 = r0.A01
            X.4ox r1 = new X.4ox
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.Worker.A09():X.5Xj");
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
