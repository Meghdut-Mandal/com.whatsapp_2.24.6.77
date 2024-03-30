package X;

import android.content.Context;
import android.text.InputFilter;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.WaEditText;

/* renamed from: X.5bU  reason: invalid class name and case insensitive filesystem */
public abstract class C110945bU {
    public static void A00(Context context, ScrollView scrollView, TextView textView, TextView textView2, WaEditText waEditText, C21060yb r22, C18820ts r23, AnonymousClass1N0 r24, AnonymousClass1H2 r25, C19890wg r26, int i) {
        int i2 = i;
        WaEditText waEditText2 = waEditText;
        waEditText2.setFilters(new InputFilter[]{new C66763Xf(i2)});
        waEditText2.addTextChangedListener(new AnonymousClass2gA(waEditText2, textView, r22, r23, r24, r25, r26, i2, (int) (((float) i2) * 0.1f), false, false, false));
        textView2.setOnClickListener(new AnonymousClass3Y2(waEditText2, 38));
        ScrollView scrollView2 = scrollView;
        scrollView2.getViewTreeObserver().addOnGlobalLayoutListener(new C164797sO(scrollView2, waEditText2, 2));
        waEditText2.setOnFocusChangeListener(new C163347q3(scrollView2, 4));
        waEditText2.setOnTouchListener(new AnonymousClass6HR(scrollView2, new C06360Th(context, new C92074d5(scrollView2, waEditText2)), 2));
    }
}
