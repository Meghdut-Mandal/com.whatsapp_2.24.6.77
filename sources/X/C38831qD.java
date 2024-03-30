package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader;

/* renamed from: X.1qD  reason: invalid class name and case insensitive filesystem */
public final class C38831qD extends LinearLayout implements C18700tb, C22929Ayf {
    public WaImageView A00;
    public CommunityPhotoHeader A01;
    public GroupPhotoHeader A02;
    public C18820ts A03;
    public C27751Pr A04;
    public AnonymousClass1QZ A05;
    public boolean A06;

    public C38831qD(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A06) {
            this.A06 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A03 = C36341k9.A0T(A0W);
            this.A04 = C36381kD.A0b(A0W);
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A02 = (GroupPhotoHeader) findViewById(R.id.groupPhoto);
        this.A00 = C36421kH.A0J(this, R.id.arrow);
        this.A01 = (CommunityPhotoHeader) findViewById(R.id.communityPhoto);
    }

    public final void setPathDrawableHelper(C27751Pr r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A05;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final C27751Pr getPathDrawableHelper() {
        C27751Pr r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("pathDrawableHelper");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public LinearLayout.LayoutParams getHeaderLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C36391kE.A06(this));
        layoutParams.gravity = 1;
        return layoutParams;
    }

    public View getHeaderView() {
        return this;
    }
}
