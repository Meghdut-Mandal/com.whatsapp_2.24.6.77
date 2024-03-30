package X;

import android.text.TextUtils;

/* renamed from: X.2a3  reason: invalid class name */
public class AnonymousClass2a3 extends C39831tt {
    public final C001700s A00 = C36431kI.A0S();

    public AnonymousClass2a3(C21100yf r2, C19970wo r3, C20310xM r4, C20810yC r5, C23075B3f b3f, C29551Xb r7) {
        super(r2, r3, r4, r5, b3f, r7);
    }

    public void A0X(String str) {
        C001700s r2;
        AnonymousClass35C r1;
        super.A0X(str);
        String A07 = this.A02.A07(C21100yf.A26);
        if (TextUtils.isEmpty(A07) || !C203419nz.A07(str)) {
            boolean isEmpty = TextUtils.isEmpty(A07);
            r2 = this.A00;
            if (!isEmpty) {
                r1 = new AnonymousClass35C(A07, (String) null);
            } else {
                r2.A0D((Object) null);
                return;
            }
        } else {
            r2 = this.A00;
            r1 = new AnonymousClass35C(A07, str);
        }
        r2.A0D(r1);
    }
}
