package X;

import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet;

/* renamed from: X.4In  reason: invalid class name and case insensitive filesystem */
public final class C85814In extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ SharePhoneNumberBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85814In(SharePhoneNumberBottomSheet sharePhoneNumberBottomSheet) {
        super(1);
        this.this$0 = sharePhoneNumberBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        TextView textView;
        C62803Hp r7 = (C62803Hp) obj;
        SharePhoneNumberBottomSheet sharePhoneNumberBottomSheet = this.this$0;
        AnonymousClass00C.A0B(r7);
        String str = r7.A01;
        if (!(str == null || (textView = sharePhoneNumberBottomSheet.A02) == null)) {
            textView.setText(str);
        }
        int A02 = C36331k8.A02(sharePhoneNumberBottomSheet.A03);
        if (A02 == 3 || A02 == 4) {
            i = R.string.f12nameremoved;
        } else {
            i = R.string.f12nameremoved;
            if (A02 != 5) {
                i = R.string.f12nameremoved;
            }
        }
        String A0q = C36401kF.A0q(sharePhoneNumberBottomSheet, r7.A00, new Object[1], 0, i);
        AnonymousClass00C.A0B(A0q);
        TextView textView2 = sharePhoneNumberBottomSheet.A04;
        if (textView2 != null) {
            C32681e1 r1 = sharePhoneNumberBottomSheet.A02;
            if (r1 != null) {
                C36431kI.A1M(textView2, r1.A00(textView2.getContext(), A0q));
                C20810yC r0 = sharePhoneNumberBottomSheet.A01;
                if (r0 != null) {
                    C36331k8.A10(textView2, r0);
                } else {
                    throw C36321k7.A07();
                }
            } else {
                throw C36331k8.A0b();
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
