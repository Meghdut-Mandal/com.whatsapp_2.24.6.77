package X;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.ScalingUtils;

/* renamed from: X.84K  reason: invalid class name */
public final class AnonymousClass84K extends C197529br {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap.Config A05;
    public ColorFilter A06;
    public PointF A07;
    public PointF A08;
    public PointF A09;
    public Drawable A0A;
    public Drawable A0B;
    public Drawable A0C;
    public Drawable A0D;
    public ScalingUtils.ScaleType A0E;
    public AnonymousClass9OZ A0F;
    public AnonymousClass9WW A0G;
    public C64903Pw A0H;
    public Boolean A0I;
    public Integer A0J;
    public Integer A0K;
    public boolean A0L;
    public boolean A0M = true;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public ScalingUtils.ScaleType A0T;
    public ScalingUtils.ScaleType A0U;
    public ScalingUtils.ScaleType A0V;

    public AnonymousClass84K(AnonymousClass84L r3) {
        super(r3);
        ScalingUtils.ScaleType scaleType = ScalingUtils.ScaleType.CENTER_CROP;
        AnonymousClass00C.A09(scaleType);
        this.A0E = scaleType;
        this.A0H = r3.A0K;
        this.A0G = r3.A0J;
        this.A0E = r3.A01();
        this.A09 = r3.A07;
        this.A0S = r3.A0U;
        this.A0R = r3.A0T;
        this.A05 = r3.A05;
        this.A0I = r3.A0L;
        this.A0K = r3.A0N;
        this.A03 = r3.A03;
        this.A0C = r3.A0C;
        this.A0U = r3.A03();
        this.A08 = r3.A09;
        this.A0P = r3.A0V;
        this.A04 = r3.A04;
        this.A0D = r3.A0D;
        this.A0V = r3.A04();
        this.A0J = r3.A0M;
        this.A00 = r3.A00;
        this.A0T = r3.A02();
        this.A07 = r3.A08;
        this.A0A = r3.A0A;
        this.A0N = r3.A0R;
        this.A06 = r3.A06;
        this.A02 = r3.A02;
        this.A0B = r3.A0B;
        this.A0Q = r3.A0Q;
        this.A0L = r3.A0O;
        this.A0M = r3.A0P;
        this.A01 = r3.A01;
        this.A0F = r3.A0I;
        this.A0O = r3.A0S;
    }

    public final ScalingUtils.ScaleType A00() {
        return this.A0E;
    }

    public final ScalingUtils.ScaleType A01() {
        return this.A0T;
    }

    public final ScalingUtils.ScaleType A02() {
        return this.A0U;
    }

    public final ScalingUtils.ScaleType A03() {
        return this.A0V;
    }

    public final void A04(ScalingUtils.ScaleType scaleType) {
        this.A0T = scaleType;
    }

    public final void A05(ScalingUtils.ScaleType scaleType) {
        this.A0U = scaleType;
    }

    public final void A06(ScalingUtils.ScaleType scaleType) {
        this.A0V = scaleType;
    }

    public final void A07(ScalingUtils.ScaleType scaleType) {
        this.A0E = scaleType;
    }

    public AnonymousClass84K() {
        ScalingUtils.ScaleType scaleType = ScalingUtils.ScaleType.CENTER_CROP;
        AnonymousClass00C.A09(scaleType);
        this.A0E = scaleType;
    }
}
