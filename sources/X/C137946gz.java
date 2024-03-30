package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.6gz  reason: invalid class name and case insensitive filesystem */
public final class C137946gz implements C161097m9 {
    public final RenderNode A00 = new RenderNode("Compose");
    public final AndroidComposeView A01;

    public boolean Bqz(boolean z) {
        return this.A00.setHasOverlappingRendering(true);
    }

    public void Bs3(float f) {
        this.A00.setRotationX(0.0f);
    }

    public void Bs4(float f) {
        this.A00.setRotationY(0.0f);
    }

    public void Bs5(float f) {
        this.A00.setRotationZ(0.0f);
    }

    public void Bsa(float f) {
        this.A00.setTranslationX(0.0f);
    }

    public void Bsb(float f) {
        this.A00.setTranslationY(0.0f);
    }

    public void B5W() {
        this.A00.discardDisplayList();
    }

    public void B68(Canvas canvas) {
        canvas.drawRenderNode(this.A00);
    }

    public float B8b() {
        return this.A00.getAlpha();
    }

    public int B8u() {
        return this.A00.getBottom();
    }

    public boolean B9l() {
        return this.A00.getClipToBounds();
    }

    public boolean B9m() {
        return this.A00.getClipToOutline();
    }

    public float BBS() {
        return this.A00.getElevation();
    }

    public boolean BCH() {
        return this.A00.hasDisplayList();
    }

    public int BDV() {
        return this.A00.getLeft();
    }

    public void BDq(Matrix matrix) {
        this.A00.getMatrix(matrix);
    }

    public int BGq() {
        return this.A00.getRight();
    }

    public int BIP() {
        return this.A00.getTop();
    }

    public void BQS(int i) {
        this.A00.offsetLeftAndRight(i);
    }

    public void BQV(int i) {
        this.A00.offsetTopAndBottom(i);
    }

    public void Bn0(C114355h5 r5, C161177mK r6, C006302t r7) {
        RenderNode renderNode = this.A00;
        C137386g3 r2 = r5.A00;
        Canvas canvas = r2.A00;
        r2.A00 = renderNode.beginRecording();
        if (r6 != null) {
            r2.BpF();
            r2.B2w(r6, 1);
        }
        r7.invoke(r2);
        if (r6 != null) {
            r2.Boi();
        }
        r2.A00 = canvas;
        renderNode.endRecording();
    }

    public void Bq5(float f) {
        this.A00.setAlpha(f);
    }

    public void Bq8(int i) {
        this.A00.setAmbientShadowColor(i);
    }

    public void BqO(float f) {
        this.A00.setCameraDistance(f);
    }

    public void BqS(boolean z) {
        this.A00.setClipToBounds(z);
    }

    public void BqT(boolean z) {
        this.A00.setClipToOutline(z);
    }

    public void BqX(int i) {
        RenderNode renderNode = this.A00;
        renderNode.setUseCompositingLayer(false, (Paint) null);
        renderNode.setHasOverlappingRendering(true);
    }

    public void Bqo(float f) {
        this.A00.setElevation(f);
    }

    public void BrQ(Outline outline) {
        this.A00.setOutline(outline);
    }

    public void BrZ(float f) {
        this.A00.setPivotX(f);
    }

    public void Bra(float f) {
        this.A00.setPivotY(f);
    }

    public boolean Brf(int i, int i2, int i3, int i4) {
        return this.A00.setPosition(i, i2, i3, i4);
    }

    public void Brv(AnonymousClass5VV r3) {
        if (Build.VERSION.SDK_INT >= 31) {
            AnonymousClass5XA.A00(this.A00);
        }
    }

    public void Bs6(float f) {
        this.A00.setScaleX(f);
    }

    public void Bs7(float f) {
        this.A00.setScaleY(f);
    }

    public void BsI(int i) {
        this.A00.setSpotShadowColor(i);
    }

    public int getHeight() {
        return this.A00.getHeight();
    }

    public int getWidth() {
        return this.A00.getWidth();
    }

    public C137946gz(AndroidComposeView androidComposeView) {
        this.A01 = androidComposeView;
    }
}
