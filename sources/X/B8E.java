package X;

import android.content.DialogInterface;
import com.whatsapp.R;

public class B8E implements DialogInterface.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public B8E(int i, String str, Object obj) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A02 != 0) {
            String str = this.A01;
            C165577te.A1C(((C202199lE) this.A00).A0I, C36371kC.A0n(), "prompt_warn_setup_without_recover", str);
            return;
        }
        C178788hM r5 = (C178788hM) this.A00;
        String str2 = this.A01;
        C178888i4 r3 = r5.A04;
        r3.Bu1(R.string.f12nameremoved);
        ((C178868i1) r3).A3m(new C179198jP(r5, r3, str2), r3.A04.A0A, str2);
    }
}
