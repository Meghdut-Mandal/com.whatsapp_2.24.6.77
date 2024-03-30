package com.whatsapp.qrcode;

import X.AnonymousClass1K2;
import X.AnonymousClass1QZ;
import X.AnonymousClass4UB;
import X.AnonymousClass4X4;
import X.AnonymousClass6HR;
import X.C06360Th;
import X.C1030553k;
import X.C129436Gy;
import X.C160747lW;
import X.C161087m8;
import X.C162397oW;
import X.C18700tb;
import X.C18800tq;
import X.C19890wg;
import X.C20810yC;
import X.C21060yb;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36441kJ;
import X.C88954Ur;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.util.Log;
import java.util.Map;

public class QrScannerViewV2 extends FrameLayout implements C88954Ur, C18700tb {
    public C161087m8 A00;
    public C21060yb A01;
    public C20810yC A02;
    public C19890wg A03;
    public AnonymousClass4UB A04;
    public AnonymousClass1QZ A05;
    public C160747lW A06;
    public boolean A07;
    public final Handler A08;

    public void BoN() {
    }

    public void Bog() {
    }

    public /* synthetic */ void setShouldUseGoogleVisionScanner(boolean z) {
    }

    public void A01() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A02 = C36341k9.A0V(A0W);
            this.A01 = C36351kA.A0U(A0W);
            this.A03 = C36351kA.A0m(A0W);
        }
    }

    public boolean BNS() {
        return this.A00.BNS();
    }

    public void BuR() {
        this.A00.Boh();
    }

    public void Bv5() {
        this.A00.pause();
    }

    public boolean BvN() {
        return this.A00.BvN();
    }

    public void Bvw() {
        this.A00.Bvw();
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A05;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public void setQrDecodeHints(Map map) {
        this.A00.setQrDecodeHints(map);
    }

    public QrScannerViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A08 = C36341k9.A0H();
        this.A06 = new AnonymousClass4X4(this, 1);
        A00();
    }

    private void A00() {
        C161087m8 r1;
        Context context = getContext();
        if (this.A02.A0E(125)) {
            r1 = C129436Gy.A00(context, "createSimpleView", AnonymousClass1K2.A02(this.A01, this.A03));
            if (r1 != null) {
                Log.i("QrScannerViewV2/LiteCameraView");
                this.A00 = r1;
                r1.setQrScanningEnabled(true);
                C161087m8 r12 = this.A00;
                r12.setCameraCallback(this.A06);
                View view = (View) r12;
                setupTapToFocus(view);
                addView(view);
            }
        }
        Log.i("QrScannerViewV2/CameraView");
        r1 = new C1030553k(context);
        this.A00 = r1;
        r1.setQrScanningEnabled(true);
        C161087m8 r122 = this.A00;
        r122.setCameraCallback(this.A06);
        View view2 = (View) r122;
        setupTapToFocus(view2);
        addView(view2);
    }

    private void setupTapToFocus(View view) {
        view.setOnTouchListener(new AnonymousClass6HR(new C06360Th(getContext(), new C162397oW(this, 3)), this, 3));
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        C161087m8 r0 = this.A00;
        if (i == 0) {
            r0.Bok();
            this.A00.B2r();
            return;
        }
        r0.pause();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        ((View) this.A00).setVisibility(i);
    }

    public void setQrScannerCallback(AnonymousClass4UB r1) {
        this.A04 = r1;
    }

    public QrScannerViewV2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public QrScannerViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A08 = C36341k9.A0H();
        this.A06 = new AnonymousClass4X4(this, 1);
        A00();
    }

    public QrScannerViewV2(Context context) {
        super(context);
        A01();
        this.A08 = C36341k9.A0H();
        this.A06 = new AnonymousClass4X4(this, 1);
        A00();
    }
}
