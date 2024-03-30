package X;

import com.google.android.gms.tasks.OnFailureListener;

public class B9C implements OnFailureListener {
    public Object A00;
    public final int A01;

    public B9C(AnonymousClass9XW r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final void onFailure(Exception exc) {
        if (this.A01 != 0) {
            AnonymousClass9XW r3 = (AnonymousClass9XW) this.A00;
            C36321k7.A1K(exc, "RecaptchaClientHandler/execute failed with exception: ", C36401kF.A0t(exc, 1));
            r3.A08.A01(C188648zz.A0H, "onFailure", exc);
            r3.A03 = exc;
            r3.A02 = C188258zI.FETCH_FAILED;
            r3.A09.A01("RECAPTCHA_EXECUTE_", "ERROR");
            return;
        }
        AnonymousClass9XW r4 = (AnonymousClass9XW) this.A00;
        boolean A1V = C36371kC.A1V(exc);
        C36321k7.A1J(exc, "RecaptchaClientHandler/OnFailureListener/", AnonymousClass000.A0u());
        r4.A08.A01(C188648zz.A0I, "onFailure", exc);
        r4.A03 = exc;
        r4.A02 = C188258zI.INIT_FAILED;
        r4.A09.A01("RECAPTCHA_INIT_", "ERROR");
        r4.A04.set(A1V);
    }
}
