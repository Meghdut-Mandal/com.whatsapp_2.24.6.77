package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1g9  reason: invalid class name and case insensitive filesystem */
public class C33921g9 implements C33681fl {
    public View A00;
    public final C33571fa A01;
    public final C33911g8 A02;
    public final C20810yC A03;
    public final AnonymousClass004 A04;

    public void BK9() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public boolean Bt0() {
        AnonymousClass004 r1 = this.A04;
        if (r1.get() == null) {
            return false;
        }
        r1.get();
        return false;
    }

    public C33921g9(C33571fa r1, C33911g8 r2, C20810yC r3, AnonymousClass004 r4) {
        this.A03 = r3;
        this.A01 = r1;
        this.A04 = r4;
        this.A02 = r2;
    }

    public void BwS() {
        if (Bt0() && this.A00 == null) {
            C33571fa r3 = this.A01;
            View inflate = LayoutInflater.from(r3.getContext()).inflate(R.layout.f9nameremoved, r3, false);
            this.A00 = inflate;
            r3.addView(inflate);
        }
        View view = this.A00;
        if (view == null) {
            C33571fa r32 = this.A01;
            view = LayoutInflater.from(r32.getContext()).inflate(R.layout.f9nameremoved, r32, false);
            this.A00 = view;
        }
        C33571fa r6 = this.A01;
        Context context = r6.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(R.string.f12nameremoved));
        SpannableString spannableString = new SpannableString(context.getString(R.string.f12nameremoved));
        spannableString.setSpan(new ForegroundColorSpan(AnonymousClass00F.A00(context, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved))), 0, spannableString.length(), 33);
        spannableStringBuilder.append(" ").append(spannableString);
        ((TextEmojiLabel) C012005e.A02(view, R.id.banner_description)).A0I(spannableStringBuilder);
        r6.setBackgroundResource(C224514j.A00(r6.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
        r6.setOnClickListener(new C35151iE(this, context, 3));
        C012005e.A02(view, R.id.close).setOnClickListener(new C35161iF((Object) this, 10));
        view.setVisibility(0);
    }
}
