package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4md  reason: invalid class name and case insensitive filesystem */
public class C96004md extends AnonymousClass0CZ {
    public int A00 = 0;
    public C135106c9 A01;
    public final C29971Ys A02;
    public final C29931Yo A03;
    public final AnonymousClass7hH A04;
    public final List A05 = AnonymousClass001.A0I();

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        C96994oE r3 = (C96994oE) r8;
        C1262563e r4 = (C1262563e) this.A05.get(i);
        r3.A0B(r4);
        r3.A0H.setOnClickListener(new C135546cs(this, r3, r4, i, 5));
    }

    public int A0J() {
        return this.A05.size();
    }

    public C96004md(C29971Ys r2, C29931Yo r3, AnonymousClass7hH r4) {
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C96994oE(C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved), this.A02, this.A03);
    }
}
