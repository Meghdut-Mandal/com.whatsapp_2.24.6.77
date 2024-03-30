package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.746  reason: invalid class name */
public class AnonymousClass746 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public String A07;
    public final int A08;

    public AnonymousClass746(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i, int i2) {
        this.A08 = i2;
        this.A04 = obj;
        this.A03 = obj2;
        this.A07 = str;
        this.A06 = obj3;
        this.A01 = obj4;
        this.A05 = obj5;
        this.A00 = i;
        this.A02 = obj6;
    }

    public final void run() {
        if (this.A08 != 0) {
            C107195Mx r0 = (C107195Mx) this.A01;
            C65013Qj r7 = (C65013Qj) this.A02;
            int i = this.A00;
            String str = this.A07;
            List list = (List) this.A03;
            List list2 = (List) this.A04;
            Uri uri = (Uri) this.A05;
            byte[] bArr = (byte[]) this.A06;
            AnonymousClass1D5 r5 = r0.A0C;
            List list3 = r0.A0Q;
            if (r0.A0X) {
                int i2 = i;
                i = 42;
                if (i2 == 3) {
                    i = 43;
                }
            }
            int A002 = C107195Mx.A00(r0, r0.A00);
            AnonymousClass3SC A042 = r5.A04((Uri) null, r7, r0.A08, r0.A0J, str, list3, list, list2, i, A002, 0, r0.A0S);
            A042.A00 = r0.A0P.size();
            C158477gz r52 = r0.A0F;
            if (r52 != null) {
                Iterator A12 = C90514aH.A12(A042.A02);
                while (A12.hasNext()) {
                    r52.BmH(uri, C36391kE.A0l(A12));
                }
            }
            r0.A05.A0b(A042, bArr, r0.A0U, r0.A0V);
            return;
        }
        DialogFragment dialogFragment = (DialogFragment) this.A03;
        String str2 = this.A07;
        C128926Ed A012 = C132876Vp.A01((Context) this.A04, dialogFragment, (C23087B3x) this.A06, (AnonymousClass6XK) this.A05, (C16140og) this.A01, str2);
        BkCdsBottomSheetFragment bkCdsBottomSheetFragment = (BkCdsBottomSheetFragment) dialogFragment;
        int i3 = this.A00;
        C139036j8 A032 = BkCdsBottomSheetFragment.A03(bkCdsBottomSheetFragment);
        C139036j8.A02(bkCdsBottomSheetFragment.A0a(), A032, A012, (AnonymousClass7fM) this.A02, C023109s.A00, i3);
    }
}
