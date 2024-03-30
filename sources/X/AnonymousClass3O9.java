package X;

import android.text.TextUtils;

/* renamed from: X.3O9  reason: invalid class name */
public class AnonymousClass3O9 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final int[] A05;
    public final int[] A06;
    public final String[] A07;
    public final String[] A08;
    public final String[] A09;
    public final String[] A0A;

    public static int A00(AnonymousClass3O9 r5, int i) {
        int i2;
        int i3;
        int length;
        int length2;
        int length3;
        int[] iArr = r5.A05;
        if (iArr == null || (length3 = iArr.length) == 0) {
            i2 = 5;
        } else {
            i2 = iArr[0];
            for (int i4 = 1; i4 < length3; i4++) {
                if (iArr[i4] < i2) {
                    i2 = iArr[i4];
                }
            }
        }
        if (i < i2) {
            return -1;
        }
        if (iArr == null || (length2 = iArr.length) == 0) {
            i3 = 14;
        } else {
            i3 = iArr[0];
            for (int i5 = 1; i5 < length2; i5++) {
                if (iArr[i5] > i3) {
                    i3 = iArr[i5];
                }
            }
        }
        if (i > i3) {
            return 1;
        }
        if (!(iArr == null || (length = iArr.length) == 0)) {
            int i6 = 0;
            while (iArr[i6] != i) {
                i6++;
                if (i6 >= length) {
                }
            }
        }
        return 0;
        return 1;
    }

    public AnonymousClass3O9(String[] strArr) {
        int[] iArr;
        int[] iArr2;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str;
        int length;
        int length2;
        int length3 = strArr.length;
        if (length3 >= 12) {
            boolean z = false;
            String str2 = strArr[0];
            String str3 = strArr[1];
            String str4 = strArr[2];
            String str5 = strArr[3];
            String str6 = strArr[4];
            String str7 = strArr[5];
            if (str3 == null || str4 == null) {
                throw new IllegalArgumentException();
            }
            this.A03 = str3;
            this.A02 = str2;
            this.A00 = Integer.parseInt(str4);
            String[] strArr5 = null;
            if (str5 == null || str5.trim().length() <= 0) {
                iArr = null;
            } else {
                String[] split = TextUtils.split(str5, ",");
                iArr = null;
                if (!(split == null || (length2 = split.length) == 0)) {
                    iArr = new int[length2];
                    int i = 0;
                    do {
                        iArr[i] = Integer.parseInt(split[i]);
                        i++;
                    } while (i < length2);
                }
            }
            this.A06 = iArr;
            if (str6 == null || str6.trim().length() <= 0) {
                iArr2 = null;
            } else {
                String[] split2 = TextUtils.split(str6, ",");
                iArr2 = null;
                if (!(split2 == null || (length = split2.length) == 0)) {
                    iArr2 = new int[length];
                    int i2 = 0;
                    do {
                        iArr2[i2] = Integer.parseInt(split2[i2]);
                        i2++;
                    } while (i2 < length);
                }
            }
            this.A05 = iArr2;
            if (str7 == null || str7.trim().length() <= 0) {
                strArr2 = null;
            } else {
                strArr2 = TextUtils.split(str7, ",");
            }
            this.A0A = strArr2;
            String str8 = strArr[7];
            z = (str8.length() > 0 || strArr[8].length() > 0 || strArr[9].length() > 0) ? true : z;
            if (z) {
                strArr3 = TextUtils.split(str8, ";");
            } else {
                strArr3 = null;
            }
            this.A09 = strArr3;
            if (z) {
                strArr4 = TextUtils.split(strArr[8], ";");
            } else {
                strArr4 = null;
            }
            this.A07 = strArr4;
            this.A08 = z ? TextUtils.split(strArr[9], ";") : strArr5;
            this.A01 = strArr[10];
            if (length3 >= 14) {
                str = strArr[13];
            } else {
                str = "";
            }
            this.A04 = str;
            return;
        }
        throw new IllegalArgumentException();
    }
}
