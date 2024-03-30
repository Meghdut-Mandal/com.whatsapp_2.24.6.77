package X;

import com.whatsapp.jid.Jid;
import java.util.HashSet;

/* renamed from: X.64Y  reason: invalid class name */
public class AnonymousClass64Y {
    public final int A00;
    public final Jid A01;
    public final AnonymousClass005 A02;
    public final HashSet A03;
    public final C25151Fe A04;
    public final AnonymousClass1FN A05;
    public final C64933Qa A06;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r6.isEmpty() != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A00() {
        /*
            r13 = this;
            X.005 r5 = r13.A02
            java.lang.Object r0 = r5.get()
            X.1HX r0 = (X.AnonymousClass1HX) r0
            com.whatsapp.jid.Jid r4 = r13.A01
            int r3 = r13.A00
            boolean r0 = r0.A05(r4, r3)
            if (r0 == 0) goto L_0x001b
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r4)
            java.util.Set r7 = java.util.Collections.singleton(r0)
        L_0x001a:
            return r7
        L_0x001b:
            java.util.HashSet r6 = r13.A03
            if (r6 == 0) goto L_0x0026
            boolean r1 = r6.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x00db
            X.1Fe r9 = r13.A04
            X.3Qa r2 = r13.A06
            java.lang.Class<com.whatsapp.jid.DeviceJid> r0 = com.whatsapp.jid.DeviceJid.class
            java.util.HashSet r7 = X.C36441kJ.A16()
            X.AnonymousClass143.A0B(r0, r6, r7)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00f5
            r0 = 58
            if (r3 == r0) goto L_0x00a9
            r0 = 69
            if (r3 == r0) goto L_0x00a9
            r0 = 77
            if (r3 == r0) goto L_0x00a9
            X.1FN r0 = r9.A04
            java.util.HashSet r8 = r0.A00(r2)
        L_0x004e:
            X.11F r0 = r2.A00
            boolean r12 = X.AnonymousClass143.A0J(r0)
            boolean r11 = X.AnonymousClass143.A0I(r0)
            if (r12 != 0) goto L_0x005c
            if (r11 == 0) goto L_0x00f2
        L_0x005c:
            java.util.Iterator r10 = r8.iterator()
        L_0x0060:
            boolean r0 = r10.hasNext()
            r6 = 1
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r1 = r10.next()
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            if (r12 == 0) goto L_0x00a0
            boolean r0 = X.AnonymousClass143.A0J(r1)
            if (r0 != 0) goto L_0x00a0
        L_0x0075:
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "key = "
            r12.append(r0)
            r12.append(r2)
            java.lang.String r0 = "; messageType = "
            r12.append(r0)
            r12.append(r3)
            java.lang.String r0 = "; targetDevices = "
            r12.append(r0)
            r0 = 44
            java.lang.String r11 = java.lang.String.valueOf(r0)
            java.util.Objects.requireNonNull(r11)
            java.util.Iterator r10 = r8.iterator()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            goto L_0x00b3
        L_0x00a0:
            if (r11 == 0) goto L_0x0060
            boolean r0 = X.AnonymousClass143.A0I(r1)
            if (r0 != 0) goto L_0x0060
            goto L_0x0075
        L_0x00a9:
            X.11F r0 = r2.A00
            X.C18740tg.A06(r0)
            java.util.HashSet r8 = X.C25151Fe.A01(r9, r0, r3)
            goto L_0x004e
        L_0x00b3:
            java.util.Objects.requireNonNull(r2)     // Catch:{ IOException -> 0x0128 }
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x0128 }
            if (r0 == 0) goto L_0x00e4
        L_0x00bc:
            java.lang.Object r1 = r10.next()     // Catch:{ IOException -> 0x0128 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ IOException -> 0x0128 }
            boolean r0 = r1 instanceof java.lang.CharSequence     // Catch:{ IOException -> 0x0128 }
            if (r0 == 0) goto L_0x00d6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ IOException -> 0x0128 }
        L_0x00c9:
            r2.append(r1)     // Catch:{ IOException -> 0x0128 }
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x0128 }
            if (r0 == 0) goto L_0x00e4
            r2.append(r11)     // Catch:{ IOException -> 0x0128 }
            goto L_0x00bc
        L_0x00d6:
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0128 }
            goto L_0x00c9
        L_0x00db:
            X.1FN r1 = r13.A05
            X.3Qa r0 = r13.A06
            java.util.HashSet r7 = r1.A00(r0)
            goto L_0x00f5
        L_0x00e4:
            X.C36351kA.A1K(r2, r12)
            java.lang.String r2 = r12.toString()
            X.0wN r1 = r9.A00
            java.lang.String r0 = "InvalidRecipientFiltered"
            r1.A0E(r0, r2, r6)
        L_0x00f2:
            r7.retainAll(r8)
        L_0x00f5:
            r5.get()
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            r0 = 15
            if (r3 == r0) goto L_0x0104
            r0 = 64
            if (r3 != r0) goto L_0x001a
        L_0x0104:
            boolean r0 = X.AnonymousClass143.A0G(r4)
            if (r0 == 0) goto L_0x001a
            r3 = 0
            java.util.Iterator r2 = r7.iterator()
        L_0x010f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0124
            java.lang.Object r1 = r2.next()
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            com.whatsapp.jid.UserJid r0 = r1.userJid
            boolean r0 = X.C197029b1.A00(r0)
            if (r0 == 0) goto L_0x010f
            r3 = r1
        L_0x0124:
            r7.remove(r3)
            return r7
        L_0x0128:
            r0 = move-exception
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass64Y.A00():java.util.Set");
    }

    public AnonymousClass64Y(C25151Fe r1, AnonymousClass1FN r2, Jid jid, C64933Qa r4, AnonymousClass005 r5, HashSet hashSet, int i) {
        this.A02 = r5;
        this.A05 = r2;
        this.A04 = r1;
        this.A01 = jid;
        this.A06 = r4;
        this.A00 = i;
        this.A03 = hashSet;
    }
}
