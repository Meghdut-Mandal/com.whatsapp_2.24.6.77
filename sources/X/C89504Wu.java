package X;

import androidx.fragment.app.DialogFragment;

/* renamed from: X.4Wu  reason: invalid class name and case insensitive filesystem */
public class C89504Wu implements AnonymousClass4SI {
    public Object A00;
    public final int A01;

    public C89504Wu(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void B04(Object obj, Object obj2) {
        int i = this.A01;
        C225314u r1 = (C225314u) this.A00;
        DialogFragment dialogFragment = (DialogFragment) obj;
        if (2 - i != 0) {
            r1.Btl(dialogFragment, (String) null);
        } else {
            r1.Btn(dialogFragment, (String) null);
        }
    }
}
