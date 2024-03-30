package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.text.ReadMoreTextView;

/* renamed from: X.2g0  reason: invalid class name */
public final class AnonymousClass2g0 extends ReadMoreTextView {
    public final Context A00;
    public final C19970wo A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass147 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2g0(Context context, C19970wo r6, AnonymousClass190 r7, AnonymousClass147 r8) {
        super(context);
        int A04 = C36361kB.A04(r6, r7, 1);
        C36331k8.A1G(context, 3, r8);
        this.A01 = r6;
        this.A02 = r7;
        this.A00 = context;
        this.A03 = r8;
        AnonymousClass088.A06(this, R.style.f13nameremoved);
        this.A04 = context.getString(R.string.f12nameremoved);
        this.A01 = C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A06 = true;
        setLinesLimit(A04);
        setGravity(17);
        setVisibility(8);
    }

    public static final void setupReadMoreClickListener$lambda$1(AnonymousClass2g0 r5, View view) {
        AnonymousClass00C.A0D(r5, 0);
        Activity A002 = C24801Dv.A00(r5.A00);
        if (A002 instanceof AnonymousClass01L) {
            Intent A0q = AnonymousClass190.A0q(A002, r5.A03, false, true, true);
            AnonymousClass3M9.A00(A0q, A002);
            C05290Pd.A00(A002, A0q, (Bundle) null);
        }
    }
}
