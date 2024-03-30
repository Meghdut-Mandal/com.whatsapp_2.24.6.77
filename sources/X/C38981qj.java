package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import java.util.List;

/* renamed from: X.1qj  reason: invalid class name and case insensitive filesystem */
public class C38981qj extends SimpleAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SingleChoiceListDialogFragment A01;
    public final /* synthetic */ String[] A02;
    public final /* synthetic */ boolean[] A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38981qj(Context context, SingleChoiceListDialogFragment singleChoiceListDialogFragment, List list, int[] iArr, String[] strArr, String[] strArr2, boolean[] zArr, int i) {
        super(context, list, R.layout.f9nameremoved, strArr, iArr);
        this.A01 = singleChoiceListDialogFragment;
        this.A03 = zArr;
        this.A00 = i;
        this.A02 = strArr2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        Context A1D;
        int A002;
        View view2 = super.getView(i, view, viewGroup);
        TextView A0P = C36391kE.A0P(view2, 16908308);
        TextView A0P2 = C36391kE.A0P(view2, 16908309);
        SingleChoiceListDialogFragment singleChoiceListDialogFragment = this.A01;
        if (singleChoiceListDialogFragment.A12()) {
            boolean[] zArr = this.A03;
            if (zArr == null || zArr[i]) {
                C36331k8.A0r(singleChoiceListDialogFragment.A1D(), A0P, C224514j.A00(singleChoiceListDialogFragment.A1D(), R.attr.f4nameremoved, R.color.f6nameremoved));
                A1D = singleChoiceListDialogFragment.A1D();
                A002 = C224514j.A00(singleChoiceListDialogFragment.A1D(), R.attr.f4nameremoved, R.color.f6nameremoved);
            } else {
                Context A1D2 = singleChoiceListDialogFragment.A1D();
                A002 = R.color.f6nameremoved;
                C36331k8.A0r(A1D2, A0P, R.color.f6nameremoved);
                A1D = singleChoiceListDialogFragment.A1D();
            }
            C36331k8.A0r(A1D, A0P2, A002);
        }
        if (TextUtils.isEmpty(A0P2.getText())) {
            A0P2.setVisibility(8);
        } else {
            A0P2.setVisibility(0);
        }
        int i2 = this.A00;
        if (i2 < 0 || !TextUtils.equals(this.A02[i2], A0P.getText())) {
            ((CompoundButton) view2.findViewById(R.id.radio)).setChecked(false);
            return view2;
        }
        ((CompoundButton) view2.findViewById(R.id.radio)).setChecked(true);
        return view2;
    }
}
