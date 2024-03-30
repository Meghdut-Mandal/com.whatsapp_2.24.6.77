package X;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.1g1  reason: invalid class name and case insensitive filesystem */
public class C33841g1 implements C33681fl {
    public View A00;
    public final C33571fa A01;
    public final C33041ec A02;
    public final C29371Wj A03;
    public final C29341Wg A04;
    public final AnonymousClass004 A05;
    public final C20810yC A06;

    public void BK9() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public boolean Bt0() {
        if (this.A04.A07() != null) {
            return true;
        }
        return false;
    }

    public void BwS() {
        if (this.A00 == null) {
            C33571fa r3 = this.A01;
            View inflate = LayoutInflater.from(r3.getContext()).inflate(R.layout.f9nameremoved, r3, false);
            this.A00 = inflate;
            r3.addView(inflate);
            C29371Wj.A01(this.A03, 1);
        }
        C29341Wg r32 = this.A04;
        AnonymousClass5HN A07 = r32.A07();
        C18740tg.A06(A07);
        View view = this.A00;
        C18740tg.A04(view);
        TextView textView = (TextView) C012005e.A02(view, R.id.user_notice_banner_text);
        C33571fa r6 = this.A01;
        textView.setText(AnonymousClass3RM.A00(r6.getContext(), (AnonymousClass4SH) null, A07.A04));
        ((AnonymousClass5HR) C012005e.A02(this.A00, R.id.user_notice_banner_icon)).A04(A07);
        String str = A07.A01;
        String A012 = AnonymousClass3RM.A01(str);
        C20810yC r1 = this.A06;
        C65613Su A013 = r32.A03.A01();
        C18740tg.A06(A013);
        boolean A014 = AnonymousClass3RI.A01(r1, A013);
        HashMap A022 = AnonymousClass3RM.A02(str);
        if (A014 && r6.getContext() != null) {
            textView.setContentDescription(r6.getContext().getString(R.string.f12nameremoved));
        }
        this.A00.setOnClickListener(new C183378qh(this, A012, A022, A014));
        C012005e.A02(this.A00, R.id.cancel).setOnClickListener(new C183368qg(this, A014));
        Log.i("UserNoticeBanner/update/banner shown");
        this.A00.setVisibility(0);
    }

    public C33841g1(C33571fa r1, C20810yC r2, C33041ec r3, C29371Wj r4, C29341Wg r5, AnonymousClass004 r6) {
        this.A06 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r1;
        this.A02 = r3;
        this.A05 = r6;
    }
}
