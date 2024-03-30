package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import com.whatsapp.R;

/* renamed from: X.6RA  reason: invalid class name */
public abstract class AnonymousClass6RA {
    public static final PointF A00(Context context, C108525Tv r4, AnonymousClass5TY r5) {
        float f;
        Resources resources;
        int i;
        Resources resources2;
        int i2;
        AnonymousClass00C.A0D(r5, 0);
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            int ordinal2 = r5.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    return new PointF(0.0f, 0.0f);
                }
                resources2 = context.getResources();
                i2 = R.dimen.f7nameremoved;
                f = resources2.getDimension(i2);
                resources = context.getResources();
                i = R.dimen.f7nameremoved;
                return new PointF(f, resources.getDimension(i));
            }
        } else if (ordinal == 1) {
            switch (r5.ordinal()) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                case 3:
                case 4:
                    resources2 = context.getResources();
                    i2 = R.dimen.f7nameremoved;
                    break;
                case 5:
                    f = context.getResources().getDimension(R.dimen.f7nameremoved);
                    resources = context.getResources();
                    i = R.dimen.f7nameremoved;
                    break;
                default:
                    throw C36441kJ.A18();
            }
        } else {
            throw C36441kJ.A18();
        }
        f = context.getResources().getDimension(R.dimen.f7nameremoved);
        resources = context.getResources();
        i = R.dimen.f7nameremoved;
        return new PointF(f, resources.getDimension(i));
    }

    public static final AnonymousClass61O A01(Context context, AnonymousClass5TY r2) {
        float f = A02(r2).A00(context).A01;
        switch (r2.ordinal()) {
            case 0:
                return new AnonymousClass5QA(f);
            case 1:
            case 2:
            case 3:
                return new AnonymousClass5QD(f);
            case 4:
                return new AnonymousClass5QC(f);
            case 5:
                return new AnonymousClass5QB(f);
            default:
                throw C36441kJ.A18();
        }
    }

    public static final AnonymousClass5U0 A02(AnonymousClass5TY r0) {
        switch (r0.ordinal()) {
            case 0:
                return AnonymousClass5U0.EXTRA_SMALL;
            case 1:
                return AnonymousClass5U0.SMALL;
            case 2:
                return AnonymousClass5U0.MEDIUM;
            case 3:
                return AnonymousClass5U0.LARGE;
            case 4:
                return AnonymousClass5U0.EXTRA_LARGE;
            case 5:
                return AnonymousClass5U0.EXTRA_EXTRA_LARGE;
            default:
                throw C36441kJ.A18();
        }
    }
}
