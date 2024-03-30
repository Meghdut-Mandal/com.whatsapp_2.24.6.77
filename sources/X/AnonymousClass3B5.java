package X;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.3B5  reason: invalid class name */
public class AnonymousClass3B5 {
    public Account A00;
    public Account[] A01;
    public final Context A02;
    public final EditText A03;
    public final ImageView A04;
    public final TextInputLayout A05;
    public final AnonymousClass17Y A06;
    public final C229216m A07;
    public final C20830yE A08;
    public final C20810yC A09;
    public final C19770wU A0A;
    public final WeakReference A0B;

    public AnonymousClass3B5(Context context, View view, AnonymousClass17Y r6, C229216m r7, C87544Pf r8, C20830yE r9, C20810yC r10, C19770wU r11) {
        this.A02 = context;
        this.A06 = r6;
        this.A0A = r11;
        this.A09 = r10;
        this.A07 = r7;
        this.A08 = r9;
        this.A0B = AnonymousClass001.A0F(r8);
        this.A03 = (EditText) C012005e.A02(view, R.id.storage_options_field);
        this.A04 = C36401kF.A0G(view, R.id.save_to_icon);
        this.A05 = (TextInputLayout) C012005e.A02(view, R.id.contacts_storage_options_selector);
        C66943Xx.A00(this.A03, this, 29);
        this.A05.setHint((CharSequence) this.A02.getResources().getString(R.string.f12nameremoved));
        this.A0A.Bp1(C80213v2.A00(this, 30));
    }
}
