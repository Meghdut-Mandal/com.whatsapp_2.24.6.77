package X;

import android.content.Context;

/* renamed from: X.2fr  reason: invalid class name and case insensitive filesystem */
public class C47842fr extends C61243Bc {
    public final String A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C47842fr) obj).A00);
    }

    public C47842fr(String str) {
        this.A00 = str;
    }

    public int hashCode() {
        return AnonymousClass000.A0M(this.A00, AnonymousClass001.A0L(), 0);
    }

    public /* bridge */ /* synthetic */ CharSequence A00(Context context) {
        return this.A00;
    }
}
