package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.R;
import com.whatsapp.search.SearchViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Jf  reason: invalid class name and case insensitive filesystem */
public class C106325Jf extends C106335Jg {
    public AnonymousClass171 A00;
    public C18820ts A01;
    public AnonymousClass1H2 A02;
    public boolean A03;

    public void A03(SearchViewModel searchViewModel, List list) {
        ChipGroup chipGroup = this.A01;
        chipGroup.removeAllViews();
        int maxChipWidth = getMaxChipWidth();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it);
            if (A0f != null) {
                Chip A0I = C90494aF.A0I(this);
                A0I.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                A0I.setText(AnonymousClass3UG.A05(getContext(), this.A02, C36411kG.A0w(getResources(), this.A01.A04(this.A00.A0H(A0f)), new Object[1], 0, R.string.f12nameremoved)));
                A0I.setId(R.id.search_contact_token);
                A0I.setClickable(true);
                AnonymousClass3YH.A00(A0I, searchViewModel, A0f, 38);
                C90464aC.A0r(getContext(), A0I, R.color.f6nameremoved);
                A0I.setEllipsize(TextUtils.TruncateAt.END);
                if (maxChipWidth > 0) {
                    A0I.setMaxWidth(maxChipWidth);
                }
                chipGroup.addView(A0I);
            }
        }
    }

    public C106325Jf(Context context) {
        super(context);
        A02();
        addOnLayoutChangeListener(new C163327q1((Object) this, 11));
        C90474aD.A0y(this);
    }

    /* access modifiers changed from: private */
    public int getMaxChipWidth() {
        return (C36331k8.A00(this, getWidth()) - this.A01.A00) / 2;
    }
}
