package com.google.android.play.core.integrity;

import X.A4k;
import X.A4l;
import X.C22895Axz;
import android.content.Context;
import java.util.Objects;

public final class w implements aw {
    public final w a = this;
    public final C22895Axz b;
    public final C22895Axz c;
    public final C22895Axz d;
    public final C22895Axz e;
    public final C22895Axz f;
    public final C22895Axz g;

    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.g.a();
    }

    public /* synthetic */ w(Context context, v vVar) {
        Objects.requireNonNull(context, "instance cannot be null");
        A4k a4k = new A4k(context);
        this.b = a4k;
        A4l a4l = new A4l(bb.a);
        this.c = a4l;
        o oVar = n.a;
        au auVar = new au(a4k, oVar);
        this.d = auVar;
        A4l a4l2 = new A4l(new bp(a4k, a4l, auVar, oVar));
        this.e = a4l2;
        A4l a4l3 = new A4l(new bu(a4l2));
        this.f = a4l3;
        this.g = new A4l(new ba(a4l2, a4l3));
    }
}
