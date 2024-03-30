package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1ny  reason: invalid class name and case insensitive filesystem */
public final class C38181ny extends FrameLayout implements AnonymousClass4UQ, C18700tb {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public TextEmojiLabel A0E;
    public C21060yb A0F;
    public C20810yC A0G;
    public AnonymousClass13J A0H;
    public AnonymousClass1QZ A0I;
    public boolean A0J;
    public C65053Qn A0K;

    public int getType() {
        return 0;
    }

    public void BKD() {
        this.A02.setVisibility(8);
    }

    public void BoA(AnonymousClass3BC r8) {
        int i;
        int i2;
        int i3;
        this.A02.setVisibility(0);
        this.A06.setVisibility(r8.A0B);
        View view = this.A05;
        int i4 = r8.A0A;
        view.setVisibility(i4);
        View view2 = this.A01;
        int i5 = r8.A02;
        view2.setVisibility(i5);
        this.A00.setVisibility(r8.A00);
        this.A03.setVisibility(r8.A03);
        this.A04.setVisibility(r8.A04);
        TextEmojiLabel textEmojiLabel = this.A0E;
        int i6 = r8.A06;
        textEmojiLabel.setVisibility(i6);
        if (i4 == 0 && (i3 = r8.A09) != -1) {
            TextView textView = this.A0C;
            textView.setText(i3);
            C36331k8.A0q(getContext(), textView, r8.A08);
        }
        if (i5 == 0 && (i2 = r8.A01) != -1) {
            this.A08.setText(i2);
        }
        if (i6 == 0 && (i = r8.A05) != -1) {
            C36331k8.A1A(this.A0G, textEmojiLabel);
            C36331k8.A16(textEmojiLabel, this.A0F);
            textEmojiLabel.setText(this.A0K.A01(C36381kD.A0t(this, i)));
        }
        int i7 = r8.A07;
        if (i7 != -1) {
            TextView textView2 = this.A0B;
            textView2.setText(i7);
            C36331k8.A0q(getContext(), textView2, i7);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0I;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0I = r0;
        }
        return r0.generatedComponent();
    }

    public boolean isVisible() {
        return AnonymousClass000.A1Q(this.A02.getVisibility());
    }

    public void setup(C65053Qn r3) {
        this.A0K = r3;
        AnonymousClass3YF.A00(this.A06, this, r3, 49);
        AnonymousClass3YG.A00(this.A01, this, r3, 0);
        C66963Xz.A00(this.A00, r3, 29);
        C66963Xz.A00(this.A05, r3, 30);
        C66963Xz.A00(this.A03, this, 28);
        AnonymousClass3YG.A00(this.A04, this, r3, 1);
        C33511fU.A03(this.A0D);
        C33511fU.A03(this.A0C);
        C33511fU.A03(this.A08);
        C33511fU.A03(this.A07);
        C33511fU.A03(this.A0A);
    }

    public C38181ny(Context context) {
        super(context);
        if (!this.A0J) {
            this.A0J = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A0G = C36341k9.A0V(A0W);
            this.A0H = C36351kA.A0q(A0W);
            this.A0F = C36351kA.A0U(A0W);
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A00 = findViewById(R.id.add_btn);
        this.A02 = findViewById(R.id.content);
        this.A06 = findViewById(R.id.spam_btn);
        this.A01 = findViewById(R.id.block_btn);
        this.A0B = C36391kE.A0P(this, R.id.header);
        this.A05 = findViewById(R.id.not_spam_btn);
        this.A04 = findViewById(R.id.exit_group_btn);
        this.A07 = C36391kE.A0P(this, R.id.add_btn_text);
        this.A0D = C36391kE.A0P(this, R.id.spam_btn_text);
        this.A08 = C36391kE.A0P(this, R.id.block_btn_text);
        this.A0C = C36391kE.A0P(this, R.id.not_spam_btn_text);
        this.A0A = C36391kE.A0P(this, R.id.exit_group_btn_text);
        this.A0E = C36401kF.A0P(this, R.id.group_privacy_info);
        this.A03 = findViewById(R.id.dismiss_btn);
        this.A09 = C36391kE.A0P(this, R.id.dismiss_btn_text);
    }
}
