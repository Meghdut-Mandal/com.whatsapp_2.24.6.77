package com.google.android.play.core.integrity;

import X.A4k;
import X.A4l;
import X.C22895Axz;
import android.content.Context;
import java.util.Objects;

public final class s {
    public final s a = this;
    public final C22895Axz b;
    public final C22895Axz c;
    public final C22895Axz d;
    public final C22895Axz e;
    public final C22895Axz f;

    public final IntegrityManager a() {
        return (IntegrityManager) this.f.a();
    }

    public /* synthetic */ s(Context context, r rVar) {
        Objects.requireNonNull(context, "instance cannot be null");
        A4k a4k = new A4k(context);
        this.b = a4k;
        A4l a4l = new A4l(ac.a);
        this.c = a4l;
        m mVar = l.a;
        au auVar = new au(a4k, mVar);
        this.d = auVar;
        A4l a4l2 = new A4l(new al(a4k, a4l, auVar, mVar));
        this.e = a4l2;
        this.f = new A4l(new ab(a4l2));
    }
}
