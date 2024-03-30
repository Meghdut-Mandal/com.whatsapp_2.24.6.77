package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter;
import java.util.List;

/* renamed from: X.1vr  reason: invalid class name and case insensitive filesystem */
public final class C40631vr extends AnonymousClass0CZ {
    public final int A00;
    public final StatusSeeAllAdapter A01;
    public final List A02;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        View inflate = C36341k9.A0J(viewGroup, 0).inflate(R.layout.f9nameremoved, viewGroup, false);
        AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        Chip chip = (Chip) inflate;
        C33511fU.A03(chip);
        chip.setChipIconVisible(false);
        chip.setCheckedIconVisible(false);
        return new C41911xy(chip);
    }

    public int A0J() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r4, int i) {
        C41911xy r42 = (C41911xy) r4;
        AnonymousClass00C.A0D(r42, 0);
        Chip chip = r42.A00;
        List list = this.A02;
        chip.setText((CharSequence) list.get(i));
        chip.setSelected(AnonymousClass000.A1S(i, this.A00));
        chip.setContentDescription((CharSequence) list.get(i));
        C67143Yr.A00(chip, this, i, 29);
    }

    public C40631vr(StatusSeeAllAdapter statusSeeAllAdapter, List list, int i) {
        this.A02 = list;
        this.A00 = i;
        this.A01 = statusSeeAllAdapter;
    }
}
