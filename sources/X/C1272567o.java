package X;

import android.content.Context;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.67o  reason: invalid class name and case insensitive filesystem */
public final class C1272567o {
    public String A00;
    public String A01;
    public String A02 = "BACK";
    public final AnonymousClass17Y A03;
    public final C19630wG A04;
    public final C18820ts A05;

    public final void A01(Context context, Toolbar toolbar, C158737hz r10, String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        if (str3 == null) {
            str3 = "BACK";
        }
        this.A02 = str3;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WA Flows :  setFdsBackState - Thread name ");
        C36321k7.A1Z(A0u, Thread.currentThread().getName());
        this.A03.A0H(new AnonymousClass73N(this, toolbar, context, r10, 16));
    }

    public final C100744vb A00() {
        if (AnonymousClass00C.A0J(this.A02, "NONE")) {
            return null;
        }
        C18820ts r3 = this.A05;
        Context context = this.A04.A00;
        boolean A0J = AnonymousClass00C.A0J(this.A02, "CLOSE");
        int i = R.drawable.vec_ic_back_24;
        if (A0J) {
            i = R.drawable.vec_ic_close_24;
        }
        return C91364bt.A00(context, r3, i);
    }

    public C1272567o(AnonymousClass17Y r2, C19630wG r3, C18820ts r4) {
        C36321k7.A11(r2, r3, r4);
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
    }
}
