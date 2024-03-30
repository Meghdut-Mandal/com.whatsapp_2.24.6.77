package org.npci.upi.security.pinactivitycomponent;

import X.AnonymousClass00F;
import X.C135486cm;
import X.C36351kA;
import X.C36361kB;
import X.C56822ww;
import X.C67143Yr;
import X.C88284Sc;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.whatsapp.R;

public class Keypad extends TableLayout {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public C88284Sc A04;

    public Keypad(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setOnKeyPressCallback(C88284Sc r1) {
        this.A04 = r1;
    }

    private TableRow.LayoutParams getItemParams() {
        return new TableRow.LayoutParams(0, C36351kA.A04(this, (float) this.A01), 1.0f);
    }

    private void setClickFeedback(View view) {
        TypedValue typedValue = new TypedValue();
        C36361kB.A09(this).resolveAttribute(R.attr.f4nameremoved, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public Keypad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = 61;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C56822ww.A02, 0, 0);
        this.A02 = obtainStyledAttributes.getColor(3, AnonymousClass00F.A00(getContext(), R.color.f6nameremoved));
        this.A03 = obtainStyledAttributes.getColor(0, AnonymousClass00F.A00(getContext(), R.color.f6nameremoved));
        this.A00 = (float) obtainStyledAttributes.getDimensionPixelSize(2, 33);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, this.A01);
        obtainStyledAttributes.recycle();
        setBackgroundColor(this.A02);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(-1, 0, 1.0f);
        int i = 1;
        for (int i2 = 0; i2 < 3; i2++) {
            TableRow tableRow = new TableRow(getContext());
            tableRow.setLayoutParams(layoutParams);
            tableRow.setWeightSum(3.0f);
            int i3 = 0;
            do {
                TextView textView = new TextView(getContext());
                textView.setGravity(17);
                textView.setLayoutParams(getItemParams());
                textView.setTextColor(this.A03);
                textView.setTextSize(2, this.A00);
                textView.setText(String.valueOf(i));
                textView.setClickable(true);
                setClickFeedback(textView);
                C67143Yr.A00(textView, this, i, 31);
                tableRow.addView(textView);
                i++;
                i3++;
            } while (i3 < 3);
            addView(tableRow);
        }
        ImageView A0L = C36361kB.A0L(this);
        A0L.setImageResource(R.drawable.ic_action_backspace);
        A0L.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        A0L.setAdjustViewBounds(true);
        TableRow.LayoutParams itemParams = getItemParams();
        itemParams.height = (int) (((float) C36351kA.A04(this, (float) this.A01)) * 1.2f);
        A0L.setLayoutParams(itemParams);
        A0L.setClickable(true);
        setClickFeedback(A0L);
        C36351kA.A1E(A0L, this, 48);
        TextView textView2 = new TextView(getContext());
        textView2.setLayoutParams(getItemParams());
        textView2.setGravity(17);
        textView2.setText(String.valueOf(0));
        textView2.setTextColor(this.A03);
        textView2.setTextSize(2, this.A00);
        textView2.setClickable(true);
        setClickFeedback(textView2);
        C36351kA.A1E(textView2, this, 49);
        ImageView A0L2 = C36361kB.A0L(this);
        A0L2.setImageResource(R.drawable.ic_action_submit);
        A0L2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        A0L2.setAdjustViewBounds(true);
        TableRow.LayoutParams itemParams2 = getItemParams();
        itemParams2.height = (int) (((float) C36351kA.A04(this, (float) this.A01)) * 1.1f);
        A0L2.setLayoutParams(itemParams2);
        A0L2.setClickable(true);
        setClickFeedback(A0L2);
        A0L2.setOnClickListener(new C135486cm(this, 0));
        TableRow tableRow2 = new TableRow(getContext());
        tableRow2.setLayoutParams(layoutParams);
        tableRow2.setWeightSum(3.0f);
        tableRow2.addView(A0L);
        tableRow2.addView(textView2);
        tableRow2.addView(A0L2);
        addView(tableRow2);
    }
}
