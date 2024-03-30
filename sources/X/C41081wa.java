package X;

import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1wa  reason: invalid class name and case insensitive filesystem */
public final class C41081wa extends AnonymousClass0CZ implements Filterable {
    public List A00;
    public final List A01;
    public final C006302t A02;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C42001y7(C36371kC.A0I(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved));
    }

    public Filter getFilter() {
        return new AnonymousClass4VY(this, 1);
    }

    public int A0J() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r3, int i) {
        C42001y7 r32 = (C42001y7) r3;
        AnonymousClass00C.A0D(r32, 0);
        r32.A01.setText(((C601936v) this.A00.get(i)).A02);
        r32.A00.setText(((C601936v) this.A00.get(i)).A01);
        C67143Yr.A00(r32.A0H, this, i, 15);
    }

    public C41081wa(List list, C006302t r3) {
        this.A01 = list;
        this.A02 = r3;
        this.A00 = C36361kB.A0q(list);
    }
}
