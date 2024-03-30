package X;

/* renamed from: X.1iV  reason: invalid class name and case insensitive filesystem */
public class C35321iV implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C35321iV(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:210:0x06a9, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x06ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x07b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x07bc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x07bf, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x07c0, code lost:
        X.C05600Qi.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x07c3, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x091e, code lost:
        r6.A0H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0921, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        r4.A01.A06(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0e21, code lost:
        if (((X.C108735Ur) r7.getCause()).zza == 4) goto L_0x0e23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0e3b, code lost:
        if (r0 != false) goto L_0x0e3d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a7, code lost:
        if (r2.A1G() == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e0, code lost:
        if (r2.A1G() == false) goto L_0x01e2;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r32 = this;
            r3 = r32
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x0dac;
                case 1: goto L_0x04e0;
                case 2: goto L_0x0d64;
                case 3: goto L_0x04c9;
                case 4: goto L_0x0451;
                case 5: goto L_0x0d51;
                case 6: goto L_0x0d3b;
                case 7: goto L_0x0cd3;
                case 8: goto L_0x0cbe;
                case 9: goto L_0x0a06;
                case 10: goto L_0x09f3;
                case 11: goto L_0x09af;
                case 12: goto L_0x0948;
                case 13: goto L_0x0418;
                case 14: goto L_0x093c;
                case 15: goto L_0x0922;
                case 16: goto L_0x08fb;
                case 17: goto L_0x08e0;
                case 18: goto L_0x03e4;
                case 19: goto L_0x0007;
                case 20: goto L_0x0007;
                case 21: goto L_0x03ca;
                case 22: goto L_0x0007;
                case 23: goto L_0x03ca;
                case 24: goto L_0x0007;
                case 25: goto L_0x02b2;
                case 26: goto L_0x025e;
                case 27: goto L_0x08c7;
                case 28: goto L_0x08ab;
                case 29: goto L_0x089f;
                case 30: goto L_0x022f;
                case 31: goto L_0x0875;
                case 32: goto L_0x084b;
                case 33: goto L_0x07c4;
                case 34: goto L_0x0761;
                case 35: goto L_0x074e;
                case 36: goto L_0x01b0;
                case 37: goto L_0x06bb;
                case 38: goto L_0x062f;
                case 39: goto L_0x05ed;
                case 40: goto L_0x059b;
                case 41: goto L_0x016f;
                case 42: goto L_0x0107;
                case 43: goto L_0x0057;
                case 44: goto L_0x0041;
                case 45: goto L_0x0025;
                case 46: goto L_0x0552;
                case 47: goto L_0x0535;
                case 48: goto L_0x0515;
                case 49: goto L_0x04fe;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r3.A00
            X.1Sq r4 = (X.C28431Sq) r4
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = r3.A02
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            android.content.Context r2 = r0.getContext()
            X.AnonymousClass00C.A08(r2)
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass190.A0i(r2, r1, r0)
        L_0x001f:
            X.1Dv r0 = r4.A01
            r0.A06(r2, r1)
        L_0x0024:
            return
        L_0x0025:
            java.lang.Object r0 = r3.A00
            X.1f4 r0 = (X.C33301f4) r0
            java.lang.Object r5 = r3.A01
            X.3xi r5 = (X.C81843xi) r5
            java.lang.Object r4 = r3.A02
            java.lang.Object r3 = r5.call()     // Catch:{ 02S -> 0x0024 }
            android.os.Handler r2 = r0.A00     // Catch:{ 02S -> 0x0024 }
            r1 = 44
            X.1iV r0 = new X.1iV     // Catch:{ 02S -> 0x0024 }
            r0.<init>(r5, r4, r3, r1)     // Catch:{ 02S -> 0x0024 }
            r2.post(r0)     // Catch:{ 02S -> 0x0024 }
            goto L_0x0e47
        L_0x0041:
            java.lang.Object r0 = r3.A00
            X.3xi r0 = (X.C81843xi) r0
            java.lang.Object r2 = r3.A01
            X.4Q6 r2 = (X.AnonymousClass4Q6) r2
            java.lang.Object r1 = r3.A02
            X.0Bk r0 = r0.A00
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x0024
            r2.BU2(r1)
            return
        L_0x0057:
            java.lang.Object r5 = r3.A00
            X.1NM r5 = (X.AnonymousClass1NM) r5
            java.lang.Object r4 = r3.A01
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r1 = r3.A02
            java.util.Collection r1 = (java.util.Collection) r1
            int r0 = r4.size()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x0070:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r1 = r6.next()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.3Qa r0 = r1.A1J
            X.11F r3 = r0.A00
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0070
            int r1 = r1.A0D
            r0 = 16
            if (r1 == r0) goto L_0x0070
            r0 = 18
            if (r1 == r0) goto L_0x0070
            r0 = 17
            if (r1 == r0) goto L_0x0070
            r0 = 9
            if (r1 == r0) goto L_0x0070
            r0 = 10
            if (r1 == r0) goto L_0x0070
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L_0x0070
            r1 = 1
            boolean r0 = r2.containsKey(r3)
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r2.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r1 + r0
        L_0x00b2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.put(r3, r0)
            goto L_0x0070
        L_0x00ba:
            android.content.SharedPreferences r6 = X.AnonymousClass1NM.A00(r5)
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x00c6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.String r5 = r0.getRawString()
            java.lang.String r0 = "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"
            java.lang.String r0 = r6.getString(r5, r0)
            X.9fc r4 = X.C199619fc.A00(r0)
            java.lang.Long r1 = r4.A0M
            java.lang.Object r0 = r2.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r2 = (long) r0
            if (r1 != 0) goto L_0x0102
            r0 = 0
        L_0x00f7:
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0M = r0
            X.AnonymousClass1NM.A02(r6, r4, r5)
            goto L_0x00c6
        L_0x0102:
            long r0 = r1.longValue()
            goto L_0x00f7
        L_0x0107:
            java.lang.Object r5 = r3.A00
            X.1NM r5 = (X.AnonymousClass1NM) r5
            java.lang.Object r2 = r3.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r8 = r3.A02
            X.3Qa r8 = (X.C64933Qa) r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ChatMessageCounts/onChatMessagesSent jids:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A07()
            X.1A1 r1 = r5.A0P
            X.3T1 r4 = r1.A03(r8)
            X.11F r0 = r8.A00
            boolean r0 = r0 instanceof X.C177538dx
            if (r0 == 0) goto L_0x016d
            X.3T1 r3 = r1.A03(r8)
        L_0x013a:
            java.util.Iterator r2 = r2.iterator()
        L_0x013e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r6 = r2.next()
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            r7 = 0
            r10 = 1
            r11 = 0
            if (r3 == 0) goto L_0x0164
            java.util.Map r1 = r3.A0y
            if (r1 == 0) goto L_0x0164
            com.whatsapp.jid.DeviceJid r0 = r6.getPrimaryDevice()
            java.lang.Object r0 = r1.get(r0)
            X.3un r0 = (X.C80103un) r0
            if (r0 == 0) goto L_0x0164
            int r0 = r0.expiration
            if (r0 <= 0) goto L_0x0164
            r11 = 1
        L_0x0164:
            boolean r12 = X.AnonymousClass1NM.A06(r5, r4, r8)
            r9 = r7
            X.AnonymousClass1NM.A04(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x013e
        L_0x016d:
            r3 = 0
            goto L_0x013a
        L_0x016f:
            java.lang.Object r4 = r3.A00
            X.1NM r4 = (X.AnonymousClass1NM) r4
            java.lang.Object r7 = r3.A01
            X.3Qa r7 = (X.C64933Qa) r7
            java.lang.Object r5 = r3.A02
            X.11F r5 = (X.AnonymousClass11F) r5
            X.1A1 r0 = r4.A0P
            X.3T1 r2 = r0.A03(r7)
            boolean r0 = X.AnonymousClass1NM.A06(r4, r2, r7)
            if (r0 == 0) goto L_0x0024
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ChatMessageCounts/onChatMessageRevoked jid:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A07()
            r6 = 0
            r9 = 1
            if (r2 == 0) goto L_0x01a9
            boolean r0 = r2.A1G()
            r10 = 1
            if (r0 != 0) goto L_0x01aa
        L_0x01a9:
            r10 = 0
        L_0x01aa:
            r11 = 1
            r8 = r6
            X.AnonymousClass1NM.A04(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x01b0:
            java.lang.Object r4 = r3.A00
            X.1NM r4 = (X.AnonymousClass1NM) r4
            java.lang.Object r5 = r3.A01
            X.11F r5 = (X.AnonymousClass11F) r5
            java.lang.Object r7 = r3.A02
            X.3Qa r7 = (X.C64933Qa) r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ChatMessageCounts/onChatMessagesSent jid:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A07()
            X.1A1 r0 = r4.A0P
            X.3T1 r2 = r0.A03(r7)
            if (r2 == 0) goto L_0x01e2
            boolean r0 = r2.A1G()
            r10 = 1
            if (r0 != 0) goto L_0x01e3
        L_0x01e2:
            r10 = 0
        L_0x01e3:
            boolean r11 = X.AnonymousClass1NM.A06(r4, r2, r7)
            r6 = 0
            r9 = 1
            r8 = r6
            X.AnonymousClass1NM.A04(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x0024
            X.1Hr r7 = r4.A05
            r12 = 0
            X.3Qa r0 = r2.A1J
            X.11F r8 = r0.A00
            X.3T1 r3 = r2.A0S()
            if (r8 == 0) goto L_0x0024
            X.1Hs r1 = r7.A01
            X.0wQ r0 = r1.A00
            boolean r0 = r0.A0L()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0024
            X.1Cv r0 = r1.A02
            java.util.ArrayList r1 = X.C24541Cv.A01(r0, r8, r9, r12, r12)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x021c
            java.lang.Object r6 = r1.get(r12)
            X.3T1 r6 = (X.AnonymousClass3T1) r6
        L_0x021c:
            if (r3 == 0) goto L_0x022d
            X.1A1 r1 = r7.A0D
            X.3Qa r0 = r3.A1J
            X.3T1 r10 = r1.A03(r0)
        L_0x0226:
            int r11 = r2.A1I
            r9 = r6
            X.C25791Hr.A00(r7, r8, r9, r10, r11, r12)
            return
        L_0x022d:
            r10 = 0
            goto L_0x0226
        L_0x022f:
            java.lang.Object r5 = r3.A00
            X.1Oa r5 = (X.C27391Oa) r5
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r4 = r3.A02
            java.util.Map r4 = (java.util.Map) r4
            java.util.Iterator r3 = r0.iterator()
        L_0x023f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            com.whatsapp.jid.UserJid r0 = r2.userJid
            java.lang.Object r0 = r4.get(r0)
            X.9uZ r0 = (X.C207109uZ) r0
            X.1Kc r1 = r5.A01
            r1.A00(r0)
            com.whatsapp.jid.UserJid r0 = r2.userJid
            r1.A01(r0)
            goto L_0x023f
        L_0x025e:
            java.lang.Object r4 = r3.A00
            X.196 r4 = (X.AnonymousClass196) r4
            java.lang.Object r5 = r3.A01
            X.53y r5 = (X.AnonymousClass53y) r5
            java.lang.Object r3 = r3.A02
            java.util.Locale r3 = (java.util.Locale) r3
            boolean r0 = r4.A0S()
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = "setting_locale"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r1 = X.C201669k5.A00(r0)
            X.1AC r0 = r5.A00
            X.9k5 r2 = r0.A0A(r1)
            if (r2 != 0) goto L_0x0288
            X.9k5 r2 = r0.A0B(r1)
            if (r2 == 0) goto L_0x0024
        L_0x0288:
            java.lang.String[] r0 = X.C26621Kw.A04
            java.lang.String r1 = r3.toLanguageTag()
            X.8SS r0 = r2.A05()
            X.C18740tg.A06(r0)
            X.4u0 r0 = r0.localeSetting_
            if (r0 != 0) goto L_0x029b
            X.4u0 r0 = X.C99814u0.DEFAULT_INSTANCE
        L_0x029b:
            java.lang.String r0 = r0.locale_
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0024
            X.54k r0 = r5.A0I()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r4.A0M(r0)
            r4.A0G()
            return
        L_0x02b2:
            java.lang.Object r1 = r3.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r1 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager) r1
            java.lang.Object r4 = r3.A01
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            java.lang.Object r2 = r3.A02
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0 = 2
            X.AnonymousClass00C.A0D(r2, r0)
            X.1Lo r3 = r1.A08
            java.lang.Iterable r0 = r3.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x02cc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02dc
            java.lang.Object r0 = r1.next()
            X.1cp r0 = (X.C32021cp) r0
            r0.A03(r4)
            goto L_0x02cc
        L_0x02dc:
            r1 = 0
            X.7s1 r0 = new X.7s1
            r0.<init>(r2, r1)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.Object r0 = r0.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r5 = r0.iterator()
        L_0x02ef:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x031c
            java.lang.Object r0 = r5.next()
            X.011 r0 = (X.AnonymousClass011) r0
            java.lang.Object r2 = r0.second
            java.lang.Object r1 = r6.get(r2)
            if (r1 != 0) goto L_0x0306
            r6.containsKey(r2)
        L_0x0306:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x030f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x030f:
            java.lang.Object r0 = r0.first
            X.3Iv r0 = (X.C63123Iv) r0
            X.147 r0 = r0.A00
            r1.add(r0)
            r6.put(r2, r1)
            goto L_0x02ef
        L_0x031c:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L_0x0324:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r5 = r6.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r2 = r5.getKey()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x03a8
            int r1 = r2.hashCode()
            r0 = -608496514(0xffffffffdbbb147e, float:-1.05316704E17)
            if (r1 == r0) goto L_0x037e
            r0 = 476588369(0x1c682951, float:7.681576E-22)
            if (r1 == r0) goto L_0x0375
            r0 = 1185244855(0x46a566b7, float:21171.357)
            if (r1 != r0) goto L_0x0324
            java.lang.String r0 = "approved"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0324
            java.lang.Object r2 = r5.getValue()
            java.util.List r2 = (java.util.List) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            java.lang.Iterable r0 = r3.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0365:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0324
            java.lang.Object r0 = r1.next()
            X.1cp r0 = (X.C32021cp) r0
            r0.A06(r4, r2)
            goto L_0x0365
        L_0x0375:
            java.lang.String r0 = "cancelled"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x03a8
            goto L_0x0324
        L_0x037e:
            java.lang.String r0 = "rejected"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0324
            java.lang.Object r2 = r5.getValue()
            java.util.List r2 = (java.util.List) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            java.lang.Iterable r0 = r3.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0398:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0324
            java.lang.Object r0 = r1.next()
            X.1cp r0 = (X.C32021cp) r0
            r0.A08(r4, r2)
            goto L_0x0398
        L_0x03a8:
            java.lang.Object r2 = r5.getValue()
            java.util.List r2 = (java.util.List) r2
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            java.lang.Iterable r0 = r3.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x03ba:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0324
            java.lang.Object r0 = r1.next()
            X.1cp r0 = (X.C32021cp) r0
            r0.A07(r4, r2)
            goto L_0x03ba
        L_0x03ca:
            java.lang.Object r4 = r3.A00
            X.1Sq r4 = (X.C28431Sq) r4
            java.lang.Object r0 = r3.A01
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = r3.A02
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            android.content.Context r2 = r0.getContext()
            X.AnonymousClass00C.A08(r2)
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass190.A0d(r2, r1, r0)
            goto L_0x001f
        L_0x03e4:
            java.lang.Object r0 = r3.A00
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.Object r6 = r3.A01
            X.1LV r6 = (X.AnonymousClass1LV) r6
            java.lang.Object r5 = r3.A02
            r4 = 0
            java.util.Iterator r3 = r0.iterator()
        L_0x03f3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r1 = r3.next()
            X.3QK r1 = (X.AnonymousClass3QK) r1
            X.17d r0 = r6.A08
            com.whatsapp.jid.GroupJid r1 = r1.A02
            r0.A05(r1)
            X.1LW r0 = r6.A04
            r0.A04(r1, r4)
            X.17Y r2 = r6.A00
            r1 = 20
            X.1j2 r0 = new X.1j2
            r0.<init>(r6, r5, r1)
            r2.A0H(r0)
            goto L_0x03f3
        L_0x0418:
            java.lang.Object r5 = r3.A00
            X.18z r5 = (X.C235718z) r5
            java.lang.Object r4 = r3.A01
            java.lang.Object r3 = r3.A02
            X.005 r0 = r5.A0E
            java.lang.Object r0 = r0.get()
            X.17j r0 = (X.C231517j) r0
            X.0wy r0 = r0.A04()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0024
            X.0yC r2 = r5.A08
            r1 = 7282(0x1c72, float:1.0204E-41)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0024
            X.005 r0 = r5.A0F
            java.lang.Object r2 = r0.get()
            X.0wI r2 = (X.C19650wI) r2
            r1 = 12
            X.1iV r0 = new X.1iV
            r0.<init>(r5, r4, r3, r1)
            r2.A00(r0)
            return
        L_0x0451:
            java.lang.Object r6 = r3.A00
            X.1X4 r6 = (X.AnonymousClass1X4) r6
            java.lang.Object r8 = r3.A01
            X.2pC r8 = (X.C52292pC) r8
            java.lang.Object r2 = r3.A02
            X.3Qa r2 = (X.C64933Qa) r2
            X.1A1 r1 = r6.A1H     // Catch:{  }
            X.19w r9 = r6.A11     // Catch:{  }
            X.0wo r0 = r6.A0K     // Catch:{  }
            long r4 = X.C19970wo.A00(r0)     // Catch:{  }
            r7 = 1
            X.AnonymousClass00C.A0D(r1, r7)     // Catch:{  }
            r0 = 2
            X.AnonymousClass00C.A0D(r9, r0)     // Catch:{  }
            r0 = 4
            X.AnonymousClass00C.A0D(r2, r0)     // Catch:{  }
            X.3T1 r1 = r1.A03(r2)     // Catch:{  }
            if (r1 == 0) goto L_0x04b9
            int r2 = r1.A1I     // Catch:{  }
            r0 = 92
            if (r2 != r0) goto L_0x04a2
            byte[] r0 = r1.A1b     // Catch:{  }
            if (r0 == 0) goto L_0x04c1
            X.3Qa r3 = r1.A1J     // Catch:{  }
            X.11F r0 = r3.A00     // Catch:{  }
            X.3Qa r0 = r9.A02(r0, r7)     // Catch:{  }
            X.2bd r2 = new X.2bd     // Catch:{  }
            r2.<init>(r8, r0, r4)     // Catch:{  }
            X.11F r1 = r1.A0J()     // Catch:{  }
            X.9Vv r0 = new X.9Vv     // Catch:{  }
            r0.<init>(r1, r3)     // Catch:{  }
            r2.A04 = r0     // Catch:{  }
            X.1YE r0 = r6.A0f     // Catch:{  }
            r0.A01(r2)     // Catch:{  }
            goto L_0x0e48
        L_0x04a2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
            r1.<init>()     // Catch:{  }
            java.lang.String r0 = "EventResponseMessageManager/parent message not of type EVENT: "
            r1.append(r0)     // Catch:{  }
            r1.append(r2)     // Catch:{  }
            java.lang.String r0 = r1.toString()     // Catch:{  }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{  }
            r1.<init>(r0)     // Catch:{  }
            goto L_0x04c8
        L_0x04b9:
            java.lang.String r0 = "EventResponseMessageManager/cannot find Event message for the given response"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{  }
            r1.<init>(r0)     // Catch:{  }
            goto L_0x04c8
        L_0x04c1:
            java.lang.String r0 = "EventResponseMessageManager/parent message has not secret"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{  }
            r1.<init>(r0)     // Catch:{  }
        L_0x04c8:
            throw r1     // Catch:{  }
        L_0x04c9:
            java.lang.Object r4 = r3.A00
            X.1XY r4 = (X.AnonymousClass1XY) r4
            java.lang.Object r0 = r3.A01
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r9 = r3.A02
            java.util.List r9 = (java.util.List) r9
            r5 = 0
            X.1YI r1 = r4.A0G     // Catch:{ IOException -> 0x0e6c }
            java.lang.String r0 = r1.A01(r0)     // Catch:{ IOException -> 0x0e6c }
            if (r0 == 0) goto L_0x0024
            goto L_0x0e49
        L_0x04e0:
            java.lang.Object r0 = r3.A00
            X.012 r0 = (X.AnonymousClass012) r0
            java.lang.Object r2 = r3.A01
            X.01P r2 = (X.AnonymousClass01P) r2
            java.lang.Object r1 = r3.A02
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            X.01M r0 = r0.getLifecycle()
            X.01N r0 = (X.AnonymousClass01N) r0
            X.01P r0 = r0.A02
            int r0 = r0.compareTo(r2)
            if (r0 < 0) goto L_0x0024
            r1.run()
            return
        L_0x04fe:
            java.lang.Object r0 = r3.A00
            X.189 r0 = (X.AnonymousClass189) r0
            java.lang.Object r2 = r3.A01
            X.6EZ r2 = (X.AnonymousClass6EZ) r2
            java.lang.Object r1 = r3.A02
            X.9eC r1 = (X.C198789eC) r1
            X.18a r0 = r0.A0G
            monitor-enter(r0)
            r0.A03(r1, r2)     // Catch:{ all -> 0x0512 }
            monitor-exit(r0)     // Catch:{ all -> 0x0512 }
            return
        L_0x0512:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0512 }
            throw r2
        L_0x0515:
            java.lang.Object r6 = r3.A00
            X.1fH r6 = (X.C33411fH) r6
            java.lang.Object r5 = r3.A01
            X.11F r5 = (X.AnonymousClass11F) r5
            java.lang.Object r0 = r3.A02
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0531
            X.0wo r0 = r6.A04
            long r3 = X.C19970wo.A00(r0)
        L_0x0531:
            r6.A01(r5, r3)
            return
        L_0x0535:
            java.lang.Object r4 = r3.A00
            X.1fH r4 = (X.C33411fH) r4
            java.lang.Object r5 = r3.A01
            X.11F r5 = (X.AnonymousClass11F) r5
            java.lang.Object r6 = r3.A02
            X.12t r0 = r4.A05
            java.lang.Long r7 = r0.A03(r5)
            X.17Y r0 = r4.A01
            r8 = 9
            X.1ia r3 = new X.1ia
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A0H(r3)
            return
        L_0x0552:
            java.lang.Object r8 = r3.A00
            X.1ci r8 = (X.C31951ci) r8
            java.lang.Object r0 = r3.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r10 = r3.A02
            java.util.AbstractMap r10 = (java.util.AbstractMap) r10
            java.util.Iterator r9 = r0.iterator()
        L_0x0562:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x058e
            java.lang.Object r7 = r9.next()
            X.11F r7 = (X.AnonymousClass11F) r7
            java.lang.Object r0 = r10.get(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0562
            com.whatsapp.conversationslist.ConversationsFragment r6 = r8.A0N
            X.1fH r5 = r6.A1S
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x058a
            X.0wo r0 = r6.A1f
            long r3 = X.C19970wo.A00(r0)
        L_0x058a:
            r5.A01(r7, r3)
            goto L_0x0562
        L_0x058e:
            com.whatsapp.conversationslist.ConversationsFragment r0 = r8.A0N
            X.17Y r6 = r0.A0d
            r0 = 22
            X.1j6 r1 = new X.1j6
            r1.<init>(r8, r0)
            goto L_0x091e
        L_0x059b:
            java.lang.Object r1 = r3.A00
            X.1NM r1 = (X.AnonymousClass1NM) r1
            java.lang.Object r0 = r3.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.Object r3 = r3.A02
            X.9Xu r3 = (X.AnonymousClass9Xu) r3
            r1.A07()
            android.content.SharedPreferences r2 = X.AnonymousClass1NM.A00(r1)
            java.lang.String r0 = r0.getRawString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "_discovery"
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            java.lang.String r0 = "null,null"
            java.lang.String r0 = r2.getString(r7, r0)
            java.lang.String r6 = ","
            r0.split(r6)
            r5 = 1
            java.lang.String r4 = r3.A05
            java.lang.String r3 = r3.A06
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = 0
            r1[r0] = r4
            r1[r5] = r3
            java.util.List r0 = java.util.Arrays.asList(r1)
            java.lang.String r0 = android.text.TextUtils.join(r6, r0)
            android.content.SharedPreferences$Editor r0 = r2.putString(r7, r0)
            goto L_0x06a9
        L_0x05ed:
            java.lang.Object r1 = r3.A00
            X.1NM r1 = (X.AnonymousClass1NM) r1
            java.lang.Object r0 = r3.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.Object r4 = r3.A02
            X.026 r4 = (X.AnonymousClass026) r4
            r1.A07()
            android.content.SharedPreferences r3 = X.AnonymousClass1NM.A00(r1)
            java.lang.String r0 = r0.getRawString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "_commerce"
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            java.lang.String r0 = "null,false,false,null,false,null,null,null,null,null"
            java.lang.String r0 = r3.getString(r2, r0)
            X.9eV r0 = X.C198979eV.A00(r0)
            r4.accept(r0)
            android.content.SharedPreferences$Editor r1 = r3.edit()
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)
            goto L_0x06a9
        L_0x062f:
            java.lang.Object r1 = r3.A00
            X.1NM r1 = (X.AnonymousClass1NM) r1
            java.lang.Object r0 = r3.A01
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.Object r2 = r3.A02
            java.lang.Number r2 = (java.lang.Number) r2
            r1.A07()
            android.content.SharedPreferences r3 = X.AnonymousClass1NM.A00(r1)
            java.lang.String r4 = r0.getRawString()
            java.lang.String r1 = X.AnonymousClass3Lg.A01(r4)
            java.lang.String r0 = "0,0,0,0,0,0,0,0,0,0,0"
            java.lang.String r1 = r3.getString(r1, r0)
            java.lang.String r0 = ","
            java.lang.String[] r0 = r1.split(r0)
            r1 = 0
            long r7 = X.C202339lc.A00(r0, r1)
            r1 = 1
            long r5 = X.C202339lc.A00(r0, r1)
            r1 = 2
            long r21 = X.C202339lc.A00(r0, r1)
            r1 = 3
            long r23 = X.C202339lc.A00(r0, r1)
            r1 = 4
            long r25 = X.C202339lc.A00(r0, r1)
            r1 = 5
            long r13 = X.C202339lc.A00(r0, r1)
            r1 = 6
            long r17 = X.C202339lc.A00(r0, r1)
            r1 = 7
            long r19 = X.C202339lc.A00(r0, r1)
            r1 = 8
            long r9 = X.C202339lc.A00(r0, r1)
            r1 = 9
            long r11 = X.C202339lc.A00(r0, r1)
            r1 = 10
            long r15 = X.C202339lc.A00(r0, r1)
            int r2 = r2.intValue()
            r0 = 1
            switch(r2) {
                case 0: goto L_0x06ad;
                case 1: goto L_0x06af;
                case 2: goto L_0x06b1;
                case 3: goto L_0x06ad;
                case 4: goto L_0x06b4;
                case 5: goto L_0x06b7;
                case 6: goto L_0x06ad;
                case 7: goto L_0x06ad;
                case 8: goto L_0x06ad;
                case 9: goto L_0x06b4;
                case 10: goto L_0x06ad;
                case 11: goto L_0x06b9;
                case 12: goto L_0x06b9;
                case 13: goto L_0x06b9;
                case 14: goto L_0x06b9;
                case 15: goto L_0x06ad;
                case 16: goto L_0x06ad;
                case 17: goto L_0x06ad;
                case 18: goto L_0x06b9;
                case 19: goto L_0x06ad;
                case 20: goto L_0x06af;
                case 21: goto L_0x06ad;
                case 22: goto L_0x06af;
                case 23: goto L_0x06b1;
                case 24: goto L_0x0699;
                case 25: goto L_0x06ad;
                default: goto L_0x0699;
            }
        L_0x0699:
            android.content.SharedPreferences$Editor r1 = r3.edit()
            java.lang.String r0 = X.AnonymousClass3Lg.A01(r4)
            java.lang.String r2 = X.AnonymousClass3Lg.A00(r5, r7, r9, r11, r13, r15, r17, r19, r21, r23, r25)
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
        L_0x06a9:
            r0.apply()
            return
        L_0x06ad:
            long r15 = r15 + r0
            goto L_0x0699
        L_0x06af:
            long r13 = r13 + r0
            goto L_0x0699
        L_0x06b1:
            long r19 = r19 + r0
            goto L_0x0699
        L_0x06b4:
            long r17 = r17 + r0
            goto L_0x0699
        L_0x06b7:
            long r9 = r9 + r0
            goto L_0x0699
        L_0x06b9:
            long r11 = r11 + r0
            goto L_0x0699
        L_0x06bb:
            java.lang.Object r1 = r3.A00
            X.1NM r1 = (X.AnonymousClass1NM) r1
            java.lang.Object r7 = r3.A01
            com.whatsapp.jid.Jid r7 = (com.whatsapp.jid.Jid) r7
            java.lang.Object r2 = r3.A02
            X.5Nh r2 = (X.C107265Nh) r2
            r1.A07()
            X.6by r0 = r2.A04
            boolean r6 = r0.A03
            boolean r5 = r2.A0K
            int r3 = r2.A09
            monitor-enter(r1)
            android.content.SharedPreferences r4 = X.AnonymousClass1NM.A00(r1)     // Catch:{ all -> 0x074b }
            java.lang.String r9 = r7.getRawString()     // Catch:{ all -> 0x074b }
            java.lang.String r2 = X.AnonymousClass3Lg.A01(r9)     // Catch:{ all -> 0x074b }
            java.lang.String r0 = "0,0,0,0,0,0,0,0,0,0,0"
            java.lang.String r2 = r4.getString(r2, r0)     // Catch:{ all -> 0x074b }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r2.split(r0)     // Catch:{ all -> 0x074b }
            r2 = 0
            long r12 = X.C202339lc.A00(r0, r2)     // Catch:{ all -> 0x074b }
            r2 = 1
            long r10 = X.C202339lc.A00(r0, r2)     // Catch:{ all -> 0x074b }
            r2 = 2
            long r26 = X.C202339lc.A00(r0, r2)     // Catch:{ all -> 0x074b }
            r2 = 3
            long r28 = X.C202339lc.A00(r0, r2)     // Catch:{ all -> 0x074b }
            r2 = 4
            long r30 = X.C202339lc.A00(r0, r2)     // Catch:{ all -> 0x074b }
            r2 = 5
            long r18 = X.C202339lc.A00(r0, r2)     // Catch:{ all -> 0x074b }
            r2 = 6
            long r22 = X.C202339lc.A00(r0, r2)     // Catch:{ all -> 0x074b }
            r2 = 7
            long r24 = X.C202339lc.A00(r0, r2)     // Catch:{ all -> 0x074b }
            r2 = 8
            long r14 = X.C202339lc.A00(r0, r2)     // Catch:{ all -> 0x074b }
            r2 = 9
            long r16 = X.C202339lc.A00(r0, r2)     // Catch:{ all -> 0x074b }
            r2 = 10
            long r20 = X.C202339lc.A00(r0, r2)     // Catch:{ all -> 0x074b }
            long r2 = (long) r3     // Catch:{ all -> 0x074b }
            r7 = 1
            if (r6 == 0) goto L_0x0733
            long r12 = r12 + r7
            if (r5 == 0) goto L_0x0730
            long r28 = r28 + r7
            goto L_0x0734
        L_0x0730:
            long r30 = r30 + r7
            goto L_0x0734
        L_0x0733:
            long r10 = r10 + r7
        L_0x0734:
            long r26 = r26 + r2
            android.content.SharedPreferences$Editor r2 = r4.edit()     // Catch:{ all -> 0x074b }
            java.lang.String r0 = X.AnonymousClass3Lg.A01(r9)     // Catch:{ all -> 0x074b }
            java.lang.String r3 = X.AnonymousClass3Lg.A00(r10, r12, r14, r16, r18, r20, r22, r24, r26, r28, r30)     // Catch:{ all -> 0x074b }
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r3)     // Catch:{ all -> 0x074b }
            r0.apply()     // Catch:{ all -> 0x074b }
            monitor-exit(r1)
            return
        L_0x074b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x074e:
            java.lang.Object r2 = r3.A00
            X.1Cf r2 = (X.C24381Cf) r2
            java.lang.Object r1 = r3.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            java.lang.Object r0 = r3.A02
            X.1Io r0 = (X.C26021Io) r0
            r2.A02(r1)
            r0.A01()
            return
        L_0x0761:
            java.lang.Object r0 = r3.A00
            X.1a9 r0 = (X.C30401a9) r0
            java.lang.Object r2 = r3.A01
            X.8vV r2 = (X.C186158vV) r2
            java.lang.Object r3 = r3.A02
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            X.1NZ r1 = r0.A08
            X.8tH r0 = r2.A01
            java.lang.Object r0 = r0.A01
            java.lang.Number r0 = (java.lang.Number) r0
            long r7 = r0.longValue()
            java.lang.String r2 = r2.A02
            X.16r r0 = r1.A00
            X.1M0 r5 = r0.A04()
            X.71s r6 = r5.B1k()     // Catch:{ all -> 0x07bd }
            r0 = 3
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x07b6 }
            r4.<init>(r0)     // Catch:{ all -> 0x07b6 }
            java.lang.String r1 = "user_jid"
            java.lang.String r0 = r3.getRawString()     // Catch:{ all -> 0x07b6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x07b6 }
            java.lang.String r1 = "invite_accepted_time"
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x07b6 }
            r4.put(r1, r0)     // Catch:{ all -> 0x07b6 }
            java.lang.String r0 = "invite_receiver_reason"
            r4.put(r0, r2)     // Catch:{ all -> 0x07b6 }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x07b6 }
            java.lang.String r2 = "recently_accepted_deeplink_invites"
            r1 = 5
            java.lang.String r0 = "insert_recently_accepted_invite"
            r3.A08(r2, r0, r4, r1)     // Catch:{ all -> 0x07b6 }
            r6.A00()     // Catch:{ all -> 0x07b6 }
            r6.close()     // Catch:{ all -> 0x07bd }
            r5.close()
            return
        L_0x07b6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x07b8 }
        L_0x07b8:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x07bd }
            throw r0     // Catch:{ all -> 0x07bd }
        L_0x07bd:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x07bf }
        L_0x07bf:
            r2 = move-exception
            X.C05600Qi.A00(r5, r0)
            throw r2
        L_0x07c4:
            java.lang.Object r6 = r3.A00
            X.1a7 r6 = (X.C30381a7) r6
            java.lang.Object r2 = r3.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            java.lang.Object r4 = r3.A02
            X.9uj r4 = (X.C207209uj) r4
            X.16D r0 = r6.A07
            X.16p r1 = r0.A05
            java.util.ArrayList r5 = r1.A0Q(r2)
            boolean r0 = X.AnonymousClass143.A0I(r2)
            if (r0 == 0) goto L_0x07ef
            X.12O r0 = r6.A0H
            X.13w r2 = (X.C223313w) r2
            com.whatsapp.jid.PhoneUserJid r0 = r0.A0A(r2)
            if (r0 == 0) goto L_0x07ef
            java.util.ArrayList r0 = r1.A0Q(r0)
            r5.addAll(r0)
        L_0x07ef:
            boolean r0 = r5.isEmpty()
            r8 = 1
            if (r0 != 0) goto L_0x0828
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r3 = r5.iterator()
        L_0x07ff:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x081d
            java.lang.Object r2 = r3.next()
            X.141 r2 = (X.AnonymousClass141) r2
            boolean r0 = r2.A0z
            if (r0 == 0) goto L_0x07ff
            r0 = 0
            r2.A0z = r0
            r7.add(r2)
            X.1O7 r1 = r6.A0A
            X.11F r0 = r2.A0H
            r1.A02(r0)
            goto L_0x07ff
        L_0x081d:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0828
            X.196 r0 = r6.A06
            r0.A0O(r7, r8)
        L_0x0828:
            X.19L r3 = r6.A0O
            long r1 = r4.A00
            r0 = 2
            X.9ju r1 = X.AnonymousClass19L.A00(r3, r0, r1)
            if (r1 == 0) goto L_0x0837
            r0 = 5
            r1.A04(r0)
        L_0x0837:
            X.19A r3 = r6.A0M
            X.0yC r2 = r6.A0J
            X.0wN r1 = r6.A01
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            android.os.Message r0 = X.C203429o0.A03(r1, r2, r4, r0)
            r3.A0J(r0)
            return
        L_0x084b:
            java.lang.Object r5 = r3.A00
            X.1a7 r5 = (X.C30381a7) r5
            java.lang.Object r4 = r3.A01
            X.141 r4 = (X.AnonymousClass141) r4
            java.lang.Object r2 = r3.A02
            r0 = 0
            r4.A0C = r0
            X.16D r0 = r5.A07
            r0.A0T(r4)
            X.1AQ r1 = r5.A0S
            X.1AT r0 = r1.A01
            r0.A01(r2)
            X.1AT r0 = r1.A02
            r0.A01(r2)
            X.17Y r6 = r5.A03
            r0 = 31
            X.1iV r1 = new X.1iV
            r1.<init>(r5, r4, r2, r0)
            goto L_0x091e
        L_0x0875:
            java.lang.Object r2 = r3.A00
            X.1a7 r2 = (X.C30381a7) r2
            java.lang.Object r4 = r3.A01
            X.141 r4 = (X.AnonymousClass141) r4
            java.lang.Object r3 = r3.A02
            X.11F r3 = (X.AnonymousClass11F) r3
            X.16K r0 = r2.A09
            boolean r1 = r0.A06(r4)
            X.1O7 r0 = r2.A0A
            X.16K r0 = r0.A03
            r0.A04(r4)
            if (r1 == 0) goto L_0x0899
            X.1O8 r2 = r2.A0R
            int r1 = r4.A06
            r0 = 2
            r2.A01(r3, r1, r0)
            return
        L_0x0899:
            X.16I r0 = r2.A08
            r0.A00(r3)
            return
        L_0x089f:
            java.lang.Object r1 = r3.A00
            X.0wD r1 = (X.C19600wD) r1
            java.lang.Object r0 = r3.A01
            X.3K7 r0 = (X.AnonymousClass3K7) r0
            r1.A08(r0)
            return
        L_0x08ab:
            java.lang.Object r1 = r3.A00
            X.0xH r1 = (X.C20260xH) r1
            java.lang.Object r0 = r3.A01
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            java.lang.Object r2 = r3.A02
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            X.189 r1 = r1.A0Y
            com.whatsapp.jid.UserJid r0 = r0.userJid
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()
            X.6EZ r0 = X.C133256Xm.A02(r0)
            r1.A0Q(r2, r0)
            return
        L_0x08c7:
            java.lang.Object r1 = r3.A00
            X.1A9 r1 = (X.AnonymousClass1A9) r1
            java.lang.Object r4 = r3.A01
            X.8mn r4 = (X.C181018mn) r4
            java.lang.Object r0 = r3.A02
            X.3SB r0 = (X.AnonymousClass3SB) r0
            X.164 r2 = r1.A02
            com.whatsapp.jid.DeviceJid r1 = r0.A07
            com.whatsapp.jobqueue.job.SendPeerMessageJob r0 = new com.whatsapp.jobqueue.job.SendPeerMessageJob
            r0.<init>(r1, r4)
            r2.A01(r0)
            return
        L_0x08e0:
            java.lang.Object r5 = r3.A00
            X.1LV r5 = (X.AnonymousClass1LV) r5
            java.lang.Object r0 = r3.A01
            X.147 r0 = (X.AnonymousClass147) r0
            java.lang.Object r4 = r3.A02
            X.147 r3 = r5.A02(r0)
            X.17Y r2 = r5.A00
            r1 = 15
            X.1iV r0 = new X.1iV
            r0.<init>(r4, r3, r5, r1)
            r2.Bp3(r0)
            return
        L_0x08fb:
            java.lang.Object r5 = r3.A00
            X.1LV r5 = (X.AnonymousClass1LV) r5
            java.lang.Object r4 = r3.A01
            X.3QK r4 = (X.AnonymousClass3QK) r4
            java.lang.Object r3 = r3.A02
            X.147 r3 = (X.AnonymousClass147) r3
            X.1LW r2 = r5.A04
            com.whatsapp.jid.GroupJid r1 = r4.A02
            int r0 = r4.A00
            r2.A04(r1, r0)
            X.17d r0 = r5.A08
            r0.A04(r4, r3)
            X.17Y r6 = r5.A00
            r0 = 19
            X.1j2 r1 = new X.1j2
            r1.<init>(r5, r3, r0)
        L_0x091e:
            r6.A0H(r1)
            return
        L_0x0922:
            java.lang.Object r2 = r3.A00
            X.026 r2 = (X.AnonymousClass026) r2
            java.lang.Object r1 = r3.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            java.lang.Object r0 = r3.A02
            X.1LV r0 = (X.AnonymousClass1LV) r0
            if (r1 != 0) goto L_0x0935
            r0 = 0
        L_0x0931:
            r2.accept(r0)
            return
        L_0x0935:
            X.16D r0 = r0.A01
            X.141 r0 = r0.A08(r1)
            goto L_0x0931
        L_0x093c:
            java.lang.Object r1 = r3.A02
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r3.A01
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            r1.dispatchTouchEvent(r0)
            return
        L_0x0948:
            java.lang.Object r6 = r3.A00
            X.18z r6 = (X.C235718z) r6
            java.lang.Object r5 = r3.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r7 = r3.A02
            boolean r0 = r6.A0J()
            if (r0 == 0) goto L_0x0987
            r1 = 0
            r0 = 2132084275(0x7f150633, float:1.9808716E38)
            X.21S r4 = new X.21S
            r4.<init>(r5, r0)
            r0 = 2131887763(0x7f120693, float:1.9410142E38)
            r4.A0e(r0)
            r0 = 2131887764(0x7f120694, float:1.9410144E38)
            r4.A0d(r0)
            r0 = 2131887851(0x7f1206eb, float:1.941032E38)
            r4.A0g(r1, r0)
            r2 = 2131887707(0x7f12065b, float:1.9410029E38)
            r1 = 2
            X.4XI r0 = new X.4XI
            r0.<init>(r7, r5, r6, r1)
            r4.A0f(r0, r2)
        L_0x097f:
            X.0FM r0 = r4.create()
            r0.show()
            return
        L_0x0987:
            r3 = 0
            r0 = 2132084275(0x7f150633, float:1.9808716E38)
            X.21S r4 = new X.21S
            r4.<init>(r5, r0)
            r0 = 2131887763(0x7f120693, float:1.9410142E38)
            r4.A0e(r0)
            r0 = 2131887770(0x7f12069a, float:1.9410156E38)
            r4.A0d(r0)
            r2 = 2131888535(0x7f120997, float:1.9411708E38)
            r1 = 1
            X.4XI r0 = new X.4XI
            r0.<init>(r7, r5, r6, r1)
            r4.A0g(r0, r2)
            r0 = 2131887851(0x7f1206eb, float:1.941032E38)
            r4.A0f(r3, r0)
            goto L_0x097f
        L_0x09af:
            java.lang.Object r6 = r3.A00
            X.1cL r6 = (X.C31761cL) r6
            java.lang.Object r5 = r3.A01
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Object r4 = r3.A02
            X.9uj r4 = (X.C207209uj) r4
            X.185 r0 = r6.A0C
            X.3L0 r3 = r0.A02(r5)
            r0.A03(r5)
            X.1KK r2 = r6.A07
            if (r5 == 0) goto L_0x09d9
            r1 = 0
            X.9uZ r0 = r2.A07(r5)
            boolean r0 = X.AnonymousClass1KK.A05(r1, r0)
            if (r0 == 0) goto L_0x09d9
            r1 = 0
            X.1DV r0 = r2.A0A
            r0.A01(r5, r1)
        L_0x09d9:
            X.1LE r0 = r2.A06
            r0.A07(r5)
            if (r3 == 0) goto L_0x09ed
            X.0xM r1 = r6.A0G
            X.3TT r0 = X.AnonymousClass3TT.A01(r3)
            X.3H2 r0 = r0.A02()
            r1.A0c(r5, r0)
        L_0x09ed:
            X.1C4 r0 = r6.A0H
            r0.A01(r4)
            return
        L_0x09f3:
            java.lang.Object r2 = r3.A00
            android.os.ConditionVariable r2 = (android.os.ConditionVariable) r2
            java.lang.Object r1 = r3.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r3.A02
            android.content.Intent r0 = (android.content.Intent) r0
            r2.block()
            X.C111795cr.A01(r1, r0)
            return
        L_0x0a06:
            java.lang.Object r4 = r3.A00
            X.1WQ r4 = (X.AnonymousClass1WQ) r4
            java.lang.Object r7 = r3.A01
            android.content.Context r7 = (android.content.Context) r7
            java.lang.Object r3 = r3.A02
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            X.005 r0 = r4.A0c
            r0.get()
            X.1Wd r5 = r4.A0I
            monitor-enter(r5)
            r5.A01()     // Catch:{ all -> 0x0cbb }
            X.0wG r0 = r5.A02     // Catch:{ all -> 0x0cbb }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0cbb }
            java.lang.String r0 = "commerce.db"
            java.io.File r1 = r1.getDatabasePath(r0)     // Catch:{ all -> 0x0cbb }
            boolean r2 = r1.delete()     // Catch:{ all -> 0x0cbb }
            java.lang.String r0 = "CommerceDBStorage/removeDatabase"
            X.C224014d.A04(r1, r0)     // Catch:{ all -> 0x0cbb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cbb }
            r1.<init>()     // Catch:{ all -> 0x0cbb }
            java.lang.String r0 = "CommerceDBStorage/removeDatabase/deleted"
            r1.append(r0)     // Catch:{ all -> 0x0cbb }
            r1.append(r2)     // Catch:{ all -> 0x0cbb }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0cbb }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0cbb }
            monitor-exit(r5)
            X.189 r0 = r4.A0E
            r0.A0M()
            X.0wQ r0 = r4.A03
            r0.A0D()
            r0.A0E()
            X.C18750th.A09(r7)
            java.lang.String r0 = "deleteaccountconfirm/deleteBackupToken"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r6 = r4.A0D
            java.lang.String r0 = r6.A0h()
            X.C133306Xt.A02(r7, r6, r0)
            X.1P5 r5 = r4.A0N
            monitor-enter(r5)
            java.lang.Object r1 = r5.A0Q     // Catch:{ all -> 0x0cbb }
            monitor-enter(r1)     // Catch:{ all -> 0x0cbb }
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x0cb8 }
            if (r0 == 0) goto L_0x0a70
            r0.clear()     // Catch:{ all -> 0x0cb8 }
        L_0x0a70:
            java.util.Map r0 = r5.A0Z     // Catch:{ all -> 0x0cb8 }
            r0.clear()     // Catch:{ all -> 0x0cb8 }
            java.util.Map r0 = r5.A0X     // Catch:{ all -> 0x0cb8 }
            r0.clear()     // Catch:{ all -> 0x0cb8 }
            monitor-exit(r1)     // Catch:{ all -> 0x0cb8 }
            java.lang.Object r1 = r5.A0R     // Catch:{ all -> 0x0cbb }
            monitor-enter(r1)     // Catch:{ all -> 0x0cbb }
            java.util.Map r0 = r5.A04     // Catch:{ all -> 0x0cb5 }
            if (r0 == 0) goto L_0x0a85
            r0.clear()     // Catch:{ all -> 0x0cb5 }
        L_0x0a85:
            java.util.Map r0 = r5.A0W     // Catch:{ all -> 0x0cb5 }
            r0.clear()     // Catch:{ all -> 0x0cb5 }
            java.util.Map r0 = r5.A0Y     // Catch:{ all -> 0x0cb5 }
            r0.clear()     // Catch:{ all -> 0x0cb5 }
            monitor-exit(r1)     // Catch:{ all -> 0x0cb5 }
            java.util.Map r1 = r5.A0V     // Catch:{ all -> 0x0cbb }
            monitor-enter(r1)     // Catch:{ all -> 0x0cbb }
            r1.clear()     // Catch:{ all -> 0x0cb2 }
            monitor-exit(r1)     // Catch:{ all -> 0x0cb2 }
            X.1P9 r0 = r5.A0K     // Catch:{ all -> 0x0cbb }
            X.1P8 r0 = r0.A00     // Catch:{ all -> 0x0cbb }
            r0.A05()     // Catch:{ all -> 0x0cbb }
            monitor-exit(r5)
            X.12s r0 = r4.A0F
            r0.A02()
            X.1XV r0 = r4.A0Y
            X.16r r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0aac }
            r0.A05()     // Catch:{ IllegalArgumentException -> 0x0aac }
            goto L_0x0ab2
        L_0x0aac:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to remove database "
            X.C18740tg.A08(r0, r1)
        L_0x0ab2:
            X.1QN r0 = r4.A0H
            r0.A00()
            X.1B5 r5 = r4.A0V
            monitor-enter(r5)
            X.005 r0 = r5.A06     // Catch:{ all -> 0x0cbb }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0cbb }
            X.16q r0 = (X.C229616q) r0     // Catch:{ all -> 0x0cbb }
            r0.close()     // Catch:{ all -> 0x0cbb }
            X.0wG r0 = r5.A01     // Catch:{ all -> 0x0cbb }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0cbb }
            java.lang.String r0 = "stickers.db"
            java.io.File r2 = r1.getDatabasePath(r0)     // Catch:{ all -> 0x0cbb }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x0cbb }
            boolean r8 = r2.delete()     // Catch:{ all -> 0x0cbb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cbb }
            r1.<init>()     // Catch:{ all -> 0x0cbb }
            java.lang.String r0 = r2.getPath()     // Catch:{ all -> 0x0cbb }
            r1.append(r0)     // Catch:{ all -> 0x0cbb }
            java.lang.String r0 = "-journal"
            r1.append(r0)     // Catch:{ all -> 0x0cbb }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0cbb }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0cbb }
            r0.<init>(r1)     // Catch:{ all -> 0x0cbb }
            boolean r0 = r0.delete()     // Catch:{ all -> 0x0cbb }
            r8 = r8 | r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cbb }
            r1.<init>()     // Catch:{ all -> 0x0cbb }
            java.lang.String r0 = r2.getPath()     // Catch:{ all -> 0x0cbb }
            r1.append(r0)     // Catch:{ all -> 0x0cbb }
            java.lang.String r0 = "-shm"
            r1.append(r0)     // Catch:{ all -> 0x0cbb }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0cbb }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0cbb }
            r0.<init>(r1)     // Catch:{ all -> 0x0cbb }
            boolean r0 = r0.delete()     // Catch:{ all -> 0x0cbb }
            r8 = r8 | r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cbb }
            r1.<init>()     // Catch:{ all -> 0x0cbb }
            java.lang.String r0 = r2.getPath()     // Catch:{ all -> 0x0cbb }
            r1.append(r0)     // Catch:{ all -> 0x0cbb }
            java.lang.String r0 = "-wal"
            r1.append(r0)     // Catch:{ all -> 0x0cbb }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0cbb }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0cbb }
            r0.<init>(r1)     // Catch:{ all -> 0x0cbb }
            boolean r2 = r0.delete()     // Catch:{ all -> 0x0cbb }
            r2 = r2 | r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0cbb }
            r1.<init>()     // Catch:{ all -> 0x0cbb }
            java.lang.String r0 = "StickerDbStorage/removeDatabase/deleted"
            r1.append(r0)     // Catch:{ all -> 0x0cbb }
            r1.append(r2)     // Catch:{ all -> 0x0cbb }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0cbb }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0cbb }
            monitor-exit(r5)
            X.1CR r0 = r4.A0U
            r0.A0Y()
            X.1XJ r1 = r4.A0L
            java.lang.String r0 = "emojidictionarystore/deletedatabase"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1XU r0 = r1.A02
            r0.A05()
            X.1We r1 = r4.A06
            java.lang.String r0 = "language-pack-store/deletedatabase"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Wf r0 = r1.A00
            r0.A05()
            X.16S r1 = r4.A0K
            monitor-enter(r1)
            X.54d r0 = r1.A00     // Catch:{ all -> 0x0caf }
            if (r0 == 0) goto L_0x0b6f
            r0.A05()     // Catch:{ all -> 0x0caf }
        L_0x0b6f:
            r2 = 0
            r1.A09 = r2     // Catch:{ all -> 0x0caf }
            monitor-exit(r1)
            X.17n r1 = r4.A0J
            monitor-enter(r1)
            X.17o r0 = r1.A02     // Catch:{ all -> 0x0cac }
            r0.A05()     // Catch:{ all -> 0x0cac }
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x0cac }
            monitor-exit(r1)     // Catch:{ all -> 0x0cac }
            X.1DE r1 = r4.A0O
            java.lang.String r0 = "mediajob/deletedatabases"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1DD r0 = r1.A02
            r0.A05()
            X.12P r0 = r4.A0G
            r5 = 0
            r0.A07 = r2
            X.12u r0 = r4.A0Z
            r0.A01()
            X.AnonymousClass6YO.A09(r7)
            X.1Ck r0 = r4.A05
            r0.A02()
            X.005 r0 = r4.A0b
            java.lang.Object r0 = r0.get()
            X.3lB r0 = (X.C74173lB) r0
            r0.A09()
            X.196 r2 = r4.A08
            X.1AN r7 = r2.A0K
            monitor-enter(r7)
            java.util.Set r0 = r7.A00     // Catch:{ all -> 0x0ca9 }
            if (r0 == 0) goto L_0x0bb4
            r0.clear()     // Catch:{ all -> 0x0ca9 }
        L_0x0bb4:
            monitor-exit(r7)
            X.1Hp r1 = r2.A0C
            java.lang.String r0 = "HistorySyncWorkManager/stopHistorySync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0zS r0 = r1.A00
            java.lang.Object r1 = r0.get()
            X.6VR r1 = (X.AnonymousClass6VR) r1
            java.lang.String r0 = "HISTORY_SYNC_WORK_UNIQUE_NAME"
            r1.A0B(r0)
            X.18P r0 = r2.A0O
            r0.A05()
            X.19n r0 = r2.A0G
            android.content.SharedPreferences r0 = X.C237119n.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.apply()
            X.1Wg r0 = r4.A0Q
            r0.A09()
            X.1E9 r0 = r4.A0W
            r0.A01()
            X.0wG r0 = r4.A0B
            android.content.Context r1 = r0.A00
            java.lang.Class<X.0tq> r0 = X.C18800tq.class
            java.lang.Object r0 = X.C19570wA.A00(r0, r1)
            X.0tq r0 = (X.C18800tq) r0
            X.0tq r0 = r0.AfI
            X.0tt r0 = r0.A00
            X.004 r0 = r0.A0d
            java.lang.Object r2 = r0.get()
            X.3DH r2 = (X.AnonymousClass3DH) r2
            java.lang.String r0 = "BusinessDirectoryStorageManager/onAccountDeleted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8eT r1 = r2.A01
            java.lang.String r0 = "BusinessDirectorySharedPrefManager/clear"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.SharedPreferences r0 = r1.A00()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.apply()
            java.io.File r0 = r2.A00()
            r0.delete()
            X.0wG r0 = r2.A00
            android.content.Context r0 = r0.A00
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r0 = "biz_directory"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0c3b
            r1.mkdirs()
        L_0x0c3b:
            r1.delete()
            X.0yC r2 = r4.A0M
            X.6TR r1 = X.AnonymousClass6YD.A0P
            X.AnonymousClass00C.A0D(r2, r5)
            boolean r0 = r1.A03(r2)
            if (r0 != 0) goto L_0x0c51
            boolean r0 = r1.A02(r2)
            if (r0 == 0) goto L_0x0c8a
        L_0x0c51:
            X.005 r0 = r4.A0a
            java.lang.Object r1 = r0.get()
            X.6SP r1 = (X.AnonymousClass6SP) r1
            java.lang.String r0 = "BusinessSearchRecentSearchManager/onAccountDeleted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r7 = r1.A00
            X.AnonymousClass00C.A07(r7)
            monitor-enter(r7)
            r7.clear()     // Catch:{ all -> 0x0ca9 }
            monitor-exit(r7)
            java.io.File r0 = X.AnonymousClass6SP.A00(r1)
            r0.delete()
            X.0wG r0 = r1.A02
            android.content.Context r0 = r0.A00
            java.io.File r2 = r0.getFilesDir()
            java.lang.String r0 = "business_search"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0c87
            r1.mkdirs()
        L_0x0c87:
            r1.delete()
        L_0x0c8a:
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r6)
            java.lang.String r0 = "is_eula_loaded_once"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r5)
            r0.apply()
            X.1Ww r0 = r4.A0T
            X.C29501Ww.A02(r0, r5, r5)
            if (r3 == 0) goto L_0x0ca3
            X.17Y r0 = r4.A02
            r0.A0H(r3)
        L_0x0ca3:
            java.lang.String r0 = "deleteaccountconfirm/removeDatabasesAndResetState() async operations done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0ca9:
            r2 = move-exception
            monitor-exit(r7)
            throw r2
        L_0x0cac:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0cac }
            throw r2
        L_0x0caf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0cb2:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0cb2 }
            goto L_0x0cba
        L_0x0cb5:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0cb5 }
            goto L_0x0cba
        L_0x0cb8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0cb8 }
        L_0x0cba:
            throw r0     // Catch:{ all -> 0x0cbb }
        L_0x0cbb:
            r2 = move-exception
            monitor-exit(r5)
            throw r2
        L_0x0cbe:
            java.lang.Object r4 = r3.A00
            X.1X4 r4 = (X.AnonymousClass1X4) r4
            java.lang.Object r2 = r3.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            java.lang.Object r1 = r3.A02
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r2.A0j(r0)
            X.AnonymousClass1X4.A09(r4, r1, r2)
            return
        L_0x0cd3:
            java.lang.Object r2 = r3.A00
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            java.lang.Object r1 = r3.A01
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r7 = r3.A02
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            X.C18740tg.A01()
            X.3Kz r6 = r2.A0V()
            boolean r0 = r2 instanceof X.AnonymousClass2bU
            if (r0 == 0) goto L_0x0d32
            X.2bU r2 = (X.AnonymousClass2bU) r2
            X.6Q6 r5 = r2.A1Y()
        L_0x0cf0:
            java.util.Iterator r4 = r1.iterator()
        L_0x0cf4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0d37
            java.lang.Object r1 = r4.next()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            if (r6 == 0) goto L_0x0d16
            X.3Kz r0 = r1.A0V()
            X.C18740tg.A06(r0)
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0d16
            byte[] r0 = r6.A02()
            r1.A1C(r0)
        L_0x0d16:
            if (r5 == 0) goto L_0x0cf4
            X.2bU r1 = (X.AnonymousClass2bU) r1
            X.6Q6 r3 = r1.A1Y()
            if (r3 == 0) goto L_0x0cf4
            byte[] r2 = r5.A05()
            int[] r1 = r5.A06()
            monitor-enter(r3)
            boolean r0 = r3.A00     // Catch:{ all -> 0x0d34 }
            if (r0 != 0) goto L_0x0d30
            r3.A02(r2, r1)     // Catch:{ all -> 0x0d34 }
        L_0x0d30:
            monitor-exit(r3)
            goto L_0x0cf4
        L_0x0d32:
            r5 = 0
            goto L_0x0cf0
        L_0x0d34:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        L_0x0d37:
            r7.run()
            return
        L_0x0d3b:
            java.lang.Object r4 = r3.A00
            X.1X4 r4 = (X.AnonymousClass1X4) r4
            java.lang.Object r0 = r3.A01
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r2 = r3.A02
            byte[] r2 = (byte[]) r2
            X.3SC r1 = new X.3SC
            r1.<init>(r0)
            r0 = 0
            r4.A0b(r1, r2, r0, r0)
            return
        L_0x0d51:
            java.lang.Object r2 = r3.A00
            X.1X4 r2 = (X.AnonymousClass1X4) r2
            java.lang.Object r1 = r3.A01
            X.4UX r1 = (X.AnonymousClass4UX) r1
            java.lang.Object r0 = r3.A02
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            r1.Bb0(r0)
            r2.A0U(r0)
            return
        L_0x0d64:
            java.lang.Object r5 = r3.A00
            X.1DT r5 = (X.AnonymousClass1DT) r5
            java.lang.Object r0 = r3.A01
            X.9Oa r0 = (X.C194079Oa) r0
            java.lang.Object r4 = r3.A02
            X.2Qy r4 = (X.C45332Qy) r4
            com.whatsapp.jid.Jid r2 = r0.A05
            boolean r0 = r2 instanceof X.AnonymousClass144
            if (r0 == 0) goto L_0x0da6
            X.144 r2 = (X.AnonymousClass144) r2
            X.17X r1 = r5.A08
            X.17r r0 = r1.A07
            int r3 = r0.A0A(r2)
            java.util.HashSet r0 = r1.A05(r2)
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0d94
            int r0 = X.AnonymousClass3UK.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00 = r0
        L_0x0d94:
            X.0yC r2 = r5.A0D
            r1 = 1861(0x745, float:2.608E-42)
            X.0yV r0 = X.C21000yV.A02
            int r1 = X.C20800yB.A00(r0, r2, r1)
            X.0yW r0 = r5.A0E
            if (r3 < r1) goto L_0x0da8
            r0.Blw(r4)
            return
        L_0x0da6:
            r3 = 0
            goto L_0x0d94
        L_0x0da8:
            r0.Bly(r4)
            return
        L_0x0dac:
            java.lang.Object r0 = r3.A00
            X.0uj r0 = (X.C19310uj) r0
            java.lang.Object r4 = r3.A01
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.Object r2 = r3.A02
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2
            X.0uk r3 = r0.A02     // Catch:{ IOException -> 0x0e42 }
            X.0uf r0 = r3.A05     // Catch:{ IOException -> 0x0e42 }
            int r1 = r0.A05()     // Catch:{ IOException -> 0x0e42 }
            r0 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r1 < r0) goto L_0x0e23
            android.content.Context r0 = r3.A03     // Catch:{ IOException -> 0x0e42 }
            X.6SA r5 = X.AnonymousClass6SA.A01(r0)     // Catch:{ IOException -> 0x0e42 }
            monitor-enter(r5)     // Catch:{ IOException -> 0x0e42 }
            int r1 = r5.A00     // Catch:{ all -> 0x0de1 }
            int r0 = r1 + 1
            r5.A00 = r0     // Catch:{ all -> 0x0de1 }
            monitor-exit(r5)     // Catch:{ IOException -> 0x0e42 }
            X.4tN r0 = new X.4tN     // Catch:{ IOException -> 0x0e42 }
            r0.<init>(r1, r4)     // Catch:{ IOException -> 0x0e42 }
            com.google.android.gms.tasks.zzw r0 = X.AnonymousClass6SA.A00(r0, r5)     // Catch:{ IOException -> 0x0e42 }
            java.lang.Object r5 = com.google.android.gms.tasks.Tasks.await(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0de4 }
            goto L_0x0e3e
        L_0x0de1:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ IOException -> 0x0e42 }
            throw r0     // Catch:{ IOException -> 0x0e42 }
        L_0x0de4:
            r7 = move-exception
            r0 = 3
            java.lang.String r6 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r6, r0)     // Catch:{ IOException -> 0x0e42 }
            if (r0 == 0) goto L_0x0e10
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x0e42 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ IOException -> 0x0e42 }
            int r0 = r0.length()     // Catch:{ IOException -> 0x0e42 }
            int r0 = r0 + 22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0e42 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0e42 }
            java.lang.String r0 = "Error making request: "
            r1.append(r0)     // Catch:{ IOException -> 0x0e42 }
            r1.append(r5)     // Catch:{ IOException -> 0x0e42 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0e42 }
            android.util.Log.d(r6, r0)     // Catch:{ IOException -> 0x0e42 }
        L_0x0e10:
            java.lang.Throwable r0 = r7.getCause()     // Catch:{ IOException -> 0x0e42 }
            boolean r0 = r0 instanceof X.C108735Ur     // Catch:{ IOException -> 0x0e42 }
            if (r0 == 0) goto L_0x0e3d
            java.lang.Throwable r0 = r7.getCause()     // Catch:{ IOException -> 0x0e42 }
            X.5Ur r0 = (X.C108735Ur) r0     // Catch:{ IOException -> 0x0e42 }
            int r1 = r0.zza     // Catch:{ IOException -> 0x0e42 }
            r0 = 4
            if (r1 != r0) goto L_0x0e3d
        L_0x0e23:
            android.os.Bundle r5 = X.C19320uk.A00(r4, r3)     // Catch:{ IOException -> 0x0e42 }
            if (r5 == 0) goto L_0x0e3e
            java.lang.String r1 = "google.messenger"
            boolean r0 = r5.containsKey(r1)     // Catch:{ IOException -> 0x0e42 }
            if (r0 == 0) goto L_0x0e3e
            android.os.Bundle r5 = X.C19320uk.A00(r4, r3)     // Catch:{ IOException -> 0x0e42 }
            if (r5 == 0) goto L_0x0e3e
            boolean r0 = r5.containsKey(r1)     // Catch:{ IOException -> 0x0e42 }
            if (r0 == 0) goto L_0x0e3e
        L_0x0e3d:
            r5 = 0
        L_0x0e3e:
            r2.setResult(r5)     // Catch:{ IOException -> 0x0e42 }
            return
        L_0x0e42:
            r0 = move-exception
            r2.setException(r0)
            return
        L_0x0e47:
            return
        L_0x0e48:
            return
        L_0x0e49:
            X.37a r3 = r1.A00(r0)     // Catch:{ 1YJ -> 0x0e76 }
            java.util.ArrayList r2 = r3.A01     // Catch:{ 1YJ -> 0x0e76 }
            int r1 = r2.size()     // Catch:{ 1YJ -> 0x0e76 }
            r0 = 1
            r10 = 0
            if (r1 <= r0) goto L_0x0e5d
            X.1X4 r0 = r4.A02     // Catch:{ 1YJ -> 0x0e76 }
            r0.A0Z(r5, r9, r2, r10)     // Catch:{ 1YJ -> 0x0e76 }
            return
        L_0x0e5d:
            X.1X4 r5 = r4.A02     // Catch:{ 1YJ -> 0x0e76 }
            java.lang.String r7 = r3.A00     // Catch:{ 1YJ -> 0x0e76 }
            java.lang.Object r8 = r2.get(r10)     // Catch:{ 1YJ -> 0x0e76 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 1YJ -> 0x0e76 }
            r6 = 0
            r5.A0Y(r6, r7, r8, r9, r10)     // Catch:{ 1YJ -> 0x0e76 }
            return
        L_0x0e6c:
            X.17Y r3 = r4.A01
            r0 = 47
            X.1j1 r2 = new X.1j1
            r2.<init>((java.lang.Object) r4, (int) r0)
            goto L_0x0e80
        L_0x0e76:
            r1 = move-exception
            X.17Y r3 = r4.A01
            r0 = 11
            X.1iz r2 = new X.1iz
            r2.<init>(r4, r1, r0)
        L_0x0e80:
            r3.A0H(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35321iV.run():void");
    }
}
