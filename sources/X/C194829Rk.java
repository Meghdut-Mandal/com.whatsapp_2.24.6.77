package X;

import java.util.Locale;

/* renamed from: X.9Rk  reason: invalid class name and case insensitive filesystem */
public final class C194829Rk {
    public final int A00;
    public final int[] A01;
    public final String[] A02;
    public final String[] A03;

    public C194829Rk(int[] iArr, String[] strArr, String[] strArr2, int i) {
        this.A03 = strArr;
        this.A01 = iArr;
        this.A02 = strArr2;
        this.A00 = i;
    }

    public String A00(String str, int i, long j, long j2) {
        Locale locale;
        String str2;
        Object[] objArr;
        Object valueOf;
        StringBuilder A0u = AnonymousClass000.A0u();
        int i2 = 0;
        while (true) {
            int i3 = this.A00;
            String[] strArr = this.A03;
            if (i2 >= i3) {
                return AnonymousClass000.A0q(strArr[i3], A0u);
            }
            C165617ti.A0g(A0u, strArr, i2);
            int[] iArr = this.A01;
            if (iArr[i2] == 1) {
                A0u.append(str);
            } else {
                if (iArr[i2] == 2) {
                    locale = Locale.US;
                    str2 = this.A02[i2];
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j);
                } else if (iArr[i2] == 3) {
                    locale = Locale.US;
                    str2 = this.A02[i2];
                    objArr = new Object[1];
                    valueOf = Integer.valueOf(i);
                } else if (iArr[i2] == 4) {
                    locale = Locale.US;
                    str2 = this.A02[i2];
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j2);
                }
                objArr[0] = valueOf;
                A0u.append(String.format(locale, str2, objArr));
            }
            i2++;
        }
    }
}
