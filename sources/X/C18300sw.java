package X;

import android.content.DialogInterface;
import com.whatsapp.Main;

/* renamed from: X.0sw  reason: invalid class name and case insensitive filesystem */
public class C18300sw implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public C18300sw(Main main, int i) {
        this.A01 = i;
        this.A00 = main;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A01 != 0) {
            ((Main) this.A00).A3p();
        } else {
            ((Main) this.A00).A3o();
        }
    }
}
