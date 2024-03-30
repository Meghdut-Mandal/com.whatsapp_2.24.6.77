package X;

import android.content.Context;
import com.whatsapp.LegacyMessageDialogFragment;

/* renamed from: X.9fr  reason: invalid class name and case insensitive filesystem */
public class C199729fr {
    public int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C199729fr)) {
            return false;
        }
        C199729fr r4 = (C199729fr) obj;
        return this.A00 == r4.A00 && C1901797e.A00(this.A01, r4.A01);
    }

    public String A01(Context context) {
        String str = this.A01;
        if (str == null) {
            return context.getString(this.A00);
        }
        return str;
    }

    public C199729fr(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public static LegacyMessageDialogFragment A00(Context context, C199729fr r1) {
        String A012 = r1.A01(context);
        AnonymousClass3P9 r0 = new AnonymousClass3P9();
        r0.A08 = A012;
        return r0.A02();
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, this.A00);
        return AnonymousClass000.A0L(this.A01, A0M);
    }

    public C199729fr(int i) {
        this.A00 = i;
        this.A01 = null;
    }
}
