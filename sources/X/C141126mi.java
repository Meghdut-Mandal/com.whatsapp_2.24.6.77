package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.whatsapp.R;
import java.util.Objects;

/* renamed from: X.6mi  reason: invalid class name and case insensitive filesystem */
public class C141126mi implements C160697lR {
    public int A00;
    public int A01;
    public Bitmap.Config A02;
    public Uri A03;
    public AU0 A04;
    public AnonymousClass67V A05;
    public AnonymousClass6M6 A06;
    public C107825Ra A07;
    public C131076Nq A08;
    public boolean A09;
    public boolean A0A = false;
    public AnonymousClass6TK A0B;
    public AnonymousClass6TK A0C;
    public final RectF A0D = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public final C120865sD A0E;
    public final C118575oM A0F;
    public final float[] A0G;
    public volatile AnonymousClass60K A0H;

    public static void A00(C141126mi r2, boolean z) {
        AnonymousClass67V r0;
        r2.A09 = true;
        if (z && (r0 = r2.A05) != null) {
            r0.A00();
            r2.A05 = null;
        }
        AU0 au0 = r2.A04;
        if (au0 != null) {
            au0.close();
        }
        r2.A04 = null;
        r2.A07 = null;
    }

    public void Bik(C131296Om r7) {
        A00(this, true);
        this.A0C = C131296Om.A00(r7, R.raw.lite_overlay_vs, R.raw.lite_overlay_fs);
        try {
            int[] iArr = {R.raw.inverse_tonemap_hlg_lib};
            String A012 = C131296Om.A01(r7, R.raw.overlay_hdr_fs);
            String A013 = C131296Om.A01(r7, R.raw.overlay_300_vs);
            StringBuilder A0i = C90524aI.A0i(A012);
            StringBuilder A0i2 = C90524aI.A0i(A013);
            String A014 = C131296Om.A01(r7, iArr[0]);
            A0i.append("\n");
            A0i.append(A014);
            this.A0B = r7.A03(AnonymousClass000.A0p("\n", A014, A0i2), A0i.toString(), false);
        } catch (RuntimeException e) {
            AnonymousClass6YR.A0A("LiteOverlayRenderer", "Could not compile HDR shader", e);
        }
    }

    public void Bil() {
        A00(this, true);
        AnonymousClass6TK r0 = this.A0C;
        if (r0 != null) {
            r0.A03();
            this.A0C = null;
        }
        AnonymousClass6TK r02 = this.A0B;
        if (r02 != null) {
            r02.A03();
            this.A0B = null;
        }
    }

    public C141126mi(Uri uri, AnonymousClass6M6 r8) {
        C131076Nq r5 = new C131076Nq(uri, new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        float[] fArr = new float[16];
        this.A0G = fArr;
        this.A06 = r8;
        this.A08 = r5;
        C118575oM r2 = new C118575oM(r5.A01);
        this.A0F = r2;
        Matrix.setIdentityM(fArr, 0);
        AnonymousClass62W r1 = new AnonymousClass62W();
        r1.A00 = 5;
        r1.A00(r2, "aPosition");
        this.A0E = C118575oM.A00(r1, new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.A03 = uri;
        this.A09 = true;
    }

    public boolean BWE(AnonymousClass6NG r7, long j) {
        AnonymousClass6TK r3;
        AnonymousClass67V r0 = r7.A01;
        if (r0 != null) {
            if (!r0.A02.A02 || (r3 = this.A0B) == null) {
                r3 = this.A0C;
            } else {
                this.A0A = true;
            }
            Objects.requireNonNull(r3);
            if (r3 == null) {
                AnonymousClass60K r02 = this.A0H;
                if (r02 != null) {
                    r02.A00();
                }
                throw AnonymousClass001.A08("Null program provided to overlay");
            }
            if (this.A09) {
                C131076Nq r1 = this.A08;
                if (r1.A00 != null) {
                    A00(this, true);
                    Uri uri = r1.A00;
                    if (uri != null) {
                        AnonymousClass6M6 r03 = this.A06;
                        Objects.requireNonNull(r03);
                        AU0 A002 = r03.A00(uri);
                        C107825Ra r4 = C107825Ra.StaticImage;
                        this.A07 = r4;
                        if (A002 != null) {
                            this.A04 = A002;
                            Bitmap bitmap = (Bitmap) A002.A01();
                            if (this.A05 == null || bitmap.getWidth() != this.A01 || bitmap.getHeight() != this.A00 || bitmap.getConfig() != this.A02 || this.A05.A02.A02 != this.A0A) {
                                AnonymousClass67V r04 = this.A05;
                                if (r04 != null) {
                                    r04.A00();
                                }
                                C124085xZ r12 = new C124085xZ("LiteOverlayRenderer");
                                C90464aC.A0u(r12.A06);
                                r12.A03 = bitmap;
                                r12.A05 = this.A0A;
                                this.A05 = new AnonymousClass67V(r12);
                                this.A01 = bitmap.getWidth();
                                this.A00 = bitmap.getHeight();
                                this.A02 = bitmap.getConfig();
                            } else if (!bitmap.isRecycled()) {
                                GLES20.glBindTexture(3553, this.A05.A00);
                                GLUtils.texImage2D(3553, 0, bitmap, 0);
                                GLES20.glBindTexture(3553, 0);
                            } else {
                                throw C90514aH.A0s("bitmap is recycled");
                            }
                            if (this.A07 == r4) {
                                this.A09 = false;
                            }
                        } else {
                            throw AnonymousClass000.A0f(uri, "Fail to load image for ", AnonymousClass000.A0u());
                        }
                    }
                }
            }
            if (this.A05 != null) {
                GLES20.glEnable(3042);
                C200339hB.A02("GL_BLEND", new Object[0]);
                GLES20.glBlendFunc(1, 771);
                GLES20.glBlendEquation(32774);
                C200339hB.A02("blendFunc", new Object[0]);
                C130986Ng A022 = r3.A02();
                A022.A02("uSceneMatrix", r7.A03);
                A022.A02("uRotationMatrix", this.A0G);
                A022.A01(this.A05, "sOverlay");
                AnonymousClass6TK.A01(this.A0E, A022.A00);
                AU0 au0 = this.A04;
                if (au0 == null) {
                    return true;
                }
                au0.close();
                this.A04 = null;
                return true;
            }
            AnonymousClass60K r05 = this.A0H;
            if (r05 == null) {
                return false;
            }
            r05.A00();
            return false;
        }
        throw AnonymousClass001.A09("MutableVideoFrame not initialized, missing rgbTexture");
    }

    public boolean isEnabled() {
        return AnonymousClass000.A1V(this.A08.A00);
    }

    public void Bij(int i, int i2) {
    }

    public void BqB(AnonymousClass60K r1) {
        this.A0H = r1;
    }
}
