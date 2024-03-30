package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: X.0NM  reason: invalid class name */
public class AnonymousClass0NM extends AnonymousClass0UG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ TextPaint A01;
    public final /* synthetic */ AnonymousClass0YF A02;
    public final /* synthetic */ AnonymousClass0UG A03;

    public AnonymousClass0NM(Context context, TextPaint textPaint, AnonymousClass0YF r3, AnonymousClass0UG r4) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = textPaint;
        this.A03 = r4;
    }

    public void A00(int i) {
        this.A03.A00(i);
    }

    public void A01(Typeface typeface, boolean z) {
        this.A02.A03(this.A00, typeface, this.A01);
        this.A03.A01(typeface, z);
    }
}
