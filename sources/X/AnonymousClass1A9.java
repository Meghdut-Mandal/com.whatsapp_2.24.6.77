package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1A9  reason: invalid class name */
public class AnonymousClass1A9 {
    public final C19730wQ A00;
    public final C21100yf A01;
    public final AnonymousClass164 A02;
    public final AnonymousClass1AB A03;
    public final C19970wo A04;
    public final C19420v0 A05;
    public final AnonymousClass18P A06;
    public final AnonymousClass1AH A07;
    public final AnonymousClass1AI A08;
    public final AnonymousClass1AA A09;
    public final AnonymousClass1AJ A0A;
    public final C237919w A0B;

    public static HashMap A00(AnonymousClass1A9 r10, Collection collection) {
        C195589Va r0;
        Cursor A092;
        HashMap hashMap = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C201539jo r4 = (C201539jo) it.next();
            if (r4 != null) {
                AnonymousClass1M0 A032 = r10.A09.A00.get();
                try {
                    A092 = A032.A02.A09("SELECT device_id, epoch, key_data, timestamp, fingerprint FROM crypto_info WHERE device_id = ?  AND epoch = ? ", "SyncdCryptoInfoTable.SELECT_KEY_WITH_ID", new String[]{String.valueOf(r4.A00()), String.valueOf(C203239na.A01(r4.A00, 2))});
                    if (A092.moveToFirst()) {
                        r0 = AnonymousClass1AA.A00(A092);
                        A092.close();
                        A032.close();
                    } else {
                        A092.close();
                        A032.close();
                        r0 = null;
                    }
                } catch (Throwable th) {
                    try {
                        A032.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                r0 = r10.A05();
            }
            hashMap.put(r4, r0);
        }
        return hashMap;
        throw th;
    }

    private HashSet A01() {
        HashSet hashSet = new HashSet();
        for (AnonymousClass3SB r0 : this.A07.A00()) {
            hashSet.add(Integer.valueOf(r0.A04));
        }
        hashSet.add(Integer.valueOf(this.A00.A04()));
        return hashSet;
    }

    public static void A02(AnonymousClass1A9 r4) {
        int i;
        C195589Va A022 = r4.A09.A02();
        if (A022 == null) {
            i = 3;
        } else {
            i = 1;
            if (!r4.A0C(A022.A00)) {
                i = 2;
            }
        }
        AnonymousClass1AB r2 = r4.A03;
        C44352Ne r1 = new C44352Ne();
        r1.A00 = Integer.valueOf(i);
        r2.A06.Bly(r1);
    }

    public static boolean A03(AnonymousClass1A9 r4) {
        HashSet A002 = r4.A0A.A00();
        if (!(!A002.isEmpty()) || !r4.A07().isEmpty()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdKeyManager/isKeyMissingOnAllClients: key(s) missing on all the clients for collection(s): ");
        sb.append(A002);
        Log.e(sb.toString());
        return true;
    }

    public C195589Va A05() {
        C195589Va A022 = this.A09.A02();
        if (A022 != null) {
            long millis = TimeUnit.DAYS.toMillis((long) this.A01.A04(C21100yf.A1V));
            long A002 = C19970wo.A00(this.A04);
            AnonymousClass9W7 r2 = A022.A00;
            if (A002 - r2.A00 > millis || !A0C(r2)) {
                return null;
            }
            return A022;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019b, code lost:
        if (r3.get((java.lang.Object) null) != null) goto L_0x019d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A06(java.lang.String r14, java.util.Collection r15) {
        /*
            r13 = this;
            X.1AA r2 = r13.A09
            r0 = 0
            r2.A03(r15, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r15)
            java.util.HashMap r3 = A00(r13, r0)
            r4 = 0
            boolean r0 = r3.containsValue(r4)
            if (r0 == 0) goto L_0x01aa
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0024:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            if (r1 == 0) goto L_0x0024
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0024
            r5.add(r1)
            goto L_0x0024
        L_0x0040:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0190
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "SyncdKeyManager/requestMissingKeys syncdKeyIds="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wQ r0 = r13.A00
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r7 = r0.A03
            if (r7 == 0) goto L_0x0105
            boolean r0 = r5.isEmpty()
            r6 = 1
            if (r0 != 0) goto L_0x0105
            java.util.HashSet r0 = r13.A07()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r5)
            r4.removeAll(r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0105
            X.1AH r0 = r13.A07
            java.util.Collection r0 = r0.A00()
            java.util.Iterator r12 = r0.iterator()
        L_0x0086:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r9 = r12.next()
            X.3SB r9 = (X.AnonymousClass3SB) r9
            X.19w r2 = r13.A0B
            X.0wo r0 = r13.A04
            long r0 = X.C19970wo.A00(r0)
            com.whatsapp.jid.DeviceJid r8 = r9.A07
            X.3Qa r10 = r2.A02(r7, r6)
            X.8mk r2 = new X.8mk
            r2.<init>(r10, r0)
            r2.A00 = r8
            java.util.Set r0 = r2.A00
            r0.clear()
            r0.addAll(r4)
            X.1AI r0 = r13.A08
            long r0 = r0.A01(r2)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = "SyncdKeyManager/requestMissingKeys to add peer message, rowId="
            r11.append(r10)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.18P r0 = r13.A06
            X.1M0 r10 = r0.A04()
            X.14e r0 = r10.A02     // Catch:{ all -> 0x00f2 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00e4
            r1 = 27
            X.1iV r0 = new X.1iV     // Catch:{ all -> 0x00f2 }
            r0.<init>(r13, r2, r9, r1)     // Catch:{ all -> 0x00f2 }
            r10.B5o(r0)     // Catch:{ all -> 0x00f2 }
            goto L_0x00ee
        L_0x00e4:
            X.164 r1 = r13.A02     // Catch:{ all -> 0x00f2 }
            com.whatsapp.jobqueue.job.SendPeerMessageJob r0 = new com.whatsapp.jobqueue.job.SendPeerMessageJob     // Catch:{ all -> 0x00f2 }
            r0.<init>(r8, r2)     // Catch:{ all -> 0x00f2 }
            r1.A01(r0)     // Catch:{ all -> 0x00f2 }
        L_0x00ee:
            r10.close()
            goto L_0x0086
        L_0x00f2:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x018b }
            throw r1
        L_0x00f7:
            X.1AB r1 = r13.A03
            int r0 = r4.size()
            X.19n r4 = r1.A01
            long r1 = (long) r0
            java.lang.String r0 = "missing_key_counter"
            r4.A06(r0, r1)
        L_0x0105:
            X.1AJ r0 = r13.A0A
            X.18P r0 = r0.A00
            X.1M0 r4 = r0.A04()
            X.71s r10 = r4.B1k()     // Catch:{ all -> 0x0186 }
            X.14e r2 = r4.A02     // Catch:{ all -> 0x017c }
            java.lang.String r1 = "INSERT OR REPLACE INTO missing_keys (device_id, epoch, collection_name) VALUES (?, ?, ?)"
            java.lang.String r0 = "SyncdMissingKeysTable.INSERT_OR_REPLACE"
            X.6QI r6 = r2.A0C(r1, r0)     // Catch:{ all -> 0x017c }
            java.util.Iterator r9 = r5.iterator()     // Catch:{ all -> 0x017c }
        L_0x011f:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x0165
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x017c }
            X.9jo r5 = (X.C201539jo) r5     // Catch:{ all -> 0x017c }
            r6.A03()     // Catch:{ all -> 0x017c }
            r2 = 1
            int r0 = r5.A00()     // Catch:{ all -> 0x017c }
            long r0 = (long) r0     // Catch:{ all -> 0x017c }
            r6.A05(r2, r0)     // Catch:{ all -> 0x017c }
            r2 = 2
            byte[] r0 = r5.A00     // Catch:{ all -> 0x017c }
            int r0 = X.C203239na.A01(r0, r2)     // Catch:{ all -> 0x017c }
            long r0 = (long) r0     // Catch:{ all -> 0x017c }
            r6.A05(r2, r0)     // Catch:{ all -> 0x017c }
            r0 = 3
            r6.A06(r0, r14)     // Catch:{ all -> 0x017c }
            long r7 = r6.A02()     // Catch:{ all -> 0x017c }
            r1 = -1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x011f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x017c }
            r1.<init>()     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "SyncdMissingKeyStore/storeMissingKeys failed to store missing key: "
            r1.append(r0)     // Catch:{ all -> 0x017c }
            r1.append(r5)     // Catch:{ all -> 0x017c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x017c }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x017c }
            goto L_0x011f
        L_0x0165:
            r10.A00()     // Catch:{ all -> 0x017c }
            r10.close()     // Catch:{ all -> 0x0186 }
            r4.close()
            boolean r0 = A03(r13)
            if (r0 == 0) goto L_0x01aa
            r1 = 71
            X.198 r0 = new X.198
            r0.<init>(r1, r14)
            throw r0
        L_0x017c:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0181 }
            goto L_0x0185
        L_0x0181:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0186 }
        L_0x0185:
            throw r1     // Catch:{ all -> 0x0186 }
        L_0x0186:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x018b }
            throw r1
        L_0x018b:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0190:
            boolean r0 = r3.containsKey(r4)
            if (r0 == 0) goto L_0x019d
            java.lang.Object r0 = r3.get(r4)
            r1 = 1
            if (r0 == 0) goto L_0x019e
        L_0x019d:
            r1 = 0
        L_0x019e:
            java.lang.String r0 = "SyncdKeyManager/resolveKeys: either there are missing keys or active key is missing"
            X.C18740tg.A0F(r1, r0)
            X.9Va r0 = r13.A04()
            r3.put(r4, r0)
        L_0x01aa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A9.A06(java.lang.String, java.util.Collection):java.util.HashMap");
    }

    public HashSet A07() {
        ArrayList A042 = this.A08.A04(39);
        HashSet hashSet = new HashSet();
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            hashSet.addAll(Collections.unmodifiableSet(((C180988mk) it.next()).A00));
        }
        return hashSet;
    }

    public void A08(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdKeyManager/expireKeysWithEpochIfActive expiredKeyEpoch = ");
        sb.append(i);
        Log.i(sb.toString());
        AnonymousClass1AA r2 = this.A09;
        C195589Va A022 = r2.A02();
        if (A022 != null) {
            C201539jo r7 = A022.A01;
            byte[] bArr = r7.A00;
            if (C203239na.A01(bArr, 2) <= i) {
                AnonymousClass1M0 A042 = r2.A00.A04();
                try {
                    A042.A02.A0E("UPDATE crypto_info SET timestamp = 0  WHERE device_id = ?  AND epoch = ? ", "SyncdCryptoInfoTable.EXPIRE_BY_KEY_ID", new String[]{String.valueOf(r7.A00()), String.valueOf(C203239na.A01(bArr, 2))});
                    A042.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
        }
    }

    public void A09(DeviceJid deviceJid, HashMap hashMap, boolean z) {
        AnonymousClass9W7 r9;
        C19730wQ r0 = this.A00;
        r0.A0G();
        PhoneUserJid phoneUserJid = r0.A03;
        if (phoneUserJid != null && !hashMap.isEmpty()) {
            C180998ml r5 = new C180998ml(this.A0B.A02(phoneUserJid, true), C19970wo.A00(this.A04));
            r5.A00 = deviceJid;
            AnonymousClass8NN A0p = AnonymousClass8NW.DEFAULT_INSTANCE.A0p();
            for (Map.Entry entry : hashMap.entrySet()) {
                C201539jo r1 = (C201539jo) entry.getKey();
                C195589Va r02 = (C195589Va) entry.getValue();
                if (r02 != null) {
                    r9 = r02.A00;
                } else {
                    r9 = null;
                }
                AnonymousClass8NN A0p2 = C172708Ow.DEFAULT_INSTANCE.A0p();
                C172288Ng A012 = r1.A01();
                A0p2.A0S();
                C172708Ow r12 = (C172708Ow) A0p2.A00;
                A012.getClass();
                r12.keyId_ = A012;
                r12.bitField0_ |= 1;
                if (r9 != null) {
                    AnonymousClass8NN A0p3 = C172928Ps.DEFAULT_INSTANCE.A0p();
                    byte[] bArr = r9.A02;
                    AnonymousClass8I5 A013 = C21674AUx.A01(bArr, 0, bArr.length);
                    A0p3.A0S();
                    C172928Ps r13 = (C172928Ps) A0p3.A00;
                    r13.bitField0_ |= 1;
                    r13.keyData_ = A013;
                    long j = r9.A00;
                    A0p3.A0S();
                    C172928Ps r8 = (C172928Ps) A0p3.A00;
                    r8.bitField0_ |= 4;
                    r8.timestamp_ = j;
                    AnonymousClass8QY A014 = r9.A01.A01();
                    A0p3.A0S();
                    C172928Ps r14 = (C172928Ps) A0p3.A00;
                    A014.getClass();
                    r14.fingerprint_ = A014;
                    r14.bitField0_ |= 2;
                    C172928Ps r03 = (C172928Ps) A0p3.A0R();
                    A0p2.A0S();
                    C172708Ow r15 = (C172708Ow) A0p2.A00;
                    r03.getClass();
                    r15.keyData_ = r03;
                    r15.bitField0_ |= 2;
                }
                C170918Hz A0R = A0p2.A0R();
                A0p.A0S();
                AnonymousClass8NW r2 = (AnonymousClass8NW) A0p.A00;
                A0R.getClass();
                C23122B6c b6c = r2.keys_;
                if (!((C21886AcE) b6c).A00) {
                    b6c = C170918Hz.A0A(b6c);
                    r2.keys_ = b6c;
                }
                b6c.add(A0R);
            }
            r5.A00 = (AnonymousClass8NW) A0p.A0R();
            r5.A01 = z;
            if (this.A08.A01(r5) < 0) {
                Log.e("SyncdKeyManager/shareKeys unable to add peer message");
            } else {
                this.A02.A01(new SendPeerMessageJob(deviceJid, r5));
            }
        }
    }

    public void A0A(Set set) {
        C1495671s B1k;
        AnonymousClass1M0 A042 = this.A09.A00.A04();
        try {
            B1k = A042.B1k();
            AnonymousClass6QI A0C = A042.A02.A0C("INSERT OR IGNORE INTO crypto_info (device_id, epoch, key_data, timestamp, fingerprint) VALUES (?, ?, ?, ?, ?)", "SyncdCryptoInfoTable.INSERT_OR_IGNORE");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C195589Va r3 = (C195589Va) it.next();
                A0C.A03();
                C201539jo r6 = r3.A01;
                A0C.A05(1, (long) r6.A00());
                A0C.A05(2, (long) C203239na.A01(r6.A00, 2));
                AnonymousClass9W7 r32 = r3.A00;
                A0C.A07(3, r32.A02);
                A0C.A05(4, r32.A00);
                A0C.A07(5, r32.A01.A01().A0o());
                if (A0C.A02() == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SyncdCryptoStore/saveKey failed to store key: ");
                    sb.append(r6);
                    Log.e(sb.toString());
                }
            }
            B1k.A00();
            B1k.close();
            A042.close();
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A0B() {
        Iterator it = this.A08.A04(38).iterator();
        while (it.hasNext()) {
            C180998ml r1 = (C180998ml) it.next();
            if (!r1.A01 && r1.A01) {
                return true;
            }
        }
        return false;
    }

    public boolean A0C(AnonymousClass9W7 r8) {
        String str;
        C200039gT r6 = r8.A01;
        int i = r6.A01;
        C19420v0 r1 = this.A05;
        if (i != r1.A04()) {
            str = "SyncdKeyManager/verifyFingerprintOfKey: fingerprint mismatch: rawId did not match";
        } else {
            int A032 = r1.A03();
            HashSet hashSet = new HashSet(r6.A02);
            int i2 = r6.A00;
            while (true) {
                i2++;
                if (i2 > A032) {
                    break;
                }
                hashSet.add(Integer.valueOf(i2));
            }
            if (A01().equals(hashSet)) {
                return true;
            }
            str = "SyncdKeyManager/verifyFingerprintOfKey: fingerprint mismatch: one of a peer device is no longer registered";
        }
        Log.i(str);
        return false;
    }

    public AnonymousClass1A9(C19730wQ r1, C21100yf r2, AnonymousClass164 r3, AnonymousClass1AB r4, C19970wo r5, C19420v0 r6, AnonymousClass18P r7, AnonymousClass1AH r8, AnonymousClass1AI r9, AnonymousClass1AA r10, AnonymousClass1AJ r11, C237919w r12) {
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A06 = r7;
        this.A02 = r3;
        this.A09 = r10;
        this.A03 = r4;
        this.A07 = r8;
        this.A08 = r9;
        this.A0B = r12;
        this.A05 = r6;
        this.A0A = r11;
    }

    public C195589Va A04() {
        if (!A0B()) {
            int A012 = this.A09.A01();
            if (A012 == 0) {
                A012 = new SecureRandom().nextInt(65536);
            }
            C201539jo r7 = new C201539jo(this.A00.A04(), A012 + 1);
            byte[] A0H = C18750th.A0H(32);
            long A002 = C19970wo.A00(this.A04);
            C19420v0 r0 = this.A05;
            C195589Va r5 = new C195589Va(new AnonymousClass9W7(new C200039gT(A01(), r0.A04(), r0.A03()), A0H, A002), r7);
            StringBuilder sb = new StringBuilder();
            sb.append("SyncdKeyManager/generateAndShareNewKey syncdKey = ");
            sb.append(r5);
            Log.i(sb.toString());
            Collection<AnonymousClass3SB> A003 = this.A07.A00();
            if (A003.isEmpty()) {
                A02(this);
                A0A(Collections.singleton(r5));
                return r5;
            }
            for (AnonymousClass3SB r3 : A003) {
                A09(r3.A07, new HashMap(Collections.singletonMap(r5.A01, r5)), true);
            }
        }
        return null;
    }
}
