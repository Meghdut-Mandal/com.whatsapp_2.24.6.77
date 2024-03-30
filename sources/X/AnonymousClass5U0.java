package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.5U0  reason: invalid class name */
public enum AnonymousClass5U0 {
    EXTRA_SMALL(R.dimen.f7nameremoved, R.dimen.f7nameremoved, R.dimen.f7nameremoved),
    SMALL(R.dimen.f7nameremoved, R.dimen.f7nameremoved, R.dimen.f7nameremoved),
    MEDIUM(R.dimen.f7nameremoved, R.dimen.f7nameremoved, R.dimen.f7nameremoved),
    LARGE(R.dimen.f7nameremoved, R.dimen.f7nameremoved, R.dimen.f7nameremoved),
    EXTRA_LARGE(R.dimen.f7nameremoved, R.dimen.f7nameremoved, R.dimen.f7nameremoved),
    EXTRA_EXTRA_LARGE(R.dimen.f7nameremoved, R.dimen.f7nameremoved, R.dimen.f7nameremoved);
    
    public final int dimension;
    public final int innerStrokeWidth;
    public final int strokeWidth;

    /* access modifiers changed from: public */
    static {
        AnonymousClass5U0[] r0;
        A00 = C000900k.A00(r0);
    }

    /* access modifiers changed from: public */
    AnonymousClass5U0(int i, int i2, int i3) {
        this.dimension = i;
        this.strokeWidth = i2;
        this.innerStrokeWidth = i3;
    }

    public final C128246Bm A00(Context context) {
        float dimension2 = context.getResources().getDimension(this.dimension);
        return new C128246Bm(new C128006Am(dimension2, dimension2), context.getResources().getDimension(this.strokeWidth), context.getResources().getDimension(this.innerStrokeWidth));
    }
}
