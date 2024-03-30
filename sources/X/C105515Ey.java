package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.5Ey  reason: invalid class name and case insensitive filesystem */
public final class C105515Ey extends C46482Xv {
    public final View A00;
    public final TextEmojiLabel A01;
    public final View A02;

    public C105515Ey(View view) {
        super(view);
        this.A02 = view;
        TextEmojiLabel A0O = C36351kA.A0O(view, R.id.allow_location_btn);
        this.A01 = A0O;
        this.A00 = C36361kB.A0G(view, R.id.more_options_btn);
        Context context = view.getContext();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("# ");
        C36351kA.A14(context, A0u, R.string.f12nameremoved);
        SpannableStringBuilder A0P = C36441kJ.A0P(A0u.toString());
        C37351mE.A03(A0O.getPaint(), AnonymousClass3UF.A04(context, C36381kD.A0H(context, R.drawable.ic_location_nearby), R.color.f6nameremoved), A0P, -1, 0, 1);
        A0O.setText(A0P);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass00C.A0D(obj, 0);
        C36361kB.A17(this.A01, obj, 12);
        C36361kB.A17(this.A00, obj, 13);
    }
}
