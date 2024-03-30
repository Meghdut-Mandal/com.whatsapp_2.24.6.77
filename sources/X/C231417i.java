package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.17i  reason: invalid class name and case insensitive filesystem */
public class C231417i {
    public final C19730wQ A00;
    public final C19970wo A01;
    public final C19420v0 A02;
    public final C232217q A03;
    public final C231517j A04;
    public final C19700wN A05;

    public static C20070wy A00(C231417i r5, boolean z) {
        Object obj;
        Object obj2;
        C20070wy A002 = r5.A04.A04.A00();
        C20090x0 r3 = new C20090x0();
        C225614x it = A002.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            r3.put(entry.getKey(), Long.valueOf((long) ((AnonymousClass3SB) entry.getValue()).A04));
        }
        C19730wQ r1 = r5.A00;
        if (r1.A0L()) {
            if (z) {
                obj2 = r1.A07();
            } else {
                r1.A0G();
                obj2 = r1.A02;
            }
            r3.put(obj2, Long.valueOf((long) r5.A02.A03()));
        } else {
            if (z) {
                obj = r1.A07();
            } else {
                r1.A0G();
                obj = r1.A02;
            }
            r3.put(obj, 0L);
        }
        return r3.build();
    }

    public C20760y7 A02() {
        C19730wQ r0 = this.A00;
        r0.A0G();
        if (r0.A03 == null) {
            return C20760y7.of();
        }
        return this.A04.A04().keySet();
    }

    public AnonymousClass3QO A03() {
        C19420v0 r0 = this.A02;
        int A042 = r0.A04();
        AnonymousClass005 r4 = r0.A00;
        return new AnonymousClass3QO(C52772q9.E2EE, A042, ((SharedPreferences) r4.get()).getLong("adv_timestamp_sec", -1), ((SharedPreferences) r4.get()).getLong("adv_expected_timestamp_sec_in_companion_mode", 0), ((SharedPreferences) r4.get()).getLong("adv_expected_ts_last_device_job_ts_in_companion_mode", 0), ((SharedPreferences) r4.get()).getLong("adv_expected_ts_update_ts_in_companion_mode", 0));
    }

    public AnonymousClass3QO A04(AnonymousClass3QO r15, long j) {
        long j2 = r15.A05;
        long j3 = j;
        if (j2 < j) {
            long j4 = r15.A02;
            if (j4 < j) {
                long j5 = ((SharedPreferences) this.A02.A00.get()).getLong("adv_last_device_job_ts", 0);
                long j6 = r15.A03;
                if (j2 >= j4) {
                    j6 = this.A01.A06();
                }
                return new AnonymousClass3QO(r15.A01, r15.A00, j2, j3, j5, j6);
            }
        }
        return r15;
    }

    public AnonymousClass3QO A05(UserJid userJid) {
        if (userJid == null) {
            return null;
        }
        if (this.A00.A0M(userJid)) {
            return A03();
        }
        C231517j r2 = this.A04;
        C18740tg.A0F(!r2.A00.A0M(userJid), "only query info for others");
        return r2.A02.A01(userJid);
    }

    public C52772q9 A06(UserJid userJid) {
        C18740tg.A0F(!this.A00.A0M(userJid), "use HostedCompanionDeviceManager to get self state");
        AnonymousClass3QO A052 = A05(userJid);
        if (A052 == null || A052.A00 != 1) {
            return C52772q9.E2EE;
        }
        return C52772q9.HOSTED;
    }

    public String A07(UserJid userJid) {
        if (userJid == null) {
            return "";
        }
        HashSet hashSet = new HashSet(A0B(userJid));
        return !hashSet.isEmpty() ? AnonymousClass6UD.A03(hashSet) : "";
    }

    public HashMap A08(Set set) {
        HashSet hashSet;
        DeviceJid deviceJid;
        HashMap hashMap = new HashMap();
        HashSet hashSet2 = new HashSet(set);
        C19730wQ r6 = this.A00;
        r6.A0G();
        PhoneUserJid phoneUserJid = r6.A03;
        C223313w A08 = r6.A08();
        if (set.contains(phoneUserJid)) {
            HashSet A0A = A0A();
            r6.A0G();
            C223413x r0 = r6.A02;
            C18740tg.A06(r0);
            A0A.add(r0);
            hashMap.put(phoneUserJid, A0A);
            hashSet2.remove(phoneUserJid);
        }
        if (set.contains(A08)) {
            HashSet A09 = A09();
            C177508du A07 = r6.A07();
            C18740tg.A06(A07);
            A09.add(A07);
            hashMap.put(A08, A09);
            hashSet2.remove(A08);
        }
        C231617k r02 = this.A04.A05;
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : r02.A01(hashSet2).entrySet()) {
            hashMap2.put(entry.getKey(), ((C20070wy) entry.getValue()).keySet());
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) it.next();
            if (hashMap2.containsKey(userJid)) {
                Object obj = hashMap2.get(userJid);
                C18740tg.A06(obj);
                hashSet = new HashSet((Collection) obj);
            } else {
                hashSet = new HashSet();
            }
            C223113u r03 = DeviceJid.Companion;
            if (userJid != null) {
                deviceJid = userJid.getPrimaryDevice();
            } else {
                deviceJid = null;
            }
            C18740tg.A06(deviceJid);
            hashSet.add(deviceJid);
            hashMap.put(userJid, hashSet);
        }
        return hashMap;
    }

    public HashSet A09() {
        Object r0;
        HashSet hashSet = new HashSet();
        C223313w A08 = this.A00.A08();
        if (A08 != null) {
            C225614x it = A02().iterator();
            while (it.hasNext()) {
                DeviceJid deviceJid = (DeviceJid) it.next();
                if (deviceJid.userJid instanceof PhoneUserJid) {
                    try {
                        int device = deviceJid.getDevice();
                        if (device == 99) {
                            r0 = new C177608e4(A08, device);
                        } else {
                            r0 = new C177508du(A08, device);
                        }
                        hashSet.add(r0);
                    } catch (C19740wR e) {
                        Log.w("Failed to map to LID companion", e);
                    }
                }
            }
        }
        return hashSet;
    }

    public HashSet A0A() {
        HashSet hashSet = new HashSet();
        C225614x it = A02().iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid.userJid instanceof PhoneUserJid) {
                hashSet.add(deviceJid);
            }
        }
        return hashSet;
    }

    public HashSet A0B(UserJid userJid) {
        HashSet A09;
        Object A07;
        C19730wQ r2 = this.A00;
        r2.A0G();
        if (userJid.equals(r2.A03)) {
            A09 = A0A();
            r2.A0G();
            A07 = r2.A02;
        } else if (userJid.equals(r2.A08())) {
            A09 = A09();
            A07 = r2.A07();
        } else {
            HashSet hashSet = new HashSet(this.A04.A05(userJid).keySet());
            C223113u r0 = DeviceJid.Companion;
            DeviceJid primaryDevice = userJid.getPrimaryDevice();
            C18740tg.A06(primaryDevice);
            hashSet.add(primaryDevice);
            return hashSet;
        }
        C18740tg.A06(A07);
        A09.add(A07);
        return A09;
    }

    public Map A0C(UserJid userJid) {
        if (this.A00.A0M(userJid)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(this.A04.A05(userJid));
        DeviceJid primaryDevice = userJid.getPrimaryDevice();
        C18740tg.A06(primaryDevice);
        hashMap.put(primaryDevice, 0L);
        return hashMap;
    }

    public void A0D(C20760y7 r5, UserJid userJid) {
        HashSet hashSet = new HashSet(r5);
        C231517j r2 = this.A04;
        hashSet.retainAll(r2.A05(userJid).keySet());
        if (!hashSet.isEmpty()) {
            r2.A09(C20760y7.copyOf((Collection) hashSet), userJid, (String) null);
            if (!hashSet.isEmpty()) {
                this.A03.A00(userJid, Collections.emptySet(), hashSet);
            }
        }
    }

    public void A0E(AnonymousClass3QO r8, UserJid userJid) {
        C1495671s B1k;
        C19730wQ r1 = this.A00;
        if (r1.A0M(userJid)) {
            C18740tg.A0B(r1.A0L());
            C19420v0 r4 = this.A02;
            C19420v0.A00(r4).putInt("adv_raw_id", r8.A01).apply();
            C19420v0.A00(r4).putLong("adv_timestamp_sec", r8.A05).apply();
            C19420v0.A00(r4).putLong("adv_expected_timestamp_sec_in_companion_mode", r8.A02).apply();
            C19420v0.A00(r4).putLong("adv_expected_ts_last_device_job_ts_in_companion_mode", r8.A04).apply();
            C19420v0.A00(r4).putLong("adv_expected_ts_update_ts_in_companion_mode", r8.A03).apply();
            return;
        }
        C231517j r6 = this.A04;
        Set A0G = r6.A03.A0G(userJid);
        AnonymousClass1M0 A052 = r6.A01.A05();
        try {
            B1k = A052.B1k();
            Iterator it = A0G.iterator();
            while (true) {
                if (!it.hasNext()) {
                    B1k.A00();
                    break;
                }
                UserJid userJid2 = (UserJid) it.next();
                C231817m r12 = r6.A02;
                if (C231517j.A03(A052, r12.A01(userJid2), r8, r6, userJid2)) {
                    r12.A03(r8, userJid2);
                }
            }
            B1k.close();
            A052.close();
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0F(UserJid userJid, String str) {
        C18740tg.A0C(!this.A00.A0M(userJid));
        C231517j r3 = this.A04;
        HashSet hashSet = new HashSet(r3.A05(userJid).keySet());
        hashSet.remove(userJid.getPrimaryDevice());
        HashSet hashSet2 = new HashSet(r3.A05(userJid).keySet());
        hashSet2.remove(userJid.getPrimaryDevice());
        r3.A09(C20760y7.copyOf((Collection) hashSet2), userJid, str);
        if (!hashSet.isEmpty()) {
            this.A03.A00(userJid, Collections.emptySet(), hashSet);
        }
    }

    public void A0G(UserJid userJid, HashMap hashMap) {
        String str;
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!((DeviceJid) entry.getKey()).userJid.equals(userJid)) {
                hashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (hashMap2.size() > 0) {
            C19700wN r3 = this.A05;
            StringBuilder sb = new StringBuilder();
            sb.append("userJid=");
            sb.append(userJid);
            sb.append("; deviceJids=");
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                sb2.append(",");
                sb2.append(entry2.getKey());
                sb2.append(":");
                sb2.append(entry2.getValue());
            }
            if (sb2.length() > 0) {
                str = sb2.substring(1);
            } else {
                str = "no-data-found";
            }
            sb.append(str);
            r3.A0E("userdevicemanager/invalid_devices", sb.toString(), false);
            for (Object remove : hashMap2.keySet()) {
                hashMap.remove(remove);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0161, code lost:
        r20.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0167, code lost:
        r2.close();
        r2 = r30.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r20 = r2.B1k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r12 = r21.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017a, code lost:
        if (r12.hasNext() == false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017c, code lost:
        r10 = (com.whatsapp.jid.UserJid) r12.next();
        r11 = (X.C123275wE) r3.get(r10);
        X.C18740tg.A06(r11);
        r9 = r11.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0191, code lost:
        if (r9.isEmpty() == false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0193, code lost:
        r1 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0199, code lost:
        if (r1.isEmpty() == false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019b, code lost:
        if (r35 == false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019d, code lost:
        X.C231517j.A02(r11.A00.keySet(), r1, r9, r4, r10, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b0, code lost:
        if (r33 == null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b2, code lost:
        r1 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bc, code lost:
        if (X.C231517j.A03(r2, r1.A01(r10), r8, r4, r10) == false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01be, code lost:
        r1.A03(r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c1, code lost:
        X.C231517j.A01(r11.A00.keySet(), r11.A02, r9, r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01cd, code lost:
        r20.A00();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H(X.C20070wy r32, X.AnonymousClass3QO r33, com.whatsapp.jid.UserJid r34, boolean r35) {
        /*
            r31 = this;
            r6 = r31
            X.0wQ r0 = r6.A00
            r7 = r34
            boolean r0 = r0.A0M(r7)
            r1 = r0 ^ 1
            java.lang.String r0 = "cannot refresh yourself device"
            X.C18740tg.A0F(r1, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r32
            r0.<init>(r1)
            r6.A0G(r7, r0)
            X.0wy r5 = X.C20070wy.copyOf((java.util.Map) r0)
            X.17j r4 = r6.A04
            X.0wy r22 = r4.A05(r7)
            X.0y7 r1 = r5.keySet()
            X.9ww r0 = X.C207759ww.A00
            boolean r0 = X.AnonymousClass6XG.A02(r0, r1)
            r1 = 1
            r8 = r33
            if (r0 == 0) goto L_0x003a
            if (r33 == 0) goto L_0x0213
            int r0 = r8.A00
            if (r0 != r1) goto L_0x0213
        L_0x003a:
            X.0wQ r0 = r4.A00
            boolean r0 = r0.A0M(r7)
            r1 = r0 ^ 1
            java.lang.String r0 = "only refresh devices for others"
            X.C18740tg.A0F(r1, r0)
            X.0y7 r1 = r5.keySet()
            com.whatsapp.jid.DeviceJid r0 = r7.getPrimaryDevice()
            boolean r1 = r1.contains(r0)
            java.lang.String r0 = "device list should always include primary."
            X.C18740tg.A0F(r1, r0)
            X.12O r0 = r4.A03
            java.util.Set r21 = r0.A0G(r7)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r2 = r21.iterator()
        L_0x0067:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.5wE r0 = new X.5wE
            r0.<init>(r5, r4, r1)
            r3.put(r1, r0)
            goto L_0x0067
        L_0x007c:
            X.12P r0 = r4.A01
            r30 = r0
            X.1M0 r2 = r30.A05()
            X.71s r20 = r2.B1k()     // Catch:{ all -> 0x0209 }
            java.util.Iterator r19 = r21.iterator()     // Catch:{ all -> 0x01ff }
        L_0x008c:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x01ff }
            r28 = r35
            if (r0 == 0) goto L_0x0161
            java.lang.Object r10 = r19.next()     // Catch:{ all -> 0x01ff }
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10     // Catch:{ all -> 0x01ff }
            java.lang.Object r11 = r3.get(r10)     // Catch:{ all -> 0x01ff }
            X.5wE r11 = (X.C123275wE) r11     // Catch:{ all -> 0x01ff }
            X.C18740tg.A06(r11)     // Catch:{ all -> 0x01ff }
            X.0y7 r0 = r11.A02     // Catch:{ all -> 0x01ff }
            r24 = r0
            boolean r0 = r24.isEmpty()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x00b5
            X.0y7 r0 = r11.A03     // Catch:{ all -> 0x01ff }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01ff }
            if (r0 != 0) goto L_0x008c
        L_0x00b5:
            X.17k r12 = r4.A05     // Catch:{ all -> 0x01ff }
            X.0wy r0 = r11.A01     // Catch:{ all -> 0x01ff }
            r23 = r0
            X.12P r0 = r12.A02     // Catch:{ all -> 0x01ff }
            X.1M0 r9 = r0.A05()     // Catch:{ all -> 0x01ff }
            X.71s r18 = r9.B1k()     // Catch:{ all -> 0x0157 }
            X.12j r0 = r12.A01     // Catch:{ all -> 0x014d }
            long r16 = r0.A07(r10)     // Catch:{ all -> 0x014d }
            X.14e r15 = r9.A02     // Catch:{ all -> 0x014d }
            java.lang.String r14 = "user_device"
            java.lang.String r13 = "user_jid_row_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x014d }
            java.lang.String r16 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x014d }
            r0 = 0
            r1[r0] = r16     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "DELETE_USER_DEVICE_JIDS_SQL"
            r15.A03(r14, r13, r0, r1)     // Catch:{ all -> 0x014d }
            X.0y7 r0 = r23.entrySet()     // Catch:{ all -> 0x014d }
            X.14x r15 = r0.iterator()     // Catch:{ all -> 0x014d }
        L_0x00e8:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x011b
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x014d }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ all -> 0x014d }
            java.lang.Object r0 = r14.getKey()     // Catch:{ all -> 0x014d }
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0     // Catch:{ all -> 0x014d }
            int r0 = r0.getDevice()     // Catch:{ all -> 0x014d }
            com.whatsapp.jid.DeviceJid r13 = com.whatsapp.jid.DeviceJid.getFromUserJidAndDeviceIdNullable(r10, r0)     // Catch:{ all -> 0x014d }
            r1 = 0
            if (r13 == 0) goto L_0x0106
            r1 = 1
        L_0x0106:
            java.lang.String r0 = "DeviceJid must not be null"
            X.C18740tg.A0D(r1, r0)     // Catch:{ all -> 0x014d }
            if (r13 == 0) goto L_0x00e8
            java.lang.Object r0 = r14.getValue()     // Catch:{ all -> 0x014d }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x014d }
            long r0 = r0.longValue()     // Catch:{ all -> 0x014d }
            r12.A03(r13, r10, r0)     // Catch:{ all -> 0x014d }
            goto L_0x00e8
        L_0x011b:
            r18.A00()     // Catch:{ all -> 0x014d }
            X.C231617k.A00(r9, r12, r10)     // Catch:{ all -> 0x014d }
            r18.close()     // Catch:{ all -> 0x0157 }
            r9.close()     // Catch:{ all -> 0x01ff }
            if (r33 == 0) goto L_0x0138
            X.17m r1 = r4.A02     // Catch:{ all -> 0x01ff }
            X.3QO r0 = r1.A01(r10)     // Catch:{ all -> 0x01ff }
            boolean r0 = X.C231517j.A03(r2, r0, r8, r4, r10)     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x01d0
            r1.A03(r8, r10)     // Catch:{ all -> 0x01ff }
        L_0x0138:
            X.0wy r0 = r11.A00     // Catch:{ all -> 0x01ff }
            X.0y7 r23 = r0.keySet()     // Catch:{ all -> 0x01ff }
            X.0y7 r0 = r11.A03     // Catch:{ all -> 0x01ff }
            r29 = 0
            r25 = r0
            r26 = r4
            r27 = r10
            X.C231517j.A02(r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x01ff }
            goto L_0x008c
        L_0x014d:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0152 }
            goto L_0x0156
        L_0x0152:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0157 }
        L_0x0156:
            throw r1     // Catch:{ all -> 0x0157 }
        L_0x0157:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x015c }
            goto L_0x0160
        L_0x015c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01ff }
        L_0x0160:
            throw r1     // Catch:{ all -> 0x01ff }
        L_0x0161:
            r20.A00()     // Catch:{ all -> 0x01ff }
            r20.close()     // Catch:{ all -> 0x0209 }
            r2.close()
            X.1M0 r2 = r30.A05()
            X.71s r20 = r2.B1k()     // Catch:{ all -> 0x0209 }
            java.util.Iterator r12 = r21.iterator()     // Catch:{ all -> 0x01ff }
        L_0x0176:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x01cd
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x01ff }
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10     // Catch:{ all -> 0x01ff }
            java.lang.Object r11 = r3.get(r10)     // Catch:{ all -> 0x01ff }
            X.5wE r11 = (X.C123275wE) r11     // Catch:{ all -> 0x01ff }
            X.C18740tg.A06(r11)     // Catch:{ all -> 0x01ff }
            X.0y7 r9 = r11.A03     // Catch:{ all -> 0x01ff }
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x01c1
            X.0y7 r1 = r11.A02     // Catch:{ all -> 0x01ff }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x01c1
            if (r35 == 0) goto L_0x01b0
            X.0wy r0 = r11.A00     // Catch:{ all -> 0x01ff }
            X.0y7 r13 = r0.keySet()     // Catch:{ all -> 0x01ff }
            r18 = 1
            r19 = 0
            r14 = r1
            r15 = r9
            r16 = r4
            r17 = r10
            X.C231517j.A02(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01ff }
        L_0x01b0:
            if (r33 == 0) goto L_0x01c1
            X.17m r1 = r4.A02     // Catch:{ all -> 0x01ff }
            X.3QO r0 = r1.A01(r10)     // Catch:{ all -> 0x01ff }
            boolean r0 = X.C231517j.A03(r2, r0, r8, r4, r10)     // Catch:{ all -> 0x01ff }
            if (r0 == 0) goto L_0x01d0
            r1.A03(r8, r10)     // Catch:{ all -> 0x01ff }
        L_0x01c1:
            X.0wy r0 = r11.A00     // Catch:{ all -> 0x01ff }
            X.0y7 r1 = r0.keySet()     // Catch:{ all -> 0x01ff }
            X.0y7 r0 = r11.A02     // Catch:{ all -> 0x01ff }
            X.C231517j.A01(r1, r0, r9, r4, r10)     // Catch:{ all -> 0x01ff }
            goto L_0x0176
        L_0x01cd:
            r20.A00()     // Catch:{ all -> 0x01ff }
        L_0x01d0:
            r20.close()     // Catch:{ all -> 0x0209 }
            r2.close()
            r0 = r22
            X.0y7 r0 = X.AnonymousClass6UD.A01(r5, r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            r0 = r22
            X.0y7 r0 = X.AnonymousClass6UD.A02(r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            X.17q r0 = r6.A03
            r0.A00(r7, r2, r1)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x01fd
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0218
        L_0x01fd:
            r0 = 1
            return r0
        L_0x01ff:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x0204 }
            goto L_0x0208
        L_0x0204:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0209 }
        L_0x0208:
            throw r1     // Catch:{ all -> 0x0209 }
        L_0x0209:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x020e }
            throw r1
        L_0x020e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0213:
            java.lang.String r0 = "DeviceManager/refreshDevicesForUser cannot add hosted device with adv e2ee"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0218:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231417i.A0H(X.0wy, X.3QO, com.whatsapp.jid.UserJid, boolean):boolean");
    }

    public C231417i(C19700wN r1, C19730wQ r2, C19970wo r3, C19420v0 r4, C232217q r5, C231517j r6) {
        this.A01 = r3;
        this.A05 = r1;
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
    }

    public long A01(UserJid userJid) {
        AnonymousClass3QO A052 = A05(userJid);
        if (A052 == null) {
            return 0;
        }
        return A052.A05;
    }

    public boolean A0I(UserJid userJid, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(A0B(userJid));
        return AnonymousClass6UD.A03(hashSet).equals(str);
    }
}
