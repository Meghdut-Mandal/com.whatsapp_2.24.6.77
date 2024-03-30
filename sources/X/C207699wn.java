package X;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.car.app.CarAppBinder;
import androidx.car.app.ICarHost;

/* renamed from: X.9wn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C207699wn implements AnonymousClass7dU {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Configuration A01;
    public final /* synthetic */ CarAppBinder A02;
    public final /* synthetic */ ICarHost A03;

    public /* synthetic */ C207699wn(Intent intent, Configuration configuration, CarAppBinder carAppBinder, ICarHost iCarHost) {
        this.A02 = carAppBinder;
        this.A03 = iCarHost;
        this.A01 = configuration;
        this.A00 = intent;
    }

    public final Object B5f() {
        this.A02.m20lambda$onAppCreate$0$androidxcarappCarAppBinder(this.A03, this.A01, this.A00);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }
}
