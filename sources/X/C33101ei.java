package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import android.os.ConditionVariable;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1ei  reason: invalid class name and case insensitive filesystem */
public class C33101ei implements C33091eh, C19680wL {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public WifiManager.WifiLock A03;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A06 = false;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public final ConditionVariable A0A = new ConditionVariable(false);
    public final ConditionVariable A0B = new ConditionVariable(false);
    public final ConditionVariable A0C = new ConditionVariable(false);
    public final ConditionVariable A0D = new ConditionVariable(false);
    public final ConditionVariable A0E = new ConditionVariable(false);
    public final ConditionVariable A0F = new ConditionVariable(false);
    public final ConditionVariable A0G = new ConditionVariable(false);
    public final AnonymousClass19J A0H;
    public final C33131el A0I = new C33141em(this);
    public final C21060yb A0J;
    public final C19630wG A0K;
    public final C19420v0 A0L;
    public final AnonymousClass19A A0M;
    public final C19890wg A0N;
    public final C19770wU A0O;
    public final AnonymousClass005 A0P;
    public final AtomicBoolean A0Q = new AtomicBoolean(false);
    public final AtomicBoolean A0R = new AtomicBoolean(false);
    public final AtomicBoolean A0S = new AtomicBoolean(false);
    public final AtomicBoolean A0T = new AtomicBoolean(false);
    public final AtomicBoolean A0U = new AtomicBoolean(false);
    public final AtomicBoolean A0V = new AtomicBoolean(false);
    public final AtomicBoolean A0W = new AtomicBoolean(false);
    public final AtomicBoolean A0X = new AtomicBoolean(false);
    public final AtomicBoolean A0Y = new AtomicBoolean(false);
    public final C19730wQ A0Z;
    public final C21360z5 A0a;
    public final C33121ek A0b;
    public final C19600wD A0c;
    public final C19970wo A0d;
    public final AnonymousClass12P A0e;
    public final AnonymousClass190 A0f;
    public final AnonymousClass13I A0g;
    public final AnonymousClass12U A0h;
    public final C21380z9 A0i;
    public final ThreadLocal A0j = new ThreadLocal();

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0220  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C33101ei r18, X.C133226Xi r19, long r20, long r22, long r24, long r26) {
        /*
            r10 = 0
            r13 = r19
            if (r19 == 0) goto L_0x024b
            r11 = r18
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0V
            boolean r18 = r0.get()
            boolean r12 = r11.A06
            X.19J r0 = r11.A0H
            int r1 = r0.A04
            r9 = 2
            r0 = 0
            if (r1 != r9) goto L_0x0018
            r0 = 1
        L_0x0018:
            r2 = 1
            if (r0 != 0) goto L_0x002b
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0Q
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0247
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0R
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0247
        L_0x002b:
            r17 = 1
        L_0x002d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0Q
            r19 = r0
            boolean r0 = r19.get()
            if (r0 != 0) goto L_0x023d
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0R
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x023d
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0S
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0W
            boolean r18 = r0.get()
            boolean r12 = r11.A07
        L_0x004f:
            if (r18 == 0) goto L_0x0066
            if (r12 == 0) goto L_0x0066
            boolean r0 = r11.A09
            if (r0 == 0) goto L_0x0066
            if (r17 == 0) goto L_0x0066
        L_0x0059:
            X.0z9 r1 = r11.A0i
            java.util.concurrent.Executor r0 = X.AnonymousClass6Y6.A00
            r13.A0B(r2)
            java.lang.String r0 = "gdrive_backup"
            r1.A01(r0, r2)
            return r2
        L_0x0066:
            android.net.wifi.WifiManager$WifiLock r0 = r11.A03
            if (r0 == 0) goto L_0x00a7
            boolean r0 = r0.isHeld()
            if (r0 == 0) goto L_0x00a7
            r16 = 1
            r11.A07()
        L_0x0075:
            r5 = r22
            r3 = r24
            r0 = r26
            r7 = r20
            if (r18 != 0) goto L_0x00f4
            X.0v0 r14 = r11.A0L
            int r14 = r14.A0F()
            if (r14 == r2) goto L_0x00ba
            if (r14 != r9) goto L_0x00f4
            int r14 = r11.A02
            X.1ek r15 = r11.A0b
            java.lang.Iterable r15 = r15.getObservers()
            java.util.Iterator r15 = r15.iterator()
            if (r14 != 0) goto L_0x00aa
        L_0x0097:
            boolean r14 = r15.hasNext()
            if (r14 == 0) goto L_0x00e8
            java.lang.Object r14 = r15.next()
            X.1eo r14 = (X.C33151eo) r14
            r14.Bah(r7, r5)
            goto L_0x0097
        L_0x00a7:
            r16 = 0
            goto L_0x0075
        L_0x00aa:
            boolean r14 = r15.hasNext()
            if (r14 == 0) goto L_0x00e8
            java.lang.Object r14 = r15.next()
            X.1eo r14 = (X.C33151eo) r14
            r14.Bad(r7, r5)
            goto L_0x00aa
        L_0x00ba:
            int r14 = r11.A01
            X.1ek r15 = r11.A0b
            java.lang.Iterable r15 = r15.getObservers()
            java.util.Iterator r15 = r15.iterator()
            if (r14 != 0) goto L_0x00d8
        L_0x00c8:
            boolean r14 = r15.hasNext()
            if (r14 == 0) goto L_0x00e8
            java.lang.Object r14 = r15.next()
            X.1eo r14 = (X.C33151eo) r14
            r14.BRw(r0, r3)
            goto L_0x00c8
        L_0x00d8:
            boolean r14 = r15.hasNext()
            if (r14 == 0) goto L_0x00e8
            java.lang.Object r14 = r15.next()
            X.1eo r14 = (X.C33151eo) r14
            r14.BRs(r0, r3)
            goto L_0x00d8
        L_0x00e8:
            X.0z9 r15 = r11.A0i
            java.util.concurrent.Executor r14 = X.AnonymousClass6Y6.A00
            r13.A0B(r10)
            java.lang.String r14 = "gdrive_backup"
            r15.A01(r14, r10)
        L_0x00f4:
            if (r12 != 0) goto L_0x0140
            X.0v0 r14 = r11.A0L
            int r14 = r14.A0F()
            if (r14 == r2) goto L_0x011a
            if (r14 != r9) goto L_0x0140
            X.1ek r14 = r11.A0b
            java.lang.Iterable r14 = r14.getObservers()
            java.util.Iterator r15 = r14.iterator()
        L_0x010a:
            boolean r14 = r15.hasNext()
            if (r14 == 0) goto L_0x0134
            java.lang.Object r14 = r15.next()
            X.1eo r14 = (X.C33151eo) r14
            r14.Bae(r7, r5)
            goto L_0x010a
        L_0x011a:
            X.1ek r14 = r11.A0b
            java.lang.Iterable r14 = r14.getObservers()
            java.util.Iterator r15 = r14.iterator()
        L_0x0124:
            boolean r14 = r15.hasNext()
            if (r14 == 0) goto L_0x0134
            java.lang.Object r14 = r15.next()
            X.1eo r14 = (X.C33151eo) r14
            r14.BRt(r0, r3)
            goto L_0x0124
        L_0x0134:
            X.0z9 r15 = r11.A0i
            java.util.concurrent.Executor r14 = X.AnonymousClass6Y6.A00
            r13.A0B(r10)
            java.lang.String r14 = "gdrive_backup"
            r15.A01(r14, r10)
        L_0x0140:
            boolean r14 = r11.A09
            if (r14 != 0) goto L_0x01b8
            X.0v0 r14 = r11.A0L
            int r15 = r14.A0F()
            java.lang.String r14 = "unmounted"
            if (r15 == r2) goto L_0x0184
            if (r15 != r9) goto L_0x01b8
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            boolean r3 = r14.equals(r0)
            X.1ek r0 = r11.A0b
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
            if (r3 == 0) goto L_0x0174
        L_0x0164:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r0 = r1.next()
            X.1eo r0 = (X.C33151eo) r0
            r0.Bag(r7, r5)
            goto L_0x0164
        L_0x0174:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r0 = r1.next()
            X.1eo r0 = (X.C33151eo) r0
            r0.Baf(r7, r5)
            goto L_0x0174
        L_0x0184:
            java.lang.String r5 = android.os.Environment.getExternalStorageState()
            boolean r7 = r14.equals(r5)
            X.1ek r5 = r11.A0b
            java.lang.Iterable r5 = r5.getObservers()
            java.util.Iterator r6 = r5.iterator()
            if (r7 == 0) goto L_0x01a8
        L_0x0198:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x01b8
            java.lang.Object r5 = r6.next()
            X.1eo r5 = (X.C33151eo) r5
            r5.BRv(r0, r3)
            goto L_0x0198
        L_0x01a8:
            boolean r5 = r6.hasNext()
            if (r5 == 0) goto L_0x01b8
            java.lang.Object r5 = r6.next()
            X.1eo r5 = (X.C33151eo) r5
            r5.BRu(r0, r3)
            goto L_0x01a8
        L_0x01b8:
            if (r17 != 0) goto L_0x01c6
            X.0z9 r1 = r11.A0i
            java.util.concurrent.Executor r0 = X.AnonymousClass6Y6.A00
            r13.A0B(r10)
            java.lang.String r0 = "gdrive_backup"
            r1.A01(r0, r10)
        L_0x01c6:
            boolean r0 = r11.A0D()
            if (r0 == 0) goto L_0x01f2
            boolean r3 = r19.get()
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r3 != 0) goto L_0x020f
            java.util.concurrent.atomic.AtomicBoolean r3 = r11.A0R
            boolean r3 = r3.get()
            if (r3 != 0) goto L_0x020f
            java.util.concurrent.atomic.AtomicBoolean r3 = r11.A0S
            boolean r3 = r3.get()
            if (r3 == 0) goto L_0x021a
            android.os.ConditionVariable r3 = r11.A0C
            boolean r0 = r3.block(r0)
            if (r0 != 0) goto L_0x021a
            java.lang.String r0 = "restore>GoogleBackupConditionsManager/battery-wait/media-restore 86400000 milliseconds, giving up now."
        L_0x01ef:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01f2:
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)
            r1[r10] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r1[r2] = r0
            boolean r0 = r11.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1[r9] = r0
            java.lang.String r0 = "gdrive-service/wait-for-suitable-conditions network-available:%b, battery-available:%b sdcard-available:%b"
            java.lang.String.format(r0, r1)
            return r10
        L_0x020f:
            android.os.ConditionVariable r3 = r11.A0A
            boolean r0 = r3.block(r0)
            if (r0 != 0) goto L_0x021a
            java.lang.String r0 = "GoogleBackupConditionsManager/battery-wait/backup 86400000 milliseconds, giving up now."
            goto L_0x01ef
        L_0x021a:
            boolean r0 = r11.A0E()
            if (r0 == 0) goto L_0x01f2
            boolean r0 = r19.get()
            if (r0 != 0) goto L_0x022e
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0R
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0236
        L_0x022e:
            X.19A r3 = r11.A0M     // Catch:{ 1ej -> 0x01f2 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            r3.A0B(r0)     // Catch:{ 1ej -> 0x01f2 }
        L_0x0236:
            if (r16 == 0) goto L_0x0059
            r11.A03()
            goto L_0x0059
        L_0x023d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0U
            boolean r18 = r0.get()
            boolean r12 = r11.A05
            goto L_0x004f
        L_0x0247:
            r17 = 0
            goto L_0x002d
        L_0x024b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33101ei.A00(X.1ei, X.6Xi, long, long, long, long):boolean");
    }

    public void A01() {
        this.A04 = true;
        this.A0O.Boy(new C35671j4(this, 8));
    }

    public synchronized void A08() {
        boolean z;
        AtomicBoolean atomicBoolean;
        boolean z2;
        AtomicBoolean atomicBoolean2;
        AtomicBoolean atomicBoolean3;
        boolean z3;
        boolean z4;
        C18740tg.A00();
        C19600wD r0 = this.A0c;
        boolean z5 = true;
        int A032 = r0.A03(true);
        this.A00 = A032;
        boolean z6 = false;
        if (A032 != 0) {
            if (A032 == 1) {
                AnonymousClass1M8 A042 = r0.A04();
                if (A042 == null) {
                    Log.i("GoogleBackupConditionsManager/can-use-network/active_network/wifi active network info is null, no connection");
                    this.A0E.close();
                    this.A0F.close();
                    this.A0D.close();
                    atomicBoolean = this.A0V;
                    boolean andSet = atomicBoolean.getAndSet(false);
                    atomicBoolean2 = this.A0W;
                    z = andSet | atomicBoolean2.getAndSet(false);
                    atomicBoolean3 = this.A0U;
                    z2 = atomicBoolean3.getAndSet(false);
                } else if (!A042.A06 || !C19600wD.A01()) {
                    Log.i("GoogleBackupConditionsManager/can-use-network/active_network/wifi");
                    this.A0E.open();
                    this.A0F.open();
                    this.A0D.open();
                    atomicBoolean = this.A0V;
                    boolean z7 = false;
                    if (!atomicBoolean.getAndSet(true)) {
                        z7 = true;
                    }
                    atomicBoolean2 = this.A0W;
                    if (!atomicBoolean2.getAndSet(true)) {
                        z6 = true;
                    }
                    z = z7 | z6;
                    atomicBoolean3 = this.A0U;
                    z3 = atomicBoolean3.getAndSet(true);
                } else {
                    Log.i("GoogleBackupConditionsManager/can-use-network/active_network/wifi/captive");
                    this.A0E.close();
                    this.A0F.close();
                    this.A0D.close();
                    atomicBoolean = this.A0V;
                    boolean andSet2 = atomicBoolean.getAndSet(false);
                    atomicBoolean2 = this.A0W;
                    z = andSet2 | atomicBoolean2.getAndSet(false);
                    atomicBoolean3 = this.A0U;
                    z2 = atomicBoolean3.getAndSet(false);
                }
            } else if (A032 == 2) {
                Log.i("GoogleBackupConditionsManager/can-use-network/active_network/cellular");
                this.A0E.open();
                atomicBoolean = this.A0V;
                boolean z8 = false;
                if (!atomicBoolean.getAndSet(true)) {
                    z8 = true;
                }
                if (this.A04 || this.A01 == 1) {
                    this.A0D.open();
                    atomicBoolean3 = this.A0U;
                    z4 = !atomicBoolean3.getAndSet(true);
                } else {
                    this.A0D.close();
                    atomicBoolean3 = this.A0U;
                    z4 = atomicBoolean3.getAndSet(false);
                }
                z = z8 | z4;
                if (this.A02 == 1) {
                    this.A0F.open();
                    atomicBoolean2 = this.A0W;
                    z3 = atomicBoolean2.getAndSet(true);
                } else {
                    this.A0F.close();
                    atomicBoolean2 = this.A0W;
                    z2 = atomicBoolean2.getAndSet(false);
                }
            } else if (A032 == 3) {
                Log.i("GoogleBackupConditionsManager/can-use-network/active_network/roaming");
                this.A0E.open();
                this.A0F.close();
                this.A0D.close();
                atomicBoolean = this.A0V;
                if (atomicBoolean.getAndSet(true)) {
                    z5 = false;
                }
                atomicBoolean2 = this.A0W;
                z = atomicBoolean2.getAndSet(false) | z5;
                atomicBoolean3 = this.A0U;
                z2 = atomicBoolean3.getAndSet(false);
            }
            z2 = true ^ z3;
        } else {
            Log.i("GoogleBackupConditionsManager/can-use-network/active_network/none");
            this.A0E.close();
            this.A0F.close();
            this.A0D.close();
            atomicBoolean = this.A0V;
            boolean andSet3 = atomicBoolean.getAndSet(false);
            atomicBoolean2 = this.A0W;
            z = andSet3 | atomicBoolean2.getAndSet(false);
            atomicBoolean3 = this.A0U;
            z2 = atomicBoolean3.getAndSet(false);
        }
        if (z || z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("restore>GoogleBackupConditionsManager/can-use-network/message-restore/");
            sb.append(atomicBoolean.get());
            Log.i(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("restore>GoogleBackupConditionsManager/can-use-network/media-restore/");
            sb2.append(atomicBoolean2.get());
            Log.i(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("GoogleBackupConditionsManager/can-use-network/backup/");
            sb3.append(atomicBoolean3.get());
            Log.i(sb3.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c5, code lost:
        if (r1.toString().contains("file is encrypted") != false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c7, code lost:
        com.whatsapp.util.Log.w("databasehelper/getInitialMessageCount/encrypted-file-error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ce, code lost:
        com.whatsapp.util.Log.w("databasehelper/getInitialMessageCount/dbcorrupt", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d3, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0112, code lost:
        if (r4.A0c() == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00cd A[Catch:{ SQLiteDatabaseCorruptException -> 0x00cd, SQLiteException -> 0x00bc }, ExcHandler: SQLiteDatabaseCorruptException (r1v9 'e' android.database.sqlite.SQLiteDatabaseCorruptException A[CUSTOM_DECLARE, Catch:{ all -> 0x0167 }]), Splitter:B:30:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0B() {
        /*
            r11 = this;
            r10 = 0
            X.0wQ r0 = r11.A0Z
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0018
            X.0wG r0 = r11.A0K
            android.content.Context r0 = r0.A00
            boolean r0 = X.C34191gb.A08(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/gdrive-access-not-allowed"
        L_0x0015:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0018:
            return r10
        L_0x0019:
            X.12U r0 = r11.A0h
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/reg-not-verified"
            goto L_0x0015
        L_0x0024:
            X.13I r0 = r11.A0g
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/login-failed"
            goto L_0x0015
        L_0x002d:
            X.0z5 r1 = r11.A0a
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/clock-wrong"
            goto L_0x0015
        L_0x0038:
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/software-expired"
            goto L_0x0015
        L_0x0041:
            X.12P r1 = r11.A0e
            r1.A06()
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0157
            r1.A06()
            X.12f r4 = r1.A02
            X.1M0 r2 = r1.get()
            java.lang.Object r3 = r4.A0C     // Catch:{ all -> 0x0167 }
            monitor-enter(r3)     // Catch:{ all -> 0x0167 }
            java.lang.Boolean r0 = r4.A01     // Catch:{ all -> 0x0164 }
            if (r0 != 0) goto L_0x00da
            X.14e r7 = r2.A02     // Catch:{ all -> 0x0164 }
            java.lang.String r5 = "file is encrypted"
            java.lang.String r0 = "databasehelper/getInitialMessageCount"
            X.14g r9 = new X.14g     // Catch:{ all -> 0x0164 }
            r9.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0164 }
            java.lang.String r6 = "SELECT _id FROM message LIMIT 2"
            r1 = 0
            java.lang.String r0 = "GET_HAS_MESSAGES"
            android.database.Cursor r8 = r7.A09(r6, r0, r1)     // Catch:{ SQLiteFullException -> 0x00b7, SQLiteException -> 0x00a6, SQLiteDatabaseCorruptException -> 0x00cd }
            int r0 = r8.getCount()     // Catch:{ all -> 0x009a }
            r7 = 1
            if (r0 > r7) goto L_0x0076
            r7 = 0
        L_0x0076:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r6.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "databasehelper/checkHasMessagesInDB: hasMessages = "
            r6.append(r0)     // Catch:{ all -> 0x009a }
            r6.append(r7)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = " | time spent:"
            r6.append(r0)     // Catch:{ all -> 0x009a }
            long r0 = r9.A01()     // Catch:{ all -> 0x009a }
            r6.append(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x009a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x009a }
            r8.close()     // Catch:{ SQLiteFullException -> 0x00b7, SQLiteException -> 0x00a6, SQLiteDatabaseCorruptException -> 0x00cd }
            goto L_0x00d4
        L_0x009a:
            r1 = move-exception
            if (r8 == 0) goto L_0x00a5
            r8.close()     // Catch:{ all -> 0x00a1 }
            goto L_0x00a5
        L_0x00a1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteFullException -> 0x00b7, SQLiteException -> 0x00a6, SQLiteDatabaseCorruptException -> 0x00cd }
        L_0x00a5:
            throw r1     // Catch:{ SQLiteFullException -> 0x00b7, SQLiteException -> 0x00a6, SQLiteDatabaseCorruptException -> 0x00cd }
        L_0x00a6:
            r1 = move-exception
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cd, SQLiteException -> 0x00bc }
            boolean r0 = r0.contains(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cd, SQLiteException -> 0x00bc }
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = "databasehelper/getInitialMessageCount/cursor/encrypted-file-error"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cd, SQLiteException -> 0x00bc }
            goto L_0x00d3
        L_0x00b7:
            r1 = move-exception
            X.AnonymousClass12f.A01(r1, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cd, SQLiteException -> 0x00bc }
        L_0x00bb:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00cd, SQLiteException -> 0x00bc }
        L_0x00bc:
            r1 = move-exception
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0164 }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x0164 }
            if (r0 == 0) goto L_0x015b
            java.lang.String r0 = "databasehelper/getInitialMessageCount/encrypted-file-error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0164 }
            goto L_0x00d3
        L_0x00cd:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/getInitialMessageCount/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0164 }
        L_0x00d3:
            r7 = 0
        L_0x00d4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0164 }
            r4.A01 = r0     // Catch:{ all -> 0x0164 }
        L_0x00da:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0164 }
            monitor-exit(r3)     // Catch:{ all -> 0x0164 }
            r2.close()
            if (r0 == 0) goto L_0x0157
            X.0v0 r4 = r11.A0L
            int r2 = r4.A0C()
            r0 = 1
            if (r2 == 0) goto L_0x010c
            if (r2 == r0) goto L_0x010e
            r0 = 2
            if (r2 == r0) goto L_0x010e
            r0 = 3
            if (r2 == r0) goto L_0x010e
            r0 = 4
            if (r2 == r0) goto L_0x010e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/unexpected-backup-freq/"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x010c:
            r8 = 1
            goto L_0x0115
        L_0x010e:
            java.lang.String r0 = r4.A0c()
            if (r0 != 0) goto L_0x0018
            goto L_0x010c
        L_0x0115:
            java.lang.String r3 = "gdrive_next_prompt_for_setup_timestamp"
            r1 = -1
            X.005 r0 = r4.A00     // Catch:{ NumberFormatException -> 0x015c }
            java.lang.Object r0 = r0.get()     // Catch:{ NumberFormatException -> 0x015c }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ NumberFormatException -> 0x015c }
            long r6 = r0.getLong(r3, r1)     // Catch:{ NumberFormatException -> 0x015c }
            long r4 = java.lang.System.currentTimeMillis()
            java.util.Locale r3 = java.util.Locale.ENGLISH
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r2[r10] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2[r8] = r0
            r1 = 2
            long r4 = r4 - r6
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2[r1] = r0
            java.lang.String r0 = "saved time: %d, current time: %d, difference: %d"
            java.lang.String.format(r3, r0, r2)
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0162
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0018
            java.lang.String r0 = "GoogleBackupConditionsManager/sufficient-time-passed-since-last-user-prompt/true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0162
        L_0x0157:
            java.lang.String r0 = "GoogleBackupConditionsManager/should-start/false/message-count-low"
            goto L_0x0015
        L_0x015b:
            throw r1     // Catch:{ all -> 0x0164 }
        L_0x015c:
            r1 = move-exception
            java.lang.String r0 = "GoogleBackupConditionsManager/sufficient-time-passed-since-last-user-prompt/"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0162:
            r10 = 1
            return r10
        L_0x0164:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0164 }
            throw r0     // Catch:{ all -> 0x0167 }
        L_0x0167:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x016c }
            throw r1
        L_0x016c:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33101ei.A0B():boolean");
    }

    public void A02() {
        C19420v0.A00(this.A0L).putString("gdrive_media_restore_network_setting", String.valueOf(1)).apply();
        A05();
        this.A0O.Boy(new C35671j4(this, 8));
    }

    public void A03() {
        if (this.A03 == null) {
            WifiManager A0F2 = this.A0J.A0F();
            if (A0F2 == null) {
                Log.w("GoogleBackupConditionsManager/create-wifi-lock wm=null");
            } else {
                WifiManager.WifiLock createWifiLock = A0F2.createWifiLock(1, "backup-lock");
                this.A03 = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        WifiManager.WifiLock wifiLock = this.A03;
        if (wifiLock != null && !wifiLock.isHeld()) {
            this.A03.acquire();
        }
    }

    public void A04() {
        String str;
        Boolean bool = Boolean.TRUE;
        ThreadLocal threadLocal = this.A0j;
        if (bool != threadLocal.get()) {
            threadLocal.set(bool);
            try {
                C18740tg.A00();
                C19420v0 r7 = this.A0L;
                if (AnonymousClass6Y6.A05(r7)) {
                    AtomicBoolean atomicBoolean = this.A0S;
                    if (!atomicBoolean.get()) {
                        A06();
                        A05();
                        A08();
                        AtomicBoolean atomicBoolean2 = this.A0W;
                        if (!atomicBoolean2.get() || !this.A07 || !this.A09) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("restore>GoogleBackupConditionsManager/trigger-nothing media-restore-pending: ");
                            sb.append(AnonymousClass6Y6.A05(r7));
                            sb.append(" media-restore-running: ");
                            sb.append(atomicBoolean.get());
                            sb.append(" network_available_for_media_restore: ");
                            sb.append(atomicBoolean2.get());
                            sb.append(" battery_available_for_media_restore: ");
                            sb.append(this.A07);
                            sb.append(" sdcard_available: ");
                            sb.append(this.A09);
                            str = sb.toString();
                            Log.i(str);
                        }
                        Log.i("restore>GoogleBackupConditionsManager/trigger-pending-media-restore");
                        Context context = this.A0K.A00;
                        C111795cr.A01(context, AnonymousClass190.A14(context, "action_restore_media"));
                    }
                }
                boolean z = true;
                if (r7.A0F() == 1) {
                    AtomicBoolean atomicBoolean3 = this.A0Q;
                    if (!atomicBoolean3.get()) {
                        A06();
                        A05();
                        A08();
                        AtomicBoolean atomicBoolean4 = this.A0U;
                        if (!atomicBoolean4.get() || !this.A05 || !this.A09) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("GoogleBackupConditionsManager/trigger-nothing is-backup-pending: ");
                            if (r7.A0F() != 1) {
                                z = false;
                            }
                            sb2.append(z);
                            sb2.append(" is-backup-running: ");
                            sb2.append(atomicBoolean3.get());
                            sb2.append(" network_available_for_backup: ");
                            sb2.append(atomicBoolean4.get());
                            sb2.append(" battery_available_for_backup: ");
                            sb2.append(this.A05);
                            sb2.append(" sdcard_available: ");
                            sb2.append(this.A09);
                            str = sb2.toString();
                            Log.i(str);
                        }
                        Context context2 = this.A0K.A00;
                        Intent A14 = AnonymousClass190.A14(context2, "action_backup");
                        A14.putExtra("only_if_pending", true);
                        C111795cr.A01(context2, A14);
                        str = "GoogleBackupConditionsManager/trigger-pending-backup";
                        Log.i(str);
                    }
                }
                if (this.A0X.get() || this.A0Y.get()) {
                    Log.i("GoogleBackupConditionsManager/service-running/recalculate-network-and-sdcard");
                    A06();
                    A05();
                    A08();
                }
                str = "GoogleBackupConditionsManager/trigger-nothing/nothing-pending";
                Log.i(str);
            } finally {
                threadLocal.set(Boolean.FALSE);
            }
        }
    }

    public void A05() {
        int i;
        try {
            C19420v0 r1 = this.A0L;
            this.A01 = r1.A0D();
            try {
                i = Integer.parseInt(((SharedPreferences) r1.A00.get()).getString("gdrive_media_restore_network_setting", String.valueOf(0)));
            } catch (NumberFormatException e) {
                Log.e("wa-shared-preferences/get-media-restore-network-setting", e);
                i = 0;
            }
            this.A02 = i;
        } catch (NumberFormatException e2) {
            Log.e((Throwable) e2);
        }
    }

    public void A07() {
        WifiManager.WifiLock wifiLock = this.A03;
        if (wifiLock != null && wifiLock.isHeld()) {
            this.A03.release();
        }
    }

    public boolean A0D() {
        String str;
        if (this.A0Q.get() || this.A0R.get()) {
            if (this.A0D.block(1800000)) {
                return true;
            }
            str = "GoogleBackupConditionsManager/network-wait/backup 1800000 milliseconds, giving up now.";
        } else if (this.A0S.get()) {
            if (this.A0F.block(1800000)) {
                return true;
            }
            Log.e("restore>GoogleBackupConditionsManager/network-wait/media-restore 1800000 milliseconds, giving up now.");
            return true;
        } else if (this.A0E.block(1800000)) {
            return true;
        } else {
            str = "restore>GoogleBackupConditionsManager/network-wait/message-restore 1800000 milliseconds, giving up now.";
        }
        Log.e(str);
        return false;
    }

    public void BUP(AnonymousClass3K7 r4) {
        this.A0O.Boy(new C35671j4(this, 7));
    }

    public void A06() {
        A0A(Environment.getExternalStorageState());
    }

    public void A09(AnonymousClass15u r7) {
        int i;
        double A002 = r7.A00();
        boolean z = false;
        if (!Double.isNaN(A002)) {
            i = (int) A002;
        } else {
            i = 0;
        }
        this.A0B.open();
        boolean z2 = true;
        this.A06 = true;
        if (this.A08 || r7.A01()) {
            this.A0A.open();
            this.A0C.open();
            if (!this.A05 || !this.A07) {
                z = true;
            }
            this.A05 = true;
            this.A07 = true;
            z2 = z;
        } else {
            this.A0A.close();
            this.A0C.close();
            if (!this.A05 && !this.A07) {
                z2 = false;
            }
            this.A05 = false;
            this.A07 = false;
        }
        if (z2) {
            StringBuilder sb = new StringBuilder();
            sb.append("GoogleBackupConditionsManager/can-use-battery/battery-level/");
            sb.append(i);
            Log.i(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("GoogleBackupConditionsManager/can-use-battery-for-backup/");
            sb2.append(this.A05);
            Log.i(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("restore>GoogleBackupConditionsManager/can-use-battery-for-media-restore/");
            sb3.append(this.A07);
            Log.i(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("GoogleBackupConditionsManager/ignore-battery-status/");
            sb4.append(this.A08);
            Log.i(sb4.toString());
        }
    }

    public void A0A(String str) {
        C18740tg.A00();
        boolean equals = "mounted".equals(str);
        ConditionVariable conditionVariable = this.A0G;
        if (equals) {
            conditionVariable.open();
            if (!this.A09) {
                this.A09 = true;
                if (C34191gb.A08(this.A0K.A00)) {
                    A04();
                    return;
                }
                return;
            }
            return;
        }
        conditionVariable.close();
        this.A09 = false;
    }

    @Deprecated
    public boolean A0C() {
        return A0B();
    }

    public boolean A0E() {
        if (this.A0G.block(86400000)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GoogleBackupConditionsManager/sdcard-wait ");
        sb.append(86400000);
        sb.append(" milliseconds, giving up now.");
        Log.e(sb.toString());
        return false;
    }

    public boolean A0F(int i) {
        C18740tg.A00();
        if (i == 0 || i == 1) {
            this.A01 = i;
            A08();
            C19420v0.A00(this.A0L).putString("interface_gdrive_backup_network_setting", String.valueOf(i)).apply();
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GoogleBackupConditionsManager/set-backup-network-setting/incorrect-value/");
        sb.append(i);
        Log.e(sb.toString());
        return false;
    }

    public void BS5(AnonymousClass15u r1) {
        A09(r1);
    }

    public C33101ei(C19730wQ r3, C21360z5 r4, AnonymousClass19J r5, C33121ek r6, C19600wD r7, C21060yb r8, C19970wo r9, C19630wG r10, C19420v0 r11, AnonymousClass12P r12, AnonymousClass190 r13, AnonymousClass19A r14, C19890wg r15, AnonymousClass13I r16, AnonymousClass12U r17, C19770wU r18, C21380z9 r19, AnonymousClass005 r20) {
        this.A0K = r10;
        this.A0d = r9;
        this.A0Z = r3;
        this.A0f = r13;
        this.A0O = r18;
        this.A0a = r4;
        this.A0g = r16;
        this.A0M = r14;
        this.A0J = r8;
        this.A0H = r5;
        this.A0e = r12;
        this.A0L = r11;
        this.A0P = r20;
        this.A0i = r19;
        this.A0h = r17;
        this.A0N = r15;
        this.A0c = r7;
        this.A0b = r6;
    }
}
