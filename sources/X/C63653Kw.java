package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.toggle.WDSSwitch;

/* renamed from: X.3Kw  reason: invalid class name and case insensitive filesystem */
public final class C63653Kw {
    public View A00;
    public View A01;
    public TextEmojiLabel A02;
    public WDSSwitch A03;
    public final Context A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final ImageView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextEmojiLabel A0D;
    public final C18820ts A0E;
    public final ViewStub A0F;
    public final C21060yb A0G;
    public final C20810yC A0H;
    public final C61843Dq A0I;
    public final C20380xT A0J;

    public C63653Kw(Context context, View view, ViewStub viewStub, C21060yb r7, C18820ts r8, C20810yC r9, C51622o7 r10, C61843Dq r11, C20380xT r12) {
        String A052;
        AnonymousClass00C.A0D(view, 1);
        C36321k7.A17(context, r7, r8, 3);
        C36321k7.A13(r9, r11, r12);
        this.A0F = viewStub;
        this.A04 = context;
        this.A0G = r7;
        this.A0E = r8;
        this.A0H = r9;
        this.A0I = r11;
        this.A0J = r12;
        this.A09 = C36341k9.A0M(view, R.id.report_item_footer);
        this.A0C = C36341k9.A0M(view, R.id.report_title);
        this.A0B = C36341k9.A0M(view, R.id.report_button_title);
        this.A0A = C36341k9.A0M(view, R.id.report_button_subtitle);
        this.A0D = C36351kA.A0O(view, R.id.report_item_header);
        this.A08 = C36341k9.A0L(view, R.id.report_button_icon);
        this.A05 = C36361kB.A0G(view, R.id.report_button);
        this.A06 = C36361kB.A0G(view, R.id.report_delete);
        this.A07 = C36361kB.A0G(view, R.id.report_delete_divider);
        if (r9.A0E(7222) && viewStub != null) {
            View inflate = viewStub.inflate();
            this.A00 = C012005e.A02(inflate, R.id.automatic_report_container);
            this.A03 = (WDSSwitch) C012005e.A02(inflate, R.id.automatic_report_switch);
            this.A01 = C012005e.A02(inflate, R.id.automatic_report_close_divider);
            this.A02 = C36401kF.A0O(inflate, R.id.automatic_report_footer);
            int ordinal = r10.ordinal();
            if (ordinal == 1) {
                A052 = r12.A05("526463418847093");
            } else if (ordinal != 2) {
                A052 = "";
            } else {
                A052 = r12.A02("6480469855345352").toString();
            }
            AnonymousClass00C.A0B(A052);
            TextEmojiLabel textEmojiLabel = this.A02;
            if (textEmojiLabel != null) {
                C36331k8.A1A(r9, textEmojiLabel);
            }
            TextEmojiLabel textEmojiLabel2 = this.A02;
            if (textEmojiLabel2 != null) {
                C36331k8.A16(textEmojiLabel2, r7);
            }
            TextEmojiLabel textEmojiLabel3 = this.A02;
            if (textEmojiLabel3 != null) {
                textEmojiLabel3.setText(r11.A00(context, A052, R.string.f12nameremoved));
            }
        }
    }

    public final void A00(Runnable runnable, int i) {
        View view = this.A05;
        view.setClickable(true);
        C67133Yq.A00(view, runnable, 29);
        ImageView imageView = this.A08;
        C18820ts r2 = this.A0E;
        Context context = this.A04;
        C36321k7.A0L(context, imageView, r2, R.drawable.ic_settings_terms_policy);
        AnonymousClass3UF.A0A(context, imageView);
        this.A0B.setText(i);
        this.A0D.setVisibility(0);
        this.A0A.setVisibility(8);
        this.A06.setVisibility(8);
        this.A07.setVisibility(8);
        this.A09.setVisibility(8);
    }

    public final void A01(Runnable runnable, int i, long j, long j2, long j3, boolean z, boolean z2) {
        Context context;
        TextView textView;
        int A002;
        C18820ts r8;
        String A082;
        if (!z || z2) {
            View view = this.A05;
            view.setEnabled(true);
            C48762i0.A00(view, runnable, 22);
            ImageView imageView = this.A08;
            imageView.setImageResource(R.drawable.ic_action_download);
            context = this.A04;
            AnonymousClass3UF.A0A(context, imageView);
            this.A0B.setText(i);
            textView = this.A0A;
            A002 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        } else {
            View view2 = this.A05;
            view2.setEnabled(false);
            view2.setOnClickListener((View.OnClickListener) null);
            ImageView imageView2 = this.A08;
            imageView2.setImageResource(R.drawable.ic_action_schedule);
            context = this.A04;
            AnonymousClass3UF.A0E(imageView2, AnonymousClass00F.A00(context, R.color.f6nameremoved));
            TextView textView2 = this.A0B;
            textView2.setText(R.string.f12nameremoved);
            C36331k8.A0r(context, textView2, R.color.f6nameremoved);
            textView = this.A0A;
            A002 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        }
        textView.setTextColor(A002);
        textView.setVisibility(0);
        long j4 = j2;
        if (j > 0) {
            Object[] A0M = AnonymousClass001.A0M();
            r8 = this.A0E;
            A0M[0] = C20040wv.A08(r8, j4);
            A082 = C36391kE.A0v(context, AnonymousClass3TF.A02(r8, j), A0M, 1, R.string.f12nameremoved);
        } else {
            r8 = this.A0E;
            A082 = C20040wv.A08(r8, j4);
        }
        textView.setText(A082);
        View view3 = this.A06;
        if (z2) {
            view3.setVisibility(0);
            this.A07.setVisibility(0);
        } else {
            view3.setVisibility(8);
            this.A07.setVisibility(8);
        }
        TextView textView3 = this.A09;
        textView3.setVisibility(0);
        C36341k9.A0s(context, textView3, new Object[]{C55292uO.A00(r8, 1, j3)}, R.string.f12nameremoved);
        this.A0D.setVisibility(8);
    }

    public final void A02(Runnable runnable, long j, long j2, long j3) {
        C18820ts r6;
        String A082;
        View view = this.A05;
        view.setEnabled(true);
        C48762i0.A00(view, runnable, 23);
        ImageView imageView = this.A08;
        imageView.setImageResource(R.drawable.ic_action_share);
        Context context = this.A04;
        AnonymousClass3UF.A0A(context, imageView);
        this.A0B.setText(R.string.f12nameremoved);
        TextView textView = this.A0A;
        textView.setVisibility(0);
        C36331k8.A0r(context, textView, R.color.f6nameremoved);
        if (j > 0) {
            Object[] A0M = AnonymousClass001.A0M();
            r6 = this.A0E;
            A0M[0] = C20040wv.A08(r6, j2);
            A082 = C36391kE.A0v(context, AnonymousClass3TF.A02(r6, j), A0M, 1, R.string.f12nameremoved);
        } else {
            r6 = this.A0E;
            A082 = C20040wv.A08(r6, j2);
        }
        textView.setText(A082);
        this.A06.setVisibility(0);
        TextView textView2 = this.A09;
        textView2.setVisibility(0);
        C36341k9.A0s(context, textView2, new Object[]{C55292uO.A00(r6, 1, j3)}, R.string.f12nameremoved);
        this.A07.setVisibility(0);
        this.A0D.setVisibility(8);
    }

    public final void A03(String str, String str2) {
        C36331k8.A1I(str, str2);
        this.A05.setClickable(false);
        ImageView imageView = this.A08;
        imageView.setImageResource(R.drawable.ic_action_schedule);
        Context context = this.A04;
        AnonymousClass3UF.A0E(imageView, AnonymousClass00F.A00(context, R.color.f6nameremoved));
        this.A0B.setText(R.string.f12nameremoved);
        TextView textView = this.A0A;
        textView.setVisibility(0);
        textView.setText(str);
        C36331k8.A0r(context, textView, R.color.f6nameremoved);
        this.A06.setVisibility(8);
        TextView textView2 = this.A09;
        textView2.setVisibility(0);
        textView2.setText(str2);
        this.A0D.setVisibility(8);
        this.A07.setVisibility(8);
    }
}
