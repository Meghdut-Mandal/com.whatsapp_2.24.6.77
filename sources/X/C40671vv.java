package X;

import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.1vv  reason: invalid class name and case insensitive filesystem */
public class C40671vv extends AnonymousClass0CZ {
    public final AnonymousClass01L A00;
    public final C39541sc A01;
    public final int[] A02;
    public final int[] A03;
    public final int[] A04;

    public int A0J() {
        return this.A03.length;
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r3, int i) {
        C42721zH r32 = (C42721zH) r3;
        boolean A1S = AnonymousClass000.A1S(i, C36341k9.A07(this.A01.A01));
        r32.A0B(A1S, i);
        r32.A01.setChecked(A1S);
    }

    public C40671vv(AnonymousClass01L r1, C39541sc r2, int[] iArr, int[] iArr2, int[] iArr3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = iArr;
        this.A04 = iArr2;
        this.A02 = iArr3;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        C42721zH r2 = new C42721zH(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), this.A03, this.A04, this.A02);
        this.A01.A01.A08(this.A00, r2);
        AnonymousClass3YG.A00(r2.A00, this, r2, 31);
        return r2;
    }
}
