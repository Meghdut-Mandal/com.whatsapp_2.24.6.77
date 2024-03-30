package X;

import android.app.ProgressDialog;
import android.content.Context;

/* renamed from: X.1kX  reason: invalid class name and case insensitive filesystem */
public final class C36581kX extends ProgressDialog {
    public CharSequence A00;

    public void setMessage(CharSequence charSequence) {
        AnonymousClass00C.A0D(charSequence, 0);
        super.setMessage(charSequence);
        this.A00 = charSequence;
    }

    public C36581kX(Context context) {
        super(context);
    }
}
