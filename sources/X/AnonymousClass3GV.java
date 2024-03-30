package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.3GV  reason: invalid class name */
public final class AnonymousClass3GV {
    public int A00;
    public int A01;
    public final Context A02;

    public AnonymousClass3GV(Context context, C51112nI r5) {
        int i;
        AnonymousClass00C.A0D(r5, 2);
        this.A02 = context;
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            this.A00 = R.color.f6nameremoved;
            i = R.color.f6nameremoved;
        } else if (ordinal == 1) {
            this.A00 = R.color.f6nameremoved;
            i = R.color.f6nameremoved;
        } else {
            return;
        }
        this.A01 = i;
    }

    public final Drawable A00(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Drawable A012 = AnonymousClass08I.A01(drawable.mutate());
        AnonymousClass00C.A08(A012);
        AnonymousClass076.A06(A012, AnonymousClass00F.A00(this.A02, R.color.f6nameremoved));
        return A012;
    }

    public final C012505l A01() {
        Context context = this.A02;
        float dimension = context.getResources().getDimension(R.dimen.f7nameremoved);
        AnonymousClass06M r1 = new AnonymousClass06M();
        r1.A01(dimension);
        C012505l r12 = new C012505l(new AnonymousClass06J(r1));
        r12.A0C(AnonymousClass00F.A04(context, this.A01));
        return r12;
    }
}
