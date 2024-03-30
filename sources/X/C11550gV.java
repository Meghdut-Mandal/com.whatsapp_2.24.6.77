package X;

import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.0gV  reason: invalid class name and case insensitive filesystem */
public final class C11550gV implements Runnable {
    public final /* synthetic */ AnonymousClass0L0 A00;
    public final /* synthetic */ C10400eB A01;

    public C11550gV(AnonymousClass0L0 r1, C10400eB r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        Set emptySet;
        IAccountAccessor iAccountAccessor;
        C10400eB r2 = this.A01;
        C10350e6 r5 = (C10350e6) r2.A05.A09.get(r2.A04);
        if (r5 != null) {
            AnonymousClass0L0 r1 = this.A00;
            if (AnonymousClass000.A1Q(r1.A01)) {
                r2.A02 = true;
                C17590rf r3 = r2.A03;
                if (!r3.BoS()) {
                    try {
                        C04270Jz r12 = (C04270Jz) r3;
                        if (r12.BoS()) {
                            emptySet = r12.A01;
                        } else {
                            emptySet = Collections.emptySet();
                        }
                        r3.BGd((IAccountAccessor) null, emptySet);
                    } catch (SecurityException e) {
                        Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                        r3.B5Y("Failed to get service from broker.");
                        r5.A0B(new AnonymousClass0L0(10), (Exception) null);
                    }
                } else if (r2.A02 && (iAccountAccessor = r2.A00) != null) {
                    r3.BGd(iAccountAccessor, r2.A01);
                }
            } else {
                r5.A0B(r1, (Exception) null);
            }
        }
    }
}
