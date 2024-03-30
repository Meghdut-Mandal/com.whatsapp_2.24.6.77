package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.profile.SettingsRowPhotoOrInitialText;
import com.whatsapp.settings.SettingsRowIconText;
import com.whatsapp.settings.SettingsRowNoticeView;

/* renamed from: X.1pN  reason: invalid class name and case insensitive filesystem */
public abstract class C38601pN extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A00() {
        if (this instanceof SettingsRowNoticeView) {
            SettingsRowNoticeView settingsRowNoticeView = (SettingsRowNoticeView) this;
            if (!settingsRowNoticeView.A01) {
                settingsRowNoticeView.A01 = true;
                C18800tq A0W = C36391kE.A0W(settingsRowNoticeView.generatedComponent());
                settingsRowNoticeView.A06 = C36341k9.A0V(A0W);
                settingsRowNoticeView.A05 = C36341k9.A0T(A0W);
            }
        } else if (this instanceof SettingsRowPhotoOrInitialText) {
            SettingsRowPhotoOrInitialText settingsRowPhotoOrInitialText = (SettingsRowPhotoOrInitialText) this;
            if (!settingsRowPhotoOrInitialText.A00) {
                settingsRowPhotoOrInitialText.A00 = true;
                C18800tq A0W2 = C36391kE.A0W(settingsRowPhotoOrInitialText.generatedComponent());
                settingsRowPhotoOrInitialText.A06 = C36341k9.A0V(A0W2);
                settingsRowPhotoOrInitialText.A05 = C36341k9.A0T(A0W2);
            }
        } else if (!this.A01) {
            this.A01 = true;
            SettingsRowIconText settingsRowIconText = (SettingsRowIconText) this;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            settingsRowIconText.A06 = C36341k9.A0V(r1);
            settingsRowIconText.A05 = C36341k9.A0T(r1);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38601pN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
