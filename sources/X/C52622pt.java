package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.2pt  reason: invalid class name and case insensitive filesystem */
public enum C52622pt {
    EXPLORE(1),
    TRENDING(2),
    FEATURED(3),
    NEW(4),
    POPULAR(5),
    COUNTRY(6);
    
    public final int value;

    /* access modifiers changed from: public */
    static {
        C52622pt[] r0;
        A00 = C000900k.A00(r0);
    }

    /* access modifiers changed from: public */
    C52622pt(int i) {
        this.value = i;
    }

    public final String A00() {
        switch (ordinal()) {
            case 0:
                return "explore";
            case 1:
                return "most_active";
            case 2:
                return "featured";
            case 3:
                return "new";
            case 4:
                return "popular";
            case 5:
                return "region";
            case 6:
                return "discovery";
            default:
                throw C36441kJ.A18();
        }
    }

    public final String A01(Context context) {
        int i;
        switch (ordinal()) {
            case 0:
                i = R.string.f12nameremoved;
                break;
            case 1:
                i = R.string.f12nameremoved;
                break;
            case 2:
                i = R.string.f12nameremoved;
                break;
            case 3:
                i = R.string.f12nameremoved;
                break;
            case 4:
                i = R.string.f12nameremoved;
                break;
            case 5:
                i = R.string.f12nameremoved;
                break;
            case 6:
                return "⭐ Discover";
            default:
                throw C36441kJ.A18();
        }
        return C36361kB.A0m(context, i);
    }
}
