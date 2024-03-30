package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;

/* renamed from: X.7pz  reason: invalid class name and case insensitive filesystem */
public class C163307pz implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C163307pz(C179108jC r1, Runnable runnable, int i, int i2) {
        this.A03 = i2;
        this.A01 = r1;
        this.A00 = i;
        this.A02 = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A03;
        Activity activity = (Activity) this.A01;
        int i3 = this.A00;
        Runnable runnable = (Runnable) this.A02;
        if (i2 != 0) {
            AnonymousClass3SJ.A00(activity, i3);
        } else {
            AnonymousClass3SJ.A00(activity, i3);
            if (runnable == null) {
                return;
            }
        }
        new Handler(activity.getMainLooper()).post(runnable);
    }
}
