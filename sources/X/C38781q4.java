package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

/* renamed from: X.1q4  reason: invalid class name and case insensitive filesystem */
public class C38781q4 extends LinearLayout implements C18700tb {
    public C24801Dv A00;
    public AnonymousClass17Y A01;
    public AnonymousClass1T4 A02;
    public AnonymousClass1LV A03;
    public C28431Sq A04;
    public AnonymousClass16D A05;
    public AnonymousClass171 A06;
    public AnonymousClass17X A07;
    public C20810yC A08;
    public AnonymousClass1EL A09;
    public AnonymousClass147 A0A;
    public C19770wU A0B;
    public AnonymousClass1QZ A0C;
    public boolean A0D;
    public final View A0E;
    public final View A0F;
    public final View A0G;
    public final View A0H;
    public final View A0I;
    public final C39971uO A0J;
    public final View A0K;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0C;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public C38781q4(Context context) {
        super(context);
        if (!this.A0D) {
            this.A0D = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A08 = C36341k9.A0V(A0W);
            this.A01 = C36351kA.A0M(A0W);
            this.A0B = C36341k9.A0Z(A0W);
            this.A00 = C36351kA.A0J(A0W);
            this.A05 = C36341k9.A0R(A0W);
            this.A06 = C36341k9.A0S(A0W);
            this.A09 = C36381kD.A0d(A0W);
            this.A04 = C36391kE.A0b(A0W);
            this.A03 = C36361kB.A0U(A0W);
            this.A02 = (AnonymousClass1T4) A0W.A1p.get();
            this.A07 = C36351kA.A0b(A0W);
        }
        AnonymousClass01G r5 = (AnonymousClass01G) C24801Dv.A01(context, AnonymousClass01L.class);
        C39971uO r7 = (C39971uO) C36441kJ.A0b(r5).A00(C39971uO.class);
        this.A0J = r7;
        View inflate = View.inflate(getContext(), R.layout.f9nameremoved, this);
        this.A0K = inflate;
        this.A0G = C012005e.A02(inflate, R.id.community_no_longer_description);
        View A022 = C012005e.A02(inflate, R.id.report_community_button);
        this.A0I = A022;
        View A023 = C012005e.A02(inflate, R.id.deactivate_community_btn);
        this.A0E = A023;
        View A024 = C012005e.A02(inflate, R.id.delete_community_btn);
        this.A0F = A024;
        View A025 = C012005e.A02(inflate, R.id.exit_community_btn);
        this.A0H = A025;
        AnonymousClass3YE.A00(A022, this, context, 26);
        AnonymousClass3YE.A00(A024, this, context, 27);
        AnonymousClass3YE.A00(A023, this, context, 28);
        C66943Xx.A00(A025, this, 7);
        C53592rZ.A01(r5, r7.A03, context, 6);
        r7.A00.A08(r5, new AnonymousClass3UQ(r5, this.A03, r7, new AnonymousClass4ZT(this, 0), 1));
        AnonymousClass3UW.A00(r5, r7.A02, context, this, 7);
    }
}
