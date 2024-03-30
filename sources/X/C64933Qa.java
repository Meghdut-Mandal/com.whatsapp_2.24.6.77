package X;

import com.whatsapp.jid.GroupJid;
import java.util.Iterator;

/* renamed from: X.3Qa  reason: invalid class name and case insensitive filesystem */
public class C64933Qa {
    public final AnonymousClass11F A00;
    public final String A01;
    public final boolean A02;

    public static AnonymousClass11F A00(AnonymousClass3T1 r1) {
        AnonymousClass00C.A0D(r1, 0);
        return r1.A1J.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0 != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0038
            r2 = 0
            if (r5 == 0) goto L_0x0020
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x0020
            X.3Qa r5 = (X.C64933Qa) r5
            boolean r1 = r4.A02
            boolean r0 = r5.A02
            if (r1 != r0) goto L_0x0020
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 != 0) goto L_0x0021
            if (r0 == 0) goto L_0x0028
        L_0x0020:
            return r2
        L_0x0021:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0028
            return r2
        L_0x0028:
            X.11F r1 = r4.A00
            X.11F r0 = r5.A00
            if (r1 != 0) goto L_0x0031
            if (r0 == 0) goto L_0x0038
            return r2
        L_0x0031:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0038
            return r2
        L_0x0038:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64933Qa.equals(java.lang.Object):boolean");
    }

    public static AnonymousClass11F A01(AnonymousClass3T1 r0) {
        AnonymousClass11F r02 = r0.A1J.A00;
        C18740tg.A06(r02);
        return r02;
    }

    public static GroupJid A03(AnonymousClass3T1 r1) {
        AnonymousClass6SZ r0 = GroupJid.Companion;
        return AnonymousClass6SZ.A00(r1.A1J.A00);
    }

    public static boolean A04(AnonymousClass3T1 r0) {
        return r0.A1J.A00 instanceof C28981Uw;
    }

    public static boolean A05(AnonymousClass3T1 r0, Object obj) {
        return obj.equals(r0.A1J.A00);
    }

    public int hashCode() {
        return ((((C36341k9.A01(this.A02 ? 1 : 0) + 31) * 31) + C36341k9.A09(this.A01)) * 31) + C36411kG.A09(this.A00);
    }

    public C64933Qa(C64933Qa r2) {
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
    }

    public static AnonymousClass11F A02(Iterator it) {
        return ((AnonymousClass3T1) it.next()).A1J.A00;
    }

    public AnonymousClass11F A06() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Key[id=");
        A0u.append(this.A01);
        A0u.append(", from_me=");
        A0u.append(this.A02);
        A0u.append(", remote_jid=");
        A0u.append(this.A00);
        return AnonymousClass000.A0q("]", A0u);
    }

    public C64933Qa(AnonymousClass11F r1, String str, boolean z) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = r1;
    }
}
