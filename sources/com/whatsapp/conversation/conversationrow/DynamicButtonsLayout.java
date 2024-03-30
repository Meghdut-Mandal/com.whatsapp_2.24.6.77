package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1QZ;
import X.AnonymousClass3CO;
import X.AnonymousClass3EY;
import X.AnonymousClass3YL;
import X.C012005e;
import X.C18700tb;
import X.C18740tg;
import X.C33511fU;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import X.C36441kJ;
import X.C39251ra;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

public class DynamicButtonsLayout extends ViewGroup implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public final List A02;
    public final View[] A03;
    public final View[] A04;

    public DynamicButtonsLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private View A01(int i) {
        int i2;
        C18740tg.A0B(true);
        View[] viewArr = this.A04;
        if (viewArr[i] == null) {
            if (i != 0) {
                i2 = R.id.quick_reply_btn_background_2;
                if (i != 1) {
                    if (i == 2) {
                        i2 = R.id.quick_reply_btn_background_3;
                    }
                    View view = viewArr[i];
                    C18740tg.A04(view);
                    C36371kC.A13(getContext(), view, R.drawable.balloon_incoming_normal_stkr);
                }
            } else {
                i2 = R.id.quick_reply_btn_background_1;
            }
            viewArr[i] = findViewById(i2);
            View view2 = viewArr[i];
            C18740tg.A04(view2);
            C36371kC.A13(getContext(), view2, R.drawable.balloon_incoming_normal_stkr);
        }
        return viewArr[i];
    }

    private View A02(int i) {
        int i2;
        C18740tg.A0B(true);
        View[] viewArr = this.A03;
        if (viewArr[i] == null) {
            if (i != 0) {
                i2 = R.id.quick_reply_btn_2;
                if (i != 1) {
                    if (i == 2) {
                        i2 = R.id.quick_reply_btn_3;
                    }
                    C33511fU.A03((TextView) viewArr[i]);
                }
            } else {
                i2 = R.id.quick_reply_btn_1;
            }
            viewArr[i] = findViewById(i2);
            C33511fU.A03((TextView) viewArr[i]);
        }
        return viewArr[i];
    }

    public static int A00(View view) {
        if (view == null) {
            return 0;
        }
        int applyDimension = (int) TypedValue.applyDimension(1, 11.0f, C36361kB.A0B(view));
        int textSize = (int) ((TextView) view).getTextSize();
        return Math.max((applyDimension * 2) + textSize, (int) TypedValue.applyDimension(1, 40.0f, C36361kB.A0B(view)));
    }

    public void A04(AnonymousClass3CO r8, List list) {
        boolean z;
        View view;
        View view2;
        List list2 = this.A02;
        list2.clear();
        int min = Math.min(3, list.size());
        for (int i = 0; i < min; i++) {
            list2.add(list.get(i));
        }
        int i2 = 0;
        do {
            if (list2.size() > i2) {
                z = true;
                view = A02(i2);
                view2 = A01(i2);
            } else {
                z = false;
                view = this.A04[i2];
                view2 = this.A03[i2];
            }
            if (!(view == null || view2 == null)) {
                int i3 = 8;
                view.setVisibility(C36381kD.A09(z));
                if (z) {
                    i3 = 0;
                }
                view2.setVisibility(i3);
            }
            if (z) {
                TextView textView = (TextView) A02(i2);
                textView.setVisibility(0);
                textView.setText(((AnonymousClass3EY) list2.get(i2)).A03);
                textView.setSelected(((AnonymousClass3EY) list2.get(i2)).A00);
                View A012 = A01(i2);
                A012.setVisibility(0);
                if (((AnonymousClass3EY) list2.get(i2)).A00) {
                    A012.setClickable(false);
                } else {
                    A012.setClickable(true);
                    A012.setOnClickListener(new AnonymousClass3YL(this, i2, 2, r8));
                }
                A012.setContentDescription(((AnonymousClass3EY) list2.get(i2)).A03);
                A012.setLongClickable(true);
                C012005e.A0V(A012, new C39251ra(this, i2));
            }
            i2++;
        } while (i2 < 3);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, C36361kB.A0B(this));
        int applyDimension2 = (int) TypedValue.applyDimension(1, 2.0f, C36361kB.A0B(this));
        int right = getRight() - getLeft();
        View[] viewArr = this.A03;
        int i6 = 0;
        int A002 = A00(viewArr[0]);
        int measuredWidth = getMeasuredWidth();
        boolean z2 = true;
        if (this.A02.size() != 2 || viewArr[0].getMeasuredWidth() > (i5 = (measuredWidth / 2) - (applyDimension * 2)) || viewArr[1].getMeasuredWidth() > i5) {
            z2 = false;
        }
        int i7 = applyDimension2 / 2;
        int i8 = i7;
        do {
            View view = viewArr[i6];
            if (view != null) {
                View[] viewArr2 = this.A04;
                if (viewArr2[i6] != null && view.getVisibility() == 0) {
                    if (i6 != 0 || !z2) {
                        int width = getWidth();
                        View view2 = viewArr[i6];
                        View view3 = viewArr2[i6];
                        int max = Math.max((right - view2.getMeasuredWidth()) / 2, applyDimension);
                        int measuredHeight = (A002 - view2.getMeasuredHeight()) / 2;
                        view3.layout(-applyDimension2, i7, width + applyDimension2, A002 + i7 + applyDimension2);
                        int i9 = i7 + measuredHeight;
                        view2.layout(max, i9, width - max, view2.getMeasuredHeight() + i9 + applyDimension2);
                        i6++;
                    } else {
                        int width2 = getWidth();
                        View view4 = viewArr[0];
                        View view5 = viewArr2[0];
                        View view6 = viewArr[1];
                        View view7 = viewArr2[1];
                        int i10 = width2 / 2;
                        int measuredHeight2 = (A002 - view4.getMeasuredHeight()) / 2;
                        int measuredHeight3 = (A002 - view6.getMeasuredHeight()) / 2;
                        int max2 = Math.max((i10 - view4.getMeasuredWidth()) / 2, applyDimension);
                        int max3 = Math.max((i10 - view6.getMeasuredWidth()) / 2, applyDimension);
                        int i11 = A002 + i7 + applyDimension2;
                        view5.layout(-applyDimension2, i7, i10 + i8, i11);
                        view7.layout(i10 - i8, i7, width2 + applyDimension2, i11);
                        view4.layout(max2, measuredHeight2 + i7, i10 - max2, measuredHeight2 + view4.getMeasuredHeight() + i7);
                        view6.layout(i10 + max3, measuredHeight3 + i7, width2 - max3, measuredHeight3 + view4.getMeasuredHeight() + i7);
                        i6 = 2;
                    }
                    i7 += A002;
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (i6 < 3);
    }

    public int A03(int i) {
        View[] viewArr;
        int i2;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, C36361kB.A0B(this));
        int i3 = 0;
        do {
            viewArr = this.A03;
            if (viewArr[i3] != null) {
                View[] viewArr2 = this.A04;
                if (viewArr2[i3] != null && viewArr[i3].getVisibility() == 0) {
                    C36411kG.A1B(viewArr[i3], i - (applyDimension * 2), Integer.MIN_VALUE);
                    C36331k8.A0x(viewArr2[i3]);
                }
            }
            i3++;
        } while (i3 < 3);
        List list = this.A02;
        boolean z = true;
        if (list.size() != 2 || viewArr[0].getMeasuredWidth() > (i2 = (i / 2) - (applyDimension * 2)) || viewArr[1].getMeasuredWidth() > i2) {
            z = false;
        }
        int size = list.size();
        if (z) {
            size--;
        }
        int A002 = A00(viewArr[0]) * size;
        if (A002 != 0) {
            A002 += (int) TypedValue.applyDimension(1, 1.0f, C36361kB.A0B(this));
        }
        AnonymousClass000.A16(this, A002, 1073741824, View.MeasureSpec.makeMeasureSpec(i, 1073741824));
        return A002;
    }

    public DynamicButtonsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = new View[3];
        this.A04 = new View[3];
        this.A02 = AnonymousClass001.A0I();
        View.inflate(context, R.layout.f9nameremoved, this);
    }

    public DynamicButtonsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
