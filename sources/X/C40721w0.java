package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import java.io.File;
import java.security.InvalidParameterException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1w0  reason: invalid class name and case insensitive filesystem */
public class C40721w0 extends AnonymousClass0CZ {
    public int A00;
    public final LayoutInflater A01;
    public final AnonymousClass026 A02;
    public final AnonymousClass6CW A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final JSONArray A0B;
    public final boolean A0C;
    public final boolean A0D;

    public int A0J() {
        return this.A0B.length();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r11, int i) {
        View view;
        int i2;
        C42371yi r112 = (C42371yi) r11;
        try {
            C40721w0 r7 = r112.A06;
            JSONObject jSONObject = r7.A0B.getJSONObject(r112.A04());
            TextView textView = r112.A02;
            textView.setSingleLine(false);
            textView.setMaxLines(2);
            textView.setText(jSONObject.getString(r7.A0A));
            boolean optBoolean = jSONObject.optBoolean(r7.A05, false);
            View view2 = r112.A0H;
            float f = 1.0f;
            if (optBoolean) {
                f = 0.38f;
            }
            view2.setAlpha(f);
            view2.setFocusable(AnonymousClass000.A1Q(optBoolean ? 1 : 0));
            view2.setClickable(AnonymousClass000.A1Q(optBoolean));
            String str = r7.A08;
            if (str == null) {
                r112.A05.setVisibility(8);
                r112.A03.setVisibility(8);
            } else if (str.equals("radio")) {
                boolean z = true;
                r112.A05.setVisibility(8);
                AppCompatRadioButton appCompatRadioButton = r112.A03;
                appCompatRadioButton.setVisibility(0);
                if (r7.A00 != r112.A04()) {
                    z = false;
                }
                appCompatRadioButton.setChecked(z);
            } else {
                if (str.equals("image")) {
                    String str2 = r7.A06;
                    if (!TextUtils.isEmpty(str2)) {
                        r112.A03.setVisibility(8);
                        String str3 = r7.A07;
                        if (TextUtils.isEmpty(str3) || (str3 != null && str3.equals("url"))) {
                            WaImageView waImageView = r112.A05;
                            waImageView.setVisibility(0);
                            C18740tg.A06(str2);
                            r7.A03.A01(waImageView, jSONObject.getString(str2));
                        } else if (!TextUtils.isEmpty(str3) && str3 != null && str3.equals("file_path")) {
                            C18740tg.A06(str2);
                            String string = jSONObject.getString(str2);
                            if (new File(string).exists()) {
                                WaImageView waImageView2 = r112.A05;
                                waImageView2.setVisibility(0);
                                waImageView2.setImageURI(Uri.parse(string));
                            } else {
                                r112.A05.setVisibility(8);
                            }
                        }
                    }
                }
                r112.A05.setVisibility(8);
                r112.A03.setVisibility(8);
            }
            String str4 = r7.A04;
            if (str4 == null || TextUtils.isEmpty(jSONObject.optString(str4))) {
                r112.A01.setVisibility(8);
            } else {
                TextView textView2 = r112.A01;
                textView2.setText(jSONObject.optString(str4));
                textView2.setVisibility(0);
            }
            String str5 = r7.A09;
            if (str5 == null || !str5.equals("radio")) {
                r112.A04.setVisibility(8);
            } else {
                boolean z2 = true;
                AppCompatRadioButton appCompatRadioButton2 = r112.A04;
                appCompatRadioButton2.setVisibility(0);
                if (r7.A00 != r112.A04()) {
                    z2 = false;
                }
                appCompatRadioButton2.setChecked(z2);
            }
            view2.setOnClickListener(new AnonymousClass3YL(this, i, 0, r112));
            boolean z3 = this.A0C;
            if (z3 || i == this.A0B.length() - 1) {
                view = r112.A00;
                i2 = 8;
                if (!z3) {
                    i2 = 4;
                }
            } else {
                view = r112.A00;
                i2 = 0;
            }
            view.setVisibility(i2);
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder("WaListViewBinder/ListViewHolder/decorate: property not found at position ");
            sb.append(r112.A04());
            sb.append(":");
            C36321k7.A1Z(sb, r112.A06.A0B.toString());
            throw new InvalidParameterException(sb.toString());
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        View A0E = C36361kB.A0E(this.A01, viewGroup, R.layout.f9nameremoved);
        if (this.A0D) {
            TypedValue typedValue = new TypedValue();
            C36361kB.A09(viewGroup).resolveAttribute(16843534, typedValue, true);
            A0E.setBackgroundResource(typedValue.resourceId);
        }
        return new C42371yi(A0E, this);
    }

    public C40721w0(LayoutInflater layoutInflater, AnonymousClass026 r2, AnonymousClass6CW r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONArray jSONArray, int i, boolean z, boolean z2) {
        this.A0B = jSONArray;
        this.A08 = str;
        this.A09 = str2;
        this.A07 = str3;
        this.A0A = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A0D = z;
        this.A0C = z2;
        this.A03 = r3;
        this.A01 = layoutInflater;
        this.A02 = r2;
        this.A00 = i;
    }
}
