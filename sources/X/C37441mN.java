package X;

import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.ui.media.MediaCaptionTextView;

/* renamed from: X.1mN  reason: invalid class name and case insensitive filesystem */
public final class C37441mN extends UnderlineSpan implements C88324Sg {
    public final C87414Os A00;
    public final String A01;
    public final /* synthetic */ MediaCaptionTextView A02;

    public C37441mN(C87414Os r2, MediaCaptionTextView mediaCaptionTextView, String str) {
        AnonymousClass00C.A0D(str, 2);
        this.A02 = mediaCaptionTextView;
        this.A01 = str;
        this.A00 = r2;
    }

    public void BTg(MotionEvent motionEvent, View view) {
        this.A00.BZg(motionEvent, view, this.A01);
    }

    public void BaO(MotionEvent motionEvent, View view) {
        C87414Os r0 = this.A00;
        String str = this.A01;
        C47592fB r02 = ((C68593c9) r0).A00;
        C21060yb r1 = r02.A0D;
        AnonymousClass3TM.A02(r02.A0C, r1, str);
        AnonymousClass3T3.A03(r1);
    }
}
