package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.3Yb  reason: invalid class name and case insensitive filesystem */
public class C66983Yb implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public String A05;
    public final int A06;

    public final void onClick(View view) {
        String str;
        Object obj;
        String str2;
        Drawable drawable;
        int i;
        boolean z;
        boolean z2;
        Object obj2;
        if (this.A06 != 0) {
            C88984Uu r5 = (C88984Uu) this.A00;
            int B6H = r5.B6H();
            boolean B28 = r5.B28();
            if (B6H == 0) {
                if (B28) {
                    str2 = this.A04;
                    obj2 = this.A01;
                } else {
                    str2 = this.A05;
                    obj2 = this.A02;
                }
                drawable = (Drawable) obj2;
                i = 0;
                z = true;
                z2 = false;
            } else {
                if (B28) {
                    str = this.A04;
                    obj = this.A01;
                } else {
                    str = this.A05;
                    obj = this.A02;
                }
                drawable = (Drawable) obj;
                i = 0;
                z = true;
                z2 = true;
            }
            r5.Azo(drawable, this, str2, i, z, z2);
            return;
        }
        Runnable runnable = (Runnable) this.A00;
        Activity activity = (Activity) this.A01;
        AnonymousClass3DY r52 = (AnonymousClass3DY) this.A02;
        AnonymousClass1CF r0 = (AnonymousClass1CF) this.A03;
        String str3 = this.A04;
        String str4 = this.A05;
        if (runnable != null) {
            runnable.run();
        }
        boolean A002 = r0.A00();
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1D("blocked +", str3, str4, A0u);
        AnonymousClass3DY.A00(activity, r52, A0u.toString(), A002);
        AnonymousClass3SJ.A00(activity, 124);
    }

    public C66983Yb(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = str;
        this.A05 = str2;
    }
}
