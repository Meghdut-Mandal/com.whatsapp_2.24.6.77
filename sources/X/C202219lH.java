package X;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.9lH  reason: invalid class name and case insensitive filesystem */
public final class C202219lH {
    public static final C202219lH A05 = new C202219lH((String) null, new Object[0], 0, 8);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final Object[] A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C202219lH)) {
                return false;
            }
            C202219lH r4 = (C202219lH) obj;
            if (this.A01 != r4.A01 || this.A00 != r4.A00) {
                return false;
            }
            String str = this.A03;
            String str2 = r4.A03;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (str2 == null || !str.equals(str2)) {
                return false;
            }
            String str3 = this.A02;
            String str4 = r4.A02;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (str4 == null || !str3.equals(str4)) {
                return false;
            }
            return Arrays.equals(this.A04, r4.A04);
        }
    }

    public String A00(Resources resources) {
        int i = this.A00;
        if (i != 0) {
            Object[] objArr = this.A04;
            if (objArr == null || objArr.length <= 0) {
                return resources.getString(i);
            }
            return resources.getString(i, objArr);
        }
        String str = this.A03;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int hashCode() {
        int i;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode() + 31;
        } else {
            i = 1;
        }
        String str2 = this.A02;
        if (str2 != null) {
            i = C90504aG.A0B(str2, i * 31);
        }
        return ((((i * 31) + this.A00) * 31) + this.A01) | Arrays.hashCode(this.A04);
    }

    public C202219lH(String str, Object[] objArr, int i, int i2) {
        this.A03 = null;
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = objArr;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TextConfiguration{text='");
        A0u.append(this.A03);
        A0u.append('\'');
        A0u.append(", textResId=");
        A0u.append(this.A00);
        A0u.append(", formatArgs=");
        C90514aH.A1T(A0u, this.A04);
        return AnonymousClass000.A0s(A0u);
    }

    public C202219lH(String str) {
        int A002 = C36381kD.A00(TextUtils.isEmpty(str) ? 1 : 0);
        this.A03 = str;
        this.A00 = 0;
        this.A02 = null;
        this.A01 = A002;
        this.A04 = null;
    }
}
