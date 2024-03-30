package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.61p  reason: invalid class name and case insensitive filesystem */
public class C1258661p {
    public final AnonymousClass6LH A00;
    public final C20810yC A01;

    public C1258661p(AnonymousClass6LH r1, C20810yC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(Context context, C159337jC r14, int i) {
        Context context2 = context;
        View A0D = C36421kH.A0D(context, R.layout.f9nameremoved);
        TextView A0O = C36391kE.A0O(A0D, R.id.permission_message);
        ImageView A0G = C36401kF.A0G(A0D, R.id.permission_image);
        TextEmojiLabel A0O2 = C36401kF.A0O(A0D, R.id.learn_more_view);
        if (i == 0) {
            AnonymousClass6LH.A00(context2, A0O2, this.A00, context.getString(R.string.f12nameremoved), "security-and-privacy", "how-to-select-a-location-when-looking-for-businesses-nearby");
            A0O.setText(R.string.f12nameremoved);
        } else {
            A0O.setText(R.string.f12nameremoved);
            A0O2.setVisibility(8);
        }
        A0G.setImageResource(R.drawable.permission_location);
        View A02 = C012005e.A02(A0D, R.id.submit);
        View A022 = C012005e.A02(A0D, R.id.cancel);
        C39001qm A002 = AnonymousClass3LW.A00(context);
        A002.A0j(A0D);
        A002.A0r(true);
        AnonymousClass0FM create = A002.create();
        create.setOnDismissListener(new C163977r4(r14, 3));
        if (create.getWindow() != null) {
            create.getWindow().setBackgroundDrawable(new ColorDrawable(AnonymousClass00F.A00(context, R.color.f6nameremoved)));
        }
        C36411kG.A1C(A02, r14, create, 25);
        C36411kG.A1C(A022, create, r14, 24);
        create.setCanceledOnTouchOutside(false);
        create.show();
    }
}
