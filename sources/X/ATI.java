package X;

import android.content.Context;

public final /* synthetic */ class ATI implements C25711Hj {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C21135A9v A01;
    public final /* synthetic */ AnonymousClass3T1 A02;
    public final /* synthetic */ C207219uk A03;
    public final /* synthetic */ C206819u1 A04;

    public /* synthetic */ ATI(Context context, C21135A9v a9v, AnonymousClass3T1 r3, C207219uk r4, C206819u1 r5) {
        this.A01 = a9v;
        this.A00 = context;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void accept(Object obj) {
        String str;
        C21135A9v a9v = this.A01;
        Context context = this.A00;
        AnonymousClass3T1 r6 = this.A02;
        C207219uk r5 = this.A03;
        C206819u1 r4 = this.A04;
        String str2 = (String) obj;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode == -839883634) {
                str = "PERMANENT";
            } else if (hashCode != 181990675) {
                if (hashCode == 476614193) {
                    str = "TEMPORARY";
                } else {
                    return;
                }
            } else if (str2.equals("UNBLOCKED")) {
                a9v.A00.A01(r4.A00).A0A(new ATG(context, a9v, r6, r5));
                return;
            } else {
                return;
            }
            if (str2.equals(str)) {
                a9v.A03.A02(context, str2);
            }
        }
    }
}
