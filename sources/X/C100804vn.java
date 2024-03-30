package X;

import android.app.Dialog;
import android.content.Intent;
import com.whatsapp.accountsync.ProfileActivity;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.Objects;

/* renamed from: X.4vn  reason: invalid class name and case insensitive filesystem */
public abstract class C100804vn extends C100884wC {
    public C20290xK A00;
    public C160537lA A01;
    public final boolean A02;
    public final boolean A03;

    public static synchronized C160537lA A0O(C100804vn r33) {
        C160537lA r0;
        C100804vn r15 = r33;
        synchronized (r15) {
            if (r15.A01 == null) {
                C20290xK r02 = r15.A00;
                boolean z = r15.A03;
                boolean z2 = r15.A02;
                C116455kc r11 = new C116455kc(r15);
                C18800tq r10 = r02.A00.A00.A00;
                AnonymousClass17Y A0M = C36351kA.A0M(r10);
                C19770wU A0Z = C36341k9.A0Z(r10);
                C24341Cb A0a = C36431kI.A0a(r10);
                AnonymousClass005 A002 = C18840tu.A00(r10.A7K);
                C20280xJ r26 = (C20280xJ) r10.A7d.get();
                AnonymousClass13I r27 = (AnonymousClass13I) r10.A4a.get();
                AnonymousClass3HJ r28 = (AnonymousClass3HJ) r10.A6Y.get();
                AnonymousClass1QN r24 = (AnonymousClass1QN) r10.A5H.get();
                C20720y3 r25 = (C20720y3) r10.A6u.get();
                AnonymousClass1CY r22 = (AnonymousClass1CY) r10.A0a.get();
                C220612s r23 = (C220612s) r10.A5F.get();
                C20060wx r21 = (C20060wx) r10.A8B.get();
                AnonymousClass196 r19 = (AnonymousClass196) r10.A8N.get();
                C116455kc r17 = r11;
                AnonymousClass5JX r14 = new AnonymousClass5JX(r15, A0M, r17, (C29301Wc) r10.A0b.get(), r19, A0a, r21, r22, r23, r24, r25, r26, r27, r28, A0Z, A002, C18840tu.A00(r10.A7g), z, z2);
                r15.A01 = r14;
                C165147sx.A01(r15, r14.A00, 0);
            }
            r0 = r15.A01;
        }
        return r0;
    }

    public AnonymousClass005 A3i() {
        C29501Ww r1;
        if (this instanceof VoipActivityV2) {
            AnonymousClass005 r12 = ((VoipActivityV2) this).A1g;
            Objects.requireNonNull(r12);
            return C165307tD.A00(r12, 18);
        }
        if (this instanceof RestoreFromBackupActivity) {
            r1 = ((RestoreFromBackupActivity) this).A0Y;
        } else {
            r1 = ((ProfileActivity) this).A08;
        }
        return new C18910u1(r1, (AnonymousClass004) null);
    }

    public void A3j() {
        if (this instanceof VoipActivityV2) {
            ContactPickerFragment contactPickerFragment = ((VoipActivityV2) this).A17;
            if (contactPickerFragment != null) {
                contactPickerFragment.A1f();
            }
        } else if (this instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) this;
            if (profileActivity.A06.A0d.A02) {
                C107005Me r0 = profileActivity.A01;
                if (r0 == null || r0.A06() != 1) {
                    C107005Me r1 = new C107005Me(profileActivity);
                    profileActivity.A01 = r1;
                    C36331k8.A1F(r1, profileActivity.A04);
                    return;
                }
                return;
            }
            ProfileActivity.A01(profileActivity);
        }
    }

    public void A3k(C131006Ni r2) {
        ContactPickerFragment contactPickerFragment;
        if ((this instanceof VoipActivityV2) && (contactPickerFragment = ((VoipActivityV2) this).A17) != null) {
            contactPickerFragment.A1g();
            ContactPickerFragment.A3r = false;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 200) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            A3l(false);
        } else if (A0O(this).B2j()) {
            A0O(this).BxC();
        }
    }

    public C100804vn(boolean z, boolean z2) {
        this.A03 = z;
        this.A02 = z2;
    }

    public void A3l(boolean z) {
        A0O(this).Bp4(z, true);
    }

    public final boolean A3m() {
        return A0O(this).B2j();
    }

    public Dialog onCreateDialog(int i) {
        Dialog BUr = A0O(this).BUr(i);
        if (BUr == null) {
            return super.onCreateDialog(i);
        }
        return BUr;
    }

    public C100804vn() {
        this(false, true);
    }
}
