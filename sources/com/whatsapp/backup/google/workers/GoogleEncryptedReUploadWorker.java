package com.whatsapp.backup.google.workers;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass13I;
import X.AnonymousClass179;
import X.AnonymousClass190;
import X.AnonymousClass19A;
import X.AnonymousClass1WC;
import X.AnonymousClass58P;
import X.AnonymousClass65Q;
import X.C023109s;
import X.C101544xt;
import X.C101734yC;
import X.C109385Xj;
import X.C1271667f;
import X.C131096Ns;
import X.C132316Tb;
import X.C18800tq;
import X.C19420v0;
import X.C19600wD;
import X.C19630wG;
import X.C19700wN;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C20020wt;
import X.C20050ww;
import X.C20690y0;
import X.C20810yC;
import X.C20830yE;
import X.C21010yW;
import X.C21380z9;
import X.C21570zS;
import X.C24051Aw;
import X.C24341Cb;
import X.C24431Ck;
import X.C24461Cn;
import X.C25271Fq;
import X.C33101ei;
import X.C33121ek;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C90504aG;
import X.C90514aH;
import X.C97324ov;
import X.C97334ow;
import X.C97384pE;
import X.C97404pG;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GoogleEncryptedReUploadWorker extends Worker {
    public AnonymousClass65Q A00;
    public boolean A01 = false;
    public final C19700wN A02;
    public final C20690y0 A03;
    public final C19730wQ A04;
    public final C20050ww A05;
    public final C24461Cn A06;
    public final C24431Ck A07;
    public final C33101ei A08;
    public final C33121ek A09;
    public final C101734yC A0A;
    public final C131096Ns A0B;
    public final C19600wD A0C;
    public final AnonymousClass179 A0D;
    public final C24341Cb A0E;
    public final C19970wo A0F;
    public final C19630wG A0G;
    public final C20830yE A0H;
    public final C19420v0 A0I;
    public final C20810yC A0J;
    public final C21010yW A0K;
    public final AnonymousClass58P A0L = new AnonymousClass58P();
    public final AnonymousClass19A A0M;
    public final C24051Aw A0N;
    public final C20020wt A0O;
    public final C19770wU A0P;
    public final C21570zS A0Q;
    public final List A0R = AnonymousClass001.A0I();
    public final Random A0S;
    public final C25271Fq A0T;
    public final AnonymousClass190 A0U;
    public final AnonymousClass13I A0V;
    public final C21380z9 A0W;

    private C109385Xj A00(int i, int i2) {
        C19420v0 r2 = this.A0I;
        String A0c = r2.A0c();
        if (!TextUtils.isEmpty(A0c)) {
            AnonymousClass58P r22 = this.A0L;
            Long valueOf = Long.valueOf((System.currentTimeMillis() - r2.A0S(A0c)) / 3600000);
            r22.A08 = valueOf;
            r22.A05 = valueOf;
        }
        AnonymousClass58P r1 = this.A0L;
        if (i < 6) {
            r1.A02 = Integer.valueOf(i2);
            this.A0K.Bly(r1);
            return C97324ov.A00();
        }
        r1.A02 = C36401kF.A0h();
        this.A0K.Bly(r1);
        return C97334ow.A00();
    }

    public static C97404pG A01(C19420v0 r4, long j) {
        Integer num;
        C1271667f r1 = new C1271667f();
        r1.A01 = true;
        if (r4.A0D() == 0) {
            num = C023109s.A0C;
        } else {
            num = C023109s.A0G;
        }
        r1.A00 = num;
        C132316Tb A002 = r1.A00();
        C97384pE r42 = new C97384pE(GoogleEncryptedReUploadWorker.class);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r42.A02(j, timeUnit);
        r42.A03(A002);
        r42.A05(C023109s.A01, timeUnit, 900000);
        return (C97404pG) r42.A00();
    }

    public static void A03(String str, boolean z) {
        if (z) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("google-encrypted-re-upload-worker ");
            A0u.append(str);
            C36341k9.A1O(A0u, ", work aborted");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x039a, code lost:
        r26.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        r5.await();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03a1, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03b8, code lost:
        r1 = "gdrive/encrypted-re-upload/files failed to generate list of files to be uploaded.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03c6, code lost:
        r5.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03cd, code lost:
        if (r1.A00() == false) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03cf, code lost:
        r13 = r37.size();
        X.C36321k7.A1T("gdrive/encrypted-re-upload/files/files-to-be-uploaded/count/", X.AnonymousClass000.A0u(), r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03e0, code lost:
        if (r1.A00() == false) goto L_0x04e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03e2, code lost:
        r30.A0R.set(0);
        X.AnonymousClass00C.A0D(r6, 3);
        r14 = r6.size();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03f2, code lost:
        if (r5 >= r14) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03f4, code lost:
        r12 = r5 + 2500;
        r11 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03f7, code lost:
        if (r12 <= r14) goto L_0x03fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03f9, code lost:
        r11 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0409, code lost:
        if (X.AnonymousClass6UR.A00(new X.C101604xz(r8, r9, r6.subList(r5, r11)), r1, "gdrive/backup/files") != true) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x040b, code lost:
        r5 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x040d, code lost:
        r6 = false;
        com.whatsapp.util.Log.e("gdrive/encrypted-re-upload/files/failed to delete files");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0415, code lost:
        r5 = new java.util.concurrent.atomic.AtomicBoolean(true);
        r6 = new java.util.concurrent.atomic.AtomicReference((java.lang.Object) null);
        r11 = new java.util.concurrent.CountDownLatch(r13);
        r16 = r37.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x042f, code lost:
        if (r16.hasNext() == false) goto L_0x048c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0431, code lost:
        r14 = (X.AnonymousClass6FR) r16.next();
        X.AnonymousClass00C.A0B(r14);
        r13 = r14.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0440, code lost:
        if (r13.exists() != false) goto L_0x0459;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0442, code lost:
        r13 = X.AnonymousClass000.A0u();
        r13.append("gdrive/encrypted-re-upload/backup-file file ");
        r13.append("<file>");
        X.C36321k7.A1a(r13, " does not exist");
        r11.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x045f, code lost:
        if ((!r13.isDirectory()) == false) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0461, code lost:
        X.AnonymousClass6Y6.A00.execute(new X.AnonymousClass75A(r6, r30, r8, r14, r5, r11, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x047c, code lost:
        r5 = X.AnonymousClass000.A0u();
        r5.append("gdrive-service/backup-file/expected-file-got-directory-instead/");
        r1 = X.AnonymousClass000.A0g("<file>", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x048c, code lost:
        com.whatsapp.util.Log.i("gdrive/encrypted-re-upload/files waiting for backup to finish...");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r13 = r11.await(86400000, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04df, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        com.whatsapp.util.Log.e("gdrive/encrypted-re-upload", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0100, code lost:
        if (r1 == null) goto L_0x0102;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04df A[ExcHandler: 1ej | 5VQ (r5v19 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:86:0x0263] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x051b A[Catch:{ InterruptedException -> 0x049b, 1ej | 5VQ -> 0x04df, all -> 0x06ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x051d A[Catch:{ InterruptedException -> 0x049b, 1ej | 5VQ -> 0x04df, all -> 0x06ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x062d A[Catch:{ InterruptedException -> 0x049b, 1ej | 5VQ -> 0x04df, all -> 0x06ab }, LOOP:5: B:231:0x0627->B:233:0x062d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0184 A[Catch:{ InterruptedException -> 0x049b, 1ej | 5VQ -> 0x04df, all -> 0x06ab }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C109385Xj A09() {
        /*
            r58 = this;
            java.lang.String r18 = "GoogleDriveNotificationManager1"
            java.lang.String r22 = "gdrive_old_media_enc_re_upload"
            r3 = 0
            r2 = r58
            X.0yC r12 = r2.A0J     // Catch:{ all -> 0x06ab }
            r0 = 3129(0xc39, float:4.385E-42)
            boolean r0 = r12.A0E(r0)     // Catch:{ all -> 0x06ab }
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = "google-encrypted-re-upload-worker/publishNotification enable setForegroundAsync"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06ab }
            X.0wG r0 = r2.A0G     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            android.content.Context r6 = r0.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            X.0Yy r4 = X.C20600xp.A02(r6)     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            java.lang.String r0 = "chat_history_backup@1"
            r4.A0M = r0     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            r1 = 2
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass190.A1E(r6, r0, r0, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            android.app.PendingIntent r0 = X.C65743Th.A00(r6, r3, r0, r3)     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            r4.A0D = r0     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            X.C36361kB.A1A(r4)     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            r5 = 1
            r4.A0A = r5     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            android.content.res.Resources r1 = r6.getResources()     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            r0 = 2131896640(0x7f122940, float:1.9428147E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            r4.A0F(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            android.content.res.Resources r1 = r6.getResources()     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            r0 = 2131889203(0x7f120c33, float:1.9413063E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            r4.A0E(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            r0 = 100
            r4.A07(r0, r0, r5)     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            android.app.Notification r4 = r4.A05()     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            boolean r0 = X.C19550w8.A06()     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            if (r0 != 0) goto L_0x0060
            r5 = 0
        L_0x0060:
            r1 = 5
            X.6At r0 = new X.6At     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            r0.<init>(r1, r4, r5)     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            X.4pl r0 = r2.A04(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0073 }
            goto L_0x0073
        L_0x006e:
            java.lang.String r0 = "google-encrypted-re-upload-worker/publishNotification skip setForegroundAsync"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06ab }
        L_0x0073:
            X.0z9 r0 = r2.A0W     // Catch:{ all -> 0x06ab }
            r57 = r0
            r10 = 1
            r1 = r0
            r0 = r22
            r1.A01(r0, r10)     // Catch:{ all -> 0x06ab }
            androidx.work.WorkerParameters r0 = r2.A01     // Catch:{ all -> 0x06ab }
            int r7 = r0.A00     // Catch:{ all -> 0x06ab }
            X.58P r0 = r2.A0L     // Catch:{ all -> 0x06ab }
            r56 = r0
            java.lang.Long r1 = X.C36441kJ.A0y(r7)     // Catch:{ all -> 0x06ab }
            r0.A03 = r1     // Catch:{ all -> 0x06ab }
            X.0v0 r0 = r2.A0I     // Catch:{ all -> 0x06ab }
            r55 = r0
            java.lang.String r29 = r55.A0c()     // Catch:{ all -> 0x06ab }
            X.0wQ r5 = r2.A04     // Catch:{ all -> 0x06ab }
            r5.A0G()     // Catch:{ all -> 0x06ab }
            com.whatsapp.Me r4 = r5.A00     // Catch:{ all -> 0x06ab }
            X.1Ck r11 = r2.A07     // Catch:{ all -> 0x06ab }
            X.0v0 r0 = r11.A03     // Catch:{ all -> 0x06ab }
            r54 = r0
            boolean r0 = r54.A2I()     // Catch:{ all -> 0x06ab }
            boolean r1 = X.AnonymousClass000.A1Q(r0)
            java.lang.String r0 = "backup encryption is not enabled"
            A03(r0, r1)     // Catch:{ all -> 0x06ab }
            if (r1 != 0) goto L_0x068c
            X.1ei r0 = r2.A08     // Catch:{ all -> 0x06ab }
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0Q     // Catch:{ all -> 0x06ab }
            boolean r6 = r1.get()     // Catch:{ all -> 0x06ab }
            java.lang.String r1 = "backup is running"
            A03(r1, r6)     // Catch:{ all -> 0x06ab }
            if (r6 != 0) goto L_0x068c
            X.0wG r9 = r2.A0G     // Catch:{ all -> 0x06ab }
            android.content.Context r1 = r9.A00     // Catch:{ all -> 0x06ab }
            boolean r1 = X.C34191gb.A08(r1)     // Catch:{ all -> 0x06ab }
            boolean r6 = X.AnonymousClass000.A1Q(r1)
            java.lang.String r1 = "Google Drive is not accessible"
            A03(r1, r6)     // Catch:{ all -> 0x06ab }
            if (r6 != 0) goto L_0x068c
            boolean r6 = android.text.TextUtils.isEmpty(r29)     // Catch:{ all -> 0x06ab }
            java.lang.String r1 = "grdive account name is empty"
            A03(r1, r6)     // Catch:{ all -> 0x06ab }
            if (r6 != 0) goto L_0x068c
            X.13I r1 = r2.A0V     // Catch:{ all -> 0x06ab }
            boolean r6 = r1.A00     // Catch:{ all -> 0x06ab }
            java.lang.String r1 = "WhatsApp login has failed"
            A03(r1, r6)     // Catch:{ all -> 0x06ab }
            if (r6 != 0) goto L_0x068c
            X.0yE r1 = r2.A0H     // Catch:{ all -> 0x06ab }
            r24 = r1
            boolean r1 = r24.A0D()     // Catch:{ all -> 0x06ab }
            boolean r6 = X.AnonymousClass000.A1Q(r1)
            java.lang.String r1 = "read/write storage permission denied"
            A03(r1, r6)     // Catch:{ all -> 0x06ab }
            if (r6 != 0) goto L_0x068c
            if (r4 == 0) goto L_0x0102
            java.lang.String r1 = r4.jabber_id     // Catch:{ all -> 0x06ab }
            r4 = 0
            if (r1 != 0) goto L_0x0103
        L_0x0102:
            r4 = 1
        L_0x0103:
            java.lang.String r1 = "me or jabberId is null"
            A03(r1, r4)     // Catch:{ all -> 0x06ab }
            if (r4 != 0) goto L_0x068c
            boolean r4 = X.AnonymousClass6Y6.A05(r55)     // Catch:{ all -> 0x06ab }
            java.lang.String r1 = "media restore is pending"
            A03(r1, r4)     // Catch:{ all -> 0x06ab }
            if (r4 != 0) goto L_0x068c
            r0.A06()     // Catch:{ all -> 0x06ab }
            boolean r1 = r0.A09     // Catch:{ all -> 0x06ab }
            boolean r4 = X.AnonymousClass000.A1Q(r1)
            java.lang.String r1 = "sdcard is not available"
            A03(r1, r4)     // Catch:{ all -> 0x06ab }
            if (r4 == 0) goto L_0x012d
            r0 = 9
            X.5Xj r5 = r2.A00(r7, r0)     // Catch:{ all -> 0x06ab }
            goto L_0x0691
        L_0x012d:
            r0.A05()     // Catch:{ all -> 0x06ab }
            r0.A08()     // Catch:{ all -> 0x06ab }
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0U     // Catch:{ all -> 0x06ab }
            boolean r1 = r1.get()     // Catch:{ all -> 0x06ab }
            boolean r4 = X.AnonymousClass000.A1Q(r1)
            java.lang.String r1 = "network is not available"
            A03(r1, r4)     // Catch:{ all -> 0x06ab }
            if (r4 == 0) goto L_0x0154
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0V     // Catch:{ all -> 0x06ab }
            boolean r1 = r0.get()     // Catch:{ all -> 0x06ab }
            r0 = 5
            if (r1 == 0) goto L_0x014e
            r0 = 4
        L_0x014e:
            X.5Xj r5 = r2.A00(r7, r0)     // Catch:{ all -> 0x06ab }
            goto L_0x0691
        L_0x0154:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0R     // Catch:{ all -> 0x06ab }
            boolean r4 = r1.getAndSet(r10)     // Catch:{ all -> 0x06ab }
            java.lang.String r1 = "media re-encryption already running"
            A03(r1, r4)     // Catch:{ all -> 0x06ab }
            if (r4 == 0) goto L_0x0168
            r0 = 3
            X.5Xj r5 = r2.A00(r7, r0)     // Catch:{ all -> 0x06ab }
            goto L_0x0691
        L_0x0168:
            r0.A03()     // Catch:{ all -> 0x06ab }
            r5.A0G()     // Catch:{ all -> 0x06ab }
            com.whatsapp.Me r1 = r5.A00     // Catch:{ all -> 0x06ab }
            if (r1 != 0) goto L_0x0186
            java.lang.String r1 = "google-re-enc-upload-worker/my-jid/me is null, can't proceed"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x06ab }
        L_0x0177:
            java.lang.String r1 = "google-re-enc-upload-worker/handle-intent/backup jid is null."
        L_0x0179:
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x06ab }
        L_0x017c:
            X.4yC r5 = r2.A0A     // Catch:{ all -> 0x06ab }
            boolean r1 = r5.A05()     // Catch:{ all -> 0x06ab }
            if (r1 != 0) goto L_0x065c
            goto L_0x0542
        L_0x0186:
            java.lang.String r8 = r1.jabber_id     // Catch:{ all -> 0x06ab }
            if (r8 != 0) goto L_0x0190
            java.lang.String r1 = "google-re-enc-upload-worker/my-jid/jidUser is null, fatal error."
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x06ab }
            goto L_0x0177
        L_0x0190:
            java.lang.String r52 = r55.A0c()     // Catch:{ all -> 0x06ab }
            if (r52 != 0) goto L_0x0199
            java.lang.String r1 = "google-re-enc-upload-worker/handle-intent/gdrive account name is null."
            goto L_0x0179
        L_0x0199:
            android.content.Context r15 = r2.A00     // Catch:{ all -> 0x06ab }
            X.0wN r14 = r2.A02     // Catch:{ all -> 0x06ab }
            X.0wt r13 = r2.A0O     // Catch:{ all -> 0x06ab }
            X.0ww r6 = r2.A05     // Catch:{ all -> 0x06ab }
            X.179 r1 = r2.A0D     // Catch:{ all -> 0x06ab }
            r23 = r1
            X.6Ns r1 = r2.A0B     // Catch:{ all -> 0x06ab }
            r21 = r1
            X.1Aw r5 = r2.A0N     // Catch:{ all -> 0x06ab }
            X.1Cn r1 = r2.A06     // Catch:{ all -> 0x06ab }
            r20 = r1
            X.0wD r4 = r2.A0C     // Catch:{ all -> 0x06ab }
            X.0wU r1 = r2.A0P     // Catch:{ all -> 0x06ab }
            java.lang.String r53 = "background"
            X.6Xi r38 = new X.6Xi     // Catch:{ all -> 0x06ab }
            r39 = r15
            r40 = r14
            r41 = r6
            r42 = r20
            r43 = r11
            r44 = r21
            r45 = r4
            r46 = r23
            r47 = r24
            r48 = r12
            r49 = r5
            r50 = r13
            r51 = r1
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)     // Catch:{ all -> 0x06ab }
            boolean r1 = r2.A01     // Catch:{ all -> 0x06ab }
            if (r1 != 0) goto L_0x01e5
            java.util.List r4 = r2.A0R     // Catch:{ all -> 0x06ab }
            X.0y0 r1 = r2.A03     // Catch:{ all -> 0x06ab }
            java.util.ArrayList r1 = X.AnonymousClass6Y6.A02(r1)     // Catch:{ all -> 0x06ab }
            r4.addAll(r1)     // Catch:{ all -> 0x06ab }
            r2.A01 = r10     // Catch:{ all -> 0x06ab }
        L_0x01e5:
            X.0wo r1 = r2.A0F     // Catch:{ all -> 0x06ab }
            r19 = r1
            java.util.List r1 = r2.A0R     // Catch:{ all -> 0x06ab }
            r17 = r1
            X.0yW r1 = r2.A0K     // Catch:{ all -> 0x06ab }
            r16 = r1
            X.0y0 r14 = r2.A03     // Catch:{ all -> 0x06ab }
            X.19A r15 = r2.A0M     // Catch:{ all -> 0x06ab }
            X.4yC r13 = r2.A0A     // Catch:{ all -> 0x06ab }
            X.67v r6 = new X.67v     // Catch:{ all -> 0x06ab }
            r1 = r55
            r6.<init>(r14, r1, r12)     // Catch:{ all -> 0x06ab }
            X.1Cb r5 = r2.A0E     // Catch:{ all -> 0x06ab }
            X.1ek r1 = r2.A09     // Catch:{ all -> 0x06ab }
            X.65Q r4 = new X.65Q     // Catch:{ all -> 0x06ab }
            r30 = r4
            r31 = r14
            r32 = r20
            r33 = r11
            r34 = r1
            r35 = r6
            r36 = r21
            r37 = r13
            r39 = r23
            r40 = r5
            r41 = r19
            r42 = r9
            r43 = r24
            r44 = r55
            r45 = r12
            r46 = r16
            r47 = r56
            r48 = r15
            r49 = r8
            r50 = r17
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x06ab }
            r2.A00 = r4     // Catch:{ all -> 0x06ab }
            java.lang.String r32 = "gdrive/encrypted-re-upload"
            X.1Ck r1 = r4.A02     // Catch:{ all -> 0x06ab }
            X.0v0 r1 = r1.A03     // Catch:{ all -> 0x06ab }
            boolean r1 = r1.A2I()     // Catch:{ all -> 0x06ab }
            r31 = 0
            if (r1 != 0) goto L_0x0246
            java.lang.String r1 = "gdrive/encrypted-re-upload/encryption is not enabled so nothing to be done here"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x06ab }
            goto L_0x017c
        L_0x0246:
            X.1ek r1 = r4.A03     // Catch:{ all -> 0x06ab }
            r44 = r1
            java.util.Iterator r5 = X.C36361kB.A0s(r44)     // Catch:{ all -> 0x06ab }
        L_0x024e:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x06ab }
            if (r1 == 0) goto L_0x0258
            r5.next()     // Catch:{ all -> 0x06ab }
            goto L_0x024e
        L_0x0258:
            X.6Xi r9 = r4.A07     // Catch:{ all -> 0x06ab }
            X.782 r1 = r9.A06     // Catch:{ all -> 0x06ab }
            r1.A00 = r3     // Catch:{ all -> 0x06ab }
            java.util.concurrent.atomic.AtomicInteger r1 = r9.A0A     // Catch:{ all -> 0x06ab }
            r1.set(r3)     // Catch:{ all -> 0x06ab }
            X.1el r1 = r4.A06     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r5 = 14
            boolean r5 = X.AnonymousClass6YN.A0C(r1, r9, r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r5 == 0) goto L_0x04d9
            java.lang.String r6 = "gdrive/encrypted-re-upload/files"
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.lang.String r5 = r4.A0I     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            X.6Te r8 = X.AnonymousClass6YN.A01(r1, r9, r5, r6)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r8 != 0) goto L_0x0281
            java.lang.String r1 = "gdrive/encrypted-re-upload/files backup doesn't exist"
        L_0x027c:
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            goto L_0x04e8
        L_0x0281:
            X.0wo r6 = r4.A0A     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            X.0yC r5 = r4.A0E     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            long r14 = X.AnonymousClass6YO.A02(r5, r3)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r16 = 16384(0x4000, double:8.0948E-320)
            X.4y4 r11 = new X.4y4     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r12 = r8
            r13 = r6
            r11.<init>(r12, r13, r14, r16)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.lang.String r30 = "gdrive/backup/files"
            r6 = r30
            java.lang.Object r6 = X.AnonymousClass6UR.A00(r11, r1, r6)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r10)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r6 != r15) goto L_0x03bc
            java.lang.String r6 = "gdrive/encrypted-re-upload/files loading files"
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            boolean r6 = r1.A00()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r6 == 0) goto L_0x04e8
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.util.List r6 = java.util.Collections.synchronizedList(r6)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            X.AnonymousClass00C.A0B(r6)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.util.Map r12 = r4.A0K     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r12.clear()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.util.Map r11 = X.AnonymousClass6YN.A06(r1, r8, r6)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r11 != 0) goto L_0x02c4
            java.lang.String r1 = "gdrive/encrypted-re-upload/failed to load files for encrypted re-upload"
            goto L_0x027c
        L_0x02c4:
            r12.putAll(r11)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.util.List r11 = r4.A0J     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.util.ArrayList r13 = X.C36441kJ.A15(r11)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r11 = 200(0xc8, float:2.8E-43)
            java.util.ArrayList r11 = X.C36441kJ.A14(r11)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.util.List r37 = java.util.Collections.synchronizedList(r11)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            X.AnonymousClass00C.A0B(r37)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r11 = 785(0x311, float:1.1E-42)
            int r41 = r5.A07(r11)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r11 = 786(0x312, float:1.101E-42)
            long r11 = X.C36441kJ.A0B(r5, r11)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r42 = 1048576(0x100000, double:5.180654E-318)
            long r42 = r42 * r11
            java.lang.String r5 = "gdrive/encrypted-re-upload/files finding filesToBeUploaded"
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.lang.String r11 = "gdrive/encrypted-re-upload/perf/files-to-be-uploaded"
            X.14g r28 = new X.14g     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r5 = r28
            r5.<init>((java.lang.String) r11)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.util.Iterator r27 = r13.iterator()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
        L_0x02fd:
            boolean r5 = r27.hasNext()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r5 == 0) goto L_0x03c6
            java.io.File r26 = X.C90504aG.A0a(r27)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            boolean r5 = r1.A00()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r5 == 0) goto L_0x03b8
            r37.size()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r5 = 1000(0x3e8, float:1.401E-42)
            java.util.ArrayList r14 = X.C36441kJ.A14(r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            X.0yE r5 = r4.A0C     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            boolean r5 = r5.A0D()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r5 == 0) goto L_0x03c0
            r11 = 0
            r5 = r26
            boolean r5 = X.AnonymousClass6Y6.A04(r11, r5, r14)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r5 == 0) goto L_0x03b8
            java.util.concurrent.atomic.AtomicReference r25 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r5 = r25
            r5.<init>(r11)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            int r11 = r14.size()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.util.concurrent.CountDownLatch r24 = new java.util.concurrent.CountDownLatch     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r5 = r24
            r5.<init>(r11)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            int r23 = r14.size()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r11 = 0
        L_0x033e:
            r21 = 1
            r5 = r23
            if (r11 >= r5) goto L_0x039a
            boolean r5 = r1.A00()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r5 == 0) goto L_0x03b8
            java.lang.Object r5 = r14.get(r11)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.io.File r5 = (java.io.File) r5     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            boolean r12 = r5.exists()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r12 == 0) goto L_0x0373
            long r19 = r5.length()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r16 = 0
            int r12 = (r19 > r16 ? 1 : (r19 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x0373
        L_0x0360:
            java.lang.String r13 = X.AnonymousClass6YN.A02(r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            X.67v r12 = r4.A04     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            boolean r16 = r12.A01(r13)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r16 == 0) goto L_0x0376
            boolean r12 = r12.A00(r5, r13)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r21 = r21 & r12
            goto L_0x0376
        L_0x0373:
            r21 = 0
            goto L_0x0360
        L_0x0376:
            if (r21 == 0) goto L_0x0391
            X.747 r12 = new X.747     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r33 = r12
            r34 = r4
            r35 = r5
            r36 = r13
            r38 = r6
            r39 = r24
            r40 = r25
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.util.concurrent.ThreadPoolExecutor r5 = X.C113925gM.A00     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r5.execute(r12)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            goto L_0x0397
        L_0x0391:
            r5.length()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r24.countDown()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
        L_0x0397:
            int r11 = r11 + 1
            goto L_0x033e
        L_0x039a:
            r26.getAbsolutePath()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r24.await()     // Catch:{ InterruptedException -> 0x03a1, 1ej | 5VQ -> 0x04df }
            goto L_0x03a5
        L_0x03a1:
            r5 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
        L_0x03a5:
            java.lang.Object r5 = r25.get()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            X.5VQ r5 = (X.AnonymousClass5VQ) r5     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r5 == 0) goto L_0x02fd
            boolean r1 = r5 instanceof X.C101864yP     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r1 != 0) goto L_0x03c5
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r1.<init>(r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            goto L_0x048b
        L_0x03b8:
            java.lang.String r1 = "gdrive/encrypted-re-upload/files failed to generate list of files to be uploaded."
            goto L_0x027c
        L_0x03bc:
            java.lang.String r1 = "gdrive/encrypted-re-upload/files unable to start transaction"
            goto L_0x027c
        L_0x03c0:
            X.4yP r5 = new X.4yP     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r5.<init>()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
        L_0x03c5:
            throw r5     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
        L_0x03c6:
            r28.A01()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            boolean r5 = r1.A00()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r5 == 0) goto L_0x04e8
            int r13 = r37.size()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.lang.String r5 = "gdrive/encrypted-re-upload/files/files-to-be-uploaded/count/"
            X.C36321k7.A1T(r5, r11, r13)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            boolean r5 = r1.A00()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r5 == 0) goto L_0x04e8
            java.util.concurrent.atomic.AtomicLong r5 = r4.A0R     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r11 = 0
            r5.set(r11)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r5 = 3
            X.AnonymousClass00C.A0D(r6, r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            int r14 = r6.size()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r5 = 0
        L_0x03f2:
            if (r5 >= r14) goto L_0x0415
            int r12 = r5 + 2500
            r11 = r12
            if (r12 <= r14) goto L_0x03fa
            r11 = r14
        L_0x03fa:
            java.util.List r5 = r6.subList(r5, r11)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            X.4xz r11 = new X.4xz     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r11.<init>(r8, r9, r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r5 = r30
            java.lang.Object r5 = X.AnonymousClass6UR.A00(r11, r1, r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r5 != r15) goto L_0x040d
            r5 = r12
            goto L_0x03f2
        L_0x040d:
            r6 = 0
            java.lang.String r1 = "gdrive/encrypted-re-upload/files/failed to delete files"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            goto L_0x04c2
        L_0x0415:
            java.util.concurrent.atomic.AtomicBoolean r17 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r5 = r17
            r5.<init>(r10)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r12 = 0
            java.util.concurrent.atomic.AtomicReference r6 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r6.<init>(r12)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.util.concurrent.CountDownLatch r11 = new java.util.concurrent.CountDownLatch     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r11.<init>(r13)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.util.Iterator r16 = r37.iterator()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
        L_0x042b:
            boolean r5 = r16.hasNext()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r5 == 0) goto L_0x048c
            java.lang.Object r14 = r16.next()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            X.6FR r14 = (X.AnonymousClass6FR) r14     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            X.AnonymousClass00C.A0B(r14)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.io.File r13 = r14.A02     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            boolean r5 = r13.exists()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            if (r5 != 0) goto L_0x0459
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0u()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.lang.String r5 = "gdrive/encrypted-re-upload/backup-file file "
            r13.append(r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.lang.String r5 = "<file>"
            r13.append(r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.lang.String r5 = " does not exist"
            X.C36321k7.A1a(r13, r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r11.countDown()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            goto L_0x042b
        L_0x0459:
            boolean r5 = r13.isDirectory()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x047c
            java.util.concurrent.Executor r13 = X.AnonymousClass6Y6.A00     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r40 = 3
            X.75A r5 = new X.75A     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r33 = r5
            r34 = r6
            r35 = r4
            r36 = r8
            r37 = r14
            r38 = r17
            r39 = r11
            r33.<init>(r34, r35, r36, r37, r38, r39, r40)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r13.execute(r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            goto L_0x042b
        L_0x047c:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.lang.String r1 = "gdrive-service/backup-file/expected-file-got-directory-instead/"
            r5.append(r1)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.lang.String r1 = "<file>"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0g(r1, r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
        L_0x048b:
            throw r1     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
        L_0x048c:
            java.lang.String r5 = "gdrive/encrypted-re-upload/files waiting for backup to finish..."
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x049b, 1ej | 5VQ -> 0x04df }
            boolean r13 = r11.await(r5, r13)     // Catch:{ InterruptedException -> 0x049b, 1ej | 5VQ -> 0x04df }
            goto L_0x04a2
        L_0x049b:
            r13 = move-exception
            java.lang.String r11 = "gdrive/encrypted-re-upload/files upload interrupted"
            com.whatsapp.util.Log.e(r11, r13)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r13 = 0
        L_0x04a2:
            boolean r11 = r17.get()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r11 = r11 & r13
            if (r11 == 0) goto L_0x04d3
            X.19A r11 = r4.A0H     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r11.A0B(r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            X.4y2 r6 = new X.4y2     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r6.<init>(r8, r12)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r5 = r30
            java.lang.Object r1 = X.AnonymousClass6UR.A00(r6, r1, r5)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            r6 = 1
            if (r1 == r15) goto L_0x04c2
            r6 = 0
            java.lang.String r1 = "gdrive/encrypted-re-upload/files failed to commit backup"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
        L_0x04c2:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.lang.String r1 = "gdrive/encrypted-re-upload/files backup finished (success ="
            r5.append(r1)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            java.lang.String r1 = X.C36321k7.A0H(r5, r6)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            goto L_0x04e6
        L_0x04d3:
            java.lang.String r1 = "gdrive/encrypted-re-upload/files failed to uploadFiles"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            goto L_0x04e8
        L_0x04d9:
            java.lang.String r1 = "gdrive/encrypted-re-upload/fetch-token/network-failure-at-token-fetch-stage"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 4yI -> 0x04ea, 1ej | 5VQ -> 0x04df }
            goto L_0x04e8
        L_0x04df:
            r5 = move-exception
            r1 = r32
            com.whatsapp.util.Log.e(r1, r5)     // Catch:{ all -> 0x06ab }
            goto L_0x04e8
        L_0x04e6:
            r31 = r6
        L_0x04e8:
            r14 = 0
            goto L_0x04fc
        L_0x04ea:
            r5 = move-exception
            r1 = r32
            com.whatsapp.util.Log.e(r1, r5)     // Catch:{ all -> 0x06ab }
            X.1Cn r5 = r4.A01     // Catch:{ all -> 0x06ab }
            X.0v0 r1 = r4.A0D     // Catch:{ all -> 0x06ab }
            java.lang.String r1 = r1.A0c()     // Catch:{ all -> 0x06ab }
            r5.A05(r1)     // Catch:{ all -> 0x06ab }
            r14 = 1
        L_0x04fc:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x06ab }
            X.0v0 r8 = r4.A0D     // Catch:{ all -> 0x06ab }
            java.lang.String r1 = r8.A0c()     // Catch:{ all -> 0x06ab }
            long r5 = r8.A0S(r1)     // Catch:{ all -> 0x06ab }
            long r12 = r12 - r5
            X.58P r11 = r4.A0G     // Catch:{ all -> 0x06ab }
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r12 = r12 / r5
            java.lang.Long r1 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x06ab }
            r11.A08 = r1     // Catch:{ all -> 0x06ab }
            r11.A05 = r1     // Catch:{ all -> 0x06ab }
            if (r31 == 0) goto L_0x051d
            goto L_0x05a1
        L_0x051d:
            X.AnonymousClass6UR.A02()     // Catch:{ all -> 0x06ab }
            X.1el r1 = r4.A06     // Catch:{ all -> 0x06ab }
            boolean r1 = r1.A05()     // Catch:{ all -> 0x06ab }
            if (r1 != 0) goto L_0x052c
            java.lang.String r1 = "gdrive/encrypted-re-upload/wasn't successful because the needed resources are not available"
            goto L_0x0179
        L_0x052c:
            boolean r1 = r9.A0D()     // Catch:{ all -> 0x06ab }
            if (r1 != 0) goto L_0x017c
            r1 = 3
            if (r14 == 0) goto L_0x0537
            r1 = 10
        L_0x0537:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x06ab }
            r11.A02 = r1     // Catch:{ all -> 0x06ab }
            r4.A00()     // Catch:{ all -> 0x06ab }
            goto L_0x017c
        L_0x0542:
            r4 = 6
            if (r7 >= r4) goto L_0x063c
            boolean r1 = r5.A03()     // Catch:{ all -> 0x06ab }
            if (r1 != 0) goto L_0x054e
            r4 = 9
            goto L_0x0598
        L_0x054e:
            boolean r1 = r5.A02()     // Catch:{ all -> 0x06ab }
            if (r1 != 0) goto L_0x055f
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0V     // Catch:{ all -> 0x06ab }
            boolean r0 = r0.get()     // Catch:{ all -> 0x06ab }
            r4 = 4
            if (r0 != 0) goto L_0x0598
            r4 = 5
            goto L_0x0598
        L_0x055f:
            boolean r0 = r5.A04()     // Catch:{ all -> 0x06ab }
            if (r0 != 0) goto L_0x0568
            r4 = 8
            goto L_0x0598
        L_0x0568:
            boolean r0 = r5.A01()     // Catch:{ all -> 0x06ab }
            if (r0 == 0) goto L_0x0598
            X.0wN r4 = r2.A02     // Catch:{ all -> 0x06ab }
            r1 = 0
            java.lang.String r0 = "google-encrypted-re-upload-worker/unknown condition was not met"
            r4.A0E(r0, r1, r10)     // Catch:{ all -> 0x06ab }
        L_0x0576:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x06ab }
            java.lang.String r0 = "google-encrypted-re-upload-worker/doWork conditions were not met(result code = "
            r1.append(r0)     // Catch:{ all -> 0x06ab }
            r0 = r56
            java.lang.Integer r0 = r0.A02     // Catch:{ all -> 0x06ab }
            r1.append(r0)     // Catch:{ all -> 0x06ab }
            java.lang.String r0 = "), retrying backup later"
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x06ab }
            X.65Q r0 = r2.A00     // Catch:{ all -> 0x06ab }
            if (r0 == 0) goto L_0x0592
            r0.A00()     // Catch:{ all -> 0x06ab }
        L_0x0592:
            X.4ov r5 = X.C97324ov.A00()     // Catch:{ all -> 0x06ab }
            goto L_0x0660
        L_0x0598:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x06ab }
            r0 = r56
            r0.A02 = r1     // Catch:{ all -> 0x06ab }
            goto L_0x0576
        L_0x05a1:
            java.lang.String r5 = r8.A0c()     // Catch:{ all -> 0x06ab }
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0L     // Catch:{ all -> 0x06ab }
            boolean r1 = r0.get()     // Catch:{ all -> 0x06ab }
            r0 = 2
            if (r1 == 0) goto L_0x05b1
            if (r5 == 0) goto L_0x05b1
            goto L_0x05ba
        L_0x05b1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x06ab }
            r11.A02 = r0     // Catch:{ all -> 0x06ab }
            if (r5 == 0) goto L_0x0619
            goto L_0x05c3
        L_0x05ba:
            r8.A1b(r5, r0)     // Catch:{ all -> 0x06ab }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x06ab }
            r11.A02 = r0     // Catch:{ all -> 0x06ab }
        L_0x05c3:
            java.util.concurrent.atomic.AtomicLong r8 = r4.A0P     // Catch:{ all -> 0x06ab }
            long r6 = r8.get()     // Catch:{ all -> 0x06ab }
            java.util.concurrent.atomic.AtomicLong r5 = r4.A0O     // Catch:{ all -> 0x06ab }
            long r0 = r5.get()     // Catch:{ all -> 0x06ab }
            long r6 = r6 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x06ab }
            r11.A04 = r0     // Catch:{ all -> 0x06ab }
            long r0 = r8.get()     // Catch:{ all -> 0x06ab }
            long r5 = r5.get()     // Catch:{ all -> 0x06ab }
            long r0 = r0 + r5
            double r7 = (double) r0     // Catch:{ all -> 0x06ab }
            java.util.concurrent.atomic.AtomicLong r0 = r4.A0Q     // Catch:{ all -> 0x06ab }
            long r5 = r0.get()     // Catch:{ all -> 0x06ab }
            double r0 = (double) r5     // Catch:{ all -> 0x06ab }
            double r7 = r7 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r7)     // Catch:{ all -> 0x06ab }
            r11.A00 = r0     // Catch:{ all -> 0x06ab }
            r11.A01 = r0     // Catch:{ all -> 0x06ab }
            java.lang.Long r0 = r11.A04     // Catch:{ all -> 0x06ab }
            r11.A06 = r0     // Catch:{ all -> 0x06ab }
            java.util.concurrent.atomic.AtomicLong r0 = r4.A0N     // Catch:{ all -> 0x06ab }
            long r5 = r0.get()     // Catch:{ all -> 0x06ab }
            java.util.concurrent.atomic.AtomicLong r0 = r4.A0R     // Catch:{ all -> 0x06ab }
            long r0 = r0.get()     // Catch:{ all -> 0x06ab }
            long r5 = r5 + r0
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r5 = r5 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x06ab }
            r11.A07 = r0     // Catch:{ all -> 0x06ab }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x06ab }
            java.lang.String r0 = "gdrive/encrypted-re-upload/"
            X.C36321k7.A1K(r11, r0, r1)     // Catch:{ all -> 0x06ab }
            X.0yW r0 = r4.A0F     // Catch:{ all -> 0x06ab }
            r0.Bly(r11)     // Catch:{ all -> 0x06ab }
        L_0x0619:
            X.6Ns r1 = r4.A05     // Catch:{ all -> 0x06ab }
            java.lang.String r0 = r9.A08     // Catch:{ all -> 0x06ab }
            r1.A01(r0)     // Catch:{ all -> 0x06ab }
            X.AnonymousClass6UR.A02()     // Catch:{ all -> 0x06ab }
            java.util.Iterator r1 = X.C36361kB.A0s(r44)     // Catch:{ all -> 0x06ab }
        L_0x0627:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x06ab }
            if (r0 == 0) goto L_0x0637
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x06ab }
            X.1eo r0 = (X.C33151eo) r0     // Catch:{ all -> 0x06ab }
            r0.BWS()     // Catch:{ all -> 0x06ab }
            goto L_0x0627
        L_0x0637:
            X.4ox r5 = X.C97344ox.A00()     // Catch:{ all -> 0x06ab }
            goto L_0x0660
        L_0x063c:
            java.lang.Integer r1 = X.C36401kF.A0h()     // Catch:{ all -> 0x06ab }
            r0 = r56
            r0.A02 = r1     // Catch:{ all -> 0x06ab }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x06ab }
            java.lang.String r0 = "google-encrypted-re-upload-worker/doWork worker reached the maximum amount of retries("
            r1.append(r0)     // Catch:{ all -> 0x06ab }
            r1.append(r4)     // Catch:{ all -> 0x06ab }
            java.lang.String r0 = "), failing"
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x06ab }
            X.65Q r0 = r2.A00     // Catch:{ all -> 0x06ab }
            if (r0 == 0) goto L_0x065c
            r0.A00()     // Catch:{ all -> 0x06ab }
        L_0x065c:
            X.4ow r5 = X.C97334ow.A00()     // Catch:{ all -> 0x06ab }
        L_0x0660:
            X.4ov r0 = X.C97324ov.A00()     // Catch:{ all -> 0x06ab }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x06ab }
            if (r0 != 0) goto L_0x0691
            boolean r0 = r54.A2I()     // Catch:{ all -> 0x06ab }
            if (r0 == 0) goto L_0x0691
            boolean r0 = android.text.TextUtils.isEmpty(r29)     // Catch:{ all -> 0x06ab }
            if (r0 != 0) goto L_0x0691
            r1 = r54
            r0 = r29
            int r0 = r1.A0N(r0)     // Catch:{ all -> 0x06ab }
            if (r0 != r10) goto L_0x0691
            X.0zS r6 = r2.A0Q     // Catch:{ all -> 0x06ab }
            java.util.Random r4 = r2.A0S     // Catch:{ all -> 0x06ab }
            java.lang.Integer r1 = X.C023109s.A0G     // Catch:{ all -> 0x06ab }
            r0 = r55
            A02(r0, r6, r1, r4, r3)     // Catch:{ all -> 0x06ab }
            goto L_0x0691
        L_0x068c:
            r0 = 3
            X.5Xj r5 = r2.A00(r7, r0)     // Catch:{ all -> 0x06ab }
        L_0x0691:
            r1 = r57
            r0 = r22
            r1.A01(r0, r3)
            X.1ei r0 = r2.A08
            r0.A07()
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0R
            r0.getAndSet(r3)
            X.1Fq r2 = r2.A0T
            r1 = 5
            r0 = r18
            r2.A03(r1, r0)
            return r5
        L_0x06ab:
            r4 = move-exception
            X.0z9 r1 = r2.A0W
            r0 = r22
            r1.A01(r0, r3)
            X.1ei r0 = r2.A08
            r0.A07()
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0R
            r0.getAndSet(r3)
            X.1Fq r2 = r2.A0T
            r1 = 5
            r0 = r18
            r2.A03(r1, r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker.A09():X.5Xj");
    }

    public GoogleEncryptedReUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18800tq A0P2 = C36371kC.A0P(context);
        this.A0S = AnonymousClass1WC.A00();
        this.A0F = A0P2.Bvc();
        this.A0J = A0P2.Azp();
        this.A0P = C36341k9.A0Z(A0P2);
        this.A0O = C90504aG.A0X(A0P2);
        this.A02 = A0P2.B3m();
        this.A04 = C36351kA.A0N(A0P2);
        this.A0G = C36351kA.A0W(A0P2);
        this.A0U = C36351kA.A0h(A0P2);
        this.A03 = (C20690y0) A0P2.A6r.get();
        this.A05 = C36381kD.A0U(A0P2);
        this.A0K = C36351kA.A0g(A0P2);
        this.A0D = (AnonymousClass179) A0P2.A3D.get();
        this.A0V = (AnonymousClass13I) A0P2.A4a.get();
        AnonymousClass19A A0c = C36361kB.A0c(A0P2);
        this.A0M = A0c;
        this.A0Q = (C21570zS) A0P2.A9Z.get();
        this.A07 = (C24431Ck) A0P2.A2z.get();
        this.A0E = C36431kI.A0a(A0P2);
        this.A0B = (C131096Ns) A0P2.A7N.get();
        this.A0H = C36351kA.A0X(A0P2);
        this.A0I = C36351kA.A0Y(A0P2);
        this.A0N = (C24051Aw) A0P2.A3E.get();
        this.A0T = C36391kE.A0d(A0P2);
        this.A0W = (C21380z9) A0P2.A4b.get();
        this.A06 = (C24461Cn) A0P2.A0c.get();
        this.A09 = (C33121ek) A0P2.A3h.get();
        this.A0C = C36391kE.A0c(A0P2);
        C33101ei r2 = (C33101ei) A0P2.A3f.get();
        this.A08 = r2;
        this.A0A = new C101544xt(C90514aH.A0Z(A0P2), r2, this, A0c);
    }

    public static void A02(C19420v0 r8, C21570zS r9, Integer num, Random random, boolean z) {
        long j;
        String str;
        Calendar instance = Calendar.getInstance();
        if (!z) {
            int A0C2 = r8.A0C();
            long A0A2 = C36441kJ.A0A(r8.A0T(r8.A0c()));
            if (A0C2 == 1 || (A0C2 != 2 ? !(A0C2 != 3 || A0A2 < 2419200000L) : A0A2 >= 432000000)) {
                Log.i("google-encrypted-re-upload-worker/scheduleNextRun doesn't schedule run because google drive backup will run in the next backup slot");
                return;
            }
            long timeInMillis = instance.getTimeInMillis();
            if (instance.get(11) >= 2) {
                instance.add(5, 1);
            }
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.set(11, 2);
            instance.add(13, random.nextInt((int) TimeUnit.SECONDS.convert(4, TimeUnit.HOURS)));
            j = instance.getTimeInMillis() - timeInMillis;
        } else {
            j = 0;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("google-encrypted-re-upload-worker/scheduleNextRun at ");
        A0u.append(instance.getTime());
        A0u.append(", immediately = ");
        A0u.append(z);
        A0u.append(", existingWorkPolicy = ");
        switch (num.intValue()) {
            case 1:
                str = "KEEP";
                break;
            case 2:
                str = "APPEND";
                break;
            default:
                str = "APPEND_OR_REPLACE";
                break;
        }
        C36321k7.A1a(A0u, str);
        C90514aH.A0V(r9).A07(A01(r8, j), num, "com.whatsapp.backup.google.google-encrypted-re-upload-worker");
    }
}
