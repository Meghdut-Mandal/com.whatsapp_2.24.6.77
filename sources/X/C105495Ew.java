package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

/* renamed from: X.5Ew  reason: invalid class name and case insensitive filesystem */
public final class C105495Ew extends C46482Xv {
    public final View A00;
    public final TextEmojiLabel A01;
    public final WaTextView A02;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int i;
        AnonymousClass5EI r12 = (AnonymousClass5EI) obj;
        AnonymousClass00C.A0D(r12, 0);
        TextEmojiLabel textEmojiLabel = this.A01;
        AnonymousClass6QG r5 = r12.A01;
        String str = r5.A08;
        boolean A0J = AnonymousClass00C.A0J(str, "device");
        View view = this.A00;
        Context context = view.getContext();
        if (A0J) {
            i = C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        } else {
            i = R.color.f6nameremoved;
        }
        C36331k8.A0r(context, textEmojiLabel, i);
        this.A02.setText(r12.A00);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("# ");
        spannableStringBuilder.append(C36441kJ.A0O(AnonymousClass000.A0q(C131846Qw.A01(view.getContext(), r5), A0u)));
        Drawable A002 = AnonymousClass00E.A00(view.getContext(), R.drawable.business_directory_ic_location);
        int A003 = AnonymousClass00F.A00(view.getContext(), R.color.f6nameremoved);
        if (AnonymousClass00C.A0J(str, "device")) {
            A002 = AnonymousClass00E.A00(view.getContext(), R.drawable.ic_location_nearby);
            A003 = C36351kA.A02(view.getContext(), view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
        }
        C18740tg.A06(A002);
        Drawable A08 = AnonymousClass3UF.A08(A002, A003);
        AnonymousClass00C.A08(A08);
        C37351mE.A03(textEmojiLabel.getPaint(), A08, spannableStringBuilder, -1, 0, 1);
        textEmojiLabel.setText(spannableStringBuilder);
        C36361kB.A17(textEmojiLabel, r12, 8);
    }

    public C105495Ew(View view) {
        super(view);
        this.A00 = view;
        this.A01 = C36351kA.A0O(view, R.id.search_location_address);
        this.A02 = C36341k9.A0Q(view, R.id.title);
    }
}
