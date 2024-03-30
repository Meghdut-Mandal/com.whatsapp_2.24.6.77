package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import java.util.Objects;

/* renamed from: X.3ZS  reason: invalid class name */
public final class AnonymousClass3ZS implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ TextView A03;
    public final /* synthetic */ Toolbar A04;
    public final /* synthetic */ AnonymousClass4V6 A05;
    public final /* synthetic */ AnonymousClass385 A06;
    public final /* synthetic */ C52562pd A07;

    public AnonymousClass3ZS(View view, ViewGroup viewGroup, TextView textView, Toolbar toolbar, AnonymousClass4V6 r5, AnonymousClass385 r6, C52562pd r7, int i) {
        this.A05 = r5;
        this.A07 = r7;
        this.A06 = r6;
        this.A03 = textView;
        this.A02 = viewGroup;
        this.A00 = i;
        this.A04 = toolbar;
        this.A01 = view;
    }

    public void onGlobalLayout() {
        int i;
        int measuredWidth;
        ValueAnimator duration;
        AnonymousClass4V6 r7 = this.A05;
        C52562pd r2 = this.A07;
        View findViewById = r7.findViewById(r2.tooltipMenuItemId);
        if (findViewById != null) {
            AnonymousClass385 r6 = this.A06;
            TextView textView = this.A03;
            C18820ts r15 = r6.A02;
            C36361kB.A0z(r7.BoP(), textView, r15, R.drawable.tooltip_ptt_reversed);
            textView.setText(r2.tooltipText);
            textView.setVisibility(0);
            C33521fV.A00(r7.getWAContext().A00, r7.getSystemServices(), r7.getString(r2.tooltipText));
            ViewGroup viewGroup = this.A02;
            int i2 = this.A00;
            Toolbar toolbar = this.A04;
            Context context = r7.getWAContext().A00;
            AnonymousClass00C.A08(context);
            int A012 = C65103Qt.A01(context, 30.0f);
            int[] iArr = new int[2];
            findViewById.getLocationInWindow(iArr);
            textView.measure(0, 0);
            if (toolbar != null) {
                i = toolbar.getMeasuredHeight();
            } else {
                i = 0;
            }
            int A013 = (i2 + i) - C65103Qt.A01(r7.getWAContext().A00, 20.0f);
            int A052 = C36441kJ.A05(context.getResources(), r2.tooltipMaxWidth);
            int measuredWidth2 = findViewById.getMeasuredWidth() / 2;
            if (C36351kA.A1Y(r15)) {
                measuredWidth = iArr[0] + measuredWidth2;
            } else {
                measuredWidth = viewGroup.getMeasuredWidth() - (iArr[0] + measuredWidth2);
            }
            int i3 = measuredWidth + A012;
            int min = Math.min(A052, textView.getMeasuredWidth());
            int i4 = i3;
            if (i3 > min) {
                i4 = min;
            }
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.width = i4;
            textView.setLayoutParams(layoutParams);
            AnonymousClass1JZ.A06(textView, r15, i3 - i4, A013, 0, 0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{0.0f, 1.0f});
            r6.A00 = ofFloat;
            if (!(ofFloat == null || (duration = ofFloat.setDuration(320)) == null)) {
                duration.start();
            }
            r7.getGlobalUI().A0I(r6.A03, 10000);
            C36351kA.A1C(this.A01, this);
        }
    }
}
