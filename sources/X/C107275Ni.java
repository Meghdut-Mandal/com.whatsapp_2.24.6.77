package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.5Ni  reason: invalid class name and case insensitive filesystem */
public abstract class C107275Ni extends C93054fV {
    public C20810yC A00;
    public AnonymousClass7dF A01;
    public CallInfo A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public void A01(boolean z) {
        AnonymousClass7dF r0 = this.A01;
        if (r0 != null) {
            ((C1493170r) r0).A00.A3q("ReplyWithMessageDialogFragment");
        }
        if (z) {
            Log.i("voip/VoipCallAnswerCallView/hide with animation");
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(125);
            alphaAnimation.setStartOffset((long) 0);
            alphaAnimation.setAnimationListener(new C89234Vt(this, 0));
            startAnimation(alphaAnimation);
            return;
        }
        Log.i("voip/VoipCallAnswerCallView/hide");
        setVisibility(8);
    }

    public void A02(CallInfo callInfo, String str, boolean z) {
        this.A02 = callInfo;
        this.A03 = str;
        this.A05 = callInfo.isPeerRequestingUpgrade();
        this.A04 = C114145gi.A07.equals(this.A03);
    }

    public void setAnswerCallViewListener(AnonymousClass7dF r1) {
        this.A01 = r1;
    }

    public C107275Ni(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
