package X;

import android.content.DialogInterface;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.7p3  reason: invalid class name and case insensitive filesystem */
public class C162727p3 extends AnonymousClass3FU {
    public Object A00;
    public final int A01;

    public C162727p3(VoipActivityV2 voipActivityV2, int i) {
        this.A01 = i;
        this.A00 = voipActivityV2;
    }

    public void A00() {
        if (1 - this.A01 != 0) {
            super.A00();
        } else {
            VoipActivityV2.A12((VoipActivityV2) this.A00);
        }
    }

    public void A01(DialogInterface dialogInterface) {
        if (this.A01 != 0) {
            super.A01(dialogInterface);
            return;
        }
        dialogInterface.dismiss();
        ((VoipActivityV2) this.A00).finish();
    }
}
