package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;

/* renamed from: X.3Aw  reason: invalid class name and case insensitive filesystem */
public final class C61183Aw {
    public final View A00;
    public final TextView A01;
    public final SwitchCompat A02;
    public final C18820ts A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass00S A05;
    public final LayoutInflater A06;
    public final ViewGroup A07;
    public final Button A08;
    public final LinearLayout A09;

    public C61183Aw(LayoutInflater layoutInflater, ViewGroup viewGroup, C18820ts r6, AnonymousClass00S r7, AnonymousClass00S r8) {
        boolean A1V = C36371kC.A1V(layoutInflater);
        AnonymousClass00C.A0D(r6, 6);
        this.A06 = layoutInflater;
        this.A07 = viewGroup;
        this.A05 = r7;
        this.A04 = r8;
        this.A03 = r6;
        View A0J = C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, A1V);
        this.A00 = A0J;
        LinearLayout linearLayout = (LinearLayout) C36361kB.A0F(A0J, R.id.layout_archived_settings);
        this.A09 = linearLayout;
        this.A01 = C36351kA.A0F(A0J, R.id.body);
        this.A02 = (SwitchCompat) C36361kB.A0F(A0J, R.id.switch_button);
        Button button = (Button) C36361kB.A0F(A0J, R.id.button_done);
        this.A08 = button;
        C67103Yn.A00(linearLayout, this, 2);
        C67103Yn.A00(button, this, 3);
    }
}
