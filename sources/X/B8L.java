package X;

import android.app.Activity;
import android.content.DialogInterface;

public class B8L implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public B8L(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A02;
        Object obj = this.A01;
        switch (i2) {
            case 0:
            case 1:
                C179128jE r1 = (C179128jE) obj;
                AnonymousClass3SJ.A00(r1, this.A00);
                r1.A3v();
                r1.finish();
                return;
            default:
                AnonymousClass3SJ.A00((Activity) obj, this.A00);
                return;
        }
    }
}
