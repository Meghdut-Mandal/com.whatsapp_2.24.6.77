package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1nE  reason: invalid class name and case insensitive filesystem */
public final class C37801nE extends ArrayAdapter {
    public List A00;
    public final C18820ts A01;
    public final C19700wN A02;

    public View getView(int i, View view, ViewGroup viewGroup) {
        C607839i r1;
        String A0H;
        WaTextView waTextView;
        int i2;
        AnonymousClass00C.A0D(viewGroup, 2);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.f9nameremoved, viewGroup, false);
            r1 = new C607839i(view);
            view.setTag(r1);
        } else {
            Object tag = view.getTag();
            AnonymousClass00C.A0E(tag, "null cannot be cast to non-null type com.whatsapp.accountswitching.ui.AccountSwitchingAdapter.ViewHolder");
            r1 = (C607839i) tag;
        }
        if (i >= this.A00.size()) {
            Log.i("AccountSwitchingAdapter/getView/position >= items.size");
            this.A02.A0E("AccountSwitchingAdapter/AdapterSizeMismatch", "position >= items.size", false);
            return view;
        }
        C63073Iq r4 = (C63073Iq) this.A00.get(i);
        WaTextView waTextView2 = r1.A04;
        AnonymousClass3KU r11 = r4.A01;
        waTextView2.setText(r11.A09);
        WaTextView waTextView3 = r1.A05;
        C18820ts r5 = this.A01;
        UserJid userJid = PhoneUserJid.WHATSAPP_CAPS_SURVEY;
        waTextView3.setText(r5.A0H(AnonymousClass3U8.A04(C222913s.A00(r11.A07))));
        Bitmap bitmap = r4.A00;
        WaImageView waImageView = r1.A02;
        if (bitmap == null) {
            waImageView.setImageResource(R.drawable.avatar_contact);
        } else {
            waImageView.setImageBitmap(bitmap);
        }
        boolean z = r4.A02;
        ConstraintLayout constraintLayout = r1.A01;
        Context context = getContext();
        if (z) {
            C36371kC.A14(context, constraintLayout, new Object[]{waTextView2.getText(), waTextView3.getText()}, R.string.f12nameremoved);
            waTextView2.A0A();
            r1.A00.setChecked(true);
        } else {
            C36371kC.A14(context, constraintLayout, new Object[]{waTextView2.getText(), waTextView3.getText()}, R.string.f12nameremoved);
            waTextView2.A0C();
            r1.A00.setChecked(false);
            int i3 = r11.A00;
            if (i3 > 0) {
                if (i3 < 9) {
                    A0H = String.valueOf(i3);
                } else {
                    A0H = r5.A0H(getContext().getString(R.string.f12nameremoved));
                }
                waTextView = r1.A03;
                waTextView.setText(A0H);
                i2 = 0;
                waTextView.setVisibility(i2);
                return view;
            }
        }
        waTextView = r1.A03;
        i2 = 8;
        waTextView.setVisibility(i2);
        return view;
    }

    public C37801nE(Context context, C19700wN r3, C18820ts r4, List list) {
        super(context, R.layout.f9nameremoved, list);
        this.A02 = r3;
        this.A01 = r4;
        this.A00 = list;
    }
}
