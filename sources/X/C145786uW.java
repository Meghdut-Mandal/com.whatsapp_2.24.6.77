package X;

import com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel;

/* renamed from: X.6uW  reason: invalid class name and case insensitive filesystem */
public final class C145786uW implements C158277gf {
    public final /* synthetic */ GifExpressionsSearchViewModel A00;

    public C145786uW(GifExpressionsSearchViewModel gifExpressionsSearchViewModel) {
        this.A00 = gifExpressionsSearchViewModel;
    }

    public void BfP(AnonymousClass67Z r3) {
        GifExpressionsSearchViewModel gifExpressionsSearchViewModel;
        Object obj;
        int size = r3.A04.size();
        boolean z = r3.A01;
        if (size == 0) {
            gifExpressionsSearchViewModel = this.A00;
            if (!z) {
                obj = C176218bl.A00;
            } else {
                obj = C176248bo.A00;
            }
        } else if (!z) {
            gifExpressionsSearchViewModel = this.A00;
            obj = C176228bm.A00;
        } else {
            return;
        }
        gifExpressionsSearchViewModel.A02.A0D(obj);
    }
}
