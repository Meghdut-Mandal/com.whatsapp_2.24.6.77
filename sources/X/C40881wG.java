package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.1wG  reason: invalid class name and case insensitive filesystem */
public final class C40881wG extends AnonymousClass0CZ {
    public int A00;
    public List A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass16D A03;
    public final C19770wU A04;
    public final int A05;
    public final int A06;
    public final AnonymousClass30B A07;
    public final AnonymousClass1RY A08;
    public final AnonymousClass4OM A09;

    public void BSE(AnonymousClass0D3 r8, int i) {
        int i2;
        AnonymousClass00C.A0D(r8, 0);
        if (r8 instanceof C42391yk) {
            C42391yk r82 = (C42391yk) r8;
            AnonymousClass3JI r5 = (AnonymousClass3JI) this.A01.get(i);
            AnonymousClass00C.A0D(r5, 0);
            AnonymousClass141 r3 = r5.A00;
            int i3 = 0;
            r82.A05.A06(r82.A02, r82.A07, r3, false);
            WaTextView waTextView = r82.A03;
            waTextView.setText(r82.A04.A0L(r3));
            C33511fU.A03(waTextView);
            r82.A0H.setOnClickListener(new AnonymousClass3YL(r82, i, 14, r5));
            WaButtonWithLoader waButtonWithLoader = r82.A00;
            waButtonWithLoader.A00 = new AnonymousClass3YL(r82, i, 13, r5);
            if (r5.A01) {
                waButtonWithLoader.A02();
            } else {
                waButtonWithLoader.A01();
            }
            C44072La r2 = r5.A02;
            if (r2.A0N()) {
                waButtonWithLoader.setVariant(C27981Qp.TONAL);
                i2 = R.string.f12nameremoved;
            } else {
                waButtonWithLoader.setVariant(C27981Qp.OUTLINE);
                i2 = R.string.f12nameremoved;
            }
            waButtonWithLoader.setButtonText(i2);
            ViewStub viewStub = r82.A01;
            AnonymousClass00C.A07(viewStub);
            if (!r2.A0P()) {
                i3 = 8;
            }
            viewStub.setVisibility(i3);
        }
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        LayoutInflater A0J = C36341k9.A0J(viewGroup, 0);
        if (i != 1) {
            return new C41471xG(C36371kC.A0I(A0J, viewGroup, this.A06));
        }
        View inflate = A0J.inflate(this.A05, viewGroup, false);
        AnonymousClass30B r1 = this.A07;
        AnonymousClass00C.A0B(inflate);
        AnonymousClass1RY r4 = this.A08;
        AnonymousClass4OM r6 = this.A09;
        List list = AnonymousClass0D3.A0I;
        C18800tq r12 = r1.A00.A00;
        return new C42391yk(inflate, C36341k9.A0S(r12), r4, C36371kC.A0f(r12), r6, C18830tt.A7W(r12.A00));
    }

    public int A0J() {
        int i = this.A00;
        if (i <= 0) {
            return this.A01.size();
        }
        return i;
    }

    public int getItemViewType(int i) {
        if (this.A00 > 0) {
            return 0;
        }
        return 1;
    }

    public C40881wG(AnonymousClass30B r2, AnonymousClass17Y r3, AnonymousClass16D r4, AnonymousClass1RY r5, AnonymousClass4OM r6, C19770wU r7, boolean z) {
        C36321k7.A18(r3, r7, r4, r2);
        this.A02 = r3;
        this.A04 = r7;
        this.A03 = r4;
        this.A07 = r2;
        this.A08 = r5;
        this.A09 = r6;
        this.A05 = z ? R.layout.f9nameremoved : R.layout.f9nameremoved;
        this.A06 = z ? R.layout.f9nameremoved : R.layout.f9nameremoved;
        this.A01 = C023409w.A00;
    }
}
