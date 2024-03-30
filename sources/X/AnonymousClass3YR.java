package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.settings.SettingsRowIconText;

/* renamed from: X.3YR  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3YR implements View.OnClickListener {
    public final /* synthetic */ C64683Pa A00;
    public final /* synthetic */ AnonymousClass4RR A01;
    public final /* synthetic */ AnonymousClass1Z8 A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AnonymousClass3YR(C64683Pa r1, AnonymousClass4RR r2, AnonymousClass1Z8 r3, String str) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = str;
    }

    public final void onClick(View view) {
        AnonymousClass1Z8 r5 = this.A02;
        C64683Pa r4 = this.A00;
        AnonymousClass4RR r2 = this.A01;
        String str = this.A03;
        ((SettingsRowIconText) r2).A01((Drawable) null, false);
        C35761jD r0 = new C35761jD(r5, r4, 12);
        C19930wk r22 = r5.A00;
        r22.execute(r0);
        r22.execute(new C35761jD(r5, r4, 13));
        r5.A01.A06(view.getContext(), C36331k8.A04(str));
    }
}
