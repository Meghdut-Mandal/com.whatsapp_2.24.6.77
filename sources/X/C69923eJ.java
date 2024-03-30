package X;

import android.os.ConditionVariable;
import com.whatsapp.chatlock.dialogs.SecretCodeAuthenticationBottomSheet;

/* renamed from: X.3eJ  reason: invalid class name and case insensitive filesystem */
public final class C69923eJ implements C88494Sx {
    public SecretCodeAuthenticationBottomSheet A00;
    public final C235718z A01;
    public final AnonymousClass3L5 A02;
    public final AnonymousClass005 A03;
    public final C20810yC A04;

    public void B1b(AnonymousClass155 r4, C53502rQ r5, AnonymousClass4PZ r6, C606938z r7, int i) {
        AnonymousClass00C.A0D(r6, 3);
        if (this.A04.A0E(5854)) {
            SecretCodeAuthenticationBottomSheet secretCodeAuthenticationBottomSheet = new SecretCodeAuthenticationBottomSheet(this.A02, this.A01.A0M());
            this.A00 = secretCodeAuthenticationBottomSheet;
            secretCodeAuthenticationBottomSheet.A01 = new C603737p(r4, r6, this, i);
            secretCodeAuthenticationBottomSheet.A1f(r4.getSupportFragmentManager(), "SecretCodeAuthenticationBottomSheet");
            return;
        }
        r6.BXH();
    }

    public void B2U() {
        SecretCodeAuthenticationBottomSheet secretCodeAuthenticationBottomSheet = this.A00;
        if (secretCodeAuthenticationBottomSheet != null) {
            secretCodeAuthenticationBottomSheet.A1c();
        }
        this.A00 = null;
    }

    public C69923eJ(C235718z r2, AnonymousClass3L5 r3, C20810yC r4, AnonymousClass005 r5) {
        C36321k7.A18(r4, r3, r2, r5);
        this.A04 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r5;
        ConditionVariable conditionVariable = C18740tg.A00;
    }
}
