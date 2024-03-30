package X;

import android.view.DragEvent;
import android.view.View;
import java.util.Iterator;

/* renamed from: X.6cz  reason: invalid class name and case insensitive filesystem */
public final class C135616cz implements View.OnDragListener, AnonymousClass7bQ {
    public final C000000a A00 = new C000000a(0);
    public final C161267mT A01 = new C162447ob(this, 1);
    public final C94134hh A02 = new C94134hh(C155627Wu.A00);
    public final C019408g A03;

    public boolean onDrag(View view, DragEvent dragEvent) {
        C114345h4 r4 = new C114345h4(dragEvent);
        boolean z = false;
        switch (dragEvent.getAction()) {
            case 1:
                C94134hh r2 = this.A02;
                if (r2.A08) {
                    C10770fC r1 = new C10770fC();
                    C94134hh.A00(r2, new C154937Ud(r4, r2, r1));
                    if (r1.element) {
                        z = true;
                    }
                }
                Iterator it = this.A00.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                break;
            case 2:
                this.A02.BbE(r4);
                return false;
            case 3:
                return this.A02.BWG(r4);
            case 4:
                C94134hh r12 = this.A02;
                if (r12.A03.A08) {
                    C94134hh.A00(r12, new AnonymousClass7RG(r4));
                    r12.A00 = null;
                    return false;
                }
                break;
            case 6:
                this.A02.BX9(r4);
                return false;
        }
        return z;
    }

    public C135616cz(C019408g r3) {
        this.A03 = r3;
    }
}
