package X;

import androidx.appcompat.view.menu.ActionMenuItemView;

/* renamed from: X.0Ft  reason: invalid class name and case insensitive filesystem */
public class C03520Ft extends C09150bu {
    public final /* synthetic */ ActionMenuItemView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C03520Ft(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.A00 = actionMenuItemView;
    }

    public C17250qy A01() {
        AnonymousClass0Fd r0;
        AnonymousClass0PB r02 = this.A00.A01;
        if (r02 == null || (r0 = ((AnonymousClass0FW) r02).A00.A0B) == null) {
            return null;
        }
        return r0.A00();
    }

    public boolean A03() {
        C17250qy A01;
        ActionMenuItemView actionMenuItemView = this.A00;
        C16600pm r2 = actionMenuItemView.A02;
        if (r2 == null || !r2.BL0(actionMenuItemView.A00) || (A01 = A01()) == null || !A01.BNH()) {
            return false;
        }
        return true;
    }
}
