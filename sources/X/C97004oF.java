package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.4oF  reason: invalid class name and case insensitive filesystem */
public class C97004oF extends AnonymousClass0D3 {
    public boolean A00 = true;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final ViewGroup A07;
    public final C18820ts A08;

    public void A0B() {
        if (!this.A00) {
            this.A01.setBackgroundResource(0);
            C018607y.A02((ViewGroup) this.A0H, new AnonymousClass0IO());
            this.A05.setVisibility(8);
            this.A02.setVisibility(8);
            this.A04.setVisibility(8);
            this.A03.setSelected(false);
            this.A00 = true;
        }
    }

    public C97004oF(Context context, ViewGroup viewGroup, C18820ts r5) {
        super(C36361kB.A0E(LayoutInflater.from(context), viewGroup, R.layout.f9nameremoved));
        this.A08 = r5;
        View view = this.A0H;
        this.A01 = view.findViewById(R.id.reactions_bg);
        this.A02 = view.findViewById(R.id.reaction_lol);
        this.A04 = view.findViewById(R.id.reaction_sad);
        this.A03 = view.findViewById(R.id.reaction_love);
        this.A05 = view.findViewById(R.id.reaction_wow);
        this.A07 = C36411kG.A0P(view, R.id.reactions_right);
        this.A06 = C36411kG.A0P(view, R.id.reactions_left);
    }
}
