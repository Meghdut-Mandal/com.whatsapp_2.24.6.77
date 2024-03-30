package X;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1nf  reason: invalid class name and case insensitive filesystem */
public class C38071nf extends Filter {
    public final /* synthetic */ C41091wb A00;

    public C38071nf(C41091wb r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dc, code lost:
        if (X.C202859mm.A04(r5, r10.A0a, r4, true) != false) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x005d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r15) {
        /*
            r14 = this;
            android.widget.Filter$FilterResults r8 = new android.widget.Filter$FilterResults
            r8.<init>()
            r4 = 0
            if (r15 == 0) goto L_0x00fc
            int r0 = r15.length()
            if (r0 != 0) goto L_0x001b
            X.1wb r0 = r14.A00
            java.util.List r0 = r0.A05
            r8.values = r0
            int r0 = r0.size()
        L_0x0018:
            r8.count = r0
            return r8
        L_0x001b:
            java.lang.String r0 = r15.toString()
            java.lang.String r3 = " "
            boolean r0 = r0.startsWith(r3)
            if (r0 != 0) goto L_0x00fc
            int r2 = r15.length()
            java.lang.String r1 = r15.toString()
            java.lang.String r0 = ""
            java.lang.String r0 = r1.replaceAll(r3, r0)
            int r0 = r0.length()
            int r2 = r2 - r0
            r0 = 1
            if (r2 > r0) goto L_0x00fc
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.lang.String r0 = r15.toString()
            java.lang.String r6 = r0.toLowerCase()
            java.lang.String r0 = r15.toString()
            X.1wb r9 = r14.A00
            X.0ts r5 = r9.A0I
            java.util.ArrayList r4 = X.C202859mm.A03(r5, r0)
            java.util.List r0 = r9.A05
            java.util.Iterator r13 = r0.iterator()
            r12 = 0
            r3 = r12
        L_0x005d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r2 = r13.next()
            X.350 r2 = (X.AnonymousClass350) r2
            int r11 = r2.A00
            r0 = 4
            if (r11 != r0) goto L_0x0070
            r3 = r2
            goto L_0x005d
        L_0x0070:
            java.lang.Object r10 = r2.A01
            X.C18740tg.A06(r10)
            boolean r0 = r10 instanceof X.C597134z
            if (r0 == 0) goto L_0x009c
            X.34z r10 = (X.C597134z) r10
            X.3uw r0 = r10.A00
            java.lang.String r0 = r0.A01
            r1 = 1
            boolean r0 = X.C202859mm.A04(r5, r0, r4, r1)
            if (r0 != 0) goto L_0x0092
            X.141 r0 = r10.A01
            java.lang.String r0 = r0.A0J()
            boolean r0 = X.C202859mm.A04(r5, r0, r4, r1)
            if (r0 == 0) goto L_0x005d
        L_0x0092:
            if (r3 == 0) goto L_0x0098
            r7.add(r3)
            r3 = r12
        L_0x0098:
            r7.add(r2)
            goto L_0x005d
        L_0x009c:
            boolean r0 = r10 instanceof X.AnonymousClass141
            if (r0 == 0) goto L_0x005d
            X.141 r10 = (X.AnonymousClass141) r10
            r1 = 0
            r0 = 2
            if (r11 == r0) goto L_0x00ba
            r0 = 16
            if (r11 == r0) goto L_0x00ba
            r0 = 8
            if (r11 != r0) goto L_0x005d
        L_0x00ae:
            java.lang.String r1 = r10.A0J()
        L_0x00b2:
            r0 = 1
            boolean r0 = X.C202859mm.A04(r5, r1, r4, r0)
            if (r0 == 0) goto L_0x005d
            goto L_0x0092
        L_0x00ba:
            boolean r0 = r10.A0N()
            if (r0 == 0) goto L_0x00c7
            X.171 r0 = r9.A0F
            java.lang.String r1 = r0.A0S(r10, r1)
            goto L_0x00b2
        L_0x00c7:
            boolean r0 = X.C36421kH.A1Y(r10)
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = r10.A0a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 != 0) goto L_0x00df
            java.lang.String r0 = r10.A0a
            boolean r0 = X.C202859mm.A04(r5, r0, r4, r1)
            if (r0 == 0) goto L_0x00df
            goto L_0x0092
        L_0x00df:
            com.whatsapp.jid.Jid r0 = X.C36431kI.A0h(r10)
            X.11F r0 = (X.AnonymousClass11F) r0
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = X.AnonymousClass3U8.A06(r0)
            if (r0 == 0) goto L_0x005d
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x005d
            goto L_0x0092
        L_0x00f4:
            r8.values = r7
            int r0 = r7.size()
            goto L_0x0018
        L_0x00fc:
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r8.values = r0
            r8.count = r4
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38071nf.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        int i;
        String str;
        Set set;
        Object obj = filterResults.values;
        if (obj instanceof List) {
            C41091wb r6 = this.A00;
            List<AnonymousClass350> list = (List) obj;
            if (r6.A03 != null) {
                ArrayList A0I = AnonymousClass001.A0I();
                ArrayList A0I2 = AnonymousClass001.A0I();
                for (AnonymousClass350 r2 : list) {
                    if (r2.A00 == 4 && A0I2.size() > 0) {
                        Collections.sort(A0I2, r6.A03);
                        A0I.addAll(A0I2);
                        A0I2 = AnonymousClass001.A0I();
                    }
                    A0I2.add(r2);
                }
                Collections.sort(A0I2, r6.A03);
                A0I.addAll(A0I2);
                list = A0I;
            }
            r6.A06 = list;
            C81473x4 r0 = r6.A03;
            if (r0 != null && (set = r0.A00) != null) {
                int i2 = 0;
                Iterator it = list.iterator();
                int i3 = -1;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass350 r22 = (AnonymousClass350) it.next();
                    if (r22.A00 == 2) {
                        if (!set.contains(C36431kI.A0h((AnonymousClass141) r22.A01))) {
                            i = i3 + i2;
                            break;
                        }
                        i3++;
                    } else {
                        i2++;
                    }
                }
            }
            i = -1;
            r6.A01 = i;
            if (charSequence != null) {
                str = charSequence.toString().toLowerCase();
            } else {
                str = "";
            }
            r6.A04 = str;
            r6.A06();
        }
    }
}
