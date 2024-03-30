package X;

import android.app.Activity;
import com.whatsapp.mediaview.RevokeNuxDialogFragment;

/* renamed from: X.4Wo  reason: invalid class name and case insensitive filesystem */
public class C89444Wo implements C88304Se {
    public Object A00;
    public final int A01;

    public C89444Wo(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BeZ() {
        if (this.A01 != 0) {
            C36431kI.A1N(this.A00);
        } else {
            AnonymousClass3SJ.A00((Activity) this.A00, 13);
        }
    }

    public void Bgh(AnonymousClass11F r4, int i) {
        if (this.A01 != 0) {
            AnonymousClass02E r1 = (AnonymousClass02E) this.A00;
            if (r1.A12()) {
                new RevokeNuxDialogFragment(r4, i).A1i(r1.A0k(), "delete_message_dialog_fragment_tag");
                return;
            }
            return;
        }
        AnonymousClass3SJ.A01((Activity) this.A00, i);
    }
}
