package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import java.util.List;
import java.util.Set;

/* renamed from: X.7vY  reason: invalid class name and case insensitive filesystem */
public final class C166327vY extends ArrayAdapter {
    public final Context A00;
    public final LayoutInflater A01;
    public final C191519Dg A02;
    public final C191529Dh A03;
    public final AnonymousClass1LI A04;
    public final AnonymousClass1Pp A05;
    public final AnonymousClass1RY A06;
    public final Set A07;

    public View getView(int i, View view, ViewGroup viewGroup) {
        C22921AyX ayX;
        C22921AyX ayX2;
        View view2 = view;
        AnonymousClass00C.A0D(viewGroup, 2);
        C22922AyY ayY = (C22922AyY) getItem(i);
        if (ayY != null) {
            if (view == null) {
                int itemViewType = getItemViewType(i);
                if (itemViewType == 0) {
                    view2 = C36371kC.A0J(this.A01, viewGroup, R.layout.f9nameremoved, false);
                    C36341k9.A10(view2, R.id.contactpicker_row_phone_type, 8);
                    C191519Dg r0 = this.A02;
                    AnonymousClass1RY r8 = this.A06;
                    C18800tq r2 = r0.A00.A01;
                    ayX2 = new C69463dZ(view2, (AnonymousClass1LI) r2.A3Q.get(), r8, C36341k9.A0T(r2), r2.AzV(), (C32881eL) r2.A4L.get());
                } else if (itemViewType == 1) {
                    view2 = C36371kC.A0J(this.A01, viewGroup, R.layout.f9nameremoved, false);
                    C36341k9.A10(view2, R.id.contactpicker_row_phone_type, 8);
                    ayX2 = new A9U(view2, this.A04, this.A05);
                } else if (itemViewType == 2) {
                    view2 = C36371kC.A0J(this.A01, viewGroup, R.layout.f9nameremoved, false);
                    ayX2 = new A9T(view2);
                } else if (itemViewType != 3) {
                    view2 = null;
                } else {
                    view2 = C36371kC.A0J(this.A01, viewGroup, R.layout.f9nameremoved, false);
                    C191529Dh r02 = this.A03;
                    Set set = this.A07;
                    C18800tq r22 = r02.A00.A01;
                    C32681e1 A0p = C36351kA.A0p(r22.A00);
                    ayX2 = new A9V(view2, C36351kA.A0h(r22), (C24681Dj) r22.A6f.get(), A0p, set);
                }
                ayX = ayX2;
                view2.setTag(ayX);
            } else {
                Object tag = view.getTag();
                AnonymousClass00C.A0E(tag, "null cannot be cast to non-null type com.whatsapp.blocklist.BlockListViewHolder");
                ayX = (C22921AyX) tag;
            }
            ayX.BSD(ayY);
            return view2;
        }
        View view3 = super.getView(i, view2, viewGroup);
        AnonymousClass00C.A08(view3);
        return view3;
    }

    public int getViewTypeCount() {
        return 4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C166327vY(Context context, C191519Dg r4, C191529Dh r5, AnonymousClass1LI r6, AnonymousClass1Pp r7, AnonymousClass1RY r8, List list, Set set) {
        super(context, R.layout.f9nameremoved, list);
        C36321k7.A0z(list, set);
        AnonymousClass00C.A0D(r8, 5);
        C36321k7.A13(r4, r5, r7);
        AnonymousClass00C.A0D(r6, 9);
        this.A07 = set;
        this.A00 = context;
        this.A06 = r8;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
        LayoutInflater from = LayoutInflater.from(context);
        AnonymousClass00C.A08(from);
        this.A01 = from;
    }

    public int getItemViewType(int i) {
        C22922AyY ayY = (C22922AyY) getItem(i);
        if (ayY == null) {
            return super.getItemViewType(i);
        }
        return ayY.BD9();
    }
}
