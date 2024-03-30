package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.List;

/* renamed from: X.7vM  reason: invalid class name and case insensitive filesystem */
public class C166217vM extends ClickableSpan {
    public final /* synthetic */ C179918ku A00;
    public final /* synthetic */ C180138lG A01;

    public C166217vM(C179918ku r1, C180138lG r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.A01.A03;
        C179918ku r1 = this.A00;
        List list = AnonymousClass0D3.A0I;
        onClickListener.onClick(r1.A08);
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        C179918ku r1 = this.A00;
        List list = AnonymousClass0D3.A0I;
        View view = r1.A01;
        textPaint.setColor(C36341k9.A0F(view).getColor(C36341k9.A05(view.getContext())));
        textPaint.setUnderlineText(false);
    }
}
