package com.whatsapp.qrcode;

import X.AnonymousClass1QZ;
import X.AnonymousClass4UB;
import X.C18700tb;
import X.C20810yC;
import X.C27851Qb;
import X.C27861Qc;
import X.C36341k9;
import X.C36441kJ;
import X.C37461mP;
import X.C88954Ur;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;

public class WaQrScannerView extends FrameLayout implements C88954Ur, C18700tb {
    public C20810yC A00;
    public C88954Ur A01;
    public AnonymousClass1QZ A02;
    public boolean A03;

    private void A00() {
        View r0;
        boolean A0E = this.A00.A0E(349);
        Context context = getContext();
        if (A0E) {
            r0 = new QrScannerViewV2(context);
        } else {
            r0 = new C37461mP(context);
        }
        addView(r0);
        this.A01 = (C88954Ur) r0;
    }

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            this.A00 = C36341k9.A0V(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
        }
    }

    public boolean BNS() {
        return this.A01.BNS();
    }

    public void BoN() {
        this.A01.BoN();
    }

    public void Bog() {
        this.A01.Bog();
    }

    public void BuR() {
        this.A01.BuR();
    }

    public void Bv5() {
        this.A01.Bv5();
    }

    public boolean BvN() {
        return this.A01.BvN();
    }

    public void Bvw() {
        this.A01.Bvw();
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setQrDecodeHints(Map map) {
        this.A01.setQrDecodeHints(map);
    }

    public void setQrScannerCallback(AnonymousClass4UB r2) {
        this.A01.setQrScannerCallback(r2);
    }

    public void setShouldUseGoogleVisionScanner(boolean z) {
        this.A01.setShouldUseGoogleVisionScanner(z);
    }

    public WaQrScannerView(Context context) {
        super(context);
        A01();
        A00();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        ((View) this.A01).setVisibility(i);
    }

    public WaQrScannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00();
    }

    public WaQrScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A01();
        A00();
    }
}
