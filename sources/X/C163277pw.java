package X;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: X.7pw  reason: invalid class name and case insensitive filesystem */
public class C163277pw implements DialogInterface.OnCancelListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C163277pw(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        ((Activity) this.A01).onBackPressed();
    }
}
