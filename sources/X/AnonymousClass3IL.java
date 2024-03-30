package X;

import android.text.TextUtils;

/* renamed from: X.3IL  reason: invalid class name */
public class AnonymousClass3IL {
    public final long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            AnonymousClass3IL r7 = (AnonymousClass3IL) obj;
            if (this.A00 != r7.A00 || !TextUtils.equals(this.A01, r7.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i;
        int A08 = AnonymousClass000.A08(this.A00) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return A08 + i;
    }

    public AnonymousClass3IL(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A00);
        A0u.append(":");
        return AnonymousClass000.A0q(AnonymousClass14B.A0B(this.A01, 4), A0u);
    }
}
