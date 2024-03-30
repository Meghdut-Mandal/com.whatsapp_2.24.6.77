package X;

import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onGifSelected$1;
import com.whatsapp.expressionstray.gifs.GifExpressionsFragment;
import com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel;
import com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel$onGifSelected$1;

/* renamed from: X.5SQ  reason: invalid class name */
public class AnonymousClass5SQ implements C87794Qe {
    public Object A00;
    public final int A01;

    public AnonymousClass5SQ(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BYd(AnonymousClass3XU r5) {
        AnonymousClass040 A002;
        C009003v gifExpressionsSearchViewModel$onGifSelected$1;
        int i = this.A01;
        AnonymousClass00C.A0D(r5, 0);
        Object obj = this.A00;
        if (i != 0) {
            C87794Qe r0 = ((C96174mu) obj).A00;
            if (r0 != null) {
                r0.BYd(r5);
                return;
            }
            return;
        }
        GifExpressionsFragment gifExpressionsFragment = (GifExpressionsFragment) obj;
        ExpressionsSearchViewModel expressionsSearchViewModel = gifExpressionsFragment.A05;
        if (expressionsSearchViewModel != null) {
            A002 = C109325Xd.A00(expressionsSearchViewModel);
            gifExpressionsSearchViewModel$onGifSelected$1 = new ExpressionsSearchViewModel$onGifSelected$1(expressionsSearchViewModel, r5, (C023509x) null);
        } else {
            GifExpressionsSearchViewModel gifExpressionsSearchViewModel = (GifExpressionsSearchViewModel) gifExpressionsFragment.A0B.getValue();
            A002 = C109325Xd.A00(gifExpressionsSearchViewModel);
            gifExpressionsSearchViewModel$onGifSelected$1 = new GifExpressionsSearchViewModel$onGifSelected$1(gifExpressionsSearchViewModel, r5, (C023509x) null);
        }
        C36331k8.A1T(gifExpressionsSearchViewModel$onGifSelected$1, A002);
    }
}
