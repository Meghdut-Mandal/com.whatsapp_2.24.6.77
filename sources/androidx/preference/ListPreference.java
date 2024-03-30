package androidx.preference;

import X.AnonymousClass001;
import X.AnonymousClass0Yh;
import X.AnonymousClass9BI;
import X.C165577te;
import X.C167837z4;
import X.C207999xT;
import X.C22849Awy;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ArrayAdapter;
import com.whatsapp.R;

public class ListPreference extends DialogPreference {
    public String A00;
    public CharSequence[] A01;
    public CharSequence[] A02;
    public String A03;
    public boolean A04;

    public CharSequence A04() {
        CharSequence charSequence;
        CharSequence[] charSequenceArr;
        C22849Awy awy = this.A0C;
        if (awy != null) {
            return awy.BmT(this);
        }
        int A0S = A0S(this.A00);
        if (A0S < 0 || (charSequenceArr = this.A01) == null) {
            charSequence = null;
        } else {
            charSequence = charSequenceArr[A0S];
        }
        CharSequence A042 = super.A04();
        String str = this.A03;
        if (str != null) {
            Object[] A0L = AnonymousClass001.A0L();
            if (charSequence == null) {
                charSequence = "";
            }
            A0L[0] = charSequence;
            String format = String.format(str, A0L);
            if (!TextUtils.equals(format, A042)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return A042;
    }

    public void A0C(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(C167837z4.class)) {
            super.A0C(parcelable);
            return;
        }
        C167837z4 r3 = (C167837z4) parcelable;
        super.A0C(r3.getSuperState());
        A0T(r3.A00);
    }

    public int A0S(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.A02) == null) {
            return -1;
        }
        int length = charSequenceArr.length;
        do {
            length--;
            if (length < 0) {
                return -1;
            }
        } while (!this.A02[length].equals(str));
        return length;
    }

    public void A0T(String str) {
        boolean z = !TextUtils.equals(this.A00, str);
        if (z || !this.A04) {
            this.A00 = str;
            this.A04 = true;
            A0K(str);
            if (z) {
                A05();
            }
        }
    }

    public void A0U(CharSequence[] charSequenceArr) {
        if (this instanceof DropDownPreference) {
            DropDownPreference dropDownPreference = (DropDownPreference) this;
            dropDownPreference.A01 = charSequenceArr;
            ArrayAdapter arrayAdapter = dropDownPreference.A03;
            arrayAdapter.clear();
            CharSequence[] charSequenceArr2 = dropDownPreference.A01;
            if (charSequenceArr2 != null) {
                for (CharSequence charSequence : charSequenceArr2) {
                    arrayAdapter.add(charSequence.toString());
                }
                return;
            }
            return;
        }
        this.A01 = charSequenceArr;
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AnonymousClass0Yh.A00(context, R.attr.f4nameremoved, 16842897));
    }

    public void A0H(CharSequence charSequence) {
        String charSequence2;
        super.A0H(charSequence);
        String str = this.A03;
        if (charSequence == null) {
            if (str != null) {
                charSequence2 = null;
            } else {
                return;
            }
        } else if (!charSequence.equals(str)) {
            charSequence2 = charSequence.toString();
        } else {
            return;
        }
        this.A03 = charSequence2;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9BI.A04, i, i2);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.A01 = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.A02 = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            C207999xT r0 = C207999xT.A00;
            if (r0 == null) {
                r0 = new C207999xT();
                C207999xT.A00 = r0;
            }
            this.A0C = r0;
            A05();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AnonymousClass9BI.A06, i, i2);
        this.A03 = C165577te.A0j(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context) {
        this(context, (AttributeSet) null);
    }
}
