package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.6ya  reason: invalid class name and case insensitive filesystem */
public final class C148266ya implements C159677jk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass6PU A02;
    public final /* synthetic */ C019408g A03;
    public final /* synthetic */ boolean A04;

    public C148266ya(Context context, AnonymousClass6PU r2, C019408g r3, int i, boolean z) {
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = context;
        this.A00 = i;
        this.A04 = z;
    }

    public void BXH() {
        Log.e("AddAccountNavigator/updatePushConfigForCurrentAccount/sendClientConfigCallback/failed");
        AnonymousClass6PU r3 = this.A02;
        AnonymousClass17Y r2 = r3.A00;
        if (r2 != null) {
            r2.A0H(AnonymousClass74N.A00(r3, this.A01, 47));
            return;
        }
        throw C36321k7.A06();
    }

    public void onSuccess() {
        Log.i("AddAccountNavigator/updatePushConfigForCurrentAccount/sendClientConfigCallback/success");
        AnonymousClass6PU r2 = this.A02;
        AnonymousClass17Y r0 = r2.A00;
        if (r0 != null) {
            r0.A0H(new C1498673b(r2, this.A03, this.A01, this.A00, 0, this.A04));
            return;
        }
        throw C36321k7.A06();
    }
}
