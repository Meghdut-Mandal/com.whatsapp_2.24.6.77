package com.whatsapp.backup.google.workers;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass02R;
import X.AnonymousClass12P;
import X.AnonymousClass13I;
import X.AnonymousClass13R;
import X.AnonymousClass179;
import X.AnonymousClass19A;
import X.AnonymousClass1Q9;
import X.AnonymousClass3S1;
import X.AnonymousClass6FS;
import X.AnonymousClass6UR;
import X.AnonymousClass6X2;
import X.AnonymousClass6Y6;
import X.C101734yC;
import X.C1042758y;
import X.C128076At;
import X.C131096Ns;
import X.C133226Xi;
import X.C17880sD;
import X.C18800tq;
import X.C18840tu;
import X.C19420v0;
import X.C19550w8;
import X.C19630wG;
import X.C19730wQ;
import X.C19970wo;
import X.C20690y0;
import X.C20810yC;
import X.C20830yE;
import X.C21010yW;
import X.C21380z9;
import X.C21570zS;
import X.C24341Cb;
import X.C24431Ck;
import X.C24461Cn;
import X.C33101ei;
import X.C33121ek;
import X.C33161ep;
import X.C33171eq;
import X.C34191gb;
import X.C36321k7;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36421kH;
import X.C36431kI;
import X.C90514aH;
import X.C99424tL;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import java.util.concurrent.Executor;

public class GoogleBackupWorker extends Worker {
    public final int A00;
    public final C20690y0 A01;
    public final C19730wQ A02;
    public final C24461Cn A03;
    public final C24431Ck A04;
    public final AnonymousClass3S1 A05;
    public final C33101ei A06;
    public final AnonymousClass6FS A07;
    public final C33121ek A08;
    public final C33171eq A09;
    public final C101734yC A0A;
    public final C33161ep A0B;
    public final C131096Ns A0C;
    public final AnonymousClass179 A0D;
    public final C24341Cb A0E;
    public final C19970wo A0F;
    public final C19630wG A0G;
    public final C20830yE A0H;
    public final C19420v0 A0I;
    public final AnonymousClass1Q9 A0J;
    public final AnonymousClass12P A0K;
    public final AnonymousClass13R A0L;
    public final C20810yC A0M;
    public final C21010yW A0N;
    public final C1042758y A0O;
    public final AnonymousClass19A A0P;
    public final AnonymousClass13I A0Q;
    public final C21380z9 A0R;
    public final C21570zS A0S;
    public final AnonymousClass005 A0T;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GoogleBackupWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        int A042 = C36361kB.A04(context, workerParameters, 1);
        C18800tq A0P2 = C36371kC.A0P(context);
        this.A0F = A0P2.Bvc();
        this.A0M = A0P2.Azp();
        this.A02 = C36351kA.A0N(A0P2);
        this.A0G = C36351kA.A0W(A0P2);
        this.A01 = (C20690y0) A0P2.A6r.get();
        this.A0N = C36351kA.A0g(A0P2);
        this.A0D = (AnonymousClass179) A0P2.A3D.get();
        this.A0Q = (AnonymousClass13I) A0P2.A4a.get();
        AnonymousClass19A A0c = C36361kB.A0c(A0P2);
        this.A0P = A0c;
        this.A0S = (C21570zS) A0P2.A9Z.get();
        this.A0T = C18840tu.A00(A0P2.A7g);
        this.A04 = (C24431Ck) A0P2.A2z.get();
        this.A0E = C36431kI.A0a(A0P2);
        this.A0L = (AnonymousClass13R) A0P2.A5P.get();
        this.A0J = (AnonymousClass1Q9) A0P2.A5D.get();
        this.A07 = (AnonymousClass6FS) A0P2.A3g.get();
        this.A0K = (AnonymousClass12P) A0P2.A5G.get();
        this.A0C = (C131096Ns) A0P2.A7N.get();
        this.A0H = C36351kA.A0X(A0P2);
        this.A0I = C36351kA.A0Y(A0P2);
        this.A0R = (C21380z9) A0P2.A4b.get();
        this.A03 = (C24461Cn) A0P2.A0c.get();
        this.A05 = (AnonymousClass3S1) A0P2.AfI.A00.A0J.get();
        C33101ei r3 = (C33101ei) A0P2.A3f.get();
        this.A06 = r3;
        this.A08 = (C33121ek) A0P2.A3h.get();
        this.A0B = (C33161ep) A0P2.A3j.get();
        this.A09 = (C33171eq) A0P2.A3i.get();
        C1042758y r5 = new C1042758y();
        this.A0O = r5;
        r5.A0X = Integer.valueOf(A042);
        AnonymousClass6X2 r2 = this.A01.A01;
        r5.A0Y = Integer.valueOf(r2.A02("KEY_BACKUP_SCHEDULE", 0));
        r5.A0U = Integer.valueOf(r2.A02("KEY_BACKUP_NETWORK_SETTING", -1));
        this.A0A = new C101734yC(C90514aH.A0Z(A0P2), r3, A0c);
        this.A00 = r2.A02("KEY_MAX_NUMBER_OF_RETRIES", 0);
    }

    private final void A00() {
        this.A0R.A01("gdrive_backup_with_worker", false);
        C33101ei r3 = this.A06;
        r3.A07();
        C19420v0 r2 = this.A0I;
        Executor executor = AnonymousClass6Y6.A00;
        if (r2.A0F() == 1 || r3.A0Q.get()) {
            r3.A0Q.getAndSet(false);
            AnonymousClass6FS r1 = this.A07;
            C133226Xi A002 = r1.A00();
            C21380z9 r12 = r1.A0A;
            if (A002 != null) {
                A002.A0B(false);
            }
            r12.A01("gdrive_backup", false);
            AnonymousClass6UR.A02();
            r3.A0G.open();
            r3.A0D.open();
            r3.A0A.open();
            r3.A04 = false;
            r2.A1A(0);
            r2.A18(10);
        }
        C33121ek r13 = this.A08;
        r13.A00 = -1;
        r13.A01 = -1;
        C33171eq r32 = this.A09;
        r32.A06.set(0);
        r32.A05.set(0);
        r32.A04.set(0);
        r32.A07.set(0);
        r32.A03.set(0);
    }

    public static final void A01(GoogleBackupWorker googleBackupWorker, int i) {
        if (googleBackupWorker.A0A.A05()) {
            String A022 = C34191gb.A02(i);
            AnonymousClass00C.A08(A022);
            if (i != 10) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                AnonymousClass00C.A08(stackTrace);
                AnonymousClass02R.A09("\n", "", "", stackTrace);
                C36321k7.A1P("google-backup-worker/set-error/", A022, AnonymousClass000.A0u());
            }
            googleBackupWorker.A0I.A18(i);
            C1042758y.A00(googleBackupWorker.A0O, C34191gb.A00(i));
            googleBackupWorker.A08.A02(i, googleBackupWorker.A09.A00());
        }
    }

    public C17880sD A05() {
        Log.i("google-backup-worker/getForegroundInfoAsync");
        C99424tL r4 = new C99424tL();
        r4.A04(new C128076At(5, this.A0B.A03(C36421kH.A0B(this.A0G), (String) null), C19550w8.A06() ? 1 : 0));
        return r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x024a, code lost:
        if (r1 == false) goto L_0x024c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02a1 A[Catch:{ all -> 0x02ab, all -> 0x02b3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C109385Xj A09() {
        /*
            r49 = this;
            r10 = r49
            X.1ep r13 = r10.A0B     // Catch:{ all -> 0x02b3 }
            r13.A05()     // Catch:{ all -> 0x02b3 }
            r13.A04()     // Catch:{ all -> 0x02b3 }
            X.0yC r9 = r10.A0M     // Catch:{ all -> 0x02b3 }
            r0 = 3129(0xc39, float:4.385E-42)
            boolean r0 = r9.A0E(r0)     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0041
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "google-backup-worker/publishNotification enable setForegroundAsync, attempt: "
            r1.append(r0)     // Catch:{ all -> 0x02b3 }
            androidx.work.WorkerParameters r11 = r10.A01     // Catch:{ all -> 0x02b3 }
            int r8 = r11.A00     // Catch:{ all -> 0x02b3 }
            X.C36321k7.A1Y(r1, r8)     // Catch:{ all -> 0x02b3 }
            X.0wG r0 = r10.A0G     // Catch:{ InterruptedException | ExecutionException -> 0x0051 }
            android.content.res.Resources r1 = X.C36421kH.A0B(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0051 }
            r0 = 0
            android.app.Notification r3 = r13.A03(r1, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0051 }
            boolean r2 = X.C19550w8.A06()     // Catch:{ InterruptedException | ExecutionException -> 0x0051 }
            r1 = 5
            X.6At r0 = new X.6At     // Catch:{ InterruptedException | ExecutionException -> 0x0051 }
            r0.<init>(r1, r3, r2)     // Catch:{ InterruptedException | ExecutionException -> 0x0051 }
            X.4pl r0 = r10.A04(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0051 }
            r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0051 }
            goto L_0x0051
        L_0x0041:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "google-backup-worker/publishNotification skip setForegroundAsync, attempt: "
            r1.append(r0)     // Catch:{ all -> 0x02b3 }
            androidx.work.WorkerParameters r11 = r10.A01     // Catch:{ all -> 0x02b3 }
            int r8 = r11.A00     // Catch:{ all -> 0x02b3 }
            X.C36321k7.A1Y(r1, r8)     // Catch:{ all -> 0x02b3 }
        L_0x0051:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "google-backup-worker/doWork, attempt "
            X.C36321k7.A1T(r0, r1, r8)     // Catch:{ all -> 0x02b3 }
            X.0v0 r7 = r10.A0I     // Catch:{ all -> 0x02b3 }
            java.lang.String r2 = r7.A0c()     // Catch:{ all -> 0x02b3 }
            X.0wQ r0 = r10.A02     // Catch:{ all -> 0x02b3 }
            r0.A0G()     // Catch:{ all -> 0x02b3 }
            com.whatsapp.Me r0 = r0.A00     // Catch:{ all -> 0x02b3 }
            r44 = 0
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = "google-backup-worker/my-jid/me is null, can't proceed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
        L_0x0070:
            X.1ei r12 = r10.A06     // Catch:{ all -> 0x02b3 }
            r3 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.A0Q     // Catch:{ all -> 0x02b3 }
            boolean r0 = r1.getAndSet(r3)     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = "google-backup-worker/doWork another backup is already running."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            X.4ow r1 = X.C97334ow.A00()     // Catch:{ all -> 0x02b3 }
            goto L_0x02a4
        L_0x0086:
            java.lang.String r0 = r0.jabber_id     // Catch:{ all -> 0x02b3 }
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = "google-backup-worker/my-jid/jidUser is null, fatal error."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            goto L_0x0070
        L_0x0090:
            r44 = r0
            goto L_0x0070
        L_0x0093:
            X.0wG r6 = r10.A0G     // Catch:{ all -> 0x02b3 }
            android.content.Context r0 = r6.A00     // Catch:{ all -> 0x02b3 }
            boolean r0 = X.C34191gb.A08(r0)     // Catch:{ all -> 0x02b3 }
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "google-backup-worker/doWork Google Drive backups are disabled for this user."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
        L_0x00a2:
            r0 = 0
            r1.getAndSet(r0)     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "google-backup-worker/doWork, failed on backup conditions"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            X.1Cn r0 = r10.A03     // Catch:{ all -> 0x02b3 }
            r0.A02()     // Catch:{ all -> 0x02b3 }
            X.4ow r1 = X.C97334ow.A00()     // Catch:{ all -> 0x02b3 }
            goto L_0x02a4
        L_0x00b6:
            r4 = 0
            if (r2 == 0) goto L_0x0131
            int r0 = r2.length()     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0131
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x02b3 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02b3 }
            long r4 = r7.A0T(r2)     // Catch:{ all -> 0x02b3 }
            long r14 = r14 - r4
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x012a
            X.6X2 r0 = r11.A01     // Catch:{ all -> 0x02b3 }
            java.lang.String r4 = "only_if_pending"
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x02b3 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x02b3 }
            boolean r0 = r4 instanceof java.lang.Boolean     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x00f4
            boolean r0 = X.AnonymousClass000.A1X(r4)     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x00f4
            java.util.concurrent.Executor r0 = X.AnonymousClass6Y6.A00     // Catch:{ all -> 0x02b3 }
            int r0 = r7.A0F()     // Catch:{ all -> 0x02b3 }
            if (r0 == r3) goto L_0x00f4
            java.lang.String r0 = "google-backup-worker/doWork backup called when not pending and required, ignoring"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            goto L_0x00a2
        L_0x00f4:
            X.13I r0 = r10.A0Q     // Catch:{ all -> 0x02b3 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0100
            java.lang.String r0 = "google-backup-worker/doWork WhatsApp Login has failed, google drive backup aborted"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            goto L_0x00a2
        L_0x0100:
            X.0yE r0 = r10.A0H     // Catch:{ all -> 0x02b3 }
            r34 = r0
            boolean r0 = r34.A0H()     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0115
            java.lang.String r0 = "google-backup-worker/doWork read storage permission denied backup aborted"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            r0 = 23
            A01(r10, r0)     // Catch:{ all -> 0x02b3 }
            goto L_0x00a2
        L_0x0115:
            boolean r0 = X.AnonymousClass6Y6.A05(r7)     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0121
            java.lang.String r0 = "google-backup-worker/doWork cannot start backup, media restore is pending"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            goto L_0x00a2
        L_0x0121:
            if (r44 != 0) goto L_0x0158
            java.lang.String r0 = "google-backup-worker/doWork my jid is null."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            goto L_0x00a2
        L_0x012a:
            java.lang.String r0 = "google-backup-worker/doWork backup called too early, ignoring"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            goto L_0x00a2
        L_0x0131:
            int r0 = r7.A0F()     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x0151
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "google-backup-worker/doWork accountName is null, cannot proceed further. Change google drive state from "
            r2.append(r0)     // Catch:{ all -> 0x02b3 }
            int r0 = r7.A0F()     // Catch:{ all -> 0x02b3 }
            r2.append(r0)     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = " to clean_state"
            X.C36321k7.A1Z(r2, r0)     // Catch:{ all -> 0x02b3 }
            r7.A1A(r4)     // Catch:{ all -> 0x02b3 }
            goto L_0x00a2
        L_0x0151:
            java.lang.String r0 = "google-backup-worker/doWork grdive account name is empty, google drive backup aborted"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x02b3 }
            goto L_0x00a2
        L_0x0158:
            X.0z9 r1 = r10.A0R     // Catch:{ all -> 0x02ab }
            java.lang.String r0 = "gdrive_backup_with_worker"
            r1.A01(r0, r3)     // Catch:{ all -> 0x02ab }
            r0 = 10
            r7.A18(r0)     // Catch:{ all -> 0x02ab }
            r12.A06()     // Catch:{ all -> 0x02ab }
            r12.A05()     // Catch:{ all -> 0x02ab }
            r12.A08()     // Catch:{ all -> 0x02ab }
            r12.A03()     // Catch:{ all -> 0x02ab }
            X.6FS r5 = r10.A07     // Catch:{ all -> 0x02ab }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x02ab }
            java.lang.String r0 = "backup"
            X.6Xi r27 = r5.A01(r2, r0)     // Catch:{ all -> 0x02ab }
            X.0wo r0 = r10.A0F     // Catch:{ all -> 0x02ab }
            r32 = r0
            X.0y0 r4 = r10.A01     // Catch:{ all -> 0x02ab }
            X.0yW r0 = r10.A0N     // Catch:{ all -> 0x02ab }
            r39 = r0
            X.179 r0 = r10.A0D     // Catch:{ all -> 0x02ab }
            r30 = r0
            X.19A r0 = r10.A0P     // Catch:{ all -> 0x02ab }
            r41 = r0
            X.0zS r0 = r10.A0S     // Catch:{ all -> 0x02ab }
            r42 = r0
            X.1Ck r0 = r10.A04     // Catch:{ all -> 0x02ab }
            r48 = r0
            X.67v r3 = new X.67v     // Catch:{ all -> 0x02ab }
            r3.<init>(r4, r7, r9)     // Catch:{ all -> 0x02ab }
            X.1Cb r0 = r10.A0E     // Catch:{ all -> 0x02ab }
            r25 = r0
            X.1Q9 r0 = r10.A0J     // Catch:{ all -> 0x02ab }
            r24 = r0
            X.12P r0 = r10.A0K     // Catch:{ all -> 0x02ab }
            r23 = r0
            X.6Ns r0 = r10.A0C     // Catch:{ all -> 0x02ab }
            r22 = r0
            X.005 r0 = r10.A0T     // Catch:{ all -> 0x02ab }
            r20 = r0
            X.1Cn r2 = r10.A03     // Catch:{ all -> 0x02ab }
            X.3S1 r0 = r10.A05     // Catch:{ all -> 0x02ab }
            r21 = r0
            java.util.ArrayList r45 = X.AnonymousClass6Y6.A02(r4)     // Catch:{ all -> 0x02ab }
            X.1eq r1 = r10.A09     // Catch:{ all -> 0x02ab }
            java.util.concurrent.atomic.AtomicLong r0 = r1.A07     // Catch:{ all -> 0x02ab }
            r18 = r0
            java.util.concurrent.atomic.AtomicLong r0 = r1.A06     // Catch:{ all -> 0x02ab }
            r17 = r0
            X.4yC r15 = r10.A0A     // Catch:{ all -> 0x02ab }
            X.1ek r14 = r10.A08     // Catch:{ all -> 0x02ab }
            X.58y r1 = r10.A0O     // Catch:{ all -> 0x02ab }
            X.13R r0 = r10.A0L     // Catch:{ all -> 0x02ab }
            X.6Uy r19 = X.C132716Uy.A00(r0, r9)     // Catch:{ all -> 0x02ab }
            r11 = 1
            X.7rE r0 = new X.7rE     // Catch:{ all -> 0x02ab }
            r0.<init>(r10, r11)     // Catch:{ all -> 0x02ab }
            X.4yU r16 = new X.4yU     // Catch:{ all -> 0x02ab }
            r26 = r22
            r28 = r0
            r29 = r10
            r31 = r25
            r33 = r6
            r35 = r7
            r36 = r24
            r37 = r23
            r38 = r9
            r40 = r1
            r43 = r20
            r46 = r18
            r47 = r17
            r17 = r4
            r18 = r2
            r20 = r48
            r22 = r12
            r23 = r14
            r24 = r15
            r25 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)     // Catch:{ all -> 0x02ab }
            java.lang.Long r3 = X.C36441kJ.A0y(r8)     // Catch:{ all -> 0x02ab }
            r1.A0d = r3     // Catch:{ all -> 0x02ab }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02ab }
            java.lang.String r0 = "google-backup-worker/runBackup, attempt: "
            X.C36321k7.A1K(r3, r0, r1)     // Catch:{ all -> 0x02ab }
            boolean r6 = r16.A05()     // Catch:{ all -> 0x02ab }
            r10.A00()     // Catch:{ all -> 0x02b3 }
            r0 = 7739(0x1e3b, float:1.0845E-41)
            boolean r0 = r9.A0E(r0)     // Catch:{ all -> 0x02b3 }
            if (r0 == 0) goto L_0x023a
            monitor-enter(r2)     // Catch:{ all -> 0x02b3 }
            X.00T r1 = r2.A01     // Catch:{ all -> 0x02b0 }
            android.content.SharedPreferences r0 = X.C36411kG.A0E(r1)     // Catch:{ all -> 0x02b0 }
            java.lang.String r3 = "google_backup_retry_count"
            int r8 = X.C36371kC.A01(r0, r3)     // Catch:{ all -> 0x02b0 }
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r1)     // Catch:{ all -> 0x02b0 }
            int r0 = r8 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r3, r0)     // Catch:{ all -> 0x02b0 }
            r0.commit()     // Catch:{ all -> 0x02b0 }
            monitor-exit(r2)     // Catch:{ all -> 0x02b3 }
        L_0x023a:
            java.lang.Object r4 = r5.A0B     // Catch:{ all -> 0x02b3 }
            monitor-enter(r4)     // Catch:{ all -> 0x02b3 }
            X.6Xi r3 = r5.A00     // Catch:{ all -> 0x02a8 }
            if (r3 == 0) goto L_0x024c
            monitor-enter(r3)     // Catch:{ all -> 0x02a8 }
            boolean r1 = r3.A00     // Catch:{ all -> 0x0246 }
            monitor-exit(r3)     // Catch:{ all -> 0x02a8 }
            goto L_0x0249
        L_0x0246:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02a8 }
            throw r0     // Catch:{ all -> 0x02a8 }
        L_0x0249:
            r0 = 1
            if (r1 != 0) goto L_0x024d
        L_0x024c:
            r0 = 0
        L_0x024d:
            monitor-exit(r4)     // Catch:{ all -> 0x02a8 }
            if (r0 == 0) goto L_0x0251
            goto L_0x0285
        L_0x0251:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "google-backup-worker/doWork done with success = "
            r1.append(r0)     // Catch:{ all -> 0x02b3 }
            r1.append(r6)     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = ", attempt: "
            X.C36321k7.A1T(r0, r1, r8)     // Catch:{ all -> 0x02b3 }
            if (r6 == 0) goto L_0x0265
            goto L_0x0293
        L_0x0265:
            boolean r0 = r15.A05()     // Catch:{ all -> 0x02b3 }
            if (r0 != 0) goto L_0x028e
            int r3 = r10.A00     // Catch:{ all -> 0x02b3 }
            if (r8 >= r3) goto L_0x028e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "google-backup-worker/doWork needs to be retried. Resource conditions were  not met. Attempt: "
            r1.append(r0)     // Catch:{ all -> 0x02b3 }
            r1.append(r8)     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = " from "
            X.C36321k7.A1T(r0, r1, r3)     // Catch:{ all -> 0x02b3 }
            X.4ov r1 = X.C97324ov.A00()     // Catch:{ all -> 0x02b3 }
            goto L_0x0297
        L_0x0285:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "google-backup-worker/doWork cancelled by user, attempt: "
            X.C36321k7.A1T(r0, r1, r8)     // Catch:{ all -> 0x02b3 }
        L_0x028e:
            X.4ow r1 = X.C97334ow.A00()     // Catch:{ all -> 0x02b3 }
            goto L_0x0297
        L_0x0293:
            X.4ox r1 = X.C97344ox.A00()     // Catch:{ all -> 0x02b3 }
        L_0x0297:
            X.4ov r0 = X.C97324ov.A00()     // Catch:{ all -> 0x02b3 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x02b3 }
            if (r0 != 0) goto L_0x02a4
            r2.A02()     // Catch:{ all -> 0x02b3 }
        L_0x02a4:
            r13.A06()
            return r1
        L_0x02a8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02a8 }
            goto L_0x02b2
        L_0x02ab:
            r0 = move-exception
            r10.A00()     // Catch:{ all -> 0x02b3 }
            goto L_0x02b2
        L_0x02b0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02b3 }
        L_0x02b2:
            throw r0     // Catch:{ all -> 0x02b3 }
        L_0x02b3:
            r1 = move-exception
            X.1ep r0 = r10.A0B
            r0.A06()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.workers.GoogleBackupWorker.A09():X.5Xj");
    }
}
