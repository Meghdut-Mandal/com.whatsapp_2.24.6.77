package X;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.R;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import java.util.List;

/* renamed from: X.4mW  reason: invalid class name and case insensitive filesystem */
public final class C95934mW extends AnonymousClass0CZ {
    public final CallRatingViewModel A00;
    public final List A01;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C96734no(C36371kC.A0I(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved), this);
    }

    public int A0J() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r6, int i) {
        C96734no r62 = (C96734no) r6;
        AnonymousClass00C.A0D(r62, 0);
        C1278369v r4 = (C1278369v) this.A01.get(i);
        AnonymousClass00C.A0D(r4, 0);
        r62.A01.setText(r4.A00);
        C36361kB.A17(r62.A0H, r62, 47);
        AppCompatCheckBox appCompatCheckBox = r62.A00;
        C95934mW r2 = r62.A02;
        appCompatCheckBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        appCompatCheckBox.setChecked(C36381kD.A1Z(r2.A00.A0E, r4.A01.ordinal()));
        appCompatCheckBox.setOnCheckedChangeListener(new C136076dj(r2, r4));
    }

    public C95934mW(CallRatingViewModel callRatingViewModel, List list) {
        C36321k7.A0x(list, callRatingViewModel);
        this.A01 = list;
        this.A00 = callRatingViewModel;
    }
}
