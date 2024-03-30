package X;

import android.widget.TextView;

/* renamed from: X.1fo  reason: invalid class name and case insensitive filesystem */
public class C33711fo extends C33701fn {
    public final C20810yC A00;

    public C33711fo(C33571fa r1, C33001eY r2, C33581fb r3, C20810yC r4, C19770wU r5) {
        super(r1, r2, r3, r4, r5);
        this.A00 = r4;
    }

    public void A04(AnonymousClass3KG r4, C607939j r5, C87374On r6) {
        C193929Nl r0;
        super.A04(r4, r5, r6);
        if (r6 != null && (r0 = ((C21642ATi) r6).A07) != null) {
            String str = r0.A06;
            if (str == null || str.isEmpty()) {
                r5.A05.setVisibility(8);
                return;
            }
            TextView textView = r5.A05;
            textView.setText(str);
            textView.setTextDirection(5);
        }
    }
}
