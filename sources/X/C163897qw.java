package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.7qw  reason: invalid class name and case insensitive filesystem */
public class C163897qw implements Comparator {
    public Object A00;
    public final int A01;

    public C163897qw(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(Object obj, List list, int i) {
        AnonymousClass03X.A08(list, new C163897qw(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0143, code lost:
        return X.C05590Qh.A00(r1, java.lang.Integer.valueOf(r2.BCd(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return X.AnonymousClass000.A0I(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x0123;
                case 1: goto L_0x0123;
                case 2: goto L_0x010e;
                case 3: goto L_0x010e;
                case 4: goto L_0x00b0;
                case 5: goto L_0x0091;
                case 6: goto L_0x0174;
                case 7: goto L_0x0144;
                case 8: goto L_0x0016;
                case 9: goto L_0x0005;
                case 10: goto L_0x00e9;
                case 11: goto L_0x00d8;
                case 12: goto L_0x002e;
                case 13: goto L_0x00cb;
                case 14: goto L_0x00be;
                case 15: goto L_0x0005;
                case 16: goto L_0x0082;
                case 17: goto L_0x0073;
                case 18: goto L_0x014f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r8.A00
            X.03v r1 = (X.C009003v) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.Object r0 = r1.invoke(r9, r10)
        L_0x0011:
            int r1 = X.AnonymousClass000.A0I(r0)
        L_0x0015:
            return r1
        L_0x0016:
            android.util.Pair r9 = (android.util.Pair) r9
            android.util.Pair r10 = (android.util.Pair) r10
            java.lang.Object r1 = r9.second
            java.lang.Object r0 = r10.second
            if (r1 == r0) goto L_0x0040
            long r3 = X.C36431kI.A09(r1)
            long r1 = X.C36431kI.A09(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0182
            goto L_0x0180
        L_0x002e:
            java.lang.Object r7 = r8.A00
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r7 = (com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel) r7
            X.6CF r9 = (X.AnonymousClass6CF) r9
            X.6CF r10 = (X.AnonymousClass6CF) r10
            int r2 = r9.A00
            r6 = 0
            r5 = 1
            if (r2 != r5) goto L_0x0042
            int r0 = r10.A00
            if (r0 != r5) goto L_0x0042
        L_0x0040:
            r1 = 0
            return r1
        L_0x0042:
            r1 = -1
            if (r2 == r5) goto L_0x0015
            int r0 = r10.A00
            if (r0 == r5) goto L_0x014e
            X.16D r1 = r7.A06
            com.whatsapp.jid.UserJid r0 = r9.A01
            X.141 r4 = r1.A0D(r0)
            com.whatsapp.jid.UserJid r0 = r10.A01
            X.141 r3 = r1.A0D(r0)
            X.3IL r2 = r4.A0F
            boolean r1 = X.AnonymousClass000.A1V(r2)
            X.3IL r0 = r3.A0F
            if (r0 == 0) goto L_0x0062
            r6 = 1
        L_0x0062:
            if (r1 != r6) goto L_0x014b
            X.171 r0 = r7.A07
            java.lang.String r1 = r0.A0H(r4)
            java.lang.String r0 = r0.A0H(r3)
            int r1 = r1.compareTo(r0)
            return r1
        L_0x0073:
            java.lang.Object r1 = r8.A00
            X.03v r1 = (X.C009003v) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.7a7 r1 = (X.C156527a7) r1
            java.lang.Object r0 = r1.invoke(r9, r10)
            goto L_0x0011
        L_0x0082:
            java.lang.Object r1 = r8.A00
            X.03v r1 = (X.C009003v) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            X.7a6 r1 = (X.C156517a6) r1
            java.lang.Object r0 = r1.invoke(r9, r10)
            goto L_0x0011
        L_0x0091:
            java.lang.Object r0 = r8.A00
            java.util.Comparator r0 = (java.util.Comparator) r0
            int r1 = r0.compare(r9, r10)
            if (r1 != 0) goto L_0x0015
            X.6WV r9 = (X.AnonymousClass6WV) r9
            int r0 = r9.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.6WV r10 = (X.AnonymousClass6WV) r10
            int r0 = r10.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = X.C05590Qh.A00(r1, r0)
            return r1
        L_0x00b0:
            java.lang.Object r1 = r8.A00
            X.03v r1 = (X.C009003v) r1
            int[] r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0b
            X.7ZS r1 = (X.AnonymousClass7ZS) r1
            java.lang.Object r0 = r1.invoke(r9, r10)
            goto L_0x0011
        L_0x00be:
            X.3PS r9 = (X.AnonymousClass3PS) r9
            X.3PS r10 = (X.AnonymousClass3PS) r10
            long r2 = r9.A01
            long r0 = r10.A01
            int r1 = java.lang.Long.compare(r2, r0)
            return r1
        L_0x00cb:
            X.3PS r9 = (X.AnonymousClass3PS) r9
            X.3PS r10 = (X.AnonymousClass3PS) r10
            int r1 = r10.A00
            int r0 = r9.A00
            int r1 = java.lang.Integer.compare(r1, r0)
            return r1
        L_0x00d8:
            java.lang.Object r2 = r8.A00
            java.text.Collator r2 = (java.text.Collator) r2
            X.6bw r9 = (X.C134986bw) r9
            X.6bw r10 = (X.C134986bw) r10
            java.lang.String r1 = r9.A01
            java.lang.String r0 = r10.A01
            int r1 = r2.compare(r1, r0)
            return r1
        L_0x00e9:
            X.6sA r9 = (X.C144426sA) r9
            X.6bv r0 = r9.BG3()
            java.lang.Object r2 = r8.A00
            X.6bv r2 = (X.C134976bv) r2
            float r0 = X.C131836Qv.A00(r0, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            X.6sA r10 = (X.C144426sA) r10
            X.6bv r0 = r10.BG3()
            float r0 = X.C131836Qv.A00(r0, r2)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            int r1 = X.C05590Qh.A00(r1, r0)
            return r1
        L_0x010e:
            X.6ex r10 = (X.C136766ex) r10
            java.lang.Object r2 = r8.A00
            X.7mI r2 = (X.C161167mI) r2
            java.lang.Object r0 = r10.A07
            int r0 = r2.BCd(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.6ex r9 = (X.C136766ex) r9
            java.lang.Object r0 = r9.A07
            goto L_0x0137
        L_0x0123:
            X.6ex r9 = (X.C136766ex) r9
            java.lang.Object r2 = r8.A00
            X.7mI r2 = (X.C161167mI) r2
            java.lang.Object r0 = r9.A07
            int r0 = r2.BCd(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.6ex r10 = (X.C136766ex) r10
            java.lang.Object r0 = r10.A07
        L_0x0137:
            int r0 = r2.BCd(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = X.C05590Qh.A00(r1, r0)
            return r1
        L_0x0144:
            java.lang.String r0 = "Two plugins with the same ordering provided"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x014b:
            if (r2 == 0) goto L_0x014e
            r5 = -1
        L_0x014e:
            return r5
        L_0x014f:
            java.lang.Object r2 = r8.A00
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r2.getSpanStart(r9)
            int r0 = r2.getSpanStart(r10)
            if (r1 < r0) goto L_0x0180
            int r1 = r2.getSpanStart(r9)
            int r0 = r2.getSpanStart(r10)
            if (r1 > r0) goto L_0x0182
            int r1 = r2.getSpanEnd(r10)
            int r0 = r2.getSpanEnd(r9)
            int r1 = java.lang.Integer.compare(r1, r0)
            return r1
        L_0x0174:
            X.6NA r9 = (X.AnonymousClass6NA) r9
            X.6NA r10 = (X.AnonymousClass6NA) r10
            boolean r1 = r9.A01
            boolean r0 = r10.A01
            if (r1 == r0) goto L_0x0184
            if (r0 == 0) goto L_0x0182
        L_0x0180:
            r1 = -1
            return r1
        L_0x0182:
            r1 = 1
            return r1
        L_0x0184:
            int r1 = r9.A02
            int r0 = r10.A02
            int r1 = r1 - r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163897qw.compare(java.lang.Object, java.lang.Object):int");
    }
}
