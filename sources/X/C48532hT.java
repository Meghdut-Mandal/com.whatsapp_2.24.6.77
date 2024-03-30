package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.2hT  reason: invalid class name and case insensitive filesystem */
public final class C48532hT extends C42581z3 implements AnonymousClass4OM {
    public final View A00;
    public final View A01;
    public final RecyclerView A02;
    public final WaTextView A03;
    public final C76003oA A04;
    public final C32141d2 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48532hT(View view, AnonymousClass3CE r7, AnonymousClass1RY r8, C18820ts r9, C32141d2 r10) {
        super(view);
        C36321k7.A0x(r9, r7);
        AnonymousClass00C.A0D(r8, 4);
        this.A05 = r10;
        View findViewById = view.findViewById(R.id.find_channels_btn);
        this.A00 = findViewById;
        WaTextView A0Z = C36411kG.A0Z(view, R.id.subtitle);
        this.A03 = A0Z;
        RecyclerView A0c = C36441kJ.A0c(view, R.id.recommended_list);
        this.A02 = A0c;
        View findViewById2 = view.findViewById(R.id.see_all_container);
        this.A01 = findViewById2;
        AnonymousClass00C.A06(A0c);
        C76003oA A002 = r7.A00(A0c, r8, r10, false);
        this.A04 = A002;
        AnonymousClass3Y9.A00(findViewById, this, 16);
        AnonymousClass3Y9.A00(findViewById2, this, 17);
        C33511fU.A03(C36391kE.A0P(view, R.id.see_all_text));
        C33511fU.A03(A0Z);
        A002.A00();
        C36321k7.A0L(view.getContext(), C36391kE.A0N(view, R.id.chevron), r9, R.drawable.vec_ic_chevron_right_wds);
    }
}
