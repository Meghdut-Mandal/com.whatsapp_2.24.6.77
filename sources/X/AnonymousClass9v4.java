package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.9v4  reason: invalid class name */
public class AnonymousClass9v4 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public AnonymousClass9v4(Context context, C202319lY r2, C202629mK r3, C22956Az8 az8, AnonymousClass3T1 r5, String str, int i) {
        this.A06 = i;
        this.A00 = r3;
        this.A05 = str;
        this.A01 = context;
        this.A02 = r2;
        this.A03 = r5;
        this.A04 = az8;
    }

    public final void onClick(View view) {
        boolean z;
        C23075B3f BBn;
        C23075B3f BBn2;
        int i = this.A06;
        C202629mK r6 = (C202629mK) this.A00;
        String str = this.A05;
        Context context = (Context) this.A01;
        C202319lY r5 = (C202319lY) this.A02;
        AnonymousClass3T1 r8 = (AnonymousClass3T1) this.A03;
        C22956Az8 az8 = (C22956Az8) this.A04;
        Integer A0i = C36361kB.A0i();
        if (i != 0) {
            if (!(str == null || (BBn2 = r6.A06.A05().BBn()) == null)) {
                BBn2.BOm(A0i, 42, str, (String) null);
            }
            z = true;
        } else {
            if (!(str == null || (BBn = r6.A06.A05().BBn()) == null)) {
                BBn.BOm(A0i, 41, str, (String) null);
            }
            z = false;
        }
        r6.A04(context, r5, new AEE(context, r5, r6, az8, r8, str, z), z);
    }
}
