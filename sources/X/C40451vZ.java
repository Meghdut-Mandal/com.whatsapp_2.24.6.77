package X;

import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;
import com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet;
import java.util.List;

/* renamed from: X.1vZ  reason: invalid class name and case insensitive filesystem */
public final class C40451vZ extends C02920Ck implements Filterable {
    public static final C02830Cb A04 = new C89094Vf(0);
    public AnonymousClass36Z A00;
    public List A01;
    public List A02;
    public final CountrySelectorBottomSheet A03;

    public void BSE(AnonymousClass0D3 r4, int i) {
        AnonymousClass00C.A0D(r4, 0);
        Object A0L = A0L(i);
        AnonymousClass00C.A08(A0L);
        AnonymousClass36Z r2 = (AnonymousClass36Z) A0L;
        AnonymousClass00C.A0D(r2, 0);
        AppCompatRadioButton appCompatRadioButton = ((C42041yB) r4).A00;
        appCompatRadioButton.setText(r2.A01);
        appCompatRadioButton.setChecked(r2.A00);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C42041yB(C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false), this);
    }

    public Filter getFilter() {
        return new AnonymousClass4VY(this, 0);
    }

    public C40451vZ(CountrySelectorBottomSheet countrySelectorBottomSheet) {
        this();
        this.A03 = countrySelectorBottomSheet;
    }

    public C40451vZ() {
        super(A04);
        this.A02 = AnonymousClass001.A0I();
        this.A01 = AnonymousClass001.A0I();
    }
}
