package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1vl  reason: invalid class name and case insensitive filesystem */
public final class C40571vl extends AnonymousClass0CZ {
    public Bitmap A00;
    public List A01;
    public final C87054Nh A02;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C42111yI(C36371kC.A0I(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved));
    }

    public int A0J() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r6, int i) {
        C42111yI r62 = (C42111yI) r6;
        AnonymousClass00C.A0D(r62, 0);
        C80153uw r4 = (C80153uw) this.A01.get(i);
        Bitmap bitmap = this.A00;
        C87054Nh r2 = this.A02;
        StringBuilder A0t = C36401kF.A0t(r4, 0);
        A0t.append('/');
        r62.A01.setText(AnonymousClass000.A0q(r4.A01, A0t));
        r62.A02.setText(r4.A00);
        r62.A00.setImageBitmap(bitmap);
        C67113Yo.A00(r62.A0H, r2, r62, r4, 8);
    }

    public C40571vl(Bitmap bitmap, C87054Nh r2, List list) {
        this.A01 = list;
        this.A00 = bitmap;
        this.A02 = r2;
    }
}
