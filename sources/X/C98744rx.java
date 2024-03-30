package X;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.4rx  reason: invalid class name and case insensitive filesystem */
public class C98744rx extends C07590Yl {
    public C98744rx(Context context) {
        super(context, (C17370rB) C17370rB.A00, AnonymousClass9B2.A01, (C15920oE) new C10270dy());
    }

    public void A04(AnonymousClass6JN r6) {
        AnonymousClass006.A02(r6, "Listener must not be null");
        AnonymousClass006.A05("LocationCallback", "Listener type must not be empty");
        AnonymousClass0UL r1 = new AnonymousClass0UL(r6, "LocationCallback");
        C07720Za r0 = this.A07;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AnonymousClass000.A14(r0.A06, new C06220St(this, new C04140Jk(r1, taskCompletionSource), r0.A0C.get()), 13);
        taskCompletionSource.zza.continueWith(new C10650ee());
    }
}
