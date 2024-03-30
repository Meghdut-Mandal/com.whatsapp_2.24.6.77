package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* renamed from: X.0sU  reason: invalid class name and case insensitive filesystem */
public class C18020sU extends AnimatorListenerAdapter {
    public Object A00;
    public final int A01;

    public C18020sU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass054) this.A00).A0F();
                animator.removeListener(this);
                return;
            case 1:
                AnonymousClass0BQ r4 = (AnonymousClass0BQ) this.A00;
                ArrayList arrayList = new ArrayList(r4.A04);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C06590Ue) arrayList.get(i)).A02(r4);
                }
                return;
            default:
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        if (1 - this.A01 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        AnonymousClass0BQ r4 = (AnonymousClass0BQ) this.A00;
        ArrayList arrayList = new ArrayList(r4.A04);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C06590Ue) arrayList.get(i)).A01(r4);
        }
    }
}
