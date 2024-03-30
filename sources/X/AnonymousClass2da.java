package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.ArrayList;

/* renamed from: X.2da  reason: invalid class name */
public abstract class AnonymousClass2da extends C38241o6 {
    public ViewGroup A00 = C36411kG.A0O(this, R.id.search_message_attachment_container_content);
    public ViewGroup A01 = C36411kG.A0O(this, R.id.search_message_attachment_container_icon);

    public void A03() {
        View view;
        LinearLayout linearLayout;
        boolean z = this instanceof C47112dU;
        if (z) {
            C47112dU r3 = (C47112dU) this;
            r3.A09 = new C38391og(r3.getContext(), r3.A0B);
            int dimensionPixelSize = r3.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            r3.A09.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
            view = r3.A09;
        } else if (this instanceof AnonymousClass2dT) {
            AnonymousClass2dT r32 = (AnonymousClass2dT) this;
            int dimensionPixelSize2 = r32.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            r32.A02 = new WaImageView(r32.getContext());
            r32.A02.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2));
            view = r32.A02;
        } else if (this instanceof C47102dR) {
            C47102dR r33 = (C47102dR) this;
            r33.A00 = new WaImageView(r33.getContext());
            int dimensionPixelSize3 = r33.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            int A012 = A01(r33);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize3, dimensionPixelSize3);
            layoutParams.setMargins(A012, A012, A012, A012);
            r33.A00.setLayoutParams(layoutParams);
            r33.A00.setScaleType(ImageView.ScaleType.FIT_CENTER);
            view = r33.A00;
        } else {
            AnonymousClass2dS r34 = (AnonymousClass2dS) this;
            Context context = r34.getContext();
            r34.A04 = new FrameLayout(context);
            int dimensionPixelSize4 = r34.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            r34.A00 = r34.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            r34.A02 = r34.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            r34.A04.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            r34.A07 = AnonymousClass2dS.A00(context, r34, dimensionPixelSize4);
            ThumbnailButton A002 = AnonymousClass2dS.A00(context, r34, dimensionPixelSize4);
            r34.A06 = A002;
            ArrayList A0I = AnonymousClass001.A0I();
            r34.A0B = A0I;
            A0I.add(r34.A07);
            A0I.add(A002);
            r34.A01 = A01(r34);
            int dimensionPixelSize5 = r34.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            r34.A03 = dimensionPixelSize5;
            AnonymousClass1JZ.A06(r34.A06, r34.A09, dimensionPixelSize5, 0, 0, 0);
            r34.A04.addView(r34.A06);
            r34.A04.addView(r34.A07);
            view = r34.A04;
        }
        if (view != null) {
            this.A01.addView(view);
        }
        if (z) {
            C47112dU r0 = (C47112dU) this;
            r0.A08 = new C38711pZ(r0.getContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            int A013 = A01(r0);
            AnonymousClass1JZ.A07(r0.A08, r0.A03, A013, 0, A013, 0);
            r0.A08.setLayoutParams(layoutParams2);
            linearLayout = r0.A08;
        } else if (this instanceof AnonymousClass2dT) {
            AnonymousClass2dT r02 = (AnonymousClass2dT) this;
            linearLayout = new LinearLayout(r02.getContext());
            linearLayout.setOrientation(1);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.gravity = 16;
            linearLayout.setLayoutParams(layoutParams3);
            int A014 = A01(r02);
            AnonymousClass1JZ.A07(linearLayout, r02.A03, A014, 0, A014, 0);
            r02.A00 = C36351kA.A0C(r02).inflate(R.layout.f9nameremoved, linearLayout, false);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.topMargin = C65103Qt.A01(r02.getContext(), 4.0f);
            layoutParams4.bottomMargin = C65103Qt.A01(r02.getContext(), 4.0f);
            r02.A00.setLayoutParams(layoutParams4);
            r02.A07 = new C38711pZ(C36431kI.A0A(r02.A00, r02, 8));
            r02.A07.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            linearLayout.addView(r02.A07);
            linearLayout.addView(r02.A00);
            this.A00.addView(linearLayout);
        } else if (this instanceof C47102dR) {
            C47102dR r03 = (C47102dR) this;
            r03.A03 = new C38711pZ(r03.getContext());
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
            int A015 = A01(r03);
            AnonymousClass1JZ.A07(r03.A03, r03.A01, 0, 0, A015, 0);
            r03.A03.setLayoutParams(layoutParams5);
            linearLayout = r03.A03;
        } else {
            AnonymousClass2dS r04 = (AnonymousClass2dS) this;
            r04.A0A = new C38711pZ(r04.getContext());
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
            int A016 = A01(r04);
            AnonymousClass1JZ.A07(r04.A0A, r04.A09, 0, 0, A016, 0);
            r04.A0A.setLayoutParams(layoutParams6);
            linearLayout = r04.A0A;
        }
        if (linearLayout == null) {
            return;
        }
        this.A00.addView(linearLayout);
    }

    public AnonymousClass2da(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
    }

    public static int A01(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }
}
