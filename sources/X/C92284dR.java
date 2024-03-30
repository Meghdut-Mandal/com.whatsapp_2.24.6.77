package X;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* renamed from: X.4dR  reason: invalid class name and case insensitive filesystem */
public final class C92284dR extends View.DragShadowBuilder {
    public final long A00;
    public final C161937ni A01;
    public final C006302t A02;

    public void onDrawShadow(Canvas canvas) {
        C137496gE r12 = new C137496gE();
        C161937ni r11 = this.A01;
        long j = this.A00;
        AnonymousClass5RW r10 = AnonymousClass5RW.Ltr;
        Canvas canvas2 = C112335dj.A00;
        C137386g3 r9 = new C137386g3();
        r9.A00 = canvas;
        C006302t r8 = this.A02;
        C128306Bs r7 = r12.A02;
        C161937ni r6 = r7.A02;
        AnonymousClass5RW r3 = r7.A03;
        C161047m3 r2 = r7.A01;
        long j2 = r7.A00;
        r7.A02 = r11;
        r7.A03 = r10;
        r7.A01 = r9;
        r7.A00 = j;
        r9.BpF();
        r8.invoke(r12);
        r9.Boi();
        r7.A02 = r6;
        r7.A03 = r3;
        r7.A01 = r2;
        r7.A00 = j2;
    }

    public void onProvideShadowMetrics(Point point, Point point2) {
        C161937ni r4 = this.A01;
        long j = this.A00;
        point.set(r4.Bor(r4.Bvi(AnonymousClass6X0.A01(j))), r4.Bor(r4.Bvi(AnonymousClass6X0.A00(j))));
        point2.set(point.x / 2, point.y / 2);
    }

    public C92284dR(C161937ni r1, C006302t r2, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = r2;
    }
}
