package com.whatsapp.identity;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass0S4;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1MK;
import X.AnonymousClass1Q4;
import X.AnonymousClass3FF;
import X.AnonymousClass3MA;
import X.AnonymousClass3UF;
import X.AnonymousClass3Y3;
import X.AnonymousClass4C2;
import X.AnonymousClass4GX;
import X.AnonymousClass4TF;
import X.AnonymousClass9S4;
import X.C000800j;
import X.C001400p;
import X.C18800tq;
import X.C18830tt;
import X.C19730wQ;
import X.C19930wk;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C50322kZ;
import X.C53722rm;
import X.C599836a;
import X.C63453Kc;
import X.C65113Qu;
import X.C75313n1;
import X.C89334Wd;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.QrScannerOverlay;
import com.whatsapp.qrcode.WaQrScannerView;
import java.nio.charset.Charset;

public final class ScanQrCodeActivity extends AnonymousClass155 {
    public ProgressBar A00;
    public AnonymousClass9S4 A01;
    public WaTextView A02;
    public AnonymousClass1MK A03;
    public AnonymousClass1Q4 A04;
    public AnonymousClass16D A05;
    public AnonymousClass171 A06;
    public C599836a A07;
    public AnonymousClass3FF A08;
    public C63453Kc A09;
    public QrScannerOverlay A0A;
    public WaQrScannerView A0B;
    public View A0C;
    public boolean A0D;
    public final Charset A0E;
    public final AnonymousClass00T A0F;
    public final AnonymousClass00T A0G;
    public final AnonymousClass4TF A0H;

    public void A2F() {
        if (!this.A0D) {
            this.A0D = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A05 = C36341k9.A0R(r2);
            this.A06 = C36341k9.A0S(r2);
            this.A08 = (AnonymousClass3FF) r1.A8I.get();
            this.A03 = C36381kD.A0W(r2);
            this.A04 = (AnonymousClass1Q4) r1.A0w.get();
            this.A09 = C27111My.A2P(A0L);
        }
    }

    public void finish() {
        WaQrScannerView waQrScannerView = this.A0B;
        if (waQrScannerView == null) {
            throw C36331k8.A0d("qrScannerView");
        }
        if (waQrScannerView.getVisibility() == 0) {
            View view = this.A0C;
            if (view == null) {
                throw C36331k8.A0d("mainLayout");
            } else if (view.getVisibility() == 8) {
                C63453Kc r1 = this.A09;
                if (r1 != null) {
                    r1.A02((Runnable) null);
                    return;
                }
                throw C36331k8.A0d("qrCodeValidationUtil");
            }
        }
        super.finish();
    }

    public ScanQrCodeActivity(int i) {
        this.A0D = false;
        C89334Wd.A00(this, 43);
    }

    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        setTitle(R.string.f12nameremoved);
        Toolbar toolbar = (Toolbar) C36361kB.A0D(this, R.id.toolbar);
        AnonymousClass3UF.A0D(getBaseContext(), toolbar, this.A00, R.color.f6nameremoved);
        toolbar.setTitle((int) R.string.f12nameremoved);
        C19730wQ r1 = this.A02;
        AnonymousClass00T r5 = this.A0F;
        if (!C36361kB.A1X(r1, (AnonymousClass141) r5.getValue()) || !C36391kE.A1X(this.A0D)) {
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass171 r12 = this.A06;
            if (r12 != null) {
                C36371kC.A1K(r12, (AnonymousClass141) r5.getValue(), A0L, 0);
                string = getString(R.string.f12nameremoved, A0L);
            } else {
                throw C36331k8.A0c();
            }
        } else {
            AnonymousClass171 r2 = this.A06;
            if (r2 != null) {
                string = C53722rm.A00(this, r2, this.A00, (AnonymousClass141) r5.getValue());
            } else {
                throw C36331k8.A0c();
            }
        }
        toolbar.setSubtitle((CharSequence) string);
        toolbar.setBackgroundResource(C36441kJ.A04(C36371kC.A0B(toolbar)));
        toolbar.A0J(this, R.style.f13nameremoved);
        toolbar.setNavigationOnClickListener(new AnonymousClass3Y3(this, 7));
        setSupportActionBar(toolbar);
        this.A00 = (ProgressBar) C36361kB.A0H(this, R.id.progress_bar);
        AnonymousClass3FF r4 = this.A08;
        if (r4 != null) {
            UserJid A0l = C36351kA.A0l((AnonymousClass141) r5.getValue());
            AnonymousClass4TF r0 = this.A0H;
            C19930wk r3 = r4.A09;
            r3.A02();
            new C50322kZ(r0, r4, A0l).A02.executeOnExecutor(r3, new Void[0]);
            this.A0C = C36361kB.A0H(this, R.id.main_layout);
            this.A0B = (WaQrScannerView) C36361kB.A0H(this, R.id.qr_scanner_view);
            this.A0A = (QrScannerOverlay) C36361kB.A0H(this, R.id.overlay);
            this.A02 = (WaTextView) C36361kB.A0H(this, R.id.error_indicator);
            C63453Kc r42 = this.A09;
            if (r42 != null) {
                View view = this.A00;
                AnonymousClass00C.A08(view);
                r42.A01(view, new C65113Qu(this, 1), (UserJid) this.A0G.getValue());
                C63453Kc r32 = this.A09;
                if (r32 != null) {
                    WaQrScannerView waQrScannerView = r32.A0G;
                    if (waQrScannerView != null) {
                        waQrScannerView.setQrDecodeHints(r32.A0I);
                        waQrScannerView.setQrScannerCallback(new AnonymousClass3MA(r32, 0));
                    }
                    AnonymousClass3Y3.A00(C36361kB.A0H(this, R.id.scan_code_button), this, 6);
                    return;
                }
                throw C36331k8.A0d("qrCodeValidationUtil");
            }
            throw C36331k8.A0d("qrCodeValidationUtil");
        }
        throw C36331k8.A0d("fingerprintUtil");
    }

    public void onDestroy() {
        super.onDestroy();
        C63453Kc r1 = this.A09;
        if (r1 != null) {
            r1.A02 = null;
            r1.A0G = null;
            r1.A0F = null;
            r1.A01 = null;
            r1.A06 = null;
            r1.A05 = null;
            return;
        }
        throw C36331k8.A0d("qrCodeValidationUtil");
    }

    public static final void A01(ScanQrCodeActivity scanQrCodeActivity) {
        super.finish();
    }

    public ScanQrCodeActivity() {
        this(0);
        this.A0E = AnonymousClass0S4.A00;
        this.A0G = C001400p.A00(C000800j.PUBLICATION, new AnonymousClass4GX(this));
        this.A0F = C36431kI.A1I(new AnonymousClass4C2(this));
        this.A0H = new C75313n1(this);
    }
}
