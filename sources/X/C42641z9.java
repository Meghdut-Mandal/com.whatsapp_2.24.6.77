package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.1z9  reason: invalid class name and case insensitive filesystem */
public class C42641z9 extends AnonymousClass0D3 {
    public C42641z9(View.OnClickListener onClickListener, View view, C24801Dv r15, AnonymousClass17Y r16, C21060yb r17, C20810yC r18, C20380xT r19, String str, int i) {
        super(view);
        C012005e.A02(view, R.id.cancel_warning_button).setOnClickListener(onClickListener);
        Context context = view.getContext();
        AnonymousClass6YV.A0E(context, r19.A03(str), r15, r16, C36401kF.A0O(view, R.id.warning_text), r17, r18, C36391kE.A0v(context, "learn-more", AnonymousClass001.A0L(), 0, i), "learn-more");
    }

    public C42641z9(View.OnClickListener onClickListener, View view, C24801Dv r9, C20380xT r10, String str, int i, boolean z) {
        super(view);
        WDSBanner wDSBanner = (WDSBanner) view.findViewById(R.id.banner);
        wDSBanner.setOnDismissListener(onClickListener);
        if (!z) {
            wDSBanner.A07();
        }
        C62053Eo r1 = new C62053Eo();
        r1.A02 = C50722lQ.A00;
        C62053Eo.A00(wDSBanner, r1, C63953Mb.A00(wDSBanner.getContext(), i));
        wDSBanner.setOnClickListener(new AnonymousClass3YS(r9, wDSBanner, r10, str, 0));
    }
}
