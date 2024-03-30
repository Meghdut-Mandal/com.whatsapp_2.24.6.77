package X;

import com.bloks.stdlib.components.bkcomponentstooltip.BKBloksComponentsTooltipChildrenKeyOverride;
import com.bloks.stdlib.components.bkcomponentstooltipcontainer.BKBloksComponentsTooltipContainerChildrenKeyOverride;

/* renamed from: X.6Sg  reason: invalid class name and case insensitive filesystem */
public class C132126Sg {
    public final C132536Ue A00;
    public final C132376Ti A01;

    public int A00(C140456lc r3) {
        int i = r3.A04;
        if (i == 13504) {
            return 32;
        }
        if (i == 13327) {
            return 35;
        }
        if (i == 13708) {
            return BKBloksComponentsTooltipChildrenKeyOverride.getChildrenKeyForComponent(r3);
        }
        if (i == 14093) {
            return 36;
        }
        if (i == 16444) {
            return BKBloksComponentsTooltipContainerChildrenKeyOverride.getChildrenKeyForComponent(r3);
        }
        return 32;
    }

    public C132126Sg(C132536Ue r1, C132376Ti r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public C132126Sg() {
    }
}
