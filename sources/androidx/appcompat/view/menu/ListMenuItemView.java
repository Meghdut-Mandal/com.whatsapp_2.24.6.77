package androidx.appcompat.view.menu;

import X.AnonymousClass000;
import X.AnonymousClass080;
import X.AnonymousClass1MJ;
import X.C010404j;
import X.C011504z;
import X.C018707z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.whatsapp.R;

public class ListMenuItemView extends LinearLayout implements AnonymousClass080, AbsListView.SelectionBoundsAdjuster {
    public ImageView A00;
    public LinearLayout A01;
    public TextView A02;
    public C018707z A03;
    public int A04;
    public Context A05;
    public Drawable A06;
    public Drawable A07;
    public LayoutInflater A08;
    public CheckBox A09;
    public ImageView A0A;
    public ImageView A0B;
    public RadioButton A0C;
    public TextView A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.A08;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        this.A08 = from;
        return from;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.A0B;
        if (imageView != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BKf(X.C018707z r10, int r11) {
        /*
            r9 = this;
            r9.A03 = r10
            boolean r1 = r10.isVisible()
            r0 = 8
            if (r1 == 0) goto L_0x000b
            r0 = 0
        L_0x000b:
            r9.setVisibility(r0)
            java.lang.CharSequence r0 = r10.getTitle()
            r9.setTitle(r0)
            boolean r0 = r10.isCheckable()
            r9.setCheckable(r0)
            X.07a r1 = r10.A0A
            boolean r0 = r1.A0I()
            if (r0 == 0) goto L_0x0131
            boolean r0 = r1.A0H()
            if (r0 == 0) goto L_0x012d
            char r0 = r10.A00
        L_0x002c:
            if (r0 == 0) goto L_0x0131
            X.07z r2 = r9.A03
            X.07a r8 = r2.A0A
            boolean r0 = r8.A0I()
            if (r0 == 0) goto L_0x0131
            boolean r1 = r8.A0H()
            if (r1 == 0) goto L_0x0129
            char r0 = r2.A00
        L_0x0040:
            if (r0 == 0) goto L_0x0131
            r6 = 0
            android.widget.TextView r5 = r9.A02
            if (r1 == 0) goto L_0x0125
            char r7 = r2.A00
        L_0x0049:
            if (r7 != 0) goto L_0x007a
            java.lang.String r0 = ""
        L_0x004d:
            r5.setText(r0)
        L_0x0050:
            android.widget.TextView r0 = r9.A02
            int r0 = r0.getVisibility()
            if (r0 == r6) goto L_0x005d
            android.widget.TextView r0 = r9.A02
            r0.setVisibility(r6)
        L_0x005d:
            android.graphics.drawable.Drawable r0 = r10.getIcon()
            r9.setIcon(r0)
            boolean r0 = r10.isEnabled()
            r9.setEnabled(r0)
            boolean r0 = r10.hasSubMenu()
            r9.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r0 = r10.getContentDescription()
            r9.setContentDescription(r0)
            return
        L_0x007a:
            android.content.Context r0 = r8.A0N
            android.content.res.Resources r4 = r0.getResources()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            if (r0 == 0) goto L_0x0098
            r0 = 2131896262(0x7f1227c6, float:1.942738E38)
            java.lang.String r0 = r4.getString(r0)
            r3.append(r0)
        L_0x0098:
            boolean r0 = r8.A0H()
            if (r0 == 0) goto L_0x0121
            int r8 = r2.A03
        L_0x00a0:
            r0 = 2131896258(0x7f1227c2, float:1.9427372E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r8 & r1
            if (r0 != r1) goto L_0x00b0
            r3.append(r2)
        L_0x00b0:
            r0 = 2131896254(0x7f1227be, float:1.9427364E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r8 & r1
            if (r0 != r1) goto L_0x00c0
            r3.append(r2)
        L_0x00c0:
            r0 = 2131896253(0x7f1227bd, float:1.9427362E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 2
            r0 = r8 & 2
            if (r0 != r1) goto L_0x00cf
            r3.append(r2)
        L_0x00cf:
            r0 = 2131896259(0x7f1227c3, float:1.9427374E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 1
            r0 = r8 & 1
            if (r0 != r1) goto L_0x00de
            r3.append(r2)
        L_0x00de:
            r0 = 2131896261(0x7f1227c5, float:1.9427378E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 4
            r0 = r8 & 4
            if (r0 != r1) goto L_0x00ed
            r3.append(r2)
        L_0x00ed:
            r0 = 2131896257(0x7f1227c1, float:1.942737E38)
            java.lang.String r1 = r4.getString(r0)
            r2 = 8
            r0 = r8 & 8
            if (r0 != r2) goto L_0x00fd
            r3.append(r1)
        L_0x00fd:
            r1 = 2131896255(0x7f1227bf, float:1.9427366E38)
            if (r7 == r2) goto L_0x0119
            r0 = 10
            r1 = 2131896256(0x7f1227c0, float:1.9427368E38)
            if (r7 == r0) goto L_0x0119
            r0 = 32
            if (r7 == r0) goto L_0x0116
            r3.append(r7)
        L_0x0110:
            java.lang.String r0 = r3.toString()
            goto L_0x004d
        L_0x0116:
            r1 = 2131896260(0x7f1227c4, float:1.9427376E38)
        L_0x0119:
            java.lang.String r0 = r4.getString(r1)
            r3.append(r0)
            goto L_0x0110
        L_0x0121:
            int r8 = r2.A04
            goto L_0x00a0
        L_0x0125:
            char r7 = r2.A01
            goto L_0x0049
        L_0x0129:
            char r0 = r2.A01
            goto L_0x0040
        L_0x012d:
            char r0 = r10.A01
            goto L_0x002c
        L_0x0131:
            r6 = 8
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.BKf(X.07z, int):void");
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.A0A;
        if (imageView != null && imageView.getVisibility() == 0) {
            rect.top += AnonymousClass000.A0E(AnonymousClass000.A0a(this.A0A), this.A0A.getHeight());
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.A00 != null && this.A0G) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.A00.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (z || this.A0C != null || this.A09 != null) {
            if ((this.A03.A02 & 4) != 0) {
                if (this.A0C == null) {
                    A01();
                }
                compoundButton = this.A0C;
                compoundButton3 = this.A09;
                compoundButton2 = compoundButton3;
            } else {
                if (this.A09 == null) {
                    A00();
                }
                compoundButton = this.A09;
                compoundButton2 = compoundButton;
                compoundButton3 = this.A0C;
            }
            if (z) {
                compoundButton.setChecked(this.A03.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton3 != null && compoundButton3.getVisibility() != 8) {
                    compoundButton3.setVisibility(8);
                    return;
                }
                return;
            }
            if (compoundButton2 != null) {
                compoundButton2.setVisibility(8);
            }
            RadioButton radioButton = this.A0C;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.A03.A02 & 4) != 0) {
            if (this.A0C == null) {
                A01();
            }
            compoundButton = this.A0C;
        } else {
            if (this.A09 == null) {
                A00();
            }
            compoundButton = this.A09;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.A0E = z;
        this.A0G = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r3 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setGroupDividerEnabled(boolean r3) {
        /*
            r2 = this;
            android.widget.ImageView r1 = r2.A0A
            if (r1 == 0) goto L_0x0010
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x000b
            r0 = 0
            if (r3 != 0) goto L_0x000d
        L_0x000b:
            r0 = 8
        L_0x000d:
            r1.setVisibility(r0)
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setGroupDividerEnabled(boolean):void");
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (this.A03.A0A.A0C || this.A0E) {
            z = true;
        } else {
            z = false;
            if (!this.A0G) {
                return;
            }
        }
        if (this.A00 == null) {
            if (drawable != null || this.A0G) {
                ImageView imageView = (ImageView) getInflater().inflate(R.layout.f9nameremoved, this, false);
                this.A00 = imageView;
                LinearLayout linearLayout = this.A01;
                if (linearLayout != null) {
                    linearLayout.addView(imageView, 0);
                } else {
                    addView(imageView, 0);
                }
            } else {
                return;
            }
        }
        if (drawable != null || this.A0G) {
            ImageView imageView2 = this.A00;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.A00.getVisibility() != 0) {
                this.A00.setVisibility(0);
                return;
            }
            return;
        }
        this.A00.setVisibility(8);
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        TextView textView2 = this.A0D;
        if (charSequence != null) {
            textView2.setText(charSequence);
            if (this.A0D.getVisibility() != 0) {
                textView = this.A0D;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (textView2.getVisibility() != 8) {
                textView = this.A0D;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    private void A00() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.f9nameremoved, this, false);
        this.A09 = checkBox;
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    private void A01() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.f9nameremoved, this, false);
        this.A0C = radioButton;
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        C011504z.A04(this.A06, this);
        TextView textView = (TextView) findViewById(R.id.title);
        this.A0D = textView;
        int i = this.A04;
        if (i != -1) {
            textView.setTextAppearance(this.A05, i);
        }
        this.A02 = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.A0B = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.A07);
        }
        this.A0A = (ImageView) findViewById(R.id.group_divider);
        this.A01 = (LinearLayout) findViewById(R.id.content);
    }

    public C018707z getItemData() {
        return this.A03;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C010404j A002 = C010404j.A00(getContext(), attributeSet, AnonymousClass1MJ.A0G, i, 0);
        this.A06 = A002.A02(5);
        TypedArray typedArray = A002.A02;
        this.A04 = typedArray.getResourceId(1, -1);
        this.A0G = typedArray.getBoolean(7, false);
        this.A05 = context;
        this.A07 = A002.A02(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.f4nameremoved, 0);
        this.A0F = obtainStyledAttributes.hasValue(0);
        typedArray.recycle();
        obtainStyledAttributes.recycle();
    }
}
