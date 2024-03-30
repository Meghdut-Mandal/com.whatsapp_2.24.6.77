package X;

import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;

/* renamed from: X.1m5  reason: invalid class name and case insensitive filesystem */
public final class C37261m5 extends ClickableSpan implements C88324Sg {
    public final /* synthetic */ InAppBugReportingActivity A00;
    public final /* synthetic */ String A01;

    public void onClick(View view) {
    }

    public void updateDrawState(TextPaint textPaint) {
        AnonymousClass00C.A0D(textPaint, 0);
        super.updateDrawState(textPaint);
        C36381kD.A16(this.A00, textPaint, R.color.f6nameremoved);
        textPaint.setUnderlineText(false);
    }

    public C37261m5(InAppBugReportingActivity inAppBugReportingActivity, String str) {
        this.A00 = inAppBugReportingActivity;
        this.A01 = str;
    }

    public void BaO(MotionEvent motionEvent, View view) {
        InAppBugReportingActivity inAppBugReportingActivity = this.A00;
        AnonymousClass3MV.A01(inAppBugReportingActivity.A05, inAppBugReportingActivity.A08, this.A01);
    }

    public void BTg(MotionEvent motionEvent, View view) {
        Intent A0C = C36431kI.A0C();
        C36421kH.A0n(A0C, this.A01);
        this.A00.startActivity(A0C);
    }
}
