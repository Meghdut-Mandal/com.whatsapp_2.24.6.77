package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;

/* renamed from: X.07J  reason: invalid class name */
public class AnonymousClass07J implements AnonymousClass07I {
    public int A00 = 0;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;
    public View A06;
    public Window.Callback A07;
    public C09460cP A08;
    public Toolbar A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public boolean A0C;
    public CharSequence A0D;
    public boolean A0E;

    public void BsU(CharSequence charSequence) {
        this.A0E = true;
        this.A0B = charSequence;
        if ((this.A01 & 8) != 0) {
            this.A09.setTitle(charSequence);
        }
    }

    public static void A00(AnonymousClass07J r2) {
        Drawable drawable;
        int i = r2.A01;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = r2.A04) == null) {
            drawable = r2.A03;
        }
        r2.A09.setLogo(drawable);
    }

    public void B5c() {
        C09460cP r0;
        ActionMenuView actionMenuView = this.A09.A09;
        if (actionMenuView != null && (r0 = actionMenuView.A04) != null) {
            r0.A01();
            AnonymousClass0Fd r02 = r0.A0B;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    public void Bqi(View view) {
        View view2 = this.A06;
        if (!(view2 == null || (this.A01 & 16) == 0)) {
            this.A09.removeView(view2);
        }
        this.A06 = view;
        if (view != null && (this.A01 & 16) != 0) {
            this.A09.addView(view);
        }
    }

    public void Bqm(int i) {
        View view;
        CharSequence charSequence;
        Drawable drawable;
        int i2 = this.A01 ^ i;
        this.A01 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    CharSequence charSequence2 = this.A0A;
                    boolean isEmpty = TextUtils.isEmpty(charSequence2);
                    Toolbar toolbar = this.A09;
                    if (isEmpty) {
                        toolbar.setNavigationContentDescription(this.A00);
                    } else {
                        toolbar.setNavigationContentDescription(charSequence2);
                    }
                }
                int i3 = this.A01 & 4;
                Toolbar toolbar2 = this.A09;
                if (i3 != 0) {
                    drawable = this.A05;
                    if (drawable == null) {
                        drawable = this.A02;
                    }
                } else {
                    drawable = null;
                }
                toolbar2.setNavigationIcon(drawable);
            }
            if ((i2 & 3) != 0) {
                A00(this);
            }
            if ((i2 & 8) != 0) {
                int i4 = i & 8;
                Toolbar toolbar3 = this.A09;
                if (i4 != 0) {
                    toolbar3.setTitle(this.A0B);
                    charSequence = this.A0D;
                } else {
                    charSequence = null;
                    toolbar3.setTitle((CharSequence) null);
                }
                toolbar3.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.A06) != null) {
                int i5 = i & 16;
                Toolbar toolbar4 = this.A09;
                if (i5 != 0) {
                    toolbar4.addView(view);
                } else {
                    toolbar4.removeView(view);
                }
            }
        }
    }

    public void BrJ(Drawable drawable) {
        this.A05 = drawable;
        int i = this.A01 & 4;
        Toolbar toolbar = this.A09;
        Drawable drawable2 = null;
        if (i != 0) {
            drawable2 = drawable;
            if (drawable == null) {
                drawable2 = this.A02;
            }
        }
        toolbar.setNavigationIcon(drawable2);
    }

    public void BsP(CharSequence charSequence) {
        this.A0D = charSequence;
        if ((this.A01 & 8) != 0) {
            this.A09.setSubtitle(charSequence);
        }
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.A0E) {
            this.A0B = charSequence;
            if ((this.A01 & 8) != 0) {
                this.A09.setTitle(charSequence);
            }
        }
    }

    public AnonymousClass07J(Toolbar toolbar, boolean z) {
        String string;
        Drawable drawable;
        this.A09 = toolbar;
        CharSequence charSequence = toolbar.A0E;
        this.A0B = charSequence;
        this.A0D = toolbar.A0D;
        this.A0E = charSequence != null;
        this.A05 = toolbar.getNavigationIcon();
        Context context = toolbar.getContext();
        C010404j r3 = new C010404j(context, context.obtainStyledAttributes((AttributeSet) null, AnonymousClass1MJ.A00, R.attr.f4nameremoved, 0));
        this.A02 = r3.A02(15);
        if (z) {
            TypedArray typedArray = r3.A02;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                BsU(text);
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                BsP(text2);
            }
            Drawable A022 = r3.A02(20);
            if (A022 != null) {
                this.A04 = A022;
                A00(this);
            }
            Drawable A023 = r3.A02(17);
            if (A023 != null) {
                this.A03 = A023;
                A00(this);
            }
            if (this.A05 == null && (drawable = this.A02) != null) {
                BrJ(drawable);
            }
            Bqm(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                Bqi(LayoutInflater.from(this.A09.getContext()).inflate(resourceId, this.A09, false));
                Bqm(this.A01 | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.A09.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.A09.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                this.A09.A0H(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Toolbar toolbar2 = this.A09;
                toolbar2.A0J(toolbar2.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Toolbar toolbar3 = this.A09;
                toolbar3.A0I(toolbar3.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                this.A09.setPopupTheme(resourceId4);
            }
        } else {
            Toolbar toolbar4 = this.A09;
            int i = 11;
            if (toolbar4.getNavigationIcon() != null) {
                i = 15;
                this.A02 = toolbar4.getNavigationIcon();
            }
            this.A01 = i;
        }
        r3.A02.recycle();
        if (R.string.f12nameremoved != this.A00) {
            this.A00 = R.string.f12nameremoved;
            if (TextUtils.isEmpty(this.A09.getNavigationContentDescription())) {
                int i2 = this.A00;
                if (i2 == 0) {
                    string = null;
                } else {
                    string = this.A09.getContext().getString(i2);
                }
                this.A0A = string;
                if ((this.A01 & 4) != 0) {
                    boolean isEmpty = TextUtils.isEmpty(string);
                    Toolbar toolbar5 = this.A09;
                    if (isEmpty) {
                        toolbar5.setNavigationContentDescription(this.A00);
                    } else {
                        toolbar5.setNavigationContentDescription(this.A0A);
                    }
                }
            }
        }
        this.A0A = this.A09.getNavigationContentDescription();
        this.A09.setNavigationOnClickListener(new AnonymousClass07K(this));
    }
}
