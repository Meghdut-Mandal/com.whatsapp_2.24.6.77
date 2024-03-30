package X;

import com.whatsapp.util.Log;

/* renamed from: X.2bf  reason: invalid class name and case insensitive filesystem */
public class C46782bf extends C196019Xg {
    public final /* synthetic */ C200139gg A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ byte[] A03;

    public C46782bf(C200139gg r1, String str, byte[] bArr, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A03 = bArr;
        this.A01 = str;
    }

    public void A03(C203399nx r5) {
        if (!this.A02) {
            Log.i("ConnectionWriter/app/handle/skip-set-recovery-token");
            C200139gg r3 = this.A00;
            C36331k8.A0w(C19420v0.A00(r3.A05), "pref_deprecate_rc", true);
            C18750th.A09(r3.A04.A00);
            return;
        }
        if (!C18750th.A0E(this.A00.A04.A00, this.A01, this.A03)) {
            Log.e("ConnectionWriter/app/set-recovery-token/fail");
        }
    }
}
