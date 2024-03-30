package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Kv  reason: invalid class name and case insensitive filesystem */
public final class C63643Kv {
    public int A00;
    public int A01;
    public AnonymousClass4RZ A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final List A0A;
    public final C18820ts A0B;
    public final C21520zN A0C;

    public final void A02(LinearLayout linearLayout, AnonymousClass4RZ r19, int i) {
        WaEditText waEditText;
        TextView r6;
        LinearLayout linearLayout2 = linearLayout;
        AnonymousClass00C.A0D(linearLayout2, 1);
        this.A02 = r19;
        List list = this.A0A;
        list.clear();
        linearLayout2.removeAllViews();
        int i2 = i;
        if (i >= 0) {
            int i3 = 0;
            while (true) {
                boolean A1S = AnonymousClass000.A1S(i3, i / 2);
                boolean A1S2 = AnonymousClass000.A1S(i3, i2);
                if (A1S) {
                    r6 = new WaTextView(this.A09);
                    r6.setBackgroundResource(R.drawable.sms_code_input_hyphen);
                } else {
                    Context context = this.A09;
                    r6 = new AnonymousClass27y(new ContextThemeWrapper(context, R.style.f13nameremoved));
                    r6.setBackgroundResource(R.drawable.sms_code_input_box);
                    r6.setWidth(this.A07);
                    r6.setHeight(this.A04);
                    r6.setGravity(17);
                    r6.getContext();
                    r6.setTypeface(C33511fU.A00());
                    Resources resources = context.getResources();
                    int i4 = this.A06;
                    int i5 = R.plurals.f10nameremoved;
                    if (i4 == 1) {
                        i5 = R.plurals.f10nameremoved;
                    }
                    Object[] A0M = AnonymousClass001.A0M();
                    AnonymousClass000.A1L(A0M, i2, 0);
                    AnonymousClass000.A1L(A0M, list.size() + 1, 1);
                    r6.setContentDescription(resources.getQuantityString(i5, i2, A0M));
                    if (i4 == 1) {
                        r6.setInputType(ZipDecompressor.UNZIP_BUFFER_SIZE);
                    }
                    list.add(r6);
                }
                r6.setPadding(0, 0, 0, 0);
                linearLayout2.addView(r6);
                boolean z = !A1S2;
                boolean z2 = !A1S;
                ViewGroup.LayoutParams layoutParams = r6.getLayoutParams();
                AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (z) {
                    layoutParams2.setMargins(this.A00, 0, this.A01, 0);
                }
                if (z2) {
                    layoutParams2.weight = this.A03;
                }
                layoutParams2.gravity = 17;
                r6.setLayoutParams(layoutParams2);
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        if (list.isEmpty()) {
            Log.i("CodeInputBoxManager/init/empty codeInputBoxes");
            return;
        }
        if (C36401kF.A1X(this.A0B)) {
            Collections.reverse(list);
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            WaEditText waEditText2 = null;
            if (i6 == 0) {
                waEditText = null;
            } else {
                waEditText = (WaEditText) list.get(i6 - 1);
            }
            WaEditText waEditText3 = (WaEditText) list.get(i6);
            if (i6 != C36431kI.A07(list)) {
                waEditText2 = (WaEditText) list.get(i6 + 1);
            }
            waEditText3.addTextChangedListener(new C66853Xo(waEditText, waEditText3, waEditText2, this.A02, this, list, i6, i2, this.A06));
            waEditText3.setOnKeyListener(new AnonymousClass4ZW(waEditText3, 3));
        }
        ((View) list.get(0)).requestFocus();
        ((WaEditText) list.get(0)).A0C(false);
        Boolean bool = C18750th.A03;
    }

    public final void A01() {
        List<TextView> list = this.A0A;
        for (TextView A1K : list) {
            C36391kE.A1K(A1K);
        }
        ((View) list.get(0)).requestFocus();
        ((WaEditText) list.get(0)).A0C(false);
    }

    public final boolean A03() {
        return AnonymousClass000.A1P(this.A0C.A0E(1715) ? 1 : 0);
    }

    public C63643Kv(Context context, C18820ts r5, C21520zN r6, C55202uF r7) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int i;
        C36321k7.A11(context, r5, r6);
        this.A09 = context;
        this.A0B = r5;
        this.A0C = r6;
        if (r7 != null) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        this.A08 = dimensionPixelSize;
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        if (r7 != null) {
            dimensionPixelSize2 = 0;
        } else {
            dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        this.A07 = dimensionPixelSize2;
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int i2 = 0;
        if (C36351kA.A1Y(r5)) {
            dimensionPixelSize3 = 0;
        } else {
            dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        }
        this.A00 = dimensionPixelSize3;
        if (C36351kA.A1Y(r5)) {
            i = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        } else {
            i = 0;
        }
        this.A01 = i;
        this.A03 = r7 != null ? 1.0f : 0.0f;
        this.A06 = r7 != null ? 1 : i2;
        this.A0A = AnonymousClass001.A0I();
    }

    public final String A00() {
        StringBuilder A0u = AnonymousClass000.A0u();
        for (EditText editText : this.A0A) {
            Editable text = editText.getText();
            if (!(text == null || text.length() == 0)) {
                A0u.append(C36421kH.A0Z(editText));
            }
        }
        return C36381kD.A0y(A0u);
    }
}
