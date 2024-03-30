package X;

import com.whatsapp.community.LinkExistingGroups;

/* renamed from: X.3mj  reason: invalid class name and case insensitive filesystem */
public final class C75133mj implements C87844Qj {
    public final /* synthetic */ LinkExistingGroups A00;
    public final /* synthetic */ AnonymousClass141 A01;
    public final /* synthetic */ AnonymousClass147 A02;

    public C75133mj(LinkExistingGroups linkExistingGroups, AnonymousClass141 r2, AnonymousClass147 r3) {
        this.A00 = linkExistingGroups;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BU4(boolean z) {
        if (z) {
            LinkExistingGroups linkExistingGroups = this.A00;
            linkExistingGroups.runOnUiThread(new C1502474n(linkExistingGroups, this.A02, this.A01, 38));
        }
    }
}
