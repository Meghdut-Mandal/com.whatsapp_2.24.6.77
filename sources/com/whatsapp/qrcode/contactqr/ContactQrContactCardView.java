package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass000;
import X.AnonymousClass141;
import X.AnonymousClass171;
import X.AnonymousClass185;
import X.AnonymousClass1EM;
import X.AnonymousClass1LI;
import X.AnonymousClass1Pp;
import X.AnonymousClass1QZ;
import X.AnonymousClass1T6;
import X.AnonymousClass3L0;
import X.AnonymousClass3SF;
import X.AnonymousClass92E;
import X.C012005e;
import X.C023109s;
import X.C18700tb;
import X.C187798yY;
import X.C18800tq;
import X.C18820ts;
import X.C19730wQ;
import X.C200649ht;
import X.C224514j;
import X.C27761Ps;
import X.C33511fU;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.QrImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.util.Log;
import java.util.EnumMap;

public class ContactQrContactCardView extends LinearLayout implements C18700tb {
    public C19730wQ A00;
    public AnonymousClass1LI A01;
    public AnonymousClass3SF A02;
    public AnonymousClass3SF A03;
    public AnonymousClass1Pp A04;
    public AnonymousClass185 A05;
    public AnonymousClass171 A06;
    public C27761Ps A07;
    public C18820ts A08;
    public AnonymousClass1T6 A09;
    public AnonymousClass1EM A0A;
    public AnonymousClass1QZ A0B;
    public View A0C;
    public View A0D;
    public QrImageView A0E;
    public AnonymousClass3SF A0F;
    public WaTextView A0G;
    public ThumbnailButton A0H;
    public boolean A0I;

    public void A02(AnonymousClass141 r9, boolean z) {
        AnonymousClass3SF r3;
        int i;
        AnonymousClass141 r4 = r9;
        if (!r9.A0f || !z) {
            this.A04.A07(this.A0H, r9);
        } else {
            this.A0H.setImageBitmap(this.A07.A07(getContext(), r4, C36441kJ.A00(getResources(), R.dimen.f7nameremoved), getResources().getDimensionPixelSize(R.dimen.f7nameremoved), false));
        }
        if (r9.A0G()) {
            AnonymousClass3SF r2 = this.A03;
            r2.A01.setText(this.A06.A0H(r9));
            boolean A062 = this.A0A.A06(C36431kI.A0j(r9));
            AnonymousClass3SF r0 = this.A02;
            int i2 = R.string.f12nameremoved;
            if (A062) {
                i2 = R.string.f12nameremoved;
            }
            r0.A01.setText(i2);
            return;
        }
        if (!r9.A0C()) {
            AnonymousClass3SF r02 = this.A03;
            r02.A01.setText(r9.A0a);
            r3 = this.A02;
            i = R.string.f12nameremoved;
        } else {
            AnonymousClass3L0 A022 = this.A05.A02(C36351kA.A0l(r9));
            if (r9.A0N() || (A022 != null && A022.A03 == 3)) {
                AnonymousClass3SF r03 = this.A03;
                r03.A01.setText(r9.A0a);
                this.A03.A03(1);
                r3 = this.A02;
                AnonymousClass1T6 r04 = this.A09;
                i = R.string.f12nameremoved;
                if (r04.A00.A0E(5846)) {
                    i = R.string.f12nameremoved;
                }
            } else {
                AnonymousClass3SF r05 = this.A03;
                r05.A01.setText(r9.A0a);
                r3 = this.A02;
                i = R.string.f12nameremoved;
            }
        }
        r3.A01.setText(i);
    }

    public void A01() {
        if (!this.A0I) {
            this.A0I = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A00 = C36351kA.A0N(A0W);
            this.A04 = C36361kB.A0V(A0W);
            this.A06 = C36341k9.A0S(A0W);
            this.A08 = C36341k9.A0T(A0W);
            this.A0A = C36371kC.A0l(A0W);
            this.A05 = C36371kC.A0U(A0W);
            this.A07 = C36361kB.A0W(A0W);
            this.A09 = (AnonymousClass1T6) A0W.A5L.get();
            this.A01 = C36361kB.A0S(A0W);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0B;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public void setCustomUrl(String str) {
        this.A0F.A01.setText(str);
    }

    public void setCustomUrlVisible(boolean z) {
        AnonymousClass3SF r0 = this.A0F;
        r0.A01.setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public void setPrompt(String str) {
        this.A0G.setText(str);
    }

    public void setQrCode(String str) {
        try {
            this.A0E.setQrCode(C200649ht.A00(C023109s.A01, str, new EnumMap(C187798yY.class)));
            this.A0E.invalidate();
        } catch (AnonymousClass92E e) {
            Log.e("ContactQrContactCardView/failed to set QR code", e);
        }
    }

    public void setStyle(int i) {
        C33511fU.A03(this.A03.A01);
        if (i == 1) {
            C36341k9.A0q(getContext(), this, C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
            setPadding(0, getResources().getDimensionPixelOffset(R.dimen.f7nameremoved), 0, getPaddingBottom());
            AnonymousClass000.A0a(this.A0G).setMargins(0, this.A0G.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, 0);
            WaTextView waTextView = this.A0G;
            waTextView.setTextSize(0, C36441kJ.A00(waTextView.getResources(), R.dimen.f7nameremoved));
            C36331k8.A0r(getContext(), this.A0G, R.color.f6nameremoved);
            this.A0D.setVisibility(0);
            return;
        }
        C36331k8.A0q(getContext(), this.A0C, R.string.f12nameremoved);
    }

    public ContactQrContactCardView(Context context) {
        super(context);
        A01();
        A00(context);
    }

    private void A00(Context context) {
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A0H = (ThumbnailButton) C012005e.A02(this, R.id.profile_picture);
        this.A03 = AnonymousClass3SF.A01(this, this.A01, R.id.title);
        this.A0F = AnonymousClass3SF.A01(this, this.A01, R.id.custom_url);
        this.A02 = AnonymousClass3SF.A01(this, this.A01, R.id.subtitle);
        this.A0C = C012005e.A02(this, R.id.qr_code_container);
        this.A0E = (QrImageView) C012005e.A02(this, R.id.qr_code);
        this.A0G = C36401kF.A0Q(this, R.id.prompt);
        this.A0D = C012005e.A02(this, R.id.qr_shadow);
    }

    public ContactQrContactCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00(context);
    }

    public ContactQrContactCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public ContactQrContactCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A00(context);
    }
}
