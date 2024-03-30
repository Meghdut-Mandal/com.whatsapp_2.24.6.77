package X;

import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5yh  reason: invalid class name and case insensitive filesystem */
public class C124725yh {
    public final int A00;
    public final int A01;
    public final ImageView.ScaleType A02;
    public final AnonymousClass4QR A03;
    public final C61243Bc A04;
    public final C61243Bc A05;
    public final C61243Bc A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C124725yh(ImageView.ScaleType scaleType, AnonymousClass4QR r4, C61243Bc r5, C61243Bc r6, C61243Bc r7, List list, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A01 = i;
        this.A06 = r5;
        this.A05 = r6;
        this.A00 = i2;
        this.A04 = r7;
        this.A08 = z3;
        this.A02 = scaleType;
        ArrayList A0I = AnonymousClass001.A0I();
        this.A07 = A0I;
        if (z && !list.isEmpty()) {
            A0I.addAll(list);
            this.A09 = z;
        }
        this.A03 = r4;
        this.A0A = z2;
    }
}
