package X;

import android.content.Context;

/* renamed from: X.2dd  reason: invalid class name and case insensitive filesystem */
public abstract class C47172dd extends C36561kV {
    public C228816i A00;
    public C18820ts A01;

    public void attachBaseContext(Context context) {
        C18800tq A0P = C36371kC.A0P(context);
        this.A01 = A0P.BxU();
        C228916j A0Z = C18830tt.A0Z(A0P.AfI.A00);
        this.A00 = A0Z;
        super.attachBaseContext(new C229016k(context, A0Z, this.A01));
    }

    public C47172dd(String str) {
        super(str);
    }
}
