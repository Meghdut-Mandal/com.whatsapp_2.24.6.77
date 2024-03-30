package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0gQ  reason: invalid class name and case insensitive filesystem */
public class C11510gQ implements Runnable {
    public final /* synthetic */ AnonymousClass0C0 A00;
    public final /* synthetic */ ArrayList A01;

    public C11510gQ(AnonymousClass0C0 r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public void run() {
        View view;
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass0U5 r10 = (AnonymousClass0U5) it.next();
            AnonymousClass0C0 r11 = this.A00;
            AnonymousClass0D3 r0 = r10.A05;
            View view2 = null;
            if (r0 == null) {
                view = null;
            } else {
                view = r0.A0H;
            }
            AnonymousClass0D3 r02 = r10.A04;
            if (r02 != null) {
                view2 = r02.A0H;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(r11.A07());
                r11.A04.add(r10.A05);
                duration.translationX((float) (r10.A02 - r10.A00));
                duration.translationY((float) (r10.A03 - r10.A01));
                duration.alpha(0.0f).setListener(new C18050sX(view, duration, r10, r11, 1)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                r11.A04.add(r10.A04);
                animate.translationX(0.0f).translationY(0.0f).setDuration(r11.A07()).alpha(1.0f).setListener(new C18050sX(view2, animate, r10, r11, 2)).start();
            }
        }
        arrayList.clear();
        this.A00.A01.remove(arrayList);
    }
}
