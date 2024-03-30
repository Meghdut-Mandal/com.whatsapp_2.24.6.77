package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: X.1oP  reason: invalid class name and case insensitive filesystem */
public final class C38351oP extends FrameLayout implements C18700tb {
    public C33011eZ A00;
    public C33581fb A01;
    public C20810yC A02;
    public C19770wU A03;
    public AnonymousClass1QZ A04;
    public boolean A05;
    public final AnonymousClass29R A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38351oP(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A05) {
            this.A05 = true;
            C27861Qc r2 = (C27861Qc) ((C27851Qb) generatedComponent());
            this.A00 = C27111My.A0C(r2.A0L);
            C18800tq r1 = r2.A0M;
            this.A03 = C36341k9.A0Z(r1);
            this.A01 = C27861Qc.A04(r2);
            this.A02 = C36341k9.A0V(r1);
        }
        this.A06 = new AnonymousClass29R(this, getGroupsPrivacyTipQpManager(), getDeepLinkHelper(), getAbProps(), getWaWorkers());
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setDeepLinkHelper(C33581fb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setGroupsPrivacyTipQpManager(C33011eZ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setWaWorkers(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final C33581fb getDeepLinkHelper() {
        C33581fb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("deepLinkHelper");
    }

    public final C33011eZ getGroupsPrivacyTipQpManager() {
        C33011eZ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupsPrivacyTipQpManager");
    }

    public final C19770wU getWaWorkers() {
        C19770wU r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A08();
    }
}
