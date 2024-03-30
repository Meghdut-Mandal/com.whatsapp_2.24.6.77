package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.AUi  reason: case insensitive filesystem */
public final class C21666AUi implements Comparable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass83A A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C21666AUi aUi = (C21666AUi) obj;
            if (!(this.A05 == aUi.A05 && this.A03 == aUi.A03 && this.A02 == aUi.A02 && this.A01 == aUi.A01 && this.A04 == aUi.A04 && this.A00 == aUi.A00)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: A00 */
    public int compareTo(C21666AUi aUi) {
        int i;
        int i2 = this.A05;
        int i3 = i2;
        int i4 = aUi.A05;
        if (i2 == i4 && (i2 = this.A03) == (i4 = aUi.A03) && (i2 = this.A02) == (i4 = aUi.A02)) {
            if (this.A06.A0N) {
                int i5 = aUi.A00;
                int i6 = this.A00;
                if (i5 > i6) {
                    return 1;
                }
                if (i6 > i5) {
                    return -1;
                }
                return 0;
            }
            int i7 = 1;
            if (i3 != 1) {
                i7 = -1;
            }
            int i8 = this.A01;
            int i9 = aUi.A01;
            if (i8 == i9 && (i8 = this.A04) == (i9 = aUi.A04)) {
                i8 = this.A00;
                i9 = aUi.A00;
            }
            if (i8 > i9) {
                i = 1;
            } else {
                i = 0;
                if (i9 > i8) {
                    i = -1;
                }
            }
            return i7 * i;
        } else if (i2 > i4) {
            return 1;
        } else {
            if (i4 > i2) {
                return -1;
            }
            return 0;
        }
    }

    public int hashCode() {
        return (((((((((this.A05 * 31) + this.A03) * 31) + this.A02) * 31) + this.A01) * 31) + this.A04) * 31) + this.A00;
    }

    public C21666AUi(C207099uY r8, AnonymousClass83A r9, int i) {
        int i2;
        this.A06 = r9;
        int i3 = 0;
        this.A05 = (i & 7) != 4 ? 0 : 1;
        int i4 = 0;
        while (true) {
            List list = r9.A0I;
            if (i4 >= list.size()) {
                i2 = 0;
                break;
            }
            String A0s = C36401kF.A0s(list, i4);
            if (!TextUtils.isEmpty(A0s) && A0s.equals(r8.A0R)) {
                i2 = 4;
                break;
            }
            A0s = (TextUtils.isEmpty(A0s) || TextUtils.equals(A0s, "und")) ? null : A0s;
            String str = r8.A0R;
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und") && str != null && A0s != null) {
                if (str.startsWith(A0s) || A0s.startsWith(str)) {
                    i2 = 3;
                } else if (str.split("-", 2)[0].equals(A0s.split("-", 2)[0])) {
                    i2 = 2;
                    break;
                }
            }
            i4++;
        }
        i2 = 3;
        this.A03 = i2;
        this.A02 = (r8.A0G & 1) != 0 ? 1 : i3;
        this.A01 = r8.A05;
        this.A04 = r8.A0F;
        this.A00 = r8.A04;
    }
}
