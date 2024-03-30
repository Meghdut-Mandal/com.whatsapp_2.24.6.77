package X;

import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.2s3  reason: invalid class name and case insensitive filesystem */
public abstract class C53882s3 {
    public static void A00(TextView textView, AnonymousClass17Y r8, C87714Pw r9, C18820ts r10, C47002cZ r11, C19770wU r12) {
        C47002cZ r3 = r11;
        C65013Qj r0 = r11.A01;
        TextView textView2 = textView;
        C87714Pw r2 = r9;
        if (r0 == null || r0.A0I == null) {
            textView.setText("");
            r9.BR1("");
            return;
        }
        textView.setTag(R.id.tag_fetch_video_duration, r11.A1J);
        r12.Bp1(new AnonymousClass753(r2, r3, r8, r10, textView2, 11));
    }
}
