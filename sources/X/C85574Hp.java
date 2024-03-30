package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.4Hp  reason: invalid class name and case insensitive filesystem */
public final class C85574Hp extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C134876bk $fbUserFullName;
    public final /* synthetic */ View $rootView;
    public final /* synthetic */ TextView $textView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85574Hp(View view, TextView textView, C134876bk r4) {
        super(0);
        this.$textView = textView;
        this.$fbUserFullName = r4;
        this.$rootView = view;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String string;
        TextView textView = this.$textView;
        C134876bk r1 = this.$fbUserFullName;
        if (r1 != null) {
            string = (String) r1.A00("XFAM_CROSSPOSTING_STATUS_PRIVACY_UI");
        } else {
            string = this.$rootView.getResources().getString(R.string.f12nameremoved);
        }
        textView.setText(string);
        return AnonymousClass0AJ.A00;
    }
}
