package X;

import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.6xU  reason: invalid class name and case insensitive filesystem */
public final class C147606xU implements AnonymousClass4TU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass6WF A01;
    public final /* synthetic */ C23871Ae A02;
    public final /* synthetic */ AnonymousClass1HC A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ WeakReference A05;
    public final /* synthetic */ boolean A06;

    public void onFailure(Exception exc) {
        AnonymousClass00C.A0D(exc, 0);
        Log.e("Failed to create an avatar user:", exc);
        AnonymousClass1HC r2 = this.A03;
        int i = this.A00;
        r2.A01(i, "user_creation_failed");
        r2.A02(C52322pF.FAIL, i);
        this.A01.A02.set(false);
        this.A02.A04(C36361kB.A0i(), exc.getMessage(), 7, this.A06);
        C225314u A002 = AnonymousClass6WF.A00(this.A05);
        if (A002 == null) {
            Log.e("Unable to obtain Activity reference.");
            return;
        }
        A002.Bnv();
        AnonymousClass6WF.A02(A002, new C107325Nq(exc));
    }

    public C147606xU(AnonymousClass6WF r1, C23871Ae r2, AnonymousClass1HC r3, String str, WeakReference weakReference, int i, boolean z) {
        this.A03 = r3;
        this.A00 = i;
        this.A01 = r1;
        this.A05 = weakReference;
        this.A02 = r2;
        this.A04 = str;
        this.A06 = z;
    }

    public void onSuccess() {
        AnonymousClass1HC r2 = this.A03;
        int i = this.A00;
        r2.A01(i, "user_created");
        AnonymousClass6WF.A03(this.A01, this.A02, r2, this.A04, this.A05, i, this.A06);
    }
}
