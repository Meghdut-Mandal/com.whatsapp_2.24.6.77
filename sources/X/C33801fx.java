package X;

import android.net.Uri;
import android.text.Html;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1fx  reason: invalid class name and case insensitive filesystem */
public final class C33801fx extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C33791fw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33801fx(C33791fw r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C33791fw r8 = this.this$0;
        ViewGroup viewGroup = r8.A01;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        AnonymousClass00C.A08(from);
        View inflate = from.inflate(R.layout.f9nameremoved, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.username_update_banner_close_cta);
        AnonymousClass00C.A08(findViewById);
        View findViewById2 = inflate.findViewById(R.id.username_update_banner_message);
        AnonymousClass00C.A08(findViewById2);
        Uri A00 = r8.A02.A00();
        AnonymousClass00C.A08(A00);
        inflate.setOnClickListener(new C35141iD(r8, inflate, A00, 1));
        findViewById.setOnClickListener(new C35161iF((Object) r8, 23));
        String string = inflate.getContext().getString(R.string.f12nameremoved, new Object[]{A00.toString()});
        AnonymousClass00C.A08(string);
        r8.A04.A00(inflate.getContext(), string);
        SpannableString valueOf = SpannableString.valueOf(Html.fromHtml(string));
        AnonymousClass00C.A08(valueOf);
        ((TextView) findViewById2).setText(valueOf, TextView.BufferType.SPANNABLE);
        return inflate;
    }
}
