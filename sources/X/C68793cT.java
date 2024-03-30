package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LineBackgroundSpan;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;

/* renamed from: X.3cT  reason: invalid class name and case insensitive filesystem */
public final class C68793cT implements C88324Sg, LineBackgroundSpan {
    public final int A00;
    public final int A01;
    public final int A02;
    public final TextEmojiLabel A03;
    public final String A04;
    public final ArrayList A05 = AnonymousClass001.A0I();
    public final boolean A06;
    public final C87414Os A07;

    public C68793cT(C87414Os r2, TextEmojiLabel textEmojiLabel, String str, int i, int i2, int i3, boolean z) {
        AnonymousClass00C.A0D(str, 2);
        this.A03 = textEmojiLabel;
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A06 = z;
        this.A07 = r2;
    }

    public void BTg(MotionEvent motionEvent, View view) {
        C87414Os r1 = this.A07;
        if (r1 != null) {
            r1.BZg(motionEvent, view, this.A04);
        }
    }

    public void BaO(MotionEvent motionEvent, View view) {
        C87414Os r0 = this.A07;
        if (r0 != null) {
            String str = this.A04;
            C47592fB r02 = ((C68593c9) r0).A00;
            C21060yb r1 = r02.A0D;
            AnonymousClass3TM.A02(r02.A0C, r1, str);
            AnonymousClass3T3.A03(r1);
        }
    }

    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        int i9;
        float f;
        float measureText;
        float f2;
        C36321k7.A0w(canvas, paint);
        CharSequence charSequence2 = charSequence;
        AnonymousClass00C.A0D(charSequence2, 7);
        TextEmojiLabel textEmojiLabel = this.A03;
        Layout layout = textEmojiLabel.getLayout();
        int i10 = this.A01;
        int lineForOffset = layout.getLineForOffset(i10);
        int i11 = this.A00;
        int lineForOffset2 = layout.getLineForOffset(i11);
        int i12 = i8;
        if (lineForOffset <= i12 && i12 <= lineForOffset2) {
            if (i12 == lineForOffset) {
                i9 = (int) layout.getPrimaryHorizontal(i10);
                if (i12 == lineForOffset2) {
                    f2 = layout.getPrimaryHorizontal(i11);
                } else {
                    f = (float) i9;
                    measureText = paint.measureText(charSequence2, i10, i7);
                    f2 = f + measureText;
                }
            } else {
                i10 = i6;
                i9 = (int) layout.getPrimaryHorizontal(i10);
                f = (float) i9;
                if (i12 >= lineForOffset2) {
                    measureText = paint.measureText(charSequence2, i10, i11);
                    f2 = f + measureText;
                }
                measureText = paint.measureText(charSequence2, i10, i7);
                f2 = f + measureText;
            }
            int i13 = (int) f2;
            int A052 = C36441kJ.A05(textEmojiLabel.getResources(), R.dimen.f7nameremoved) / 3;
            RectF rectF = new RectF((float) (i9 - A052), (float) i3, (float) (i13 + A052), (float) i5);
            Rect A062 = AnonymousClass001.A06();
            textEmojiLabel.getGlobalVisibleRect(A062);
            int i14 = A062.left;
            int i15 = this.A02;
            int i16 = A062.top;
            this.A05.add(new RectF((float) (((i14 + i9) - A052) + i15), (float) (i16 + i3 + i15), (float) (i14 + i13 + A052 + i15), (float) (i16 + i5 + i15)));
            int color = paint.getColor();
            paint.setColor(C36341k9.A0F(textEmojiLabel).getColor(R.color.f6nameremoved));
            float f3 = (float) i15;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            paint.setColor(color);
        }
    }
}
