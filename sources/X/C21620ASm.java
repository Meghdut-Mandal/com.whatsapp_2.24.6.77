package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;

/* renamed from: X.ASm  reason: case insensitive filesystem */
public class C21620ASm implements B6D {
    public final C19700wN A00;

    public C21620ASm(C19700wN r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final boolean BN1(AnonymousClass3T1 r2) {
        return false;
    }

    private final void A00(AnonymousClass3T1 r4, String str) {
        if (!(this instanceof C182158od)) {
            this.A00.A0E(str, String.valueOf(r4.A1I), false);
        }
    }

    public CharSequence BGP(Context context, Paint paint, AnonymousClass3T1 r4) {
        if (this instanceof C182158od) {
            return null;
        }
        AnonymousClass00C.A0D(r4, 2);
        A00(r4, "reply-unsupported-render-text");
        return null;
    }

    public boolean BN0(AnonymousClass3T1 r2) {
        if (this instanceof C182158od) {
            return true;
        }
        return false;
    }

    public void Bo8(View view, C201709k9 r4, AnonymousClass3T1 r5, AnonymousClass3JO r6) {
        if (this instanceof C182158od) {
            C36321k7.A11(view, r6, r4);
            r4.A08(view, r5);
            r4.A07(view, r5);
            return;
        }
        A00(r5, "reply-unsupported-render-content");
    }

    public void Bo9(View view, C201709k9 r3, AnonymousClass3T1 r4, AnonymousClass3JO r5) {
        if (!(this instanceof C182158od)) {
            A00(r4, "reply-unsupported-render-thumb");
        }
    }
}
