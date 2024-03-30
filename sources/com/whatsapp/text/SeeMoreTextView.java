package com.whatsapp.text;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass4VU;
import X.C36371kC;
import X.C36391kE;
import X.C36421kH;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SeeMoreTextView extends WaTextView {
    public String A00;
    public String A01;
    public String A02;
    public boolean A03 = false;
    public final Paint A04 = C36441kJ.A0K();

    public void onMeasure(int i, int i2) {
        int size;
        SpannableStringBuilder A0P;
        ArrayList arrayList;
        int i3 = i;
        if (!this.A03 && (size = View.MeasureSpec.getSize(i3) - AnonymousClass000.A09(this)) > 0) {
            String A0u = C36371kC.A0u(this);
            String A0u2 = C36371kC.A0u(this);
            ArrayList A0I = AnonymousClass001.A0I();
            ArrayList A0I2 = AnonymousClass001.A0I();
            for (String str : A0u2.split("\\s")) {
                Paint paint = this.A04;
                float f = (float) size;
                if (paint.measureText(str) < f) {
                    A07(paint, str, A0I, A0I2, size);
                } else {
                    if (!TextUtils.isEmpty(str) && paint.measureText(str) > f) {
                        ArrayList A0I3 = AnonymousClass001.A0I();
                        int i4 = 0;
                        int i5 = 1;
                        while (true) {
                            int length = str.length();
                            if (i5 > length) {
                                arrayList = A0I3;
                                break;
                            }
                            if (paint.measureText(str.substring(i4, i5)) >= f) {
                                int i6 = i5 - 1;
                                A0I3.add(str.substring(i4, i6));
                                i4 = i6;
                            }
                            if (i5 == length) {
                                A0I3.add(str.substring(i4, i5));
                            }
                            i5++;
                        }
                    } else {
                        arrayList = Collections.singletonList(str);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        A07(paint, AnonymousClass001.A0C(it), A0I, A0I2, size);
                    }
                }
            }
            if (!A0I2.isEmpty()) {
                A0I.add(TextUtils.join(" ", A0I2));
            }
            if (A0I.size() > 3) {
                if (A0I.size() <= 3) {
                    A0P = C36441kJ.A0P(TextUtils.join("\n", A0I));
                } else {
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    A0u3.append(this.A00);
                    String A0q = AnonymousClass000.A0q(this.A02, A0u3);
                    StringBuilder A0u4 = AnonymousClass000.A0u();
                    int i7 = 0;
                    while (true) {
                        String A0e = C36421kH.A0e(A0I, i7);
                        if (i7 != 2) {
                            A0u4.append(A0e);
                            A0u4.append("\n");
                            i7++;
                            if (i7 >= 3) {
                                break;
                            }
                        } else {
                            A0u4.append(A0e.subSequence(0, AnonymousClass001.A02(A0e.length(), A0q.length(), 0)));
                            A0u4.append(A0q);
                            break;
                        }
                    }
                    String obj = A0u4.toString();
                    A0P = C36441kJ.A0P(obj);
                    A0P.setSpan(new AnonymousClass4VU(this, 5), obj.indexOf(A0q), obj.length(), 0);
                }
                if (!A0u.equals(A0P.toString())) {
                    C36391kE.A1J(this);
                    super.setText(A0P, TextView.BufferType.SPANNABLE);
                }
            } else {
                String join = TextUtils.join("\n", A0I);
                if (!A0u.equals(join)) {
                    super.setText(join);
                }
            }
        }
        super.onMeasure(i3, i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.A03 = bundle.getBoolean("is_expanded");
            String string = bundle.getString("original_text");
            if (string == null) {
                string = "";
            }
            this.A01 = string;
            parcelable = bundle.getParcelable("super_state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setText(String str) {
        this.A01 = str;
        super.setText(str);
    }

    public SeeMoreTextView(Context context) {
        super(context);
        A06();
    }

    private void A06() {
        this.A00 = getContext().getString(R.string.f12nameremoved);
        this.A02 = getContext().getString(R.string.f12nameremoved);
        this.A01 = C36371kC.A0u(this);
        Paint paint = this.A04;
        paint.setTextSize(getTextSize());
        paint.setTypeface(getTypeface());
    }

    public static void A07(Paint paint, String str, ArrayList arrayList, ArrayList arrayList2, int i) {
        arrayList2.add(str);
        if (paint.measureText(TextUtils.join(" ", arrayList2)) >= ((float) i)) {
            arrayList2.remove(arrayList2.size() - 1);
            arrayList.add(TextUtils.join(" ", arrayList2));
            arrayList2.clear();
            arrayList2.add(str);
        }
    }

    public Parcelable onSaveInstanceState() {
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("super_state", super.onSaveInstanceState());
        A07.putBoolean("is_expanded", this.A03);
        A07.putString("original_text", this.A01);
        return A07;
    }

    public SeeMoreTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A06();
    }

    public SeeMoreTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A06();
    }
}
