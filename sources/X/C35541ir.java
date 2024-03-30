package X;

import android.app.Activity;
import android.content.Context;
import java.util.List;

/* renamed from: X.1ir  reason: invalid class name and case insensitive filesystem */
public class C35541ir implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;

    public final void run() {
        C158487ha r5 = (C158487ha) this.A00;
        Context context = (Context) this.A02;
        String str = this.A04;
        AnonymousClass00C.A0D(r5, 0);
        ((C32341dO) this.A03).A05.A0C(r5.BHS(context, str, (List) this.A01));
    }

    public C35541ir(Activity activity, C158487ha r2, C32341dO r3, String str, List list) {
        this.A00 = r2;
        this.A01 = list;
        this.A02 = activity;
        this.A04 = str;
        this.A03 = r3;
    }
}
