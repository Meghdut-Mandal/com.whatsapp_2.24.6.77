package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.greenalert.GreenAlertActivity;
import java.util.TreeMap;

/* renamed from: X.1zW  reason: invalid class name and case insensitive filesystem */
public class C42811zW extends AnonymousClass07S {
    public final AnonymousClass17Z A00;
    public final AnonymousClass1M4 A01;
    public final C16720pz A02;
    public final C24801Dv A03;
    public final AnonymousClass17Y A04;
    public final AnonymousClass1N3 A05;
    public final C21060yb A06;
    public final C18820ts A07;
    public final C20810yC A08;
    public final C20380xT A09;

    private void A05(TextEmojiLabel textEmojiLabel, String str, String... strArr) {
        int length = strArr.length;
        Object[] objArr = new Object[length];
        TreeMap treeMap = new TreeMap();
        for (int i = 0; i < length; i++) {
            String valueOf = String.valueOf(i);
            objArr[i] = valueOf;
            treeMap.put(valueOf, Uri.parse(strArr[i]));
        }
        Context context = textEmojiLabel.getContext();
        C20810yC r9 = this.A08;
        AnonymousClass17Y r6 = this.A04;
        AnonymousClass6YV.A0G(context, this.A03, r6, textEmojiLabel, this.A06, r9, String.format(C36401kF.A0x(this.A07), str, objArr), treeMap);
    }

    public int A0H() {
        return 2;
    }

    public Object A0I(ViewGroup viewGroup, int i) {
        NestedScrollView nestedScrollView;
        int i2;
        if (i == 0) {
            nestedScrollView = (NestedScrollView) C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
            TextView A0O = C36391kE.A0O(nestedScrollView, R.id.green_alert_education_title);
            C012005e.A0a(A0O, true);
            A0O.setText(R.string.f12nameremoved);
            C36391kE.A0O(nestedScrollView, R.id.green_alert_education_intro).setText(R.string.f12nameremoved);
            View A022 = C012005e.A02(nestedScrollView, R.id.green_alert_education_image_and_caption_1);
            C36401kF.A0G(A022, R.id.green_alert_education_image).setImageResource(R.drawable.ga_edu_1);
            C36361kB.A1P(C36381kD.A0t(A022, R.string.f12nameremoved), C36391kE.A0O(A022, R.id.green_alert_education_image_caption));
            View A023 = C012005e.A02(nestedScrollView, R.id.green_alert_education_image_and_caption_2);
            C36401kF.A0G(A023, R.id.green_alert_education_image).setImageResource(R.drawable.ga_edu_2);
            C36361kB.A1P(C36381kD.A0t(A023, R.string.f12nameremoved), C36391kE.A0O(A023, R.id.green_alert_education_image_caption));
            View A024 = C012005e.A02(nestedScrollView, R.id.green_alert_education_image_and_caption_3);
            String A025 = A02(C64163Mw.A00);
            C36401kF.A0G(A024, R.id.green_alert_education_image).setImageResource(R.drawable.ga_edu_3);
            A05(C36401kF.A0O(A024, R.id.green_alert_education_image_caption), C36391kE.A0v(A024.getContext(), "0", new Object[1], 0, R.string.f12nameremoved), A025);
        } else if (i == 1) {
            nestedScrollView = (NestedScrollView) C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false);
            TextView A0O2 = C36391kE.A0O(nestedScrollView, R.id.green_alert_tos_title);
            C012005e.A0a(A0O2, true);
            A0O2.setText(A00(nestedScrollView.getContext(), GreenAlertActivity.A0O));
            C36361kB.A1P(A00(nestedScrollView.getContext(), GreenAlertActivity.A0I), C36391kE.A0O(nestedScrollView, R.id.green_alert_tos_intro));
            A05(C36401kF.A0O(nestedScrollView, R.id.green_alert_tos_bullets_header), A01(nestedScrollView.getContext(), GreenAlertActivity.A0J, "0"), A02(C64163Mw.A00));
            A04(C012005e.A02(nestedScrollView, R.id.green_alert_tos_bullet_1), A00(nestedScrollView.getContext(), GreenAlertActivity.A0K), new String[0], R.drawable.ga_tos_1);
            A04(C012005e.A02(nestedScrollView, R.id.green_alert_tos_bullet_2), A00(nestedScrollView.getContext(), GreenAlertActivity.A0L), new String[0], R.drawable.ga_tos_2);
            if (C64163Mw.A00(this.A01)) {
                C36351kA.A19(nestedScrollView, R.id.green_alert_tos_bullet_3);
            } else {
                C36351kA.A1A(nestedScrollView, R.id.green_alert_tos_bullet_3, 0);
                A04(C012005e.A02(nestedScrollView, R.id.green_alert_tos_bullet_3), A01(nestedScrollView.getContext(), GreenAlertActivity.A0M, "0"), new String[]{A02(C64163Mw.A02)}, R.drawable.ga_tos_3);
            }
            A05(C36401kF.A0O(nestedScrollView, R.id.green_alert_tos_footer), A01(nestedScrollView.getContext(), GreenAlertActivity.A0N, "0", "1", "2"), A03(C64163Mw.A03), A03(C64163Mw.A01), A02(C64163Mw.A04));
        } else {
            throw AnonymousClass000.A0d("Unknown page: ", AnonymousClass000.A0u(), i);
        }
        Context context = nestedScrollView.getContext();
        if (context != null) {
            String string = context.getString(R.string.f12nameremoved);
            String string2 = context.getString(R.string.f12nameremoved);
            if (i == 0) {
                View findViewById = nestedScrollView.findViewById(R.id.start_list_green_alert_education_view);
                if (findViewById != null) {
                    findViewById.setContentDescription(string);
                }
                i2 = R.id.end_list_green_alert_education_view;
            } else {
                View findViewById2 = nestedScrollView.findViewById(R.id.start_list_green_alert_tos_view);
                if (findViewById2 != null) {
                    findViewById2.setContentDescription(string);
                }
                i2 = R.id.end_list_green_alert_tos_view;
            }
            View findViewById3 = nestedScrollView.findViewById(i2);
            if (findViewById3 != null) {
                findViewById3.setContentDescription(string2);
            }
        }
        nestedScrollView.A0A = this.A02;
        nestedScrollView.setTag(Integer.valueOf(i));
        viewGroup.addView(nestedScrollView);
        return nestedScrollView;
    }

    private String A00(Context context, int[] iArr) {
        char c;
        AnonymousClass1M4 r1 = this.A01;
        if (!C64163Mw.A00(r1)) {
            AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
            if (!r1.A05("BR") || iArr != GreenAlertActivity.A0N) {
                c = 0;
                return context.getString(iArr[c]);
            }
        }
        c = 1;
        return context.getString(iArr[c]);
    }

    private String A01(Context context, int[] iArr, Object... objArr) {
        char c;
        AnonymousClass1M4 r1 = this.A01;
        if (!C64163Mw.A00(r1)) {
            AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
            if (!r1.A05("BR") || iArr != GreenAlertActivity.A0N) {
                c = 0;
                return context.getString(iArr[c], objArr);
            }
        }
        c = 1;
        return context.getString(iArr[c], objArr);
    }

    private String A02(String[] strArr) {
        char A1P;
        C20380xT r2 = this.A09;
        AnonymousClass1M4 r1 = this.A01;
        if (C64163Mw.A00(r1)) {
            A1P = 2;
        } else {
            AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
            A1P = AnonymousClass000.A1P(r1.A05("BR") ? 1 : 0);
        }
        return r2.A04("security-and-privacy", strArr[A1P]).toString();
    }

    private String A03(String[] strArr) {
        char A1P;
        AnonymousClass1N3 r2 = this.A05;
        AnonymousClass1M4 r1 = this.A01;
        if (C64163Mw.A00(r1)) {
            A1P = 2;
        } else {
            AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
            A1P = AnonymousClass000.A1P(r1.A05("BR") ? 1 : 0);
        }
        return r2.A00(strArr[A1P]).toString();
    }

    public void A0J(ViewGroup viewGroup, Object obj, int i) {
        viewGroup.removeView((View) obj);
    }

    public C42811zW(C16720pz r1, C24801Dv r2, AnonymousClass17Y r3, AnonymousClass1N3 r4, C21060yb r5, AnonymousClass17Z r6, C18820ts r7, C20810yC r8, C20380xT r9, AnonymousClass1M4 r10) {
        this.A08 = r8;
        this.A04 = r3;
        this.A01 = r10;
        this.A03 = r2;
        this.A05 = r4;
        this.A09 = r9;
        this.A06 = r5;
        this.A07 = r7;
        this.A00 = r6;
        this.A02 = r1;
    }

    private void A04(View view, String str, String[] strArr, int i) {
        C36401kF.A0G(view, R.id.green_alert_tos_bullet_image).setImageResource(i);
        A05(C36401kF.A0O(view, R.id.green_alert_tos_bullet_text), str, strArr);
    }

    public boolean A0K(View view, Object obj) {
        return C36361kB.A1a(view, obj);
    }
}
