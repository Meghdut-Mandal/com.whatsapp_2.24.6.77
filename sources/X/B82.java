package X;

import android.content.DialogInterface;

public class B82 implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public B82(C22908AyK ayK, int i) {
        this.A01 = i;
        this.A00 = ayK;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ((C22908AyK) this.A00).BTc();
    }
}
