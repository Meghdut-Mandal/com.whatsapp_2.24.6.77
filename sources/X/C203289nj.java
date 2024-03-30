package X;

import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.9nj  reason: invalid class name and case insensitive filesystem */
public class C203289nj {
    public static final C20070wy A0K;
    public static final String[] A0L = new String[0];
    public final C19730wQ A00;
    public final C25791Hr A01;
    public final C25911Id A02;
    public final C25971Ij A03;
    public final C587630y A04;
    public final AnonymousClass1AB A05;
    public final C237119n A06;
    public final AnonymousClass1IS A07;
    public final AnonymousClass1A9 A08;
    public final AnonymousClass1AK A09;
    public final C19980wp A0A;
    public final C19970wo A0B;
    public final AnonymousClass1IU A0C;
    public final AnonymousClass18P A0D;
    public final C236419g A0E;
    public final AnonymousClass1IT A0F;
    public final AnonymousClass1AC A0G;
    public final C20810yC A0H;
    public final C24451Cm A0I;
    public final C19700wN A0J;

    static {
        C20090x0 r2 = new C20090x0();
        r2.put(400, 64);
        r2.put(404, 65);
        r2.put(405, 66);
        r2.put(406, 67);
        A0K = r2.build();
    }

    private void A00() {
        this.A0I.A01();
        C587630y r1 = this.A04;
        Log.i("sync-manager/onFailed");
        AnonymousClass196 r12 = r1.A00;
        AnonymousClass196.A02(r12, false);
        if (r12.A0R()) {
            r12.A08.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        if (r10 != false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C203289nj r7, java.lang.Long r8, boolean r9, boolean r10) {
        /*
            if (r9 == 0) goto L_0x005a
            X.19n r6 = r7.A06
            android.content.SharedPreferences r0 = X.C237119n.A00(r6)
            java.lang.String r5 = "first_transient_server_failure_timestamp"
            r3 = 0
            long r1 = r0.getLong(r5, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0046
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = X.C237119n.A00(r6)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C36341k9.A0w(r0, r5, r1)
        L_0x0023:
            if (r8 == 0) goto L_0x007b
            X.30y r2 = r7.A04
            long r3 = r8.longValue()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "sync-manager/onRetryNeeded "
            X.C36321k7.A1V(r0, r1, r3)
            X.196 r5 = r2.A00
            r0 = 0
            X.AnonymousClass196.A02(r5, r0)
            boolean r0 = r5.A0R()
            if (r0 == 0) goto L_0x005d
            X.1Ic r0 = r5.A08
            r0.A00()
            return
        L_0x0046:
            long r3 = X.C36441kJ.A0A(r1)
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0023
            java.lang.Integer r1 = X.C36361kB.A0i()
            r0 = 0
            r7.A06(r1, r0)
            return
        L_0x005a:
            if (r10 == 0) goto L_0x007b
            goto L_0x0023
        L_0x005d:
            monitor-enter(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = "sync-manager/scheduleSync with delay "
            X.C36321k7.A1V(r0, r1, r3)     // Catch:{ all -> 0x0078 }
            X.0wU r2 = r5.A0W     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "SyncManager/scheduleSync"
            X.1iH r0 = new X.1iH     // Catch:{ all -> 0x0078 }
            r0.<init>(r5)     // Catch:{ all -> 0x0078 }
            X.1jE r0 = r2.BpM(r0, r1, r3)     // Catch:{ all -> 0x0078 }
            r5.A02 = r0     // Catch:{ all -> 0x0078 }
            monitor-exit(r5)     // Catch:{ all -> 0x0078 }
            return
        L_0x0078:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0078 }
            throw r0
        L_0x007b:
            r7.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203289nj.A01(X.9nj, java.lang.Long, boolean, boolean):void");
    }

    private void A04(C176158bf r5, String str, int i) {
        this.A0J.A0E("malformed_syncd_mutation", r5.getMessage(), false);
        this.A05.A01.A06("invalid_action_counter", 1);
        throw new AnonymousClass198(i, str);
    }

    public void A07(Throwable th) {
        boolean z;
        boolean z2;
        Long A002;
        if (th instanceof AnonymousClass198) {
            AnonymousClass198 r5 = (AnonymousClass198) th;
            A06(Integer.valueOf(r5.errorCode), r5.collectionName);
        } else if (th instanceof C1032554o) {
            A00();
        } else {
            if (th instanceof C1032654p) {
                z = ((C1032654p) th).isServerTransient;
                z2 = !z;
                A002 = this.A0I.A00();
            } else {
                boolean z3 = th instanceof SQLiteFullException;
                z = false;
                z2 = true;
                A002 = this.A0I.A00();
                if (!z3) {
                    A01(this, A002, true, false);
                    return;
                }
            }
            A01(this, A002, z, z2);
        }
    }

    public C203289nj(C19700wN r2, C19730wQ r3, C25791Hr r4, C25911Id r5, C25971Ij r6, C587630y r7, AnonymousClass1AB r8, C237119n r9, AnonymousClass1IS r10, AnonymousClass1A9 r11, AnonymousClass1AK r12, C19980wp r13, C19970wo r14, AnonymousClass1IU r15, AnonymousClass18P r16, C236419g r17, AnonymousClass1IT r18, AnonymousClass1AC r19, C20810yC r20, C24451Cm r21) {
        this.A0B = r14;
        this.A0H = r20;
        this.A0J = r2;
        this.A00 = r3;
        this.A0D = r16;
        this.A08 = r11;
        this.A09 = r12;
        this.A05 = r8;
        this.A01 = r4;
        this.A0G = r19;
        this.A07 = r10;
        this.A0F = r18;
        this.A0E = r17;
        this.A0C = r15;
        this.A06 = r9;
        this.A02 = r5;
        this.A03 = r6;
        this.A0A = r13;
        this.A0I = r21;
        this.A04 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (r9 != 0) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C203289nj r29, java.util.List r30) {
        /*
            java.util.Iterator r14 = r30.iterator()
        L_0x0004:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x025f
            java.lang.Object r11 = r14.next()
            X.37s r11 = (X.C604037s) r11
            java.lang.String r4 = r11.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SyncResponseHandler/handleIncomingPatches for collection="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; size="
            r1.append(r0)
            java.util.List r2 = r11.A02
            int r0 = r2.size()
            r1.append(r0)
            java.lang.String r0 = "; hasMorePatch="
            r1.append(r0)
            boolean r8 = r11.A03
            X.C36331k8.A1S(r1, r8)
            r15 = r29
            X.0wQ r3 = r15.A00
            boolean r0 = r3.A0L()
            r5 = 0
            if (r0 == 0) goto L_0x005c
            X.1IT r0 = r15.A0F
            java.lang.Long r6 = r0.A01(r4)
            X.0wp r0 = r15.A0A
            android.content.SharedPreferences r1 = X.C19980wp.A00(r0)
            java.lang.String r0 = "companion_syncd_critical_bootstrap_state"
            int r1 = r1.getInt(r0, r5)
            r0 = 1
            if (r1 == r0) goto L_0x0202
            r0 = 2
            if (r1 == r0) goto L_0x0202
            if (r6 != 0) goto L_0x005c
        L_0x005b:
            r5 = 1
        L_0x005c:
            X.4uL r1 = r11.A00
            java.lang.String r6 = " with version: "
            if (r1 == 0) goto L_0x0149
            X.1IT r0 = r15.A0F
            java.lang.Long r0 = r0.A01(r4)
            r11 = 0
            if (r0 != 0) goto L_0x013e
            r9 = 0
        L_0x006e:
            boolean r0 = r3.A0L()
            if (r0 == 0) goto L_0x0079
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r3 = 1
            if (r0 == 0) goto L_0x007a
        L_0x0079:
            r3 = 0
        L_0x007a:
            java.lang.String r0 = "Only companion devices that are undergoing bootstrap should receive and handle snapshots."
            X.C18740tg.A0E(r3, r0)
            X.0wo r0 = r15.A0B
            long r20 = X.C19970wo.A00(r0)
            X.1Ij r0 = r15.A03     // Catch:{ Exception -> 0x022c }
            X.5Br r9 = new X.5Br     // Catch:{ Exception -> 0x022c }
            r9.<init>(r0, r1, r4)     // Catch:{ Exception -> 0x022c }
            r0 = 1
            X.C25971Ij.A00(r9, r4, r0)     // Catch:{ Exception -> 0x022c }
            java.io.File r0 = r9.A00     // Catch:{ 186 -> 0x0210, IOException -> 0x021e }
            byte[] r3 = X.AnonymousClass14R.A00(r0)     // Catch:{ 186 -> 0x0210, IOException -> 0x021e }
            X.8Qn r0 = X.C173138Qn.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0210, IOException -> 0x021e }
            X.8Hz r7 = X.C170918Hz.A08(r0, r3)     // Catch:{ 186 -> 0x0210, IOException -> 0x021e }
            X.8Qn r7 = (X.C173138Qn) r7     // Catch:{ 186 -> 0x0210, IOException -> 0x021e }
            r9.A03()     // Catch:{ 186 -> 0x0210, IOException -> 0x021e }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 186 -> 0x0210, IOException -> 0x021e }
            java.lang.String r0 = "external-mutations-downloader: downloaded snapshot= "
            X.C36321k7.A1K(r7, r0, r3)     // Catch:{ 186 -> 0x0210, IOException -> 0x021e }
            if (r5 == 0) goto L_0x00bb
            X.1Id r0 = r15.A02     // Catch:{ Exception -> 0x022c }
            r22 = 1
            r18 = 0
            r17 = r1
            r19 = r4
            r16 = r0
            r16.A01(r17, r18, r19, r20, r22)     // Catch:{ Exception -> 0x022c }
        L_0x00bb:
            int r0 = r7.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0144
            X.8O3 r0 = r7.version_
            r1 = r0
            if (r0 != 0) goto L_0x00c8
            X.8O3 r0 = X.AnonymousClass8O3.DEFAULT_INSTANCE
        L_0x00c8:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0144
            if (r1 != 0) goto L_0x00d2
            X.8O3 r1 = X.AnonymousClass8O3.DEFAULT_INSTANCE
        L_0x00d2:
            long r0 = r1.version_
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.lang.String r3 = "SyncResponseHandler/handleIncomingPatches applying snapshot for collection "
            r9.append(r3)
            r9.append(r4)
            X.C36321k7.A1V(r6, r9, r0)
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            X.B6c r3 = r7.records_
            java.util.Iterator r13 = r3.iterator()
        L_0x00ed:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x012a
            java.lang.Object r11 = r13.next()
            X.8QF r11 = (X.AnonymousClass8QF) r11
            X.8PL r3 = X.AnonymousClass8PL.DEFAULT_INSTANCE
            X.8NN r12 = r3.A0p()
            X.90T r3 = X.AnonymousClass90T.SET
            X.8Hz r9 = X.C90524aI.A0H(r12)
            X.8PL r9 = (X.AnonymousClass8PL) r9
            int r3 = r3.value
            r9.operation_ = r3
            int r3 = r9.bitField0_
            r3 = r3 | 1
            r9.bitField0_ = r3
            X.8Hz r9 = X.C90524aI.A0H(r12)
            X.8PL r9 = (X.AnonymousClass8PL) r9
            r11.getClass()
            r9.record_ = r11
            int r3 = r9.bitField0_
            r3 = r3 | 2
            r9.bitField0_ = r3
            X.8Hz r3 = r12.A0R()
            r10.add(r3)
            goto L_0x00ed
        L_0x012a:
            r16 = 0
            r20 = r0
            r22 = r5
            r18 = r4
            r19 = r10
            r17 = r7
            boolean r0 = r15.A05(r16, r17, r18, r19, r20, r22)
            if (r0 != 0) goto L_0x0149
            goto L_0x0004
        L_0x013e:
            long r9 = r0.longValue()
            goto L_0x006e
        L_0x0144:
            java.lang.String r0 = "SyncResponseHandler/handleIncomingPatches snapshot has no version, cannot apply"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0149:
            java.util.Iterator r12 = r2.iterator()
        L_0x014d:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01f9
            java.lang.Object r7 = r12.next()
            X.8Ro r7 = (X.C173408Ro) r7
            int r0 = r7.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01f2
            X.8O3 r0 = r7.version_
            r1 = r0
            if (r0 != 0) goto L_0x0166
            X.8O3 r0 = X.AnonymousClass8O3.DEFAULT_INSTANCE
        L_0x0166:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01f2
            if (r1 != 0) goto L_0x0170
            X.8O3 r1 = X.AnonymousClass8O3.DEFAULT_INSTANCE
        L_0x0170:
            long r0 = r1.version_
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "SyncResponseHandler/handleIncomingPatches applying patch for collection "
            r3.append(r2)
            r3.append(r4)
            X.C36321k7.A1V(r6, r3, r0)
            X.0wo r2 = r15.A0B
            long r20 = X.C19970wo.A00(r2)
            int r2 = r7.bitField0_     // Catch:{ Exception -> 0x0250 }
            r2 = r2 & 2
            if (r2 == 0) goto L_0x01bb
            X.1Ij r3 = r15.A03     // Catch:{ Exception -> 0x0250 }
            X.4uL r2 = r7.externalMutations_     // Catch:{ Exception -> 0x0250 }
            if (r2 != 0) goto L_0x0195
            X.4uL r2 = X.C100024uL.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x0250 }
        L_0x0195:
            X.5Br r10 = new X.5Br     // Catch:{ Exception -> 0x0250 }
            r10.<init>(r3, r2, r4)     // Catch:{ Exception -> 0x0250 }
            r2 = 0
            X.C25971Ij.A00(r10, r4, r2)     // Catch:{ Exception -> 0x0250 }
            java.io.File r2 = r10.A00     // Catch:{ 186 -> 0x0234, IOException -> 0x0242 }
            byte[] r3 = X.AnonymousClass14R.A00(r2)     // Catch:{ 186 -> 0x0234, IOException -> 0x0242 }
            X.8NY r2 = X.AnonymousClass8NY.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0234, IOException -> 0x0242 }
            X.8Hz r9 = X.C170918Hz.A08(r2, r3)     // Catch:{ 186 -> 0x0234, IOException -> 0x0242 }
            X.8NY r9 = (X.AnonymousClass8NY) r9     // Catch:{ 186 -> 0x0234, IOException -> 0x0242 }
            r10.A03()     // Catch:{ 186 -> 0x0234, IOException -> 0x0242 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 186 -> 0x0234, IOException -> 0x0242 }
            java.lang.String r2 = "external-mutations-downloader: downloaded mutations= "
            X.C36321k7.A1K(r9, r2, r3)     // Catch:{ 186 -> 0x0234, IOException -> 0x0242 }
            X.B6c r9 = r9.mutations_     // Catch:{ Exception -> 0x0250 }
            goto L_0x01bd
        L_0x01bb:
            X.B6c r9 = r7.mutations_     // Catch:{ Exception -> 0x0250 }
        L_0x01bd:
            if (r5 == 0) goto L_0x01d0
            X.1Id r2 = r15.A02     // Catch:{ Exception -> 0x0250 }
            r28 = 1
            r23 = 0
            r22 = r2
            r24 = r7
            r25 = r4
            r26 = r20
            r22.A01(r23, r24, r25, r26, r28)     // Catch:{ Exception -> 0x0250 }
        L_0x01d0:
            X.1AB r10 = r15.A05
            int r2 = r9.size()
            long r2 = (long) r2
            X.19n r11 = r10.A01
            java.lang.String r10 = "mutation_counter"
            r11.A06(r10, r2)
            r17 = 0
            r20 = r0
            r22 = r5
            r18 = r4
            r19 = r9
            r16 = r7
            boolean r0 = r15.A05(r16, r17, r18, r19, r20, r22)
            if (r0 != 0) goto L_0x014d
            goto L_0x0004
        L_0x01f2:
            java.lang.String r0 = "SyncResponseHandler/handleIncomingPatches incoming patch has no version. Cannot apply."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x014d
        L_0x01f9:
            if (r8 != 0) goto L_0x0004
            X.1IT r0 = r15.A0F
            r0.A03(r4)
            goto L_0x0004
        L_0x0202:
            if (r6 == 0) goto L_0x005b
            long r9 = r6.longValue()
            r6 = 0
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x005c
            goto L_0x005b
        L_0x0210:
            r2 = move-exception
            java.lang.String r0 = "external-mutations-downloader/failed to parse snapshot into ProtoBuf"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ Exception -> 0x022c }
            r0 = 70
            X.198 r3 = new X.198     // Catch:{ Exception -> 0x022c }
            r3.<init>(r0, r4)     // Catch:{ Exception -> 0x022c }
            goto L_0x022b
        L_0x021e:
            r2 = move-exception
            java.lang.String r0 = "external-mutations-downloader/failed to read snapshot"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ Exception -> 0x022c }
            java.lang.String r0 = "Failed to read snapshot from file"
            X.54o r3 = new X.54o     // Catch:{ Exception -> 0x022c }
            r3.<init>(r0, r2)     // Catch:{ Exception -> 0x022c }
        L_0x022b:
            throw r3     // Catch:{ Exception -> 0x022c }
        L_0x022c:
            r0 = move-exception
            if (r5 == 0) goto L_0x025e
            X.1Id r5 = r15.A02
            r11 = 0
            r7 = 0
            goto L_0x0257
        L_0x0234:
            r1 = move-exception
            java.lang.String r0 = "external-mutations-downloader/failed to parse mutations into ProtoBuf"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0250 }
            r0 = 26
            X.198 r2 = new X.198     // Catch:{ Exception -> 0x0250 }
            r2.<init>(r0, r4)     // Catch:{ Exception -> 0x0250 }
            goto L_0x024f
        L_0x0242:
            r1 = move-exception
            java.lang.String r0 = "external-mutations-downloader/failed to read mutations"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0250 }
            java.lang.String r0 = "Failed to read mutations from file"
            X.54o r2 = new X.54o     // Catch:{ Exception -> 0x0250 }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x0250 }
        L_0x024f:
            throw r2     // Catch:{ Exception -> 0x0250 }
        L_0x0250:
            r0 = move-exception
            if (r5 == 0) goto L_0x025e
            X.1Id r5 = r15.A02
            r11 = 0
            r1 = 0
        L_0x0257:
            r6 = r1
            r8 = r4
            r9 = r20
            r5.A01(r6, r7, r8, r9, r11)
        L_0x025e:
            throw r0
        L_0x025f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203289nj.A02(X.9nj, java.util.List):void");
    }

    private void A03(C176158bf r5, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SyncResponseHandler/handleMutationException failed with MutationException, reason ");
        Log.e(C36381kD.A10(A0u, r5.reason), r5);
        int i = r5.reason;
        if (i == 0) {
            A04(r5, str, 19);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (i == 1) {
            A04(r5, str, 21);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (i == 2) {
            A04(r5, str, 23);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (i == 3) {
            A04(r5, str, 24);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (i == 4) {
            A04(r5, str, 22);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (i == 6) {
            this.A05.A01.A06("unsupported_action_counter", 1);
        } else if (i == 7) {
            A04(r5, str, 25);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            throw C165567td.A0U("Unhandled MutationException with reason: ", AnonymousClass000.A0u(), i);
        }
    }

    public void A06(Integer num, String str) {
        String str2;
        String str3;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SyncResponseHandler/fatalFailure reason:");
        Integer num2 = num;
        C36321k7.A1Z(A0u, C36331k8.A0h(num2));
        C19700wN r4 = this.A0J;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("errorCode:");
        A0u2.append(num2);
        String str4 = str;
        r4.A0E("app-sate-sync-handle-fatal-exception", AnonymousClass000.A0p("; collectionName:", str4, A0u2), false);
        if (num != null) {
            this.A05.A09(num2.intValue(), str4, true);
        }
        this.A0I.A01();
        C36341k9.A0u(C237119n.A00(this.A06).edit(), "first_transient_server_failure_timestamp");
        C587630y r2 = this.A04;
        C36321k7.A1Q("sync-manager/onFatalFailure for collection ", str4, AnonymousClass000.A0u());
        AnonymousClass196 r22 = r2.A00;
        r22.A08.A00();
        AnonymousClass196.A02(r22, false);
        Iterator A0s = C36361kB.A0s(r22.A0H);
        if (A0s.hasNext()) {
            A0s.next();
            throw AnonymousClass001.A0A("onSyncdDisabled");
        }
        synchronized (r22) {
            r22.A01 = null;
        }
        if (!r22.A06.A0L()) {
            r22.A0I(1);
            return;
        }
        C25941Ig r42 = r22.A0A;
        C19730wQ r5 = r42.A00;
        C18740tg.A0E(r5.A0L(), "method should only be called by a device in companion mode");
        C19980wp r23 = r42.A03;
        C36331k8.A0w(C19980wp.A00(r23).edit(), "companion_syncd_dirty", true);
        PhoneUserJid A0n = C36441kJ.A0n(r5);
        if (A0n == null) {
            str3 = "CompanionSyncdFatalHandler/my user jid is null.";
        } else {
            try {
                DeviceJid A012 = DeviceJid.Companion.A01(A0n, 0);
                C64933Qa A022 = r42.A06.A02(A0n, true);
                C19970wo r0 = r42.A04;
                AnonymousClass5J6 r10 = new AnonymousClass5J6(A022, Collections.singleton(str4), C19970wo.A00(r0), C19970wo.A00(r0));
                r10.A00 = A012;
                if (r42.A05.A01(r10) < 0) {
                    str3 = "CompanionSyncdFatalHandler/failed to add peer message";
                } else {
                    r42.A01.A01(new SendPeerMessageJob(A012, r10));
                    SystemClock.sleep(5000);
                    int A013 = C36371kC.A01(C19980wp.A00(r23), "companion_syncd_critical_bootstrap_state");
                    boolean z = true;
                    if (!(A013 == 1 || A013 == 2)) {
                        z = false;
                    }
                    C25951Ih r1 = r42.A02;
                    if (z) {
                        str2 = "syncd_error_during_bootstrap";
                    } else {
                        str2 = "syncd_failure";
                    }
                    r1.A01(str2, true, true);
                    return;
                }
            } catch (C19740wR unused) {
                Log.e("CompanionSyncdFatalHandler/cannot get primary device jid.");
                return;
            }
        }
        Log.e(str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x017c, code lost:
        if (r52 == null) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0182, code lost:
        if ((r6.bitField0_ & 4) == 0) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0184, code lost:
        r3 = r6.keyId_;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0187, code lost:
        if (r3 != null) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0189, code lost:
        r3 = X.AnonymousClass8O0.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x018f, code lost:
        if ((r3.bitField0_ & 1) == 0) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0191, code lost:
        if (r4 != null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0194, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations missing snapshot key");
        r5 = new X.AnonymousClass198(59, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01a2, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01a4, code lost:
        r4 = X.AnonymousClass8O0.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01a6, code lost:
        r4 = new X.C201539jo(r4.id_.A06());
        r11.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01b4, code lost:
        r34 = r1.A08.A06(r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01c0, code lost:
        if (r34.containsValue((java.lang.Object) null) == false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01c2, code lost:
        com.whatsapp.util.Log.i("SyncResponseHandler/applyMutations keyMap contains null value, retry");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01c7, code lost:
        r20.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01cc, code lost:
        r33 = r34.get(r4);
        X.C18740tg.A06(r33);
        r33 = (X.C195589Va) r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01db, code lost:
        if (r51 == null) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01dd, code lost:
        r4 = r1.A07;
        r3 = r2.bitField0_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01e3, code lost:
        if ((r3 & 8) == 0) goto L_0x082f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01e7, code lost:
        if ((r3 & 4) == 0) goto L_0x0821;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r10 = r2.patchMac_.A06();
        r27 = r2.snapshotMac_.A06();
        r9 = X.C90524aI.A0l();
        r7 = r35.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0201, code lost:
        if (r7.hasNext() == false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0203, code lost:
        r9.add(((X.AnonymousClass9MW) r7.next()).A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x020f, code lost:
        r7 = r4.A07;
        r3 = r2.version_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0213, code lost:
        if (r3 != null) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0215, code lost:
        r3 = X.AnonymousClass8O3.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x022d, code lost:
        if (java.util.Arrays.equals(r10, r7.A04(r33, r0, X.C203239na.A04(r9), r27, r3.version_)) == false) goto L_0x0805;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x022f, code lost:
        com.whatsapp.util.Log.i("SyncEncryptionHelper/validatePatchMac/patch mac validated");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        r28 = X.C36441kJ.A16();
        r32 = X.C36441kJ.A16();
        r27 = X.C36441kJ.A16();
        r31 = X.AnonymousClass001.A0I();
        r30 = X.AnonymousClass001.A0I();
        r29 = X.AnonymousClass001.A0I();
        r26 = X.AnonymousClass001.A0I();
        r25 = X.AnonymousClass001.A0J();
        r24 = r35.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x025c, code lost:
        if (r24.hasNext() == false) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x025e, code lost:
        r9 = (X.AnonymousClass9MW) r24.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r3 = r9.A01;
        r38 = r3;
        r3 = r34.get(r3);
        X.C18740tg.A06(r3);
        r3 = (X.C195589Va) r3;
        r7 = r1.A0C;
        r12 = r9.A02;
        r4 = X.C203239na.A07(r12, 16, (r12.length - 32) - 16, 32);
        r14 = r4[0];
        r13 = r4[1];
        r23 = r4[2];
        r7 = r7.A00.A00(r3.A00);
        r15 = X.C203239na.A05(r14, r13);
        r4 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ad, code lost:
        if (java.util.Arrays.equals(r23, X.AnonymousClass1IU.A00(r3.A01, r4.A01, r7.A04, r15)) == false) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02af, code lost:
        r11 = X.AnonymousClass1IU.A02(r14, r13, r7.A03, 2);
        r10 = r9.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r11 = (X.AnonymousClass8R3) X.C170918Hz.A08(X.AnonymousClass8R3.DEFAULT_INSTANCE, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02bf, code lost:
        if (r11 == null) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r12 = r11.bitField0_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02cb, code lost:
        if (X.AnonymousClass000.A1P(r12 & 8) == false) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r40 = java.lang.Integer.valueOf(r11.version_);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02d4, code lost:
        r40 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02d8, code lost:
        if ((r12 & 1) == 0) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02db, code lost:
        r41 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02de, code lost:
        r3 = r11.index_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02e0, code lost:
        if (r3 == null) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02e2, code lost:
        r41 = r3.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02ea, code lost:
        if ((r11.bitField0_ & 2) == 0) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02ec, code lost:
        r3 = r11.value_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02ee, code lost:
        if (r3 != null) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02f0, code lost:
        r3 = X.AnonymousClass8SS.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02f2, code lost:
        if (r3 == null) goto L_0x02f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02f5, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02f7, code lost:
        if (r40 == null) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02f9, code lost:
        if (r41 == null) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02fb, code lost:
        if (r3 != null) goto L_0x0359;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02ff, code lost:
        if (r4 == X.C199769fw.A02) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0301, code lost:
        r36 = new X.C176158bf(r4, r38, (X.AnonymousClass8SS) null, r40, r41, r10, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x030d, code lost:
        r41 = new X.C176158bf(r4, r38, r3, r40, (java.lang.String) null, r10, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0323, code lost:
        r36 = new X.C176158bf(r4, r38, r3, r40, r41, r10, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0331, code lost:
        r36 = new X.C176158bf(r4, (X.C201539jo) null, (X.AnonymousClass8SS) null, (java.lang.Integer) null, (java.lang.String) null, r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        r36 = new X.C176158bf(r4, (X.C201539jo) null, (X.AnonymousClass8SS) null, (java.lang.Integer) null, (java.lang.String) null, r10, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x035f, code lost:
        if (X.C165577te.A1W(r3.bitField0_) != false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0363, code lost:
        if (r4 == X.C199769fw.A02) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0365, code lost:
        r36 = new X.C176158bf(r4, r38, r3, r40, r41, r10, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r36 = new X.C176158bf(r4, r38, r3, r40, r41, r10, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0386, code lost:
        r36 = new X.C202599mH(r4, r38, r3, r41, r10, X.C202599mH.A01(r41), r40.intValue());
        r12 = r36.A04;
        r3 = X.AnonymousClass1IU.A01(com.facebook.msys.mci.DefaultCrypto.HMAC_SHA256, r12.getBytes(X.C19430v1.A0D), r7.A02);
        r4 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03af, code lost:
        if (java.util.Arrays.equals(r4, r3) == false) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03b1, code lost:
        r25.put(r12, r4);
        r7 = r36.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03bc, code lost:
        if (r7 != X.C199769fw.A03) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03be, code lost:
        r31.add(r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03c9, code lost:
        if (r32.add(r12) != false) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03cb, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations same index for multi set mutations");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03d0, code lost:
        if (r51 == null) goto L_0x0427;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03d2, code lost:
        r3 = new X.AnonymousClass198(6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03db, code lost:
        if (r7 != X.C199769fw.A02) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03dd, code lost:
        r3 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03e9, code lost:
        if (r36.A06[0].equals("contact") == false) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03eb, code lost:
        r3 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03ed, code lost:
        r3.add(r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03f6, code lost:
        if (r27.add(r12) != false) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03f8, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations same index for multi remove mutations");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03fd, code lost:
        if (r51 == null) goto L_0x0406;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03ff, code lost:
        r3 = new X.AnonymousClass198(6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0406, code lost:
        r3 = new X.AnonymousClass198(68, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x040c, code lost:
        X.C36321k7.A1J(r7, "SyncResponseHandler/applyMutations: Unknown operation ", X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0417, code lost:
        r3 = new X.C175398aQ("Index hash corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x041f, code lost:
        r3 = new X.C175398aQ("Data mac corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0427, code lost:
        r3 = new X.AnonymousClass198(68, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x042c, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0449, code lost:
        if (r1.A0H.A0E(624) == false) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x044b, code lost:
        android.text.TextUtils.join("\n", r30);
        android.text.TextUtils.join("\n", r29);
        android.text.TextUtils.join("\n", r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x045c, code lost:
        r4 = X.AnonymousClass001.A0I();
        r4.addAll(r28);
        r4.addAll(r32);
        r4.addAll(r27);
        r28.size();
        r32.size();
        r27.size();
        r7 = r1.A07;
        r10 = (java.lang.String[]) r4.toArray(A0L);
        r9 = X.AnonymousClass001.A0I();
        r11 = X.AnonymousClass001.A0I();
        r13 = r35.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0492, code lost:
        if (r13.hasNext() == false) goto L_0x04ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0494, code lost:
        r4 = (X.AnonymousClass9MW) r13.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x049e, code lost:
        if (r4.A00 != X.C199769fw.A03) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04a0, code lost:
        r9.add(r4.A04);
        r11.add(r4.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04ab, code lost:
        r36 = r0;
        r27 = X.AnonymousClass1IS.A02((X.C608639q) null, r7, r36, r9, r7.A08.A07(r0), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04c1, code lost:
        if (r51 == null) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:?, code lost:
        X.C18740tg.A0C(X.AnonymousClass000.A1P(r2.bitField0_ & 4));
        r10 = r2.snapshotMac_.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        r9 = r7.A07;
        r3 = r2.version_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04d8, code lost:
        if (r3 != null) goto L_0x04dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04da, code lost:
        r3 = X.AnonymousClass8O3.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04ee, code lost:
        if (java.util.Arrays.equals(r10, r9.A03(r33, r36, r27, r3.version_)) != false) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04f0, code lost:
        com.whatsapp.util.Log.w("SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch but do not throw fatal");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04fd, code lost:
        if (r7.A0A.A0E(1783) == false) goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04ff, code lost:
        X.AnonymousClass1IS.A00(r7, r0, 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0504, code lost:
        r9 = r7.A04;
        r10 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0519, code lost:
        if (((1 << X.AnonymousClass1IW.A00(r0)) & X.C237119n.A00(r10).getInt("syncd_has_logged_snapshot_mac_mismatch_in_patch", 0)) != 0) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x051b, code lost:
        X.C36341k9.A0v(X.C237119n.A00(r10).edit(), "syncd_has_logged_snapshot_mac_mismatch_in_patch", (1 << X.AnonymousClass1IW.A00(r0)) | X.C237119n.A00(r10).getInt("syncd_has_logged_snapshot_mac_mismatch_in_patch", 0));
        r9.A00.A09(60, r0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x053c, code lost:
        com.whatsapp.util.Log.i("SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0542, code lost:
        if (r52 == null) goto L_0x0575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:?, code lost:
        X.C18740tg.A0C(X.AnonymousClass000.A1P(r6.bitField0_ & 2));
        r9 = r6.mac_.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:?, code lost:
        r7 = r7.A07;
        r3 = r6.version_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0559, code lost:
        if (r3 != null) goto L_0x055d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x055b, code lost:
        r3 = X.AnonymousClass8O3.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x056e, code lost:
        if (java.util.Arrays.equals(r9, r7.A03(r33, r0, r27, r3.version_)) == false) goto L_0x085a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0570, code lost:
        com.whatsapp.util.Log.i("SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0579, code lost:
        if (r30.isEmpty() != false) goto L_0x05b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x057b, code lost:
        r9 = r1.A0G.A00.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:?, code lost:
        r11 = r9.B1k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:?, code lost:
        r7 = r9.A02;
        r4 = X.C36441kJ.A17();
        r10 = r30.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0595, code lost:
        if (r10.hasNext() == false) goto L_0x05a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0597, code lost:
        r4.add(((X.C202599mH) r10.next()).A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05a3, code lost:
        X.AnonymousClass1AC.A08(r7, (java.lang.String[]) r4.toArray(X.C201839kV.A00));
        r11.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05b7, code lost:
        r12 = X.AnonymousClass001.A0I();
        r9 = r29.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05c3, code lost:
        if (r9.hasNext() == false) goto L_0x05e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05c5, code lost:
        r7 = (X.C202599mH) r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05d3, code lost:
        if (r32.contains(r7.A04) != false) goto L_0x05bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05d5, code lost:
        r12.add(r8.A01(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05dd, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:?, code lost:
        A03(r4, r0);
        r26.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05e7, code lost:
        r7 = r31.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05ef, code lost:
        if (r7.hasNext() == false) goto L_0x0609;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:?, code lost:
        r12.add(r8.A01((X.C202599mH) r7.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x05ff, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:?, code lost:
        A03(r4, r0);
        r26.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:?, code lost:
        r29 = r1.A05;
        r3 = X.C196969ar.A00;
        r11 = new X.C198469dc();
        r9 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x061c, code lost:
        if (r9.hasNext() == false) goto L_0x0630;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x061e, code lost:
        r7 = r9.next();
        r4 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0628, code lost:
        if (r4.containsKey(r7) != false) goto L_0x0618;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x062a, code lost:
        r4.put(r7, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0630, code lost:
        r25 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0638, code lost:
        if (r25.hasNext() == false) goto L_0x06d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x063a, code lost:
        r10 = (X.C201669k5) r25.next();
        r9 = (java.util.List) X.C196969ar.A00.get(r10.A07());
        r7 = (java.util.List) X.C196969ar.A01.get(r10.A07());
        r24 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0660, code lost:
        if (r24.hasNext() == false) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0662, code lost:
        r13 = (X.C201669k5) r24.next();
        r23 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x066a, code lost:
        if (r9 == null) goto L_0x0699;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0674, code lost:
        if (r9.contains(r13.A07()) == false) goto L_0x0699;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0676, code lost:
        r3 = X.C196969ar.A00(r13);
        r15 = r3.first;
        r14 = (X.C64933Qa) r3.second;
        r3 = X.C196969ar.A00(r10);
        r4 = r3.first;
        r3 = r3.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x068c, code lost:
        if (X.C1901797e.A00(r15, r4) == false) goto L_0x0699;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x068e, code lost:
        if (r14 == null) goto L_0x069b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0690, code lost:
        if (r3 == null) goto L_0x069b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0696, code lost:
        if (r14.equals(r3) == false) goto L_0x0699;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0699, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x069b, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x069c, code lost:
        if (r7 == null) goto L_0x06a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06a6, code lost:
        if (r7.contains(r13.A07()) == false) goto L_0x06a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x06a9, code lost:
        r23 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x06ab, code lost:
        if (r13 == r10) goto L_0x065c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x06ad, code lost:
        if (r4 != false) goto L_0x06b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x06af, code lost:
        if (r23 == false) goto L_0x065c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x06b7, code lost:
        if (r13.A04 >= r10.A04) goto L_0x06be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x06b9, code lost:
        r3 = r11.A01(r10, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x06be, code lost:
        r3 = r11.A01(r13, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x06c2, code lost:
        if (r3 == false) goto L_0x065c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06c4, code lost:
        r29.A01.A06("cross_index_conflict_counter", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06d0, code lost:
        r12 = X.AnonymousClass001.A0I();
        r10 = X.C36441kJ.A16();
        r9 = r11.A00;
        r7 = r9.size();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06df, code lost:
        if (r4 >= r7) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06e1, code lost:
        X.C198469dc.A00(r11, r9.A04(r4), r12, r10);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06eb, code lost:
        r10 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x06f3, code lost:
        if (r10.hasNext() == false) goto L_0x0763;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x06f5, code lost:
        r9 = (X.C201669k5) r10.next();
        r4 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x06fd, code lost:
        if (r9 != null) goto L_0x0701;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06ff, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0701, code lost:
        r3 = r9.A07();
        X.AnonymousClass00C.A08(r3);
        r7 = r4.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x070c, code lost:
        X.C18740tg.A06(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:?, code lost:
        r7.A0G(r9, r8.A00.A0A(r9.A06()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:?, code lost:
        r8.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0721, code lost:
        if ((r9 instanceof X.C176078bX) == false) goto L_0x073f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0723, code lost:
        r9 = (X.C176078bX) r9;
        r7 = r9.A02;
        r4 = r1.A01;
        r3 = r9.A01;
        r34 = 5;
        r35 = !r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x072f, code lost:
        r4.A02(r3, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, r34, r35, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0741, code lost:
        if ((r9 instanceof X.C176098bZ) == false) goto L_0x0754;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0743, code lost:
        r9 = (X.C176098bZ) r9;
        r7 = r9.A02;
        r4 = r1.A01;
        r3 = r9.A01;
        r34 = 5;
        r35 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x074f, code lost:
        if (r7 == false) goto L_0x072f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0751, code lost:
        r35 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0756, code lost:
        if ((r9 instanceof X.C176058bV) == false) goto L_0x06ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0758, code lost:
        r4 = r1.A01;
        r3 = ((X.C176058bV) r9).A01;
        r34 = 5;
        r35 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:?, code lost:
        r23 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x076b, code lost:
        if (r23.hasNext() == false) goto L_0x07f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x076d, code lost:
        r3 = (X.C176158bf) r23.next();
        r10 = r3.reason;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:?, code lost:
        X.C18740tg.A0F(X.AnonymousClass000.A1S(6, r10), X.AnonymousClass000.A0r("unexpected reason=", X.AnonymousClass000.A0u(), r10));
        r11 = r1.A0G;
        r12 = r3.version;
        r14 = r3.operation;
        r10 = r3.index;
        X.C18740tg.A06(r10);
        r9 = r3.mutationMac;
        r7 = r3.syncdKeyId;
        X.C18740tg.A06(r7);
        r13 = r3.syncActionValue;
        r4 = r11.A00.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:?, code lost:
        r15 = r4.B1k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x07a7, code lost:
        if (r14 != X.C199769fw.A02) goto L_0x07ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x07a9, code lost:
        r9 = r4.A02;
        r7 = X.AnonymousClass000.A0u();
        r7.append("DELETE FROM syncd_mutations WHERE mutation_index IN ");
        r9.A0E(X.AnonymousClass000.A0q(X.AnonymousClass1M2.A00(1), r7), "SyncdMutationsStore.addUnsupportedMutation", new java.lang.String[]{r10});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x07c6, code lost:
        r15.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x07cc, code lost:
        if (r14 != X.C199769fw.A03) goto L_0x07c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x07ce, code lost:
        r3 = r4.A02;
        X.C18740tg.A06(r13);
        X.AnonymousClass1AC.A05(r3, r11, r7, (X.AnonymousClass11F) null, r10, r0, X.C202599mH.A00(r10), r13.A0o(), r9, r12, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x07f9, code lost:
        if (r27 == null) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:?, code lost:
        r22.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0804, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchMac/patch mac mismatch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0811, code lost:
        throw new X.AnonymousClass198(34, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0812, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchIntegrity: ", r4);
        r5 = new X.AnonymousClass198(10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0821, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchMac/No snapshot mac");
        r5 = new X.AnonymousClass198(47, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x082f, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchMac/No patch mac");
        r5 = new X.AnonymousClass198(48, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x083d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x083e, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations", r4);
        r5 = new X.AnonymousClass198(7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x084b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x084c, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac: ", r4);
        r5 = new X.AnonymousClass198(10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0866, code lost:
        throw new X.AnonymousClass198(61, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0867, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac: ", r4);
        r5 = new X.AnonymousClass198(10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0876, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x087b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:?, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0880, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0888, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x088d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:?, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0892, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0898, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:?, code lost:
        r5.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x089e, code lost:
        r49.A05(r0, r27, r16);
        r20.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x08aa, code lost:
        if (r57 == false) goto L_0x093b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x08ac, code lost:
        r9 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x08ae, code lost:
        if (r52 == null) goto L_0x08b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x08b0, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x08b1, code lost:
        r10 = new X.AnonymousClass2SQ();
        r4 = 1;
        r10.A05 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x08c3, code lost:
        if (X.C201669k5.A09.contains(r0) != false) goto L_0x08c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x08c5, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x08c6, code lost:
        r10.A04 = java.lang.Integer.valueOf(r4);
        r10.A0A = X.C25911Id.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x08d6, code lost:
        switch(r0.hashCode()) {
            case -849492943: goto L_0x0904;
            case -564602779: goto L_0x08fb;
            case -498584183: goto L_0x08f2;
            case 207170541: goto L_0x08e9;
            case 1086463900: goto L_0x08e0;
            default: goto L_0x08d9;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x08df, code lost:
        throw X.AnonymousClass001.A08("CompanionSyncStatsLogger/convertToWamCollection received undefined collection name");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x08e6, code lost:
        if (r0.equals("regular") == false) goto L_0x08d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x08ef, code lost:
        if (r0.equals("critical_block") == false) goto L_0x08d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x08f8, code lost:
        if (r0.equals("critical_unblock_low") == false) goto L_0x08d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0901, code lost:
        if (r0.equals("regular_high") == false) goto L_0x08d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x090a, code lost:
        if (r0.equals("regular_low") == false) goto L_0x08d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x090d, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x090f, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0911, code lost:
        r0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0913, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0915, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0916, code lost:
        r10.A02 = java.lang.Integer.valueOf(r0);
        r6 = X.C19970wo.A00(r9.A01);
        r10.A09 = java.lang.Long.valueOf(r6);
        r10.A08 = X.C90504aG.A0h(r6, r18);
        r10.A01 = java.lang.Boolean.valueOf(r5);
        r9.A03.Bly(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:?, code lost:
        r22.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0942, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0943, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:?, code lost:
        X.C36321k7.A1J(r5, "SyncResponseHandler/applyMutations cyclic mutation e=", X.AnonymousClass000.A0u());
        r5 = new X.AnonymousClass198(39, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x012a, code lost:
        r5 = new X.AnonymousClass198(12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0133, code lost:
        r5 = new X.AnonymousClass198(20, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x013c, code lost:
        r5 = new X.AnonymousClass198(17, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r52 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0158, code lost:
        if (r51 == null) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x015e, code lost:
        if ((r2.bitField0_ & 16) == 0) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0160, code lost:
        r3 = r2.keyId_;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0163, code lost:
        if (r3 != null) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0165, code lost:
        r3 = X.AnonymousClass8O0.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x016b, code lost:
        if ((r3.bitField0_ & 1) == 0) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x016e, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations missing patch key");
        r5 = new X.AnonymousClass198(56, r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x083d A[Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d, all -> 0x0978 }, ExcHandler: 8bd | 8bg | ParseException (r4v45 'e' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ all -> 0x097d, all -> 0x0982 }]), Splitter:B:140:0x0264] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A05(X.C173408Ro r51, X.C173138Qn r52, java.lang.String r53, java.util.List r54, long r55, boolean r57) {
        /*
            r50 = this;
            r21 = 1
            r5 = 0
            r2 = r51
            boolean r1 = X.AnonymousClass000.A1V(r2)
            r6 = r52
            boolean r0 = X.AnonymousClass000.A1V(r6)
            r1 = r1 ^ r0
            java.lang.String r4 = "patch XOR snapshot must be non null"
            X.C18740tg.A0E(r1, r4)
            r1 = r50
            X.0wo r0 = r1.A0B
            long r18 = X.C19970wo.A00(r0)
            X.1AK r8 = r1.A09
            monitor-enter(r8)
            X.18P r0 = r1.A0D     // Catch:{ 198 -> 0x098c }
            X.1M0 r22 = r0.A04()     // Catch:{ 198 -> 0x098c }
            X.71s r20 = r22.B1k()     // Catch:{ all -> 0x0982 }
            if (r51 != 0) goto L_0x002f
            r15 = 1
            if (r52 != 0) goto L_0x0030
        L_0x002f:
            r15 = 0
        L_0x0030:
            X.1IT r0 = r1.A0F     // Catch:{ all -> 0x0978 }
            r49 = r0
            r0 = r53
            r3 = r49
            java.lang.Long r3 = r3.A01(r0)     // Catch:{ all -> 0x0978 }
            if (r3 != 0) goto L_0x0041
            r9 = 0
            goto L_0x0045
        L_0x0041:
            long r9 = r3.longValue()     // Catch:{ all -> 0x0978 }
        L_0x0045:
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0978 }
            long r13 = r3.longValue()     // Catch:{ all -> 0x0978 }
            r11 = 1
            r16 = r55
            long r9 = r55 - r11
            int r7 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x005b
            if (r15 != 0) goto L_0x005b
            goto L_0x0955
        L_0x005b:
            boolean r3 = X.AnonymousClass000.A1V(r2)
            boolean r7 = X.AnonymousClass000.A1V(r6)
            r3 = r3 ^ r7
            X.C18740tg.A0E(r3, r4)     // Catch:{ all -> 0x0978 }
            java.util.ArrayList r35 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0978 }
            java.util.HashSet r11 = X.C36441kJ.A16()     // Catch:{ all -> 0x0978 }
            java.util.Iterator r13 = r54.iterator()     // Catch:{ all -> 0x0978 }
        L_0x0073:
            boolean r3 = r13.hasNext()     // Catch:{ all -> 0x0978 }
            if (r3 == 0) goto L_0x0157
            java.lang.Object r7 = r13.next()     // Catch:{ all -> 0x0978 }
            X.8PL r7 = (X.AnonymousClass8PL) r7     // Catch:{ all -> 0x0978 }
            int r3 = r7.bitField0_     // Catch:{ all -> 0x0978 }
            r4 = r3 & 1
            if (r4 == 0) goto L_0x014e
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0145
            X.8QF r12 = r7.record_     // Catch:{ all -> 0x0978 }
            if (r12 != 0) goto L_0x0091
            X.8QF r12 = X.AnonymousClass8QF.DEFAULT_INSTANCE     // Catch:{ all -> 0x0978 }
            if (r12 == 0) goto L_0x0145
        L_0x0091:
            int r4 = r12.bitField0_     // Catch:{ all -> 0x0978 }
            r3 = r4 & 4
            if (r3 == 0) goto L_0x013c
            X.8O0 r9 = r12.keyId_     // Catch:{ all -> 0x0978 }
            if (r9 != 0) goto L_0x00a6
            X.8O0 r3 = X.AnonymousClass8O0.DEFAULT_INSTANCE     // Catch:{ all -> 0x0978 }
            if (r3 == 0) goto L_0x013c
        L_0x009f:
            int r3 = r3.bitField0_     // Catch:{ all -> 0x0978 }
            r3 = r3 & 1
            if (r3 == 0) goto L_0x013c
            goto L_0x00a8
        L_0x00a6:
            r3 = r9
            goto L_0x009f
        L_0x00a8:
            r3 = r4 & 1
            if (r3 == 0) goto L_0x0133
            X.8O1 r3 = r12.index_     // Catch:{ all -> 0x0978 }
            r10 = r3
            if (r3 != 0) goto L_0x00b3
            X.8O1 r3 = X.AnonymousClass8O1.DEFAULT_INSTANCE     // Catch:{ all -> 0x0978 }
        L_0x00b3:
            int r3 = r3.bitField0_     // Catch:{ all -> 0x0978 }
            r3 = r3 & 1
            if (r3 == 0) goto L_0x0133
            if (r10 != 0) goto L_0x00bd
            X.8O1 r10 = X.AnonymousClass8O1.DEFAULT_INSTANCE     // Catch:{ all -> 0x0978 }
        L_0x00bd:
            X.AUx r3 = r10.blob_     // Catch:{ all -> 0x0978 }
            if (r3 == 0) goto L_0x0133
            r3 = r4 & 2
            if (r3 == 0) goto L_0x012a
            X.8O2 r3 = r12.value_     // Catch:{ all -> 0x0978 }
            r4 = r3
            if (r3 != 0) goto L_0x00cc
            X.8O2 r3 = X.AnonymousClass8O2.DEFAULT_INSTANCE     // Catch:{ all -> 0x0978 }
        L_0x00cc:
            int r3 = r3.bitField0_     // Catch:{ all -> 0x0978 }
            r3 = r3 & 1
            if (r3 == 0) goto L_0x012a
            if (r4 != 0) goto L_0x00d6
            X.8O2 r4 = X.AnonymousClass8O2.DEFAULT_INSTANCE     // Catch:{ all -> 0x0978 }
        L_0x00d6:
            X.AUx r3 = r4.blob_     // Catch:{ all -> 0x0978 }
            if (r3 == 0) goto L_0x012a
            if (r9 != 0) goto L_0x00de
            X.8O0 r9 = X.AnonymousClass8O0.DEFAULT_INSTANCE     // Catch:{ all -> 0x0978 }
        L_0x00de:
            X.AUx r3 = r9.id_     // Catch:{ all -> 0x0978 }
            byte[] r3 = r3.A06()     // Catch:{ all -> 0x0978 }
            X.9jo r10 = new X.9jo     // Catch:{ all -> 0x0978 }
            r10.<init>(r3)     // Catch:{ all -> 0x0978 }
            X.8O1 r3 = r12.index_     // Catch:{ all -> 0x0978 }
            if (r3 != 0) goto L_0x00ef
            X.8O1 r3 = X.AnonymousClass8O1.DEFAULT_INSTANCE     // Catch:{ all -> 0x0978 }
        L_0x00ef:
            X.AUx r3 = r3.blob_     // Catch:{ all -> 0x0978 }
            byte[] r9 = r3.A06()     // Catch:{ all -> 0x0978 }
            int r4 = r7.operation_     // Catch:{ all -> 0x0978 }
            if (r4 == 0) goto L_0x00fd
            r3 = 1
            if (r4 != r3) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            X.90T r3 = X.AnonymousClass90T.SET     // Catch:{ all -> 0x0978 }
            goto L_0x0102
        L_0x0100:
            X.90T r3 = X.AnonymousClass90T.REMOVE     // Catch:{ all -> 0x0978 }
        L_0x0102:
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0978 }
            if (r3 == r5) goto L_0x0127
            X.9fw r7 = X.C199769fw.A02     // Catch:{ all -> 0x0978 }
        L_0x010a:
            X.8O2 r3 = r12.value_     // Catch:{ all -> 0x0978 }
            if (r3 != 0) goto L_0x0110
            X.8O2 r3 = X.AnonymousClass8O2.DEFAULT_INSTANCE     // Catch:{ all -> 0x0978 }
        L_0x0110:
            X.AUx r3 = r3.blob_     // Catch:{ all -> 0x0978 }
            byte[] r4 = r3.A06()     // Catch:{ all -> 0x0978 }
            X.9MW r3 = new X.9MW     // Catch:{ all -> 0x0978 }
            r3.<init>(r7, r10, r9, r4)     // Catch:{ all -> 0x0978 }
            r4 = r35
            r4.add(r3)     // Catch:{ all -> 0x0978 }
            X.9jo r3 = r3.A01     // Catch:{ all -> 0x0978 }
            r11.add(r3)     // Catch:{ all -> 0x0978 }
            goto L_0x0073
        L_0x0127:
            X.9fw r7 = X.C199769fw.A03     // Catch:{ all -> 0x0978 }
            goto L_0x010a
        L_0x012a:
            r3 = 12
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x0133:
            r3 = 20
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x013c:
            r3 = 17
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x0145:
            r3 = 16
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x014e:
            r3 = 15
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x0157:
            r7 = 0
            if (r51 == 0) goto L_0x017c
            int r3 = r2.bitField0_     // Catch:{ all -> 0x0978 }
            r3 = r3 & 16
            if (r3 == 0) goto L_0x016e
            X.8O0 r3 = r2.keyId_     // Catch:{ all -> 0x0978 }
            r4 = r3
            if (r3 != 0) goto L_0x0167
            X.8O0 r3 = X.AnonymousClass8O0.DEFAULT_INSTANCE     // Catch:{ all -> 0x0978 }
        L_0x0167:
            int r3 = r3.bitField0_     // Catch:{ all -> 0x0978 }
            r3 = r3 & 1
            if (r3 == 0) goto L_0x016e
            goto L_0x0191
        L_0x016e:
            java.lang.String r3 = "SyncResponseHandler/applyMutations missing patch key"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0978 }
            r3 = 56
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x017c:
            if (r52 == 0) goto L_0x01a2
            int r3 = r6.bitField0_     // Catch:{ all -> 0x0978 }
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0194
            X.8O0 r3 = r6.keyId_     // Catch:{ all -> 0x0978 }
            r4 = r3
            if (r3 != 0) goto L_0x018b
            X.8O0 r3 = X.AnonymousClass8O0.DEFAULT_INSTANCE     // Catch:{ all -> 0x0978 }
        L_0x018b:
            int r3 = r3.bitField0_     // Catch:{ all -> 0x0978 }
            r3 = r3 & 1
            if (r3 == 0) goto L_0x0194
        L_0x0191:
            if (r4 != 0) goto L_0x01a6
            goto L_0x01a4
        L_0x0194:
            java.lang.String r3 = "SyncResponseHandler/applyMutations missing snapshot key"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0978 }
            r3 = 59
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x01a2:
            r4 = r7
            goto L_0x01b4
        L_0x01a4:
            X.8O0 r4 = X.AnonymousClass8O0.DEFAULT_INSTANCE     // Catch:{ all -> 0x0978 }
        L_0x01a6:
            X.AUx r3 = r4.id_     // Catch:{ all -> 0x0978 }
            byte[] r3 = r3.A06()     // Catch:{ all -> 0x0978 }
            X.9jo r4 = new X.9jo     // Catch:{ all -> 0x0978 }
            r4.<init>(r3)     // Catch:{ all -> 0x0978 }
            r11.add(r4)     // Catch:{ all -> 0x0978 }
        L_0x01b4:
            X.1A9 r3 = r1.A08     // Catch:{ all -> 0x0978 }
            java.util.HashMap r34 = r3.A06(r0, r11)     // Catch:{ all -> 0x0978 }
            r3 = r34
            boolean r3 = r3.containsValue(r7)     // Catch:{ all -> 0x0978 }
            if (r3 == 0) goto L_0x01cc
            java.lang.String r0 = "SyncResponseHandler/applyMutations keyMap contains null value, retry"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0978 }
        L_0x01c7:
            r20.A00()     // Catch:{ all -> 0x0978 }
            goto L_0x07fd
        L_0x01cc:
            r3 = r34
            java.lang.Object r33 = r3.get(r4)     // Catch:{ all -> 0x0978 }
            X.C18740tg.A06(r33)     // Catch:{ all -> 0x0978 }
            r3 = r33
            X.9Va r3 = (X.C195589Va) r3     // Catch:{ all -> 0x0978 }
            r33 = r3
            if (r51 == 0) goto L_0x0234
            X.1IS r4 = r1.A07     // Catch:{ all -> 0x0978 }
            int r3 = r2.bitField0_     // Catch:{ all -> 0x0978 }
            r7 = r3 & 8
            if (r7 == 0) goto L_0x082f
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0821
            X.AUx r3 = r2.patchMac_     // Catch:{ 8bd | 8bg -> 0x0812 }
            byte[] r10 = r3.A06()     // Catch:{ 8bd | 8bg -> 0x0812 }
            X.AUx r3 = r2.snapshotMac_     // Catch:{ 8bd | 8bg -> 0x0812 }
            byte[] r27 = r3.A06()     // Catch:{ 8bd | 8bg -> 0x0812 }
            java.util.LinkedList r9 = X.C90524aI.A0l()     // Catch:{ 8bd | 8bg -> 0x0812 }
            java.util.Iterator r7 = r35.iterator()     // Catch:{ 8bd | 8bg -> 0x0812 }
        L_0x01fd:
            boolean r3 = r7.hasNext()     // Catch:{ 8bd | 8bg -> 0x0812 }
            if (r3 == 0) goto L_0x020f
            java.lang.Object r3 = r7.next()     // Catch:{ 8bd | 8bg -> 0x0812 }
            X.9MW r3 = (X.AnonymousClass9MW) r3     // Catch:{ 8bd | 8bg -> 0x0812 }
            byte[] r3 = r3.A04     // Catch:{ 8bd | 8bg -> 0x0812 }
            r9.add(r3)     // Catch:{ 8bd | 8bg -> 0x0812 }
            goto L_0x01fd
        L_0x020f:
            X.1IU r7 = r4.A07     // Catch:{ 8bd | 8bg -> 0x0812 }
            X.8O3 r3 = r2.version_     // Catch:{ 8bd | 8bg -> 0x0812 }
            if (r3 != 0) goto L_0x0217
            X.8O3 r3 = X.AnonymousClass8O3.DEFAULT_INSTANCE     // Catch:{ 8bd | 8bg -> 0x0812 }
        L_0x0217:
            long r3 = r3.version_     // Catch:{ 8bd | 8bg -> 0x0812 }
            byte[] r26 = X.C203239na.A04(r9)     // Catch:{ 8bd | 8bg -> 0x0812 }
            r23 = r7
            r24 = r33
            r25 = r0
            r28 = r3
            byte[] r3 = r23.A04(r24, r25, r26, r27, r28)     // Catch:{ 8bd | 8bg -> 0x0812 }
            boolean r3 = java.util.Arrays.equals(r10, r3)     // Catch:{ 8bd | 8bg -> 0x0812 }
            if (r3 == 0) goto L_0x0805
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchMac/patch mac validated"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 8bd | 8bg -> 0x0812 }
        L_0x0234:
            java.util.HashSet r28 = X.C36441kJ.A16()     // Catch:{ all -> 0x0978 }
            java.util.HashSet r32 = X.C36441kJ.A16()     // Catch:{ all -> 0x0978 }
            java.util.HashSet r27 = X.C36441kJ.A16()     // Catch:{ all -> 0x0978 }
            java.util.ArrayList r31 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0978 }
            java.util.ArrayList r30 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0978 }
            java.util.ArrayList r29 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0978 }
            java.util.ArrayList r26 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0978 }
            java.util.HashMap r25 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x0978 }
            java.util.Iterator r24 = r35.iterator()     // Catch:{ all -> 0x0978 }
        L_0x0258:
            boolean r3 = r24.hasNext()     // Catch:{ all -> 0x0978 }
            if (r3 == 0) goto L_0x0441
            java.lang.Object r9 = r24.next()     // Catch:{ all -> 0x0978 }
            X.9MW r9 = (X.AnonymousClass9MW) r9     // Catch:{ all -> 0x0978 }
            X.9jo r3 = r9.A01     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r38 = r3
            r4 = r34
            java.lang.Object r3 = r4.get(r3)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            X.C18740tg.A06(r3)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            X.9Va r3 = (X.C195589Va) r3     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            X.1IU r7 = r1.A0C     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            byte[] r12 = r9.A02     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            int r11 = r12.length     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r10 = 32
            int r11 = r11 - r10
            r4 = 16
            int r11 = r11 - r4
            byte[][] r4 = X.C203239na.A07(r12, r4, r11, r10)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r14 = r4[r5]     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r13 = r4[r21]     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r12 = 2
            r23 = r4[r12]     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            X.1IV r7 = r7.A00     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            X.9W7 r4 = r3.A00     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            X.9cp r7 = r7.A00(r4)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            byte[][] r4 = new byte[r12][]     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r4[r5] = r14     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r4[r21] = r13     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            byte[] r15 = X.C203239na.A05(r4)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            X.9fw r4 = r9.A00     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            byte[] r11 = r4.A01     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            X.9jo r10 = r3.A01     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            byte[] r3 = r7.A04     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            byte[] r10 = X.AnonymousClass1IU.A00(r10, r11, r3, r15)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r3 = r23
            boolean r3 = java.util.Arrays.equals(r3, r10)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            if (r3 == 0) goto L_0x041f
            byte[] r3 = r7.A03     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            byte[] r11 = X.AnonymousClass1IU.A02(r14, r13, r3, r12)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            byte[] r10 = r9.A04     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            X.8R3 r3 = X.AnonymousClass8R3.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x0345, 8bd | 8bg | ParseException -> 0x083d, 8bd | 8bg | ParseException -> 0x083d }
            X.8Hz r11 = X.C170918Hz.A08(r3, r11)     // Catch:{ 186 -> 0x0345, 8bd | 8bg | ParseException -> 0x083d, 8bd | 8bg | ParseException -> 0x083d }
            X.8R3 r11 = (X.AnonymousClass8R3) r11     // Catch:{ 186 -> 0x0345, 8bd | 8bg | ParseException -> 0x083d, 8bd | 8bg | ParseException -> 0x083d }
            if (r11 == 0) goto L_0x0331
            int r12 = r11.bitField0_     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r3 = r12 & 8
            boolean r3 = X.AnonymousClass000.A1P(r3)
            r39 = 0
            if (r3 == 0) goto L_0x02d4
            int r3 = r11.version_     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            java.lang.Integer r40 = java.lang.Integer.valueOf(r3)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            goto L_0x02d6
        L_0x02d4:
            r40 = r39
        L_0x02d6:
            r3 = r12 & 1
            if (r3 == 0) goto L_0x02db
            goto L_0x02de
        L_0x02db:
            r41 = r39
            goto L_0x02e6
        L_0x02de:
            X.AUx r3 = r11.index_     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            if (r3 == 0) goto L_0x02db
            java.lang.String r41 = r3.A04()     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
        L_0x02e6:
            int r3 = r11.bitField0_     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r3 = r3 & 2
            if (r3 == 0) goto L_0x02f5
            X.8SS r3 = r11.value_     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            if (r3 != 0) goto L_0x02f7
            X.8SS r3 = X.AnonymousClass8SS.DEFAULT_INSTANCE     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            if (r3 == 0) goto L_0x02f5
            goto L_0x02f7
        L_0x02f5:
            r3 = r39
        L_0x02f7:
            if (r40 == 0) goto L_0x0323
            if (r41 == 0) goto L_0x030d
            if (r3 != 0) goto L_0x0359
            X.9fw r11 = X.C199769fw.A02     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            if (r4 == r11) goto L_0x0373
            X.8bf r36 = new X.8bf     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r43 = 2
            r37 = r4
            r42 = r10
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            goto L_0x0372
        L_0x030d:
            X.8bf r36 = new X.8bf     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r48 = 1
            r41 = r36
            r42 = r4
            r43 = r38
            r44 = r3
            r45 = r40
            r46 = r39
            r47 = r10
            r41.<init>(r42, r43, r44, r45, r46, r47, r48)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            goto L_0x0372
        L_0x0323:
            r43 = 3
            X.8bf r36 = new X.8bf     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r37 = r4
            r39 = r3
            r42 = r10
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            goto L_0x0372
        L_0x0331:
            r38 = 0
            X.8bf r36 = new X.8bf     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r40 = r38
            r41 = r38
            r43 = 0
            r37 = r4
            r39 = r38
            r42 = r10
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            goto L_0x0372
        L_0x0345:
            r38 = 0
            X.8bf r36 = new X.8bf     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r40 = r38
            r41 = r38
            r43 = 0
            r37 = r4
            r39 = r38
            r42 = r10
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            goto L_0x0372
        L_0x0359:
            int r11 = r3.bitField0_     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            boolean r11 = X.C165577te.A1W(r11)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            if (r11 != 0) goto L_0x0373
            X.9fw r11 = X.C199769fw.A02     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            if (r4 == r11) goto L_0x0373
            r43 = 7
            X.8bf r36 = new X.8bf     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r37 = r4
            r39 = r3
            r42 = r10
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
        L_0x0372:
            throw r36     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
        L_0x0373:
            java.lang.String[] r42 = X.C202599mH.A01(r41)     // Catch:{ IllegalArgumentException | JSONException -> 0x0378, 8bd | 8bg | ParseException -> 0x083d, 8bd | 8bg | ParseException -> 0x083d }
            goto L_0x0386
        L_0x0378:
            r43 = 4
            X.8bf r36 = new X.8bf     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r37 = r4
            r39 = r3
            r42 = r10
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            goto L_0x0372
        L_0x0386:
            int r43 = r40.intValue()     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            X.9mH r11 = new X.9mH     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r36 = r11
            r37 = r4
            r39 = r3
            r40 = r41
            r41 = r10
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            java.lang.String r12 = r11.A04     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            java.nio.charset.Charset r3 = X.C19430v1.A0D     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            byte[] r10 = r12.getBytes(r3)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            byte[] r4 = r7.A02     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            java.lang.String r3 = "HmacSHA256"
            byte[] r3 = X.AnonymousClass1IU.A01(r3, r10, r4)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            byte[] r4 = r9.A03     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            boolean r3 = java.util.Arrays.equals(r4, r3)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            if (r3 == 0) goto L_0x0417
            r3 = r25
            r3.put(r12, r4)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            X.9fw r7 = r11.A01     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            X.9fw r3 = X.C199769fw.A03     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r4 = 68
            if (r7 != r3) goto L_0x03d9
            r3 = r31
            r3.add(r11)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r3 = r32
            boolean r3 = r3.add(r12)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            if (r3 != 0) goto L_0x0258
            java.lang.String r3 = "SyncResponseHandler/applyMutations same index for multi set mutations"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            if (r51 == 0) goto L_0x0427
            r4 = 6
            X.198 r3 = new X.198     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r3.<init>(r4, r0)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            goto L_0x042c
        L_0x03d9:
            X.9fw r3 = X.C199769fw.A02     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            if (r7 != r3) goto L_0x040c
            java.lang.String[] r3 = r11.A06     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r7 = r3[r5]     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            java.lang.String r3 = "contact"
            boolean r7 = r7.equals(r3)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r3 = r30
            if (r7 == 0) goto L_0x03ed
            r3 = r29
        L_0x03ed:
            r3.add(r11)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r3 = r27
            boolean r3 = r3.add(r12)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            if (r3 != 0) goto L_0x0258
            java.lang.String r3 = "SyncResponseHandler/applyMutations same index for multi remove mutations"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            if (r51 == 0) goto L_0x0406
            r4 = 6
            X.198 r3 = new X.198     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r3.<init>(r4, r0)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            goto L_0x042c
        L_0x0406:
            X.198 r3 = new X.198     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r3.<init>(r4, r0)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            goto L_0x042c
        L_0x040c:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            java.lang.String r3 = "SyncResponseHandler/applyMutations: Unknown operation "
            X.C36321k7.A1J(r7, r3, r4)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            goto L_0x0258
        L_0x0417:
            java.lang.String r4 = "Index hash corrupt"
            X.8aQ r3 = new X.8aQ     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r3.<init>(r4)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            goto L_0x042c
        L_0x041f:
            java.lang.String r4 = "Data mac corrupt"
            X.8aQ r3 = new X.8aQ     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r3.<init>(r4)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            goto L_0x042c
        L_0x0427:
            X.198 r3 = new X.198     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
            r3.<init>(r4, r0)     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
        L_0x042c:
            throw r3     // Catch:{ 8bd | 8bg | ParseException -> 0x083d, 8bf -> 0x042d }
        L_0x042d:
            r4 = move-exception
            r1.A03(r4, r0)     // Catch:{ all -> 0x0978 }
            r3 = r26
            r3.add(r4)     // Catch:{ all -> 0x0978 }
            java.lang.String r4 = r4.index     // Catch:{ all -> 0x0978 }
            if (r4 == 0) goto L_0x0258
            r3 = r28
            r3.add(r4)     // Catch:{ all -> 0x0978 }
            goto L_0x0258
        L_0x0441:
            X.0yC r4 = r1.A0H     // Catch:{ all -> 0x0978 }
            r3 = 624(0x270, float:8.74E-43)
            boolean r3 = r4.A0E(r3)     // Catch:{ all -> 0x0978 }
            if (r3 == 0) goto L_0x045c
            java.lang.String r4 = "\n"
            r3 = r30
            android.text.TextUtils.join(r4, r3)     // Catch:{ all -> 0x0978 }
            r3 = r29
            android.text.TextUtils.join(r4, r3)     // Catch:{ all -> 0x0978 }
            r3 = r31
            android.text.TextUtils.join(r4, r3)     // Catch:{ all -> 0x0978 }
        L_0x045c:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0978 }
            r3 = r28
            r4.addAll(r3)     // Catch:{ all -> 0x0978 }
            r3 = r32
            r4.addAll(r3)     // Catch:{ all -> 0x0978 }
            r3 = r27
            r4.addAll(r3)     // Catch:{ all -> 0x0978 }
            r28.size()     // Catch:{ all -> 0x0978 }
            r32.size()     // Catch:{ all -> 0x0978 }
            r27.size()     // Catch:{ all -> 0x0978 }
            X.1IS r7 = r1.A07     // Catch:{ all -> 0x0978 }
            java.lang.String[] r3 = A0L     // Catch:{ all -> 0x0978 }
            java.lang.Object[] r10 = r4.toArray(r3)     // Catch:{ all -> 0x0978 }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ all -> 0x0978 }
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0978 }
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0978 }
            java.util.Iterator r13 = r35.iterator()     // Catch:{ all -> 0x0978 }
        L_0x048e:
            boolean r3 = r13.hasNext()     // Catch:{ all -> 0x0978 }
            if (r3 == 0) goto L_0x04ab
            java.lang.Object r4 = r13.next()     // Catch:{ all -> 0x0978 }
            X.9MW r4 = (X.AnonymousClass9MW) r4     // Catch:{ all -> 0x0978 }
            X.9fw r12 = r4.A00     // Catch:{ all -> 0x0978 }
            X.9fw r3 = X.C199769fw.A03     // Catch:{ all -> 0x0978 }
            if (r12 != r3) goto L_0x048e
            byte[] r3 = r4.A04     // Catch:{ all -> 0x0978 }
            r9.add(r3)     // Catch:{ all -> 0x0978 }
            byte[] r3 = r4.A03     // Catch:{ all -> 0x0978 }
            r11.add(r3)     // Catch:{ all -> 0x0978 }
            goto L_0x048e
        L_0x04ab:
            X.1IT r3 = r7.A08     // Catch:{ all -> 0x0978 }
            byte[] r38 = r3.A07(r0)     // Catch:{ all -> 0x0978 }
            r28 = 0
            r34 = r28
            r35 = r7
            r36 = r0
            r37 = r9
            r39 = r10
            byte[] r27 = X.AnonymousClass1IS.A02(r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0978 }
            if (r51 == 0) goto L_0x0542
            int r3 = r2.bitField0_     // Catch:{ all -> 0x0978 }
            r3 = r3 & 4
            boolean r3 = X.AnonymousClass000.A1P(r3)
            X.C18740tg.A0C(r3)     // Catch:{ all -> 0x0978 }
            X.AUx r3 = r2.snapshotMac_     // Catch:{ all -> 0x0978 }
            byte[] r10 = r3.A06()     // Catch:{ all -> 0x0978 }
            X.1IU r9 = r7.A07     // Catch:{ 8bd | 8bg -> 0x084b }
            X.8O3 r3 = r2.version_     // Catch:{ 8bd | 8bg -> 0x084b }
            if (r3 != 0) goto L_0x04dc
            X.8O3 r3 = X.AnonymousClass8O3.DEFAULT_INSTANCE     // Catch:{ 8bd | 8bg -> 0x084b }
        L_0x04dc:
            long r3 = r3.version_     // Catch:{ 8bd | 8bg -> 0x084b }
            r34 = r9
            r35 = r33
            r37 = r27
            r38 = r3
            byte[] r3 = r34.A03(r35, r36, r37, r38)     // Catch:{ 8bd | 8bg -> 0x084b }
            boolean r3 = java.util.Arrays.equals(r10, r3)     // Catch:{ 8bd | 8bg -> 0x084b }
            if (r3 != 0) goto L_0x053c
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch but do not throw fatal"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ 8bd | 8bg -> 0x084b }
            X.0yC r4 = r7.A0A     // Catch:{ 8bd | 8bg -> 0x084b }
            r3 = 1783(0x6f7, float:2.499E-42)
            boolean r3 = r4.A0E(r3)     // Catch:{ 8bd | 8bg -> 0x084b }
            if (r3 == 0) goto L_0x0504
            r3 = 16
            X.AnonymousClass1IS.A00(r7, r0, r3)     // Catch:{ 8bd | 8bg -> 0x084b }
        L_0x0504:
            X.1IW r9 = r7.A04     // Catch:{ 8bd | 8bg -> 0x084b }
            X.19n r10 = r9.A01     // Catch:{ 8bd | 8bg -> 0x084b }
            android.content.SharedPreferences r3 = X.C237119n.A00(r10)     // Catch:{ 8bd | 8bg -> 0x084b }
            java.lang.String r7 = "syncd_has_logged_snapshot_mac_mismatch_in_patch"
            int r4 = r3.getInt(r7, r5)     // Catch:{ 8bd | 8bg -> 0x084b }
            int r3 = X.AnonymousClass1IW.A00(r0)     // Catch:{ 8bd | 8bg -> 0x084b }
            int r3 = r21 << r3
            r3 = r3 & r4
            if (r3 != 0) goto L_0x053c
            android.content.SharedPreferences r3 = X.C237119n.A00(r10)     // Catch:{ 8bd | 8bg -> 0x084b }
            int r11 = r3.getInt(r7, r5)     // Catch:{ 8bd | 8bg -> 0x084b }
            int r3 = X.AnonymousClass1IW.A00(r0)     // Catch:{ 8bd | 8bg -> 0x084b }
            int r4 = r21 << r3
            r4 = r4 | r11
            android.content.SharedPreferences r3 = X.C237119n.A00(r10)     // Catch:{ 8bd | 8bg -> 0x084b }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ 8bd | 8bg -> 0x084b }
            X.C36341k9.A0v(r3, r7, r4)     // Catch:{ 8bd | 8bg -> 0x084b }
            X.1AB r4 = r9.A00     // Catch:{ 8bd | 8bg -> 0x084b }
            r3 = 60
            r4.A09(r3, r0, r5)     // Catch:{ 8bd | 8bg -> 0x084b }
        L_0x053c:
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 8bd | 8bg -> 0x084b }
            goto L_0x0575
        L_0x0542:
            if (r52 == 0) goto L_0x0575
            int r3 = r6.bitField0_     // Catch:{ all -> 0x0978 }
            r3 = r3 & 2
            boolean r3 = X.AnonymousClass000.A1P(r3)
            X.C18740tg.A0C(r3)     // Catch:{ all -> 0x0978 }
            X.AUx r3 = r6.mac_     // Catch:{ all -> 0x0978 }
            byte[] r9 = r3.A06()     // Catch:{ all -> 0x0978 }
            X.1IU r7 = r7.A07     // Catch:{ 8bd | 8bg -> 0x0867 }
            X.8O3 r3 = r6.version_     // Catch:{ 8bd | 8bg -> 0x0867 }
            if (r3 != 0) goto L_0x055d
            X.8O3 r3 = X.AnonymousClass8O3.DEFAULT_INSTANCE     // Catch:{ 8bd | 8bg -> 0x0867 }
        L_0x055d:
            long r3 = r3.version_     // Catch:{ 8bd | 8bg -> 0x0867 }
            r10 = r7
            r11 = r33
            r12 = r0
            r13 = r27
            r14 = r3
            byte[] r3 = r10.A03(r11, r12, r13, r14)     // Catch:{ 8bd | 8bg -> 0x0867 }
            boolean r3 = java.util.Arrays.equals(r9, r3)     // Catch:{ 8bd | 8bg -> 0x0867 }
            if (r3 == 0) goto L_0x085a
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 8bd | 8bg -> 0x0867 }
        L_0x0575:
            boolean r3 = r30.isEmpty()     // Catch:{ all -> 0x0978 }
            if (r3 != 0) goto L_0x05b7
            X.1AC r3 = r1.A0G     // Catch:{ all -> 0x0978 }
            X.18P r3 = r3.A00     // Catch:{ all -> 0x0978 }
            X.1M0 r9 = r3.A04()     // Catch:{ all -> 0x0978 }
            X.71s r11 = r9.B1k()     // Catch:{ all -> 0x0880 }
            X.14e r7 = r9.A02     // Catch:{ all -> 0x0876 }
            java.util.LinkedHashSet r4 = X.C36441kJ.A17()     // Catch:{ all -> 0x0876 }
            java.util.Iterator r10 = r30.iterator()     // Catch:{ all -> 0x0876 }
        L_0x0591:
            boolean r3 = r10.hasNext()     // Catch:{ all -> 0x0876 }
            if (r3 == 0) goto L_0x05a3
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x0876 }
            X.9mH r3 = (X.C202599mH) r3     // Catch:{ all -> 0x0876 }
            java.lang.String r3 = r3.A04     // Catch:{ all -> 0x0876 }
            r4.add(r3)     // Catch:{ all -> 0x0876 }
            goto L_0x0591
        L_0x05a3:
            java.lang.String[] r3 = X.C201839kV.A00     // Catch:{ all -> 0x0876 }
            java.lang.Object[] r3 = r4.toArray(r3)     // Catch:{ all -> 0x0876 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x0876 }
            X.AnonymousClass1AC.A08(r7, r3)     // Catch:{ all -> 0x0876 }
            r11.A00()     // Catch:{ all -> 0x0876 }
            r11.close()     // Catch:{ all -> 0x0880 }
            r9.close()     // Catch:{ all -> 0x0978 }
        L_0x05b7:
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0978 }
            java.util.Iterator r9 = r29.iterator()     // Catch:{ all -> 0x0978 }
        L_0x05bf:
            boolean r3 = r9.hasNext()     // Catch:{ all -> 0x0978 }
            if (r3 == 0) goto L_0x05e7
            java.lang.Object r7 = r9.next()     // Catch:{ all -> 0x0978 }
            X.9mH r7 = (X.C202599mH) r7     // Catch:{ all -> 0x0978 }
            java.lang.String r4 = r7.A04     // Catch:{ 8bf -> 0x05dd }
            r3 = r32
            boolean r3 = r3.contains(r4)     // Catch:{ 8bf -> 0x05dd }
            if (r3 != 0) goto L_0x05bf
            X.9k5 r3 = r8.A01(r7)     // Catch:{ 8bf -> 0x05dd }
            r12.add(r3)     // Catch:{ 8bf -> 0x05dd }
            goto L_0x05bf
        L_0x05dd:
            r4 = move-exception
            r1.A03(r4, r0)     // Catch:{ all -> 0x0978 }
            r3 = r26
            r3.add(r4)     // Catch:{ all -> 0x0978 }
            goto L_0x05bf
        L_0x05e7:
            java.util.Iterator r7 = r31.iterator()     // Catch:{ all -> 0x0978 }
        L_0x05eb:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x0978 }
            if (r3 == 0) goto L_0x0609
            java.lang.Object r3 = r7.next()     // Catch:{ all -> 0x0978 }
            X.9mH r3 = (X.C202599mH) r3     // Catch:{ all -> 0x0978 }
            X.9k5 r3 = r8.A01(r3)     // Catch:{ 8bf -> 0x05ff }
            r12.add(r3)     // Catch:{ 8bf -> 0x05ff }
            goto L_0x05eb
        L_0x05ff:
            r4 = move-exception
            r1.A03(r4, r0)     // Catch:{ all -> 0x0978 }
            r3 = r26
            r3.add(r4)     // Catch:{ all -> 0x0978 }
            goto L_0x05eb
        L_0x0609:
            X.1AB r3 = r1.A05     // Catch:{ 91Z -> 0x0943 }
            r29 = r3
            X.0wy r3 = X.C196969ar.A00     // Catch:{ 91Z -> 0x0943 }
            X.9dc r11 = new X.9dc     // Catch:{ 91Z -> 0x0943 }
            r11.<init>()     // Catch:{ 91Z -> 0x0943 }
            java.util.Iterator r9 = r12.iterator()     // Catch:{ 91Z -> 0x0943 }
        L_0x0618:
            boolean r3 = r9.hasNext()     // Catch:{ 91Z -> 0x0943 }
            if (r3 == 0) goto L_0x0630
            java.lang.Object r7 = r9.next()     // Catch:{ 91Z -> 0x0943 }
            X.007 r4 = r11.A00     // Catch:{ 91Z -> 0x0943 }
            boolean r3 = r4.containsKey(r7)     // Catch:{ 91Z -> 0x0943 }
            if (r3 != 0) goto L_0x0618
            r3 = r28
            r4.put(r7, r3)     // Catch:{ 91Z -> 0x0943 }
            goto L_0x0618
        L_0x0630:
            java.util.Iterator r25 = r12.iterator()     // Catch:{ 91Z -> 0x0943 }
        L_0x0634:
            boolean r3 = r25.hasNext()     // Catch:{ 91Z -> 0x0943 }
            if (r3 == 0) goto L_0x06d0
            java.lang.Object r10 = r25.next()     // Catch:{ 91Z -> 0x0943 }
            X.9k5 r10 = (X.C201669k5) r10     // Catch:{ 91Z -> 0x0943 }
            X.0wy r4 = X.C196969ar.A00     // Catch:{ 91Z -> 0x0943 }
            java.lang.String r3 = r10.A07()     // Catch:{ 91Z -> 0x0943 }
            java.lang.Object r9 = r4.get(r3)     // Catch:{ 91Z -> 0x0943 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ 91Z -> 0x0943 }
            X.0wy r4 = X.C196969ar.A01     // Catch:{ 91Z -> 0x0943 }
            java.lang.String r3 = r10.A07()     // Catch:{ 91Z -> 0x0943 }
            java.lang.Object r7 = r4.get(r3)     // Catch:{ 91Z -> 0x0943 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ 91Z -> 0x0943 }
            java.util.Iterator r24 = r12.iterator()     // Catch:{ 91Z -> 0x0943 }
        L_0x065c:
            boolean r3 = r24.hasNext()     // Catch:{ 91Z -> 0x0943 }
            if (r3 == 0) goto L_0x0634
            java.lang.Object r13 = r24.next()     // Catch:{ 91Z -> 0x0943 }
            X.9k5 r13 = (X.C201669k5) r13     // Catch:{ 91Z -> 0x0943 }
            r23 = 1
            if (r9 == 0) goto L_0x0699
            java.lang.String r3 = r13.A07()     // Catch:{ 91Z -> 0x0943 }
            boolean r3 = r9.contains(r3)     // Catch:{ 91Z -> 0x0943 }
            if (r3 == 0) goto L_0x0699
            android.util.Pair r3 = X.C196969ar.A00(r13)     // Catch:{ 91Z -> 0x0943 }
            java.lang.Object r15 = r3.first     // Catch:{ 91Z -> 0x0943 }
            java.lang.Object r14 = r3.second     // Catch:{ 91Z -> 0x0943 }
            X.3Qa r14 = (X.C64933Qa) r14     // Catch:{ 91Z -> 0x0943 }
            android.util.Pair r3 = X.C196969ar.A00(r10)     // Catch:{ 91Z -> 0x0943 }
            java.lang.Object r4 = r3.first     // Catch:{ 91Z -> 0x0943 }
            java.lang.Object r3 = r3.second     // Catch:{ 91Z -> 0x0943 }
            boolean r4 = X.C1901797e.A00(r15, r4)     // Catch:{ 91Z -> 0x0943 }
            if (r4 == 0) goto L_0x0699
            if (r14 == 0) goto L_0x069b
            if (r3 == 0) goto L_0x069b
            boolean r3 = r14.equals(r3)     // Catch:{ 91Z -> 0x0943 }
            if (r3 == 0) goto L_0x0699
            goto L_0x069b
        L_0x0699:
            r4 = 0
            goto L_0x069c
        L_0x069b:
            r4 = 1
        L_0x069c:
            if (r7 == 0) goto L_0x06a9
            java.lang.String r3 = r13.A07()     // Catch:{ 91Z -> 0x0943 }
            boolean r3 = r7.contains(r3)     // Catch:{ 91Z -> 0x0943 }
            if (r3 == 0) goto L_0x06a9
            goto L_0x06ab
        L_0x06a9:
            r23 = 0
        L_0x06ab:
            if (r13 == r10) goto L_0x065c
            if (r4 != 0) goto L_0x06b1
            if (r23 == 0) goto L_0x065c
        L_0x06b1:
            long r14 = r13.A04     // Catch:{ 91Z -> 0x0943 }
            long r3 = r10.A04     // Catch:{ 91Z -> 0x0943 }
            int r23 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r23 >= 0) goto L_0x06be
            boolean r3 = r11.A01(r10, r13)     // Catch:{ 91Z -> 0x0943 }
            goto L_0x06c2
        L_0x06be:
            boolean r3 = r11.A01(r13, r10)     // Catch:{ 91Z -> 0x0943 }
        L_0x06c2:
            if (r3 == 0) goto L_0x065c
            r3 = r29
            X.19n r14 = r3.A01     // Catch:{ 91Z -> 0x0943 }
            java.lang.String r13 = "cross_index_conflict_counter"
            r3 = 1
            r14.A06(r13, r3)     // Catch:{ 91Z -> 0x0943 }
            goto L_0x065c
        L_0x06d0:
            java.util.ArrayList r12 = X.AnonymousClass001.A0I()     // Catch:{ 91Z -> 0x0943 }
            java.util.HashSet r10 = X.C36441kJ.A16()     // Catch:{ 91Z -> 0x0943 }
            X.007 r9 = r11.A00     // Catch:{ 91Z -> 0x0943 }
            int r7 = r9.size()     // Catch:{ 91Z -> 0x0943 }
            r4 = 0
        L_0x06df:
            if (r4 >= r7) goto L_0x06eb
            java.lang.Object r3 = r9.A04(r4)     // Catch:{ 91Z -> 0x0943 }
            X.C198469dc.A00(r11, r3, r12, r10)     // Catch:{ 91Z -> 0x0943 }
            int r4 = r4 + 1
            goto L_0x06df
        L_0x06eb:
            java.util.Iterator r10 = r12.iterator()     // Catch:{ 91Z -> 0x0943 }
        L_0x06ef:
            boolean r3 = r10.hasNext()     // Catch:{ 91Z -> 0x0943 }
            if (r3 == 0) goto L_0x0763
            java.lang.Object r9 = r10.next()     // Catch:{ 91Z -> 0x0943 }
            X.9k5 r9 = (X.C201669k5) r9     // Catch:{ 91Z -> 0x0943 }
            X.1AE r4 = r8.A02     // Catch:{ 91Z -> 0x0943 }
            if (r9 != 0) goto L_0x0701
            r7 = 0
            goto L_0x070c
        L_0x0701:
            java.lang.String r3 = r9.A07()     // Catch:{ 91Z -> 0x0943 }
            X.AnonymousClass00C.A08(r3)     // Catch:{ 91Z -> 0x0943 }
            X.1LZ r7 = r4.A00(r3)     // Catch:{ 91Z -> 0x0943 }
        L_0x070c:
            X.C18740tg.A06(r7)     // Catch:{ 91Z -> 0x0943 }
            X.1AC r4 = r8.A00     // Catch:{ all -> 0x0886 }
            java.lang.String r3 = r9.A06()     // Catch:{ all -> 0x0886 }
            X.9k5 r3 = r4.A0A(r3)     // Catch:{ all -> 0x0886 }
            r7.A0G(r9, r3)     // Catch:{ all -> 0x0886 }
            r8.A02(r9)     // Catch:{ 91Z -> 0x0943 }
            boolean r3 = r9 instanceof X.C176078bX     // Catch:{ 91Z -> 0x0943 }
            if (r3 == 0) goto L_0x073f
            X.8bX r9 = (X.C176078bX) r9     // Catch:{ 91Z -> 0x0943 }
            boolean r7 = r9.A02     // Catch:{ 91Z -> 0x0943 }
            X.1Hr r4 = r1.A01     // Catch:{ 91Z -> 0x0943 }
            X.11F r3 = r9.A01     // Catch:{ 91Z -> 0x0943 }
            r34 = 5
            r35 = r7 ^ 1
        L_0x072f:
            r32 = r28
            r33 = r28
            r36 = 0
            r29 = r4
            r30 = r3
            r31 = r28
            r29.A02(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ 91Z -> 0x0943 }
            goto L_0x06ef
        L_0x073f:
            boolean r3 = r9 instanceof X.C176098bZ     // Catch:{ 91Z -> 0x0943 }
            if (r3 == 0) goto L_0x0754
            X.8bZ r9 = (X.C176098bZ) r9     // Catch:{ 91Z -> 0x0943 }
            boolean r7 = r9.A02     // Catch:{ 91Z -> 0x0943 }
            X.1Hr r4 = r1.A01     // Catch:{ 91Z -> 0x0943 }
            X.11F r3 = r9.A01     // Catch:{ 91Z -> 0x0943 }
            r34 = 5
            r35 = 3
            if (r7 == 0) goto L_0x072f
            r35 = 2
            goto L_0x072f
        L_0x0754:
            boolean r3 = r9 instanceof X.C176058bV     // Catch:{ 91Z -> 0x0943 }
            if (r3 == 0) goto L_0x06ef
            X.1Hr r4 = r1.A01     // Catch:{ 91Z -> 0x0943 }
            X.8bV r9 = (X.C176058bV) r9     // Catch:{ 91Z -> 0x0943 }
            X.11F r3 = r9.A01     // Catch:{ 91Z -> 0x0943 }
            r34 = 5
            r35 = 4
            goto L_0x072f
        L_0x0763:
            java.util.Iterator r23 = r26.iterator()     // Catch:{ all -> 0x0978 }
        L_0x0767:
            boolean r3 = r23.hasNext()     // Catch:{ all -> 0x0978 }
            if (r3 == 0) goto L_0x07f9
            java.lang.Object r3 = r23.next()     // Catch:{ all -> 0x0978 }
            X.8bf r3 = (X.C176158bf) r3     // Catch:{ all -> 0x0978 }
            int r10 = r3.reason     // Catch:{ all -> 0x0978 }
            r4 = 6
            boolean r9 = X.AnonymousClass000.A1S(r4, r10)
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0978 }
            java.lang.String r4 = "unexpected reason="
            java.lang.String r4 = X.AnonymousClass000.A0r(r4, r7, r10)     // Catch:{ all -> 0x0978 }
            X.C18740tg.A0F(r9, r4)     // Catch:{ all -> 0x0978 }
            X.1AC r11 = r1.A0G     // Catch:{ all -> 0x0978 }
            int r12 = r3.version     // Catch:{ all -> 0x0978 }
            X.9fw r14 = r3.operation     // Catch:{ all -> 0x0978 }
            java.lang.String r10 = r3.index     // Catch:{ all -> 0x0978 }
            X.C18740tg.A06(r10)     // Catch:{ all -> 0x0978 }
            byte[] r9 = r3.mutationMac     // Catch:{ all -> 0x0978 }
            X.9jo r7 = r3.syncdKeyId     // Catch:{ all -> 0x0978 }
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x0978 }
            X.8SS r13 = r3.syncActionValue     // Catch:{ all -> 0x0978 }
            X.18P r3 = r11.A00     // Catch:{ all -> 0x0978 }
            X.1M0 r4 = r3.A04()     // Catch:{ all -> 0x0978 }
            X.71s r15 = r4.B1k()     // Catch:{ all -> 0x0892 }
            X.9fw r3 = X.C199769fw.A02     // Catch:{ all -> 0x0888 }
            if (r14 != r3) goto L_0x07ca
            X.14e r9 = r4.A02     // Catch:{ all -> 0x0888 }
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0888 }
            java.lang.String r3 = "DELETE FROM syncd_mutations WHERE mutation_index IN "
            r7.append(r3)     // Catch:{ all -> 0x0888 }
            java.lang.String r3 = X.AnonymousClass1M2.A00(r21)     // Catch:{ all -> 0x0888 }
            java.lang.String r7 = X.AnonymousClass000.A0q(r3, r7)     // Catch:{ all -> 0x0888 }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x0888 }
            r3[r5] = r10     // Catch:{ all -> 0x0888 }
            java.lang.String r10 = "SyncdMutationsStore.addUnsupportedMutation"
            r9.A0E(r7, r10, r3)     // Catch:{ all -> 0x0888 }
        L_0x07c6:
            r15.A00()     // Catch:{ all -> 0x0888 }
            goto L_0x07f1
        L_0x07ca:
            X.9fw r3 = X.C199769fw.A03     // Catch:{ all -> 0x0888 }
            if (r14 != r3) goto L_0x07c6
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0888 }
            X.C18740tg.A06(r13)     // Catch:{ all -> 0x0888 }
            byte[] r36 = r13.A0o()     // Catch:{ all -> 0x0888 }
            java.lang.String r35 = X.C202599mH.A00(r10)     // Catch:{ all -> 0x0888 }
            r39 = 1
            r29 = r3
            r30 = r11
            r31 = r7
            r32 = r28
            r33 = r10
            r34 = r0
            r37 = r9
            r38 = r12
            X.AnonymousClass1AC.A05(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x0888 }
            goto L_0x07c6
        L_0x07f1:
            r15.close()     // Catch:{ all -> 0x0892 }
            r4.close()     // Catch:{ all -> 0x0978 }
            goto L_0x0767
        L_0x07f9:
            if (r27 == 0) goto L_0x01c7
            goto L_0x089e
        L_0x07fd:
            r20.close()     // Catch:{ all -> 0x0982 }
            r22.close()     // Catch:{ 198 -> 0x098c }
            monitor-exit(r8)     // Catch:{ all -> 0x09ce }
            return r5
        L_0x0805:
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchMac/patch mac mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 8bd | 8bg -> 0x0812 }
            r4 = 34
            X.198 r3 = new X.198     // Catch:{ 8bd | 8bg -> 0x0812 }
            r3.<init>(r4, r0)     // Catch:{ 8bd | 8bg -> 0x0812 }
            throw r3     // Catch:{ 8bd | 8bg -> 0x0812 }
        L_0x0812:
            r4 = move-exception
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchIntegrity: "
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x0978 }
            r3 = 10
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x0821:
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchMac/No snapshot mac"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0978 }
            r3 = 47
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x082f:
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchMac/No patch mac"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x0978 }
            r3 = 48
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x083d:
            r4 = move-exception
            java.lang.String r3 = "SyncResponseHandler/applyMutations"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x0978 }
            r3 = 7
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x084b:
            r4 = move-exception
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac: "
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x0978 }
            r3 = 10
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x085a:
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 8bd | 8bg -> 0x0867 }
            r4 = 61
            X.198 r3 = new X.198     // Catch:{ 8bd | 8bg -> 0x0867 }
            r3.<init>(r4, r0)     // Catch:{ 8bd | 8bg -> 0x0867 }
            throw r3     // Catch:{ 8bd | 8bg -> 0x0867 }
        L_0x0867:
            r4 = move-exception
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac: "
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x0978 }
            r3 = 10
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x0876:
            r3 = move-exception
            r11.close()     // Catch:{ all -> 0x087b }
            goto L_0x087f
        L_0x087b:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch:{ all -> 0x0880 }
        L_0x087f:
            throw r3     // Catch:{ all -> 0x0880 }
        L_0x0880:
            r5 = move-exception
            r9.close()     // Catch:{ all -> 0x0898 }
            goto L_0x0977
        L_0x0886:
            r3 = move-exception
            throw r3     // Catch:{ 91Z -> 0x0943 }
        L_0x0888:
            r3 = move-exception
            r15.close()     // Catch:{ all -> 0x088d }
            goto L_0x0891
        L_0x088d:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch:{ all -> 0x0892 }
        L_0x0891:
            throw r3     // Catch:{ all -> 0x0892 }
        L_0x0892:
            r5 = move-exception
            r4.close()     // Catch:{ all -> 0x0898 }
            goto L_0x0977
        L_0x0898:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x089e:
            r9 = r49
            r7 = r27
            r3 = r16
            r9.A05(r0, r7, r3)     // Catch:{ all -> 0x0978 }
            r20.A00()     // Catch:{ all -> 0x0978 }
            if (r57 == 0) goto L_0x093b
            X.1Id r9 = r1.A02     // Catch:{ all -> 0x0978 }
            if (r52 == 0) goto L_0x08b1
            r5 = 1
        L_0x08b1:
            X.2SQ r10 = new X.2SQ     // Catch:{ all -> 0x0978 }
            r10.<init>()     // Catch:{ all -> 0x0978 }
            r4 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x0978 }
            r10.A05 = r3     // Catch:{ all -> 0x0978 }
            java.util.Set r3 = X.C201669k5.A09     // Catch:{ all -> 0x0978 }
            boolean r3 = r3.contains(r0)     // Catch:{ all -> 0x0978 }
            if (r3 != 0) goto L_0x08c6
            r4 = 2
        L_0x08c6:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0978 }
            r10.A04 = r3     // Catch:{ all -> 0x0978 }
            java.lang.String r3 = X.C25911Id.A00(r9)     // Catch:{ all -> 0x0978 }
            r10.A0A = r3     // Catch:{ all -> 0x0978 }
            int r3 = r0.hashCode()     // Catch:{ all -> 0x0978 }
            switch(r3) {
                case -849492943: goto L_0x0904;
                case -564602779: goto L_0x08fb;
                case -498584183: goto L_0x08f2;
                case 207170541: goto L_0x08e9;
                case 1086463900: goto L_0x08e0;
                default: goto L_0x08d9;
            }     // Catch:{ all -> 0x0978 }
        L_0x08d9:
            java.lang.String r0 = "CompanionSyncStatsLogger/convertToWamCollection received undefined collection name"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ all -> 0x0978 }
            throw r0     // Catch:{ all -> 0x0978 }
        L_0x08e0:
            java.lang.String r3 = "regular"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0978 }
            if (r0 == 0) goto L_0x08d9
            goto L_0x090d
        L_0x08e9:
            java.lang.String r3 = "critical_block"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0978 }
            if (r0 == 0) goto L_0x08d9
            goto L_0x090f
        L_0x08f2:
            java.lang.String r3 = "critical_unblock_low"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0978 }
            if (r0 == 0) goto L_0x08d9
            goto L_0x0911
        L_0x08fb:
            java.lang.String r3 = "regular_high"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0978 }
            if (r0 == 0) goto L_0x08d9
            goto L_0x0913
        L_0x0904:
            java.lang.String r3 = "regular_low"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0978 }
            if (r0 == 0) goto L_0x08d9
            goto L_0x0915
        L_0x090d:
            r0 = 1
            goto L_0x0916
        L_0x090f:
            r0 = 4
            goto L_0x0916
        L_0x0911:
            r0 = 5
            goto L_0x0916
        L_0x0913:
            r0 = 3
            goto L_0x0916
        L_0x0915:
            r0 = 2
        L_0x0916:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0978 }
            r10.A02 = r0     // Catch:{ all -> 0x0978 }
            X.0wo r0 = r9.A01     // Catch:{ all -> 0x0978 }
            long r6 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x0978 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0978 }
            r10.A09 = r0     // Catch:{ all -> 0x0978 }
            r3 = r18
            java.lang.Long r0 = X.C90504aG.A0h(r6, r3)     // Catch:{ all -> 0x0978 }
            r10.A08 = r0     // Catch:{ all -> 0x0978 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0978 }
            r10.A01 = r0     // Catch:{ all -> 0x0978 }
            X.0yW r0 = r9.A03     // Catch:{ all -> 0x0978 }
            r0.Bly(r10)     // Catch:{ all -> 0x0978 }
        L_0x093b:
            r20.close()     // Catch:{ all -> 0x0982 }
            r22.close()     // Catch:{ 198 -> 0x098c }
            monitor-exit(r8)     // Catch:{ all -> 0x09ce }
            return r21
        L_0x0943:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0978 }
            java.lang.String r3 = "SyncResponseHandler/applyMutations cyclic mutation e="
            X.C36321k7.A1J(r5, r3, r4)     // Catch:{ all -> 0x0978 }
            r3 = 39
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
            goto L_0x0977
        L_0x0955:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0978 }
            java.lang.String r4 = "SyncResponseHandler/verifyCollectionVersion fail for incoming patch, currentVersion="
            r5.append(r4)     // Catch:{ all -> 0x0978 }
            r5.append(r3)     // Catch:{ all -> 0x0978 }
            java.lang.String r3 = "; newVersion="
            r5.append(r3)     // Catch:{ all -> 0x0978 }
            r3 = r16
            r5.append(r3)     // Catch:{ all -> 0x0978 }
            java.lang.String r3 = "; collection="
            X.C36321k7.A1P(r3, r0, r5)     // Catch:{ all -> 0x0978 }
            r3 = 73
            X.198 r5 = new X.198     // Catch:{ all -> 0x0978 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0978 }
        L_0x0977:
            throw r5     // Catch:{ all -> 0x0978 }
        L_0x0978:
            r3 = move-exception
            r20.close()     // Catch:{ all -> 0x097d }
            goto L_0x0981
        L_0x097d:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch:{ all -> 0x0982 }
        L_0x0981:
            throw r3     // Catch:{ all -> 0x0982 }
        L_0x0982:
            r3 = move-exception
            r22.close()     // Catch:{ all -> 0x0987 }
            goto L_0x098b
        L_0x0987:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch:{ 198 -> 0x098c }
        L_0x098b:
            throw r3     // Catch:{ 198 -> 0x098c }
        L_0x098c:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x09ce }
            java.lang.String r0 = "SyncResponseHandler/handleIncomingPatches applyMutations ex="
            X.C36321k7.A1J(r4, r0, r3)     // Catch:{ all -> 0x09ce }
            if (r51 == 0) goto L_0x09cd
            int r0 = r2.bitField0_     // Catch:{ all -> 0x09ce }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x09cd
            int r3 = r2.deviceIndex_     // Catch:{ all -> 0x09ce }
            X.19g r0 = r1.A0E     // Catch:{ all -> 0x09ce }
            X.3SB r2 = r0.A08(r3)     // Catch:{ all -> 0x09ce }
            if (r2 == 0) goto L_0x09cd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x09ce }
            java.lang.String r0 = "SyncResponseHandler/logCompanionInfo companion: "
            r1.append(r0)     // Catch:{ all -> 0x09ce }
            r1.append(r3)     // Catch:{ all -> 0x09ce }
            java.lang.String r0 = "; ["
            r1.append(r0)     // Catch:{ all -> 0x09ce }
            X.2qA r0 = r2.A08     // Catch:{ all -> 0x09ce }
            r1.append(r0)     // Catch:{ all -> 0x09ce }
            r0 = 40
            r1.append(r0)     // Catch:{ all -> 0x09ce }
            java.lang.String r0 = r2.A09     // Catch:{ all -> 0x09ce }
            r1.append(r0)     // Catch:{ all -> 0x09ce }
            java.lang.String r0 = ")]"
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x09ce }
        L_0x09cd:
            throw r4     // Catch:{ all -> 0x09ce }
        L_0x09ce:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x09ce }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203289nj.A05(X.8Ro, X.8Qn, java.lang.String, java.util.List, long, boolean):boolean");
    }
}
