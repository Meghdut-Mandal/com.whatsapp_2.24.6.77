package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Movie;
import java.util.List;

/* renamed from: X.63I  reason: invalid class name */
public final class AnonymousClass63I {
    public int A00;
    public Movie A01;
    public AU0 A02;
    public List A03;

    public AU0 A00() {
        int i;
        Movie movie = this.A01;
        List list = this.A03;
        if (movie == null || list == null || list.size() <= (i = this.A00)) {
            return null;
        }
        C122125uL r0 = (C122125uL) list.get(i);
        Bitmap A09 = C90524aI.A09(r0.A03, r0.A01);
        AnonymousClass00C.A08(A09);
        Canvas A0A = C90524aI.A0A(A09);
        A09.eraseColor(0);
        movie.draw(A0A, 0.0f, 0.0f);
        return new AU0(AU0.A04, (C22868AxN) C139586k8.A00, (Object) A09);
    }
}
