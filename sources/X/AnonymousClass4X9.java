package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Pair;

/* renamed from: X.4X9  reason: invalid class name */
public class AnonymousClass4X9 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05;

    public AnonymousClass4X9(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A05 = i;
        this.A00 = obj3;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A05;
        Object obj = this.A00;
        if (i2 != 0) {
            Activity activity = (Activity) obj;
            String str = this.A03;
            String str2 = this.A04;
            AnonymousClass3SJ.A00(activity, 125);
            boolean A002 = ((AnonymousClass1CF) this.A02).A00();
            StringBuilder A0u = AnonymousClass000.A0u();
            AnonymousClass000.A1D("blocked +", str, str2, A0u);
            AnonymousClass3DY.A00(activity, (AnonymousClass3DY) this.A01, A0u.toString(), A002);
            return;
        }
        String str3 = this.A03;
        String str4 = this.A04;
        C36361kB.A0y((Context) this.A02, C20380xT.A00((Pair) null, (C20380xT) obj, "general", str3, str4), (C24801Dv) this.A01);
    }
}
