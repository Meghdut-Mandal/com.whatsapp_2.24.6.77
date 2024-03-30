package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.7ve  reason: invalid class name and case insensitive filesystem */
public class C166377ve extends FrameLayout implements C18700tb {
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public AnonymousClass1QZ A04;
    public boolean A05;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void setBottomDividerSpaceVisibility(int i) {
        float f = 0.0f;
        if (i == 0) {
            f = 24.0f;
        }
        setPadding(C65103Qt.A01(getContext(), 24.0f), 0, C65103Qt.A01(getContext(), 24.0f), C65103Qt.A01(getContext(), f));
    }

    public void setCard(C175798b4 r8) {
        int A002;
        TextView textView = this.A02;
        Context context = getContext();
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = C175798b4.A03(r8.A01);
        A0M[1] = C207249un.A07(r8.A00);
        C36341k9.A0s(context, textView, A0M, R.string.f12nameremoved);
        TextView textView2 = this.A03;
        C36341k9.A0s(getContext(), textView2, new Object[]{C207249un.A06(r8)}, R.string.f12nameremoved);
        ImageView imageView = this.A01;
        int i = r8.A01;
        if (i == 0) {
            A002 = R.drawable.card_default;
        } else {
            A002 = C203449o2.A00(i);
        }
        imageView.setImageResource(A002);
    }

    public void setCardNameTextViewVisibility(int i) {
        this.A02.setVisibility(i);
    }

    public void setCardNetworkIconVisibility(int i) {
        this.A01.setVisibility(i);
    }

    public void setCardNumberTextColor(int i) {
        this.A03.setTextColor(i);
    }

    public C166377ve(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        setBottomDividerSpaceVisibility(0);
        this.A02 = C36391kE.A0P(this, R.id.card_name);
        this.A03 = C36391kE.A0P(this, R.id.card_number);
        this.A01 = C36391kE.A0N(this, R.id.card_network_icon);
        this.A00 = C36391kE.A0N(this, R.id.card_view_background);
        this.A00.setImageDrawable(new C91224bf(context));
        this.A00.setClipToOutline(true);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((int) (((float) (View.MeasureSpec.getSize(i) - (getPaddingLeft() + getPaddingRight()))) * 0.62f)) + getPaddingTop() + getPaddingBottom(), 1073741824));
    }
}
