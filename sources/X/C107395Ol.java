package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.5Ol  reason: invalid class name and case insensitive filesystem */
public class C107395Ol extends C101084wy {
    public ViewGroup A00;
    public ImageView A01;
    public TextView A02;
    public String A03;
    public final AnonymousClass64N A04;

    private void A01(String str) {
        String str2;
        TextView textView = this.A02;
        if (textView != null) {
            textView.setText(str);
            this.A02.setVisibility(0);
        }
        ImageView imageView = this.A01;
        if (imageView != null && (str2 = this.A03) != null) {
            this.A04.A00(imageView, (AnonymousClass6KE) null, str2, str2);
            this.A01.setVisibility(0);
        }
    }

    public void A02(Intent intent, Bundle bundle) {
        WaBloksActivity waBloksActivity = this.A03;
        C36381kD.A0O(waBloksActivity).A0Q("");
        ViewGroup viewGroup = (ViewGroup) C36361kB.A0E(LayoutInflater.from(C36381kD.A0O(waBloksActivity).A0A()), (ViewGroup) waBloksActivity.findViewById(R.id.bk_navigation_custom_view), R.layout.f9nameremoved);
        this.A00 = viewGroup;
        this.A01 = C36391kE.A0N(viewGroup, R.id.bk_navigation_logo);
        TextView A0P = C36391kE.A0P(this.A00, R.id.bk_navigation_title);
        this.A02 = A0P;
        C18740tg.A04(this.A00);
        C18740tg.A04(this.A01);
        C18740tg.A04(A0P);
        C33521fV.A07(A0P, true);
        if (bundle != null) {
            this.A03 = bundle.getString("bk_navigation_bar_logo");
            A01(this.A01);
        }
        C36381kD.A0O(waBloksActivity).A0V(true);
        C36381kD.A0O(waBloksActivity).A0N(this.A00);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        bundle.putString("bk_navigation_bar_logo", this.A03);
        super.onActivitySaveInstanceState(activity, bundle);
    }

    public C107395Ol(C18820ts r1, WaBloksActivity waBloksActivity, AnonymousClass64N r3) {
        super(r1, waBloksActivity);
        this.A04 = r3;
    }

    public void A03(C158057fj r5) {
        try {
            C140456lc r3 = new C118065nH(r5.B7w()).A00;
            String A0K = C140456lc.A0K(r3);
            this.A01 = A0K;
            this.A03 = r3.A0a(45, "");
            A01(A0K);
        } catch (ClassCastException e) {
            C36321k7.A1J(e, "Bloks: Invalid navigation bar type", AnonymousClass000.A0u());
        }
    }
}
