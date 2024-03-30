package X;

import android.content.Context;

public final /* synthetic */ class ATG implements C25711Hj {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C21135A9v A01;
    public final /* synthetic */ AnonymousClass3T1 A02;
    public final /* synthetic */ C207219uk A03;

    public /* synthetic */ ATG(Context context, C21135A9v a9v, AnonymousClass3T1 r3, C207219uk r4) {
        this.A01 = a9v;
        this.A00 = context;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void accept(Object obj) {
        C21135A9v a9v = this.A01;
        Context context = this.A00;
        AnonymousClass3T1 r5 = this.A02;
        C207219uk r4 = this.A03;
        if (AnonymousClass000.A1X(obj)) {
            C206819u1 r0 = r4.A05;
            if (r0 != null) {
                a9v.A05.A01(r0.A00, AnonymousClass96V.A00(), new C22495AnY(context, a9v, r5, r4));
                return;
            }
            return;
        }
        C199439fJ.A00(context);
    }
}
