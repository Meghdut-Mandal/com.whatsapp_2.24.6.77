package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.C101134x3;
import X.C129096Ez;
import X.C36321k7;
import X.C95104jz;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

public class AlarmService extends C95104jz {
    public WhatsAppLibLoader A00;
    public AnonymousClass005 A01;
    public volatile C129096Ez A02;

    public boolean A09() {
        boolean z;
        C129096Ez r3 = this.A02;
        if (r3 == null) {
            return false;
        }
        if (r3 instanceof C101134x3) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AlarmService/onStopCurrentWork; retry=");
        A0u.append(z);
        A0u.append(", handler= ");
        C36321k7.A1a(A0u, AnonymousClass000.A0k(r3));
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:226:0x053f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0540, code lost:
        r0.A02 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0544, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04d3 A[SYNTHETIC, Splitter:B:209:0x04d3] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04e0 A[Catch:{ all -> 0x053f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.content.Intent r30) {
        /*
            r29 = this;
            r3 = r30
            java.lang.String r5 = r3.getAction()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AlarmService/onHandleWork received intent with action "
            X.C36321k7.A1Q(r0, r5, r1)
            if (r5 != 0) goto L_0x0017
            java.lang.String r0 = "AlarmService/onHandleWork received null action in intent"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0017:
            r0 = r29
            com.whatsapp.nativelibloader.WhatsAppLibLoader r1 = r0.A00
            boolean r1 = r1.A04()
            if (r1 != 0) goto L_0x0027
            java.lang.String r0 = "AlarmService/onHandleWork skip, native libraries missing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0027:
            r22 = 0
            java.lang.String r1 = "com.whatsapp.action.SETUP"
            boolean r1 = android.text.TextUtils.equals(r5, r1)     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x0179
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "AlarmService/setup; intent="
            X.C36321k7.A1K(r3, r1, r2)     // Catch:{ all -> 0x053f }
            X.005 r1 = r0.A01     // Catch:{ all -> 0x053f }
            java.util.Iterator r8 = X.C90474aD.A0q(r1)     // Catch:{ all -> 0x053f }
        L_0x0040:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x053a
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x053f }
            X.6Ez r2 = (X.C129096Ez) r2     // Catch:{ all -> 0x053f }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "AlarmService/setup: "
            r3.append(r1)     // Catch:{ all -> 0x053f }
            java.lang.String r1 = X.AnonymousClass000.A0k(r2)     // Catch:{ all -> 0x053f }
            X.C36321k7.A1a(r3, r1)     // Catch:{ all -> 0x053f }
            boolean r1 = r2 instanceof X.C101164x6     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x0066
            X.4x6 r2 = (X.C101164x6) r2     // Catch:{ all -> 0x053f }
            X.C101164x6.A02(r2)     // Catch:{ all -> 0x053f }
            goto L_0x0040
        L_0x0066:
            boolean r1 = r2 instanceof X.C101124x2     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x0118
            X.4x2 r2 = (X.C101124x2) r2     // Catch:{ all -> 0x053f }
            X.0yC r3 = r2.A01     // Catch:{ all -> 0x053f }
            r1 = 170(0xaa, float:2.38E-43)
            boolean r1 = r3.A0E(r1)     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x00c5
            java.lang.String r1 = "NtpAction; cancelling ntp sync using alarm manager."
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x053f }
            java.lang.String r3 = "com.whatsapp.action.UPDATE_NTP"
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            android.app.PendingIntent r3 = r2.A03(r3, r1)     // Catch:{ all -> 0x053f }
            if (r3 == 0) goto L_0x0093
            X.0yb r1 = r2.A00     // Catch:{ all -> 0x053f }
            android.app.AlarmManager r1 = r1.A05()     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x0090
            r1.cancel(r3)     // Catch:{ all -> 0x053f }
        L_0x0090:
            r3.cancel()     // Catch:{ all -> 0x053f }
        L_0x0093:
            java.lang.String r1 = "NtpAction; setting ntp sync using work manager."
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x053f }
            X.636 r7 = r2.A02     // Catch:{ all -> 0x053f }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x053f }
            X.4pF r3 = new X.4pF     // Catch:{ all -> 0x053f }
            r3.<init>(r1, r1)     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "tag.whatsapp.time.ntp"
            r3.A06(r1)     // Catch:{ all -> 0x053f }
            X.5s0 r5 = r3.A00()     // Catch:{ all -> 0x053f }
            X.4pH r5 = (X.C97414pH) r5     // Catch:{ all -> 0x053f }
            X.0zS r6 = r7.A02     // Catch:{ all -> 0x053f }
            X.6VR r4 = X.C90514aH.A0V(r6)     // Catch:{ all -> 0x053f }
            java.lang.Integer r3 = X.C023109s.A01     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "name.whatsapp.time.ntp"
            r4.A02(r5, r3, r1)     // Catch:{ all -> 0x053f }
            X.0wg r3 = r7.A01     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "ntp-scheduler"
            android.content.SharedPreferences$Editor r5 = X.C36381kD.A0G(r3, r1)     // Catch:{ all -> 0x053f }
            monitor-enter(r6)     // Catch:{ all -> 0x053f }
            long r3 = r6.A00     // Catch:{ all -> 0x0176 }
            goto L_0x010b
        L_0x00c5:
            java.lang.String r1 = "NtpAction; cancelling ntp sync using work manager."
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x053f }
            X.636 r1 = r2.A02     // Catch:{ all -> 0x053f }
            X.0zS r4 = r1.A02     // Catch:{ all -> 0x053f }
            X.6VR r3 = X.C90514aH.A0V(r4)     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "name.whatsapp.time.ntp"
            r3.A0B(r1)     // Catch:{ all -> 0x053f }
            X.6VR r3 = X.C90514aH.A0V(r4)     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "tag.whatsapp.time.ntp"
            r3.A0A(r1)     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "NtpAction; setting up ntp sync using alarm manager."
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x053f }
            java.lang.String r3 = "com.whatsapp.action.UPDATE_NTP"
            r1 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r15 = r2.A03(r3, r1)     // Catch:{ all -> 0x053f }
            X.0yb r1 = r2.A00     // Catch:{ all -> 0x053f }
            android.app.AlarmManager r9 = r1.A05()     // Catch:{ all -> 0x053f }
            if (r9 == 0) goto L_0x0105
            r10 = 3
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x053f }
            r11 = 43200000(0x2932e00, double:2.1343636E-316)
            long r11 = r11 + r3
            r13 = 43200000(0x2932e00, double:2.1343636E-316)
            r9.setInexactRepeating(r10, r11, r13, r15)     // Catch:{ all -> 0x053f }
            goto L_0x0111
        L_0x0105:
            java.lang.String r1 = "NtpAction/setupUpdateNtpAlarm AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x053f }
            goto L_0x0111
        L_0x010b:
            monitor-exit(r6)     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "/ntp/work_manager_init"
            X.C36341k9.A0w(r5, r1, r3)     // Catch:{ all -> 0x053f }
        L_0x0111:
            r1 = r22
            X.C101124x2.A00(r1, r2)     // Catch:{ all -> 0x053f }
            goto L_0x0040
        L_0x0118:
            boolean r1 = r2 instanceof X.C101114x1     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x0152
            X.4x1 r2 = (X.C101114x1) r2     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "HourlyCronAction; setting hourly cron using alarms"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x053f }
            java.lang.String r3 = "com.whatsapp.action.HOURLY_CRON"
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            android.app.PendingIntent r1 = r2.A03(r3, r1)     // Catch:{ all -> 0x053f }
            if (r1 != 0) goto L_0x0040
            X.0yb r1 = r2.A00     // Catch:{ all -> 0x053f }
            android.app.AlarmManager r9 = r1.A05()     // Catch:{ all -> 0x053f }
            if (r9 == 0) goto L_0x014b
            r1 = 0
            android.app.PendingIntent r15 = r2.A03(r3, r1)     // Catch:{ all -> 0x053f }
            r10 = 3
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x053f }
            r11 = 3600000(0x36ee80, double:1.7786363E-317)
            long r11 = r11 + r1
            r13 = 3600000(0x36ee80, double:1.7786363E-317)
            r9.setInexactRepeating(r10, r11, r13, r15)     // Catch:{ all -> 0x053f }
            goto L_0x0040
        L_0x014b:
            java.lang.String r1 = "HourlyCronAction; setup skipped, AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x053f }
            goto L_0x0040
        L_0x0152:
            boolean r1 = r2 instanceof X.C101144x4     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x015d
            X.4x4 r2 = (X.C101144x4) r2     // Catch:{ all -> 0x053f }
            X.C101144x4.A01(r2)     // Catch:{ all -> 0x053f }
            goto L_0x0040
        L_0x015d:
            boolean r1 = r2 instanceof X.C101154x5     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x016b
            X.4x5 r2 = (X.C101154x5) r2     // Catch:{ all -> 0x053f }
            X.C101154x5.A01(r2)     // Catch:{ all -> 0x053f }
            X.C101154x5.A00(r2)     // Catch:{ all -> 0x053f }
            goto L_0x0040
        L_0x016b:
            boolean r1 = r2 instanceof X.C101134x3     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x0040
            X.4x3 r2 = (X.C101134x3) r2     // Catch:{ all -> 0x053f }
            X.C101134x3.A00(r2)     // Catch:{ all -> 0x053f }
            goto L_0x0040
        L_0x0176:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x053f }
            throw r1     // Catch:{ all -> 0x053f }
        L_0x0179:
            X.005 r1 = r0.A01     // Catch:{ all -> 0x053f }
            java.util.Iterator r7 = X.C90474aD.A0q(r1)     // Catch:{ all -> 0x053f }
        L_0x017f:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x0531
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x053f }
            X.6Ez r6 = (X.C129096Ez) r6     // Catch:{ all -> 0x053f }
            boolean r4 = r6 instanceof X.C101164x6     // Catch:{ all -> 0x053f }
            if (r4 == 0) goto L_0x0196
            java.lang.String r1 = "com.whatsapp.action.ROTATE_SIGNED_PREKEY"
            boolean r1 = X.C90514aH.A1W(r3, r1)     // Catch:{ all -> 0x053f }
            goto L_0x01d8
        L_0x0196:
            boolean r1 = r6 instanceof X.C101124x2     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x01a1
            java.lang.String r1 = "com.whatsapp.action.UPDATE_NTP"
            boolean r1 = X.C90514aH.A1W(r3, r1)     // Catch:{ all -> 0x053f }
            goto L_0x01d8
        L_0x01a1:
            boolean r1 = r6 instanceof X.C101114x1     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x01ac
            java.lang.String r1 = "com.whatsapp.action.HOURLY_CRON"
            boolean r1 = X.C90514aH.A1W(r3, r1)     // Catch:{ all -> 0x053f }
            goto L_0x01d8
        L_0x01ac:
            boolean r1 = r6 instanceof X.C101144x4     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x01b7
            java.lang.String r1 = "com.whatsapp.action.HEARTBEAT_WAKEUP"
            boolean r1 = X.C90514aH.A1W(r3, r1)     // Catch:{ all -> 0x053f }
            goto L_0x01d8
        L_0x01b7:
            boolean r1 = r6 instanceof X.C101154x5     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x01ce
            java.lang.String r2 = r3.getAction()     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "com.whatsapp.action.DAILY_CRON"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x053f }
            if (r1 != 0) goto L_0x01da
            java.lang.String r1 = "com.whatsapp.action.DAILY_CATCHUP_CRON"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x053f }
            goto L_0x01d8
        L_0x01ce:
            boolean r1 = r6 instanceof X.C101134x3     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x017f
            java.lang.String r1 = "com.whatsapp.action.BACKUP_MESSAGES"
            boolean r1 = X.C90514aH.A1W(r3, r1)     // Catch:{ all -> 0x053f }
        L_0x01d8:
            if (r1 == 0) goto L_0x017f
        L_0x01da:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "AlarmService/onHandleWork: handling "
            r2.append(r1)     // Catch:{ all -> 0x053f }
            r2.append(r5)     // Catch:{ all -> 0x053f }
            java.lang.String r1 = " using "
            r2.append(r1)     // Catch:{ all -> 0x053f }
            java.lang.String r1 = X.AnonymousClass000.A0k(r6)     // Catch:{ all -> 0x053f }
            X.C36321k7.A1a(r2, r1)     // Catch:{ all -> 0x053f }
            r0.A02 = r6     // Catch:{ all -> 0x053f }
            if (r4 == 0) goto L_0x01fd
            X.4x6 r6 = (X.C101164x6) r6     // Catch:{ all -> 0x053f }
            X.C101164x6.A00(r3, r6)     // Catch:{ all -> 0x053f }
            goto L_0x053a
        L_0x01fd:
            boolean r1 = r6 instanceof X.C101124x2     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x0208
            X.4x2 r6 = (X.C101124x2) r6     // Catch:{ all -> 0x053f }
            X.C101124x2.A00(r3, r6)     // Catch:{ all -> 0x053f }
            goto L_0x053a
        L_0x0208:
            boolean r1 = r6 instanceof X.C101114x1     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x0248
            X.4x1 r6 = (X.C101114x1) r6     // Catch:{ all -> 0x053f }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x053f }
            long r1 = X.C101114x1.A02     // Catch:{ all -> 0x053f }
            long r4 = r4 - r1
            r2 = 1800000(0x1b7740, double:8.89318E-318)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0223
            java.lang.String r1 = "HourlyCronAction; too soon, skipping..."
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x053f }
            goto L_0x053a
        L_0x0223:
            java.lang.String r1 = "HourlyCronAction; executing hourly cron"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x053f }
            X.5lk r1 = r6.A01     // Catch:{ all -> 0x053f }
            java.util.Set r1 = r1.A00     // Catch:{ all -> 0x053f }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x053f }
        L_0x0230:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x0240
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x053f }
            X.1FP r1 = (X.AnonymousClass1FP) r1     // Catch:{ all -> 0x053f }
            r1.BYy()     // Catch:{ all -> 0x053f }
            goto L_0x0230
        L_0x0240:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x053f }
            X.C101114x1.A02 = r1     // Catch:{ all -> 0x053f }
            goto L_0x053a
        L_0x0248:
            boolean r1 = r6 instanceof X.C101144x4     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x0253
            X.4x4 r6 = (X.C101144x4) r6     // Catch:{ all -> 0x053f }
            X.C101144x4.A00(r3, r6)     // Catch:{ all -> 0x053f }
            goto L_0x053a
        L_0x0253:
            boolean r1 = r6 instanceof X.C101154x5     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x03c6
            X.4x5 r6 = (X.C101154x5) r6     // Catch:{ all -> 0x053f }
            java.lang.String r5 = "daily_cron"
            r4 = 0
            X.0z9 r7 = r6.A05     // Catch:{ all -> 0x03bf }
            r8 = 1
            r7.A01(r5, r8)     // Catch:{ all -> 0x03bf }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x03bf }
            java.lang.String r1 = "DailyCronAction/dailyCron intent="
            X.C36321k7.A1K(r3, r1, r2)     // Catch:{ all -> 0x03bf }
            X.0yb r1 = r6.A01     // Catch:{ all -> 0x03bf }
            android.os.PowerManager r2 = r1.A0G()     // Catch:{ all -> 0x03bf }
            if (r2 != 0) goto L_0x027a
            java.lang.String r1 = "DailyCronAction/dailyCron pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x03bf }
            r3 = 0
            goto L_0x0289
        L_0x027a:
            java.lang.String r1 = "DailyCronAction#dailyCron"
            android.os.PowerManager$WakeLock r3 = X.C111765co.A00(r2, r1, r8)     // Catch:{ all -> 0x03bf }
            r3.setReferenceCounted(r4)     // Catch:{ all -> 0x03bf }
            r1 = 600000(0x927c0, double:2.964394E-318)
            r3.acquire(r1)     // Catch:{ all -> 0x03bf }
        L_0x0289:
            X.C101154x5.A01(r6)     // Catch:{ all -> 0x03b5 }
            boolean r1 = X.C101154x5.A02(r6)     // Catch:{ all -> 0x03b5 }
            if (r1 == 0) goto L_0x0299
            java.lang.String r1 = "DailyCronAction/dailyCron; too frequent, skipping..."
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x03b5 }
            goto L_0x039f
        L_0x0299:
            X.1A2 r1 = r6.A04     // Catch:{ all -> 0x03b5 }
            java.lang.String r25 = "daily-cron"
            X.0yW r1 = r1.A00     // Catch:{ all -> 0x03b5 }
            r23 = r1
            java.util.concurrent.atomic.AtomicBoolean r21 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x03b5 }
            r1 = r21
            r1.<init>(r4)     // Catch:{ all -> 0x03b5 }
            long r27 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03b5 }
            boolean r1 = com.whatsapp.util.Log.rotate()     // Catch:{ all -> 0x03ac }
            if (r1 == 0) goto L_0x02b5
            com.whatsapp.util.Log.compress()     // Catch:{ all -> 0x03ac }
        L_0x02b5:
            java.io.File r11 = com.whatsapp.util.Log.logFile     // Catch:{ all -> 0x03ac }
            java.lang.String r8 = ".gz"
            r11.getAbsolutePath()     // Catch:{ all -> 0x03ac }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x03ac }
            java.lang.String r1 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x03ac }
            r10.<init>(r1, r2)     // Catch:{ all -> 0x03ac }
            java.util.Date r20 = new java.util.Date     // Catch:{ all -> 0x03ac }
            r20.<init>()     // Catch:{ all -> 0x03ac }
            java.lang.String r19 = r10.toPattern()     // Catch:{ all -> 0x03ac }
            java.lang.String r1 = r11.getName()     // Catch:{ all -> 0x03ac }
            java.lang.String r15 = X.AnonymousClass6UF.A02(r1, r8)     // Catch:{ all -> 0x03ac }
            java.lang.String r1 = r11.getName()     // Catch:{ all -> 0x03ac }
            java.lang.String r14 = X.AnonymousClass6UF.A01(r1)     // Catch:{ all -> 0x03ac }
            r9 = 0
            java.io.File r1 = r11.getParentFile()     // Catch:{ all -> 0x03ac }
            java.io.File[] r8 = r1.listFiles()     // Catch:{ all -> 0x03ac }
            if (r8 == 0) goto L_0x033d
            int r13 = r8.length     // Catch:{ all -> 0x03ac }
        L_0x02ea:
            if (r9 >= r13) goto L_0x033d
            r18 = r8[r9]     // Catch:{ all -> 0x03ac }
            java.lang.String r12 = r18.getName()     // Catch:{ all -> 0x03ac }
            boolean r1 = r12.startsWith(r14)     // Catch:{ all -> 0x03ac }
            if (r1 == 0) goto L_0x033a
            boolean r1 = r12.endsWith(r15)     // Catch:{ all -> 0x03ac }
            if (r1 == 0) goto L_0x033a
            int r11 = r14.length()     // Catch:{ all -> 0x03ac }
            int r1 = r19.length()     // Catch:{ all -> 0x03ac }
            int r2 = r11 + r1
            int r1 = r12.length()     // Catch:{ all -> 0x03ac }
            if (r2 > r1) goto L_0x033a
            java.lang.String r1 = r12.substring(r11, r2)     // Catch:{ all -> 0x03ac }
            java.util.Date r1 = r10.parse(r1)     // Catch:{ SecurityException | ParseException -> 0x033a }
            long r11 = r20.getTime()     // Catch:{ SecurityException | ParseException -> 0x033a }
            long r1 = r1.getTime()     // Catch:{ SecurityException | ParseException -> 0x033a }
            long r11 = r11 - r1
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ SecurityException | ParseException -> 0x033a }
            long r1 = X.C90484aE.A0K(r1)     // Catch:{ SecurityException | ParseException -> 0x033a }
            long r11 = r11 / r1
            long r16 = java.lang.Math.abs(r11)     // Catch:{ SecurityException | ParseException -> 0x033a }
            r1 = 3
            long r1 = (long) r1     // Catch:{ SecurityException | ParseException -> 0x033a }
            int r11 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0334
            r18.getAbsolutePath()     // Catch:{ SecurityException | ParseException -> 0x033a }
            goto L_0x033a
        L_0x0334:
            r18.getAbsolutePath()     // Catch:{ SecurityException | ParseException -> 0x033a }
            r18.delete()     // Catch:{ SecurityException | ParseException -> 0x033a }
        L_0x033a:
            int r9 = r9 + 1
            goto L_0x02ea
        L_0x033d:
            X.63s r10 = r6.A00     // Catch:{ all -> 0x03ac }
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            X.0v0 r9 = r10.A03     // Catch:{ all -> 0x03ac }
            java.lang.String r8 = "phoneid_last_sync_timestamp"
            boolean r1 = r9.A2V(r8, r1)     // Catch:{ all -> 0x03ac }
            if (r1 != 0) goto L_0x0358
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03ac }
            long r11 = r9.A0V(r8)     // Catch:{ all -> 0x03ac }
            int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x035e
        L_0x0358:
            r10.A00()     // Catch:{ all -> 0x03ac }
            r9.A1Z(r8)     // Catch:{ all -> 0x03ac }
        L_0x035e:
            X.5py r2 = r6.A03     // Catch:{ all -> 0x03ac }
            X.12P r1 = r2.A00     // Catch:{ all -> 0x03ac }
            r1.A06()     // Catch:{ all -> 0x03ac }
            boolean r8 = r1.A08     // Catch:{ all -> 0x03ac }
            if (r8 != 0) goto L_0x036e
            java.lang.String r1 = "DailyCronExecutor/executeDailyCron: messageStore not ready, skipping crons that need it."
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x03ac }
        L_0x036e:
            X.005 r1 = r2.A01     // Catch:{ all -> 0x03ac }
            java.util.Iterator r2 = X.C90474aD.A0q(r1)     // Catch:{ all -> 0x03ac }
        L_0x0374:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x03ac }
            if (r1 == 0) goto L_0x0389
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x03ac }
            X.1aW r1 = (X.C30631aW) r1     // Catch:{ all -> 0x03ac }
            r1.BV2()     // Catch:{ all -> 0x03ac }
            if (r8 == 0) goto L_0x0374
            r1.BV3()     // Catch:{ all -> 0x03ac }
            goto L_0x0374
        L_0x0389:
            r24 = r22
            r26 = r21
            X.C54992tt.A00(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x03b5 }
            X.0v0 r8 = r6.A02     // Catch:{ all -> 0x03b5 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03b5 }
            android.content.SharedPreferences$Editor r9 = X.C19420v0.A00(r8)     // Catch:{ all -> 0x03b5 }
            java.lang.String r8 = "last_daily_cron"
            X.C36341k9.A0w(r9, r8, r1)     // Catch:{ all -> 0x03b5 }
        L_0x039f:
            X.C101154x5.A00(r6)     // Catch:{ all -> 0x03bf }
            if (r3 == 0) goto L_0x03a7
            r3.release()     // Catch:{ all -> 0x03bf }
        L_0x03a7:
            r7.A01(r5, r4)     // Catch:{ all -> 0x053f }
            goto L_0x053a
        L_0x03ac:
            r1 = move-exception
            r24 = r22
            r26 = r21
            X.C54992tt.A00(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x03b5 }
            throw r1     // Catch:{ all -> 0x03b5 }
        L_0x03b5:
            r1 = move-exception
            X.C101154x5.A00(r6)     // Catch:{ all -> 0x03bf }
            if (r3 == 0) goto L_0x03be
            r3.release()     // Catch:{ all -> 0x03bf }
        L_0x03be:
            throw r1     // Catch:{ all -> 0x03bf }
        L_0x03bf:
            r2 = move-exception
            X.0z9 r1 = r6.A05     // Catch:{ all -> 0x053f }
            r1.A01(r5, r4)     // Catch:{ all -> 0x053f }
            throw r2     // Catch:{ all -> 0x053f }
        L_0x03c6:
            boolean r1 = r6 instanceof X.C101134x3     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x051f
            X.4x3 r6 = (X.C101134x3) r6     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "backupMessages"
            X.14g r7 = new X.14g     // Catch:{ all -> 0x053f }
            r7.<init>((java.lang.String) r1)     // Catch:{ all -> 0x053f }
            X.2RM r15 = new X.2RM     // Catch:{ all -> 0x053f }
            r15.<init>()     // Catch:{ all -> 0x053f }
            r14 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x053f }
            r15.A04 = r1     // Catch:{ all -> 0x053f }
            java.lang.Long r1 = X.C90484aE.A0g()     // Catch:{ all -> 0x053f }
            r15.A05 = r1     // Catch:{ all -> 0x053f }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "BackupMessagesAction/backupMessages; intent="
            X.C36321k7.A1K(r3, r1, r2)     // Catch:{ all -> 0x053f }
            X.0yb r1 = r6.A06     // Catch:{ all -> 0x053f }
            android.os.PowerManager r13 = r1.A0G()     // Catch:{ all -> 0x053f }
            r11 = 0
            r3 = 600000(0x927c0, double:2.964394E-318)
            r12 = 0
            if (r13 != 0) goto L_0x0402
            java.lang.String r1 = "BackupMessagesAction/backupMessages pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x053f }
            r9 = r11
            goto L_0x040e
        L_0x0402:
            java.lang.String r1 = "BackupMessagesAction#backupMessages"
            android.os.PowerManager$WakeLock r9 = X.C111765co.A00(r13, r1, r14)     // Catch:{ all -> 0x053f }
            r9.setReferenceCounted(r12)     // Catch:{ all -> 0x053f }
            r9.acquire(r3)     // Catch:{ all -> 0x053f }
        L_0x040e:
            android.os.ConditionVariable r10 = new android.os.ConditionVariable     // Catch:{ all -> 0x053f }
            r10.<init>(r14)     // Catch:{ all -> 0x053f }
            android.os.ConditionVariable r8 = new android.os.ConditionVariable     // Catch:{ all -> 0x053f }
            r8.<init>(r14)     // Catch:{ all -> 0x053f }
            X.0wQ r5 = r6.A03     // Catch:{ all -> 0x051b }
            r5.A0G()     // Catch:{ all -> 0x051b }
            com.whatsapp.Me r1 = r5.A00     // Catch:{ all -> 0x051b }
            if (r1 != 0) goto L_0x0428
            java.lang.String r1 = "BackupMessagesAction/backupMessages skipping message backup due to not yet registered"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x051b }
            r2 = 2
            goto L_0x047a
        L_0x0428:
            X.12P r1 = r6.A0A     // Catch:{ all -> 0x051b }
            r1.A06()     // Catch:{ all -> 0x051b }
            boolean r1 = r1.A08     // Catch:{ all -> 0x051b }
            if (r1 != 0) goto L_0x0438
            java.lang.String r1 = "BackupMessagesAction/backupMessages skipping message backup due message store is not ready"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x051b }
            r2 = 6
            goto L_0x047a
        L_0x0438:
            X.1Cb r1 = r6.A05     // Catch:{ all -> 0x051b }
            boolean r2 = r1.A02()     // Catch:{ all -> 0x051b }
            if (r2 == 0) goto L_0x0455
            java.lang.String r2 = "BackupMessagesAction/backupMessages skipping message backup due to missing external writable media"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x051b }
            X.6sV r2 = r6.A09     // Catch:{ all -> 0x051b }
            X.005 r1 = r1.A00     // Catch:{ all -> 0x051b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x051b }
            X.36X r1 = (X.AnonymousClass36X) r1     // Catch:{ all -> 0x051b }
            boolean r1 = r1.A00     // Catch:{ all -> 0x051b }
            r2.A00 = r1     // Catch:{ all -> 0x051b }
            r2 = 3
            goto L_0x047a
        L_0x0455:
            X.15t r1 = r6.A04     // Catch:{ all -> 0x051b }
            X.15u r1 = r1.A00     // Catch:{ all -> 0x051b }
            boolean r1 = r1.A01()     // Catch:{ all -> 0x051b }
            if (r1 != 0) goto L_0x046a
            java.lang.String r1 = "BackupMessagesAction/backupMessages skipping message backup due to not plugged in and low battery"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x051b }
            X.6sV r1 = r6.A09     // Catch:{ all -> 0x051b }
            r1.A00 = r14     // Catch:{ all -> 0x051b }
            r2 = 4
            goto L_0x047a
        L_0x046a:
            X.0zA r1 = r6.A01     // Catch:{ all -> 0x051b }
            boolean r1 = r1.A00     // Catch:{ all -> 0x051b }
            if (r1 == 0) goto L_0x0498
            java.lang.String r1 = "BackupMessagesAction/backupMessages skipping message backup since app is in foreground"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x051b }
            X.6sV r1 = r6.A09     // Catch:{ all -> 0x051b }
            r1.A00 = r14     // Catch:{ all -> 0x051b }
            r2 = 5
        L_0x047a:
            X.0v0 r1 = r6.A07     // Catch:{ all -> 0x051b }
            int r1 = X.AnonymousClass6Y6.A00(r1, r12)     // Catch:{ all -> 0x051b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x051b }
            r15.A01 = r1     // Catch:{ all -> 0x051b }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x051b }
            r15.A00 = r1     // Catch:{ all -> 0x051b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x051b }
            r15.A03 = r1     // Catch:{ all -> 0x051b }
            X.0yW r1 = r6.A0D     // Catch:{ all -> 0x051b }
            r1.Bly(r15)     // Catch:{ all -> 0x051b }
            goto L_0x04ce
        L_0x0498:
            java.lang.String r1 = "BackupMessagesAction/backupMessages starting message backup"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x051b }
            X.6sV r2 = r6.A09     // Catch:{ all -> 0x051b }
            r2.A00 = r12     // Catch:{ all -> 0x051b }
            r10.close()     // Catch:{ all -> 0x051b }
            X.6tA r1 = new X.6tA     // Catch:{ all -> 0x051b }
            r1.<init>(r10, r2, r15)     // Catch:{ all -> 0x051b }
            r2.A02(r1, r14)     // Catch:{ all -> 0x051b }
            if (r13 != 0) goto L_0x04b4
            java.lang.String r1 = "BackupMessagesAction/backupMessages/media-cleanup pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ all -> 0x051b }
            goto L_0x04c3
        L_0x04b4:
            java.lang.String r1 = "BackupMessagesAction#backupMessages#mediaCleanup"
            android.os.PowerManager$WakeLock r11 = X.C111765co.A00(r13, r1, r14)     // Catch:{ all -> 0x051b }
            r11.setReferenceCounted(r12)     // Catch:{ all -> 0x051b }
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            r11.acquire(r1)     // Catch:{ all -> 0x051b }
        L_0x04c3:
            X.0wU r2 = r6.A0E     // Catch:{ all -> 0x051b }
            r1 = 49
            X.74N r1 = X.AnonymousClass74N.A00(r6, r11, r1)     // Catch:{ all -> 0x051b }
            r2.Boy(r1)     // Catch:{ all -> 0x051b }
        L_0x04ce:
            X.C101134x3.A00(r6)     // Catch:{ all -> 0x051b }
            if (r9 == 0) goto L_0x04d6
            r9.release()     // Catch:{ all -> 0x053f }
        L_0x04d6:
            r10.block(r3)     // Catch:{ all -> 0x053f }
            r5.A0G()     // Catch:{ all -> 0x053f }
            com.whatsapp.Me r1 = r5.A00     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x0512
            X.12P r1 = r6.A0A     // Catch:{ all -> 0x053f }
            r1.A06()     // Catch:{ all -> 0x053f }
            boolean r1 = r1.A08     // Catch:{ all -> 0x053f }
            if (r1 == 0) goto L_0x0512
            java.lang.String r1 = "backupMessages/db-migration"
            X.14g r9 = new X.14g     // Catch:{ all -> 0x053f }
            r9.<init>((java.lang.String) r1)     // Catch:{ all -> 0x053f }
            r8.close()     // Catch:{ all -> 0x053f }
            X.0wU r5 = r6.A0E     // Catch:{ all -> 0x053f }
            X.0yC r4 = r6.A0C     // Catch:{ all -> 0x053f }
            X.13S r3 = r6.A0B     // Catch:{ all -> 0x053f }
            X.005 r1 = r6.A0F     // Catch:{ all -> 0x053f }
            java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x053f }
            X.15r r2 = (X.C227615r) r2     // Catch:{ all -> 0x053f }
            X.74x r1 = new X.74x     // Catch:{ all -> 0x053f }
            r1.<init>(r8, r2, r3, r4)     // Catch:{ all -> 0x053f }
            r5.Boy(r1)     // Catch:{ all -> 0x053f }
            r1 = 1800000(0x1b7740, double:8.89318E-318)
            r8.block(r1)     // Catch:{ all -> 0x053f }
            r9.A01()     // Catch:{ all -> 0x053f }
        L_0x0512:
            java.lang.String r1 = "BackupMessagesAction/backupMessages done"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x053f }
            r7.A01()     // Catch:{ all -> 0x053f }
            goto L_0x053a
        L_0x051b:
            r1 = move-exception
            if (r9 == 0) goto L_0x0530
            goto L_0x052d
        L_0x051f:
            X.4x0 r6 = (X.C101104x0) r6     // Catch:{ all -> 0x053f }
            X.0v5 r1 = r6.A00     // Catch:{ all -> 0x053f }
            r1.A02()     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "clearAwayMessagesTable"
            java.lang.NullPointerException r1 = X.AnonymousClass001.A0A(r1)     // Catch:{ all -> 0x053f }
            goto L_0x0530
        L_0x052d:
            r9.release()     // Catch:{ all -> 0x053f }
        L_0x0530:
            throw r1     // Catch:{ all -> 0x053f }
        L_0x0531:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x053f }
            java.lang.String r1 = "AlarmService/onHandleWork: received unrecognized intent; intent="
            X.C36321k7.A1L(r3, r1, r2)     // Catch:{ all -> 0x053f }
        L_0x053a:
            r1 = r22
            r0.A02 = r1
            return
        L_0x053f:
            r2 = move-exception
            r1 = r22
            r0.A02 = r1
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AlarmService.A0A(android.content.Intent):void");
    }
}
