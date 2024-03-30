package X;

import com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity;
import com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetViewModel;

/* renamed from: X.7pb  reason: invalid class name and case insensitive filesystem */
public class C163067pb implements AnonymousClass4QP {
    public Object A00;
    public final int A01;

    public C163067pb(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BRa(int i) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            C36341k9.A16(((BloksCDSBottomSheetViewModel) ((BloksCDSBottomSheetActivity) obj).A04.getValue()).A00, i);
        } else {
            VerifyPasswordFragment.A00((VerifyPasswordFragment) obj, i);
        }
    }
}
