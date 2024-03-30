package X;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.SystemClock;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1gO  reason: invalid class name and case insensitive filesystem */
public class C34061gO implements AnonymousClass1NK {
    public List A00;
    public final C26021Io A01;
    public final AnonymousClass1NG A02;
    public final AnonymousClass1MK A03;
    public final AnonymousClass16D A04;
    public final AnonymousClass171 A05;
    public final C27731Pn A06;
    public final C21060yb A07;
    public final C19630wG A08;
    public final C25271Fq A09;
    public final C19420v0 A0A;
    public final C18820ts A0B;
    public final C24381Cf A0C;
    public final C20810yC A0D;
    public final AnonymousClass1CR A0E;
    public final AnonymousClass1Q0 A0F;
    public final C34071gP A0G;
    public final AnonymousClass17Y A0H;
    public final AnonymousClass1HJ A0I;
    public final AnonymousClass12P A0J;
    public final C20350xQ A0K;
    public final AnonymousClass1C6 A0L;
    public final C19770wU A0M;

    public void A03() {
        StringBuilder sb = new StringBuilder();
        sb.append("missedcallnotification/clearNotification updateHash=");
        sb.append(true);
        Log.i(sb.toString());
        this.A09.A03(4, "MissedCallNotification1");
        C19420v0 r3 = this.A0A;
        C19420v0.A00(r3).putString("dismissed_call_notification_hash", ((SharedPreferences) r3.A00.get()).getString("last_call_notification_hash", (String) null)).apply();
    }

    public /* synthetic */ void BSa(C107265Nh r1) {
    }

    public /* synthetic */ void BSj(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public /* synthetic */ void BSl(C107265Nh r1) {
    }

    public /* synthetic */ void BSm(AnonymousClass11F r1, CallState callState, String str) {
    }

    public /* synthetic */ void Bgj() {
    }

    private String A00(C107265Nh r7) {
        if (r7.A0D == null) {
            return null;
        }
        boolean z = false;
        if (r7.A08 == 2) {
            z = true;
        }
        GroupJid groupJid = r7.A0D;
        AnonymousClass16D r3 = this.A04;
        AnonymousClass171 r2 = this.A05;
        AnonymousClass141 A012 = AnonymousClass3UL.A01(r3, this.A0K, groupJid, this.A0L, z);
        if (A012 != null) {
            return r2.A0Q(A012, -1);
        }
        return null;
    }

    public static synchronized void A01(C34061gO r19) {
        ArrayList arrayList;
        String str;
        Cursor A092;
        C34061gO r4 = r19;
        synchronized (r4) {
            if (r4.A00 == null) {
                long j = ((SharedPreferences) r4.A0A.A00.get()).getLong("first_missed_call", 0);
                if (j > 0) {
                    AnonymousClass1HJ r1 = r4.A0I;
                    arrayList = new ArrayList();
                    ReentrantReadWriteLock reentrantReadWriteLock = r1.A0K;
                    reentrantReadWriteLock.readLock().lock();
                    try {
                        AnonymousClass1HK r13 = r1.A07;
                        ArrayList arrayList2 = new ArrayList();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        AnonymousClass1M0 A042 = r13.A04.get();
                        try {
                            C224114e r12 = A042.A02;
                            boolean A012 = C20800yB.A01(C21000yV.A02, r13.A05, 6136);
                            StringBuilder sb = new StringBuilder();
                            sb.append("SELECT _id, call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id, call_type, offer_silence_reason, scheduled_id FROM call_log WHERE call_result = 2 AND from_me = 0 AND timestamp >= ?");
                            if (A012) {
                                str = " ORDER BY timestamp DESC";
                            } else {
                                str = " ORDER BY call_log._id DESC";
                            }
                            sb.append(str);
                            sb.append(" LIMIT 100");
                            Cursor A093 = r12.A09(sb.toString(), "GET_MISSED_CALL_LOG_SQL", new String[]{Long.toString(j)});
                            try {
                                int columnIndexOrThrow = A093.getColumnIndexOrThrow("_id");
                                if (A093.moveToLast()) {
                                    do {
                                        A092 = r12.A09("SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id", "GET_CALL_LOG_PARTICIPANTS_BY_CALL_LOG_MISSED_CALLS", new String[]{Long.toString(A093.getLong(columnIndexOrThrow))});
                                        C107265Nh A013 = AnonymousClass1HK.A01(A093, A092, r13);
                                        if (A013 != null) {
                                            arrayList2.add(A013);
                                        }
                                        if (A092 != null) {
                                            A092.close();
                                        }
                                    } while (A093.moveToPrevious());
                                }
                                A093.close();
                                A042.close();
                                r13.A01.A01("CallLogStore/getMissedCalls", SystemClock.uptimeMillis() - uptimeMillis);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("CallLogStore/getMissedCalls/size:");
                                sb2.append(arrayList2.size());
                                Log.i(sb2.toString());
                                arrayList.addAll(arrayList2);
                                reentrantReadWriteLock.readLock().unlock();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("CallsMessageStore/getMissedCalls/size:");
                                sb3.append(arrayList.size());
                                Log.i(sb3.toString());
                            } catch (Throwable th) {
                                if (A093 != null) {
                                    A093.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            A042.close();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        reentrantReadWriteLock.readLock().unlock();
                        throw th3;
                    }
                } else {
                    arrayList = new ArrayList();
                }
                r4.A00 = arrayList;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("missedcallnotification/init count:");
                sb4.append(arrayList.size());
                sb4.append(" timestamp:");
                sb4.append(j);
                Log.i(sb4.toString());
            }
        }
        return;
        throw th;
    }

    public void A04(boolean z) {
        this.A0M.Boy(new C35231iM(7, (Object) this, z));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0538, code lost:
        r0 = new long[]{0, 300, 200, 300, 200};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x053c, code lost:
        if (r4 == 1) goto L_0x0544;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x053e, code lost:
        r0 = {0, 750, 250, 750, 250} // fill-array;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0541, code lost:
        r10.vibrate = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0544, code lost:
        r0 = {0, 300, 200, 300, 200} // fill-array;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r6.A0K == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        if (r6.A0K != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a1, code lost:
        if (r6.A0M() == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ac, code lost:
        if (r6.A08 != 2) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b7, code lost:
        if (r6.A0M() != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c1, code lost:
        if (r6.A0O() == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012e, code lost:
        if (r11 != false) goto L_0x0130;
     */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0469  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A05(boolean r32) {
        /*
            r31 = this;
            r5 = r31
            X.12P r0 = r5.A0J
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x003c
            A01(r5)
            monitor-enter(r5)
            java.util.List r0 = r5.A00     // Catch:{ all -> 0x0018 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0018 }
            r7.<init>(r0)     // Catch:{ all -> 0x0018 }
            monitor-exit(r5)     // Catch:{ all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0018 }
            throw r0
        L_0x001b:
            boolean r0 = r7.isEmpty()
            r19 = r32
            if (r0 == 0) goto L_0x003d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "missedcallnotification/update cancel "
            r1.append(r0)
            r0 = r19
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A03()
        L_0x003c:
            return
        L_0x003d:
            r4 = r19
            X.0wG r0 = r5.A08
            android.content.Context r3 = r0.A00
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.Iterator r16 = r7.iterator()
            r13 = -9223372036854775808
            r12 = 0
            r11 = 1
            r23 = 1
            r22 = 0
            r21 = 1
            r20 = 1
            r15 = 1
            r10 = 1
        L_0x005f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r6 = r16.next()
            X.5Nh r6 = (X.C107265Nh) r6
            com.whatsapp.jid.GroupJid r0 = r6.A0D
            if (r0 == 0) goto L_0x00e6
            java.lang.String r0 = r5.A00(r6)
            if (r0 == 0) goto L_0x00e6
            com.whatsapp.jid.GroupJid r0 = r6.A0D
            r9.add(r0)
            r1 = 1
        L_0x007b:
            if (r22 != 0) goto L_0x0087
            boolean r0 = r6.A0M()
            if (r0 == 0) goto L_0x0087
            if (r1 != 0) goto L_0x0087
            r22 = 1
        L_0x0087:
            if (r23 == 0) goto L_0x008f
            boolean r0 = r6.A0K
            r23 = 1
            if (r0 != 0) goto L_0x0091
        L_0x008f:
            r23 = 0
        L_0x0091:
            if (r11 == 0) goto L_0x0098
            boolean r0 = r6.A0K
            r11 = 1
            if (r0 == 0) goto L_0x0099
        L_0x0098:
            r11 = 0
        L_0x0099:
            if (r21 == 0) goto L_0x00a3
            boolean r0 = r6.A0M()
            r21 = 1
            if (r0 != 0) goto L_0x00a5
        L_0x00a3:
            r21 = 0
        L_0x00a5:
            if (r20 == 0) goto L_0x00ae
            int r1 = r6.A08
            r0 = 2
            r20 = 1
            if (r1 == r0) goto L_0x00b0
        L_0x00ae:
            r20 = 0
        L_0x00b0:
            if (r10 == 0) goto L_0x00b9
            boolean r0 = r6.A0M()
            r10 = 1
            if (r0 == 0) goto L_0x00ba
        L_0x00b9:
            r10 = 0
        L_0x00ba:
            if (r15 == 0) goto L_0x00c3
            boolean r0 = r6.A0O()
            r15 = 1
            if (r0 != 0) goto L_0x00c4
        L_0x00c3:
            r15 = 0
        L_0x00c4:
            X.6by r1 = r6.A04
            java.lang.String r0 = r1.A02
            r8.append(r0)
            com.whatsapp.jid.UserJid r0 = r1.A01
            java.lang.String r0 = r0.getRawString()
            r8.append(r0)
            int r0 = r1.A00
            r8.append(r0)
            long r0 = r6.A01
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x005f
            r13 = r0
            boolean r12 = r6.A0O()
            goto L_0x005f
        L_0x00e6:
            X.6by r0 = r6.A04
            com.whatsapp.jid.UserJid r0 = r0.A01
            r9.add(r0)
            r1 = 0
            goto L_0x007b
        L_0x00ef:
            java.lang.String r0 = r8.toString()
            java.lang.String r6 = X.C18750th.A04(r0)
            X.0v0 r0 = r5.A0A
            r30 = r0
            X.005 r0 = r0.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "dismissed_call_notification_hash"
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)
            if (r6 == 0) goto L_0x0127
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0127
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "missedcallnotification/same "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0127:
            if (r12 == 0) goto L_0x012a
            r4 = 1
        L_0x012a:
            if (r23 != 0) goto L_0x0130
            r16 = 1
            if (r11 == 0) goto L_0x0132
        L_0x0130:
            r16 = 0
        L_0x0132:
            java.lang.Class<com.whatsapp.notification.MissedCallNotificationDismissedReceiver> r0 = com.whatsapp.notification.MissedCallNotificationDismissedReceiver.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r3, r0)
            r1 = 4
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r12 = X.C65743Th.A01(r3, r1, r2, r0)
            android.content.Intent r8 = X.AnonymousClass190.A04(r3)
            int r0 = r7.size()
            int r0 = r0 + -1
            java.lang.Object r11 = r7.get(r0)
            X.5Nh r11 = (X.C107265Nh) r11
            X.6by r0 = r11.A04
            com.whatsapp.jid.UserJid r2 = r0.A01
            java.lang.String r1 = r2.getRawString()
            java.lang.String r0 = "attributed_call_jid"
            r8.putExtra(r0, r1)
            r1 = 3
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = X.C65743Th.A00(r3, r1, r8, r0)
            X.1CR r8 = r5.A0E
            java.lang.String r0 = r2.getRawString()
            X.3LI r18 = X.AnonymousClass1CR.A02(r8, r0)
            X.0Yy r2 = X.C20600xp.A02(r3)
            java.lang.String r17 = "call"
            r0 = r17
            r2.A0L = r0
            r0 = 1
            r2.A09 = r0
            android.app.Notification r10 = r2.A0B
            r10.deleteIntent = r12
            r2.A0D = r1
            r2.A0I(r0)
            long r0 = r11.A01
            r2.A09(r0)
            r0 = 2131231572(0x7f080354, float:1.8079229E38)
            r10.icon = r0
            X.0yb r11 = r5.A07
            X.0ya r12 = r11.A0O()
            if (r12 != 0) goto L_0x019b
            java.lang.String r0 = "missedcallnotification/update cr == null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x019b:
            java.util.Iterator r14 = r9.iterator()
        L_0x019f:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01cc
            java.lang.Object r13 = r14.next()
            X.11F r13 = (X.AnonymousClass11F) r13
            boolean r0 = r13 instanceof com.whatsapp.jid.UserJid
            X.16D r1 = r5.A04
            if (r0 == 0) goto L_0x01c7
            X.141 r0 = r1.A0D(r13)
        L_0x01b5:
            if (r12 == 0) goto L_0x019f
            if (r0 == 0) goto L_0x019f
            android.net.Uri r0 = r1.A04(r0, r12)
            if (r0 == 0) goto L_0x019f
            java.lang.String r0 = r0.toString()
            r2.A0H(r0)
            goto L_0x019f
        L_0x01c7:
            X.141 r0 = r1.A0A(r13)
            goto L_0x01b5
        L_0x01cc:
            if (r4 != 0) goto L_0x0548
            X.1MK r0 = r5.A03
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x050a
            java.lang.String r1 = r18.A07()
        L_0x01da:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0507
            android.net.Uri r25 = android.net.Uri.parse(r1)
            if (r25 == 0) goto L_0x0507
            X.1Q0 r1 = r5.A0F
            X.1gP r0 = r5.A0G
            r4 = 0
            r24 = r3
            r26 = r2
            r27 = r11
            r28 = r1
            r29 = r0
            X.C20600xp.A07(r24, r25, r26, r27, r28, r29)
        L_0x01f8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "missedcallnotification/update count:"
            r1.append(r0)
            int r0 = r7.size()
            r1.append(r0)
            java.lang.String r0 = " contacts:"
            r1.append(r0)
            int r0 = r9.size()
            r1.append(r0)
            java.lang.String r0 = " quiet:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = r9.size()
            r0 = 1
            if (r1 != r0) goto L_0x0439
            if (r22 != 0) goto L_0x0439
            if (r15 != 0) goto L_0x04e7
            java.util.Iterator r0 = r9.iterator()
            java.lang.Object r12 = r0.next()
            X.11F r12 = (X.AnonymousClass11F) r12
            boolean r15 = r12 instanceof com.whatsapp.jid.UserJid
            X.16D r14 = r5.A04
            if (r15 == 0) goto L_0x0433
            X.141 r11 = r14.A0D(r12)
        L_0x0243:
            int r1 = r7.size()
            r0 = 1
            if (r1 != r0) goto L_0x0404
            if (r21 == 0) goto L_0x03f6
            if (r23 == 0) goto L_0x03ec
            r10 = 2131895653(0x7f122565, float:1.9426145E38)
        L_0x0251:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            X.171 r13 = r5.A05
            r1 = 0
            java.lang.Object r0 = r7.get(r1)
            X.5Nh r0 = (X.C107265Nh) r0
            X.6by r0 = r0.A04
            com.whatsapp.jid.UserJid r0 = r0.A01
            X.141 r0 = r14.A0D(r0)
            java.lang.String r0 = r13.A0H(r0)
            r9[r1] = r0
            java.lang.String r0 = r3.getString(r10, r9)
        L_0x026e:
            r2.A0E(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 17104901(0x1050005, float:2.4428256E-38)
            int r9 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 17104902(0x1050006, float:2.442826E-38)
            int r1 = r1.getDimensionPixelSize(r0)
            if (r11 == 0) goto L_0x02af
            X.1Pn r0 = r5.A06
            android.graphics.Bitmap r0 = r0.A02(r3, r11, r9, r1)
            if (r0 == 0) goto L_0x0294
            r2.A0A(r0)
        L_0x0294:
            X.171 r0 = r5.A05
            java.lang.String r10 = r0.A0H(r11)
            if (r23 == 0) goto L_0x03e2
            r9 = 2131895653(0x7f122565, float:1.9426145E38)
        L_0x029f:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r10
            java.lang.String r0 = r3.getString(r9, r1)
            r2.A0G(r0)
            r2.A0F(r10)
        L_0x02af:
            if (r15 == 0) goto L_0x03dc
            r25 = 0
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r23)
            r1 = 1
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r12)
            r24 = r3
            r28 = r25
            r29 = r0
            android.content.Intent r12 = X.AnonymousClass190.A0z(r24, r25, r26, r27, r28, r29)
            java.lang.String r0 = X.C114145gi.A01
            r12.setAction(r0)
            java.lang.String r0 = "fromCallNotification"
            r12.putExtra(r0, r1)
            r0 = 3
            r13 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r10 = X.C65743Th.A00(r3, r0, r12, r13)
        L_0x02df:
            X.190 r0 = new X.190
            r0.<init>()
            android.content.Intent r1 = r0.A1W(r3, r11)
            java.lang.String r0 = "MissedCallNotification"
            X.AnonymousClass3M9.A02(r1, r0)
            java.lang.String r0 = "fromCallNotification"
            r9 = 1
            android.content.Intent r1 = r1.putExtra(r0, r9)
            java.lang.String r0 = "show_keyboard"
            android.content.Intent r1 = r1.putExtra(r0, r9)
            r0 = 3
            android.app.PendingIntent r9 = X.C65743Th.A00(r3, r0, r1, r13)
            if (r10 == 0) goto L_0x034d
            r1 = 2131231779(0x7f080423, float:1.8079649E38)
            if (r23 == 0) goto L_0x0309
            r1 = 2131231867(0x7f08047b, float:1.8079827E38)
        L_0x0309:
            r0 = 2131891102(0x7f12139e, float:1.9416915E38)
            java.lang.String r0 = r3.getString(r0)
            r2.A08(r1, r0, r10)
            boolean r0 = com.whatsapp.notification.DirectReplyService.A01()
            if (r0 == 0) goto L_0x03cd
            java.lang.String r13 = "com.whatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL"
            r1 = 0
            r0 = 1
            X.0Wx r1 = com.whatsapp.notification.DirectReplyService.A00(r3, r11, r13, r1, r0)
            java.util.ArrayList r0 = r2.A0Q
            r0.add(r1)
        L_0x0326:
            X.0yC r13 = r5.A0D
            r1 = 4346(0x10fa, float:6.09E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r13, r1)
            if (r0 == 0) goto L_0x034d
            X.1NG r13 = r5.A02
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r11.A06(r0)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 == 0) goto L_0x034d
            X.3IL r0 = r11.A0F
            if (r0 != 0) goto L_0x034d
            boolean r0 = r13.A0O(r1)
            if (r0 != 0) goto L_0x034d
            r0 = 23
            X.C20600xp.A08(r3, r2, r11, r0)
        L_0x034d:
            X.1Pn r1 = r5.A06
            r0 = 400(0x190, float:5.6E-43)
            android.graphics.Bitmap r13 = r1.A02(r3, r11, r0, r0)
            if (r13 == 0) goto L_0x0391
            X.0Ym r11 = new X.0Ym
            r11.<init>()
            r1 = 2
            int r0 = r11.A05
            r1 = r1 | r0
            r11.A05 = r1
            r11.A09 = r13
            if (r12 == 0) goto L_0x038e
            r12 = 2131232315(0x7f08063b, float:1.8080736E38)
            r0 = 2131891102(0x7f12139e, float:1.9416915E38)
            java.lang.String r0 = r3.getString(r0)
            X.0Wx r1 = new X.0Wx
            r1.<init>(r12, r0, r10)
            java.util.ArrayList r0 = r11.A0C
            r0.add(r1)
            r10 = 2131232317(0x7f08063d, float:1.808074E38)
            r0 = 2131891104(0x7f1213a0, float:1.9416919E38)
            java.lang.String r0 = r3.getString(r0)
            X.0Wx r1 = new X.0Wx
            r1.<init>(r10, r0, r9)
            java.util.ArrayList r0 = r11.A0C
            r0.add(r1)
        L_0x038e:
            r11.A04(r2)
        L_0x0391:
            X.0Yy r9 = X.C20600xp.A02(r3)
            r0 = r17
            r9.A0L = r0
            r10 = 1
            r9.A09 = r10
            r0 = 2131896300(0x7f1227ec, float:1.9427457E38)
            java.lang.String r0 = r3.getString(r0)
            r9.A0F(r0)
            X.0ts r12 = r5.A0B
            r11 = 2131755199(0x7f1000bf, float:1.914127E38)
            int r0 = r7.size()
            long r0 = (long) r0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r3 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r3 = 0
            r10[r3] = r7
            java.lang.String r0 = r12.A0L(r10, r11, r0)
            r9.A0E(r0)
            r1 = 2131231572(0x7f080354, float:1.8079229E38)
            android.app.Notification r0 = r9.A0B
            r0.icon = r1
            goto L_0x054e
        L_0x03cd:
            r1 = 2131234061(0x7f080d0d, float:1.8084277E38)
            r0 = 2131891104(0x7f1213a0, float:1.9416919E38)
            java.lang.String r0 = r3.getString(r0)
            r2.A08(r1, r0, r9)
            goto L_0x0326
        L_0x03dc:
            r12 = 0
            r13 = 134217728(0x8000000, float:3.85186E-34)
            r10 = 0
            goto L_0x02df
        L_0x03e2:
            r9 = 2131891103(0x7f12139f, float:1.9416917E38)
            if (r20 == 0) goto L_0x029f
            r9 = 2131891107(0x7f1213a3, float:1.9416925E38)
            goto L_0x029f
        L_0x03ec:
            r10 = 2131891103(0x7f12139f, float:1.9416917E38)
            if (r20 == 0) goto L_0x0251
            r10 = 2131891107(0x7f1213a3, float:1.9416925E38)
            goto L_0x0251
        L_0x03f6:
            r0 = 2131895848(0x7f122628, float:1.942654E38)
            if (r23 == 0) goto L_0x03fe
            r0 = 2131895651(0x7f122563, float:1.9426141E38)
        L_0x03fe:
            java.lang.String r0 = r3.getString(r0)
            goto L_0x026e
        L_0x0404:
            if (r16 == 0) goto L_0x0424
            r14 = 2131755199(0x7f1000bf, float:1.914127E38)
        L_0x0409:
            X.0ts r13 = r5.A0B
            int r0 = r7.size()
            long r0 = (long) r0
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            int r9 = r7.size()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)
            r9 = 0
            r10[r9] = r16
            java.lang.String r0 = r13.A0L(r10, r14, r0)
            goto L_0x026e
        L_0x0424:
            if (r23 == 0) goto L_0x042a
            r14 = 2131755407(0x7f10018f, float:1.9141692E38)
            goto L_0x0409
        L_0x042a:
            r14 = 2131755200(0x7f1000c0, float:1.9141273E38)
            if (r20 == 0) goto L_0x0409
            r14 = 2131755201(0x7f1000c1, float:1.9141275E38)
            goto L_0x0409
        L_0x0433:
            X.141 r11 = r14.A0A(r12)
            goto L_0x0243
        L_0x0439:
            if (r15 != 0) goto L_0x04e7
            if (r16 == 0) goto L_0x04d6
            r13 = 2131755199(0x7f1000bf, float:1.914127E38)
        L_0x0440:
            X.0ts r12 = r5.A0B
            int r0 = r7.size()
            long r0 = (long) r0
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            int r9 = r7.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r9 = 0
            r11[r9] = r10
            java.lang.String r0 = r12.A0L(r11, r13, r0)
        L_0x0459:
            r2.A0F(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int r11 = r7.size()
            r0 = 1
            int r11 = r11 - r0
        L_0x0467:
            if (r11 < 0) goto L_0x04f0
            java.lang.Object r12 = r7.get(r11)
            X.5Nh r12 = (X.C107265Nh) r12
            java.lang.String r1 = r5.A00(r12)
            if (r1 != 0) goto L_0x04b9
            boolean r0 = r12.A0M()
            if (r0 == 0) goto L_0x04c5
            X.0ts r0 = r5.A0B
            r16 = r0
            java.util.ArrayList r0 = r12.A0C()
            int r1 = r0.size()
            r0 = 1
            int r1 = r1 - r0
            long r0 = (long) r1
            r9 = 2
            java.lang.Object[] r13 = new java.lang.Object[r9]
            X.171 r14 = r5.A05
            X.16D r15 = r5.A04
            X.6by r9 = r12.A04
            com.whatsapp.jid.UserJid r9 = r9.A01
            X.141 r9 = r15.A0D(r9)
            java.lang.String r14 = r14.A0H(r9)
            r9 = 0
            r13[r9] = r14
            java.util.ArrayList r9 = r12.A0C()
            int r9 = r9.size()
            r12 = 1
            int r9 = r9 - r12
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13[r12] = r9
            r12 = 2131755262(0x7f1000fe, float:1.9141398E38)
            r9 = r16
            java.lang.String r1 = r9.A0L(r13, r12, r0)
        L_0x04b9:
            boolean r0 = r10.contains(r1)
            if (r0 != 0) goto L_0x04c2
            r10.add(r1)
        L_0x04c2:
            int r11 = r11 + -1
            goto L_0x0467
        L_0x04c5:
            X.171 r9 = r5.A05
            X.16D r1 = r5.A04
            X.6by r0 = r12.A04
            com.whatsapp.jid.UserJid r0 = r0.A01
            X.141 r0 = r1.A0D(r0)
            java.lang.String r1 = r9.A0H(r0)
            goto L_0x04b9
        L_0x04d6:
            if (r23 == 0) goto L_0x04dd
            r13 = 2131755407(0x7f10018f, float:1.9141692E38)
            goto L_0x0440
        L_0x04dd:
            r13 = 2131755200(0x7f1000c0, float:1.9141273E38)
            if (r20 == 0) goto L_0x0440
            r13 = 2131755201(0x7f1000c1, float:1.9141275E38)
            goto L_0x0440
        L_0x04e7:
            r0 = 2131891676(0x7f1215dc, float:1.9418079E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0459
        L_0x04f0:
            X.0ts r1 = r5.A0B
            r0 = 0
            java.lang.String r1 = X.C55782vB.A00(r1, r10, r0)
            r2.A0E(r1)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A0C(r1)
            r2.A0C(r0)
            goto L_0x0391
        L_0x0507:
            r4 = 0
            goto L_0x01f8
        L_0x050a:
            java.lang.String r1 = r18.A04()
            int r0 = r1.hashCode()
            switch(r0) {
                case 49: goto L_0x0518;
                case 50: goto L_0x0525;
                case 51: goto L_0x052f;
                default: goto L_0x0515;
            }
        L_0x0515:
            r1 = 0
            goto L_0x01da
        L_0x0518:
            java.lang.String r0 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0515
            r0 = 2
            r2.A06(r0)
            goto L_0x0515
        L_0x0525:
            java.lang.String r0 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0515
            r4 = 1
            goto L_0x0538
        L_0x052f:
            java.lang.String r0 = "3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0515
            r4 = 2
        L_0x0538:
            r0 = 5
            r1 = 1
            long[] r0 = new long[r0]
            if (r4 == r1) goto L_0x0544
            r0 = {0, 750, 250, 750, 250} // fill-array
        L_0x0541:
            r10.vibrate = r0
            goto L_0x0515
        L_0x0544:
            r0 = {0, 300, 200, 300, 200} // fill-array
            goto L_0x0541
        L_0x0548:
            r0 = 4
            r2.A06(r0)
            goto L_0x01f8
        L_0x054e:
            android.app.Notification r0 = r9.A05()     // Catch:{ SecurityException -> 0x0555 }
            r2.A0C = r0     // Catch:{ SecurityException -> 0x0555 }
            goto L_0x055d
        L_0x0555:
            r1 = move-exception
            boolean r0 = X.AnonymousClass6YG.A0A()
            if (r0 != 0) goto L_0x055d
            throw r1
        L_0x055d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0571
            r0 = r18
            X.2dt r0 = (X.C47192dt) r0
            r18 = r0
            if (r4 == 0) goto L_0x0585
            java.lang.String r0 = r18.A0F()
        L_0x056f:
            r2.A0M = r0
        L_0x0571:
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r30)
            java.lang.String r0 = "last_call_notification_hash"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r6)
            r0.apply()
            android.app.Notification r2 = r2.A05()
            if (r2 == 0) goto L_0x003c
            goto L_0x058a
        L_0x0585:
            java.lang.String r0 = r18.A0E()
            goto L_0x056f
        L_0x058a:
            X.1Fq r1 = r5.A09     // Catch:{ SecurityException -> 0x0591 }
            r0 = 4
            r1.A02(r0, r2)     // Catch:{ SecurityException -> 0x0591 }
            goto L_0x05d3
        L_0x0591:
            r3 = move-exception
            if (r32 != 0) goto L_0x05ba
            boolean r0 = X.AnonymousClass6YG.A04()
            if (r0 == 0) goto L_0x05ba
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x05ba
            java.lang.String r0 = X.AnonymousClass0PR.A00(r2)
            if (r0 == 0) goto L_0x05ba
            android.util.Pair r0 = X.C34111gT.A00(r0)
            if (r0 == 0) goto L_0x05ba
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x05ba
            X.3LI r0 = X.AnonymousClass1CR.A02(r8, r0)
            r8.A0e(r0)
            return
        L_0x05ba:
            java.lang.String r2 = r3.toString()
            java.lang.String r1 = "permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier"
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            java.lang.String r0 = "android.permission.UPDATE_APP_OPS_STATS"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x05d3
            boolean r0 = X.AnonymousClass6YG.A0A()
            if (r0 != 0) goto L_0x05d3
            throw r3
        L_0x05d3:
            X.1Io r0 = r5.A01
            r0.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34061gO.A05(boolean):void");
    }

    public C34061gO(AnonymousClass17Y r2, C26021Io r3, AnonymousClass1NG r4, AnonymousClass1MK r5, AnonymousClass16D r6, AnonymousClass171 r7, C27731Pn r8, C21060yb r9, C19630wG r10, C25271Fq r11, C19420v0 r12, C18820ts r13, AnonymousClass1HJ r14, C24381Cf r15, AnonymousClass12P r16, C20810yC r17, C20350xQ r18, AnonymousClass1CR r19, AnonymousClass1C6 r20, AnonymousClass1Q0 r21, C19770wU r22, C34071gP r23) {
        this.A0D = r17;
        this.A08 = r10;
        this.A0H = r2;
        this.A0M = r22;
        this.A0L = r20;
        this.A06 = r8;
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
        this.A07 = r9;
        this.A05 = r7;
        this.A0B = r13;
        this.A0F = r21;
        this.A02 = r4;
        this.A0K = r18;
        this.A0I = r14;
        this.A0E = r19;
        this.A0G = r23;
        this.A0J = r16;
        this.A0A = r12;
        this.A0C = r15;
        this.A09 = r11;
    }

    public void A02() {
        A01(this);
        if (!this.A00.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("missedcallnotification/clear ");
            sb.append(this.A00.size());
            Log.i(sb.toString());
            C19420v0.A00(this.A0A).remove("first_missed_call").apply();
            this.A00.clear();
            A03();
            AnonymousClass17Y r3 = this.A0H;
            C24381Cf r2 = this.A0C;
            Objects.requireNonNull(r2);
            r3.A0H(new C35691j6(r2, 3));
            this.A01.A01();
        }
    }

    public void BSi(C107265Nh r6, boolean z) {
        if (r6.A0B() != C108555Tz.A04) {
            A01(this);
            if (this.A00.isEmpty()) {
                C19420v0 r0 = this.A0A;
                C19420v0.A00(r0).putLong("first_missed_call", r6.A01).apply();
            }
            synchronized (this) {
                this.A00.add(r6);
            }
            A04(z);
            this.A0C.A00();
        }
    }
}
