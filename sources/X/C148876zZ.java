package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.6zZ  reason: invalid class name and case insensitive filesystem */
public class C148876zZ implements C160197kc {
    public final /* synthetic */ C96144mr A00;
    public final /* synthetic */ C96714nm A01;

    public void BZt() {
    }

    public void Bj4() {
    }

    public C148876zZ(C96144mr r1, C96714nm r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Bj5(Bitmap bitmap) {
        C96144mr r1 = this.A00;
        int A04 = this.A01.A04();
        List A002 = C96144mr.A00(r1);
        if (A04 >= 0 && A04 < A002.size()) {
            ((AnonymousClass6CV) A002.get(A04)).A01 = true;
        }
    }
}
