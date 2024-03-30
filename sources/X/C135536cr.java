package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.calling.fragment.CallConfirmationFragment;

/* renamed from: X.6cr  reason: invalid class name and case insensitive filesystem */
public class C135536cr implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public C135536cr(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = z;
    }

    public final void onClick(View view) {
        if (this.A04 != 0) {
            CallConfirmationFragment callConfirmationFragment = (CallConfirmationFragment) this.A00;
            CallConfirmationFragment.A03((Activity) this.A01, callConfirmationFragment, (AnonymousClass141) this.A02, this.A03);
            callConfirmationFragment.A1c();
            return;
        }
        AnonymousClass6NO r0 = (AnonymousClass6NO) this.A00;
        C134606bJ r3 = (C134606bJ) this.A02;
        boolean z = this.A03;
        C65443Sb.A01(C129366Gq.A00(r3, (C134746bX) this.A01, r0.A00, z), r0.A04);
    }
}
