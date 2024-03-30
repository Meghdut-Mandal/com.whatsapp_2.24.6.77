package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.bonsai.commands.BotCommandsPickerView;
import com.whatsapp.mentions.MentionPickerView;

/* renamed from: X.2HA  reason: invalid class name */
public abstract class AnonymousClass2HA extends AnonymousClass285 {
    public View A00;
    public C20810yC A01;
    public int A02;
    public ValueAnimator A03;
    public View A04;

    public double getAvailableScreenHeightPercentage() {
        return 0.5d;
    }

    public abstract View getContentView();

    public static void A02(AnonymousClass2HA r2) {
        if (r2.A04 != null) {
            ViewGroup.LayoutParams layoutParams = r2.getContentView().getLayoutParams();
            layoutParams.width = r2.A04.getWidth();
            r2.getContentView().setLayoutParams(layoutParams);
        }
    }

    public void A04() {
        if (this instanceof MentionPickerView) {
            MentionPickerView mentionPickerView = (MentionPickerView) this;
            if (mentionPickerView.A0O) {
                mentionPickerView.A06(mentionPickerView.A0L.A06.size(), mentionPickerView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
            } else {
                mentionPickerView.A06(0, 0);
            }
        } else {
            BotCommandsPickerView botCommandsPickerView = (BotCommandsPickerView) this;
            C40571vl r0 = botCommandsPickerView.A00;
            if (r0 != null) {
                botCommandsPickerView.A08(r0.A01.size());
            }
        }
    }

    public void A05(int i) {
        int i2;
        if (i != this.A02) {
            this.A02 = i;
            ValueAnimator valueAnimator = this.A03;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (AnonymousClass000.A1Q(getVisibility())) {
                i2 = getHeight();
            } else {
                i2 = 0;
            }
            int[] A1O = C36441kJ.A1O();
            A1O[0] = i2;
            ValueAnimator A0C = C36411kG.A0C(A1O, i);
            this.A03 = A0C;
            C53562rW.A00(A0C, this, 3);
            this.A03.addListener(new AnonymousClass4VI(this, i, 0));
            this.A03.setDuration(250);
            this.A03.start();
        }
    }

    public void A06(int i, int i2) {
        int i3;
        if (i != 0) {
            if (this.A01.A0E(571)) {
                i3 = i2 * Math.min(2, i);
            } else {
                int actionBarSize = getActionBarSize();
                Display defaultDisplay = C21060yb.A01(getContext()).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                int i4 = point.y;
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                View view = this.A00;
                if (view == null) {
                    view = (View) getParent().getParent();
                    this.A00 = view;
                }
                view.getLocationOnScreen(iArr2);
                double d = (double) i2;
                int min = Math.min((int) (((((double) i4) * 0.5d) - ((double) actionBarSize)) - ((double) ((int) (1.25d * d)))), (C36431kI.A04(this, iArr[1]) - iArr2[1]) - ((int) (0.6d * d))) / i2;
                if (i > min) {
                    i3 = (min * i2) + ((int) (d * 0.5d));
                } else {
                    i3 = i2 * i;
                }
            }
            if (i3 != 0) {
                A05(i3);
                return;
            }
        }
        if (getVisibility() == 0) {
            A05(0);
        }
    }

    public void A07(boolean z) {
        if (this instanceof MentionPickerView) {
            AnonymousClass4R7 r0 = ((MentionPickerView) this).A0J;
            if (r0 != null) {
                r0.BTF(z);
                return;
            }
            return;
        }
        C87064Ni r02 = ((BotCommandsPickerView) this).A01;
        if (r02 != null) {
            C70803fk r1 = ((C69543dh) r02).A00;
            int i = R.drawable.ib_new_expanded_bottom;
            if (!z) {
                i = r1.A1i(2);
            }
            r1.A23(i);
            C70803fk.A10(r1);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.A04 != null && getVisibility() == 0) {
            C90104Zc.A00(getViewTreeObserver(), this, 15);
        }
    }

    public void setAnchorWidthView(View view) {
        this.A04 = view;
        A02(this);
    }

    private int getActionBarSize() {
        TypedArray obtainStyledAttributes = C36361kB.A09(this).obtainStyledAttributes(new int[]{16843499});
        try {
            return (int) obtainStyledAttributes.getDimension(0, 0.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public AnonymousClass2HA(Context context) {
        super(context);
    }

    public void setConstraintParentView(View view) {
        this.A00 = view;
    }

    public AnonymousClass2HA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AnonymousClass2HA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
