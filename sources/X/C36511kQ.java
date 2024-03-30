package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.1kQ  reason: invalid class name and case insensitive filesystem */
public class C36511kQ extends AnimatorListenerAdapter {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ WebPagePreviewView A02;

    public C36511kQ(View view, WebPagePreviewView webPagePreviewView, float f) {
        this.A02 = webPagePreviewView;
        this.A00 = f;
        this.A01 = view;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.A00 == 0.0f) {
            C36421kH.A0u(this.A01, 8);
        }
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        if (this.A00 == 1.0f) {
            this.A01.setVisibility(0);
        }
    }
}
