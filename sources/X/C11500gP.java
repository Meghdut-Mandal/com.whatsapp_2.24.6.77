package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0gP  reason: invalid class name and case insensitive filesystem */
public class C11500gP implements Runnable {
    public final /* synthetic */ AnonymousClass0C0 A00;
    public final /* synthetic */ ArrayList A01;

    public C11500gP(AnonymousClass0C0 r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass0TJ r3 = (AnonymousClass0TJ) it.next();
            AnonymousClass0C0 r8 = this.A00;
            AnonymousClass0D3 r9 = r3.A04;
            int i = r3.A00;
            int i2 = r3.A01;
            int i3 = r3.A02;
            int i4 = r3.A03;
            View view = r9.A0H;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            r8.A05.add(r9);
            animate.setDuration(r8.A08()).setListener(new AnonymousClass0DN(view, animate, r8, r9, i5, i6)).start();
        }
        arrayList.clear();
        this.A00.A02.remove(arrayList);
    }
}
