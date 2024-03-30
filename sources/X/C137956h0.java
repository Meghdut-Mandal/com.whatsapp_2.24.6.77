package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.6h0  reason: invalid class name and case insensitive filesystem */
public final class C137956h0 implements C161097m9 {
    public static boolean A07 = true;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final RenderNode A05;
    public final AndroidComposeView A06;

    public void BqX(int i) {
        RenderNode renderNode = this.A05;
        renderNode.setLayerType(0);
        renderNode.setHasOverlappingRendering(true);
    }

    public boolean Bqz(boolean z) {
        return this.A05.setHasOverlappingRendering(true);
    }

    public void Bs3(float f) {
        this.A05.setRotationX(0.0f);
    }

    public void Bs4(float f) {
        this.A05.setRotationY(0.0f);
    }

    public void Bs5(float f) {
        this.A05.setRotation(0.0f);
    }

    public void Bsa(float f) {
        this.A05.setTranslationX(0.0f);
    }

    public void Bsb(float f) {
        this.A05.setTranslationY(0.0f);
    }

    public void B5W() {
        int i = Build.VERSION.SDK_INT;
        RenderNode renderNode = this.A05;
        if (i >= 24) {
            AnonymousClass5XB.A00(renderNode);
        } else {
            A00(renderNode);
        }
    }

    public void B68(Canvas canvas) {
        AnonymousClass00C.A0E(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.A05);
    }

    public float B8b() {
        return this.A05.getAlpha();
    }

    public boolean B9m() {
        return this.A05.getClipToOutline();
    }

    public float BBS() {
        return this.A05.getElevation();
    }

    public boolean BCH() {
        return this.A05.isValid();
    }

    public void BDq(Matrix matrix) {
        this.A05.getMatrix(matrix);
    }

    public void BQS(int i) {
        this.A01 += i;
        this.A02 += i;
        this.A05.offsetLeftAndRight(i);
    }

    public void BQV(int i) {
        this.A03 += i;
        this.A00 += i;
        this.A05.offsetTopAndBottom(i);
    }

    public void Bn0(C114355h5 r6, C161177mK r7, C006302t r8) {
        RenderNode renderNode = this.A05;
        Canvas start = renderNode.start(this.A02 - this.A01, this.A00 - this.A03);
        C137386g3 r2 = r6.A00;
        Canvas canvas = r2.A00;
        r2.A00 = start;
        if (r7 != null) {
            r2.BpF();
            r2.B2w(r7, 1);
        }
        r8.invoke(r2);
        if (r7 != null) {
            r2.Boi();
        }
        r2.A00 = canvas;
        renderNode.end(start);
    }

    public void Bq5(float f) {
        this.A05.setAlpha(f);
    }

    public void Bq8(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            AnonymousClass6U2.A02(this.A05, i);
        }
    }

    public void BqO(float f) {
        this.A05.setCameraDistance(-f);
    }

    public void BqS(boolean z) {
        this.A04 = z;
        this.A05.setClipToBounds(z);
    }

    public void BqT(boolean z) {
        this.A05.setClipToOutline(z);
    }

    public void Bqo(float f) {
        this.A05.setElevation(f);
    }

    public void BrQ(Outline outline) {
        this.A05.setOutline(outline);
    }

    public void BrZ(float f) {
        this.A05.setPivotX(f);
    }

    public void Bra(float f) {
        this.A05.setPivotY(f);
    }

    public boolean Brf(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        return this.A05.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public void Bs6(float f) {
        this.A05.setScaleX(f);
    }

    public void Bs7(float f) {
        this.A05.setScaleY(f);
    }

    public void BsI(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            AnonymousClass6U2.A03(this.A05, i);
        }
    }

    public int getHeight() {
        return this.A00 - this.A03;
    }

    public int getWidth() {
        return this.A02 - this.A01;
    }

    public C137956h0(AndroidComposeView androidComposeView) {
        this.A06 = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.A05 = create;
        if (A07) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                AnonymousClass6U2.A02(create, AnonymousClass6U2.A00(create));
                AnonymousClass6U2.A03(create, AnonymousClass6U2.A01(create));
            } else if (i < 24) {
                A00(this.A05);
                create.setLayerType(0);
                create.setHasOverlappingRendering(create.hasOverlappingRendering());
                A07 = false;
            }
            AnonymousClass5XB.A00(this.A05);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            A07 = false;
        }
    }

    public int B8u() {
        return this.A00;
    }

    public boolean B9l() {
        return this.A04;
    }

    public int BDV() {
        return this.A01;
    }

    public int BGq() {
        return this.A02;
    }

    public int BIP() {
        return this.A03;
    }

    public static final void A00(RenderNode renderNode) {
        renderNode.destroyDisplayListData();
    }

    public void Brv(AnonymousClass5VV r2) {
    }
}
