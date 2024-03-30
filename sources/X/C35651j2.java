package X;

import com.whatsapp.comments.MessageCommentsManager;

/* renamed from: X.1j2  reason: invalid class name and case insensitive filesystem */
public class C35651j2 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C35651j2(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0317, code lost:
        r1.A04(java.util.Collections.singletonList(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x031e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03c0, code lost:
        X.C110515an.A00(X.C008903u.A00, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03c5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0437, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x043a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x050d, code lost:
        r2.A00(new X.C132636Up(r1, (java.lang.Object) r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0515, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05aa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05ae, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05b1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        r1 = r0.getObservers().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        if (r1.hasNext() == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        ((X.C226815j) r1.next()).A07(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r6 = r19
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x0545;
                case 1: goto L_0x0007;
                case 2: goto L_0x0007;
                case 3: goto L_0x0007;
                case 4: goto L_0x0007;
                case 5: goto L_0x052c;
                case 6: goto L_0x0516;
                case 7: goto L_0x0286;
                case 8: goto L_0x0257;
                case 9: goto L_0x0241;
                case 10: goto L_0x0490;
                case 11: goto L_0x0461;
                case 12: goto L_0x0400;
                case 13: goto L_0x03e0;
                case 14: goto L_0x01eb;
                case 15: goto L_0x03c6;
                case 16: goto L_0x03b0;
                case 17: goto L_0x039f;
                case 18: goto L_0x01c2;
                case 19: goto L_0x019c;
                case 20: goto L_0x019c;
                case 21: goto L_0x043e;
                case 22: goto L_0x038c;
                case 23: goto L_0x037c;
                case 24: goto L_0x017a;
                case 25: goto L_0x017a;
                case 26: goto L_0x017a;
                case 27: goto L_0x015a;
                case 28: goto L_0x032d;
                case 29: goto L_0x0143;
                case 30: goto L_0x00f8;
                case 31: goto L_0x031f;
                case 32: goto L_0x00d6;
                case 33: goto L_0x00b4;
                case 34: goto L_0x0092;
                case 35: goto L_0x0068;
                case 36: goto L_0x0044;
                case 37: goto L_0x030b;
                case 38: goto L_0x0022;
                case 39: goto L_0x0302;
                case 40: goto L_0x0302;
                case 41: goto L_0x02f4;
                case 42: goto L_0x02f4;
                case 43: goto L_0x02e8;
                case 44: goto L_0x02d4;
                case 45: goto L_0x02c0;
                case 46: goto L_0x0017;
                case 47: goto L_0x0017;
                case 48: goto L_0x0017;
                case 49: goto L_0x02a5;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r6.A00
            X.1NG r2 = (X.AnonymousClass1NG) r2
            java.lang.Object r1 = r6.A01
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.AnonymousClass1NG.A06(r2, r1)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r0 = r6.A00
            X.185 r0 = (X.AnonymousClass185) r0
            java.lang.Object r2 = r6.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.16I r0 = r0.A02
            goto L_0x002c
        L_0x0022:
            java.lang.Object r0 = r6.A00
            X.16D r0 = (X.AnonymousClass16D) r0
            java.lang.Object r2 = r6.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.16I r0 = r0.A06
        L_0x002c:
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0034:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.15j r0 = (X.C226815j) r0
            r0.A07(r2)
            goto L_0x0034
        L_0x0044:
            java.lang.Object r0 = r6.A00
            X.16D r0 = (X.AnonymousClass16D) r0
            java.lang.Object r1 = r6.A01
            X.16I r0 = r0.A06
            java.util.Set r2 = java.util.Collections.singleton(r1)
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0058:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.15j r0 = (X.C226815j) r0
            r0.A0D(r2)
            goto L_0x0058
        L_0x0068:
            java.lang.Object r0 = r6.A00
            X.16D r0 = (X.AnonymousClass16D) r0
            java.lang.Object r2 = r6.A01
            X.141 r2 = (X.AnonymousClass141) r2
            X.16I r1 = r0.A06
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = r2.A06(r0)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            java.lang.Iterable r0 = r1.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0082:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.15j r0 = (X.C226815j) r0
            r0.A07(r2)
            goto L_0x0082
        L_0x0092:
            java.lang.Object r0 = r6.A00
            X.16D r0 = (X.AnonymousClass16D) r0
            java.lang.Object r2 = r6.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.16I r0 = r0.A06
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x00a4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.15j r0 = (X.C226815j) r0
            r0.A0C(r2)
            goto L_0x00a4
        L_0x00b4:
            java.lang.Object r0 = r6.A00
            X.16D r0 = (X.AnonymousClass16D) r0
            java.lang.Object r2 = r6.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.16I r0 = r0.A06
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x00c6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.15j r0 = (X.C226815j) r0
            r0.A0A(r2)
            goto L_0x00c6
        L_0x00d6:
            java.lang.Object r0 = r6.A00
            X.16D r0 = (X.AnonymousClass16D) r0
            java.lang.Object r2 = r6.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.16I r0 = r0.A06
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x00e8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.15j r0 = (X.C226815j) r0
            r0.A08(r2)
            goto L_0x00e8
        L_0x00f8:
            java.lang.Object r5 = r6.A00
            X.196 r5 = (X.AnonymousClass196) r5
            java.lang.Object r4 = r6.A01
            X.6c4 r4 = (X.C135066c4) r4
            X.1AP r3 = r5.A0V
            java.lang.String r2 = r4.A0E
            X.C18740tg.A06(r2)
            X.1Av r1 = r3.A04
            java.lang.String r0 = r4.A0D
            java.io.File r2 = r1.A04(r2, r0)
            r1 = 0
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x0122
            java.io.File r0 = r3.A06(r4, r2)
            if (r0 == 0) goto L_0x0123
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0123
        L_0x0122:
            r1 = 1
        L_0x0123:
            java.lang.String r3 = r4.A0E
            if (r1 == 0) goto L_0x0016
            X.1AK r2 = r5.A0J
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "[\"favoriteSticker\",\""
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "\"]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.A04(r0)
            return
        L_0x0143:
            java.lang.Object r2 = r6.A00
            X.196 r2 = (X.AnonymousClass196) r2
            java.lang.Object r1 = r6.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            boolean r0 = r2.A0S()
            if (r0 == 0) goto L_0x0016
            X.1AK r5 = r2.A0J
            X.3Qa r0 = r1.A1J
            X.11F r1 = r0.A00
            monitor-enter(r5)
            goto L_0x0553
        L_0x015a:
            java.lang.Object r2 = r6.A00
            X.0CZ r2 = (X.AnonymousClass0CZ) r2
            java.lang.Object r0 = r6.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0166:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2.A07(r0)
            goto L_0x0166
        L_0x017a:
            java.lang.Object r0 = r6.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r0
            java.lang.Object r2 = r6.A01
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.1Lo r0 = r0.A08
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x018c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.1cp r0 = (X.C32021cp) r0
            r0.A03(r2)
            goto L_0x018c
        L_0x019c:
            java.lang.Object r0 = r6.A00
            X.1LV r0 = (X.AnonymousClass1LV) r0
            java.lang.Object r2 = r6.A01
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.1Lo r1 = r0.A07
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            java.lang.Iterable r0 = r1.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x01b2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.1cp r0 = (X.C32021cp) r0
            r0.A02(r2)
            goto L_0x01b2
        L_0x01c2:
            java.lang.Object r0 = r6.A00
            X.1LV r0 = (X.AnonymousClass1LV) r0
            java.lang.Object r1 = r6.A01
            X.3Qp r1 = (X.C65073Qp) r1
            X.1Lo r0 = r0.A07
            X.11F r2 = r1.A06()
            X.AnonymousClass00C.A08(r2)
            java.lang.Iterable r0 = r0.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x01db:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r1.next()
            X.1cp r0 = (X.C32021cp) r0
            r0.A01(r2)
            goto L_0x01db
        L_0x01eb:
            java.lang.Object r4 = r6.A00
            X.18z r4 = (X.C235718z) r4
            java.lang.Object r1 = r6.A01
            X.2rQ r1 = (X.C53502rQ) r1
            boolean r0 = r1 instanceof X.AnonymousClass2EN
            if (r0 == 0) goto L_0x0222
            X.2EN r1 = (X.AnonymousClass2EN) r1
            java.util.Collection r0 = r1.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x01ff:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r2 = r3.next()
            X.11F r2 = (X.AnonymousClass11F) r2
            X.12q r1 = r4.A06
            r0 = 0
            X.3Qp r1 = r1.A09(r2, r0)
            if (r1 == 0) goto L_0x01ff
            r1.A0i = r0
            X.005 r0 = r4.A0C
            java.lang.Object r0 = r0.get()
            X.163 r0 = (X.AnonymousClass163) r0
            r0.A06(r1)
            goto L_0x01ff
        L_0x0222:
            boolean r0 = r1 instanceof X.AnonymousClass2EM
            if (r0 == 0) goto L_0x0016
            X.12q r2 = r4.A06
            X.2EM r1 = (X.AnonymousClass2EM) r1
            X.11F r1 = r1.A00
            r0 = 0
            X.3Qp r1 = r2.A09(r1, r0)
            if (r1 == 0) goto L_0x0016
            r1.A0i = r0
            X.005 r0 = r4.A0C
            java.lang.Object r0 = r0.get()
            X.163 r0 = (X.AnonymousClass163) r0
            r0.A06(r1)
            return
        L_0x0241:
            java.lang.Object r2 = r6.A00
            X.5Iz r2 = (X.C106265Iz) r2
            java.lang.Object r1 = r6.A01
            X.1FA r1 = (X.AnonymousClass1FA) r1
            X.3Kh r0 = r2.A01
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x0016
            X.16J r1 = r1.A02
            r0 = 17
            r1.A05(r2, r0)
            return
        L_0x0257:
            java.lang.Object r4 = r6.A00
            X.1KD r4 = (X.AnonymousClass1KD) r4
            java.lang.Object r3 = r6.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            X.12q r1 = r4.A04
            r0 = 0
            X.3Qp r1 = r1.A09(r3, r0)
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1 instanceof X.AnonymousClass2LZ
            if (r0 == 0) goto L_0x0284
            r0 = r1
            X.2LZ r0 = (X.AnonymousClass2LZ) r0
            if (r0 == 0) goto L_0x0284
            boolean r0 = r0.A00
        L_0x0273:
            X.2LZ r2 = new X.2LZ
            r2.<init>(r1, r0)
            X.163 r0 = r4.A03
            long r0 = r0.A08(r3)
            r2.A0W = r0
            X.AnonymousClass1KD.A00(r4, r2)
            return
        L_0x0284:
            r0 = 1
            goto L_0x0273
        L_0x0286:
            java.lang.Object r1 = r6.A00
            X.1KD r1 = (X.AnonymousClass1KD) r1
            java.lang.Object r3 = r6.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            X.163 r0 = r1.A03
            long r7 = r0.A08(r3)
            X.1KE r2 = r1.A01
            r1 = 0
            boolean r0 = X.C197029b1.A00(r3)
            if (r0 == 0) goto L_0x0016
            X.12P r0 = r2.A00
            X.1M0 r6 = r0.A05()
            goto L_0x0582
        L_0x02a5:
            java.lang.Object r1 = r6.A00
            X.1O7 r1 = (X.AnonymousClass1O7) r1
            java.lang.Object r2 = r6.A01
            X.141 r2 = (X.AnonymousClass141) r2
            X.16K r0 = r1.A03
            r0.A04(r2)
            X.16I r1 = r1.A02
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r0 = r2.A06(r0)
            X.11F r0 = (X.AnonymousClass11F) r0
            r1.A00(r0)
            return
        L_0x02c0:
            java.lang.Object r0 = r6.A00
            X.16p r0 = (X.C229516p) r0
            java.lang.Object r1 = r6.A01
            java.util.Collection r1 = (java.util.Collection) r1
            X.005 r0 = r0.A08
            java.lang.Object r0 = r0.get()
            X.2ZF r0 = (X.AnonymousClass2ZF) r0
            r0.A01(r1)
            return
        L_0x02d4:
            java.lang.Object r0 = r6.A00
            X.16p r0 = (X.C229516p) r0
            java.lang.Object r1 = r6.A01
            java.util.Collection r1 = (java.util.Collection) r1
            X.005 r0 = r0.A08
            java.lang.Object r0 = r0.get()
            X.2ZF r0 = (X.AnonymousClass2ZF) r0
            r0.A00(r1)
            return
        L_0x02e8:
            java.lang.Object r1 = r6.A00
            X.16p r1 = (X.C229516p) r1
            java.lang.Object r0 = r6.A01
            X.141 r0 = (X.AnonymousClass141) r0
            X.C229516p.A0B(r1, r0)
            return
        L_0x02f4:
            java.lang.Object r0 = r6.A00
            X.16D r0 = (X.AnonymousClass16D) r0
            java.lang.Object r1 = r6.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.16I r0 = r0.A06
            r0.A02(r1)
            return
        L_0x0302:
            java.lang.Object r1 = r6.A00
            X.16D r1 = (X.AnonymousClass16D) r1
            java.lang.Object r0 = r6.A01
            X.16I r1 = r1.A06
            goto L_0x0317
        L_0x030b:
            java.lang.Object r1 = r6.A00
            X.16D r1 = (X.AnonymousClass16D) r1
            java.lang.Object r0 = r6.A01
            X.141 r0 = (X.AnonymousClass141) r0
            X.16I r1 = r1.A06
            X.11F r0 = r0.A0H
        L_0x0317:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.A04(r0)
            return
        L_0x031f:
            java.lang.Object r0 = r6.A00
            X.1M7 r0 = (X.AnonymousClass1M7) r0
            java.lang.Object r1 = r6.A01
            X.3K7 r1 = (X.AnonymousClass3K7) r1
            X.0wD r0 = r0.A01
            r0.A08(r1)
            return
        L_0x032d:
            java.lang.Object r7 = r6.A00
            X.1Ia r7 = (X.C25881Ia) r7
            java.lang.Object r6 = r6.A01
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            X.0wQ r0 = r7.A00
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r2 = r0.A03
            if (r2 != 0) goto L_0x0344
            java.lang.String r0 = "security-notification-setting-manager/my user id is null (unregistered?)."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0344:
            X.0v0 r0 = r7.A03
            boolean r3 = r0.A2C()
            X.19w r1 = r7.A05
            r0 = 1
            X.3Qa r2 = r1.A02(r2, r0)
            X.0wo r0 = r7.A02
            long r0 = X.C19970wo.A00(r0)
            X.5J7 r5 = new X.5J7
            r5.<init>(r2, r0)
            r5.A00 = r6
            r5.A00 = r3
            X.1AI r0 = r7.A04
            long r3 = r0.A01(r5)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0371
            java.lang.String r0 = "security-notification-setting-manager/failed to add peer message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0371:
            X.164 r1 = r7.A01
            com.whatsapp.jobqueue.job.SendPeerMessageJob r0 = new com.whatsapp.jobqueue.job.SendPeerMessageJob
            r0.<init>(r6, r5)
            r1.A01(r0)
            return
        L_0x037c:
            java.lang.Object r0 = r6.A00
            X.1Sq r0 = (X.C28431Sq) r0
            java.lang.Object r1 = r6.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            X.1LV r0 = r0.A03
            X.147 r1 = (X.AnonymousClass147) r1
            r0.A0C(r1)
            return
        L_0x038c:
            java.lang.Object r1 = r6.A00
            X.1Sn r1 = (X.C28401Sn) r1
            java.lang.Object r0 = r6.A01
            X.17z r1 = r1.A09
            java.util.Set r0 = java.util.Collections.singleton(r0)
            X.AnonymousClass00C.A08(r0)
            r1.A00(r0)
            return
        L_0x039f:
            java.lang.Object r3 = r6.A00
            com.whatsapp.comments.MessageCommentsManager r3 = (com.whatsapp.comments.MessageCommentsManager) r3
            java.lang.Object r2 = r6.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            r1 = 0
            java.util.Set r0 = com.whatsapp.comments.MessageCommentsManager.A0D
            com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1 r4 = new com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForCommentAsync$1$1
            r4.<init>(r3, r2, r1, r1)
            goto L_0x03c0
        L_0x03b0:
            java.lang.Object r3 = r6.A00
            com.whatsapp.comments.MessageCommentsManager r3 = (com.whatsapp.comments.MessageCommentsManager) r3
            java.lang.Object r2 = r6.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            r1 = 0
            java.util.Set r0 = com.whatsapp.comments.MessageCommentsManager.A0D
            com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessageAsync$1$1 r4 = new com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessageAsync$1$1
            r4.<init>(r3, r2, r1, r1)
        L_0x03c0:
            X.03u r0 = X.C008903u.A00
            X.C110515an.A00(r0, r4)
            return
        L_0x03c6:
            java.lang.Object r2 = r6.A00
            X.18z r2 = (X.C235718z) r2
            java.lang.Object r0 = r6.A01
            X.11F r0 = (X.AnonymousClass11F) r0
            X.196 r1 = r2.A05
            java.util.Set r0 = X.C235718z.A00(r2, r0)
            r1.A0Q(r0)
            X.005 r0 = r2.A0D
            java.lang.Object r0 = r0.get()
            X.1Cf r0 = (X.C24381Cf) r0
            goto L_0x0437
        L_0x03e0:
            java.lang.Object r2 = r6.A00
            X.1gN r2 = (X.C34051gN) r2
            java.lang.Object r0 = r6.A01
            X.5Nh r0 = (X.C107265Nh) r0
            X.C34051gN.A00(r2)
            X.6by r0 = r0.A04
            java.lang.String r0 = r0.A02
            java.lang.String r1 = X.C34681hT.A08(r0)
            monitor-enter(r2)
            java.util.Set r0 = r2.A00     // Catch:{ all -> 0x03fd }
            r0.remove(r1)     // Catch:{ all -> 0x03fd }
            monitor-exit(r2)     // Catch:{ all -> 0x03fd }
            X.1Cf r0 = r2.A02
            goto L_0x0437
        L_0x03fd:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03fd }
            throw r1
        L_0x0400:
            java.lang.Object r5 = r6.A00
            X.1gN r5 = (X.C34051gN) r5
            java.lang.Object r4 = r6.A01
            X.5Nh r4 = (X.C107265Nh) r4
            X.C34051gN.A00(r5)
            java.util.Set r0 = r5.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0426
            X.0v0 r0 = r5.A01
            long r2 = r4.A02()
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "first_unseen_joinable_call"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
            r0.apply()
        L_0x0426:
            X.6by r0 = r4.A04
            java.lang.String r0 = r0.A02
            java.lang.String r1 = X.C34681hT.A08(r0)
            monitor-enter(r5)
            java.util.Set r0 = r5.A00     // Catch:{ all -> 0x043b }
            r0.add(r1)     // Catch:{ all -> 0x043b }
            monitor-exit(r5)     // Catch:{ all -> 0x043b }
            X.1Cf r0 = r5.A02
        L_0x0437:
            r0.A00()
            return
        L_0x043b:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x043b }
            throw r1
        L_0x043e:
            java.lang.Object r2 = r6.A00
            com.whatsapp.community.CommunityFragment r2 = (com.whatsapp.community.CommunityFragment) r2
            java.lang.Object r1 = r6.A01
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.1h1 r0 = r2.A09
            if (r0 != 0) goto L_0x045b
            java.lang.String r0 = "adapter"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x045b:
            X.0Cc r0 = r0.A00
            r0.A00(r1)
            return
        L_0x0461:
            java.lang.Object r4 = r6.A00
            X.1NE r4 = (X.AnonymousClass1NE) r4
            java.lang.Object r5 = r6.A01
            X.6NW r5 = (X.AnonymousClass6NW) r5
            com.whatsapp.jid.GroupJid r3 = r5.A07
            if (r3 == 0) goto L_0x048b
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x048b
            X.17X r0 = r4.A0H
            X.17r r2 = r0.A07
            int r1 = r2.A0B(r3)
            X.0yC r0 = r4.A0K
            boolean r0 = X.C34681hT.A0O(r0, r1)
            if (r0 == 0) goto L_0x048b
            X.6X6 r0 = r2.A0C(r3)
            java.lang.String r0 = r0.A0E()
            r5.A02 = r0
        L_0x048b:
            X.1PW r2 = r4.A0A
            java.lang.String r1 = "start_from_call_log"
            goto L_0x050d
        L_0x0490:
            java.lang.Object r2 = r6.A00
            X.1NE r2 = (X.AnonymousClass1NE) r2
            java.lang.Object r4 = r6.A01
            X.6NW r4 = (X.AnonymousClass6NW) r4
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.LinkedHashMap r0 = r4.A0C
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x04a7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x04bf
            java.lang.Object r3 = r5.next()
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.1Pb r1 = r2.A0C
            java.lang.String r0 = "CallsManager/startVoiceService"
            com.whatsapp.voipcalling.CallParticipantJid r0 = r1.A00(r3, r0)
            r11.put(r3, r0)
            goto L_0x04a7
        L_0x04bf:
            r0 = 0
            r4.A02 = r0
            com.whatsapp.jid.GroupJid r6 = r4.A07
            if (r6 == 0) goto L_0x04e4
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x04e4
            X.17X r0 = r2.A0H
            X.17r r3 = r0.A07
            int r1 = r3.A0B(r6)
            X.0yC r0 = r2.A0K
            boolean r0 = X.C34681hT.A0O(r0, r1)
            if (r0 == 0) goto L_0x04e4
            X.6X6 r0 = r3.A0C(r6)
            java.lang.String r0 = r0.A0E()
            r4.A02 = r0
        L_0x04e4:
            java.lang.String r8 = r4.A0A
            boolean r14 = r4.A0E
            int r12 = r4.A06
            boolean r15 = r4.A0F
            java.lang.String r9 = r4.A0B
            boolean r3 = r4.A0D
            java.lang.Integer r7 = r4.A09
            java.lang.String r10 = r4.A02
            boolean r1 = r4.A03
            int r13 = r4.A00
            boolean r0 = r4.A04
            X.6NW r5 = new X.6NW
            r16 = r3
            r17 = r1
            r18 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            long r0 = r4.A01
            r5.A01 = r0
            X.1PW r2 = r2.A0A
            java.lang.String r1 = "start_call"
        L_0x050d:
            X.6Up r0 = new X.6Up
            r0.<init>((java.lang.String) r1, (java.lang.Object) r5)
            r2.A00(r0)
            return
        L_0x0516:
            java.lang.Object r1 = r6.A00
            X.1KD r1 = (X.AnonymousClass1KD) r1
            java.lang.Object r0 = r6.A01
            X.2LZ r0 = (X.AnonymousClass2LZ) r0
            r2 = 0
            X.AnonymousClass1KD.A00(r1, r0)
            X.1DP r1 = r1.A02
            X.11F r0 = r0.A06()
            r1.A02(r0, r2)
            return
        L_0x052c:
            java.lang.Object r1 = r6.A00
            X.33w r1 = (X.C594233w) r1
            java.lang.Object r3 = r6.A01
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.4vP r2 = r1.A00
            X.7ku r1 = r1.A01
            java.util.List r0 = java.util.Collections.singletonList(r3)
            X.AnonymousClass00C.A08(r0)
            X.AnonymousClass6JI.A00(X.C142326oh.A03(r2), new X.AnonymousClass6MO(r0), r1)
            return
        L_0x0545:
            java.lang.Object r0 = r6.A00
            X.1NG r0 = (X.AnonymousClass1NG) r0
            java.lang.Object r1 = r6.A01
            java.util.Map r1 = (java.util.Map) r1
            X.16y r0 = r0.A0F
            r0.A02(r1)
            return
        L_0x0553:
            X.1AC r4 = r5.A00     // Catch:{ all -> 0x057f }
            X.AAR r3 = X.AAR.A00     // Catch:{ all -> 0x057f }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x057f }
            java.lang.String r1 = r1.getRawString()     // Catch:{ all -> 0x057f }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x057f }
            java.lang.String r1 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE chat_jid == ? AND are_dependencies_missing = 1 ORDER BY _id ASC"
            java.lang.String r0 = "SyncdMutationsTable.SELECT_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES"
            java.util.ArrayList r0 = X.AnonymousClass1AC.A03(r3, r4, r1, r0, r2)     // Catch:{ all -> 0x057f }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x057f }
        L_0x056d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x057f }
            if (r0 == 0) goto L_0x057d
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x057f }
            X.9k5 r0 = (X.C201669k5) r0     // Catch:{ all -> 0x057f }
            r5.A03(r0)     // Catch:{ all -> 0x057f }
            goto L_0x056d
        L_0x057d:
            monitor-exit(r5)     // Catch:{ all -> 0x057f }
            return
        L_0x057f:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x057f }
            throw r1
        L_0x0582:
            X.71s r5 = r6.B1k()     // Catch:{ all -> 0x05ab }
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x05a4 }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x05a4 }
            r4[r1] = r0     // Catch:{ all -> 0x05a4 }
            X.14e r3 = r6.A02     // Catch:{ all -> 0x05a4 }
            java.lang.String r2 = "bot_chat_info"
            java.lang.String r1 = "chat_row_id = ?"
            java.lang.String r0 = "BonsaiChatInfoStore/removeBotChatInfo"
            r3.A03(r2, r1, r0, r4)     // Catch:{ all -> 0x05a4 }
            r5.A00()     // Catch:{ all -> 0x05a4 }
            r5.close()     // Catch:{ all -> 0x05ab }
            r6.close()
            return
        L_0x05a4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05a6 }
        L_0x05a6:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x05ab }
            throw r0     // Catch:{ all -> 0x05ab }
        L_0x05ab:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05ad }
        L_0x05ad:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35651j2.run():void");
    }

    public C35651j2(MessageCommentsManager messageCommentsManager, AnonymousClass3T1 r3) {
        this.A02 = 16;
        this.A00 = messageCommentsManager;
        this.A01 = r3;
    }

    public C35651j2(MessageCommentsManager messageCommentsManager, AnonymousClass3T1 r3, C009003v r4, int i) {
        this.A02 = 17;
        this.A00 = messageCommentsManager;
        this.A01 = r3;
    }
}
