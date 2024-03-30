package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.6PU  reason: invalid class name */
public final class AnonymousClass6PU {
    public AnonymousClass17Y A00;
    public AnonymousClass1RU A01;
    public C19420v0 A02;
    public AnonymousClass3DK A03;
    public AnonymousClass6OJ A04;
    public C31081bF A05;
    public C19770wU A06;

    public final void A01(Context context, String str, int i, boolean z) {
        C19420v0 r0 = this.A02;
        if (r0 != null) {
            String A0t = C36371kC.A0t(C36341k9.A0E(r0), "c2dm_reg_id");
            C19420v0 r02 = this.A02;
            if (r02 != null) {
                C36341k9.A0x(C19420v0.A00(r02), "abandon_add_account_landing_screen", str);
                Context context2 = context;
                int i2 = i;
                boolean z2 = z;
                if (A0t == null) {
                    Log.i("AddAccountNavigator/executeAddAccountFlow/pushId is null");
                    A00(context, this, i, z);
                    return;
                }
                Log.i("AddAccountNavigator/executeAddAccountFlow/pushId is not null");
                AnonymousClass5WU r5 = new AnonymousClass5WU(this, 1);
                Log.i("AddAccountNavigator/updatePushConfigForCurrentAccount");
                C19770wU r03 = this.A06;
                if (r03 != null) {
                    r03.Boy(new C1498873d(context2, this, A0t, r5, i2, z2));
                    return;
                }
                throw C36321k7.A08();
            }
            throw C36331k8.A0d("waSharedPreferences");
        }
        throw C36331k8.A0d("waSharedPreferences");
    }

    public static final void A00(Context context, AnonymousClass6PU r9, int i, boolean z) {
        AnonymousClass1RU r0 = r9.A01;
        if (r0 == null) {
            throw C36331k8.A0d("accountSwitcher");
        } else if (r0.A0E(context, (String) null, (String) null, (AnonymousClass00S) null, i, true, false, z)) {
            C19420v0 r1 = r9.A02;
            if (r1 != null) {
                AnonymousClass1RU r02 = r9.A01;
                if (r02 != null) {
                    r1.A1D(r02.A09.A0I() + 1);
                    return;
                }
                throw C36331k8.A0d("accountSwitcher");
            }
            throw C36331k8.A0d("waSharedPreferences");
        }
    }
}
