package X;

import android.content.Context;
import android.view.View;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.6m0  reason: invalid class name and case insensitive filesystem */
public class C140696m0 implements C160347kr {
    public final C140456lc A00;

    public /* bridge */ /* synthetic */ Object B1l(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C140456lc r3 = this.A00;
        view.setScaleX(r3.A0S(136, 1.0f));
        view.setScaleY(r3.A0S(137, 1.0f));
        view.setTranslationX(r3.A0S(MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT, 0.0f));
        view.setTranslationY(r3.A0S(145, 0.0f));
        view.setRotation(r3.A0S(138, 0.0f));
        view.setAlpha(r3.A0S(141, 1.0f));
        return null;
    }

    public /* bridge */ /* synthetic */ void BwG(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setAlpha(1.0f);
    }

    public C140696m0(C140456lc r1) {
        this.A00 = r1;
    }

    public /* synthetic */ String BB1() {
        return AnonymousClass5YX.A01(this);
    }

    public /* bridge */ /* synthetic */ boolean BtZ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
