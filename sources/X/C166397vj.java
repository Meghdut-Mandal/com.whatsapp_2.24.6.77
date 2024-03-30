package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.7vj  reason: invalid class name and case insensitive filesystem */
public abstract class C166397vj extends LinearLayout {
    public int A00 = 2;
    public ImageView A01;
    public LinearLayout A02;
    public View.OnClickListener A03;
    public FrameLayout A04;
    public TextView A05;
    public CharSequence A06;
    public CharSequence A07;
    public ViewGroup A08;
    public TextView A09;
    public final List A0A = AnonymousClass001.A0I();

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.util.List r8) {
        /*
            r7 = this;
            java.util.List r3 = r7.A0A
            r3.clear()
            android.widget.LinearLayout r0 = r7.A02
            r0.removeAllViews()
            boolean r1 = r8.isEmpty()
            r4 = 8
            r2 = 0
            android.widget.FrameLayout r0 = r7.A04
            if (r1 == 0) goto L_0x0091
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L_0x00ad
            android.widget.FrameLayout r0 = r7.A04
            r0.setVisibility(r2)
        L_0x0020:
            android.view.ViewGroup r0 = r7.A08
            r0.setVisibility(r4)
        L_0x0025:
            int r1 = r8.size()
            int r0 = r7.A00
            int r0 = java.lang.Math.min(r1, r0)
            java.util.List r0 = r8.subList(r2, r0)
            r3.addAll(r0)
        L_0x0036:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x00c1
            java.lang.Object r6 = r8.get(r2)
            r4 = r7
            com.whatsapp.payments.ui.widget.TransactionsExpandableView r4 = (com.whatsapp.payments.ui.widget.TransactionsExpandableView) r4
            X.9lY r6 = (X.C202319lY) r6
            X.9Kh r5 = r4.A00
            int r1 = r6.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x0085
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x0085
            android.content.Context r0 = r5.A01
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131625813(0x7f0e0755, float:1.8878845E38)
            android.view.View r5 = X.C36361kB.A0E(r1, r4, r0)
        L_0x005e:
            java.lang.Object r4 = r8.get(r2)
            int r1 = r3.size()
            r0 = r5
            X.7jh r0 = (X.C159647jh) r0
            r0.B1s(r4)
            int r4 = r1 + -1
            r0 = 2131429619(0x7f0b08f3, float:1.8480916E38)
            android.view.View r1 = r5.findViewById(r0)
            r0 = 8
            if (r2 >= r4) goto L_0x007a
            r0 = 0
        L_0x007a:
            r1.setVisibility(r0)
            android.widget.LinearLayout r0 = r7.A02
            r0.addView(r5)
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0085:
            android.content.Context r4 = r5.A01
            X.Az8 r1 = r5.A02
            int r0 = r5.A00
            X.8li r5 = new X.8li
            r5.<init>(r4, r1, r0)
            goto L_0x005e
        L_0x0091:
            r0.setVisibility(r4)
            int r1 = r8.size()
            int r0 = r7.A00
            if (r1 <= r0) goto L_0x0020
            android.view.ViewGroup r0 = r7.A08
            r0.setVisibility(r2)
            android.widget.TextView r1 = r7.A09
            java.lang.CharSequence r0 = r7.A07
            r1.setText(r0)
            android.view.ViewGroup r1 = r7.A08
            android.view.View$OnClickListener r0 = r7.A03
            goto L_0x00bc
        L_0x00ad:
            android.view.ViewGroup r0 = r7.A08
            r0.setVisibility(r2)
            android.widget.TextView r1 = r7.A09
            java.lang.CharSequence r0 = r7.A06
            r1.setText(r0)
            android.view.ViewGroup r1 = r7.A08
            r0 = 0
        L_0x00bc:
            r1.setOnClickListener(r0)
            goto L_0x0025
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166397vj.A01(java.util.List):void");
    }

    public void setCustomEmptyView(View view) {
        this.A04.addView(view);
    }

    public void setSeeMoreView(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.A07 = charSequence;
        this.A06 = charSequence2;
        this.A03 = onClickListener;
    }

    public void setTitle(CharSequence charSequence) {
        this.A05.setText(charSequence);
        this.A05.setVisibility(0);
    }

    public C166397vj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        setOrientation(1);
        this.A05 = C36391kE.A0O(this, R.id.header);
        this.A08 = C36411kG.A0O(this, R.id.see_more_container);
        this.A01 = C36401kF.A0G(this, R.id.see_more_icon);
        this.A09 = C36391kE.A0O(this, R.id.see_more_text);
        this.A04 = (FrameLayout) C012005e.A02(this, R.id.custom_empty_view_container);
        this.A02 = C90514aH.A0U(this, R.id.list_item_container);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C114025gW.A03);
            try {
                this.A00 = obtainStyledAttributes.getInt(2, 2);
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId > 0) {
                    this.A01.setImageDrawable(context.getResources().getDrawable(resourceId));
                }
                int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId2 > 0) {
                    this.A09.setText(resourceId2);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public ImageView getSeeMoreImageView() {
        return this.A01;
    }

    public int getSizeLimit() {
        return this.A00;
    }

    public void setSizeLimit(int i) {
        this.A00 = i;
    }

    public C166397vj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public C166397vj(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }
}
