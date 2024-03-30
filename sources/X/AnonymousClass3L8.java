package X;

import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.home.ui.HomePlaceholderActivity;

/* renamed from: X.3L8  reason: invalid class name */
public abstract class AnonymousClass3L8 {
    public void A00() {
        if (this instanceof AnonymousClass2Vy) {
            ConversationsFragment.A0P(((AnonymousClass2Vy) this).A00, (String) null);
        }
    }

    public void A01() {
        if (this instanceof AnonymousClass4WD) {
            AnonymousClass4WD r1 = (AnonymousClass4WD) this;
            if (r1.A01 == 0) {
                C70803fk r2 = (C70803fk) r1.A00;
                C40061uh r12 = r2.A2x;
                r12.A0G = null;
                r12.A0I = null;
                r2.A4o = null;
                C36421kH.A1F(r2.A5N);
                C38051nd.A00(r2);
            }
        }
    }

    public void A02() {
        if (this instanceof AnonymousClass4WD) {
            AnonymousClass4WD r1 = (AnonymousClass4WD) this;
            if (r1.A01 == 0) {
                C70803fk r12 = (C70803fk) r1.A00;
                AnonymousClass2M8 r0 = r12.A3r;
                if (r0 != null && r0.isShowing()) {
                    r12.A3r.dismiss();
                } else if (C70803fk.A0C(r12) != null && C70803fk.A1e(r12)) {
                    r12.A1n();
                }
            }
        }
    }

    public void A03(int i, boolean z) {
        if (this instanceof AnonymousClass4WD) {
            AnonymousClass4WD r1 = (AnonymousClass4WD) this;
            if (1 - r1.A01 == 0) {
                HomePlaceholderActivity.HomePlaceholderView homePlaceholderView = (HomePlaceholderActivity.HomePlaceholderView) r1.A00;
                HomePlaceholderActivity.HomePlaceholderView.A03(homePlaceholderView, i, z);
                homePlaceholderView.A00 = i;
            }
        }
    }

    public void A04(int i, boolean z) {
        if (this instanceof AnonymousClass4WD) {
            AnonymousClass4WD r1 = (AnonymousClass4WD) this;
            if (1 - r1.A01 == 0) {
                HomePlaceholderActivity.HomePlaceholderView homePlaceholderView = (HomePlaceholderActivity.HomePlaceholderView) r1.A00;
                if (homePlaceholderView.A00 == i) {
                    ImageView imageView = homePlaceholderView.A03;
                    int i2 = 8;
                    if (imageView != null) {
                        imageView.setVisibility(C36381kD.A00(z ? 1 : 0));
                    }
                    TextView textView = homePlaceholderView.A04;
                    if (textView != null) {
                        if (!z) {
                            i2 = 0;
                        }
                        textView.setVisibility(i2);
                    }
                }
            }
        }
    }
}
