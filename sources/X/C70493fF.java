package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.3fF  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70493fF implements C87714Pw {
    public final /* synthetic */ AnonymousClass2IO A00;

    public /* synthetic */ C70493fF(AnonymousClass2IO r1) {
        this.A00 = r1;
    }

    public final void BR1(String str) {
        AnonymousClass2IO r5 = this.A00;
        C181798o3 fMessage = r5.getFMessage();
        boolean A002 = AnonymousClass3T2.A00(r5.A0G, r5.A1W, fMessage);
        int i = R.drawable.mark_video;
        if (A002) {
            i = R.drawable.ic_hd_video_label;
        }
        Resources resources = r5.getResources();
        C181798o3 fMessage2 = r5.getFMessage();
        boolean A003 = AnonymousClass3T2.A00(r5.A0G, r5.A1W, fMessage2);
        int i2 = R.dimen.f7nameremoved;
        if (A003) {
            i2 = R.dimen.f7nameremoved;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        TextView textView = r5.A09;
        C36341k9.A0z(textView, dimensionPixelSize, textView.getPaddingTop());
        if (C36351kA.A1Y(r5.A0E)) {
            textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, AnonymousClass00E.A00(r5.getContext(), i), (Drawable) null);
        }
    }
}
