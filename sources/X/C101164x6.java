package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Random;
import java.util.concurrent.ExecutionException;

/* renamed from: X.4x6  reason: invalid class name and case insensitive filesystem */
public class C101164x6 extends C129096Ez {
    public final C19730wQ A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass164 A02;
    public final AnonymousClass16D A03;
    public final C236519h A04;
    public final C21060yb A05;
    public final C19970wo A06;
    public final C19420v0 A07;
    public final AnonymousClass189 A08;
    public final AnonymousClass187 A09;
    public final AnonymousClass18I A0A;
    public final AnonymousClass17X A0B;
    public final C19770wU A0C;
    public final Random A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:171:0x045c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0460, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0463, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0467, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x046f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        X.C05600Qi.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0473, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04b0, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04b1, code lost:
        X.C05600Qi.A00(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02fb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02ff, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ae A[SYNTHETIC, Splitter:B:46:0x01ae] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d0 A[Catch:{ all -> 0x0423, all -> 0x04b5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C101164x6 r38) {
        /*
            r2 = r38
            X.18I r0 = r2.A0A
            X.79X r25 = r0.A07()
            X.0wo r0 = r2.A06     // Catch:{ all -> 0x04b5 }
            long r0 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x04b5 }
            X.0v0 r3 = r2.A07     // Catch:{ all -> 0x04b5 }
            r19 = r3
            android.content.SharedPreferences r5 = X.C36341k9.A0E(r19)     // Catch:{ all -> 0x04b5 }
            java.lang.String r7 = "dithered_last_signed_prekey_rotation"
            r3 = -9223372036854775808
            long r8 = r5.getLong(r7, r3)     // Catch:{ all -> 0x04b5 }
            r4 = 0
            r16 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x0045
            int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0045
            long r4 = r8 + r16
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x0045
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04b5 }
            java.lang.String r0 = "RotateKeysAction/rotateSignedPrekeyAndSenderKeys/rotate keys alarm fired before ready to rotate signed prekey; rotation skipped until "
            r1.append(r0)     // Catch:{ all -> 0x04b5 }
            java.lang.String r0 = X.AnonymousClass6XI.A02(r4)     // Catch:{ all -> 0x04b5 }
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x04b5 }
            goto L_0x0476
        L_0x0045:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = "RotateKeysAction/rotateSignedPrekeyAndSenderKeys/rotating signed prekey now; now="
            r4.append(r3)     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = X.AnonymousClass6XI.A02(r0)     // Catch:{ all -> 0x04b5 }
            r4.append(r3)     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = "; lastSignedPrekeyRotation="
            r4.append(r3)     // Catch:{ all -> 0x04b5 }
            java.lang.String r3 = X.AnonymousClass6XI.A02(r8)     // Catch:{ all -> 0x04b5 }
            X.C36321k7.A1a(r4, r3)     // Catch:{ all -> 0x04b5 }
            X.189 r6 = r2.A08     // Catch:{ all -> 0x04b5 }
            X.18I r3 = r6.A0K     // Catch:{ all -> 0x04b5 }
            r38 = r3
            X.79X r18 = r38.A07()     // Catch:{ all -> 0x04b5 }
            X.18u r12 = r6.A00     // Catch:{ all -> 0x04a4 }
            X.34P r10 = r12.A04()     // Catch:{ all -> 0x04a4 }
            X.18s r3 = r12.A02     // Catch:{ all -> 0x04a4 }
            X.18t r3 = r3.A05     // Catch:{ all -> 0x04a4 }
            X.18p r5 = r3.A00     // Catch:{ all -> 0x04a4 }
            java.lang.String r14 = "prekey_id"
            X.18M r3 = r5.A01     // Catch:{ all -> 0x04a4 }
            X.1M0 r9 = r3.get()     // Catch:{ all -> 0x04a4 }
            X.14e r11 = r9.A02     // Catch:{ all -> 0x0494 }
            java.lang.String r8 = "SELECT prekey_id, record FROM signed_prekeys ORDER BY prekey_id DESC LIMIT 1"
            r4 = 0
            java.lang.String r3 = "SignalSignedPreKeyStore/getNextSignedPreKeyIdForRotation"
            android.database.Cursor r4 = r11.A09(r8, r3, r4)     // Catch:{ all -> 0x0494 }
            boolean r3 = r4.moveToNext()     // Catch:{ all -> 0x0488 }
            r13 = 0
            if (r3 == 0) goto L_0x00c1
            int r15 = X.C36351kA.A03(r4, r14)     // Catch:{ all -> 0x0488 }
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = 1
            if (r15 == r8) goto L_0x009e
            int r8 = r15 + 1
            goto L_0x00bd
        L_0x009e:
            r4.close()     // Catch:{ all -> 0x0494 }
            java.lang.String r8 = "SELECT prekey_id, record FROM signed_prekeys WHERE prekey_id < ? ORDER BY prekey_id DESC LIMIT 1"
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x0494 }
            r3 = 8388607(0x7fffff, float:1.1754942E-38)
            X.C36431kI.A1O(r4, r3, r13)     // Catch:{ all -> 0x0494 }
            java.lang.String r3 = "SignalSignedPreKeyStore/getNextSignedPreKeyIdForRotation2"
            android.database.Cursor r4 = r11.A09(r8, r3, r4)     // Catch:{ all -> 0x0494 }
            boolean r3 = r4.moveToNext()     // Catch:{ all -> 0x0488 }
            if (r3 == 0) goto L_0x00c1
            int r3 = X.C36351kA.A03(r4, r14)     // Catch:{ all -> 0x0488 }
            int r8 = r3 + 1
        L_0x00bd:
            r4.close()     // Catch:{ all -> 0x0494 }
            goto L_0x00c9
        L_0x00c1:
            r4.close()     // Catch:{ all -> 0x0494 }
            r9.close()     // Catch:{ all -> 0x04a4 }
            r8 = 0
            goto L_0x00cc
        L_0x00c9:
            r9.close()     // Catch:{ all -> 0x04a4 }
        L_0x00cc:
            X.0wo r3 = r12.A03     // Catch:{ all -> 0x04a4 }
            long r3 = X.C19970wo.A00(r3)     // Catch:{ all -> 0x04a4 }
            X.5pz r12 = X.C133256Xm.A00()     // Catch:{ all -> 0x04a4 }
            X.66J r11 = r10.A00     // Catch:{ all -> 0x04a4 }
            X.3IG r9 = r12.A01     // Catch:{ all -> 0x04a4 }
            byte[] r10 = r9.A00()     // Catch:{ all -> 0x04a4 }
            byte[] r11 = X.C133256Xm.A08(r11, r10)     // Catch:{ all -> 0x04a4 }
            X.4uJ r10 = X.C100004uJ.DEFAULT_INSTANCE     // Catch:{ all -> 0x04a4 }
            X.8NN r10 = r10.A0p()     // Catch:{ all -> 0x04a4 }
            X.4tw r10 = (X.C99774tw) r10     // Catch:{ all -> 0x04a4 }
            r10.A0U(r8)     // Catch:{ all -> 0x04a4 }
            byte[] r9 = r9.A00()     // Catch:{ all -> 0x04a4 }
            int r8 = r9.length     // Catch:{ all -> 0x04a4 }
            X.8I5 r8 = X.C21674AUx.A01(r9, r13, r8)     // Catch:{ all -> 0x04a4 }
            r10.A0X(r8)     // Catch:{ all -> 0x04a4 }
            X.66J r8 = r12.A00     // Catch:{ all -> 0x04a4 }
            byte[] r9 = r8.A01     // Catch:{ all -> 0x04a4 }
            int r8 = r9.length     // Catch:{ all -> 0x04a4 }
            X.8I5 r8 = X.C21674AUx.A01(r9, r13, r8)     // Catch:{ all -> 0x04a4 }
            r10.A0W(r8)     // Catch:{ all -> 0x04a4 }
            int r8 = r11.length     // Catch:{ all -> 0x04a4 }
            X.8I5 r8 = X.C21674AUx.A01(r11, r13, r8)     // Catch:{ all -> 0x04a4 }
            r10.A0Y(r8)     // Catch:{ all -> 0x04a4 }
            r10.A0V(r3)     // Catch:{ all -> 0x04a4 }
            X.8Hz r8 = r10.A0R()     // Catch:{ all -> 0x04a4 }
            X.4uJ r8 = (X.C100004uJ) r8     // Catch:{ all -> 0x04a4 }
            int r4 = r8.id_     // Catch:{ all -> 0x04a4 }
            X.AUx r3 = r8.publicKey_     // Catch:{ 110 -> 0x0482 }
            byte[] r3 = r3.A06()     // Catch:{ 110 -> 0x0482 }
            X.3IG r10 = X.C133256Xm.A01(r3)     // Catch:{ 110 -> 0x0482 }
            X.AUx r3 = r8.privateKey_     // Catch:{ 110 -> 0x0482 }
            byte[] r3 = r3.A06()     // Catch:{ 110 -> 0x0482 }
            r12 = 5
            X.66J r9 = new X.66J     // Catch:{ 110 -> 0x0482 }
            r9.<init>(r3, r12)     // Catch:{ 110 -> 0x0482 }
            X.5pz r3 = new X.5pz     // Catch:{ 110 -> 0x0482 }
            r3.<init>(r9, r10)     // Catch:{ 110 -> 0x0482 }
            X.3IG r3 = r3.A01     // Catch:{ all -> 0x04a4 }
            byte[] r3 = r3.A01     // Catch:{ all -> 0x04a4 }
            X.AUh r10 = new X.AUh     // Catch:{ all -> 0x04a4 }
            r10.<init>(r3)     // Catch:{ all -> 0x04a4 }
            X.AUx r3 = r8.publicKey_     // Catch:{ 110 -> 0x049e }
            byte[] r3 = r3.A06()     // Catch:{ 110 -> 0x049e }
            X.3IG r11 = X.C133256Xm.A01(r3)     // Catch:{ 110 -> 0x049e }
            X.AUx r3 = r8.privateKey_     // Catch:{ 110 -> 0x049e }
            byte[] r3 = r3.A06()     // Catch:{ 110 -> 0x049e }
            X.66J r9 = new X.66J     // Catch:{ 110 -> 0x049e }
            r9.<init>(r3, r12)     // Catch:{ 110 -> 0x049e }
            X.5pz r3 = new X.5pz     // Catch:{ 110 -> 0x049e }
            r3.<init>(r9, r11)     // Catch:{ 110 -> 0x049e }
            X.66J r3 = r3.A00     // Catch:{ all -> 0x04a4 }
            byte[] r9 = r3.A01     // Catch:{ all -> 0x04a4 }
            X.5nT r3 = new X.5nT     // Catch:{ all -> 0x04a4 }
            r3.<init>(r9)     // Catch:{ all -> 0x04a4 }
            X.5rl r11 = new X.5rl     // Catch:{ all -> 0x04a4 }
            r11.<init>(r3, r10)     // Catch:{ all -> 0x04a4 }
            int r13 = r8.id_     // Catch:{ all -> 0x04a4 }
            long r14 = r8.timestamp_     // Catch:{ all -> 0x04a4 }
            X.AUx r3 = r8.signature_     // Catch:{ all -> 0x04a4 }
            byte[] r12 = r3.A06()     // Catch:{ all -> 0x04a4 }
            X.6JW r10 = new X.6JW     // Catch:{ all -> 0x04a4 }
            r10.<init>(r11, r12, r13, r14)     // Catch:{ all -> 0x04a4 }
            X.4uJ r3 = r10.A00     // Catch:{ all -> 0x04a4 }
            byte[] r3 = r3.A0o()     // Catch:{ all -> 0x04a4 }
            r5.A00(r4, r3)     // Catch:{ all -> 0x04a4 }
            int r3 = r8.id_     // Catch:{ all -> 0x04a4 }
            byte[] r9 = X.C203239na.A03(r3)     // Catch:{ all -> 0x04a4 }
            X.AUx r3 = r8.publicKey_     // Catch:{ 110 -> 0x047c }
            byte[] r3 = r3.A06()     // Catch:{ 110 -> 0x047c }
            X.3IG r10 = X.C133256Xm.A01(r3)     // Catch:{ 110 -> 0x047c }
            X.AUx r3 = r8.privateKey_     // Catch:{ 110 -> 0x047c }
            byte[] r5 = r3.A06()     // Catch:{ 110 -> 0x047c }
            r3 = 5
            X.66J r4 = new X.66J     // Catch:{ 110 -> 0x047c }
            r4.<init>(r5, r3)     // Catch:{ 110 -> 0x047c }
            X.5pz r3 = new X.5pz     // Catch:{ 110 -> 0x047c }
            r3.<init>(r4, r10)     // Catch:{ 110 -> 0x047c }
            X.3IG r3 = r3.A01     // Catch:{ all -> 0x04a4 }
            byte[] r5 = r3.A01     // Catch:{ all -> 0x04a4 }
            X.AUx r3 = r8.signature_     // Catch:{ all -> 0x04a4 }
            byte[] r4 = r3.A06()     // Catch:{ all -> 0x04a4 }
            X.5tq r3 = new X.5tq     // Catch:{ all -> 0x04a4 }
            r3.<init>(r9, r5, r4)     // Catch:{ all -> 0x04a4 }
            if (r18 == 0) goto L_0x01b1
            r18.close()     // Catch:{ all -> 0x04b5 }
        L_0x01b1:
            X.164 r9 = r2.A02     // Catch:{ all -> 0x04b5 }
            byte[] r8 = r3.A01     // Catch:{ all -> 0x04b5 }
            byte[] r5 = r3.A00     // Catch:{ all -> 0x04b5 }
            byte[] r4 = r3.A02     // Catch:{ all -> 0x04b5 }
            com.whatsapp.jobqueue.job.RotateSignedPreKeyJob r3 = new com.whatsapp.jobqueue.job.RotateSignedPreKeyJob     // Catch:{ all -> 0x04b5 }
            r3.<init>(r8, r5, r4)     // Catch:{ all -> 0x04b5 }
            r9.A01(r3)     // Catch:{ all -> 0x04b5 }
            android.content.SharedPreferences$Editor r3 = X.C19420v0.A00(r19)     // Catch:{ all -> 0x04b5 }
            X.C36341k9.A0w(r3, r7, r0)     // Catch:{ all -> 0x04b5 }
            X.0wQ r11 = r2.A00     // Catch:{ all -> 0x04b5 }
            com.whatsapp.jid.PhoneUserJid r3 = X.C36441kJ.A0n(r11)     // Catch:{ all -> 0x04b5 }
            if (r3 == 0) goto L_0x0476
            long r3 = r0 - r16
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x04b5 }
            X.16D r5 = r2.A03     // Catch:{ all -> 0x04b5 }
            r5.A0i(r7)     // Catch:{ all -> 0x04b5 }
            int r5 = r7.size()     // Catch:{ all -> 0x04b5 }
            long r7 = (long) r5     // Catch:{ all -> 0x04b5 }
            r9 = 4000(0xfa0, double:1.9763E-320)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ed
            r7 = 7776000000(0x1cf7c5800, double:3.841854462E-314)
            long r0 = r0 - r7
            goto L_0x01ee
        L_0x01ed:
            r0 = r3
        L_0x01ee:
            r11.A0G()     // Catch:{ all -> 0x04b5 }
            X.13x r5 = r11.A02     // Catch:{ all -> 0x04b5 }
            X.6EZ r8 = X.C133256Xm.A02(r5)     // Catch:{ all -> 0x04b5 }
            X.18k r7 = r6.A0A     // Catch:{ all -> 0x04b5 }
            java.lang.String r24 = "group_id"
            r13 = 0
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04b5 }
            java.lang.String r5 = "SignalSenderKeyStore get keys older than:"
            r6.append(r5)     // Catch:{ all -> 0x04b5 }
            r6.append(r3)     // Catch:{ all -> 0x04b5 }
            java.lang.String r23 = " for sender:"
            r5 = r23
            r6.append(r5)     // Catch:{ all -> 0x04b5 }
            r6.append(r8)     // Catch:{ all -> 0x04b5 }
            java.lang.String r22 = " statusKeyExpirationTimeMs:"
            r5 = r22
            X.C36321k7.A1V(r5, r6, r0)     // Catch:{ all -> 0x04b5 }
            X.0yC r15 = r7.A05     // Catch:{ all -> 0x04b5 }
            r5 = 6486(0x1956, float:9.089E-42)
            boolean r5 = r15.A0E(r5)     // Catch:{ all -> 0x04b5 }
            if (r5 == 0) goto L_0x0233
            X.18h r6 = r7.A02     // Catch:{ all -> 0x04b5 }
            r5 = 4
            java.lang.Long r9 = r6.A00(r8, r5)     // Catch:{ all -> 0x04b5 }
        L_0x022a:
            long r16 = X.C36391kE.A0B(r0)     // Catch:{ all -> 0x04b5 }
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x04b5 }
            goto L_0x0235
        L_0x0233:
            r9 = 0
            goto L_0x022a
        L_0x0235:
            r12 = 3
            r11 = 2
            r5 = 4
            r10 = 1
            if (r9 == 0) goto L_0x0242
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x04b5 }
            java.lang.String r5 = r9.toString()     // Catch:{ all -> 0x04b5 }
            goto L_0x0249
        L_0x0242:
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x04b5 }
            java.lang.String r5 = r8.A02     // Catch:{ all -> 0x04b5 }
            X.AnonymousClass00C.A08(r5)     // Catch:{ all -> 0x04b5 }
        L_0x0249:
            r6[r13] = r5     // Catch:{ all -> 0x04b5 }
            int r5 = r8.A01     // Catch:{ all -> 0x04b5 }
            java.lang.String r21 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x04b5 }
            r6[r10] = r21     // Catch:{ all -> 0x04b5 }
            int r5 = r8.A00     // Catch:{ all -> 0x04b5 }
            java.lang.String r20 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x04b5 }
            r6[r11] = r20     // Catch:{ all -> 0x04b5 }
            java.lang.String r19 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x04b5 }
            r6[r12] = r19     // Catch:{ all -> 0x04b5 }
            X.18M r5 = r7.A04     // Catch:{ all -> 0x04b5 }
            r37 = r5
            X.1M0 r12 = r37.A04()     // Catch:{ all -> 0x04b5 }
            X.14e r5 = r12.A02     // Catch:{ all -> 0x0474 }
            r26 = r5
            java.lang.String r5 = "sender_keys"
            java.lang.String[] r28 = new java.lang.String[]{r24}     // Catch:{ all -> 0x0474 }
            X.8dw r18 = X.C177528dw.A00     // Catch:{ all -> 0x0474 }
            java.lang.String r11 = r18.getRawString()     // Catch:{ all -> 0x0474 }
            java.lang.String r29 = X.C234218k.A01(r9, r11, r13)     // Catch:{ all -> 0x0474 }
            r31 = 0
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0474 }
            java.lang.String r13 = "SignalSenderKeyStore/getOldSenderKeys"
            r11.append(r13)     // Catch:{ all -> 0x0474 }
            java.lang.String r17 = "_lid_identifier"
            r36 = r17
            r35 = r17
            java.lang.String r16 = ""
            r13 = r16
            if (r9 == 0) goto L_0x0296
            r13 = r17
        L_0x0296:
            java.lang.String r34 = X.AnonymousClass000.A0q(r13, r11)     // Catch:{ all -> 0x0474 }
            r33 = r31
            r27 = r5
            r30 = r6
            r32 = r31
            android.database.Cursor r11 = r26.A0A(r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0474 }
            java.lang.String[] r28 = new java.lang.String[]{r24}     // Catch:{ all -> 0x046d }
            java.lang.String r13 = r18.getRawString()     // Catch:{ all -> 0x046d }
            java.lang.String r29 = X.C234218k.A01(r9, r13, r10)     // Catch:{ all -> 0x046d }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x046d }
            java.lang.String r13 = "SignalSenderKeyStore/getOldSenderKeys1"
            r10.append(r13)     // Catch:{ all -> 0x046d }
            if (r9 != 0) goto L_0x02bf
            r17 = r16
        L_0x02bf:
            r9 = r17
            java.lang.String r34 = X.AnonymousClass000.A0q(r9, r10)     // Catch:{ all -> 0x046d }
            android.database.Cursor r9 = r26.A0A(r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x046d }
            if (r11 == 0) goto L_0x02df
            r6 = r24
            int r10 = r11.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x02f9 }
        L_0x02d1:
            boolean r6 = r11.moveToNext()     // Catch:{ all -> 0x02f9 }
            if (r6 == 0) goto L_0x02df
            java.lang.String r6 = X.C90494aF.A0Z(r11, r10)     // Catch:{ all -> 0x02f9 }
            r14.add(r6)     // Catch:{ all -> 0x02f9 }
            goto L_0x02d1
        L_0x02df:
            if (r9 == 0) goto L_0x0300
            r6 = r24
            int r10 = r9.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x02f9 }
        L_0x02e7:
            boolean r6 = r9.moveToNext()     // Catch:{ all -> 0x02f9 }
            if (r6 == 0) goto L_0x02f5
            java.lang.String r6 = X.C90494aF.A0Z(r9, r10)     // Catch:{ all -> 0x02f9 }
            r14.add(r6)     // Catch:{ all -> 0x02f9 }
            goto L_0x02e7
        L_0x02f5:
            r9.close()     // Catch:{ all -> 0x046d }
            goto L_0x0300
        L_0x02f9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02fb }
        L_0x02fb:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ all -> 0x046d }
            throw r0     // Catch:{ all -> 0x046d }
        L_0x0300:
            if (r11 == 0) goto L_0x0305
            r11.close()     // Catch:{ all -> 0x0474 }
        L_0x0305:
            r12.close()     // Catch:{ all -> 0x04b5 }
            int r6 = r14.size()     // Catch:{ all -> 0x04b5 }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x04b5 }
            r10.<init>(r6)     // Catch:{ all -> 0x04b5 }
            java.util.Iterator r11 = r14.iterator()     // Catch:{ all -> 0x04b5 }
        L_0x0315:
            boolean r6 = r11.hasNext()     // Catch:{ all -> 0x04b5 }
            if (r6 == 0) goto L_0x0328
            java.lang.String r9 = X.AnonymousClass001.A0C(r11)     // Catch:{ all -> 0x04b5 }
            X.6EU r6 = new X.6EU     // Catch:{ all -> 0x04b5 }
            r6.<init>(r8, r9)     // Catch:{ all -> 0x04b5 }
            r10.add(r6)     // Catch:{ all -> 0x04b5 }
            goto L_0x0315
        L_0x0328:
            boolean r6 = r10.isEmpty()     // Catch:{ all -> 0x04b5 }
            if (r6 == 0) goto L_0x0333
            java.util.HashSet r9 = X.C36441kJ.A16()     // Catch:{ all -> 0x04b5 }
            goto L_0x0356
        L_0x0333:
            int r6 = r10.size()     // Catch:{ all -> 0x04b5 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x04b5 }
            r9.<init>(r6)     // Catch:{ all -> 0x04b5 }
            java.util.Iterator r11 = r10.iterator()     // Catch:{ all -> 0x04b5 }
        L_0x0340:
            boolean r6 = r11.hasNext()     // Catch:{ all -> 0x04b5 }
            if (r6 == 0) goto L_0x0356
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x04b5 }
            X.6EU r10 = (X.AnonymousClass6EU) r10     // Catch:{ all -> 0x04b5 }
            r6 = r38
            X.79X r6 = X.AnonymousClass18I.A01(r6, r10)     // Catch:{ all -> 0x04b5 }
            r9.add(r6)     // Catch:{ all -> 0x04b5 }
            goto L_0x0340
        L_0x0356:
            r6 = r38
            r6.A0A(r9)     // Catch:{ all -> 0x0468 }
            r10 = 0
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0468 }
            java.lang.String r6 = "SignalSenderKeyStore deleting keys older than:"
            r11.append(r6)     // Catch:{ all -> 0x0468 }
            r11.append(r3)     // Catch:{ all -> 0x0468 }
            r3 = r23
            r11.append(r3)     // Catch:{ all -> 0x0468 }
            r11.append(r8)     // Catch:{ all -> 0x0468 }
            r3 = r22
            X.C36321k7.A1V(r3, r11, r0)     // Catch:{ all -> 0x0468 }
            r0 = 6486(0x1956, float:9.089E-42)
            boolean r0 = r15.A0E(r0)     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x0385
            X.18h r1 = r7.A02     // Catch:{ all -> 0x0468 }
            r0 = 4
            java.lang.Long r11 = r1.A00(r8, r0)     // Catch:{ all -> 0x0468 }
            goto L_0x0386
        L_0x0385:
            r11 = 0
        L_0x0386:
            r4 = 3
            r3 = 2
            r0 = 4
            r1 = 1
            if (r11 == 0) goto L_0x038d
            goto L_0x0395
        L_0x038d:
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x0468 }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0468 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0468 }
            goto L_0x039b
        L_0x0395:
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x0468 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x0468 }
        L_0x039b:
            r7[r10] = r0     // Catch:{ all -> 0x0468 }
            r7[r1] = r21     // Catch:{ all -> 0x0468 }
            r7[r3] = r20     // Catch:{ all -> 0x0468 }
            r7[r4] = r19     // Catch:{ all -> 0x0468 }
            X.1M0 r4 = r37.A04()     // Catch:{ all -> 0x0468 }
            X.71s r6 = r4.B1k()     // Catch:{ all -> 0x0461 }
            X.14e r8 = r4.A02     // Catch:{ all -> 0x045a }
            java.lang.String r0 = r18.getRawString()     // Catch:{ all -> 0x045a }
            java.lang.String r10 = X.C234218k.A01(r11, r0, r10)     // Catch:{ all -> 0x045a }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x045a }
            java.lang.String r0 = "SignalSenderKeyStore/removeOldSenderKeys2"
            r3.append(r0)     // Catch:{ all -> 0x045a }
            if (r11 != 0) goto L_0x03c2
            r35 = r16
        L_0x03c2:
            r0 = r35
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r3)     // Catch:{ all -> 0x045a }
            r8.A03(r5, r10, r0, r7)     // Catch:{ all -> 0x045a }
            java.lang.String r0 = r18.getRawString()     // Catch:{ all -> 0x045a }
            java.lang.String r3 = X.C234218k.A01(r11, r0, r1)     // Catch:{ all -> 0x045a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x045a }
            java.lang.String r0 = "SignalSenderKeyStore/removeOldSenderKeys3"
            r1.append(r0)     // Catch:{ all -> 0x045a }
            if (r11 != 0) goto L_0x03e0
            r36 = r16
        L_0x03e0:
            r0 = r36
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x045a }
            r8.A03(r5, r3, r0, r7)     // Catch:{ all -> 0x045a }
            r6.A00()     // Catch:{ all -> 0x045a }
            r6.close()     // Catch:{ all -> 0x0461 }
            r4.close()     // Catch:{ all -> 0x0468 }
            X.AnonymousClass18I.A05(r9)     // Catch:{ all -> 0x04b5 }
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x04b5 }
            java.util.Iterator r5 = r14.iterator()     // Catch:{ all -> 0x04b5 }
        L_0x03fd:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x04b5 }
            if (r0 == 0) goto L_0x0435
            java.lang.String r4 = X.AnonymousClass001.A0C(r5)     // Catch:{ all -> 0x04b5 }
            if (r4 == 0) goto L_0x03fd
            int r0 = r4.length()     // Catch:{ all -> 0x04b5 }
            if (r0 == 0) goto L_0x03fd
            r3 = 0
            com.whatsapp.jid.Jid r1 = X.C222513o.A00(r4)     // Catch:{ all -> 0x0423 }
            boolean r0 = r1 instanceof X.AnonymousClass144     // Catch:{ all -> 0x0423 }
            if (r0 == 0) goto L_0x041d
            X.144 r1 = (X.AnonymousClass144) r1     // Catch:{ all -> 0x0423 }
            if (r1 == 0) goto L_0x041d
            goto L_0x0428
        L_0x041d:
            X.0wR r0 = new X.0wR     // Catch:{ all -> 0x0423 }
            r0.<init>((java.lang.String) r4)     // Catch:{ all -> 0x0423 }
            throw r0     // Catch:{ all -> 0x0423 }
        L_0x0423:
            r0 = move-exception
            X.03N r1 = X.C90524aI.A0t(r0)     // Catch:{ all -> 0x04b5 }
        L_0x0428:
            boolean r0 = r1 instanceof X.AnonymousClass03N     // Catch:{ all -> 0x04b5 }
            if (r0 != 0) goto L_0x042d
            r3 = r1
        L_0x042d:
            X.144 r3 = (X.AnonymousClass144) r3     // Catch:{ all -> 0x04b5 }
            if (r3 == 0) goto L_0x03fd
            r6.add(r3)     // Catch:{ all -> 0x04b5 }
            goto L_0x03fd
        L_0x0435:
            java.util.Iterator r4 = r6.iterator()     // Catch:{ all -> 0x04b5 }
        L_0x0439:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x04b5 }
            if (r0 == 0) goto L_0x0476
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x04b5 }
            X.144 r3 = (X.AnonymousClass144) r3     // Catch:{ all -> 0x04b5 }
            X.1DT r1 = r2.A01     // Catch:{ all -> 0x04b5 }
            java.lang.Integer r0 = X.C36371kC.A0p()     // Catch:{ all -> 0x04b5 }
            r1.A0K(r3, r0)     // Catch:{ all -> 0x04b5 }
            X.17X r1 = r2.A0B     // Catch:{ all -> 0x04b5 }
            X.17r r0 = r1.A07     // Catch:{ all -> 0x04b5 }
            X.6X6 r0 = r0.A0C(r3)     // Catch:{ all -> 0x04b5 }
            r1.A06(r0)     // Catch:{ all -> 0x04b5 }
            goto L_0x0439
        L_0x045a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x045c }
        L_0x045c:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x0461 }
            throw r0     // Catch:{ all -> 0x0461 }
        L_0x0461:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0463 }
        L_0x0463:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x0468 }
            throw r0     // Catch:{ all -> 0x0468 }
        L_0x0468:
            r1 = move-exception
            X.AnonymousClass18I.A05(r9)     // Catch:{ all -> 0x04b5 }
            goto L_0x04b4
        L_0x046d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x046f }
        L_0x046f:
            r0 = move-exception
            X.C05600Qi.A00(r11, r1)     // Catch:{ all -> 0x0474 }
            throw r0     // Catch:{ all -> 0x0474 }
        L_0x0474:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x04b0 }
        L_0x0476:
            if (r25 == 0) goto L_0x047b
            r25.close()
        L_0x047b:
            return
        L_0x047c:
            r0 = move-exception
            java.lang.AssertionError r1 = X.C90524aI.A0Y(r0)     // Catch:{ all -> 0x04a4 }
            goto L_0x04a3
        L_0x0482:
            r0 = move-exception
            java.lang.AssertionError r1 = X.C90524aI.A0Y(r0)     // Catch:{ all -> 0x04a4 }
            goto L_0x04a3
        L_0x0488:
            r1 = move-exception
            if (r4 == 0) goto L_0x0493
            r4.close()     // Catch:{ all -> 0x048f }
            goto L_0x0493
        L_0x048f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0494 }
        L_0x0493:
            throw r1     // Catch:{ all -> 0x0494 }
        L_0x0494:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0499 }
            goto L_0x04a3
        L_0x0499:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04a4 }
            goto L_0x04a3
        L_0x049e:
            r0 = move-exception
            java.lang.AssertionError r1 = X.C90524aI.A0Y(r0)     // Catch:{ all -> 0x04a4 }
        L_0x04a3:
            throw r1     // Catch:{ all -> 0x04a4 }
        L_0x04a4:
            r1 = move-exception
            if (r18 == 0) goto L_0x04b4
            r18.close()     // Catch:{ all -> 0x04ab }
            goto L_0x04b4
        L_0x04ab:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x04b5 }
            goto L_0x04b4
        L_0x04b0:
            r1 = move-exception
            X.C05600Qi.A00(r12, r0)     // Catch:{ all -> 0x04b5 }
        L_0x04b4:
            throw r1     // Catch:{ all -> 0x04b5 }
        L_0x04b5:
            r1 = move-exception
            if (r25 == 0) goto L_0x04c0
            r25.close()     // Catch:{ all -> 0x04bc }
            throw r1
        L_0x04bc:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x04c0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101164x6.A01(X.4x6):void");
    }

    public static void A02(C101164x6 r12) {
        long A002 = C19970wo.A00(r12.A06);
        C19420v0 r9 = r12.A07;
        AnonymousClass005 r8 = r9.A00;
        if (!C36391kE.A0H(r8).contains("dithered_last_signed_prekey_rotation")) {
            long nextInt = A002 - (((long) r12.A0D.nextInt(2592000)) * 1000);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("no signed prekey rotation schedule established; setting last rotation time to ");
            C36321k7.A1a(A0u, AnonymousClass6XI.A02(nextInt));
            C36341k9.A0w(C19420v0.A00(r9), "dithered_last_signed_prekey_rotation", nextInt);
        }
        long j = C36391kE.A0H(r8).getLong("dithered_last_signed_prekey_rotation", Long.MIN_VALUE);
        if (j >= 0 && j <= A002) {
            long j2 = 2592000000L + j;
            if (j2 >= A002) {
                long j3 = j2 - A002;
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("scheduling alarm to trigger signed prekey rotation; now=");
                A0u2.append(AnonymousClass6XI.A02(A002));
                A0u2.append("; lastSignedPrekeyRotation=");
                A0u2.append(AnonymousClass6XI.A02(j));
                C36321k7.A1V("; deltaToAlarm=", A0u2, j3);
                PendingIntent A032 = r12.A03("com.whatsapp.action.ROTATE_SIGNED_PREKEY", 134217728);
                if (!r12.A04.A00(A032, 2, j3 + SystemClock.elapsedRealtime())) {
                    Log.w("RotateKeysAction/setupRotateKeysAlarm AlarmManager is null");
                    return;
                }
                return;
            }
        }
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("scheduling immediate signed prekey rotation; now=");
        A0u3.append(AnonymousClass6XI.A02(A002));
        A0u3.append("; lastSignedPrekeyRotation=");
        C36321k7.A1a(A0u3, AnonymousClass6XI.A02(j));
        r12.A0C.Boy(new C1496972k(r12, 28));
    }

    public C101164x6(Context context, C19730wQ r2, AnonymousClass1DT r3, AnonymousClass164 r4, AnonymousClass16D r5, C236519h r6, C21060yb r7, C19970wo r8, C19420v0 r9, AnonymousClass189 r10, AnonymousClass187 r11, AnonymousClass18I r12, AnonymousClass17X r13, C19770wU r14, Random random) {
        super(context);
        this.A06 = r8;
        this.A0D = random;
        this.A04 = r6;
        this.A00 = r2;
        this.A0C = r14;
        this.A0A = r12;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        this.A09 = r11;
        this.A05 = r7;
        this.A08 = r10;
        this.A07 = r9;
        this.A0B = r13;
    }

    public static void A00(Intent intent, C101164x6 r4) {
        PowerManager.WakeLock wakeLock;
        AssertionError assertionError;
        C36321k7.A1K(intent, "RotateKeysAction/rotateSignedPrekeyAndSenderKeys; intent=", AnonymousClass000.A0u());
        PowerManager A0G = r4.A05.A0G();
        if (A0G == null) {
            Log.w("RotateKeysAction/rotateSignedPrekeyAndSenderKeys pm=null");
            wakeLock = null;
        } else {
            wakeLock = C111765co.A00(A0G, "RotateKeysAction#rotateSignedPrekeyAndSenderKeys", 1);
            wakeLock.setReferenceCounted(false);
            wakeLock.acquire(300000);
        }
        try {
            if (r4.A08.A0X()) {
                A01(r4);
            } else {
                AnonymousClass187 r2 = r4.A09;
                r2.A00.submit(new C1496972k(r4, 29)).get();
            }
            A02(r4);
            if (wakeLock != null) {
                wakeLock.release();
                return;
            }
            return;
        } catch (InterruptedException e) {
            e = e;
            assertionError = C90524aI.A0Y("interrupted during rotate keys alarm");
        } catch (ExecutionException e2) {
            e = e2;
            assertionError = C90524aI.A0Y("exception during rotate keys alarm");
        } catch (Throwable th) {
            if (wakeLock != null) {
                wakeLock.release();
            }
            throw th;
        }
        assertionError.initCause(e);
        throw assertionError;
    }
}
