package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.0hM  reason: invalid class name and case insensitive filesystem */
public class C12010hM implements Runnable {
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass0Y8 A02;
    public final /* synthetic */ C09000bf A03;
    public final /* synthetic */ C07460Xt A04;

    public C12010hM(ValueAnimator valueAnimator, View view, AnonymousClass0Y8 r3, C09000bf r4, C07460Xt r5) {
        this.A03 = r4;
        this.A01 = view;
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = valueAnimator;
    }

    public void run() {
        AnonymousClass0Gz.A02(this.A01, this.A02, this.A04);
        this.A00.start();
    }
}
