package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1HT  reason: invalid class name */
public class AnonymousClass1HT {
    public final C19700wN A00;
    public final C20690y0 A01;
    public final C19970wo A02;
    public final C19630wG A03;
    public final AnonymousClass1C7 A04;
    public final AnonymousClass163 A05;
    public final C20310xM A06;
    public final AnonymousClass1DQ A07;
    public final C219712j A08;
    public final AnonymousClass1DF A09;
    public final C24061Ay A0A;
    public final AnonymousClass16J A0B;
    public final C220612s A0C;
    public final AnonymousClass12P A0D;
    public final C219612i A0E;
    public final AnonymousClass16F A0F;
    public final AnonymousClass16E A0G;
    public final C19890wg A0H;
    public final AtomicBoolean A0I = new AtomicBoolean(false);
    public final C20810yC A0J;
    public final AnonymousClass1HW A0K;
    public final AnonymousClass1HU A0L;
    public final AnonymousClass16G A0M;
    public final AnonymousClass1A1 A0N;

    public void A04() {
        ArrayList A032 = A03((UserJid) null);
        HashMap hashMap = new HashMap();
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 r2 = (AnonymousClass3T1) it.next();
            UserJid A0L2 = r2.A0L();
            if (A0L2 != null) {
                List list = (List) hashMap.get(A0L2);
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(r2);
                hashMap.put(A0L2, list);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            UserJid userJid = (UserJid) entry.getKey();
            List list2 = (List) entry.getValue();
            AnonymousClass16E r3 = this.A0G;
            C65663Sz A082 = r3.A08(userJid);
            if (A082 == null) {
                if (!list2.isEmpty()) {
                    A082 = new C65663Sz(this.A02, userJid);
                }
            } else if (list2.size() == A082.A02()) {
            }
            C65663Sz A002 = A00(A082, this, list2);
            if (A002 != null) {
                Log.e("StatusMessageStore/regenerateOutOfSyncStatusInfoObjects/newStatusInfoGenerated");
                r3.A0D(A002, userJid);
            }
        }
    }

    public static C65663Sz A00(C65663Sz r8, AnonymousClass1HT r9, List list) {
        long j;
        long j2;
        C65663Sz r3 = new C65663Sz(r9.A02, r8);
        synchronized (r3) {
            r3.A03 = Long.MIN_VALUE;
        }
        r3.A09(Long.MIN_VALUE);
        r3.A08(0);
        synchronized (r3) {
            r3.A01 = 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 r6 = (AnonymousClass3T1) it.next();
            long j3 = r6.A1O;
            synchronized (r3) {
                r3.A04 = j3;
            }
            synchronized (r3) {
                r3.A07 = r6;
            }
            r3.A0A(r6.A0I);
            synchronized (r3) {
                r3.A00++;
            }
            if (!r3.A0B()) {
                long j4 = r6.A1O;
                synchronized (r8) {
                    j = r8.A05;
                }
                if (j4 <= j) {
                    long j5 = r6.A1O;
                    synchronized (r3) {
                        r3.A05 = j5;
                    }
                } else {
                    synchronized (r3) {
                        r3.A01++;
                    }
                    if (r3.A03() == 1) {
                        long j6 = r6.A1O;
                        synchronized (r3) {
                            r3.A03 = j6;
                        }
                    }
                    if (r3.A03() <= 2) {
                        r3.A09(r6.A1O);
                    }
                }
                long j7 = r6.A1O;
                synchronized (r8) {
                    j2 = r8.A06;
                }
                if (j7 <= j2) {
                    long j8 = r6.A1O;
                    synchronized (r3) {
                        r3.A06 = j8;
                    }
                } else {
                    continue;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("StatusMessageStore/regenerateStatusInfoAndUpdateStatusStore/ old: ");
        sb.append(r8);
        sb.append(" new:");
        sb.append(r3);
        Log.i(sb.toString());
        if (r3.A02() != 0) {
            return r3;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StatusMessageStore/regenerateStatusInfo newStatusInfo has totalCount 0: ");
        sb2.append(r3);
        Log.i(sb2.toString());
        return null;
    }

    public int A01(UserJid userJid) {
        if (userJid == C223613z.A00) {
            Log.i("deleting MeJid status from StatusMessageStore/deleteStatuses");
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ArrayList A032 = A03(userJid);
        Iterator it = A032.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            AnonymousClass3T1 r8 = (AnonymousClass3T1) it.next();
            this.A06.A0o(r8, 1, false);
            UserJid A0L2 = r8.A0L();
            if (!r8.A1J.A02 && A0L2 != null && !(A0L2 instanceof C177638e7)) {
                i++;
                hashSet.add(A0L2.user);
                C65663Sz A082 = this.A0G.A08(A0L2);
                if (A082 != null && C203359nq.A0B(A082, r8)) {
                    i2++;
                    hashSet2.add(A0L2.user);
                }
            }
        }
        this.A0G.A06(userJid);
        this.A07.A01.post(new C35701j7(this, A032, 28));
        this.A0M.A01(hashSet, hashSet2, i, i2);
        return A032.size();
    }

    public AnonymousClass3T1 A02(UserJid userJid) {
        AnonymousClass3T1 r0;
        AnonymousClass3T1 r02;
        C65663Sz A082 = this.A0G.A08(userJid);
        if (A082 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("statusmsgstore/getlaststatusmessage/no status for ");
            sb.append(userJid);
            Log.w(sb.toString());
            return null;
        }
        synchronized (A082) {
            r0 = A082.A07;
        }
        if (r0 == null) {
            AnonymousClass3T1 A0U = this.A06.A0U(A082.A04());
            synchronized (A082) {
                A082.A07 = A0U;
            }
        }
        synchronized (A082) {
            r02 = A082.A07;
        }
        return r02;
    }

    public AnonymousClass1HT(C19700wN r3, C20690y0 r4, C19970wo r5, C19630wG r6, AnonymousClass1C7 r7, AnonymousClass163 r8, C20310xM r9, AnonymousClass1DQ r10, C219712j r11, AnonymousClass1DF r12, C24061Ay r13, AnonymousClass16J r14, C220612s r15, AnonymousClass12P r16, C219612i r17, AnonymousClass16F r18, AnonymousClass16E r19, C20810yC r20, C19890wg r21, AnonymousClass1HW r22, AnonymousClass1HU r23, AnonymousClass16G r24, AnonymousClass1A1 r25) {
        this.A02 = r5;
        this.A0J = r20;
        this.A08 = r11;
        this.A05 = r8;
        this.A00 = r3;
        this.A03 = r6;
        this.A01 = r4;
        this.A0G = r19;
        this.A07 = r10;
        this.A0A = r13;
        this.A0N = r25;
        this.A06 = r9;
        this.A0B = r14;
        this.A0K = r22;
        this.A0L = r23;
        this.A09 = r12;
        this.A0E = r17;
        this.A04 = r7;
        this.A0D = r16;
        this.A0F = r18;
        this.A0H = r21;
        this.A0C = r15;
        this.A0M = r24;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0127, code lost:
        if (X.AnonymousClass3TJ.A02(r11.A0D, 4) == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014b, code lost:
        if (r1.A01(r2) != false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0171, code lost:
        if (r11.A0I > r20) goto L_0x0173;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A03(com.whatsapp.jid.UserJid r23) {
        /*
            r22 = this;
            X.C18740tg.A00()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r6 = r22
            X.12P r0 = r6.A0D     // Catch:{ RuntimeException -> 0x01c5 }
            X.1M0 r9 = r0.get()     // Catch:{ RuntimeException -> 0x01c5 }
            r10 = 0
            r8 = 1
            r7 = r23
            if (r23 != 0) goto L_0x0017
            goto L_0x0061
        L_0x0017:
            X.13z r0 = X.C223613z.A00     // Catch:{ all -> 0x01bb }
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x0036
            X.14e r4 = r9.A02     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = X.C56872x1.A04     // Catch:{ all -> 0x01bb }
            java.lang.String[] r2 = new java.lang.String[r8]     // Catch:{ all -> 0x01bb }
            X.163 r0 = r6.A05     // Catch:{ all -> 0x01bb }
            X.8dw r5 = X.C177528dw.A00     // Catch:{ all -> 0x01bb }
            long r0 = r0.A08(r5)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01bb }
            r2[r10] = r0     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "SELECT_STATUSES_FOR_ME_SQL"
            goto L_0x0077
        L_0x0036:
            X.14e r4 = r9.A02     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = X.C56872x1.A03     // Catch:{ all -> 0x01bb }
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x01bb }
            X.163 r0 = r6.A05     // Catch:{ all -> 0x01bb }
            X.8dw r5 = X.C177528dw.A00     // Catch:{ all -> 0x01bb }
            long r0 = r0.A08(r5)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01bb }
            r2[r10] = r0     // Catch:{ all -> 0x01bb }
            X.12j r0 = r6.A08     // Catch:{ all -> 0x01bb }
            long r0 = r0.A07(r7)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01bb }
            r2[r8] = r0     // Catch:{ all -> 0x01bb }
            r1 = 2
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x01bb }
            r2[r1] = r0     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "SELECT_STATUSES_FOR_JID_SQL"
            goto L_0x0077
        L_0x0061:
            X.14e r4 = r9.A02     // Catch:{ all -> 0x01bb }
            java.lang.String r3 = X.C56872x1.A01     // Catch:{ all -> 0x01bb }
            java.lang.String[] r2 = new java.lang.String[r8]     // Catch:{ all -> 0x01bb }
            X.163 r0 = r6.A05     // Catch:{ all -> 0x01bb }
            X.8dw r5 = X.C177528dw.A00     // Catch:{ all -> 0x01bb }
            long r0 = r0.A08(r5)     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01bb }
            r2[r10] = r0     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = "GET_STATUS_MESSAGES_SQL"
        L_0x0077:
            android.database.Cursor r8 = r4.A09(r3, r0, r2)     // Catch:{ all -> 0x01bb }
            if (r23 == 0) goto L_0x0089
            X.16E r0 = r6.A0G     // Catch:{ all -> 0x01af }
            X.3Sz r0 = r0.A08(r7)     // Catch:{ all -> 0x01af }
            if (r0 != 0) goto L_0x0089
            if (r8 == 0) goto L_0x01ab
            goto L_0x01a8
        L_0x0089:
            X.0wo r11 = r6.A02     // Catch:{ all -> 0x01af }
            long r2 = X.C19970wo.A00(r11)     // Catch:{ all -> 0x01af }
            long r0 = r11.A04()     // Catch:{ all -> 0x01af }
            long r13 = r2 - r0
            r18 = 86400000(0x5265c00, double:4.2687272E-316)
            r4 = 0
            int r0 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e4
            X.0wN r14 = r6.A00     // Catch:{ all -> 0x01af }
            java.lang.String r13 = "statusmsgstore/getStatusMessages ntp time is off by over 1 day"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01af }
            r10.<init>()     // Catch:{ all -> 0x01af }
            java.lang.String r0 = "ntp time: "
            r10.append(r0)     // Catch:{ all -> 0x01af }
            long r0 = r11.A02     // Catch:{ all -> 0x01af }
            r16 = 0
            int r15 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r15 == 0) goto L_0x00db
            long r0 = r11.A02     // Catch:{ all -> 0x01af }
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01af }
            long r0 = r0 + r15
        L_0x00ba:
            r10.append(r0)     // Catch:{ all -> 0x01af }
            java.lang.String r0 = " wa server time: "
            r10.append(r0)     // Catch:{ all -> 0x01af }
            long r0 = r11.A04()     // Catch:{ all -> 0x01af }
            r10.append(r0)     // Catch:{ all -> 0x01af }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x01af }
            r14.A0E(r13, r0, r4)     // Catch:{ all -> 0x01af }
            X.0yC r10 = r6.A0J     // Catch:{ all -> 0x01af }
            r1 = 6219(0x184b, float:8.715E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x01af }
            boolean r0 = X.C20800yB.A01(r0, r10, r1)     // Catch:{ all -> 0x01af }
            goto L_0x00de
        L_0x00db:
            r0 = 0
            goto L_0x00ba
        L_0x00de:
            if (r0 == 0) goto L_0x00e4
            long r2 = r11.A04()     // Catch:{ all -> 0x01af }
        L_0x00e4:
            long r20 = r2 - r18
            X.12i r11 = r6.A0E     // Catch:{ all -> 0x01af }
            java.lang.String r10 = "status_psa_exipration_time"
            r0 = 0
            long r18 = r11.A00(r10, r0)     // Catch:{ all -> 0x01af }
            java.lang.String r10 = "status_psa_viewed_time"
            long r16 = r11.A00(r10, r0)     // Catch:{ all -> 0x01af }
        L_0x00f6:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x01af }
            if (r0 == 0) goto L_0x017a
            X.1A1 r0 = r6.A0N     // Catch:{ all -> 0x01af }
            X.3T1 r11 = r0.A01(r8, r5)     // Catch:{ all -> 0x01af }
            if (r11 != 0) goto L_0x0119
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01af }
            r1.<init>()     // Catch:{ all -> 0x01af }
            java.lang.String r0 = "statusmsgstore/status-null-message for "
            r1.append(r0)     // Catch:{ all -> 0x01af }
            r1.append(r7)     // Catch:{ all -> 0x01af }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01af }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01af }
            goto L_0x00f6
        L_0x0119:
            boolean r0 = X.C66013Ui.A0n(r11)     // Catch:{ all -> 0x01af }
            if (r0 == 0) goto L_0x0129
            r1 = 4
            int r0 = r11.A0D     // Catch:{ all -> 0x01af }
            boolean r1 = X.AnonymousClass3TJ.A02(r0, r1)     // Catch:{ all -> 0x01af }
            r0 = 1
            if (r1 != 0) goto L_0x012a
        L_0x0129:
            r0 = 0
        L_0x012a:
            if (r0 != 0) goto L_0x00f6
            boolean r0 = X.C203359nq.A0C(r11)     // Catch:{ all -> 0x01af }
            if (r0 != 0) goto L_0x00f6
            X.11F r0 = r11.A0J()     // Catch:{ all -> 0x01af }
            boolean r0 = r0 instanceof X.C177638e7     // Catch:{ all -> 0x01af }
            if (r0 == 0) goto L_0x016d
            X.16F r0 = r6.A0F     // Catch:{ all -> 0x01af }
            X.3SA r1 = r0.A00(r11)     // Catch:{ all -> 0x01af }
            boolean r0 = r1.A00()     // Catch:{ all -> 0x01af }
            if (r0 != 0) goto L_0x014d
            boolean r0 = r1.A01(r2)     // Catch:{ all -> 0x01af }
            r15 = 1
            if (r0 == 0) goto L_0x014e
        L_0x014d:
            r15 = 0
        L_0x014e:
            boolean r0 = r1.A00()     // Catch:{ all -> 0x01af }
            if (r0 == 0) goto L_0x015b
            long r0 = r11.A0I     // Catch:{ all -> 0x01af }
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 > 0) goto L_0x0167
            goto L_0x015d
        L_0x015b:
            r0 = 0
            goto L_0x0168
        L_0x015d:
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x0167
            r13 = 0
            int r0 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x015b
        L_0x0167:
            r0 = 1
        L_0x0168:
            if (r0 != 0) goto L_0x0173
            if (r15 == 0) goto L_0x0177
            goto L_0x0173
        L_0x016d:
            long r0 = r11.A0I     // Catch:{ all -> 0x01af }
            int r10 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r10 <= 0) goto L_0x0177
        L_0x0173:
            r12.add(r11)     // Catch:{ all -> 0x01af }
            goto L_0x00f6
        L_0x0177:
            r4 = 1
            goto L_0x00f6
        L_0x017a:
            if (r4 == 0) goto L_0x01a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01af }
            r1.<init>()     // Catch:{ all -> 0x01af }
            java.lang.String r0 = "statusmsgstore/status-cleanup/ "
            r1.append(r0)     // Catch:{ all -> 0x01af }
            r1.append(r7)     // Catch:{ all -> 0x01af }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01af }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01af }
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.A0I     // Catch:{ all -> 0x01af }
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)     // Catch:{ all -> 0x01af }
            if (r0 == 0) goto L_0x01a8
            X.1C7 r2 = r6.A04     // Catch:{ all -> 0x01af }
            r0 = 38
            X.1j6 r1 = new X.1j6     // Catch:{ all -> 0x01af }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x01af }
            r0 = 41
            r2.A01(r1, r0)     // Catch:{ all -> 0x01af }
        L_0x01a8:
            r8.close()     // Catch:{ all -> 0x01bb }
        L_0x01ab:
            r9.close()     // Catch:{ RuntimeException -> 0x01c5 }
            return r12
        L_0x01af:
            r1 = move-exception
            if (r8 == 0) goto L_0x01ba
            r8.close()     // Catch:{ all -> 0x01b6 }
            goto L_0x01ba
        L_0x01b6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01bb }
        L_0x01ba:
            throw r1     // Catch:{ all -> 0x01bb }
        L_0x01bb:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x01c0 }
            goto L_0x01c4
        L_0x01c0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ RuntimeException -> 0x01c5 }
        L_0x01c4:
            throw r1     // Catch:{ RuntimeException -> 0x01c5 }
        L_0x01c5:
            r1 = move-exception
            java.lang.String r0 = "StatusMessageStore/getStatusMessages/exception"
            com.whatsapp.util.Log.e(r0, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HT.A03(com.whatsapp.jid.UserJid):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:245:0x07ce, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:?, code lost:
        r23.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x07d7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01fc, code lost:
        if (X.C203359nq.A0C(r7) == false) goto L_0x01fe;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x00f0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0226 A[Catch:{ all -> 0x07ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0269 A[Catch:{ all -> 0x07ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0272 A[Catch:{ all -> 0x07ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x029f A[Catch:{ all -> 0x07ce }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(boolean r42) {
        /*
            r41 = this;
            X.C18740tg.A00()
            java.util.HashSet r20 = new java.util.HashSet
            r20.<init>()
            r6 = r41
            X.0wo r0 = r6.A02
            r40 = r0
            long r2 = X.C19970wo.A00(r40)
            long r0 = r40.A04()
            long r7 = r2 - r0
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            r4 = 0
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
            X.0wN r5 = r6.A00
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "ntp time: "
            r7.append(r0)
            r0 = r40
            long r0 = r0.A02
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x008d
            r0 = r40
            long r0 = r0.A02
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r8
        L_0x003f:
            r7.append(r0)
            java.lang.String r0 = " wa server time: "
            r7.append(r0)
            long r0 = r40.A04()
            r7.append(r0)
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses ntp time is off by over 1 day"
            r5.A0E(r0, r1, r4)
            X.0yC r5 = r6.A0J
            r1 = 6219(0x184b, float:8.715E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r5, r1)
            if (r0 == 0) goto L_0x0067
            long r2 = r40.A04()
        L_0x0067:
            long r2 = r2 - r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses "
            r1.append(r0)
            r25 = r42
            r0 = r25
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.14g r21 = new X.14g
            r0 = r21
            r0.<init>((java.lang.String) r1)
            X.12P r0 = r6.A0D
            r39 = r0
            X.1M0 r24 = r39.A05()
            goto L_0x0090
        L_0x008d:
            r0 = 0
            goto L_0x003f
        L_0x0090:
            X.71s r23 = r24.B1k()     // Catch:{ all -> 0x07d8 }
            r0 = r24
            X.14e r0 = r0.A02     // Catch:{ all -> 0x07ce }
            r38 = r0
            java.lang.String r7 = X.C56872x1.A01     // Catch:{ all -> 0x07ce }
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ all -> 0x07ce }
            X.163 r0 = r6.A05     // Catch:{ all -> 0x07ce }
            r37 = r0
            X.8dw r35 = X.C177528dw.A00     // Catch:{ all -> 0x07ce }
            r1 = r0
            r0 = r35
            long r0 = r1.A08(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x07ce }
            r5[r4] = r0     // Catch:{ all -> 0x07ce }
            java.lang.String r1 = "GET_STATUS_MESSAGES_SQL"
            r0 = r38
            android.database.Cursor r34 = r0.A09(r7, r1, r5)     // Catch:{ all -> 0x07ce }
            X.12i r0 = r6.A0E     // Catch:{ all -> 0x07ce }
            r36 = r0
            java.lang.String r1 = "status_psa_viewed_time"
            r4 = 0
            long r18 = r0.A00(r1, r4)     // Catch:{ all -> 0x07ce }
            java.lang.String r1 = "status_psa_exipration_time"
            long r16 = r0.A00(r1, r4)     // Catch:{ all -> 0x07ce }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ all -> 0x07ce }
            r14.<init>()     // Catch:{ all -> 0x07ce }
            java.util.ArrayList r33 = new java.util.ArrayList     // Catch:{ all -> 0x07ce }
            r33.<init>()     // Catch:{ all -> 0x07ce }
            java.util.ArrayList r32 = new java.util.ArrayList     // Catch:{ all -> 0x07ce }
            r32.<init>()     // Catch:{ all -> 0x07ce }
            java.util.LinkedList r31 = new java.util.LinkedList     // Catch:{ all -> 0x07ce }
            r31.<init>()     // Catch:{ all -> 0x07ce }
            java.util.HashSet r30 = new java.util.HashSet     // Catch:{ all -> 0x07ce }
            r30.<init>()     // Catch:{ all -> 0x07ce }
            java.util.HashSet r29 = new java.util.HashSet     // Catch:{ all -> 0x07ce }
            r29.<init>()     // Catch:{ all -> 0x07ce }
            r10 = 0
            r9 = 0
            r13 = 0
            r22 = 0
            r12 = 0
        L_0x00f0:
            boolean r0 = r34.moveToNext()     // Catch:{ all -> 0x07ce }
            java.lang.String r28 = " deleted:"
            if (r0 == 0) goto L_0x033c
            int r12 = r12 + 1
            X.1A1 r7 = r6.A0N     // Catch:{ all -> 0x07ce }
            r1 = r34
            r0 = r35
            X.3T1 r7 = r7.A01(r1, r0)     // Catch:{ all -> 0x07ce }
            if (r7 != 0) goto L_0x010c
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/no message"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
            goto L_0x00f0
        L_0x010c:
            X.11F r0 = r7.A0J()     // Catch:{ all -> 0x07ce }
            boolean r0 = r0 instanceof X.C177638e7     // Catch:{ all -> 0x07ce }
            java.lang.String r8 = " "
            if (r0 == 0) goto L_0x019b
            X.16F r0 = r6.A0F     // Catch:{ all -> 0x07ce }
            X.3SA r11 = r0.A00(r7)     // Catch:{ all -> 0x07ce }
            boolean r0 = r11.A00()     // Catch:{ all -> 0x07ce }
            java.lang.String r15 = "statusmsgstore/deleteoldstatuses/psamessage "
            if (r0 != 0) goto L_0x0130
            long r0 = X.C19970wo.A00(r40)     // Catch:{ all -> 0x07ce }
            boolean r0 = r11.A01(r0)     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x0214
            goto L_0x01fe
        L_0x0130:
            long r26 = X.C19970wo.A00(r40)     // Catch:{ all -> 0x07ce }
            int r0 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0146
            r26 = 0
            int r0 = (r16 > r26 ? 1 : (r16 == r26 ? 0 : -1))
            if (r0 <= 0) goto L_0x0146
            long r0 = r7.A0I     // Catch:{ all -> 0x07ce }
            int r11 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r11 >= 0) goto L_0x0146
            goto L_0x01fe
        L_0x0146:
            long r0 = r7.A0I     // Catch:{ all -> 0x07ce }
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 >= 0) goto L_0x0214
            X.16E r1 = r6.A0G     // Catch:{ all -> 0x07ce }
            com.whatsapp.jid.UserJid r0 = r7.A0L()     // Catch:{ all -> 0x07ce }
            X.3Sz r0 = r1.A08(r0)     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x0214
            int r0 = r0.A03()     // Catch:{ all -> 0x07ce }
            if (r0 != 0) goto L_0x0214
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r11.<init>()     // Catch:{ all -> 0x07ce }
            r11.append(r15)     // Catch:{ all -> 0x07ce }
            X.3Qa r0 = r7.A1J     // Catch:{ all -> 0x07ce }
            r11.append(r0)     // Catch:{ all -> 0x07ce }
            r11.append(r8)     // Catch:{ all -> 0x07ce }
            int r0 = r7.A1I     // Catch:{ all -> 0x07ce }
            r11.append(r0)     // Catch:{ all -> 0x07ce }
            r11.append(r8)     // Catch:{ all -> 0x07ce }
            int r0 = r7.A0D     // Catch:{ all -> 0x07ce }
            r11.append(r0)     // Catch:{ all -> 0x07ce }
            r11.append(r8)     // Catch:{ all -> 0x07ce }
            long r0 = r7.A0I     // Catch:{ all -> 0x07ce }
            r11.append(r0)     // Catch:{ all -> 0x07ce }
            r11.append(r8)     // Catch:{ all -> 0x07ce }
            r0 = r16
            r11.append(r0)     // Catch:{ all -> 0x07ce }
            r11.append(r8)     // Catch:{ all -> 0x07ce }
            r0 = r18
            r11.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x07ce }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
            goto L_0x01fe
        L_0x019b:
            X.3Qa r0 = r7.A1J     // Catch:{ all -> 0x07ce }
            boolean r0 = r0.A02     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x01ac
            long r0 = r7.A0H     // Catch:{ all -> 0x07ce }
            r26 = 0
            int r11 = (r0 > r26 ? 1 : (r0 == r26 ? 0 : -1))
            if (r11 <= 0) goto L_0x01ac
            long r0 = r7.A0H     // Catch:{ all -> 0x07ce }
            goto L_0x01ae
        L_0x01ac:
            long r0 = r7.A0I     // Catch:{ all -> 0x07ce }
        L_0x01ae:
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 >= 0) goto L_0x0209
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r11.<init>()     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/message "
            r11.append(r0)     // Catch:{ all -> 0x07ce }
            X.3Qa r0 = r7.A1J     // Catch:{ all -> 0x07ce }
            r11.append(r0)     // Catch:{ all -> 0x07ce }
            r11.append(r8)     // Catch:{ all -> 0x07ce }
            X.11F r0 = r7.A0J()     // Catch:{ all -> 0x07ce }
            r11.append(r0)     // Catch:{ all -> 0x07ce }
            r11.append(r8)     // Catch:{ all -> 0x07ce }
            int r0 = r7.A1I     // Catch:{ all -> 0x07ce }
            r11.append(r0)     // Catch:{ all -> 0x07ce }
            r11.append(r8)     // Catch:{ all -> 0x07ce }
            int r0 = r7.A0D     // Catch:{ all -> 0x07ce }
            r11.append(r0)     // Catch:{ all -> 0x07ce }
            r11.append(r8)     // Catch:{ all -> 0x07ce }
            long r0 = r7.A0I     // Catch:{ all -> 0x07ce }
            r11.append(r0)     // Catch:{ all -> 0x07ce }
            r11.append(r8)     // Catch:{ all -> 0x07ce }
            long r0 = r7.A0H     // Catch:{ all -> 0x07ce }
            r11.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x07ce }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
            boolean r0 = X.C66013Ui.A0n(r7)     // Catch:{ all -> 0x07ce }
            if (r0 != 0) goto L_0x0200
            boolean r0 = X.C203359nq.A0C(r7)     // Catch:{ all -> 0x07ce }
            if (r0 != 0) goto L_0x0200
        L_0x01fe:
            r22 = 1
        L_0x0200:
            r0 = r33
            r0.add(r7)     // Catch:{ all -> 0x07ce }
            int r13 = r13 + 1
            goto L_0x0297
        L_0x0209:
            r26 = 0
            int r8 = (r4 > r26 ? 1 : (r4 == r26 ? 0 : -1))
            if (r8 == 0) goto L_0x0213
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0214
        L_0x0213:
            r4 = r0
        L_0x0214:
            boolean r0 = X.C66013Ui.A0n(r7)     // Catch:{ all -> 0x07ce }
            if (r0 != 0) goto L_0x0297
            boolean r0 = X.C203359nq.A0C(r7)     // Catch:{ all -> 0x07ce }
            if (r0 != 0) goto L_0x0297
            com.whatsapp.jid.UserJid r1 = r7.A0L()     // Catch:{ all -> 0x07ce }
            if (r1 != 0) goto L_0x0261
            X.0wN r15 = r6.A00     // Catch:{ all -> 0x07ce }
            java.lang.String r11 = "statusmsgstore/deleteoldstatuses status message with null sender user jid"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r8.<init>()     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = "message: "
            r8.append(r0)     // Catch:{ all -> 0x07ce }
            r8.append(r7)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = " senderJid: "
            r8.append(r0)     // Catch:{ all -> 0x07ce }
            X.11F r0 = r7.A0J()     // Catch:{ all -> 0x07ce }
            r8.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x07ce }
            r0 = 0
            r15.A0E(r11, r8, r0)     // Catch:{ all -> 0x07ce }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r8.<init>()     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/null message senderUserJid "
            r8.append(r0)     // Catch:{ all -> 0x07ce }
            X.3Qa r0 = r7.A1J     // Catch:{ all -> 0x07ce }
            r8.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x07ce }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
        L_0x0261:
            java.lang.Object r0 = r14.get(r1)     // Catch:{ all -> 0x07ce }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x07ce }
            if (r0 != 0) goto L_0x0272
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x07ce }
            r14.put(r1, r0)     // Catch:{ all -> 0x07ce }
            goto L_0x027f
        L_0x0272:
            int r0 = r0.intValue()     // Catch:{ all -> 0x07ce }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x07ce }
            r14.put(r1, r0)     // Catch:{ all -> 0x07ce }
        L_0x027f:
            if (r42 == 0) goto L_0x0297
            boolean r0 = r7 instanceof X.AnonymousClass2bU     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x0297
            r0 = r7
            X.2bU r0 = (X.AnonymousClass2bU) r0     // Catch:{ all -> 0x07ce }
            X.3Qj r1 = r0.A01     // Catch:{ all -> 0x07ce }
            if (r1 == 0) goto L_0x0297
            java.io.File r0 = r1.A0I     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x0297
            java.io.File r1 = r1.A0I     // Catch:{ all -> 0x07ce }
            r0 = r20
            r0.add(r1)     // Catch:{ all -> 0x07ce }
        L_0x0297:
            int r1 = r33.size()     // Catch:{ all -> 0x07ce }
            r0 = 256(0x100, float:3.59E-43)
            if (r1 < r0) goto L_0x00f0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r1.<init>()     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/delete total:"
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r1.append(r12)     // Catch:{ all -> 0x07ce }
            r0 = r28
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r1.append(r13)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = " current batch:"
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            int r0 = r33.size()     // Catch:{ all -> 0x07ce }
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x07ce }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
            r34.close()     // Catch:{ all -> 0x07ce }
            java.util.Iterator r15 = r33.iterator()     // Catch:{ all -> 0x07ce }
        L_0x02ce:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x0312
            java.lang.Object r8 = r15.next()     // Catch:{ all -> 0x07ce }
            X.3T1 r8 = (X.AnonymousClass3T1) r8     // Catch:{ all -> 0x07ce }
            X.0xM r11 = r6.A06     // Catch:{ all -> 0x07ce }
            r1 = 0
            r0 = 1
            r11.A0o(r8, r0, r1)     // Catch:{ all -> 0x07ce }
            com.whatsapp.jid.UserJid r1 = r8.A0L()     // Catch:{ all -> 0x07ce }
            X.3Qa r0 = r8.A1J     // Catch:{ all -> 0x07ce }
            boolean r0 = r0.A02     // Catch:{ all -> 0x07ce }
            if (r0 != 0) goto L_0x02ce
            if (r1 == 0) goto L_0x02ce
            boolean r0 = r1 instanceof X.C177638e7     // Catch:{ all -> 0x07ce }
            if (r0 != 0) goto L_0x02ce
            int r10 = r10 + 1
            java.lang.String r11 = r1.user     // Catch:{ all -> 0x07ce }
            r0 = r30
            r0.add(r11)     // Catch:{ all -> 0x07ce }
            X.16E r0 = r6.A0G     // Catch:{ all -> 0x07ce }
            X.3Sz r0 = r0.A08(r1)     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x02ce
            boolean r0 = X.C203359nq.A0B(r0, r8)     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x02ce
            int r9 = r9 + 1
            java.lang.String r1 = r1.user     // Catch:{ all -> 0x07ce }
            r0 = r29
            r0.add(r1)     // Catch:{ all -> 0x07ce }
            goto L_0x02ce
        L_0x0312:
            r33.clear()     // Catch:{ all -> 0x07ce }
            java.lang.String r11 = X.C56872x1.A02     // Catch:{ all -> 0x07ce }
            r0 = 2
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x07ce }
            r1 = r37
            r0 = r35
            long r0 = r1.A08(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x07ce }
            r0 = 0
            r8[r0] = r1     // Catch:{ all -> 0x07ce }
            long r0 = r7.A1O     // Catch:{ all -> 0x07ce }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x07ce }
            r0 = 1
            r8[r0] = r1     // Catch:{ all -> 0x07ce }
            java.lang.String r1 = "GET_STATUS_MESSAGES_WITH_REF_GREATER_SQL"
            r0 = r38
            android.database.Cursor r34 = r0.A09(r11, r1, r8)     // Catch:{ all -> 0x07ce }
            goto L_0x00f0
        L_0x033c:
            r34.close()     // Catch:{ all -> 0x07ce }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r1.<init>()     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses time limit:"
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r1.append(r2)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = " total:"
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r1.append(r12)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = " archived:"
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            int r0 = r31.size()     // Catch:{ all -> 0x07ce }
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r0 = r28
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r1.append(r13)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = " last batch:"
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            int r0 = r33.size()     // Catch:{ all -> 0x07ce }
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x07ce }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
            java.util.Iterator r12 = r33.iterator()     // Catch:{ all -> 0x07ce }
        L_0x037f:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x03d9
            java.lang.Object r7 = r12.next()     // Catch:{ all -> 0x07ce }
            X.3T1 r7 = (X.AnonymousClass3T1) r7     // Catch:{ all -> 0x07ce }
            X.3Qa r11 = r7.A1J     // Catch:{ all -> 0x07ce }
            boolean r8 = r11.A02     // Catch:{ all -> 0x07ce }
            if (r8 == 0) goto L_0x03a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r1.<init>()     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/deletingSelfStatus: "
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r1.append(r11)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x07ce }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
        L_0x03a5:
            X.0xM r11 = r6.A06     // Catch:{ all -> 0x07ce }
            r1 = 0
            r0 = 1
            r11.A0o(r7, r0, r1)     // Catch:{ all -> 0x07ce }
            com.whatsapp.jid.UserJid r1 = r7.A0L()     // Catch:{ all -> 0x07ce }
            if (r8 != 0) goto L_0x037f
            if (r1 == 0) goto L_0x037f
            boolean r0 = r1 instanceof X.C177638e7     // Catch:{ all -> 0x07ce }
            if (r0 != 0) goto L_0x037f
            int r10 = r10 + 1
            java.lang.String r8 = r1.user     // Catch:{ all -> 0x07ce }
            r0 = r30
            r0.add(r8)     // Catch:{ all -> 0x07ce }
            X.16E r0 = r6.A0G     // Catch:{ all -> 0x07ce }
            X.3Sz r0 = r0.A08(r1)     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x037f
            boolean r0 = X.C203359nq.A0B(r0, r7)     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x037f
            int r9 = r9 + 1
            java.lang.String r1 = r1.user     // Catch:{ all -> 0x07ce }
            r0 = r29
            r0.add(r1)     // Catch:{ all -> 0x07ce }
            goto L_0x037f
        L_0x03d9:
            X.16G r7 = r6.A0M     // Catch:{ all -> 0x07ce }
            r1 = r30
            r0 = r29
            r7.A01(r1, r0, r10, r9)     // Catch:{ all -> 0x07ce }
            java.util.Iterator r9 = r32.iterator()     // Catch:{ all -> 0x07ce }
        L_0x03e6:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x0414
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x07ce }
            X.3T1 r8 = (X.AnonymousClass3T1) r8     // Catch:{ all -> 0x07ce }
            X.3Qa r7 = r8.A1J     // Catch:{ all -> 0x07ce }
            boolean r0 = r7.A02     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x040c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r1.<init>()     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/deletingSelfArchivedStatus: "
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r1.append(r7)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x07ce }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
        L_0x040c:
            X.0xM r7 = r6.A06     // Catch:{ all -> 0x07ce }
            r1 = 0
            r0 = 1
            r7.A0p(r8, r0, r1, r0)     // Catch:{ all -> 0x07ce }
            goto L_0x03e6
        L_0x0414:
            java.lang.String r1 = "earliest_status_time"
            r0 = r36
            r0.A03(r1, r4)     // Catch:{ all -> 0x07ce }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r1.<init>()     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses new earliest time:"
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r1.append(r4)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = " active jids:"
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            int r0 = r14.size()     // Catch:{ all -> 0x07ce }
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x07ce }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
            java.util.Set r0 = r14.entrySet()     // Catch:{ all -> 0x07ce }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x07ce }
        L_0x0443:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x0597
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x07ce }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ all -> 0x07ce }
            java.lang.Object r5 = r9.getKey()     // Catch:{ all -> 0x07ce }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x07ce }
            X.16E r7 = r6.A0G     // Catch:{ all -> 0x07ce }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x07ce }
            com.whatsapp.jid.UserJid r0 = X.C222813r.A00(r5)     // Catch:{ all -> 0x07ce }
            X.3Sz r4 = r7.A08(r0)     // Catch:{ all -> 0x07ce }
            if (r4 == 0) goto L_0x04f1
            X.13z r0 = X.C223613z.A00     // Catch:{ all -> 0x07ce }
            if (r5 != r0) goto L_0x047b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r1.<init>()     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses activeStatuses contains MeJid, StatusInfo: "
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r1.append(r4)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x07ce }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
        L_0x047b:
            int r1 = r4.A02()     // Catch:{ all -> 0x07ce }
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x07ce }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x07ce }
            int r0 = r0.intValue()     // Catch:{ all -> 0x07ce }
            if (r1 == r0) goto L_0x0443
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r1.<init>()     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses inconsistency for "
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r1.append(r5)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = " old count:"
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            int r0 = r4.A02()     // Catch:{ all -> 0x07ce }
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = " ("
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            int r0 = r4.A03()     // Catch:{ all -> 0x07ce }
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = ") new:"
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x07ce }
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x07ce }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x07ce }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x07ce }
            int r0 = r0.intValue()     // Catch:{ all -> 0x07ce }
            r4.A08(r0)     // Catch:{ all -> 0x07ce }
            int r1 = r4.A03()     // Catch:{ all -> 0x07ce }
            int r0 = r4.A02()     // Catch:{ all -> 0x07ce }
            if (r1 <= r0) goto L_0x04e2
            int r0 = r4.A02()     // Catch:{ all -> 0x07ce }
            monitor-enter(r4)     // Catch:{ all -> 0x07ce }
            r4.A01 = r0     // Catch:{ all -> 0x0594 }
            monitor-exit(r4)     // Catch:{ all -> 0x07ce }
        L_0x04e2:
            int r1 = r4.A03()     // Catch:{ all -> 0x07ce }
            int r0 = r4.A02()     // Catch:{ all -> 0x07ce }
            r7.A0E(r5, r1, r0)     // Catch:{ all -> 0x07ce }
            r22 = 1
            goto L_0x0443
        L_0x04f1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r1.<init>()     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses no status info for "
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r1.append(r5)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = " with "
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x07ce }
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = " statuses"
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x07ce }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
            X.0wN r8 = r6.A00     // Catch:{ all -> 0x07ce }
            java.lang.String r4 = "statusmsgstore/deleteoldstatuses no status info"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r1.<init>()     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = "statusStoreSize="
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.util.Map r0 = r7.A0C()     // Catch:{ all -> 0x07ce }
            int r0 = r0.size()     // Catch:{ all -> 0x07ce }
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = ", activeStatusesSize="
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            int r0 = r14.size()     // Catch:{ all -> 0x07ce }
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = ", activeStatus="
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x07ce }
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x07ce }
            r0 = 1
            r8.A0E(r4, r1, r0)     // Catch:{ all -> 0x07ce }
            if (r5 == 0) goto L_0x0443
            X.0yC r4 = r6.A0J     // Catch:{ all -> 0x07ce }
            r1 = 6640(0x19f0, float:9.305E-42)
            X.0yV r0 = X.C21000yV.A02     // Catch:{ all -> 0x07ce }
            boolean r0 = X.C20800yB.A01(r0, r4, r1)     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x0443
            X.3Sz r1 = new X.3Sz     // Catch:{ all -> 0x07ce }
            r0 = r40
            r1.<init>((X.C19970wo) r0, (com.whatsapp.jid.UserJid) r5)     // Catch:{ all -> 0x07ce }
            X.C18740tg.A00()     // Catch:{ all -> 0x07ce }
            com.whatsapp.jid.UserJid r0 = r1.A09     // Catch:{ all -> 0x07ce }
            java.util.ArrayList r0 = r6.A03(r0)     // Catch:{ all -> 0x07ce }
            X.3Sz r4 = A00(r1, r6, r0)     // Catch:{ all -> 0x07ce }
            if (r4 == 0) goto L_0x0443
            r7.A0D(r4, r5)     // Catch:{ all -> 0x07ce }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r1.<init>()     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/regenerating status info for "
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r1.append(r5)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = " statusInfo: "
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r1.append(r4)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x07ce }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
            goto L_0x0443
        L_0x0594:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x07ce }
            throw r0     // Catch:{ all -> 0x07ce }
        L_0x0597:
            X.16E r5 = r6.A0G     // Catch:{ all -> 0x07ce }
            java.util.Map r9 = r5.A0C()     // Catch:{ all -> 0x07ce }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x07ce }
            r8.<init>()     // Catch:{ all -> 0x07ce }
            java.util.Set r0 = r9.keySet()     // Catch:{ all -> 0x07ce }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x07ce }
        L_0x05aa:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x05e2
            java.lang.Object r4 = r7.next()     // Catch:{ all -> 0x07ce }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x07ce }
            boolean r0 = r14.containsKey(r4)     // Catch:{ all -> 0x07ce }
            if (r0 != 0) goto L_0x05aa
            r8.add(r4)     // Catch:{ all -> 0x07ce }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ce }
            r1.<init>()     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses delete inactive UserJid: "
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            r1.append(r4)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = " StatusInfo: "
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.Object r0 = r9.get(r4)     // Catch:{ all -> 0x07ce }
            r1.append(r0)     // Catch:{ all -> 0x07ce }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x07ce }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
            r22 = 1
            goto L_0x05aa
        L_0x05e2:
            java.util.Iterator r4 = r8.iterator()     // Catch:{ all -> 0x07ce }
        L_0x05e6:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x07ce }
            if (r0 == 0) goto L_0x05ff
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x07ce }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x07ce }
            X.13z r0 = X.C223613z.A00     // Catch:{ all -> 0x07ce }
            if (r1 != r0) goto L_0x05fb
            java.lang.String r0 = "deleting MeJid status from StatusMessageStore/deleteOldStatusesInternal"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x07ce }
        L_0x05fb:
            r5.A06(r1)     // Catch:{ all -> 0x07ce }
            goto L_0x05e6
        L_0x05ff:
            r23.A00()     // Catch:{ all -> 0x07ce }
            r23.close()     // Catch:{ all -> 0x07d8 }
            r24.close()
            if (r42 == 0) goto L_0x07a5
            X.0y0 r8 = r6.A01
            X.3BP r0 = r8.A08()
            java.io.File r1 = r0.A0M
            r0 = 0
            X.C20690y0.A07(r1, r0)
            java.io.File[] r7 = r1.listFiles()
            if (r7 == 0) goto L_0x07a5
            X.1M0 r16 = r39.A05()
            int r5 = r7.length     // Catch:{ all -> 0x079d }
            r4 = 0
        L_0x0622:
            if (r4 >= r5) goto L_0x07a2
            r9 = r7[r4]     // Catch:{ all -> 0x079d }
            r0 = r20
            boolean r0 = r0.contains(r9)     // Catch:{ all -> 0x079d }
            if (r0 != 0) goto L_0x0785
            long r10 = r9.lastModified()     // Catch:{ all -> 0x079d }
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0785
            X.1DF r10 = r6.A09     // Catch:{ all -> 0x079d }
            X.C18740tg.A00()     // Catch:{ all -> 0x079d }
            java.lang.String r1 = X.AnonymousClass6UG.A00(r9)     // Catch:{ IOException -> 0x0640 }
            goto L_0x064b
        L_0x0640:
            r1 = move-exception
            java.lang.String r0 = "mediamessagestore/getMediaMessagesForFile/could not get file hash;"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x079d }
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x079d }
            goto L_0x0650
        L_0x064b:
            r0 = 0
            java.util.ArrayList r12 = r10.A0C(r0, r9, r1)     // Catch:{ all -> 0x079d }
        L_0x0650:
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x079d }
            java.lang.String r10 = "statusmsgstore/deleteoldstatuses/cleanup/failed to delete "
            if (r0 == 0) goto L_0x069a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x079d }
            r11.<init>()     // Catch:{ all -> 0x079d }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/cleanup/ delete "
            r11.append(r0)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x079d }
            r11.append(r0)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = " "
            r11.append(r0)     // Catch:{ all -> 0x079d }
            long r0 = r9.lastModified()     // Catch:{ all -> 0x079d }
            r11.append(r0)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x079d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x079d }
            boolean r0 = r9.delete()     // Catch:{ all -> 0x079d }
            if (r0 != 0) goto L_0x0785
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x079d }
            r1.<init>()     // Catch:{ all -> 0x079d }
            r1.append(r10)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x079d }
            r1.append(r0)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x079d }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x079d }
            goto L_0x0785
        L_0x069a:
            java.util.Iterator r0 = r12.iterator()     // Catch:{ all -> 0x079d }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x079d }
            X.3T1 r0 = (X.AnonymousClass3T1) r0     // Catch:{ all -> 0x079d }
            X.0wg r11 = r6.A0H     // Catch:{ all -> 0x079d }
            X.1Gl r1 = X.AnonymousClass6Y1.A02(r0)     // Catch:{ all -> 0x079d }
            int r0 = r0.A09     // Catch:{ all -> 0x079d }
            java.io.File r11 = X.AnonymousClass1GW.A0F(r8, r11, r1, r9, r0)     // Catch:{ all -> 0x079d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x079d }
            r1.<init>()     // Catch:{ all -> 0x079d }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/cleanup "
            r1.append(r0)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x079d }
            r1.append(r0)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = " found in "
            r1.append(r0)     // Catch:{ all -> 0x079d }
            int r0 = r12.size()     // Catch:{ all -> 0x079d }
            r1.append(r0)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = " message(s), rename to "
            r1.append(r0)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = r11.getAbsolutePath()     // Catch:{ all -> 0x079d }
            r1.append(r0)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x079d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x079d }
            r8.A0e(r9, r11)     // Catch:{ IOException -> 0x0761 }
            X.71s r15 = r16.B1k()     // Catch:{ all -> 0x079d }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0793 }
        L_0x06eb:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0793 }
            if (r0 == 0) goto L_0x070a
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x0793 }
            X.3T1 r1 = (X.AnonymousClass3T1) r1     // Catch:{ all -> 0x0793 }
            boolean r0 = r1 instanceof X.AnonymousClass2bU     // Catch:{ all -> 0x0793 }
            if (r0 == 0) goto L_0x06eb
            r0 = r1
            X.2bU r0 = (X.AnonymousClass2bU) r0     // Catch:{ all -> 0x0793 }
            X.3Qj r0 = r0.A01     // Catch:{ all -> 0x0793 }
            if (r0 == 0) goto L_0x06eb
            r0.A0I = r11     // Catch:{ all -> 0x0793 }
            X.0xM r0 = r6.A06     // Catch:{ all -> 0x0793 }
            r0.A0k(r1)     // Catch:{ all -> 0x0793 }
            goto L_0x06eb
        L_0x070a:
            X.1Ay r0 = r6.A0A     // Catch:{ all -> 0x0793 }
            java.lang.String r14 = r9.getAbsolutePath()     // Catch:{ all -> 0x0793 }
            java.lang.String r1 = r11.getAbsolutePath()     // Catch:{ all -> 0x0793 }
            X.12P r0 = r0.A00     // Catch:{ all -> 0x0793 }
            X.1M0 r11 = r0.A05()     // Catch:{ all -> 0x0793 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x0789 }
            r12.<init>()     // Catch:{ all -> 0x0789 }
            java.lang.String r0 = "path"
            r12.put(r0, r1)     // Catch:{ all -> 0x0789 }
            X.14e r1 = r11.A02     // Catch:{ all -> 0x0789 }
            java.lang.String r25 = "media_refs"
            java.lang.String r26 = "path = ?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0789 }
            r13 = 0
            r0[r13] = r14     // Catch:{ all -> 0x0789 }
            java.lang.String r27 = "RENAME_MEDIA_REF_SQL"
            r23 = r1
            r24 = r12
            r28 = r0
            r23.A01(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0789 }
            r11.close()     // Catch:{ all -> 0x0793 }
            r15.A00()     // Catch:{ all -> 0x0793 }
            r15.close()     // Catch:{ all -> 0x079d }
            boolean r0 = r9.delete()     // Catch:{ all -> 0x079d }
            if (r0 != 0) goto L_0x0785
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x079d }
            r1.<init>()     // Catch:{ all -> 0x079d }
            r1.append(r10)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x079d }
            r1.append(r0)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x079d }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x079d }
            goto L_0x0785
        L_0x0761:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x079d }
            r1.<init>()     // Catch:{ all -> 0x079d }
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses/cleanup/failed to copy from "
            r1.append(r0)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = r9.getAbsolutePath()     // Catch:{ all -> 0x079d }
            r1.append(r0)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = r11.getAbsolutePath()     // Catch:{ all -> 0x079d }
            r1.append(r0)     // Catch:{ all -> 0x079d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x079d }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x079d }
        L_0x0785:
            int r4 = r4 + 1
            goto L_0x0622
        L_0x0789:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x078e }
            goto L_0x0792
        L_0x078e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0793 }
        L_0x0792:
            throw r1     // Catch:{ all -> 0x0793 }
        L_0x0793:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0798 }
            goto L_0x079c
        L_0x0798:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x079d }
        L_0x079c:
            throw r1     // Catch:{ all -> 0x079d }
        L_0x079d:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x07dd }
            throw r1
        L_0x07a2:
            r16.close()
        L_0x07a5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "statusmsgstore/deleteoldstatuses time spent:"
            r2.append(r0)
            long r0 = r21.A01()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r22 == 0) goto L_0x07cd
            X.1DQ r0 = r6.A07
            android.os.Handler r2 = r0.A01
            r1 = 39
            X.1j6 r0 = new X.1j6
            r0.<init>(r6, r1)
            r2.post(r0)
        L_0x07cd:
            return
        L_0x07ce:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x07d3 }
            goto L_0x07d7
        L_0x07d3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x07d8 }
        L_0x07d7:
            throw r1     // Catch:{ all -> 0x07d8 }
        L_0x07d8:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x07dd }
            throw r1
        L_0x07dd:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HT.A05(boolean):void");
    }
}
