package X;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.whatsapp.R;
import com.whatsapp.radio.RadioButtonWithSubtitle;

/* renamed from: X.1m8  reason: invalid class name and case insensitive filesystem */
public final class C37291m8 extends ForegroundColorSpan {
    public final /* synthetic */ RadioButtonWithSubtitle A00;

    public void updateDrawState(TextPaint textPaint) {
        AnonymousClass00C.A0D(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setTextSize(this.A00.getResources().getDimension(R.dimen.f7nameremoved));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37291m8(RadioButtonWithSubtitle radioButtonWithSubtitle, int i) {
        super(i);
        this.A00 = radioButtonWithSubtitle;
    }
}
