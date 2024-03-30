package X;

import android.util.SparseArray;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.80G  reason: invalid class name */
public class AnonymousClass80G extends AnonymousClass0D3 {
    public boolean A00;
    public boolean A01;
    public final SparseArray A02;

    public View A0B(int i) {
        SparseArray sparseArray = this.A02;
        View view = (View) sparseArray.get(i);
        if (view == null && (view = this.A0H.findViewById(i)) != null) {
            sparseArray.put(i, view);
        }
        return view;
    }

    public AnonymousClass80G(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.A02 = sparseArray;
        sparseArray.put(16908310, view.findViewById(16908310));
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        sparseArray.put(16908350, view.findViewById(16908350));
    }
}
