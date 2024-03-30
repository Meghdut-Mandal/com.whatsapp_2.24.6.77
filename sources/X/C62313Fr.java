package X;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.whatsapp.R;
import java.util.TreeSet;

/* renamed from: X.3Fr  reason: invalid class name and case insensitive filesystem */
public final class C62313Fr {
    public final C64543Ok A00;
    public final TreeSet A01 = new TreeSet();

    public void A01(Class cls, boolean z) {
        AnonymousClass00C.A0D(cls, 0);
        C80183uz A002 = this.A00.A00(cls);
        if (A002 != null) {
            C80183uz A003 = A00();
            if (!AnonymousClass00C.A0J(A003, A002) && A002.A0B()) {
                if (A003 != null) {
                    if (Integer.compare(A002.A00, A003.A00) < 0) {
                        C80183uz A004 = A00();
                        if (A004 != null) {
                            A004.A09(C70403f6.A00, false);
                        }
                    } else {
                        this.A01.add(A002);
                        return;
                    }
                }
                this.A01.add(A002);
                A002.A07();
                View A06 = A002.A06();
                if (z && A06 != null) {
                    A06.startAnimation(AnimationUtils.loadAnimation(A06.getContext(), R.anim.f1nameremoved));
                }
            }
        }
    }

    public C80183uz A00() {
        TreeSet treeSet = this.A01;
        if (treeSet.isEmpty()) {
            return null;
        }
        return (C80183uz) treeSet.first();
    }

    public C62313Fr(C64543Ok r2) {
        this.A00 = r2;
    }
}
