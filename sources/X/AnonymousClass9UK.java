package X;

import java.util.List;

/* renamed from: X.9UK  reason: invalid class name */
public class AnonymousClass9UK {
    public Integer A00;
    public List A01 = null;
    public String A02;
    public List A03 = null;

    public void A00(Integer num, String str, String str2) {
        List list = this.A01;
        if (list == null) {
            list = AnonymousClass001.A0I();
            this.A01 = list;
        }
        list.add(new C192849Iu(num, str, str2));
    }

    public AnonymousClass9UK(Integer num, String str) {
        this.A00 = num == null ? C023109s.A00 : num;
        this.A02 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0013  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r0 = X.C023109s.A01
            if (r1 != r0) goto L_0x0060
            java.lang.String r0 = "> "
        L_0x000c:
            r3.append(r0)
        L_0x000f:
            java.lang.String r0 = r5.A02
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "*"
        L_0x0015:
            r3.append(r0)
            java.util.List r0 = r5.A01
            if (r0 == 0) goto L_0x0067
            java.util.Iterator r4 = r0.iterator()
        L_0x0020:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r2 = r4.next()
            X.9Iu r2 = (X.C192849Iu) r2
            r0 = 91
            r3.append(r0)
            java.lang.String r0 = r2.A01
            r3.append(r0)
            X.93Y r0 = X.AnonymousClass93Y.$redex_init_class
            java.lang.Integer r0 = r2.A00
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x005a
            r0 = 2
            if (r1 == r0) goto L_0x0057
            r0 = 3
            if (r1 != r0) goto L_0x0051
            java.lang.String r0 = "|="
        L_0x0049:
            r3.append(r0)
        L_0x004c:
            java.lang.String r0 = r2.A02
            r3.append(r0)
        L_0x0051:
            r0 = 93
            r3.append(r0)
            goto L_0x0020
        L_0x0057:
            java.lang.String r0 = "~="
            goto L_0x0049
        L_0x005a:
            r0 = 61
            r3.append(r0)
            goto L_0x004c
        L_0x0060:
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 != r0) goto L_0x000f
            java.lang.String r0 = "+ "
            goto L_0x000c
        L_0x0067:
            java.util.List r0 = r5.A03
            if (r0 == 0) goto L_0x0082
            java.util.Iterator r2 = r0.iterator()
        L_0x006f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.Object r1 = r2.next()
            r0 = 58
            r3.append(r0)
            r3.append(r1)
            goto L_0x006f
        L_0x0082:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9UK.toString():java.lang.String");
    }
}
