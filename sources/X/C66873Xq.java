package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.style.LineBackgroundSpan;
import com.whatsapp.WaEditText;
import java.util.List;

/* renamed from: X.3Xq  reason: invalid class name and case insensitive filesystem */
public final class C66873Xq implements LineBackgroundSpan {
    public float A00;
    public int A01;
    public List A02;
    public final Context A03;
    public final Paint A04;
    public final WaEditText A05;

    public C66873Xq(Context context, WaEditText waEditText, float f, int i) {
        this.A03 = context;
        this.A05 = waEditText;
        this.A01 = i;
        this.A00 = f;
        Paint A0K = C36441kJ.A0K();
        A0K.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A04 = A0K;
    }

    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        C36321k7.A0w(canvas, paint);
        int color = paint.getColor();
        Paint paint2 = this.A04;
        paint2.setColor(this.A01);
        paint2.setAlpha((int) (this.A00 * ((float) 255)));
        WaEditText waEditText = this.A05;
        float f = (float) 2;
        paint2.setPathEffect(new CornerPathEffect(waEditText.getTextSize() / f));
        Context context = this.A03;
        this.A02 = AnonymousClass3TG.A00(context, waEditText.getLayout(), waEditText.getTextSize() / f);
        Typeface typeface = waEditText.getTypeface();
        Typeface typeface2 = AnonymousClass5Cl.A0J;
        if (typeface2 == null) {
            typeface2 = Typeface.createFromAsset(context.getAssets(), "fonts/FacebookScriptWA-Regular.otf");
            AnonymousClass5Cl.A0J = typeface2;
        }
        if (AnonymousClass00C.A0J(typeface, typeface2)) {
            this.A02 = AnonymousClass3TG.A01(context, waEditText.getLayout(), waEditText.getTextSize() / f);
        }
        List list = this.A02;
        if (list == null) {
            throw C36331k8.A0d("paths");
        }
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            List list2 = this.A02;
            if (list2 == null) {
                throw C36331k8.A0d("paths");
            }
            canvas.drawPath((Path) list2.get(i9), paint2);
        }
        paint.setColor(color);
    }
}
