package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.biz.catalog.view.CategoryMediaCard;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.4zj  reason: invalid class name and case insensitive filesystem */
public final class C102314zj extends AnonymousClass80I {
    public final C196089Xp A00;
    public final CategoryMediaCard A01;
    public final C167507yA A02;

    public /* bridge */ /* synthetic */ void A0C(AnonymousClass9EL r10) {
        C102274zf r102 = (C102274zf) r10;
        AnonymousClass00C.A0D(r102, 0);
        List list = r102.A00;
        if (!list.isEmpty()) {
            LinkedList A0l = C90524aI.A0l();
            int i = 0;
            while (i < list.size()) {
                C128506Cn r0 = (C128506Cn) list.get(i);
                A0l.add(new AnonymousClass6C7((Drawable) null, new C143116q0(r0, this, i), new C119065pB(r0, this), r0.A02));
                i++;
                if (i >= 6) {
                    break;
                }
            }
            AnonymousClass6C7 r4 = null;
            if (list.size() > 6) {
                CategoryMediaCard categoryMediaCard = this.A01;
                r4 = new AnonymousClass6C7(AnonymousClass00E.A00(categoryMediaCard.getContext(), R.drawable.catalog_product_placeholder_background), new C143106pz(this), (C119065pB) null, C36361kB.A0m(categoryMediaCard.getContext(), R.string.f12nameremoved));
            }
            CategoryMediaCard categoryMediaCard2 = this.A01;
            categoryMediaCard2.setup(A0l, r4);
            categoryMediaCard2.setVisibility(0);
        }
    }

    public C102314zj(C196089Xp r1, CategoryMediaCard categoryMediaCard, C167507yA r3) {
        super(categoryMediaCard);
        this.A01 = categoryMediaCard;
        this.A00 = r1;
        this.A02 = r3;
    }
}
