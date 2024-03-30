package X;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: X.0XD  reason: invalid class name */
public final class AnonymousClass0XD {
    public final String A00;
    public final LocusId A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.A00;
        String str2 = ((AnonymousClass0XD) obj).A00;
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static AnonymousClass0XD A00(LocusId locusId) {
        AnonymousClass0YM.A02(locusId, "locusId cannot be null");
        String A012 = AnonymousClass0VH.A01(locusId);
        if (!TextUtils.isEmpty(A012)) {
            return new AnonymousClass0XD(A012);
        }
        throw AnonymousClass001.A08(String.valueOf("id cannot be empty"));
    }

    public int hashCode() {
        int hashCode;
        String str = this.A00;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public AnonymousClass0XD(String str) {
        LocusId locusId;
        if (!TextUtils.isEmpty(str)) {
            this.A00 = str;
            if (Build.VERSION.SDK_INT >= 29) {
                locusId = AnonymousClass0VH.A00(str);
            } else {
                locusId = null;
            }
            this.A01 = locusId;
            return;
        }
        throw AnonymousClass001.A08(String.valueOf("id cannot be empty"));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LocusIdCompat[");
        int length = this.A00.length();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append(length);
        A0u.append(AnonymousClass000.A0q("_chars", A0u2));
        return AnonymousClass000.A0q("]", A0u);
    }

    public LocusId A01() {
        return this.A01;
    }
}
