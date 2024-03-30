package X;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.ScalingUtils;

/* renamed from: X.84L  reason: invalid class name */
public final class AnonymousClass84L extends AnonymousClass9QL {
    public static AnonymousClass84L A0W;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Bitmap.Config A05;
    public final ColorFilter A06;
    public final PointF A07;
    public final PointF A08;
    public final PointF A09;
    public final Drawable A0A;
    public final Drawable A0B;
    public final Drawable A0C;
    public final Drawable A0D;
    public final ScalingUtils.ScaleType A0E;
    public final ScalingUtils.ScaleType A0F;
    public final ScalingUtils.ScaleType A0G;
    public final ScalingUtils.ScaleType A0H;
    public final AnonymousClass9OZ A0I;
    public final AnonymousClass9WW A0J;
    public final C64903Pw A0K;
    public final Boolean A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;

    static {
        AnonymousClass84K r1 = new AnonymousClass84K();
        r1.A05(ScalingUtils.ScaleType.CENTER_INSIDE);
        r1.A06(ScalingUtils.ScaleType.CENTER_INSIDE);
        r1.A04(ScalingUtils.ScaleType.CENTER_INSIDE);
        r1.A00 = AnonymousClass5S5.HIGH;
        A0W = new AnonymousClass84L(r1);
    }

    public static boolean A00(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C36381kD.A1Y(this, obj)) {
            AnonymousClass84L r4 = (AnonymousClass84L) obj;
            if (!AnonymousClass00C.A0J(this.A0N, r4.A0N) || this.A03 != r4.A03 || !A00(this.A0C, r4.A0C) || !A00(this.A0G, r4.A0G) || !A00(this.A09, r4.A09) || this.A0V != r4.A0V || !AnonymousClass00C.A0J(this.A0M, r4.A0M) || this.A00 != r4.A00 || !A00(this.A0F, r4.A0F) || !A00(this.A08, r4.A08) || this.A0R != r4.A0R || this.A02 != r4.A02 || !A00(this.A0B, r4.A0B) || this.A04 != r4.A04 || this.A0D != r4.A0D || this.A0H != r4.A0H || !A00(this.A06, r4.A06) || this.A0Q != r4.A0Q || this.A01 != r4.A01 || this.A0O != r4.A0O || this.A0P != r4.A0P || !A00(this.A0I, r4.A0I) || this.A0A != r4.A0A || !A00(this.A0K, r4.A0K) || !A00(this.A0J, r4.A0J) || !A00(this.A0E, r4.A0E) || !A00(this.A07, r4.A07) || this.A0U != r4.A0U || this.A0T != r4.A0T || this.A0L != r4.A0L || !A00(this.A05, r4.A05) || !A00(this.A00, r4.A00) || !A00(this.A01, r4.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass84L(AnonymousClass84K r2) {
        super(r2);
        this.A0K = r2.A0H;
        this.A0J = r2.A0G;
        this.A0E = r2.A00();
        this.A07 = r2.A09;
        this.A0U = r2.A0S;
        this.A0T = r2.A0R;
        this.A05 = r2.A05;
        this.A0L = r2.A0I;
        this.A0N = r2.A0K;
        this.A03 = r2.A03;
        this.A0C = r2.A0C;
        this.A0G = r2.A02();
        this.A09 = r2.A08;
        this.A0V = r2.A0P;
        this.A04 = r2.A04;
        this.A0D = r2.A0D;
        this.A0H = r2.A03();
        this.A0M = r2.A0J;
        this.A00 = r2.A00;
        this.A0F = r2.A01();
        this.A08 = r2.A07;
        this.A0A = r2.A0A;
        this.A0R = r2.A0N;
        this.A06 = r2.A06;
        this.A02 = r2.A02;
        this.A0B = r2.A0B;
        this.A0Q = r2.A0Q;
        this.A01 = r2.A01;
        this.A0O = r2.A0L;
        this.A0P = r2.A0M;
        this.A0I = r2.A0F;
        this.A0S = r2.A0O;
    }

    public final ScalingUtils.ScaleType A01() {
        return this.A0E;
    }

    public final ScalingUtils.ScaleType A02() {
        return this.A0F;
    }

    public final ScalingUtils.ScaleType A03() {
        return this.A0G;
    }

    public final ScalingUtils.ScaleType A04() {
        return this.A0H;
    }

    public int hashCode() {
        int i = 0;
        int A052 = (((((((C36351kA.A05(this.A0E, ((((super.hashCode() * 31 * 31) + AnonymousClass000.A0J(this.A0K)) * 31 * 31) + AnonymousClass000.A0J(this.A0J)) * 31 * 31 * 31) + AnonymousClass000.A0J(this.A07)) * 31) + (this.A0U ? 1 : 0)) * 31) + (this.A0T ? 1 : 0)) * 31) + AnonymousClass000.A0J(this.A05)) * 31;
        Boolean bool = this.A0L;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i2 = 0;
        int A0B2 = (((((((((((((((((((((((((((((((((((((((((((((A052 + i) * 31) + C90484aE.A0B(this.A0N)) * 31) + this.A03) * 31) + AnonymousClass000.A0J(this.A0C)) * 31) + AnonymousClass000.A0J(this.A0G)) * 31) + AnonymousClass000.A0J(this.A09)) * 31) + (this.A0V ? 1 : 0)) * 31) + C90484aE.A0B(this.A0M)) * 31) + this.A00) * 31) + AnonymousClass000.A0J(this.A0F)) * 31) + AnonymousClass000.A0J(this.A08)) * 31) + AnonymousClass000.A0J(this.A0A)) * 31) + (this.A0R ? 1 : 0)) * 31) + this.A02) * 31) + AnonymousClass000.A0J(this.A0B)) * 31) + AnonymousClass000.A0J(this.A0D)) * 31) + AnonymousClass000.A0J(this.A0H)) * 31) + AnonymousClass000.A0J(this.A06)) * 31) + (this.A0Q ? 1 : 0)) * 31) + this.A01) * 31) + (this.A0O ? 1 : 0)) * 31) + (this.A0P ? 1 : 0)) * 31 * 31) + this.A04) * 31;
        AnonymousClass9OZ r0 = this.A0I;
        if (r0 != null) {
            i2 = r0.hashCode();
        }
        return A0B2 + i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ImageOptions{");
        C198779eB r2 = new C198779eB(C90484aE.A0k(this));
        C198779eB.A00(r2, this.A00, "priority");
        C198779eB.A00(r2, this.A01, "cacheChoice");
        C198779eB.A00(r2, (Object) null, "resizeOptions");
        C198779eB.A00(r2, (Object) null, "rotationOptions");
        C198779eB.A00(r2, (Object) null, "postprocessor");
        C198779eB.A00(r2, this.A0J, "imageDecodeOptions");
        C198779eB.A00(r2, (Object) null, "roundingOptions");
        C198779eB.A00(r2, (Object) null, "borderOptions");
        C198779eB.A00(r2, this.A0E, "actualImageScaleType");
        C198779eB.A00(r2, this.A07, "actualImageFocusPoint");
        C198779eB.A01(r2, "localThumbnailPreviewsEnabled", this.A0U);
        C198779eB.A01(r2, "loadThumbnailOnly", this.A0T);
        C198779eB.A00(r2, this.A05, "bitmapConfig");
        C198779eB.A00(r2, this.A0L, "progressiveRenderingEnabled");
        C198779eB.A00(r2, this.A0N, "placeholderColor");
        C198779eB.A00(r2, String.valueOf(this.A03), "placeholderRes");
        C198779eB.A00(r2, this.A0C, "placeholderDrawable");
        C198779eB.A00(r2, this.A0G, "placeholderScaleType");
        C198779eB.A00(r2, this.A09, "placeholderFocusPoint");
        C198779eB.A01(r2, "placeholderApplyRoundingOptions", this.A0V);
        C198779eB.A00(r2, String.valueOf(this.A04), "progressRes");
        C198779eB.A00(r2, this.A0D, "progressDrawable");
        C198779eB.A00(r2, this.A0H, "progressScaleType");
        C198779eB.A00(r2, this.A0M, "errorColor");
        C198779eB.A00(r2, String.valueOf(this.A00), "errorRes");
        C198779eB.A00(r2, this.A0F, "errorScaleType");
        C198779eB.A00(r2, this.A08, "errorFocusPoint");
        C198779eB.A00(r2, this.A0A, "errorDrawable");
        C198779eB.A01(r2, "errorApplyRoundingOptions", this.A0R);
        C198779eB.A00(r2, this.A06, "actualImageColorFilter");
        C198779eB.A00(r2, String.valueOf(this.A02), "overlayRes");
        C198779eB.A00(r2, this.A0B, "overlayDrawable");
        C198779eB.A01(r2, "resizeToViewport", this.A0Q);
        C198779eB.A01(r2, "autoPlay", this.A0O);
        C198779eB.A01(r2, "autoStop", this.A0P);
        C198779eB.A01(r2, "mPerfMediaRemountInstrumentationFix", false);
        C198779eB.A00(r2, String.valueOf(this.A01), "fadeDurationMs");
        C198779eB.A00(r2, this.A0I, "customDrawableFactory");
        return C90464aC.A0X(r2, A0u);
    }
}
