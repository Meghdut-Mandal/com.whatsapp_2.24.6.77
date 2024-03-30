package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.3Qz  reason: invalid class name and case insensitive filesystem */
public class C65163Qz implements AnonymousClass4RW {
    public Object A00;
    public final int A01;

    public C65163Qz(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BfH(String str, int i) {
        String str2 = str;
        if (this.A01 != 0) {
            C47072cl r4 = (C47072cl) this.A00;
            if (!r4.BLh()) {
                r4.A0X = false;
                r4.Bnv();
                if (i != 0) {
                    if (i == 1) {
                        C65683Tb.A03((AnonymousClass3L0) null, (C131626Pu) null, r4.A0K, (AnonymousClass39R) null, (Boolean) null, 1, 3, C65683Tb.A04(str));
                    } else if (i != 2 || r4.A3l(str, false, 3)) {
                        return;
                    }
                    C64783Pk r1 = r4.A0Q;
                    r1.A05.Btl(C36391kE.A0n(6), "qr_code_scanning_dialog_fragment_tag");
                } else {
                    C39001qm A002 = AnonymousClass3LW.A00(r4);
                    A002.setPositiveButton(R.string.f12nameremoved, (DialogInterface.OnClickListener) null);
                    A002.A0K(R.string.f12nameremoved);
                    A002.A0V(new C89914Yj(r4, 3));
                    C36341k9.A11(A002);
                }
                r4.A0Q.A0e = true;
                return;
            }
            return;
        }
        MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
        if (i == 2) {
            mediaViewFragment.A1X.A01(2);
            Bundle bundle = mediaViewFragment.A0A;
            if (mediaViewFragment.A1W != null && bundle != null && str != null) {
                mediaViewFragment.A1W.A02(AnonymousClass3UJ.A03(bundle, ""), str2, 3, false, false);
                return;
            }
            return;
        }
        mediaViewFragment.A1X.A01(3);
    }
}
