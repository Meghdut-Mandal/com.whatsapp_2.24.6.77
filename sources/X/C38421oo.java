package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.text.ReadMoreTextView;

/* renamed from: X.1oo  reason: invalid class name and case insensitive filesystem */
public class C38421oo extends FrameLayout implements C18700tb {
    public AnonymousClass17Y A00;
    public AnonymousClass1T4 A01;
    public AnonymousClass16D A02;
    public C21060yb A03;
    public AnonymousClass141 A04;
    public AnonymousClass1H2 A05;
    public C20810yC A06;
    public C27541Op A07;
    public GroupJid A08;
    public C19890wg A09;
    public C32681e1 A0A;
    public C19770wU A0B;
    public AnonymousClass1QZ A0C;
    public boolean A0D;
    public CharSequence A0E;
    public final ReadMoreTextView A0F;
    public final C87854Qk A0G;
    public final AnonymousClass1RJ A0H;
    public final AnonymousClass1RJ A0I;

    public static void A00(C38421oo r3) {
        AnonymousClass3QL r0;
        AnonymousClass141 r02 = r3.A04;
        if (r02 == null || (r0 = r02.A0K) == null || TextUtils.isEmpty(r0.A03)) {
            r3.A0F.setVisibility(8);
            r3.A0I.A03(8);
            r3.A0H.A03(8);
            return;
        }
        String str = r3.A04.A0K.A03;
        r3.A0F.setVisibility(0);
        r3.A0H.A03(0);
        r3.setDescription(str);
    }

    private int getEnhancedDescriptionCollapsedLineLimit() {
        return this.A06.A07(3259);
    }

    private void setDescription(CharSequence charSequence) {
        if (!charSequence.equals(this.A0E)) {
            this.A0E = charSequence;
            C21060yb r5 = this.A03;
            C19890wg r4 = this.A09;
            Context context = getContext();
            ReadMoreTextView readMoreTextView = this.A0F;
            SpannableStringBuilder A0D2 = C36401kF.A0D(readMoreTextView, r5, r4, AnonymousClass3UG.A03(context, readMoreTextView.getPaint(), this.A05, charSequence));
            this.A0A.A04(readMoreTextView.getContext(), A0D2);
            readMoreTextView.A0I(A0D2);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0C;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public C38421oo(Context context) {
        super(context);
        if (!this.A0D) {
            this.A0D = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A06 = C36341k9.A0V(A0W);
            this.A00 = C36351kA.A0M(A0W);
            this.A0A = C36351kA.A0p(A0W.A00);
            this.A0B = C36341k9.A0Z(A0W);
            this.A05 = C36351kA.A0e(A0W);
            this.A02 = C36341k9.A0R(A0W);
            this.A03 = C36351kA.A0U(A0W);
            this.A01 = (AnonymousClass1T4) A0W.A1p.get();
            this.A07 = C36381kD.A0c(A0W);
            this.A09 = C36351kA.A0m(A0W);
        }
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        this.A0I = C36341k9.A0X(this, R.id.community_description_top_divider);
        this.A0H = C36341k9.A0X(this, R.id.community_description_bottom_divider);
        ReadMoreTextView readMoreTextView = (ReadMoreTextView) C012005e.A02(this, R.id.community_description_text);
        this.A0F = readMoreTextView;
        C36331k8.A16(readMoreTextView, this.A03);
        readMoreTextView.setLinesLimit(getEnhancedDescriptionCollapsedLineLimit());
        this.A0G = new C89584Xc(this, 6);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A07.A00(this.A0G);
        this.A0F.requestLayout();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A07.A01(this.A0G);
    }
}
