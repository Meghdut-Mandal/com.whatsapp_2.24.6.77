package X;

import com.whatsapp.search.SearchViewModel;

/* renamed from: X.6iL  reason: invalid class name and case insensitive filesystem */
public class C138576iL implements C02860Ce {
    public int A00 = -1;
    public final AnonymousClass0CZ A01;
    public final /* synthetic */ C96154ms A02;

    public C138576iL(AnonymousClass0CZ r2, C96154ms r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BTI(Object obj, int i, int i2) {
        this.A01.A01.A04(obj, i, i2);
    }

    public void BZE(int i, int i2) {
        int i3 = this.A00;
        if (i3 == -1 || i3 >= i) {
            this.A00 = i;
            if (i == 0) {
                SearchViewModel searchViewModel = this.A02.A0P;
                C001700s r1 = searchViewModel.A0h;
                if (r1.A04() == null || C36341k9.A07(r1) == 0) {
                    C36341k9.A16(searchViewModel.A16, 0);
                }
            }
        }
        this.A01.A01.A02(i, i2);
    }

    public void BbD(int i, int i2) {
        this.A01.A01.A01(i, i2);
    }

    public void Beb(int i, int i2) {
        this.A01.A01.A03(i, i2);
    }
}
