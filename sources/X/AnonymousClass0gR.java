package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0gR  reason: invalid class name */
public class AnonymousClass0gR implements Runnable {
    public final /* synthetic */ AnonymousClass0C0 A00;
    public final /* synthetic */ ArrayList A01;

    public AnonymousClass0gR(AnonymousClass0C0 r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass0D3 r6 = (AnonymousClass0D3) it.next();
            AnonymousClass0C0 r5 = this.A00;
            View view = r6.A0H;
            ViewPropertyAnimator animate = view.animate();
            r5.A03.add(r6);
            animate.alpha(1.0f).setDuration(r5.A00).setListener(new C18050sX(view, animate, r5, r6)).start();
        }
        arrayList.clear();
        this.A00.A00.remove(arrayList);
    }
}
