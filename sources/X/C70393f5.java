package X;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.whatsapp.R;
import java.util.TreeSet;

/* renamed from: X.3f5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70393f5 implements C87684Pt {
    public final /* synthetic */ C80183uz A00;
    public final /* synthetic */ C62313Fr A01;

    public /* synthetic */ C70393f5(C80183uz r1, C62313Fr r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void BYs() {
        C62313Fr r1 = this.A01;
        C80183uz r0 = this.A00;
        TreeSet treeSet = r1.A01;
        treeSet.remove(r0);
        while (!treeSet.isEmpty()) {
            C80183uz r12 = (C80183uz) treeSet.first();
            if (r12.A0B()) {
                r12.A07();
                View A06 = r12.A06();
                if (A06 != null) {
                    A06.startAnimation(AnimationUtils.loadAnimation(A06.getContext(), R.anim.f1nameremoved));
                    return;
                }
                return;
            }
            treeSet.remove(r12);
        }
    }
}
