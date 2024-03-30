package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1wE  reason: invalid class name and case insensitive filesystem */
public final class C40861wE extends AnonymousClass0CZ {
    public List A00 = AnonymousClass001.A0I();
    public final C41071wZ A01;
    public final C57882yy A02;
    public final C001200n A03 = C52352pI.A00;

    public C40861wE(C57882yy r2, C41071wZ r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A02 = r2;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        View inflate = C36341k9.A0J(viewGroup, 0).inflate(R.layout.f9nameremoved, viewGroup, false);
        AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        TextView textView = (TextView) inflate;
        C33511fU.A03(textView);
        return new C41901xx(textView, this);
    }

    public int A0J() {
        return this.A00.size();
    }

    public final void A0L(C52352pI r6) {
        C001200n<C52352pI> r0 = this.A03;
        ArrayList A0J = C36321k7.A0J(r0);
        for (C52352pI r2 : r0) {
            A0J.add(new C62993Ii(r2, C36361kB.A1a(r2, r6)));
        }
        this.A00 = A0J;
        A06();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r7, int i) {
        C41901xx r72 = (C41901xx) r7;
        AnonymousClass00C.A0D(r72, 0);
        C62993Ii r1 = (C62993Ii) this.A00.get(i);
        AnonymousClass00C.A0D(r1, 0);
        Chip chip = r72.A00;
        chip.setContentDescription(chip.getText());
        chip.setChecked(r1.A01);
        chip.setCheckedIconVisible(false);
        C52352pI r0 = r1.A00;
        Context A0B = C36371kC.A0B(chip);
        int ordinal = r0.ordinal();
        int i2 = R.string.f12nameremoved;
        if (ordinal != 0) {
            i2 = R.string.f12nameremoved;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i2 = R.string.f12nameremoved;
                } else {
                    throw C36441kJ.A18();
                }
            }
        }
        chip.setText(C36361kB.A0m(A0B, i2));
    }
}
