package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.whatsapp.group.GroupPendingInvitesFragment;
import com.whatsapp.group.NonAdminGJRFragment;

/* renamed from: X.1sB  reason: invalid class name and case insensitive filesystem */
public class C39381sB extends AnonymousClass07T {
    public final int A00;
    public final Context A01;
    public final String A02;
    public final boolean A03;

    public C39381sB(Context context, AnonymousClass01z r3, String str, boolean z, boolean z2) {
        super(r3, 0);
        this.A01 = context;
        this.A02 = str;
        this.A03 = z2;
        this.A00 = C36371kC.A00(z ? 1 : 0);
    }

    public CharSequence A0F(int i) {
        Context context;
        int i2;
        if (i == 0) {
            context = this.A01;
            i2 = R.string.f12nameremoved;
        } else if (i == 1) {
            context = this.A01;
            i2 = R.string.f12nameremoved;
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("The item ");
            A0u.append(i);
            A0u.append(" should be less than: ");
            A0u.append(this.A00);
            throw AnonymousClass000.A0b(A0u);
        }
        return C36361kB.A0m(context, i2);
    }

    public AnonymousClass02E A0M(int i) {
        Bundle A07;
        AnonymousClass02E nonAdminGJRFragment;
        if (i == 0) {
            boolean z = this.A03;
            String str = this.A02;
            A07 = AnonymousClass001.A07();
            if (z) {
                A07.putString("gid", str);
                nonAdminGJRFragment = new GroupMembershipApprovalRequestsFragment();
            } else {
                A07.putString("gid", str);
                nonAdminGJRFragment = new NonAdminGJRFragment();
            }
        } else if (i == 1) {
            String str2 = this.A02;
            A07 = AnonymousClass001.A07();
            A07.putString("gid", str2);
            nonAdminGJRFragment = new GroupPendingInvitesFragment();
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("The item position should be less than: ");
            A0u.append(this.A00);
            throw AnonymousClass000.A0b(A0u);
        }
        nonAdminGJRFragment.A17(A07);
        return nonAdminGJRFragment;
    }

    public int A0H() {
        return this.A00;
    }
}
