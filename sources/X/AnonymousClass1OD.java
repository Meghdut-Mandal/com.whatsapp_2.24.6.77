package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.1OD  reason: invalid class name */
public class AnonymousClass1OD {
    public WeakHashMap A00 = new WeakHashMap();
    public final C19700wN A01;
    public final C19730wQ A02;
    public final AnonymousClass1OF A03;
    public final C25951Ih A04;
    public final C27301Nr A05;
    public final C19970wo A06;
    public final AnonymousClass189 A07;
    public final C236419g A08;
    public final AnonymousClass1OE A09;
    public final C24951Ek A0A;
    public final C231417i A0B;
    public final C20810yC A0C;
    public final C232417s A0D;
    public final AnonymousClass1OG A0E;
    public final C237819v A0F;
    public final AnonymousClass18I A0G;
    public final AnonymousClass1FN A0H;
    public final C20320xN A0I;

    public static AnonymousClass3IG A02(byte[] bArr, byte b) {
        try {
            return C133256Xm.A01(C203239na.A05(new byte[]{b}, bArr));
        } catch (AnonymousClass110 e) {
            Log.e("DeviceVerificationUtil/generatePublicIdentityKey invalidKeyException", e);
            return null;
        }
    }

    public AnonymousClass00I A06(UserJid userJid, byte[] bArr) {
        AnonymousClass3FZ r3;
        boolean z;
        String str;
        int i = 1;
        try {
            C172898Pp r6 = (C172898Pp) C170918Hz.A08(C172898Pp.DEFAULT_INSTANCE, bArr);
            AnonymousClass3FZ A0B2 = this.A07.A0B(C133256Xm.A02(userJid.getPrimaryDevice()));
            if ((r6.bitField0_ & 4) != 0) {
                r3 = new AnonymousClass3FZ(new AnonymousClass3IG(r6.accountSignatureKey_.A06(), (byte) 5));
            } else {
                r3 = null;
            }
            if (A0B2 != null) {
                z = false;
            } else if (r3 != null) {
                z = true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("DeviceADVInfoHandler/getPublicKeyFromUserJidOrIndexList/no primary identity. userJid=");
                sb.append(userJid);
                Log.w(sb.toString());
                this.A0I.A01(Collections.singletonList(userJid.getPrimaryDevice()));
                AnonymousClass1OE r2 = this.A09;
                AnonymousClass2N9 r1 = new AnonymousClass2N9();
                r1.A00 = 2;
                r2.A00.Bly(r1);
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DeviceADVInfoHandler/getPublicKeyFromUserJidOrIndexList/use public key from: ");
            if (z) {
                str = "adv";
            } else {
                str = "local";
            }
            sb2.append(str);
            Log.i(sb2.toString());
            AnonymousClass3FZ r4 = A0B2;
            if (z) {
                r4 = r3;
            }
            if (!(A0B2 == null || r3 == null || A0B2.A00.equals(r3.A00))) {
                Log.w("DeviceADVInfoManager/verifyADVSignedKeyIndexList/identity public key mismatch");
            }
            byte[] A062 = r6.details_.A06();
            if (!C133256Xm.A06(r4.A00, C203239na.A05(C19430v1.A0J, A062), r6.accountSignature_.A06())) {
                Log.w("DeviceADVInfoManager/verifyADVSignedKeyIndexList/fail to verify account signature");
                this.A0I.A01(Collections.singletonList(userJid.getPrimaryDevice()));
                AnonymousClass1OE r22 = this.A09;
                if (z) {
                    i = 2;
                }
                AnonymousClass2N7 r12 = new AnonymousClass2N7();
                r12.A00 = Integer.valueOf(i);
                r22.A00.Bly(r12);
                return null;
            }
            try {
                C170918Hz A082 = C170918Hz.A08(AnonymousClass8RP.DEFAULT_INSTANCE, A062);
                if (!z) {
                    r4 = null;
                }
                return new AnonymousClass00I(A082, r4);
            } catch (AnonymousClass186 e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("DeviceADVInfoManager/verifyADVSignedKeyIndexList/ADVKeyIndexList invalidProto:");
                sb3.append(e.getMessage());
                Log.e(sb3.toString());
                this.A09.A00(4);
                return null;
            }
        } catch (AnonymousClass186 e2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("DeviceADVInfoManager/verifyADVSignedKeyIndexList/ADVSignedKeyIndexList invalidProto:");
            sb4.append(e2.getMessage());
            Log.e(sb4.toString());
            this.A09.A00(3);
            return null;
        }
    }

    public boolean A0D(DeviceJid deviceJid, AnonymousClass630 r11, byte[] bArr, int i) {
        byte[] bArr2;
        DeviceJid deviceJid2 = deviceJid;
        if (deviceJid == null || deviceJid.getDevice() == 0 || r11 == null || r11.A00 != 1) {
            return true;
        }
        byte[] bArr3 = r11.A02;
        try {
            bArr2 = C133256Xm.A01(C200529hY.A01(((AnonymousClass8RU) C170918Hz.A04(C21674AUx.A01(bArr3, 1, bArr3.length - 1), AnonymousClass8RU.DEFAULT_INSTANCE)).identityKey_.A06()).A00()).A01;
        } catch (AnonymousClass110 | AnonymousClass186 | AnonymousClass18E e) {
            Log.e("DeviceVerificationUtil/extractIdentityFromCipherText/fail to get key", e);
            bArr2 = null;
        }
        return A0E(deviceJid2, bArr, bArr2, (byte) 5, i);
    }

    private AnonymousClass8I5 A00(C20070wy r10, UserJid userJid, Map map, Set set) {
        HashSet hashSet = new HashSet();
        boolean z = true;
        if (r10.size() > 1) {
            boolean A0M = this.A02.A0M(userJid);
            ArrayList arrayList = new ArrayList();
            C225614x it = r10.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    DeviceJid deviceJid = (DeviceJid) ((Map.Entry) it.next()).getKey();
                    Object obj = map.get(C133256Xm.A02(deviceJid));
                    if (obj == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DeviceADVInfoManager/getKeyHash cannot find identity key for device=");
                        sb.append(deviceJid);
                        sb.append("; isMe=");
                        sb.append(A0M);
                        Log.w(sb.toString());
                        if (A0M) {
                            break;
                        }
                        hashSet.add(deviceJid);
                    } else {
                        arrayList.add(obj);
                    }
                } else {
                    z = false;
                    if (!arrayList.isEmpty()) {
                        if (!hashSet.isEmpty() && !A0M) {
                            C225614x it2 = r10.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                if (!hashSet.contains(entry.getKey())) {
                                    set.add(Integer.valueOf(((Number) entry.getValue()).intValue()));
                                }
                            }
                        }
                        try {
                            byte[] A052 = A05(MessageDigest.getInstance("SHA-256"), arrayList);
                            int A002 = C20800yB.A00(C21000yV.A02, this.A0C, 310);
                            byte[] bArr = new byte[A002];
                            System.arraycopy(A052, 0, bArr, 0, A002);
                            return C21674AUx.A01(bArr, 0, A002);
                        } catch (NoSuchAlgorithmException e) {
                            Log.e("DeviceADVInfoManager/getKeyHash no such algorithm exception", e);
                            this.A09.A04(false);
                            return null;
                        }
                    }
                }
            }
            this.A09.A04(z);
        }
        return null;
    }

    private AnonymousClass8I5 A01(UserJid userJid, Set set) {
        Map A0C2;
        Set<DeviceJid> keySet;
        AnonymousClass3FZ A0B2;
        C19730wQ r4 = this.A02;
        boolean A0M = r4.A0M(userJid);
        if (A0M) {
            A0C2 = new HashMap();
            keySet = this.A0B.A0B(userJid);
        } else {
            A0C2 = this.A0B.A0C(userJid);
            keySet = A0C2.keySet();
        }
        HashSet hashSet = new HashSet();
        if (keySet.size() > 1) {
            ArrayList arrayList = new ArrayList();
            for (DeviceJid deviceJid : keySet) {
                if (r4.A0O(deviceJid)) {
                    A0B2 = this.A07.A00.A04().A01;
                } else {
                    A0B2 = this.A07.A0B(C133256Xm.A02(deviceJid));
                }
                if (A0B2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DeviceADVInfoManager/getKeyHash cannot find identity key for device=");
                    sb.append(deviceJid);
                    sb.append("; isMe=");
                    sb.append(A0M);
                    Log.w(sb.toString());
                    if (A0M) {
                        this.A09.A04(true);
                    } else {
                        hashSet.add(deviceJid);
                    }
                } else {
                    arrayList.add(A0B2);
                }
            }
            if (arrayList.isEmpty()) {
                this.A09.A04(false);
                return null;
            }
            if (!hashSet.isEmpty()) {
                for (Map.Entry entry : A0C2.entrySet()) {
                    if (!hashSet.contains(entry.getKey())) {
                        set.add(Integer.valueOf(((Number) entry.getValue()).intValue()));
                    }
                }
            }
            try {
                byte[] A052 = A05(MessageDigest.getInstance("SHA-256"), arrayList);
                int A002 = C20800yB.A00(C21000yV.A02, this.A0C, 310);
                byte[] bArr = new byte[A002];
                System.arraycopy(A052, 0, bArr, 0, A002);
                return C21674AUx.A01(bArr, 0, A002);
            } catch (NoSuchAlgorithmException e) {
                Log.e("DeviceADVInfoManager/getKeyHash no such algorithm exception", e);
                this.A09.A04(false);
                return null;
            }
        }
        return null;
    }

    private void A03(UserJid userJid, long j) {
        C231417i r1 = this.A0B;
        AnonymousClass3QO A052 = r1.A05(userJid);
        if (A052 != null) {
            r1.A0E(r1.A04(A052, j), userJid);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceADVInfoManager/updateDeviceInfoWithExpectedTs user has no device info, user=");
        sb.append(userJid);
        Log.w(sb.toString());
    }

    public static boolean A04(AnonymousClass1OD r12, UserJid userJid, AnonymousClass8RP r14, C19960wn r15, long j) {
        Object valueOf;
        long j2;
        long j3 = j;
        if (r14 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("DeviceADVInfoManager/verifyKeyIndexListData/verifyKeyIndexListData fail keyIndexListNull, userJid=");
            sb.append(userJid);
            Log.w(sb.toString());
            return false;
        }
        long j4 = r14.timestamp_;
        if (j != j4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DeviceADVInfoManager/verifyKeyIndexListData/verifyKeyIndexListData advTimestampMismatch; ts=");
            sb2.append(j3);
            sb2.append("; advts=");
            sb2.append(j4);
            Log.w(sb2.toString());
            AnonymousClass1OE r7 = r12.A09;
            long j5 = r14.timestamp_;
            AnonymousClass2O7 r1 = new AnonymousClass2O7();
            r1.A01 = Long.valueOf(j / 3600);
            r1.A00 = Long.valueOf(j5 / 3600);
            r7.A00.Bly(r1);
            return false;
        }
        C231417i r3 = r12.A0B;
        AnonymousClass3QO A052 = r3.A05(userJid);
        long A002 = C19970wo.A00(r12.A06);
        int A003 = C20800yB.A00(C21000yV.A02, r12.A0C, 730);
        if (A003 < 1) {
            A003 = 1;
        }
        if (j >= (A002 - (((long) Math.min(35, A003)) * 86400000)) / 1000 || r14.validIndexes_.size() <= 1) {
            if (A052 == null || A052.A01 != r14.rawId_) {
                Log.w("DeviceADVInfoManager/verifyKeyIndexListData/incoming key-index not matching local state, resetting");
                C19730wQ r13 = r12.A02;
                if (r13.A0M(userJid) && r13.A0L()) {
                    C19700wN r4 = r12.A01;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("indexRawId=");
                    sb3.append(r14.rawId_);
                    sb3.append("; rawId=");
                    if (A052 == null) {
                        valueOf = "null";
                    } else {
                        valueOf = Integer.valueOf(A052.A01);
                    }
                    sb3.append(valueOf);
                    r4.A0E("device_self_invalid_index_list", sb3.toString(), false);
                } else if (r15.A00 == null) {
                    r3.A0F(userJid, "adv_key_index_list_validation_failed");
                }
            }
            if (r15.A00 == null) {
                return true;
            }
            AnonymousClass3QO r6 = ((C600536h) ((AnonymousClass00I) r15.A00()).A00).A01;
            C20070wy r42 = ((C600536h) ((AnonymousClass00I) r15.A00()).A00).A00;
            C19730wQ r16 = r12.A02;
            if (!r16.A0L() || !r16.A0M(userJid)) {
                return r3.A0H(r42, r6, userJid, ((Boolean) ((AnonymousClass00I) r15.A00()).A01).booleanValue());
            }
            r3.A0E(r6, userJid);
            return r12.A08.A0E(r42, true, false);
        }
        if (A052 != null) {
            j2 = A052.A05;
        } else {
            j2 = 0;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("DeviceADVInfoManager/verifyKeyIndexListData/verifyKeyIndexListData advListTimestampInvalid; localTs=");
        sb4.append(j2);
        sb4.append("; ts=");
        sb4.append(j3);
        Log.w(sb4.toString());
        r12.A09.A03(j2, true, j3);
        return false;
    }

    public C193829Na A07(UserJid userJid) {
        AnonymousClass8I5 A012;
        long A013;
        C52772q9 r14;
        UserJid userJid2 = userJid;
        HashSet hashSet = null;
        if (!AnonymousClass143.A0H(userJid2)) {
            C19730wQ r5 = this.A02;
            r5.A0G();
            AnonymousClass8I5 A014 = A01(r5.A03, new HashSet());
            r5.A0G();
            PhoneUserJid phoneUserJid = r5.A03;
            C231417i r4 = this.A0B;
            long A015 = r4.A01(phoneUserJid);
            if (A014 == null && C19970wo.A00(this.A06) - (1000 * A015) >= 2592000000L) {
                A015 = 0;
            }
            boolean A0M = r5.A0M(userJid2);
            HashSet hashSet2 = new HashSet();
            if (A0M) {
                A012 = null;
            } else {
                A012 = A01(userJid2, hashSet2);
            }
            if (A0M) {
                A013 = 0;
            } else {
                A013 = r4.A01(userJid2);
                if (A012 == null && C19970wo.A00(this.A06) - (1000 * A013) >= 2592000000L) {
                    A013 = 0;
                }
            }
            if (!(A014 == null && A015 == 0 && A012 == null && A013 == 0)) {
                C52772q9 r13 = C52772q9.E2EE;
                if (!hashSet2.isEmpty()) {
                    hashSet = hashSet2;
                }
                AnonymousClass3QO A052 = r4.A05(userJid2);
                if (r5.A0M(userJid2) || A052 == null || A052.A00 == 0) {
                    r14 = null;
                } else {
                    r14 = C52772q9.HOSTED;
                }
                return new C193829Na(A014, A012, r13, r14, hashSet, A015, A013);
            }
        }
        return null;
    }

    public HashMap A08(List list, Map map, Map map2, int i) {
        StringBuilder sb;
        Object obj;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            DeviceJid deviceJid = (DeviceJid) entry.getKey();
            Number number = (Number) entry.getValue();
            if (deviceJid.getDevice() == 0 || list.contains(Integer.valueOf(number.intValue()))) {
                hashMap.put(deviceJid, number);
            } else {
                AnonymousClass1OE r0 = this.A09;
                r0.A00.Bly(new C44252Mq());
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            Number number2 = (Number) entry2.getValue();
            long longValue = number2.longValue();
            if (longValue > ((long) i)) {
                sb = new StringBuilder();
                sb.append("DevicesUtil/filterDeviceWithKeyIndexList/larger index exists in current map, jid=");
                sb.append(key);
                sb.append("; indexValue=");
                obj = number2;
            } else if (map2.containsKey(key) && ((Number) map2.get(key)).longValue() < longValue && list.contains(Integer.valueOf(number2.intValue()))) {
                sb = new StringBuilder();
                sb.append("DevicesUtil/filterDeviceWithKeyIndexList/larger index exists in current map for the same deviceJid, jid=");
                sb.append(key);
                sb.append("; index=");
                sb.append(number2);
                sb.append("; incomingIndex=");
                obj = map2.get(key);
            }
            sb.append(obj);
            sb.append("; currentIndex=");
            sb.append(i);
            Log.w(sb.toString());
        }
        return hashMap;
    }

    /* JADX WARNING: type inference failed for: r24v0, types: [X.9Na] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A09(java.util.Set r38, boolean r39) {
        /*
            r37 = this;
            java.util.HashMap r23 = new java.util.HashMap
            r23.<init>()
            r36 = r38
            boolean r0 = r36.isEmpty()
            if (r0 != 0) goto L_0x03c6
            r7 = r37
            X.0wQ r0 = r7.A02
            r35 = r0
            if (r39 == 0) goto L_0x0059
            X.13w r6 = r35.A09()
        L_0x0019:
            java.util.HashSet r5 = new java.util.HashSet
            r0 = r36
            r5.<init>(r0)
            r5.add(r6)
            X.17i r8 = r7.A0B
            int r0 = r5.size()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>(r0)
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            java.util.Iterator r2 = r5.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r1 = r2.next()
            X.11F r1 = (X.AnonymousClass11F) r1
            X.0wQ r0 = r8.A00
            boolean r0 = r0.A0M(r1)
            if (r0 == 0) goto L_0x0053
            X.3QO r0 = r8.A03()
            r11.put(r1, r0)
            goto L_0x0037
        L_0x0053:
            if (r1 == 0) goto L_0x0037
            r13.add(r1)
            goto L_0x0037
        L_0x0059:
            r35.A0G()
            com.whatsapp.jid.PhoneUserJid r6 = r0.A03
            X.C18740tg.A06(r6)
            goto L_0x0019
        L_0x0062:
            X.17j r10 = r8.A04
            java.util.Iterator r2 = r13.iterator()
        L_0x0068:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.Object r1 = r2.next()
            X.11F r1 = (X.AnonymousClass11F) r1
            X.0wQ r0 = r10.A00
            boolean r0 = r0.A0M(r1)
            r1 = r0 ^ 1
            java.lang.String r0 = "only query info for others"
            X.C18740tg.A0F(r1, r0)
            goto L_0x0068
        L_0x0082:
            X.17m r4 = r10.A02
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r13)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.Object r12 = r4.A02
            monitor-enter(r12)
            java.util.Iterator r14 = r13.iterator()     // Catch:{ all -> 0x03c3 }
        L_0x0095:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x03c3 }
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r9 = r14.next()     // Catch:{ all -> 0x03c3 }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ all -> 0x03c3 }
            java.util.Map r2 = r4.A03     // Catch:{ all -> 0x03c3 }
            boolean r0 = r2.containsKey(r9)     // Catch:{ all -> 0x03c3 }
            if (r0 == 0) goto L_0x0095
            java.lang.Object r0 = r2.get(r9)     // Catch:{ all -> 0x03c3 }
            X.3QO r0 = (X.AnonymousClass3QO) r0     // Catch:{ all -> 0x03c3 }
            r3.put(r9, r0)     // Catch:{ all -> 0x03c3 }
            r1.remove(r9)     // Catch:{ all -> 0x03c3 }
            goto L_0x0095
        L_0x00b6:
            monitor-exit(r12)     // Catch:{ all -> 0x03c3 }
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01bd
            int r0 = r1.size()
            java.lang.String[] r2 = new java.lang.String[r0]
            r15 = 0
            java.util.Iterator r14 = r1.iterator()
        L_0x00cd:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r1 = r14.next()
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            int r12 = r15 + 1
            X.12j r0 = r4.A00
            long r0 = r0.A07(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r15] = r0
            r15 = r12
            goto L_0x00cd
        L_0x00e9:
            r0 = 975(0x3cf, float:1.366E-42)
            X.72Z r1 = new X.72Z
            r1.<init>(r2, r0)
            X.12P r0 = r4.A01
            X.1M0 r22 = r0.get()
            java.util.Iterator r21 = r1.iterator()     // Catch:{ all -> 0x01ab }
        L_0x00fa:
            boolean r0 = r21.hasNext()     // Catch:{ all -> 0x01ab }
            if (r0 == 0) goto L_0x01b5
            java.lang.Object r2 = r21.next()     // Catch:{ all -> 0x01ab }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x01ab }
            r0 = r22
            X.14e r12 = r0.A02     // Catch:{ all -> 0x01ab }
            int r14 = r2.length     // Catch:{ all -> 0x01ab }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ab }
            r1.<init>()     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = "SELECT raw_id, timestamp, expected_timestamp, expected_ts_last_device_job_ts, expected_timestamp_update_ts, account_encryption_type, user_jid_row_id FROM user_device_info WHERE user_jid_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = X.AnonymousClass1M2.A00(r14)     // Catch:{ all -> 0x01ab }
            r1.append(r0)     // Catch:{ all -> 0x01ab }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = "GET_USERS_DEVICE_INFO_SQL"
            android.database.Cursor r2 = r12.A09(r1, r0, r2)     // Catch:{ all -> 0x01ab }
            java.lang.String r0 = "raw_id"
            int r20 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "timestamp"
            int r19 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "expected_timestamp"
            int r18 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "expected_ts_last_device_job_ts"
            int r17 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "expected_timestamp_update_ts"
            int r16 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "account_encryption_type"
            int r12 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x019f }
        L_0x014a:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x019a
            X.12j r15 = r4.A00     // Catch:{ all -> 0x019f }
            java.lang.Class<com.whatsapp.jid.UserJid> r14 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "user_jid_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x019f }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x019f }
            com.whatsapp.jid.Jid r0 = r15.A0C(r14, r0)     // Catch:{ all -> 0x019f }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x019f }
            boolean r1 = r2.isNull(r12)     // Catch:{ all -> 0x019f }
            if (r1 == 0) goto L_0x016d
            r26 = 0
            goto L_0x0171
        L_0x016d:
            int r26 = r2.getInt(r12)     // Catch:{ all -> 0x019f }
        L_0x0171:
            r1 = r20
            int r25 = r2.getInt(r1)     // Catch:{ all -> 0x019f }
            r1 = r19
            long r27 = r2.getLong(r1)     // Catch:{ all -> 0x019f }
            r1 = r18
            long r29 = r2.getLong(r1)     // Catch:{ all -> 0x019f }
            r1 = r17
            long r31 = r2.getLong(r1)     // Catch:{ all -> 0x019f }
            r1 = r16
            long r33 = r2.getLong(r1)     // Catch:{ all -> 0x019f }
            X.3QO r1 = new X.3QO     // Catch:{ all -> 0x019f }
            r24 = r1
            r24.<init>((int) r25, (int) r26, (long) r27, (long) r29, (long) r31, (long) r33)     // Catch:{ all -> 0x019f }
            r9.put(r0, r1)     // Catch:{ all -> 0x019f }
            goto L_0x014a
        L_0x019a:
            r2.close()     // Catch:{ all -> 0x01ab }
            goto L_0x00fa
        L_0x019f:
            r1 = move-exception
            if (r2 == 0) goto L_0x01aa
            r2.close()     // Catch:{ all -> 0x01a6 }
            goto L_0x01aa
        L_0x01a6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x01ab }
        L_0x01aa:
            throw r1     // Catch:{ all -> 0x01ab }
        L_0x01ab:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x01b0 }
            throw r1
        L_0x01b0:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x01b5:
            r22.close()
            java.util.Map r0 = r4.A03
            r0.putAll(r9)
        L_0x01bd:
            r3.putAll(r9)
            java.util.Iterator r2 = r13.iterator()
        L_0x01c4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01d9
            java.lang.Object r1 = r2.next()
            boolean r0 = r3.containsKey(r1)
            if (r0 != 0) goto L_0x01c4
            r0 = 0
            r3.put(r1, r0)
            goto L_0x01c4
        L_0x01d9:
            r11.putAll(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            X.0wQ r1 = r8.A00
            r1.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r1.A03
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x01f8
            X.13w r0 = r1.A08()
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x0218
        L_0x01f8:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r5)
            r1.A0G()
            com.whatsapp.jid.PhoneUserJid r2 = r1.A03
            X.13w r1 = r1.A08()
            boolean r0 = r5.contains(r2)
            if (r0 == 0) goto L_0x0268
            r4.remove(r2)
            r0 = 0
            X.0wy r0 = X.C231417i.A00(r8, r0)
            r3.put(r2, r0)
        L_0x0217:
            r5 = r4
        L_0x0218:
            X.17k r0 = r10.A05
            java.util.HashMap r0 = r0.A01(r5)
            r3.putAll(r0)
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x0229:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x027a
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Object r1 = r0.getValue()
            X.0wy r1 = (X.C20070wy) r1
            com.whatsapp.jid.DeviceJid r0 = r5.getPrimaryDevice()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x0229
            X.0x0 r4 = new X.0x0
            r4.<init>()
            r4.putAll((java.util.Map) r1)
            com.whatsapp.jid.DeviceJid r2 = r5.getPrimaryDevice()
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.put(r2, r0)
            X.0wy r0 = r4.build()
            r3.put(r5, r0)
            goto L_0x0229
        L_0x0268:
            boolean r0 = r5.contains(r1)
            if (r0 == 0) goto L_0x0217
            r4.remove(r1)
            r0 = 1
            X.0wy r0 = X.C231417i.A00(r8, r0)
            r3.put(r1, r0)
            goto L_0x0217
        L_0x027a:
            int r0 = r3.size()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x0290:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02e5
            java.lang.Object r4 = r10.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getValue()
            X.0wy r0 = (X.C20070wy) r0
            int r5 = r0.size()
            java.lang.Object r0 = r4.getValue()
            X.0wy r0 = (X.C20070wy) r0
            X.0y7 r0 = r0.keySet()
            X.14x r9 = r0.iterator()
        L_0x02b4:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0290
            java.lang.Object r4 = r9.next()
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
            r0 = r35
            boolean r0 = r0.A0O(r4)
            if (r0 == 0) goto L_0x02da
            X.6EZ r4 = X.C133256Xm.A02(r4)
            X.189 r0 = r7.A07
            X.18u r0 = r0.A00
            X.34P r0 = r0.A04()
            X.3FZ r0 = r0.A01
            r2.put(r4, r0)
            goto L_0x02b4
        L_0x02da:
            r0 = 1
            if (r5 <= r0) goto L_0x02b4
            X.6EZ r0 = X.C133256Xm.A02(r4)
            r1.add(r0)
            goto L_0x02b4
        L_0x02e5:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02f4
            X.189 r0 = r7.A07
            java.util.HashMap r0 = r0.A0J(r1)
            r2.putAll(r0)
        L_0x02f4:
            java.lang.Object r1 = r3.get(r6)
            X.C18740tg.A06(r1)
            X.0wy r1 = (X.C20070wy) r1
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            X.8I5 r25 = r7.A00(r1, r6, r2, r0)
            java.lang.Object r0 = r11.get(r6)
            X.3QO r0 = (X.AnonymousClass3QO) r0
            r30 = 0
            if (r0 != 0) goto L_0x03bf
            r0 = 0
        L_0x0312:
            if (r25 != 0) goto L_0x0327
            X.0wo r4 = r7.A06
            long r9 = X.C19970wo.A00(r4)
            r4 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            long r9 = r9 - r4
            r5 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0329
        L_0x0327:
            r30 = r0
        L_0x0329:
            java.util.Iterator r18 = r36.iterator()
        L_0x032d:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x03c6
            java.lang.Object r4 = r18.next()
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r0 = r35
            boolean r1 = r0.A0M(r4)
            r6 = 0
            if (r1 == 0) goto L_0x03b1
            r26 = r6
        L_0x0349:
            r16 = 0
            if (r1 == 0) goto L_0x038a
            r32 = 0
        L_0x034f:
            if (r25 != 0) goto L_0x035b
            int r0 = (r30 > r16 ? 1 : (r30 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x035b
            if (r26 != 0) goto L_0x035b
            int r0 = (r32 > r16 ? 1 : (r32 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0381
        L_0x035b:
            X.2q9 r27 = X.C52772q9.E2EE
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0364
            r6 = r5
        L_0x0364:
            X.3QO r1 = r8.A05(r4)
            r0 = r35
            boolean r0 = r0.A0M(r4)
            if (r0 != 0) goto L_0x0387
            if (r1 == 0) goto L_0x0387
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0387
            X.2q9 r28 = X.C52772q9.HOSTED
        L_0x0378:
            X.9Na r24 = new X.9Na
            r29 = r6
            r24.<init>(r25, r26, r27, r28, r29, r30, r32)
            r6 = r24
        L_0x0381:
            r0 = r23
            r0.put(r4, r6)
            goto L_0x032d
        L_0x0387:
            r28 = 0
            goto L_0x0378
        L_0x038a:
            java.lang.Object r0 = r11.get(r4)
            X.3QO r0 = (X.AnonymousClass3QO) r0
            r32 = 0
            if (r0 != 0) goto L_0x03ae
            r0 = 0
        L_0x0396:
            if (r26 != 0) goto L_0x03ab
            X.0wo r9 = r7.A06
            long r14 = X.C19970wo.A00(r9)
            r9 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r0
            long r14 = r14 - r9
            r12 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x034f
        L_0x03ab:
            r32 = r0
            goto L_0x034f
        L_0x03ae:
            long r0 = r0.A05
            goto L_0x0396
        L_0x03b1:
            java.lang.Object r0 = r3.get(r4)
            X.C18740tg.A06(r0)
            X.0wy r0 = (X.C20070wy) r0
            X.8I5 r26 = r7.A00(r0, r4, r2, r5)
            goto L_0x0349
        L_0x03bf:
            long r0 = r0.A05
            goto L_0x0312
        L_0x03c3:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x03c3 }
            throw r0
        L_0x03c6:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OD.A09(java.util.Set, boolean):java.util.HashMap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C193829Na r23, com.whatsapp.jid.DeviceJid r24, com.whatsapp.jid.UserJid r25) {
        /*
            r22 = this;
            r1 = r24
            com.whatsapp.jid.UserJid r0 = r1.userJid
            int r1 = r1.getDevice()
            r3 = 0
            if (r1 != 0) goto L_0x000c
            r3 = 1
        L_0x000c:
            r1 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            r8 = 1
            r5 = r22
            r7 = r23
            r2 = r25
            if (r3 == 0) goto L_0x006c
            X.AUx r1 = r7.A03
            if (r1 != 0) goto L_0x006c
            long r14 = r7.A01
            X.17i r3 = r5.A0B
            long r10 = r3.A01(r0)
            int r1 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r1 < 0) goto L_0x006c
            X.0wQ r1 = r5.A02
            boolean r4 = r1.A0M(r0)
            if (r4 == 0) goto L_0x0041
            boolean r4 = r1.A0L()
            if (r4 == 0) goto L_0x0041
            X.1Ih r1 = r5.A04
            java.lang.String r0 = "invalid_adv_status"
            r1.A01(r0, r8, r8)
        L_0x0040:
            return
        L_0x0041:
            java.lang.String r4 = "DeviceADVInfoHandler/handleADVMetadata hash is null, try to remove all devices"
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.3QO r6 = r3.A05(r0)
            com.whatsapp.jid.DeviceJid r4 = r0.getPrimaryDevice()
            X.0wy r4 = X.C20070wy.of(r4, r9)
            if (r6 != 0) goto L_0x005a
            r11 = 0
        L_0x0055:
            r6 = 0
            r3.A0H(r4, r11, r0, r6)
            goto L_0x00bd
        L_0x005a:
            int r12 = r6.A01
            r10 = 1
            long r14 = r14 + r10
            r16 = 0
            r13 = 0
            X.3QO r11 = new X.3QO
            r18 = 0
            r20 = 0
            r11.<init>((int) r12, (int) r13, (long) r14, (long) r16, (long) r18, (long) r20)
            goto L_0x0055
        L_0x006c:
            X.0wQ r1 = r5.A02
            boolean r3 = r1.A0M(r0)
            if (r3 == 0) goto L_0x007a
            boolean r3 = r1.A0L()
            if (r3 == 0) goto L_0x00bd
        L_0x007a:
            long r3 = r7.A01
            X.17i r6 = r5.A0B
            long r11 = r6.A01(r0)
            int r10 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00bd
            boolean r10 = r1.A0M(r0)
            if (r10 != 0) goto L_0x00eb
            X.2q9 r12 = r7.A05
            X.2q9 r10 = X.C52772q9.HOSTED
            if (r12 != r10) goto L_0x00eb
            X.2q9 r11 = r6.A06(r0)
            X.2q9 r10 = X.C52772q9.E2EE
            if (r11 != r10) goto L_0x00eb
            com.whatsapp.jid.DeviceJid r3 = r0.getPrimaryDevice()
            X.0wy r3 = X.C20070wy.of(r3, r9)
            r13 = 0
            r14 = 0
            X.3QO r11 = new X.3QO
            r16 = 0
            r18 = 0
            r20 = 0
            r11.<init>((X.C52772q9) r12, (int) r13, (long) r14, (long) r16, (long) r18, (long) r20)
            r6.A0H(r3, r11, r0, r13)
            X.1Nr r6 = r5.A05
            com.whatsapp.jid.UserJid[] r4 = new com.whatsapp.jid.UserJid[r8]
            r4[r13] = r25
            r3 = 3
            r6.A01(r4, r3)
        L_0x00bd:
            boolean r3 = r1.A0M(r2)
            if (r3 == 0) goto L_0x00ef
            long r3 = r7.A00
            X.17i r8 = r5.A0B
            long r10 = r8.A01(r2)
            int r6 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ef
            java.util.HashSet r3 = r8.A0B(r2)
            int r4 = r3.size()
            r3 = 1
            if (r4 <= r3) goto L_0x00ef
            boolean r3 = r1.A0L()
            if (r3 != 0) goto L_0x00ef
            java.lang.String r0 = "DeviceADVInfoHandler/handleADVMetadata detect larger self timestamp, mark the list as dirty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1OG r0 = r5.A0E
            r0.A04()
            return
        L_0x00eb:
            r5.A03(r0, r3)
            goto L_0x00bd
        L_0x00ef:
            if (r25 == 0) goto L_0x0040
            boolean r3 = r1.A0M(r2)
            if (r3 == 0) goto L_0x0103
            boolean r3 = r1.A0L()
            if (r3 == 0) goto L_0x0040
            boolean r3 = r1.A0M(r0)
            if (r3 == 0) goto L_0x0040
        L_0x0103:
            long r3 = r7.A00
            X.17i r6 = r5.A0B
            long r10 = r6.A01(r2)
            int r8 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0040
            X.2q9 r8 = r7.A04
            X.2q9 r7 = X.C52772q9.HOSTED
            if (r8 != r7) goto L_0x012c
            boolean r7 = r1.A0M(r0)
            if (r7 == 0) goto L_0x0154
            boolean r1 = r1.A0M(r2)
            if (r1 != 0) goto L_0x0154
            X.3QO r0 = r6.A05(r2)
            r10 = 1
            if (r0 == 0) goto L_0x0130
            int r0 = r0.A00
            if (r0 != r10) goto L_0x0130
        L_0x012c:
            r5.A03(r2, r3)
            return
        L_0x0130:
            com.whatsapp.jid.DeviceJid r0 = r2.getPrimaryDevice()
            X.0wy r0 = X.C20070wy.of(r0, r9)
            r9 = 0
            r11 = 0
            X.3QO r8 = new X.3QO
            r13 = 0
            r15 = 0
            r17 = 0
            r8.<init>((int) r9, (int) r10, (long) r11, (long) r13, (long) r15, (long) r17)
            r6.A0H(r0, r8, r2, r9)
            X.1Nr r6 = r5.A05
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r10]
            r1[r9] = r25
            r0 = 3
            r6.A01(r1, r0)
            goto L_0x012c
        L_0x0154:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "DeviceADVInfoHandler/handleADVMetadataReceiverAccountType: receiver account type from incorrect sender id: "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = " recipient: "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x012c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OD.A0A(X.9Na, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.UserJid):void");
    }

    public void A0C(UserJid userJid, long j) {
        if (j - (C19970wo.A00(this.A06) / 1000) > 5184000) {
            StringBuilder sb = new StringBuilder();
            sb.append("DeviceADVInfoHandler/removeDeviceInfoIfTimestampIsInvalid invalid local timestamp ts=");
            sb.append(j);
            Log.e(sb.toString());
            this.A0B.A0F(userJid, "adv_key_index_list_validation_failed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x025d, code lost:
        if (((java.lang.Long) r12.get(r6)).longValue() != ((long) r3.keyIndex_)) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f3, code lost:
        if (new X.AnonymousClass3FZ(r9).equals(r0) == false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0204, code lost:
        if (r23.A0N(r6) == false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0229, code lost:
        if (r10.A01 != r3.rawId_) goto L_0x022b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0628 A[Catch:{ all -> 0x047c, all -> 0x06fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0635 A[Catch:{ all -> 0x047c, all -> 0x06fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x067a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(com.whatsapp.jid.DeviceJid r39, byte[] r40, byte[] r41, byte r42, int r43) {
        /*
            r38 = this;
            r11 = r43
            r5 = r38
            X.18I r0 = r5.A0G
            r6 = r39
            X.79X r26 = r0.A08(r6)
            int r1 = r6.getDevice()     // Catch:{ all -> 0x06fe }
            r0 = 0
            if (r1 != 0) goto L_0x0014
            r0 = 1
        L_0x0014:
            r4 = 1
            if (r0 != 0) goto L_0x06f8
            r2 = 0
            r1 = r40
            if (r40 != 0) goto L_0x0028
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/null deviceADVInfo"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            X.1OE r0 = r5.A09     // Catch:{ all -> 0x06fe }
            r0.A01(r11, r2)     // Catch:{ all -> 0x06fe }
            goto L_0x06f2
        L_0x0028:
            r15 = r41
            if (r41 != 0) goto L_0x0038
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/null identity"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            X.1OE r0 = r5.A09     // Catch:{ all -> 0x06fe }
            r0.A01(r11, r4)     // Catch:{ all -> 0x06fe }
            goto L_0x06f2
        L_0x0038:
            X.19g r0 = r5.A08     // Catch:{ all -> 0x06fe }
            r24 = r0
            boolean r0 = r0.A0F(r6)     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/message from device in progress of login"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            goto L_0x06f2
        L_0x0049:
            X.17i r7 = r5.A0B     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.UserJid r0 = r6.userJid     // Catch:{ all -> 0x06fe }
            java.util.HashSet r0 = r7.A0B(r0)     // Catch:{ all -> 0x06fe }
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x06fe }
            r9 = r42
            if (r0 == 0) goto L_0x007b
            X.189 r3 = r5.A07     // Catch:{ all -> 0x06fe }
            X.6EZ r0 = X.C133256Xm.A02(r6)     // Catch:{ all -> 0x06fe }
            X.3FZ r8 = r3.A0B(r0)     // Catch:{ all -> 0x06fe }
            X.3IG r3 = A02(r15, r9)     // Catch:{ all -> 0x06fe }
            if (r3 == 0) goto L_0x007b
            X.3FZ r0 = new X.3FZ     // Catch:{ all -> 0x06fe }
            r0.<init>(r3)     // Catch:{ all -> 0x06fe }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/already have device"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            goto L_0x06f8
        L_0x007b:
            X.0wQ r0 = r5.A02     // Catch:{ all -> 0x06fe }
            r23 = r0
            boolean r0 = r0.A0N(r6)     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r23.A0L()     // Catch:{ all -> 0x06fe }
            if (r0 != 0) goto L_0x00a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06fe }
            r1.<init>()     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/unexpected self device, jid="
            r1.append(r0)     // Catch:{ all -> 0x06fe }
            r1.append(r6)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06fe }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            java.lang.String r1 = "unknown_companion"
            r0 = r24
            r0.A0C(r6, r1, r2, r2)     // Catch:{ all -> 0x06fe }
            goto L_0x06f2
        L_0x00a8:
            X.8Qc r0 = X.C173028Qc.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x06d4 }
            X.8Hz r8 = X.C170918Hz.A08(r0, r1)     // Catch:{ 186 -> 0x06d4 }
            X.8Qc r8 = (X.C173028Qc) r8     // Catch:{ 186 -> 0x06d4 }
            X.AUx r1 = r8.details_     // Catch:{ 186 -> 0x06b4 }
            X.8R5 r0 = X.AnonymousClass8R5.DEFAULT_INSTANCE     // Catch:{ 186 -> 0x06b4 }
            X.8Hz r3 = X.C170918Hz.A04(r1, r0)     // Catch:{ 186 -> 0x06b4 }
            X.8R5 r3 = (X.AnonymousClass8R5) r3     // Catch:{ 186 -> 0x06b4 }
            X.AUx r0 = r8.accountSignatureKey_     // Catch:{ all -> 0x06fe }
            byte[] r1 = r0.A06()     // Catch:{ all -> 0x06fe }
            int r0 = r1.length     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x00c8
            X.3IG r14 = A02(r1, r9)     // Catch:{ all -> 0x06fe }
            goto L_0x00dc
        L_0x00c8:
            X.189 r1 = r5.A07     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.UserJid r0 = r6.userJid     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()     // Catch:{ all -> 0x06fe }
            X.6EZ r0 = X.C133256Xm.A02(r0)     // Catch:{ all -> 0x06fe }
            X.3FZ r0 = r1.A0B(r0)     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x067e
            X.3IG r14 = r0.A00     // Catch:{ all -> 0x06fe }
        L_0x00dc:
            if (r14 == 0) goto L_0x067e
            int r0 = r3.deviceType_     // Catch:{ all -> 0x06fe }
            X.2q9 r0 = X.C52772q9.A00(r0)     // Catch:{ all -> 0x06fe }
            if (r0 != 0) goto L_0x00e8
            X.2q9 r0 = X.C52772q9.E2EE     // Catch:{ all -> 0x06fe }
        L_0x00e8:
            X.2q9 r1 = X.C52772q9.HOSTED     // Catch:{ all -> 0x06fe }
            if (r0 != r1) goto L_0x0121
            int r0 = r3.accountType_     // Catch:{ all -> 0x06fe }
            X.2q9 r10 = X.C52772q9.A00(r0)     // Catch:{ all -> 0x06fe }
            if (r10 != 0) goto L_0x00f6
            X.2q9 r10 = X.C52772q9.E2EE     // Catch:{ all -> 0x06fe }
        L_0x00f6:
            X.2q9 r0 = X.C52772q9.E2EE     // Catch:{ all -> 0x06fe }
            if (r10 != r0) goto L_0x0121
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/account and device encryption type mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            X.1OE r0 = r5.A09     // Catch:{ all -> 0x06fe }
            X.2Mo r3 = new X.2Mo     // Catch:{ all -> 0x06fe }
            r3.<init>()     // Catch:{ all -> 0x06fe }
            X.0yW r0 = r0.A00     // Catch:{ all -> 0x06fe }
        L_0x0108:
            r0.Bly(r3)     // Catch:{ all -> 0x06fe }
        L_0x010b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06fe }
            r1.<init>()     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/signature verification fail, deviceJid="
            r1.append(r0)     // Catch:{ all -> 0x06fe }
            r1.append(r6)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06fe }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            goto L_0x06f2
        L_0x0121:
            byte[] r22 = r3.A0o()     // Catch:{ all -> 0x06fe }
            X.AUx r0 = r8.accountSignature_     // Catch:{ all -> 0x06fe }
            byte[] r21 = r0.A06()     // Catch:{ all -> 0x06fe }
            X.AUx r0 = r8.deviceSignature_     // Catch:{ all -> 0x06fe }
            byte[] r20 = r0.A06()     // Catch:{ all -> 0x06fe }
            X.3IG r12 = A02(r15, r9)     // Catch:{ all -> 0x06fe }
            if (r12 != 0) goto L_0x0142
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/invalid companion public key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            X.1OE r0 = r5.A09     // Catch:{ all -> 0x06fe }
            r0.A01(r11, r4)     // Catch:{ all -> 0x06fe }
            goto L_0x010b
        L_0x0142:
            byte[] r16 = X.C19430v1.A0F     // Catch:{ all -> 0x06fe }
            X.1OF r0 = r5.A03     // Catch:{ all -> 0x06fe }
            X.0yC r13 = r0.A00     // Catch:{ all -> 0x06fe }
            r8 = 6939(0x1b1b, float:9.724E-42)
            X.0yV r19 = X.C21000yV.A02     // Catch:{ all -> 0x06fe }
            r0 = r19
            boolean r0 = X.C20800yB.A01(r0, r13, r8)     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x0160
            int r0 = r3.deviceType_     // Catch:{ all -> 0x06fe }
            X.2q9 r0 = X.C52772q9.A00(r0)     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x0160
            if (r0 != r1) goto L_0x0160
            byte[] r16 = X.C19430v1.A0G     // Catch:{ all -> 0x06fe }
        L_0x0160:
            r10 = 3
            byte[][] r0 = new byte[r10][]     // Catch:{ all -> 0x06fe }
            r0[r2] = r16     // Catch:{ all -> 0x06fe }
            r0[r4] = r22     // Catch:{ all -> 0x06fe }
            r18 = 2
            r0[r18] = r41     // Catch:{ all -> 0x06fe }
            byte[] r17 = X.C203239na.A05(r0)     // Catch:{ all -> 0x06fe }
            byte[] r16 = X.C19430v1.A0H     // Catch:{ all -> 0x06fe }
            r0 = r19
            boolean r0 = X.C20800yB.A01(r0, r13, r8)     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x0185
            int r0 = r3.deviceType_     // Catch:{ all -> 0x06fe }
            X.2q9 r0 = X.C52772q9.A00(r0)     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x0185
            if (r0 != r1) goto L_0x0185
            byte[] r16 = X.C19430v1.A0I     // Catch:{ all -> 0x06fe }
        L_0x0185:
            r0 = 4
            byte[][] r0 = new byte[r0][]     // Catch:{ all -> 0x06fe }
            r0[r2] = r16     // Catch:{ all -> 0x06fe }
            r0[r4] = r22     // Catch:{ all -> 0x06fe }
            r0[r18] = r41     // Catch:{ all -> 0x06fe }
            byte[] r8 = r14.A01     // Catch:{ all -> 0x06fe }
            r0[r10] = r8     // Catch:{ all -> 0x06fe }
            byte[] r13 = X.C203239na.A05(r0)     // Catch:{ all -> 0x06fe }
            r10 = r21
            r0 = r17
            boolean r0 = X.C133256Xm.A06(r14, r0, r10)     // Catch:{ all -> 0x06fe }
            if (r0 != 0) goto L_0x01b6
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/fail to verify account signature"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            X.1OE r1 = r5.A09     // Catch:{ all -> 0x06fe }
            X.2N6 r3 = new X.2N6     // Catch:{ all -> 0x06fe }
            r3.<init>()     // Catch:{ all -> 0x06fe }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x06fe }
        L_0x01b0:
            r3.A00 = r0     // Catch:{ all -> 0x06fe }
            X.0yW r0 = r1.A00     // Catch:{ all -> 0x06fe }
            goto L_0x0108
        L_0x01b6:
            r0 = r20
            boolean r0 = X.C133256Xm.A06(r12, r13, r0)     // Catch:{ all -> 0x06fe }
            if (r0 != 0) goto L_0x01cf
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/fail to verify device signature"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            X.1OE r1 = r5.A09     // Catch:{ all -> 0x06fe }
            X.2N6 r3 = new X.2N6     // Catch:{ all -> 0x06fe }
            r3.<init>()     // Catch:{ all -> 0x06fe }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x06fe }
            goto L_0x01b0
        L_0x01cf:
            com.whatsapp.jid.UserJid r13 = r6.userJid     // Catch:{ all -> 0x06fe }
            X.3QO r10 = r7.A05(r13)     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.DeviceJid r0 = r13.getPrimaryDevice()     // Catch:{ all -> 0x06fe }
            X.189 r12 = r5.A07     // Catch:{ all -> 0x06fe }
            X.6EZ r0 = X.C133256Xm.A02(r0)     // Catch:{ all -> 0x06fe }
            X.3FZ r0 = r12.A0B(r0)     // Catch:{ all -> 0x06fe }
            X.3IG r9 = A02(r8, r9)     // Catch:{ all -> 0x06fe }
            if (r9 == 0) goto L_0x01f5
            X.3FZ r8 = new X.3FZ     // Catch:{ all -> 0x06fe }
            r8.<init>(r9)     // Catch:{ all -> 0x06fe }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x06fe }
            r15 = 1
            if (r0 != 0) goto L_0x01f6
        L_0x01f5:
            r15 = 0
        L_0x01f6:
            boolean r0 = r23.A0L()     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x0206
            r0 = r23
            boolean r0 = r0.A0N(r6)     // Catch:{ all -> 0x06fe }
            r18 = 1
            if (r0 != 0) goto L_0x0208
        L_0x0206:
            r18 = 0
        L_0x0208:
            if (r10 != 0) goto L_0x020b
            goto L_0x0212
        L_0x020b:
            int r0 = r10.A00     // Catch:{ all -> 0x06fe }
            if (r0 == r4) goto L_0x0214
            X.2q9 r1 = X.C52772q9.E2EE     // Catch:{ all -> 0x06fe }
            goto L_0x0214
        L_0x0212:
            X.2q9 r1 = X.C52772q9.E2EE     // Catch:{ all -> 0x06fe }
        L_0x0214:
            int r0 = r3.accountType_     // Catch:{ all -> 0x06fe }
            X.2q9 r0 = X.C52772q9.A00(r0)     // Catch:{ all -> 0x06fe }
            if (r0 != 0) goto L_0x021e
            X.2q9 r0 = X.C52772q9.E2EE     // Catch:{ all -> 0x06fe }
        L_0x021e:
            r8 = 0
            if (r1 != r0) goto L_0x0222
            r8 = 1
        L_0x0222:
            if (r10 == 0) goto L_0x022b
            int r9 = r10.A01     // Catch:{ all -> 0x06fe }
            int r0 = r3.rawId_     // Catch:{ all -> 0x06fe }
            r1 = 1
            if (r9 == r0) goto L_0x022c
        L_0x022b:
            r1 = 0
        L_0x022c:
            java.lang.String r17 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity"
            java.lang.String r16 = "; keyIndex"
            if (r15 == 0) goto L_0x0490
            if (r1 == 0) goto L_0x0490
            if (r8 == 0) goto L_0x0490
            if (r18 == 0) goto L_0x0239
            goto L_0x023e
        L_0x0239:
            java.util.Map r12 = r7.A0C(r13)     // Catch:{ all -> 0x06fe }
            goto L_0x0247
        L_0x023e:
            X.0wy r0 = X.C231417i.A00(r7, r2)     // Catch:{ all -> 0x06fe }
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ all -> 0x06fe }
            r12.<init>(r0)     // Catch:{ all -> 0x06fe }
        L_0x0247:
            boolean r0 = r12.containsKey(r6)     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x025f
            java.lang.Object r0 = r12.get(r6)     // Catch:{ all -> 0x06fe }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x06fe }
            long r14 = r0.longValue()     // Catch:{ all -> 0x06fe }
            int r0 = r3.keyIndex_     // Catch:{ all -> 0x06fe }
            long r0 = (long) r0     // Catch:{ all -> 0x06fe }
            int r8 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            r15 = 1
            if (r8 == 0) goto L_0x0260
        L_0x025f:
            r15 = 0
        L_0x0260:
            long r0 = r10.A05     // Catch:{ all -> 0x06fe }
            long r8 = r3.timestamp_     // Catch:{ all -> 0x06fe }
            int r14 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r14 < 0) goto L_0x026c
            if (r15 != 0) goto L_0x026c
            goto L_0x0547
        L_0x026c:
            int r11 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x0281
            X.3QO r10 = r7.A04(r10, r8)     // Catch:{ all -> 0x06fe }
            r7.A0E(r10, r13)     // Catch:{ all -> 0x06fe }
            X.1Nr r5 = r5.A05     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r4]     // Catch:{ all -> 0x06fe }
            r1[r2] = r13     // Catch:{ all -> 0x06fe }
            r0 = 3
            r5.A01(r1, r0)     // Catch:{ all -> 0x06fe }
        L_0x0281:
            if (r15 != 0) goto L_0x0677
            if (r18 == 0) goto L_0x02a2
            X.0x0 r4 = new X.0x0     // Catch:{ all -> 0x06fe }
            r4.<init>()     // Catch:{ all -> 0x06fe }
            r4.putAll((java.util.Map) r12)     // Catch:{ all -> 0x06fe }
            int r0 = r3.keyIndex_     // Catch:{ all -> 0x06fe }
            long r0 = (long) r0     // Catch:{ all -> 0x06fe }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06fe }
            r4.put(r6, r0)     // Catch:{ all -> 0x06fe }
            X.0wy r1 = r4.build()     // Catch:{ all -> 0x06fe }
            r0 = r24
            r0.A0E(r1, r2, r2)     // Catch:{ all -> 0x06fe }
            goto L_0x0677
        L_0x02a2:
            com.whatsapp.jid.UserJid r5 = r6.userJid     // Catch:{ all -> 0x06fe }
            int r0 = r3.keyIndex_     // Catch:{ all -> 0x06fe }
            long r0 = (long) r0     // Catch:{ all -> 0x06fe }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06fe }
            X.0wy r0 = X.C20070wy.of(r6, r0)     // Catch:{ all -> 0x06fe }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x06fe }
            r6.<init>(r0)     // Catch:{ all -> 0x06fe }
            X.17j r3 = r7.A04     // Catch:{ all -> 0x06fe }
            X.0wy r0 = r3.A05(r5)     // Catch:{ all -> 0x06fe }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x06fe }
            r8.<init>(r0)     // Catch:{ all -> 0x06fe }
            java.util.Set r0 = r8.keySet()     // Catch:{ all -> 0x06fe }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x06fe }
        L_0x02c7:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x02d5
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x06fe }
            r6.remove(r0)     // Catch:{ all -> 0x06fe }
            goto L_0x02c7
        L_0x02d5:
            r7.A0G(r5, r6)     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.DeviceJid r0 = r5.getPrimaryDevice()     // Catch:{ all -> 0x06fe }
            boolean r0 = r8.containsKey(r0)     // Catch:{ all -> 0x06fe }
            if (r0 != 0) goto L_0x0303
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06fe }
            r1.<init>()     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "UserDeviceManager/addDevicesForUser/no primary device for this user, jid="
            r1.append(r0)     // Catch:{ all -> 0x06fe }
            r1.append(r5)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06fe }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.DeviceJid r8 = r5.getPrimaryDevice()     // Catch:{ all -> 0x06fe }
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06fe }
            r6.put(r8, r0)     // Catch:{ all -> 0x06fe }
        L_0x0303:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x06fe }
            if (r0 != 0) goto L_0x0677
            java.util.Set r1 = r6.keySet()     // Catch:{ all -> 0x06fe }
            X.AnonymousClass00C.A0D(r1, r2)     // Catch:{ all -> 0x06fe }
            X.9ww r0 = X.C207759ww.A00     // Catch:{ all -> 0x06fe }
            boolean r0 = X.AnonymousClass6XG.A02(r0, r1)     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x0323
            int r0 = r10.A00     // Catch:{ all -> 0x06fe }
            if (r0 == r4) goto L_0x0323
            java.lang.String r0 = "DeviceManager/refreshDevicesForUser cannot add hosted device with adv e2ee"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            goto L_0x0677
        L_0x0323:
            X.0wy r8 = X.C20070wy.copyOf((java.util.Map) r6)     // Catch:{ all -> 0x06fe }
            X.0wQ r0 = r3.A00     // Catch:{ all -> 0x06fe }
            boolean r0 = r0.A0M(r5)     // Catch:{ all -> 0x06fe }
            r1 = r0 ^ 1
            java.lang.String r0 = "only add new device for others"
            X.C18740tg.A0F(r1, r0)     // Catch:{ all -> 0x06fe }
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x06fe }
            if (r0 != 0) goto L_0x0481
            X.12O r0 = r3.A03     // Catch:{ all -> 0x06fe }
            java.util.Set r25 = r0.A0G(r5)     // Catch:{ all -> 0x06fe }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x06fe }
            r4.<init>()     // Catch:{ all -> 0x06fe }
            X.12P r0 = r3.A01     // Catch:{ all -> 0x06fe }
            X.1M0 r24 = r0.A05()     // Catch:{ all -> 0x06fe }
            X.71s r23 = r24.B1k()     // Catch:{ all -> 0x0477 }
            java.util.Iterator r22 = r25.iterator()     // Catch:{ all -> 0x046d }
        L_0x0353:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x046d }
            if (r0 == 0) goto L_0x043b
            java.lang.Object r9 = r22.next()     // Catch:{ all -> 0x046d }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ all -> 0x046d }
            X.0wy r0 = r3.A05(r9)     // Catch:{ all -> 0x046d }
            X.0y7 r21 = r0.keySet()     // Catch:{ all -> 0x046d }
            r0 = r21
            r4.put(r9, r0)     // Catch:{ all -> 0x046d }
            X.0wy r20 = X.AnonymousClass6UD.A00(r8, r9)     // Catch:{ all -> 0x046d }
            X.17k r14 = r3.A05     // Catch:{ all -> 0x046d }
            java.lang.String r13 = "; keyIndex="
            X.12P r0 = r14.A02     // Catch:{ all -> 0x046d }
            X.1M0 r11 = r0.A05()     // Catch:{ all -> 0x046d }
            X.71s r19 = r11.B1k()     // Catch:{ all -> 0x0431 }
            X.0y7 r0 = r20.entrySet()     // Catch:{ all -> 0x0427 }
            X.14x r18 = r0.iterator()     // Catch:{ all -> 0x0427 }
        L_0x0386:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0427 }
            if (r0 == 0) goto L_0x0407
            java.lang.Object r10 = r18.next()     // Catch:{ all -> 0x0427 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x0427 }
            java.lang.Object r0 = r10.getKey()     // Catch:{ all -> 0x0427 }
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0     // Catch:{ all -> 0x0427 }
            int r0 = r0.getDevice()     // Catch:{ all -> 0x0427 }
            com.whatsapp.jid.DeviceJid r15 = com.whatsapp.jid.DeviceJid.getFromUserJidAndDeviceIdNullable(r9, r0)     // Catch:{ all -> 0x0427 }
            r1 = 0
            if (r15 == 0) goto L_0x03a4
            r1 = 1
        L_0x03a4:
            java.lang.String r0 = "DeviceJid must not be null"
            X.C18740tg.A0D(r1, r0)     // Catch:{ all -> 0x0427 }
            if (r15 == 0) goto L_0x0386
            java.lang.Object r0 = r10.getValue()     // Catch:{ all -> 0x0427 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0427 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0427 }
            int r10 = r15.getDevice()     // Catch:{ all -> 0x0427 }
            r12 = 0
            if (r10 != 0) goto L_0x03bd
            r12 = 1
        L_0x03bd:
            r16 = 0
            if (r12 == 0) goto L_0x03c5
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 == 0) goto L_0x0403
        L_0x03c5:
            r10 = r12 ^ 1
            if (r10 == 0) goto L_0x03ce
            int r10 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x03ce
            goto L_0x0403
        L_0x03ce:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0427 }
            r12.<init>()     // Catch:{ all -> 0x0427 }
            java.lang.String r10 = "invalid devices jid="
            r12.append(r10)     // Catch:{ all -> 0x0427 }
            r12.append(r15)     // Catch:{ all -> 0x0427 }
            r12.append(r13)     // Catch:{ all -> 0x0427 }
            r12.append(r0)     // Catch:{ all -> 0x0427 }
            java.lang.String r10 = r12.toString()     // Catch:{ all -> 0x0427 }
            X.C18740tg.A0D(r2, r10)     // Catch:{ all -> 0x0427 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0427 }
            r12.<init>()     // Catch:{ all -> 0x0427 }
            java.lang.String r10 = "DeviceStore/addDevicesForUser/invalid devices jid="
            r12.append(r10)     // Catch:{ all -> 0x0427 }
            r12.append(r15)     // Catch:{ all -> 0x0427 }
            r12.append(r13)     // Catch:{ all -> 0x0427 }
            r12.append(r0)     // Catch:{ all -> 0x0427 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0427 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0427 }
            goto L_0x0386
        L_0x0403:
            r14.A03(r15, r9, r0)     // Catch:{ all -> 0x0427 }
            goto L_0x0386
        L_0x0407:
            r19.A00()     // Catch:{ all -> 0x0427 }
            X.C231617k.A00(r11, r14, r9)     // Catch:{ all -> 0x0427 }
            r19.close()     // Catch:{ all -> 0x0431 }
            r11.close()     // Catch:{ all -> 0x046d }
            X.0y7 r11 = r20.keySet()     // Catch:{ all -> 0x046d }
            X.0y7 r12 = X.C20760y7.of()     // Catch:{ all -> 0x046d }
            r15 = 0
            r16 = 0
            r10 = r21
            r13 = r3
            r14 = r9
            X.C231517j.A02(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x046d }
            goto L_0x0353
        L_0x0427:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x042c }
            goto L_0x0430
        L_0x042c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0431 }
        L_0x0430:
            throw r1     // Catch:{ all -> 0x0431 }
        L_0x0431:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0436 }
            goto L_0x043a
        L_0x0436:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x046d }
        L_0x043a:
            throw r1     // Catch:{ all -> 0x046d }
        L_0x043b:
            r23.A00()     // Catch:{ all -> 0x046d }
            r23.close()     // Catch:{ all -> 0x0477 }
            r24.close()     // Catch:{ all -> 0x06fe }
            java.util.Iterator r10 = r25.iterator()     // Catch:{ all -> 0x06fe }
        L_0x0448:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x0481
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ all -> 0x06fe }
            java.lang.Object r2 = r4.get(r9)     // Catch:{ all -> 0x06fe }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x06fe }
            X.0y7 r2 = (X.C20760y7) r2     // Catch:{ all -> 0x06fe }
            X.0wy r0 = X.AnonymousClass6UD.A00(r8, r9)     // Catch:{ all -> 0x06fe }
            X.0y7 r1 = r0.keySet()     // Catch:{ all -> 0x06fe }
            X.0y7 r0 = X.C20760y7.of()     // Catch:{ all -> 0x06fe }
            X.C231517j.A01(r2, r1, r0, r3, r9)     // Catch:{ all -> 0x06fe }
            goto L_0x0448
        L_0x046d:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x0472 }
            goto L_0x0476
        L_0x0472:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0477 }
        L_0x0476:
            throw r1     // Catch:{ all -> 0x0477 }
        L_0x0477:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x047c }
            goto L_0x0480
        L_0x047c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x06fe }
        L_0x0480:
            throw r1     // Catch:{ all -> 0x06fe }
        L_0x0481:
            X.17q r2 = r7.A03     // Catch:{ all -> 0x06fe }
            java.util.Set r1 = r6.keySet()     // Catch:{ all -> 0x06fe }
            java.util.Set r0 = java.util.Collections.emptySet()     // Catch:{ all -> 0x06fe }
            r2.A00(r5, r1, r0)     // Catch:{ all -> 0x06fe }
            goto L_0x0677
        L_0x0490:
            if (r18 == 0) goto L_0x04c7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x06fe }
            r2.<init>()     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/raw_id or primary public key for own companion device doesn't match in companion mode, device="
            r2.append(r0)     // Catch:{ all -> 0x06fe }
            r2.append(r6)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "pkMatch"
            r2.append(r0)     // Catch:{ all -> 0x06fe }
            r2.append(r15)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "; accountEncryptionTypeMatch"
            r2.append(r0)     // Catch:{ all -> 0x06fe }
            r2.append(r8)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "; rawIdMatch"
            r2.append(r0)     // Catch:{ all -> 0x06fe }
            r2.append(r1)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x06fe }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            X.1Ih r1 = r5.A04     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "invalid_adv_status"
            r1.A01(r0, r4, r4)     // Catch:{ all -> 0x06fe }
            goto L_0x05d7
        L_0x04c7:
            if (r10 == 0) goto L_0x05da
            if (r15 != 0) goto L_0x04df
            com.whatsapp.jid.UserJid r0 = r6.userJid     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()     // Catch:{ all -> 0x06fe }
            X.6EZ r0 = X.C133256Xm.A02(r0)     // Catch:{ all -> 0x06fe }
            X.3FZ r0 = r12.A0B(r0)     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x05da
            X.3IG r0 = r0.A00     // Catch:{ all -> 0x06fe }
            if (r0 == 0) goto L_0x05da
        L_0x04df:
            r13 = 1
            X.C18740tg.A06(r10)     // Catch:{ all -> 0x06fe }
            long r8 = r10.A05     // Catch:{ all -> 0x06fe }
            long r0 = r3.timestamp_     // Catch:{ all -> 0x06fe }
            int r11 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x05db
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06fe }
            r1.<init>()     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/advDeviceIdentity has a lower ts, jid="
            r1.append(r0)     // Catch:{ all -> 0x06fe }
            r1.append(r6)     // Catch:{ all -> 0x06fe }
            r0 = r16
            r1.append(r0)     // Catch:{ all -> 0x06fe }
            int r0 = r3.keyIndex_     // Catch:{ all -> 0x06fe }
            r1.append(r0)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "; local.rawId="
            r1.append(r0)     // Catch:{ all -> 0x06fe }
            int r6 = r10.A01     // Catch:{ all -> 0x06fe }
            r1.append(r6)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "; downloaded.rawId="
            r1.append(r0)     // Catch:{ all -> 0x06fe }
            int r0 = r3.rawId_     // Catch:{ all -> 0x06fe }
            r1.append(r0)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06fe }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            X.1OE r2 = r5.A09     // Catch:{ all -> 0x06fe }
            X.C18740tg.A06(r10)     // Catch:{ all -> 0x06fe }
            long r0 = r3.timestamp_     // Catch:{ all -> 0x06fe }
            r10 = r8
            r12 = r15
            r13 = r0
            r9 = r2
            r9.A02(r10, r12, r13)     // Catch:{ all -> 0x06fe }
            X.0wN r2 = r5.A01     // Catch:{ all -> 0x06fe }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x06fe }
            r5.<init>()     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "local timestamp is ahead; ; primaryKeyMatch="
            r5.append(r0)     // Catch:{ all -> 0x06fe }
            r5.append(r15)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "; rawIdMatch="
            r5.append(r0)     // Catch:{ all -> 0x06fe }
            int r0 = r3.rawId_     // Catch:{ all -> 0x06fe }
            int r11 = java.lang.Integer.compare(r6, r0)     // Catch:{ all -> 0x06fe }
            goto L_0x05cb
        L_0x0547:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x06fe }
            r9.<init>()     // Catch:{ all -> 0x06fe }
            java.lang.String r2 = "DeviceADVInfoManager/processADVIdentity/device has been deleted already, device="
            r9.append(r2)     // Catch:{ all -> 0x06fe }
            r9.append(r6)     // Catch:{ all -> 0x06fe }
            r2 = r16
            r9.append(r2)     // Catch:{ all -> 0x06fe }
            int r2 = r3.keyIndex_     // Catch:{ all -> 0x06fe }
            r9.append(r2)     // Catch:{ all -> 0x06fe }
            java.lang.String r2 = "; localTs="
            r9.append(r2)     // Catch:{ all -> 0x06fe }
            r9.append(r0)     // Catch:{ all -> 0x06fe }
            java.lang.String r2 = "; remoteTs="
            r9.append(r2)     // Catch:{ all -> 0x06fe }
            long r7 = r3.timestamp_     // Catch:{ all -> 0x06fe }
            r9.append(r7)     // Catch:{ all -> 0x06fe }
            java.lang.String r2 = "; atype="
            r9.append(r2)     // Catch:{ all -> 0x06fe }
            int r2 = r3.accountType_     // Catch:{ all -> 0x06fe }
            X.2q9 r2 = X.C52772q9.A00(r2)     // Catch:{ all -> 0x06fe }
            if (r2 != 0) goto L_0x057f
            X.2q9 r2 = X.C52772q9.E2EE     // Catch:{ all -> 0x06fe }
        L_0x057f:
            r9.append(r2)     // Catch:{ all -> 0x06fe }
            java.lang.String r2 = "; dtype="
            r9.append(r2)     // Catch:{ all -> 0x06fe }
            int r2 = r3.deviceType_     // Catch:{ all -> 0x06fe }
            X.2q9 r2 = X.C52772q9.A00(r2)     // Catch:{ all -> 0x06fe }
            if (r2 != 0) goto L_0x0591
            X.2q9 r2 = X.C52772q9.E2EE     // Catch:{ all -> 0x06fe }
        L_0x0591:
            r9.append(r2)     // Catch:{ all -> 0x06fe }
            java.lang.String r2 = r9.toString()     // Catch:{ all -> 0x06fe }
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.UserJid r2 = r6.userJid     // Catch:{ all -> 0x06fe }
            r5.A0C(r2, r0)     // Catch:{ all -> 0x06fe }
            X.1OE r2 = r5.A09     // Catch:{ all -> 0x06fe }
            long r6 = r3.timestamp_     // Catch:{ all -> 0x06fe }
            r21 = 1
            r19 = r0
            r22 = r6
            r18 = r2
            r18.A02(r19, r21, r22)     // Catch:{ all -> 0x06fe }
            X.0wN r2 = r5.A01     // Catch:{ all -> 0x06fe }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x06fe }
            r5.<init>()     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "Not existing device; isLocalTimestampIsAhead="
            r5.append(r0)     // Catch:{ all -> 0x06fe }
            int r1 = r10.A01     // Catch:{ all -> 0x06fe }
            int r0 = r3.rawId_     // Catch:{ all -> 0x06fe }
            int r0 = java.lang.Integer.compare(r1, r0)     // Catch:{ all -> 0x06fe }
            r5.append(r0)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "; proto="
            r5.append(r0)     // Catch:{ all -> 0x06fe }
        L_0x05cb:
            r5.append(r11)     // Catch:{ all -> 0x06fe }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x06fe }
            r0 = r17
            r2.A0E(r0, r1, r4)     // Catch:{ all -> 0x06fe }
        L_0x05d7:
            r0 = 0
            goto L_0x0678
        L_0x05da:
            r13 = 0
        L_0x05db:
            com.whatsapp.jid.UserJid r8 = r6.userJid     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.DeviceJid r0 = r8.getPrimaryDevice()     // Catch:{ all -> 0x06fe }
            X.6EZ r1 = X.C133256Xm.A02(r0)     // Catch:{ all -> 0x06fe }
            X.3FZ r0 = new X.3FZ     // Catch:{ all -> 0x06fe }
            r0.<init>(r14)     // Catch:{ all -> 0x06fe }
            r12.A0Q(r0, r1)     // Catch:{ all -> 0x06fe }
            r32 = 0
            if (r13 == 0) goto L_0x05fb
            long r30 = r7.A01(r8)     // Catch:{ all -> 0x06fe }
            int r0 = (r30 > r32 ? 1 : (r30 == r32 ? 0 : -1))
            if (r0 <= 0) goto L_0x05fb
            r12 = 0
            goto L_0x0621
        L_0x05fb:
            X.0wo r0 = r5.A06     // Catch:{ all -> 0x06fe }
            long r30 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x06fe }
            X.0yC r9 = r5.A0C     // Catch:{ all -> 0x06fe }
            r1 = 730(0x2da, float:1.023E-42)
            r0 = r19
            int r1 = X.C20800yB.A00(r0, r9, r1)     // Catch:{ all -> 0x06fe }
            if (r1 >= r4) goto L_0x060e
            r1 = 1
        L_0x060e:
            r0 = 35
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x06fe }
            int r0 = r0 - r4
            long r0 = (long) r0     // Catch:{ all -> 0x06fe }
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r9
            long r30 = r30 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r30 = r30 / r0
            r12 = 1
        L_0x0621:
            long r0 = r3.timestamp_     // Catch:{ all -> 0x06fe }
            int r9 = (r0 > r30 ? 1 : (r0 == r30 ? 0 : -1))
            r11 = 1
            if (r9 > 0) goto L_0x062b
            r11 = 0
            r0 = 0
        L_0x062b:
            int r10 = r3.rawId_     // Catch:{ all -> 0x06fe }
            int r9 = r3.accountType_     // Catch:{ all -> 0x06fe }
            X.2q9 r28 = X.C52772q9.A00(r9)     // Catch:{ all -> 0x06fe }
            if (r28 != 0) goto L_0x0637
            X.2q9 r28 = X.C52772q9.E2EE     // Catch:{ all -> 0x06fe }
        L_0x0637:
            X.3QO r9 = new X.3QO     // Catch:{ all -> 0x06fe }
            r34 = 0
            r36 = 0
            r27 = r9
            r29 = r10
            r27.<init>((X.C52772q9) r28, (int) r29, (long) r30, (long) r32, (long) r34, (long) r36)     // Catch:{ all -> 0x06fe }
            X.3QO r9 = r7.A04(r9, r0)     // Catch:{ all -> 0x06fe }
            X.0x0 r10 = new X.0x0     // Catch:{ all -> 0x06fe }
            r10.<init>()     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.DeviceJid r1 = r8.getPrimaryDevice()     // Catch:{ all -> 0x06fe }
            java.lang.Long r0 = java.lang.Long.valueOf(r32)     // Catch:{ all -> 0x06fe }
            r10.put(r1, r0)     // Catch:{ all -> 0x06fe }
            int r0 = r3.keyIndex_     // Catch:{ all -> 0x06fe }
            long r0 = (long) r0     // Catch:{ all -> 0x06fe }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06fe }
            r10.put(r6, r0)     // Catch:{ all -> 0x06fe }
            X.0wy r0 = r10.build()     // Catch:{ all -> 0x06fe }
            r7.A0H(r0, r9, r8, r2)     // Catch:{ all -> 0x06fe }
            if (r11 != 0) goto L_0x066d
            if (r12 == 0) goto L_0x0677
        L_0x066d:
            X.1Nr r3 = r5.A05     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r4]     // Catch:{ all -> 0x06fe }
            r1[r2] = r8     // Catch:{ all -> 0x06fe }
            r0 = 3
            r3.A01(r1, r0)     // Catch:{ all -> 0x06fe }
        L_0x0677:
            r0 = 1
        L_0x0678:
            if (r26 == 0) goto L_0x067d
            r26.close()
        L_0x067d:
            return r0
        L_0x067e:
            X.0xN r1 = r5.A0I     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.UserJid r0 = r6.userJid     // Catch:{ all -> 0x06fe }
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()     // Catch:{ all -> 0x06fe }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x06fe }
            r1.A01(r0)     // Catch:{ all -> 0x06fe }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06fe }
            r1.<init>()     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/no primary key, jid="
            r1.append(r0)     // Catch:{ all -> 0x06fe }
            r1.append(r6)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06fe }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            X.1OE r3 = r5.A09     // Catch:{ all -> 0x06fe }
            X.2N9 r1 = new X.2N9     // Catch:{ all -> 0x06fe }
            r1.<init>()     // Catch:{ all -> 0x06fe }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x06fe }
            r1.A00 = r0     // Catch:{ all -> 0x06fe }
            X.0yW r0 = r3.A00     // Catch:{ all -> 0x06fe }
            r0.Bly(r1)     // Catch:{ all -> 0x06fe }
            goto L_0x06f2
        L_0x06b4:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06fe }
            r1.<init>()     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/advDeviceIdentity invalidProto:"
            r1.append(r0)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x06fe }
            r1.append(r0)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06fe }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            X.1OE r1 = r5.A09     // Catch:{ all -> 0x06fe }
            r0 = 2
            r1.A00(r0)     // Catch:{ all -> 0x06fe }
            goto L_0x06f2
        L_0x06d4:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06fe }
            r1.<init>()     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/advSignedDeviceIdentity invalidProto:"
            r1.append(r0)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x06fe }
            r1.append(r0)     // Catch:{ all -> 0x06fe }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06fe }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06fe }
            X.1OE r0 = r5.A09     // Catch:{ all -> 0x06fe }
            r0.A00(r4)     // Catch:{ all -> 0x06fe }
        L_0x06f2:
            if (r26 == 0) goto L_0x06f7
            r26.close()
        L_0x06f7:
            return r2
        L_0x06f8:
            if (r26 == 0) goto L_0x06fd
            r26.close()
        L_0x06fd:
            return r4
        L_0x06fe:
            r1 = move-exception
            if (r26 == 0) goto L_0x0709
            r26.close()     // Catch:{ all -> 0x0705 }
            throw r1
        L_0x0705:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0709:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OD.A0E(com.whatsapp.jid.DeviceJid, byte[], byte[], byte, int):boolean");
    }

    public AnonymousClass1OD(C19700wN r2, C19730wQ r3, C232417s r4, AnonymousClass1OG r5, AnonymousClass1OF r6, C237819v r7, C25951Ih r8, C27301Nr r9, C19970wo r10, AnonymousClass189 r11, AnonymousClass18I r12, AnonymousClass1FN r13, C236419g r14, AnonymousClass1OE r15, C20320xN r16, C24951Ek r17, C231417i r18, C20810yC r19) {
        this.A06 = r10;
        this.A0C = r19;
        this.A01 = r2;
        this.A02 = r3;
        this.A0G = r12;
        this.A05 = r9;
        this.A07 = r11;
        this.A0B = r18;
        this.A0A = r17;
        this.A03 = r6;
        this.A0I = r16;
        this.A0D = r4;
        this.A09 = r15;
        this.A0H = r13;
        this.A08 = r14;
        this.A04 = r8;
        this.A0F = r7;
        this.A0E = r5;
    }

    public static byte[] A05(MessageDigest messageDigest, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnonymousClass3FZ) it.next()).A00.A01);
        }
        Collections.sort(arrayList, new C81363wt());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            messageDigest.update((byte[]) it2.next());
        }
        return messageDigest.digest();
    }

    public void A0B(DeviceJid deviceJid, boolean z) {
        boolean z2 = false;
        if (deviceJid.getDevice() == 0) {
            z2 = true;
        }
        C18740tg.A0C(!z2);
        AnonymousClass79X A082 = this.A0G.A08(deviceJid);
        if (z) {
            try {
                if (this.A02.A0N(deviceJid)) {
                    Log.e("DeviceADVInfoHandler/onCompanionDeviceVerificationFail logout");
                    this.A08.A0C(deviceJid, "unknown_companion", false, false);
                } else {
                    this.A0B.A0D(C20760y7.of(deviceJid), deviceJid.userJid);
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        if (A082 != null) {
            A082.close();
        }
        this.A0H.A04(Collections.singleton(deviceJid));
        Iterator it = this.A00.keySet().iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onCompanionDeviceVerificationFail");
        }
    }
}
