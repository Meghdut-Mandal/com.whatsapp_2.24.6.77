package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.whatsapp.R;
import com.whatsapp.magicmod.popup.MagicModPopupViewModel;

/* renamed from: X.1qJ  reason: invalid class name and case insensitive filesystem */
public final class C38841qJ extends PopupWindow {
    public final Context A00;
    public final Runnable A01;
    public final MagicModPopupViewModel A02;

    public C38841qJ(Context context, AnonymousClass012 r7, AnonymousClass016 r8, Runnable runnable) {
        super(context);
        this.A00 = context;
        this.A01 = runnable;
        MagicModPopupViewModel magicModPopupViewModel = (MagicModPopupViewModel) C36441kJ.A0b(r8).A00(MagicModPopupViewModel.class);
        this.A02 = magicModPopupViewModel;
        View A0E = C36361kB.A0E(LayoutInflater.from(context), (ViewGroup) null, R.layout.f9nameremoved);
        AnonymousClass00C.A0E(A0E, "null cannot be cast to non-null type android.widget.LinearLayout");
        setContentView(A0E);
        setOutsideTouchable(true);
        setFocusable(true);
        C66023Uj.A01(r7, magicModPopupViewModel.A00, C53102qm.A02(this, 29), 38);
        setBackgroundDrawable(new ColorDrawable(AnonymousClass00F.A00(context, R.color.f6nameremoved)));
        setTouchInterceptor(new C53912s6(this, 7));
    }
}
