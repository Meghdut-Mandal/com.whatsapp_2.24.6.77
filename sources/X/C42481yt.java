package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.SegmentedProgressBar;
import com.whatsapp.storage.SizeTickerView;

/* renamed from: X.1yt  reason: invalid class name and case insensitive filesystem */
public class C42481yt extends AnonymousClass0D3 {
    public long A00;
    public long A01;
    public AnimatorSet A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final View A07;
    public final C19700wN A08;
    public final WaImageView A09;
    public final WaTextView A0A;
    public final WaTextView A0B;
    public final WaTextView A0C;
    public final WaTextView A0D;
    public final SegmentedProgressBar A0E;
    public final C18820ts A0F;
    public final SizeTickerView A0G;
    public final SizeTickerView A0H;
    public final int[] A0I;

    public C42481yt(View view, C19700wN r11, C18820ts r12) {
        super(view);
        this.A08 = r11;
        this.A0F = r12;
        SizeTickerView sizeTickerView = (SizeTickerView) C012005e.A02(view, R.id.used_space_text);
        this.A0H = sizeTickerView;
        View view2 = this.A0H;
        sizeTickerView.A0D(C36351kA.A02(view2.getContext(), view2.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved), 0, false);
        this.A0D = C36401kF.A0Q(view, R.id.used_space_description_text);
        SizeTickerView sizeTickerView2 = (SizeTickerView) C012005e.A02(view, R.id.free_space_text);
        this.A0G = sizeTickerView2;
        sizeTickerView2.A0D(AnonymousClass00F.A00(view2.getContext(), R.color.f6nameremoved), 0, false);
        this.A09 = C36431kI.A0X(view, R.id.free_space_critical_icon);
        this.A0A = C36401kF.A0Q(view, R.id.free_space_description_text);
        this.A0E = (SegmentedProgressBar) C012005e.A02(view, R.id.progress_bar);
        this.A07 = C012005e.A02(view, R.id.progress_bar_legend_container);
        WaTextView A0Q = C36401kF.A0Q(view, R.id.media_description_text);
        this.A0B = A0Q;
        WaTextView A0Q2 = C36401kF.A0Q(view, R.id.other_description_text);
        this.A0C = A0Q2;
        Context context = view.getContext();
        int[] A1O = C36441kJ.A1O();
        this.A0I = A1O;
        A1O[0] = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        A1O[1] = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A05 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A04 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A06 = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        Drawable A002 = AnonymousClass00E.A00(context, R.drawable.storage_usage_green_circle);
        A002.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        A0Q.setCompoundDrawables(A002, (Drawable) null, (Drawable) null, (Drawable) null);
        Drawable A003 = AnonymousClass00E.A00(context, R.drawable.storage_usage_yellow_circle);
        A003.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        A0Q2.setCompoundDrawables(A003, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
