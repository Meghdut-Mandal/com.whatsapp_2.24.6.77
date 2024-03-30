package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1vb  reason: invalid class name and case insensitive filesystem */
public final class C40471vb extends AnonymousClass0CZ {
    public final List A00 = AnonymousClass001.A0I();

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        return new C41491xI(C36371kC.A0J(C36341k9.A0J(viewGroup, 0), viewGroup, R.layout.f9nameremoved, false));
    }

    public int A0J() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r8, int i) {
        int i2;
        int i3;
        C41491xI r82 = (C41491xI) r8;
        AnonymousClass00C.A0D(r82, 0);
        TextView textView = r82.A00;
        List list = this.A00;
        textView.setText(((C134806bd) list.get(i)).A02);
        float applyDimension = TypedValue.applyDimension(1, 24.0f, C36361kB.A0B(textView));
        if (((C134806bd) list.get(i)).A04) {
            i2 = R.drawable.ic_check;
            i3 = C36381kD.A02(textView.getContext());
        } else {
            i2 = R.drawable.ic_spam_block;
            i3 = R.color.f6nameremoved;
        }
        Drawable A0H = C36381kD.A0H(textView.getContext(), i2);
        AnonymousClass00C.A08(A0H);
        int i4 = (int) applyDimension;
        A0H.setBounds(0, 0, i4, i4);
        textView.setCompoundDrawables(A0H, (Drawable) null, (Drawable) null, (Drawable) null);
        AnonymousClass088.A01(ColorStateList.valueOf(C36381kD.A05(textView, i3)), textView);
    }
}
