package X;

import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.2JJ  reason: invalid class name */
public final class AnonymousClass2JJ extends C41441xD {
    public AnonymousClass2IR A00;
    public final FrameLayout A01;
    public final C19730wQ A02;
    public final WaTextView A03;
    public final AnonymousClass16D A04;
    public final AnonymousClass1RY A05;
    public final AnonymousClass3QY A06;
    public final C89004Uw A07;
    public final C48812i6 A08;
    public final View A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JJ(View view, C19730wQ r3, AnonymousClass16D r4, AnonymousClass1RY r5, AnonymousClass3QY r6, C89004Uw r7, C48812i6 r8) {
        super(view);
        C36321k7.A18(r3, r4, view, r5);
        AnonymousClass00C.A0D(r8, 7);
        this.A02 = r3;
        this.A04 = r4;
        this.A09 = view;
        this.A05 = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A01 = (FrameLayout) C36361kB.A0F(view, R.id.chat_bubble_container);
        this.A03 = C36351kA.A0Q(view, R.id.report_to_admin_footer_tv);
    }
}
