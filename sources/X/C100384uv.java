package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4uv  reason: invalid class name and case insensitive filesystem */
public final class C100384uv extends C98174r0 {
    public SeekBar.OnSeekBarChangeListener A00;
    public C93214g9 A01;

    public /* bridge */ /* synthetic */ Object B4O(Context context) {
        AnonymousClass00C.A0D(context, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        C90474aD.A0z(frameLayout);
        frameLayout.addView(new C93214g9(context));
        return frameLayout;
    }

    public static final void A01(List list) {
        ArrayList A0J = C36321k7.A0J(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            if (A0C != null) {
                A0J.add(AnonymousClass099.A0F("/value", A0C));
            } else {
                throw C36381kD.A0l();
            }
        }
        C118195nU r0 = C118195nU.A01;
        if (r0 == null) {
            r0 = new C118195nU();
            C118195nU.A01 = r0;
        }
        Iterator it2 = r0.A00.iterator();
        if (it2.hasNext()) {
            it2.next();
            throw AnonymousClass001.A0A("onParametricSliderMoveEvent");
        }
    }

    public C100384uv(C1271967i r1, C140456lc r2) {
        super(r1, r2);
    }
}
