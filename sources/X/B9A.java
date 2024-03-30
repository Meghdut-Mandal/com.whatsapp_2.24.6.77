package X;

import com.google.android.gms.tasks.OnFailureListener;

public class B9A implements OnFailureListener {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public B9A(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = str;
        this.A01 = obj;
    }

    public final void onFailure(Exception exc) {
        int i = this.A03;
        C200079gZ r6 = (C200079gZ) this.A00;
        String str = this.A02;
        Object obj = this.A01;
        if (i != 0) {
            C36321k7.A0y(str, exc);
            C26151Jb r3 = r6.A03;
            C188648zz r2 = C188648zz.A09;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("on_failure_exception");
            r3.A01(r2, AnonymousClass000.A0q(C200079gZ.A00(exc), A0u), exc);
            r6.A04.A01(str, "_FAILURE");
            ((B1A) obj).onFailure(exc);
            return;
        }
        B19 b19 = (B19) obj;
        C36321k7.A0y(str, exc);
        C36321k7.A1L(exc, "GPIA prepare() failed to complete: ", AnonymousClass000.A0u());
        C26151Jb r32 = r6.A03;
        C188648zz r22 = C188648zz.A08;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("on_failure_exception");
        r32.A01(r22, AnonymousClass000.A0q(C200079gZ.A00(exc), A0u2), exc);
        r6.A04.A01(str, "_FAILURE");
        if (b19 != null) {
            b19.onFailure(exc);
        }
    }
}
