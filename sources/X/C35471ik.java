package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1ik  reason: invalid class name and case insensitive filesystem */
public class C35471ik implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;

    public C35471ik(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.A08 = i;
        this.A01 = obj;
        this.A05 = obj2;
        this.A00 = obj3;
        this.A04 = obj4;
        this.A07 = obj5;
        this.A03 = obj6;
        this.A06 = obj7;
        this.A02 = obj8;
    }

    public static void A00(C35471ik r6, C20070wy r7, C200949iW r8) {
        UserJid userJid = r8.A06;
        if (r7.isEmpty()) {
            return;
        }
        if (!((C19730wQ) r6.A05).A0M(userJid)) {
            C231417i r62 = (C231417i) r6.A07;
            C227315o r5 = new C227315o();
            for (Map.Entry entry : r62.A0C(userJid).entrySet()) {
                if (r7.containsKey(entry.getKey()) && r7.get(entry.getKey()) == entry.getValue()) {
                    r5.add(entry.getKey());
                }
            }
            r62.A0D(r5.build(), userJid);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Remove self device, userJid=");
        sb.append(userJid);
        sb.append("; toAdd=");
        sb.append(r7);
        ((C19700wN) r6.A01).A0E("invalid-device-notification", sb.toString(), false);
    }

    public static boolean A01(C35471ik r16, C20070wy r17, UserJid userJid, C200949iW r19) {
        AnonymousClass3FZ r0;
        String obj;
        Object obj2;
        C20070wy r4 = r17;
        if (!r4.isEmpty()) {
            C35471ik r5 = r16;
            UserJid userJid2 = userJid;
            if (!((C19730wQ) r5.A05).A0M(userJid2)) {
                C200949iW r10 = r19;
                byte[] bArr = r10.A09;
                if (bArr == null) {
                    obj = "SyncDeviceNotificationRunnable/verifyADVIndexList/no key index list in device add notification";
                } else {
                    UserJid userJid3 = r10.A06;
                    AnonymousClass1OD r2 = (AnonymousClass1OD) r5.A03;
                    AnonymousClass00I A062 = r2.A06(userJid3, bArr);
                    AnonymousClass8RP r1 = null;
                    if (A062 == null || (obj2 = A062.A00) == null) {
                        r0 = null;
                    } else {
                        r1 = (AnonymousClass8RP) obj2;
                        r0 = (AnonymousClass3FZ) A062.A01;
                    }
                    long j = r10.A00;
                    if (!AnonymousClass1OD.A04(r2, userJid3, r1, C19960wn.A01, j)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SyncDeviceNotificationRunnable/verifyADVIndexList/validate indexList fail, userJid=");
                        sb.append(userJid3);
                        obj = sb.toString();
                    } else {
                        C18740tg.A06(r1);
                        C231417i r42 = (C231417i) r5.A07;
                        HashMap hashMap = new HashMap(r42.A0C(userJid3));
                        hashMap.putAll(r10.A02);
                        AnonymousClass3QO A052 = r42.A05(userJid3);
                        if (A052 == null) {
                            int i = r1.rawId_;
                            C52772q9 A002 = C52772q9.A00(r1.accountType_);
                            if (A002 == null) {
                                A002 = C52772q9.E2EE;
                            }
                            A052 = new AnonymousClass3QO(A002, i, 0, 0, 0, 0);
                        }
                        r42.A0H(C20070wy.copyOf((Map) r2.A08(r1.validIndexes_, r42.A0C(userJid3), hashMap, r1.currentIndex_)), r42.A04(A052, j), userJid3, false);
                        if (r0 != null) {
                            r2.A07.A0Q(r0, C133256Xm.A02(userJid3.getPrimaryDevice()));
                            return false;
                        }
                    }
                }
                Log.e(obj);
                Log.e("SyncDeviceNotificationRunnable/handleUserDeviceUpdate/invalid adv data");
                return true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Add self device, userJid=");
            sb2.append(userJid2);
            sb2.append("; toAdd=");
            sb2.append(r4);
            ((C19700wN) r5.A01).A0E("invalid-device-notification", sb2.toString(), false);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r24 = this;
            r2 = r24
            int r0 = r2.A08
            if (r0 == 0) goto L_0x0148
            java.lang.Object r4 = r2.A00
            X.1Yq r4 = (X.C29951Yq) r4
            java.lang.Object r10 = r2.A01
            X.6c4 r10 = (X.C135066c4) r10
            java.lang.Object r9 = r2.A02
            X.11F r9 = (X.AnonymousClass11F) r9
            java.lang.Object r8 = r2.A03
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            java.lang.Object r7 = r2.A04
            X.3T1 r7 = (X.AnonymousClass3T1) r7
            java.lang.Object r5 = r2.A05
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r3 = r2.A06
            X.6c9 r3 = (X.C135106c9) r3
            java.lang.Object r6 = r2.A07
            X.3ty r6 = (X.C79593ty) r6
            X.5vK r2 = new X.5vK
            r2.<init>()
            r0 = 2
            java.util.concurrent.CountDownLatch r11 = new java.util.concurrent.CountDownLatch
            r11.<init>(r0)
            if (r10 != 0) goto L_0x00b3
            r0 = 6
        L_0x0034:
            r2.A01 = r0
            r11.countDown()
        L_0x0039:
            X.0yC r10 = r4.A03
            r9 = 1084(0x43c, float:1.519E-42)
            X.0yV r8 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r8, r10, r9)
            r0 = 7
            if (r1 == 0) goto L_0x0059
            if (r3 == 0) goto L_0x0059
            X.0y0 r0 = r4.A00
            java.io.File r0 = r0.A0F()
            java.io.File r17 = r3.A02(r0)
            boolean r0 = r17.exists()
            if (r0 != 0) goto L_0x0060
            r0 = 4
        L_0x0059:
            r2.A00 = r0
        L_0x005b:
            r11.countDown()
            goto L_0x0130
        L_0x0060:
            X.1Ee r1 = r4.A02
            java.lang.String r0 = r3.A0F
            X.6c9 r7 = r1.A03(r0)
            r5 = 1
            if (r7 == 0) goto L_0x00f3
            byte[] r12 = r7.A08
            if (r12 == 0) goto L_0x00f3
            long r0 = r7.A00
            X.6Rx r13 = new X.6Rx
            r13.<init>(r12, r0)
            X.0wo r12 = r4.A01
            long r0 = X.C19970wo.A00(r12)
            boolean r0 = X.C132046Rx.A01(r13, r0)
            if (r0 == 0) goto L_0x00f3
            long r0 = r7.A00
            long r15 = X.C19970wo.A00(r12)
            r12 = 432000000(0x19bfcc00, double:2.13436359E-315)
            long r0 = r0 + r12
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x00f3
            int r12 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r12 >= 0) goto L_0x00f3
            byte[] r14 = r7.A08
            long r0 = r7.A00
            java.lang.String r13 = r7.A04
            java.lang.String r12 = r7.A03
            java.lang.String r7 = r7.A02
            boolean r4 = X.C20800yB.A01(r8, r10, r9)
            r3.A08 = r14
            r3.A00 = r0
            r3.A04 = r13
            r3.A03 = r12
            r3.A02 = r7
            r3.A07 = r4
            r2.A00 = r5
            goto L_0x005b
        L_0x00b3:
            int r0 = r10.A00
            long r0 = (long) r0
            r13 = 1048576(0x100000, double:5.180654E-318)
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 > 0) goto L_0x00f0
            r13 = 0
            X.3Rg r1 = X.C29951Yq.A00(r10, r13)
            if (r1 != 0) goto L_0x00c7
            r0 = 4
            goto L_0x0034
        L_0x00c7:
            X.1D0 r12 = r4.A04
            r0 = 1
            X.6vi r1 = r12.A07(r1, r0)
            java.lang.String r0 = "mms"
            r1.A0X = r0
            X.70X r14 = new X.70X
            r15 = r9
            r16 = r8
            r17 = r1
            r18 = r2
            r19 = r4
            r20 = r7
            r21 = r10
            r22 = r5
            r23 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1.A06(r14, r13)
            r12.A0E(r1, r13)
            goto L_0x0039
        L_0x00f0:
            r0 = 2
            goto L_0x0034
        L_0x00f3:
            r13 = 0
            r0 = 0
            X.3Ot r15 = new X.3Ot
            r15.<init>(r5, r0, r5)
            X.1Gl r16 = X.C25471Gl.A0Z
            android.net.Uri r12 = android.net.Uri.fromFile(r17)
            r17 = r13
            r18 = r13
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1
            r14 = r13
            X.3Rg r0 = X.C65233Rg.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.1D0 r7 = r4.A04
            X.6vi r1 = r7.A07(r0, r5)
            java.lang.String r0 = "mms"
            r1.A0X = r0
            X.70T r0 = new X.70T
            r14 = r0
            r15 = r3
            r16 = r1
            r17 = r2
            r18 = r4
            r19 = r11
            r14.<init>(r15, r16, r17, r18, r19)
            r1.A06(r0, r13)
            r7.A0E(r1, r13)
        L_0x0130:
            r11.await()     // Catch:{ InterruptedException -> 0x0134 }
            goto L_0x013f
        L_0x0134:
            r1 = move-exception
            java.lang.String r0 = "Payment Media upload interrupted"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0143 }
            r0 = 3
            r2.A01 = r0     // Catch:{ all -> 0x0143 }
            r2.A00 = r0     // Catch:{ all -> 0x0143 }
        L_0x013f:
            r6.A0C(r2)
            return
        L_0x0143:
            r0 = move-exception
            r6.A0C(r2)
            throw r0
        L_0x0148:
            java.lang.Object r0 = r2.A02
            java.util.List r0 = (java.util.List) r0
            r0.size()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r13 = r0.iterator()
        L_0x0158:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0274
            java.lang.Object r5 = r13.next()
            X.9iW r5 = (X.C200949iW) r5
            java.lang.String r7 = r5.A07
            java.lang.String r0 = r5.A08
            if (r0 == 0) goto L_0x01d0
            X.C18740tg.A06(r0)
            byte[] r1 = r0.getBytes()
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x01b6 }
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r4 = java.util.Collections.singletonList(r1)
            java.lang.Object r0 = r2.A00
            X.16D r0 = (X.AnonymousClass16D) r0
            X.16p r1 = r0.A05
            r0 = 1
            java.util.ArrayList r1 = X.C229516p.A07(r1, r0)
            java.lang.Object r0 = r2.A06
            X.1O5 r0 = (X.AnonymousClass1O5) r0
            java.util.ArrayList r0 = X.C202329lb.A01(r0, r6, r4, r1)
            java.util.Iterator r4 = r0.iterator()
        L_0x019c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01b2
            java.lang.Object r0 = r4.next()
            X.141 r0 = (X.AnonymousClass141) r0
            X.11F r1 = r0.A0H
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x019c
            r5.add(r1)
            goto L_0x019c
        L_0x01b2:
            r5.size()
            goto L_0x01cc
        L_0x01b6:
            r0 = move-exception
            java.lang.Object r5 = r2.A01
            X.0wN r5 = (X.C19700wN) r5
            java.lang.String r4 = r0.toString()
            r1 = 1
            java.lang.String r0 = "SyncDeviceNotificationRunnable/getSidelistContactsMatchingHash NoSuchAlgorithmException"
            r5.A0E(r0, r4, r1)
            java.lang.String r0 = "SyncDeviceNotificationRunnable/onRun/NoSuchAlgorithmException."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.util.List r5 = java.util.Collections.EMPTY_LIST
        L_0x01cc:
            r3.addAll(r5)
            goto L_0x0158
        L_0x01d0:
            com.whatsapp.jid.UserJid r4 = r5.A06
            X.C18740tg.A06(r4)
            java.lang.Object r6 = r2.A07
            X.17i r6 = (X.C231417i) r6
            long r11 = r6.A01(r4)
            long r0 = r5.A00
            r10 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r10)
            int r8 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x021c
            java.lang.String r0 = "SyncDeviceNotificationRunnable/handleUserDeviceUpdate/local ts is larger than notification one"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.00I r6 = new X.00I
            r6.<init>(r9, r9)
        L_0x01f2:
            java.lang.Object r0 = r6.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0202
            X.C18740tg.A06(r4)
            r3.add(r4)
        L_0x0202:
            java.lang.Object r0 = r6.A01
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0158
            X.00I r0 = r5.A01
            if (r0 == 0) goto L_0x0158
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x0158
            X.C18740tg.A06(r0)
            r3.add(r0)
            goto L_0x0158
        L_0x021c:
            X.0wy r0 = r5.A02
            boolean r9 = A01(r2, r0, r4, r5)
            X.00I r8 = r5.A01
            if (r8 == 0) goto L_0x0272
            X.0wy r1 = r5.A04
            java.lang.Object r0 = r8.A00
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = A01(r2, r1, r0, r5)
        L_0x0230:
            if (r9 != 0) goto L_0x0269
            if (r0 != 0) goto L_0x0269
            X.0wy r0 = r5.A03
            A00(r2, r0, r5)
            if (r8 == 0) goto L_0x0252
            X.0wy r0 = r5.A05
            A00(r2, r0, r5)
            java.lang.Object r1 = r8.A00
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r0 = r8.A01
            java.lang.String r0 = (java.lang.String) r0
            X.C18740tg.A06(r0)
            boolean r0 = r6.A0I(r1, r0)
            if (r0 != 0) goto L_0x0252
            r10 = 1
        L_0x0252:
            X.C18740tg.A06(r7)
            boolean r0 = r6.A0I(r4, r7)
            r0 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
        L_0x0263:
            X.00I r6 = new X.00I
            r6.<init>(r1, r0)
            goto L_0x01f2
        L_0x0269:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0263
        L_0x0272:
            r0 = 0
            goto L_0x0230
        L_0x0274:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0291
            r3.size()
            java.lang.Object r2 = r2.A04
            X.1Nr r2 = (X.C27301Nr) r2
            int r0 = r3.size()
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            java.lang.Object[] r1 = r3.toArray(r0)
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1
            r0 = 2
            r2.A01(r1, r0)
        L_0x0291:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35471ik.run():void");
    }
}
