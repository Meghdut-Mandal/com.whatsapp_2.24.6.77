package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1o8  reason: invalid class name and case insensitive filesystem */
public final class C38261o8 extends FrameLayout implements C18700tb {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public AnonymousClass1QZ A04;
    public boolean A05;
    public AnonymousClass1NG A06;
    public C220412q A07;

    public void setup(C20810yC r11, AnonymousClass01L r12, C220412q r13, C225014r r14, Runnable runnable, AnonymousClass1NG r16, C33201et r17, AnonymousClass141 r18) {
        this.A07 = r13;
        AnonymousClass1NG r4 = r16;
        this.A06 = r4;
        C33201et r6 = r17;
        AnonymousClass141 r3 = r18;
        this.A03.setOnClickListener(new C67123Yp(this, r3, r4, r11, r6, r14, r12, 2));
        C66963Xz.A00(this.A02, runnable, 31);
    }

    public void A00(AnonymousClass11F r8, boolean z, boolean z2) {
        View view = this.A00;
        boolean z3 = false;
        view.setVisibility(C36351kA.A00(z ? 1 : 0));
        if (z) {
            AnonymousClass1NG r0 = this.A06;
            UserJid A0b = C36401kF.A0b(r8);
            boolean A0O = r0.A0O(A0b);
            int i = R.string.f12nameremoved;
            if (A0O) {
                i = R.string.f12nameremoved;
            }
            TextView textView = this.A03;
            textView.setText(i);
            if (!A0O && !TextUtils.isEmpty(this.A07.A0D(r8))) {
                z3 = true;
            }
            if (z2) {
                if (!z3) {
                    this.A02.setVisibility(8);
                }
                view.setVisibility(8);
            } else if (z3) {
                textView.setVisibility(8);
                this.A02.setText(R.string.f12nameremoved);
            } else if (AnonymousClass143.A0H(A0b)) {
                this.A01.setVisibility(8);
                view = this.A02;
                view.setVisibility(8);
            } else {
                return;
            }
            view = this.A01;
            view.setVisibility(8);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public C38261o8(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A00 = findViewById(R.id.content);
        this.A01 = findViewById(R.id.divider);
        this.A02 = C36391kE.A0P(this, R.id.add_btn);
        this.A03 = C36391kE.A0P(this, R.id.block_btn);
    }
}
