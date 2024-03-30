package X;

import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.2v4  reason: invalid class name and case insensitive filesystem */
public abstract class C55712v4 {
    public static /* synthetic */ void A00(AnonymousClass01L r4, Toolbar toolbar, C18820ts r6, CharSequence charSequence) {
        int A04 = C36441kJ.A04(C36371kC.A0B(toolbar));
        C86584Lm r2 = new C86584Lm(r4);
        toolbar.setTitle(charSequence);
        toolbar.setBackgroundResource(A04);
        toolbar.A0J(r4, R.style.f13nameremoved);
        C36331k8.A0s(toolbar.getContext(), toolbar, r6, R.drawable.ic_back);
        toolbar.setNavigationOnClickListener(new AnonymousClass3Y9(r2, 44));
        toolbar.setNavigationContentDescription((int) R.string.f12nameremoved);
        Window window = r4.getWindow();
        window.clearFlags(67108864);
        window.setStatusBarColor(AnonymousClass00F.A00(r4, A04));
        r4.setTitle(charSequence);
        r4.setSupportActionBar(toolbar);
    }
}
