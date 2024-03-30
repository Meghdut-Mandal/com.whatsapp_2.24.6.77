package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.6qZ  reason: invalid class name and case insensitive filesystem */
public final class C143446qZ implements C23066B2s {
    public final Context A00;

    public C143446qZ(Context context) {
        AnonymousClass00C.A0D(context, 1);
        this.A00 = context;
    }

    public Drawable BCb() {
        Drawable A0H = C36381kD.A0H(this.A00, R.drawable.balloon_incoming_normal);
        AnonymousClass00C.A08(A0H);
        return A0H;
    }

    public Drawable BCc() {
        Drawable A0H = C36381kD.A0H(this.A00, R.drawable.balloon_incoming_normal_ext);
        AnonymousClass00C.A08(A0H);
        return A0H;
    }

    public Drawable BEk() {
        Drawable A0H = C36381kD.A0H(this.A00, R.drawable.balloon_outgoing_normal);
        AnonymousClass00C.A08(A0H);
        return A0H;
    }

    public Drawable BEl() {
        Drawable A0H = C36381kD.A0H(this.A00, R.drawable.balloon_outgoing_normal_ext);
        AnonymousClass00C.A08(A0H);
        return A0H;
    }
}
