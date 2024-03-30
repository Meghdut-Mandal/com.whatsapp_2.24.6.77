package X;

import android.content.Context;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.8dF  reason: invalid class name and case insensitive filesystem */
public final class C177128dF extends C168097zh {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177128dF(Context context, C24801Dv r3, AnonymousClass171 r4, C27731Pn r5, C21060yb r6, C19970wo r7, C18820ts r8, C20810yC r9, C32681e1 r10) {
        super(context, r3, r4, r5, r6, r7, r8, r9, r10);
        AnonymousClass00C.A0D(r7, 1);
        C36321k7.A17(r9, r10, r3, 2);
        C36321k7.A13(r5, r6, r4);
        AnonymousClass00C.A0D(r8, 9);
    }

    public void BSE(AnonymousClass0D3 r5, int i) {
        AnonymousClass00C.A0D(r5, 0);
        C16310ox r1 = (C16310ox) this.A01.get(i);
        if (r1 instanceof ACV) {
            AnonymousClass808 r52 = (AnonymousClass808) r5;
            AnonymousClass141 r0 = ((ACV) r1).A01;
            A0L(r0, r52);
            r52.A00.setTag(r0.A0H);
            r52.A07.setVisibility(8);
            r52.A08.setVisibility(8);
            WaTextView waTextView = r52.A03;
            waTextView.setVisibility(0);
            Context context = this.A04;
            C36331k8.A0r(context, waTextView, R.color.f6nameremoved);
            C36371kC.A13(context, waTextView, R.drawable.group_info_label_gray);
            waTextView.setText(R.string.f12nameremoved);
            return;
        }
        super.BSE(r5, i);
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 1) {
            return new C168267zy(C36371kC.A0J(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved, false), this);
        }
        return super.BUw(viewGroup, i);
    }
}
