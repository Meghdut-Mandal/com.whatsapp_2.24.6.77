package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import java.util.List;

/* renamed from: X.1vi  reason: invalid class name and case insensitive filesystem */
public class C40541vi extends AnonymousClass0CZ {
    public List A00 = AnonymousClass001.A0I();
    public final FilterBottomSheetDialogFragment A01;

    public int A0J() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        ((C42611z6) r2).A0C(this.A00.get(i));
    }

    public C40541vi(FilterBottomSheetDialogFragment filterBottomSheetDialogFragment) {
        this.A01 = filterBottomSheetDialogFragment;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        LayoutInflater A0C = C36351kA.A0C(viewGroup);
        List list = AnonymousClass0D3.A0I;
        return new AnonymousClass2Xr((AppCompatCheckBox) C36381kD.A0K(A0C, R.layout.f9nameremoved), this.A01);
    }
}
