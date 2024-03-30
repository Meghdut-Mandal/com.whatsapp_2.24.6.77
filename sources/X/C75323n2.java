package X;

import com.whatsapp.R;
import com.whatsapp.identity.IdentityVerificationActivity;
import java.util.Set;

/* renamed from: X.3n2  reason: invalid class name and case insensitive filesystem */
public abstract class C75323n2 implements AnonymousClass4TF {
    public final /* synthetic */ IdentityVerificationActivity A00;

    public C75323n2(IdentityVerificationActivity identityVerificationActivity) {
        this.A00 = identityVerificationActivity;
    }

    public void BXz(C599836a r9, Set set, Set set2) {
        String A0H;
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        if (!C36411kG.A1X(identityVerificationActivity)) {
            identityVerificationActivity.A03.setVisibility(8);
        }
        if (r9 != null) {
            C599836a r0 = identityVerificationActivity.A0D;
            if (r0 == r9) {
                return;
            }
            if (r0 != null) {
                C62353Fv r1 = r0.A01;
                C62353Fv r02 = r9.A01;
                if (!(r1 == null || r02 == null || !r1.equals(r02))) {
                    return;
                }
            }
        }
        identityVerificationActivity.A0D = r9;
        identityVerificationActivity.A0K.A0A = r9;
        int i = 0;
        if (set != null) {
            set.size();
        }
        if (set2 != null) {
            i = set2.size() - 1;
        }
        identityVerificationActivity.A00 = i;
        if (!identityVerificationActivity.A0R) {
            AnonymousClass4WE r12 = (AnonymousClass4WE) this;
            if (r12.A01 != 0) {
                IdentityVerificationActivity identityVerificationActivity2 = (IdentityVerificationActivity) r12.A00;
                AnonymousClass141 r13 = identityVerificationActivity2.A0F;
                String str = null;
                if (!(r13 == null || (A0H = identityVerificationActivity2.A09.A0H(r13)) == null)) {
                    str = identityVerificationActivity2.A00.A0G(A0H);
                }
                String A0w = C36411kG.A0w(identityVerificationActivity2.getResources(), str, new Object[1], 0, R.string.f12nameremoved);
                String A0w2 = C36411kG.A0w(identityVerificationActivity2.getResources(), str, new Object[1], 0, R.string.f12nameremoved);
                AnonymousClass3P9 r14 = new AnonymousClass3P9();
                r14.A08 = A0w2;
                r14.A09 = A0w;
                r14.A00 = 101;
                identityVerificationActivity2.Btl(r14.A02(), (String) null);
                identityVerificationActivity2.A0R = true;
                return;
            }
            IdentityVerificationActivity.A0I((IdentityVerificationActivity) r12.A00);
        }
    }

    public void BdB() {
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        if (!C36411kG.A1X(identityVerificationActivity)) {
            identityVerificationActivity.A03.setVisibility(0);
        }
    }
}
