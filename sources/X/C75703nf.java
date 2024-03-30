package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment;
import com.whatsapp.ui.media.MediaCaptionTextView;

/* renamed from: X.3nf  reason: invalid class name and case insensitive filesystem */
public class C75703nf implements C88804Uc {
    public final /* synthetic */ LinkedAccountMediaViewFragment A00;

    public void B5M(int i) {
    }

    public void BY2() {
    }

    public C75703nf(LinkedAccountMediaViewFragment linkedAccountMediaViewFragment) {
        this.A00 = linkedAccountMediaViewFragment;
    }

    public AnonymousClass00I B50(int i) {
        LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = this.A00;
        ViewGroup viewGroup = (ViewGroup) linkedAccountMediaViewFragment.A0c().inflate(R.layout.f9nameremoved, (ViewGroup) null);
        ViewGroup A0O = C36411kG.A0O(viewGroup, R.id.footer);
        AnonymousClass4WF r7 = new AnonymousClass4WF(linkedAccountMediaViewFragment.A0a(), this, 1);
        r7.A0K = new C48732hx(this, 43);
        C011004s.A08(r7, AnonymousClass000.A0p("thumb-transition-", ((AnonymousClass3XV) linkedAccountMediaViewFragment.A0G.get(i)).A01.A04, AnonymousClass000.A0u()));
        int i2 = 0;
        viewGroup.addView(r7, 0);
        r7.A0O = true;
        linkedAccountMediaViewFragment.A0F.A01(r7, ((AnonymousClass3XV) linkedAccountMediaViewFragment.A0G.get(i)).A01, (C22914AyQ) null, new C55872vK(r7, 2), 1);
        if (linkedAccountMediaViewFragment.A0I) {
            Object obj = linkedAccountMediaViewFragment.A0G.get(i);
            View inflate = linkedAccountMediaViewFragment.A0c().inflate(R.layout.f9nameremoved, (ViewGroup) null);
            View A02 = C012005e.A02(inflate, R.id.message_business_btn);
            inflate.setVisibility(0);
            C36411kG.A1C(A02, linkedAccountMediaViewFragment, obj, 17);
            A0O.addView(inflate);
        }
        if (!TextUtils.isEmpty(((AnonymousClass3XV) linkedAccountMediaViewFragment.A0G.get(i)).A02)) {
            View inflate2 = linkedAccountMediaViewFragment.A0c().inflate(R.layout.f9nameremoved, (ViewGroup) null);
            MediaCaptionTextView mediaCaptionTextView = (MediaCaptionTextView) C012005e.A02(inflate2, R.id.caption);
            A0O.addView(inflate2, 0);
            mediaCaptionTextView.setCaptionText(((AnonymousClass3XV) linkedAccountMediaViewFragment.A0G.get(i)).A02);
            AnonymousClass3UW.A00(linkedAccountMediaViewFragment.A0m(), mediaCaptionTextView.A09, inflate2, this, 0);
        }
        if (!linkedAccountMediaViewFragment.A0G) {
            i2 = 8;
        }
        A0O.setVisibility(i2);
        return C36441kJ.A0W(viewGroup, ((AnonymousClass3XV) linkedAccountMediaViewFragment.A0G.get(i)).A01.A04);
    }

    public int getCount() {
        return this.A00.A0G.size();
    }

    public /* bridge */ /* synthetic */ int BG4(Object obj) {
        return 0;
    }
}
