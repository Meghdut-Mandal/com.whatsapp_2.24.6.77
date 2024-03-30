package X;

import android.content.Context;
import android.os.ConditionVariable;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.6tA  reason: invalid class name and case insensitive filesystem */
public class C144986tA implements C160417ky {
    public boolean A00 = false;
    public final AnonymousClass2RM A01;
    public final ConditionVariable A02;
    public final /* synthetic */ C144596sV A03;

    public C144986tA(ConditionVariable conditionVariable, C144596sV r3, AnonymousClass2RM r4) {
        this.A03 = r3;
        this.A02 = conditionVariable;
        this.A01 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (r12 != 3) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014a, code lost:
        if (r0.intValue() != 0) goto L_0x014c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQw(int r14) {
        /*
            r13 = this;
            X.6sV r1 = r13.A03
            X.5FU r0 = r1.A0C
            r0.unregisterObserver(r13)
            boolean r3 = r1.A01
            r2 = 0
            if (r14 != 0) goto L_0x0029
            X.0wG r0 = r1.A09
            android.content.Context r0 = r0.A00
            boolean r0 = X.C34191gb.A08(r0)
            if (r0 == 0) goto L_0x0029
            X.0wQ r0 = r1.A03
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0029
            if (r3 == 0) goto L_0x01e0
            X.0v0 r0 = r1.A0A
            int r0 = r0.A0C()
            if (r0 == 0) goto L_0x0029
            r2 = 1
        L_0x0029:
            r6 = 1
            if (r2 == 0) goto L_0x01d2
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x01b7
            r4 = 1
        L_0x0032:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "local/backup/gdrive/random-wait-time-in-secs/"
            X.C36321k7.A1V(r0, r2, r4)
            X.0yC r2 = r1.A0E
            boolean r0 = X.AnonymousClass6Y6.A08(r2)
            if (r0 == 0) goto L_0x0175
            X.0zS r0 = r1.A0I
            X.6VR r8 = X.C90514aH.A0V(r0)
            java.lang.Integer r9 = X.C023109s.A00
            X.0v0 r7 = r1.A0A
            r11 = 0
            X.AnonymousClass00C.A0D(r2, r11)
            java.lang.StringBuilder r3 = X.C36401kF.A0t(r7, r6)
            java.lang.String r0 = "google-backup-worker/createWorkRequest with delay: "
            X.C36321k7.A1V(r0, r3, r4)
            X.6EH r10 = new X.6EH
            r10.<init>()
            java.lang.String r3 = "KEY_BACKUP_SCHEDULE"
            int r0 = X.AnonymousClass6Y6.A00(r7, r11)
            r10.A01(r3, r0)
            java.lang.String r11 = "KEY_MAX_NUMBER_OF_RETRIES"
            int r12 = r7.A0C()
            if (r12 == 0) goto L_0x007e
            r3 = 671(0x29f, float:9.4E-43)
            if (r12 == r6) goto L_0x016f
            r0 = 2
            r3 = 672(0x2a0, float:9.42E-43)
            if (r12 == r0) goto L_0x016f
            r0 = 3
            r3 = 673(0x2a1, float:9.43E-43)
            if (r12 == r0) goto L_0x016f
        L_0x007e:
            r0 = 0
        L_0x007f:
            r10.A01(r11, r0)
            java.lang.String r3 = "KEY_BACKUP_NETWORK_SETTING"
            int r0 = r7.A0D()
            r10.A01(r3, r0)
            X.6X2 r11 = r10.A00()
            X.67f r3 = new X.67f
            r3.<init>()
            r3.A01 = r6
            int r0 = r7.A0D()
            if (r0 != 0) goto L_0x016b
            java.lang.Integer r0 = X.C023109s.A0C
        L_0x009e:
            r3.A00 = r0
            java.lang.Class<com.whatsapp.backup.google.workers.GoogleBackupWorker> r0 = com.whatsapp.backup.google.workers.GoogleBackupWorker.class
            X.4pE r10 = new X.4pE
            r10.<init>(r0)
            X.6QA r0 = r10.A00
            r0.A0A = r11
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r10.A02(r4, r0)
            X.6Tb r0 = r3.A00()
            r10.A03(r0)
            java.lang.Integer r4 = X.C023109s.A01
            r0 = 901(0x385, float:1.263E-42)
            long r2 = X.C36441kJ.A0B(r2, r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r10.A05(r4, r0, r2)
            X.5s0 r2 = r10.A00()
            X.4pG r2 = (X.C97404pG) r2
            java.lang.String r0 = "com.whatsapp.backup.google.google-backup-worker"
            X.6WE r4 = r8.A03(r2, r9, r0)
            X.1Ck r0 = r1.A05
            X.0v0 r0 = r0.A03
            boolean r0 = r0.A2I()
            if (r0 == 0) goto L_0x00f8
            java.lang.String r0 = r7.A0c()
            int r0 = r7.A0N(r0)
            if (r0 != r6) goto L_0x00f8
            java.lang.String r0 = "local/backup/gdrive/backupWithWorkManager add media re-encryption worker"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "com.whatsapp.backup.google.google-encrypted-re-upload-worker"
            r8.A0B(r0)
            r2 = 0
            X.4pG r0 = com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker.A01(r7, r2)
            X.6WE r4 = r4.A03(r0)
        L_0x00f8:
            java.lang.String r0 = "local/backup/gdrive/backupWithWorkManager enqueue work"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A02()
            r4 = 1
        L_0x0101:
            r2 = 0
            r1.A01 = r2
            boolean r0 = r13.A00
            if (r0 == 0) goto L_0x010f
            X.17Y r0 = r1.A02
            r0.A02()
            r13.A00 = r2
        L_0x010f:
            r3 = 3
            if (r14 != r3) goto L_0x0165
            X.0wG r0 = r1.A09
            android.content.Context r0 = r0.A00
            X.AnonymousClass6YO.A09(r0)
        L_0x0119:
            android.os.ConditionVariable r0 = r13.A02
            if (r0 == 0) goto L_0x0120
            r0.open()
        L_0x0120:
            int r0 = r1.A0S
            if (r0 == r6) goto L_0x012d
            int r2 = r1.A0S
            r0 = 2
            if (r2 == r0) goto L_0x012d
            int r0 = r1.A0S
            if (r0 != r3) goto L_0x0164
        L_0x012d:
            X.2RM r3 = r13.A01
            int r0 = r1.A0S
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A02 = r0
            int r0 = X.AnonymousClass6YO.A00(r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A03 = r0
            java.lang.Integer r0 = r3.A04
            if (r0 == 0) goto L_0x014c
            int r0 = r0.intValue()
            r2 = 1
            if (r0 == 0) goto L_0x014d
        L_0x014c:
            r2 = 0
        L_0x014d:
            X.0v0 r0 = r1.A0A
            int r0 = X.AnonymousClass6Y6.A00(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r3.A00 = r0
            X.0yW r0 = r1.A0F
            r0.Bly(r3)
        L_0x0164:
            return
        L_0x0165:
            r0 = 4
            if (r14 != r0) goto L_0x0119
            r1.A00 = r6
            goto L_0x0119
        L_0x016b:
            java.lang.Integer r0 = X.C023109s.A0G
            goto L_0x009e
        L_0x016f:
            int r0 = r2.A07(r3)
            goto L_0x007f
        L_0x0175:
            X.0wG r0 = r1.A09
            android.content.Context r8 = r0.A00
            java.lang.String r0 = "action_backup"
            android.content.Intent r7 = X.AnonymousClass190.A14(r8, r0)
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x01b4
            java.lang.String r2 = "user_initiated"
        L_0x0185:
            java.lang.String r0 = "backup_mode"
            r7.putExtra(r0, r2)
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            r0 = 0
            if (r3 < r2) goto L_0x01af
            android.app.PendingIntent r9 = X.C65743Th.A02(r8, r7)
        L_0x0195:
            X.19h r0 = r1.A07
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r7
            long r2 = r2 + r4
            r4 = 2
            X.19i r0 = r0.A00
            boolean r4 = r0.A01(r9, r4, r2)
            if (r4 != 0) goto L_0x0101
            java.lang.String r0 = "LocalBackupManager/runLocalBackup/onAfterBackup AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0101
        L_0x01af:
            android.app.PendingIntent r9 = X.C65743Th.A04(r8, r7, r0)
            goto L_0x0195
        L_0x01b4:
            java.lang.String r2 = "automated"
            goto L_0x0185
        L_0x01b7:
            java.util.Random r5 = new java.util.Random
            r5.<init>()
            X.0yC r2 = r1.A0E
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 956(0x3bc, float:1.34E-42)
            long r2 = X.C36441kJ.A0B(r2, r0)
            long r2 = r4.toSeconds(r2)
            int r0 = (int) r2
            int r0 = r5.nextInt(r0)
            long r4 = (long) r0
            goto L_0x0032
        L_0x01d2:
            X.0yC r4 = r1.A0E
            X.0zS r3 = r1.A0I
            X.0v0 r2 = r1.A0A
            X.1Cn r0 = r1.A04
            X.C109835Zh.A00(r0, r2, r4, r3)
            r4 = 0
            goto L_0x0101
        L_0x01e0:
            X.0yC r6 = r1.A0E
            X.0v0 r5 = r1.A0A
            java.util.concurrent.Executor r0 = X.AnonymousClass6Y6.A00
            long r7 = java.lang.System.currentTimeMillis()
            int r4 = r5.A0C()
            java.lang.String r0 = r5.A0c()
            long r9 = r5.A0T(r0)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x020d
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "gdrive-util/should-backup/last-backup-timestamp-is-in-future/"
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = " , ignoring it"
            X.C36321k7.A1a(r2, r0)
            r9 = -1
        L_0x020d:
            r2 = 1
            r0 = 0
            if (r4 == 0) goto L_0x025a
            if (r4 == r2) goto L_0x0029
            r3 = 2
            if (r4 == r3) goto L_0x024e
            r3 = 3
            if (r4 == r3) goto L_0x0230
            r0 = 4
            if (r4 == r0) goto L_0x025d
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "gdrive-util/should-backup frequency has unexpected value: "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = ", no auto backups will be performed."
            X.C36321k7.A1Z(r2, r0)
        L_0x022d:
            r2 = 0
            goto L_0x0029
        L_0x0230:
            r11 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            boolean r3 = X.AnonymousClass6Y6.A06(r5, r6, r7, r9, r11)
            if (r3 != 0) goto L_0x0029
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.Object[] r4 = new java.lang.Object[r2]
            long r7 = r7 - r9
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = r7 / r2
            X.AnonymousClass000.A1M(r4, r0, r7)
            java.lang.String r0 = "gdrive-util/should-backup/frequency/monthly its only %d days since the last successful backup."
            java.lang.String r0 = java.lang.String.format(r5, r0, r4)
            goto L_0x025f
        L_0x024e:
            r11 = 604800000(0x240c8400, double:2.988109026E-315)
            boolean r0 = X.AnonymousClass6Y6.A06(r5, r6, r7, r9, r11)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "gdrive-util/should-backup/frequency/weekly its not 7 days since the last successful backup."
            goto L_0x025f
        L_0x025a:
            java.lang.String r0 = "gdrive-util/should-backup/frequency/none"
            goto L_0x025f
        L_0x025d:
            java.lang.String r0 = "gdrive-util/should-backup/frequency/manual"
        L_0x025f:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x022d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144986tA.BQw(int):void");
    }

    public void BS6() {
        C144596sV r4 = this.A03;
        r4.A00 = false;
        AnonymousClass17Y r8 = r4.A02;
        r8.A05(R.string.f12nameremoved, R.string.f12nameremoved);
        this.A00 = true;
        Calendar instance = Calendar.getInstance();
        C90474aD.A1Q(instance, 0);
        instance.set(11, 2);
        long timeInMillis = instance.getTimeInMillis();
        C18820ts r6 = r4.A0B;
        r8.A0J(AnonymousClass3UM.A01(r6, C36391kE.A0v(r4.A09.A00, AnonymousClass3UM.A00(r6, timeInMillis), new Object[1], 0, R.string.f12nameremoved), timeInMillis));
    }

    public void BUy() {
        Log.i("app/backup/critical part completed");
        this.A03.A02.A0H(new C81113wU((Object) this, 28));
    }

    public void Bdj(int i) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        boolean A1b = C36361kB.A1b(objArr, i);
        String format = String.format(locale, "app/backup/progress/%d%%", objArr);
        int i2 = 5;
        if (i % 10 == 0) {
            i2 = 3;
        }
        Log.log(i2, format);
        if (this.A00) {
            Calendar instance = Calendar.getInstance();
            C90474aD.A1Q(instance, A1b ? 1 : 0);
            instance.set(11, 2);
            long timeInMillis = instance.getTimeInMillis();
            C144596sV r0 = this.A03;
            AnonymousClass17Y r7 = r0.A02;
            C18820ts r6 = r0.A0B;
            Context context = r0.A09.A00;
            Object[] objArr2 = new Object[2];
            C36371kC.A1M(r6, objArr2, i, A1b);
            r7.A0J(AnonymousClass3UM.A01(r6, C36391kE.A0v(context, AnonymousClass3UM.A00(r6, timeInMillis), objArr2, 1, R.string.f12nameremoved), timeInMillis));
        }
    }
}
