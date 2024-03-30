package X;

import com.whatsapp.util.Log;

/* renamed from: X.AEm  reason: case insensitive filesystem */
public class C21256AEm implements B1Q {
    public final /* synthetic */ C198129cx A00;
    public final /* synthetic */ B1P A01;
    public final /* synthetic */ String A02;

    public C21256AEm(C198129cx r1, B1P b1p, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = b1p;
    }

    public void Bdl(C202059ky r2) {
        Log.e("PAY: BrazilPayBloksActivity/provider key iq returned null");
        this.A01.BZW(r2);
    }

    public void Bdm(AF3 af3) {
        C198129cx.A00(this.A00, this.A01, af3, this.A02);
    }
}
