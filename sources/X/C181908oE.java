package X;

import android.content.Context;
import android.graphics.Paint;
import com.whatsapp.R;

/* renamed from: X.8oE  reason: invalid class name and case insensitive filesystem */
public final class C181908oE extends C200259gz {
    public CharSequence A06(Context context, Paint paint) {
        C206819u1 r0 = this.A02.A05;
        if (r0 == null) {
            return super.A06(context, paint);
        }
        long A00 = (long) r0.A00();
        C18820ts r2 = this.A00;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1M(objArr, 0, A00);
        String A0L = r2.A0L(objArr, R.plurals.f10nameremoved, A00);
        AnonymousClass00C.A08(A0L);
        return A0L;
    }

    public String A09() {
        StringBuilder A0u = AnonymousClass000.A0u();
        String A0B = A0B();
        String str = A0B;
        String str2 = "";
        if (A0B == null) {
            A0B = str2;
        }
        if (A0B.length() > 0) {
            A0u.append(str);
        }
        C207219uk r7 = this.A02;
        C206819u1 r0 = r7.A05;
        if (r0 != null) {
            int A00 = r0.A00();
            A0u.append("\n");
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, A00, 0);
            A0u.append(this.A00.A0L(objArr, R.plurals.f10nameremoved, (long) A00));
        }
        String str3 = r7.A09;
        String str4 = str3;
        if (str3 == null) {
            str4 = str2;
        }
        if (str4.length() > 0) {
            A0u.append("\n");
            A0u.append(str3);
        }
        String str5 = r7.A0A;
        if (str5 != null) {
            str2 = str5;
        }
        if (str2.length() > 0) {
            A0u.append("\n");
            A0u.append(str5);
        }
        return C36381kD.A0y(A0u);
    }

    public void A0F(C196159Xy r2, AnonymousClass3T1 r3) {
        C36321k7.A0w(r2, r3);
        C203369nr.A06(this.A01, r2, r3);
    }

    public C181908oE(C207219uk r1, AnonymousClass9IS r2) {
        super(r1, r2);
    }
}
