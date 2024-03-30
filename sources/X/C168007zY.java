package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;

/* renamed from: X.7zY  reason: invalid class name and case insensitive filesystem */
public class C168007zY extends AnonymousClass0CZ {
    public final C191539Di A00;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        LayoutInflater A09;
        int i2;
        if (i == 1) {
            A09 = C36331k8.A09(viewGroup);
            i2 = R.layout.f9nameremoved;
        } else if (i == 2) {
            return new AnonymousClass8Wf((Chip) C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved), C27111My.A0Z(this.A00.A00.A00));
        } else if (i == 3) {
            A09 = C36331k8.A09(viewGroup);
            i2 = R.layout.f9nameremoved;
        } else {
            throw C90464aC.A0R("SearchHistoryItemAdapter/onCreateViewHolder unhandled view type: ", AnonymousClass000.A0u(), i);
        }
        return new C174348We(C36361kB.A0E(A09, viewGroup, i2));
    }

    public int A0J() {
        throw AnonymousClass001.A0A("size");
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        AnonymousClass80A r22 = (AnonymousClass80A) r2;
        if (r22 instanceof AnonymousClass8Wf) {
            ((AnonymousClass8Wf) r22).A01.A03();
        }
        throw AnonymousClass001.A0A("get");
    }

    public int getItemViewType(int i) {
        throw AnonymousClass001.A0A("get");
    }

    public C168007zY(C191539Di r1) {
        this.A00 = r1;
    }
}
