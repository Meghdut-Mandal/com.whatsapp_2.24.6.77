package com.bloks.foa.components.bottomsheet;

import X.AnonymousClass001;
import X.AnonymousClass6Xh;
import X.AnonymousClass7eE;
import X.C011504z;
import X.C1267565j;
import X.C92414du;
import X.C97544pr;
import android.view.View;
import java.util.Collections;
import java.util.List;

public abstract class ViewDragHelper$Callback {
    public void A00(View view) {
        C92414du r3 = ((C97544pr) this).A00;
        List<C1267565j> list = r3.A0G;
        if (!list.isEmpty()) {
            for (C1267565j A00 : list) {
                A00.A00(view, r3.getHeight());
            }
        }
    }

    public void A01(View view, float f) {
        C97544pr r0 = (C97544pr) this;
        if (view != null) {
            C92414du r3 = r0.A00;
            int height = r3.getHeight();
            AnonymousClass6Xh r1 = r3.A05;
            r1.A09.abortAnimation();
            r1.A09.fling(0, 0, 0, (int) f, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            int finalY = r1.A09.getFinalY();
            r1.A09.abortAnimation();
            int top = height - (view.getTop() + finalY);
            List list = r3.A06;
            if (list == null) {
                list = Collections.emptyList();
            }
            AnonymousClass7eE A00 = C92414du.A00(view, r3, list, top, height);
            if (A00 != null) {
                r3.A04 = A00;
                int BG2 = height - A00.BG2(view, height);
                try {
                    int i = r3.A00;
                    if (r1.A0A) {
                        r1.A07.getXVelocity(r1.A02);
                        AnonymousClass6Xh.A05(r1, BG2, (int) r1.A07.getYVelocity(r1.A02), i);
                        C011504z.A05(r3);
                        return;
                    }
                    throw AnonymousClass001.A09("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
                } catch (NullPointerException unused) {
                }
            }
        }
    }
}
