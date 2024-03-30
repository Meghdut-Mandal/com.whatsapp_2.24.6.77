package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1S7  reason: invalid class name */
public class AnonymousClass1S7 {
    public final C19730wQ A00;
    public final AnonymousClass16D A01;
    public final C220412q A02;
    public final AnonymousClass17X A03;
    public final C24541Cv A04;
    public final AnonymousClass12O A05;
    public final C230717b A06;

    public static Map A00(AnonymousClass141 r7, AnonymousClass1S7 r8) {
        AnonymousClass11F r6 = r7.A0H;
        if (r6 instanceof UserJid) {
            C19730wQ r1 = r8.A00;
            r1.A0G();
            AnonymousClass142 r0 = r1.A0E;
            if (r0 != null) {
                UserJid userJid = (UserJid) r0.A0H;
                C223313w A08 = r1.A08();
                HashSet hashSet = new HashSet();
                UserJid userJid2 = (UserJid) r6;
                HashSet hashSet2 = new HashSet();
                UserJid A0B = r8.A05.A0B(userJid2);
                UserJid userJid3 = A0B;
                if (userJid2 instanceof PhoneUserJid) {
                    userJid3 = userJid2;
                }
                if (!(userJid2 instanceof C223313w)) {
                    userJid2 = A0B;
                }
                if ((userJid3 instanceof PhoneUserJid) && userJid != null) {
                    hashSet2.addAll(r8.A03.A07.A0D(userJid, Collections.singleton(userJid3), -1).keySet());
                }
                if ((userJid2 instanceof C223313w) && A08 != null) {
                    hashSet2.addAll(r8.A03.A07.A0D(A08, Collections.singleton(userJid2), -1).keySet());
                }
                HashSet hashSet3 = new HashSet();
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    AnonymousClass144 r12 = (AnonymousClass144) it.next();
                    if (!r8.A06.A02(r12)) {
                        hashSet3.add(r12);
                    }
                }
                hashSet.addAll(hashSet3);
                return r8.A01.A0K(hashSet);
            }
        }
        return Collections.emptyMap();
    }

    public AnonymousClass1S7(C19730wQ r1, AnonymousClass16D r2, C220412q r3, AnonymousClass17X r4, C24541Cv r5, AnonymousClass12O r6, C230717b r7) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0097, code lost:
        r2.A01 = r0;
        r2.A02 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009b, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3Q0 A01(X.AnonymousClass141 r14) {
        /*
            r13 = this;
            java.util.Map r8 = A00(r14, r13)
            X.3Q0 r2 = new X.3Q0
            r2.<init>()
            int r0 = r8.size()
            r2.A00 = r0
            int r0 = r8.size()
            if (r0 == 0) goto L_0x019d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r0 = r8.values()
            java.util.Iterator r7 = r0.iterator()
        L_0x0022:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r6 = r7.next()
            X.141 r6 = (X.AnonymousClass141) r6
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r4 = r6.A06(r0)
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4
            if (r4 == 0) goto L_0x0022
            java.lang.String r0 = r6.A0J()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0022
            X.3QN r3 = new X.3QN
            r3.<init>()
            java.lang.String r1 = r6.A0J()
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r3.A03 = r1
            X.0wQ r1 = r13.A00
            com.whatsapp.jid.UserJid r0 = r6.A0I
            boolean r0 = r1.A0M(r0)
            r3.A05 = r0
            X.17X r0 = r13.A03
            boolean r0 = r0.A0D(r4)
            r3.A04 = r0
            X.12q r0 = r13.A02
            long r0 = r0.A08(r4)
            r3.A02 = r0
            r5.add(r3)
            goto L_0x0022
        L_0x006f:
            X.3xM r0 = X.C81653xM.A00
            java.util.Collections.sort(r5, r0)
            int r0 = r5.size()
            if (r0 == 0) goto L_0x019d
            int r0 = r5.size()
            r6 = 0
            r4 = 1
            if (r0 == r4) goto L_0x0190
            java.util.Iterator r1 = r5.iterator()
        L_0x0086:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009c
            java.lang.Object r3 = r1.next()
            X.3QN r3 = (X.AnonymousClass3QN) r3
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0086
            r0 = 2
        L_0x0097:
            r2.A01 = r0
            r2.A02 = r3
            return r2
        L_0x009c:
            java.util.Iterator r1 = r5.iterator()
        L_0x00a0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r3 = r1.next()
            X.3QN r3 = (X.AnonymousClass3QN) r3
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x00a0
            r0 = 3
            goto L_0x0097
        L_0x00b2:
            r5.clear()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r0 = r8.values()
            java.util.Iterator r12 = r0.iterator()
        L_0x00c2:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0130
            java.lang.Object r10 = r12.next()
            X.141 r10 = (X.AnonymousClass141) r10
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r7 = r10.A06(r0)
            X.144 r7 = (X.AnonymousClass144) r7
            if (r7 == 0) goto L_0x00c2
            java.lang.String r0 = r10.A0J()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c2
            X.12q r0 = r13.A02
            long r0 = r0.A08(r7)
            X.17X r3 = r13.A03
            X.17r r3 = r3.A07
            X.6X6 r3 = r3.A0C(r7)
            X.0y7 r11 = r3.A06()
            r9 = 0
            X.1Ak r3 = r11.asList()
            X.14x r8 = r3.iterator()
        L_0x00fd:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0114
            java.lang.Object r7 = r8.next()
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            X.16D r3 = r13.A01
            boolean r3 = r3.A0q(r7)
            if (r3 == 0) goto L_0x00fd
            int r9 = r9 + 1
            goto L_0x00fd
        L_0x0114:
            X.3QN r7 = new X.3QN
            r7.<init>()
            java.lang.String r3 = r10.A0J()
            X.AnonymousClass00C.A0D(r3, r6)
            r7.A03 = r3
            r7.A02 = r0
            int r0 = r11.size()
            r7.A00 = r0
            r7.A01 = r9
            r5.add(r7)
            goto L_0x00c2
        L_0x0130:
            int r0 = r5.size()
            if (r0 == 0) goto L_0x019d
            int r0 = r5.size()
            if (r0 == r4) goto L_0x0190
            X.3xK r0 = X.C81633xK.A00
            java.util.Collections.sort(r5, r0)
            java.util.Iterator r3 = r5.iterator()
        L_0x0145:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x015b
            java.lang.Object r1 = r3.next()
            X.3QN r1 = (X.AnonymousClass3QN) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0145
            r0 = 4
            r2.A01 = r0
            r2.A02 = r1
            return r2
        L_0x015b:
            X.3xL r0 = X.C81643xL.A00
            java.util.Collections.sort(r5, r0)
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0174
            r0 = 5
            r2.A01 = r0
            java.lang.Object r0 = r5.get(r6)
            X.3QN r0 = (X.AnonymousClass3QN) r0
            X.AnonymousClass00C.A0D(r0, r6)
            r2.A02 = r0
        L_0x0174:
            int r0 = r5.size()
            if (r0 <= r4) goto L_0x019d
            java.lang.Object r0 = r5.get(r6)
            X.3QN r0 = (X.AnonymousClass3QN) r0
            int r1 = r0.A00
            java.lang.Object r0 = r5.get(r4)
            X.3QN r0 = (X.AnonymousClass3QN) r0
            int r0 = r0.A00
            if (r1 != r0) goto L_0x019d
            r0 = 6
            r2.A01 = r0
            return r2
        L_0x0190:
            r2.A01 = r4
            java.lang.Object r0 = r5.get(r6)
            X.3QN r0 = (X.AnonymousClass3QN) r0
            X.AnonymousClass00C.A0D(r0, r6)
            r2.A02 = r0
        L_0x019d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1S7.A01(X.141):X.3Q0");
    }
}
