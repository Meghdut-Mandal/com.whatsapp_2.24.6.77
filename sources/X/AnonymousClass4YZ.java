package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.4YZ  reason: invalid class name */
public class AnonymousClass4YZ implements Comparator {
    public Object A00;
    public final int A01;

    public AnonymousClass4YZ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static List A00(Iterable iterable, Object obj, int i) {
        return C007103b.A0c(iterable, new AnonymousClass4YZ(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x0070;
                case 1: goto L_0x0005;
                case 2: goto L_0x0083;
                case 3: goto L_0x0098;
                case 4: goto L_0x00c8;
                case 5: goto L_0x00d9;
                case 6: goto L_0x0005;
                case 7: goto L_0x00ec;
                case 8: goto L_0x0119;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0016;
                case 12: goto L_0x012a;
                case 13: goto L_0x0157;
                case 14: goto L_0x017a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r10.A00
            X.03v r1 = (X.C009003v) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.Object r0 = r1.invoke(r11, r12)
            int r1 = X.AnonymousClass000.A0I(r0)
        L_0x0015:
            return r1
        L_0x0016:
            java.lang.Object r9 = r10.A00
            X.3PC r9 = (X.AnonymousClass3PC) r9
            X.3Sz r11 = (X.C65663Sz) r11
            X.3Sz r12 = (X.C65663Sz) r12
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            X.C36321k7.A0x(r11, r12)
            com.whatsapp.jid.UserJid r6 = r11.A09
            boolean r0 = X.AnonymousClass143.A0K(r6)
            r8 = 1
            if (r0 != 0) goto L_0x01c0
            com.whatsapp.jid.UserJid r7 = r12.A09
            boolean r0 = X.AnonymousClass143.A0K(r7)
            r1 = -1
            if (r0 != 0) goto L_0x0015
            boolean r0 = r6 instanceof X.C177638e7
            if (r0 != 0) goto L_0x01c0
            boolean r0 = r7 instanceof X.C177638e7
            if (r0 != 0) goto L_0x0015
            long r4 = r11.A05()
            long r2 = r12.A05()
            long r4 = r4 - r2
            int r3 = (int) r4
            java.util.Map r2 = r9.A00
            if (r2 == 0) goto L_0x0068
            java.lang.Object r0 = r2.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0069
            int r1 = r0.intValue()
            java.lang.Object r0 = r2.get(r7)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01b8
            int r0 = r0.intValue()
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x0015
        L_0x0068:
            return r3
        L_0x0069:
            java.lang.Object r0 = r2.get(r7)
            if (r0 == 0) goto L_0x0068
            return r1
        L_0x0070:
            java.lang.Object r1 = r10.A00
            X.03v r1 = (X.C009003v) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.4NU r1 = (X.AnonymousClass4NU) r1
            java.lang.Object r0 = r1.invoke(r11, r12)
            int r1 = X.AnonymousClass000.A0I(r0)
            return r1
        L_0x0083:
            java.lang.Object r0 = r10.A00
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r0.get(r12)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r0 = r0.get(r11)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            int r1 = X.C05590Qh.A00(r1, r0)
            return r1
        L_0x0098:
            X.141 r12 = (X.AnonymousClass141) r12
            java.lang.Object r0 = r10.A00
            X.39l r0 = (X.C608139l) r0
            X.1Cv r4 = r0.A04
            X.11F r0 = r12.A0H
            X.3T1 r0 = r4.A04(r0)
            r2 = 0
            if (r0 == 0) goto L_0x00c5
            long r0 = r0.A0I
        L_0x00ac:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.141 r11 = (X.AnonymousClass141) r11
            X.11F r0 = r11.A0H
            X.3T1 r0 = r4.A04(r0)
            if (r0 == 0) goto L_0x00bc
            long r2 = r0.A0I
        L_0x00bc:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            int r1 = X.C05590Qh.A00(r1, r0)
            return r1
        L_0x00c5:
            r0 = 0
            goto L_0x00ac
        L_0x00c8:
            X.141 r11 = (X.AnonymousClass141) r11
            X.141 r12 = (X.AnonymousClass141) r12
            long r2 = r12.A0I()
            long r0 = r11.A0I()
            int r1 = java.lang.Long.compare(r2, r0)
            return r1
        L_0x00d9:
            java.lang.Object r1 = r10.A00
            X.03v r1 = (X.C009003v) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.4NV r1 = (X.AnonymousClass4NV) r1
            java.lang.Object r0 = r1.invoke(r11, r12)
            int r1 = X.AnonymousClass000.A0I(r0)
            return r1
        L_0x00ec:
            X.4Ua r11 = (X.C88784Ua) r11
            java.lang.Object r2 = r10.A00
            X.3PH r2 = (X.AnonymousClass3PH) r2
            int r0 = r11.getId()
            X.2nu r0 = r2.A01(r0)
            int r0 = r0.ordinal()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.4Ua r12 = (X.C88784Ua) r12
            int r0 = r12.getId()
            X.2nu r0 = r2.A01(r0)
            int r0 = r0.ordinal()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = X.C05590Qh.A00(r1, r0)
            return r1
        L_0x0119:
            java.lang.Object r2 = r10.A00
            java.text.Collator r2 = (java.text.Collator) r2
            X.3GY r11 = (X.AnonymousClass3GY) r11
            X.3GY r12 = (X.AnonymousClass3GY) r12
            java.lang.String r1 = r11.A03
            java.lang.String r0 = r12.A03
            int r1 = r2.compare(r1, r0)
            return r1
        L_0x012a:
            X.2gZ r11 = (X.C48022gZ) r11
            X.141 r0 = r11.A00
            java.lang.String r2 = r0.A0J()
            r3 = 0
            if (r2 == 0) goto L_0x0155
            java.lang.Object r0 = r10.A00
            X.3Nf r0 = (X.C64243Nf) r0
            java.lang.String r1 = r0.A01
            r0 = 1
            int r0 = X.AnonymousClass099.A0C(r2, r1, r3, r0)
        L_0x0140:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            X.2gZ r12 = (X.C48022gZ) r12
            X.141 r0 = r12.A00
            java.lang.String r2 = r0.A0J()
            if (r2 == 0) goto L_0x01ad
            java.lang.Object r0 = r10.A00
            X.3Nf r0 = (X.C64243Nf) r0
            java.lang.String r1 = r0.A01
            goto L_0x01a8
        L_0x0155:
            r0 = 0
            goto L_0x0140
        L_0x0157:
            X.2go r11 = (X.C48162go) r11
            X.2La r0 = r11.A04
            java.lang.String r2 = r0.A0K
            r3 = 0
            if (r2 == 0) goto L_0x0178
            java.lang.Object r0 = r10.A00
            com.whatsapp.updates.viewmodels.SearchUsecase r0 = (com.whatsapp.updates.viewmodels.SearchUsecase) r0
            java.lang.String r1 = r0.A03()
            r0 = 1
            int r0 = X.AnonymousClass099.A0C(r2, r1, r3, r0)
        L_0x016d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            X.2go r12 = (X.C48162go) r12
            X.2La r0 = r12.A04
            java.lang.String r2 = r0.A0K
            goto L_0x019e
        L_0x0178:
            r0 = 0
            goto L_0x016d
        L_0x017a:
            X.2gZ r11 = (X.C48022gZ) r11
            X.141 r0 = r11.A00
            java.lang.String r2 = r0.A0J()
            r3 = 0
            if (r2 == 0) goto L_0x01b6
            java.lang.Object r0 = r10.A00
            com.whatsapp.updates.viewmodels.SearchUsecase r0 = (com.whatsapp.updates.viewmodels.SearchUsecase) r0
            java.lang.String r1 = r0.A03()
            r0 = 1
            int r0 = X.AnonymousClass099.A0C(r2, r1, r3, r0)
        L_0x0192:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            X.2gZ r12 = (X.C48022gZ) r12
            X.141 r0 = r12.A00
            java.lang.String r2 = r0.A0J()
        L_0x019e:
            if (r2 == 0) goto L_0x01ad
            java.lang.Object r0 = r10.A00
            com.whatsapp.updates.viewmodels.SearchUsecase r0 = (com.whatsapp.updates.viewmodels.SearchUsecase) r0
            java.lang.String r1 = r0.A03()
        L_0x01a8:
            r0 = 1
            int r3 = X.AnonymousClass099.A0C(r2, r1, r3, r0)
        L_0x01ad:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            int r1 = X.C05590Qh.A00(r4, r0)
            return r1
        L_0x01b6:
            r0 = 0
            goto L_0x0192
        L_0x01b8:
            java.lang.Object r0 = r2.get(r6)
            if (r0 != 0) goto L_0x01bf
            return r3
        L_0x01bf:
            return r8
        L_0x01c0:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YZ.compare(java.lang.Object, java.lang.Object):int");
    }
}
