package X;

import android.content.Context;
import java.util.Arrays;

/* renamed from: X.2fu  reason: invalid class name and case insensitive filesystem */
public class C47872fu extends C61243Bc {
    public final int A00;
    public final int A01;
    public final Object[] A02;

    public /* bridge */ /* synthetic */ CharSequence A00(Context context) {
        Object[] objArr = this.A02;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj instanceof C61243Bc) {
                obj = ((C61243Bc) obj).A00(context);
            }
            objArr2[i] = obj;
        }
        return context.getResources().getQuantityString(this.A01, this.A00, objArr2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C47872fu)) {
            return false;
        }
        C47872fu r4 = (C47872fu) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00 && Arrays.equals(this.A02, r4.A02)) {
            return true;
        }
        return false;
    }

    public C47872fu(Object[] objArr, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = objArr;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, this.A01);
        AnonymousClass000.A1K(A0M, this.A00);
        return (Arrays.hashCode(A0M) * 31) + Arrays.hashCode(this.A02);
    }
}
