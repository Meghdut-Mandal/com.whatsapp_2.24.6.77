package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.1vj  reason: invalid class name and case insensitive filesystem */
public class C40551vj extends AnonymousClass0CZ {
    public List A00;
    public final C57982z8 A01;

    public int A0J() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r14, int i) {
        C42121yJ r142 = (C42121yJ) r14;
        C62293Fp r6 = (C62293Fp) this.A00.get(i);
        WaTextView waTextView = r142.A01;
        AnonymousClass544 r7 = r6.A01;
        waTextView.setText(r7.A01);
        int parseColor = Color.parseColor(r7.A02);
        WaImageButton waImageButton = r142.A00;
        View view = r142.A0H;
        Context context = view.getContext();
        int A04 = C36361kB.A04(waImageButton, context, 1);
        int A03 = C018107s.A03(0.08f, parseColor, -16777216);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int[] iArr = new int[A04];
        iArr[0] = parseColor;
        iArr[1] = A03;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientType(A04);
        gradientDrawable.setGradientCenter(-1.0f, 0.5f);
        gradientDrawable.setSize(waImageButton.getWidth(), waImageButton.getHeight());
        ColorStateList A042 = AnonymousClass00F.A04(context, R.color.f6nameremoved);
        C18740tg.A06(A042);
        waImageButton.setBackground(new RippleDrawable(A042, gradientDrawable, (Drawable) null));
        r142.A02.A00(waImageButton, r7.A03);
        AnonymousClass3UF.A0E(waImageButton, AnonymousClass00F.A00(view.getContext(), R.color.f6nameremoved));
        C48812i6.A00(view, r6, r142, 18);
        C48892iE.A00(waImageButton, r142, 12);
        C48892iE.A00(waTextView, r142, 13);
    }

    public C40551vj(C57982z8 r1) {
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        View A0E = C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
        Resources resources = viewGroup.getResources();
        if (resources.getConfiguration().orientation == 1) {
            float A03 = ((float) (resources.getDisplayMetrics().widthPixels - (AnonymousClass04F.A03(viewGroup) + AnonymousClass04F.A02(viewGroup)))) / 4.4f;
            if (C36441kJ.A00(resources, R.dimen.f7nameremoved) > A03) {
                View A02 = C012005e.A02(A0E, R.id.category_icon);
                int floor = (int) Math.floor(((double) A03) / 1.5d);
                A02.getLayoutParams().width = floor;
                C36411kG.A1A(A02, floor);
            }
            A0E.getLayoutParams().width = (int) A03;
        }
        C57982z8 r1 = this.A01;
        List list = AnonymousClass0D3.A0I;
        return new C42121yJ(A0E, (C1258561o) r1.A00.A01.A00.A1Q.get());
    }
}
