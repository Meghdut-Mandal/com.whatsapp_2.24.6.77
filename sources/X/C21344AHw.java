package X;

import android.util.Base64;

/* renamed from: X.AHw  reason: case insensitive filesystem */
public class C21344AHw implements C236119d {
    public final /* synthetic */ C29251Vx A00;
    public final /* synthetic */ C35911jS A01;
    public final /* synthetic */ String A02;

    public void BWw(C203399nx r1, String str) {
    }

    public C21344AHw(C29251Vx r1, C35911jS r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public void BVN(String str) {
        this.A00.A02.compareAndSet((Object) null, this.A02);
    }

    public void BiM(C203399nx r6, String str) {
        C203539oF.A0B(r6, C23213B9v.A00(C90514aH.A0e(r6, this.A01), 49));
        C184078rr r0 = (C184078rr) C203379ns.A01(r6, C21592ARk.A00);
        if (r0 != null) {
            C29251Vx r4 = this.A00;
            C19420v0 r3 = r4.A01;
            C36341k9.A0x(C19420v0.A00(r3), "pref_client_auth_token", Base64.encodeToString((byte[]) r0.A00, 3));
            r4.A00.A00();
        }
    }
}
