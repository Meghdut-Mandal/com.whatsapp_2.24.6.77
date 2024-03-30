package X;

import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.2dN  reason: invalid class name */
public class AnonymousClass2dN extends AnonymousClass6Ej {
    public C47092dM A00;
    public final AnonymousClass54Q A01;
    public final AnonymousClass1QE A02;
    public final C24401Ch A03;
    public final AnonymousClass1CR A04;
    public final AnonymousClass3T0 A05;
    public final AnonymousClass54W A06;
    public final /* synthetic */ C40031ud A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2dN(C29301Wc r9, AnonymousClass54Q r10, C20720y3 r11, C20280xJ r12, AnonymousClass3HJ r13, AnonymousClass1QE r14, C40031ud r15, C24401Ch r16, AnonymousClass1CR r17, AnonymousClass3T0 r18, AnonymousClass54W r19, C19770wU r20, AnonymousClass005 r21) {
        super(r9, r11, r12, r13, r20, r21);
        this.A07 = r15;
        this.A01 = r10;
        this.A05 = r18;
        this.A06 = r19;
        this.A04 = r17;
        this.A02 = r14;
        this.A03 = r16;
    }

    public void A01() {
    }

    public void A00() {
        Log.i("PrepareDirectTransferMsgStoreHelper/createAndRunPrepareMessageStoreTask");
        C47092dM r2 = new C47092dM(this);
        this.A00 = r2;
        this.A05.Box(r2, new Object[0]);
    }

    public void A03(C131006Ni r9) {
        int i;
        C40031ud r7 = this.A07;
        if (r9 instanceof C1031654f) {
            C40031ud.A02(r7);
            int i2 = r9.A00;
            int A0K = r7.A03.A0K();
            switch (i2) {
                case 0:
                    i = 3;
                    break;
                case 1:
                    i = 20;
                    break;
                case 2:
                case 19:
                    throw AnonymousClass000.A0d("state is not recognized or not used = ", AnonymousClass000.A0u(), i2);
                case 3:
                    i = 16;
                    break;
                case 4:
                    i = 17;
                    break;
                case 5:
                    i = 1;
                    break;
                case 6:
                    i = 2;
                    break;
                case 7:
                    i = 18;
                    break;
                case 8:
                    i = 5;
                    break;
                case 9:
                    i = 6;
                    break;
                case 10:
                    i = 7;
                    break;
                case 11:
                    i = 8;
                    break;
                case 12:
                    i = 9;
                    break;
                case 13:
                    i = 10;
                    break;
                case 14:
                    i = 11;
                    break;
                case 15:
                    i = 12;
                    break;
                case 16:
                    i = 13;
                    break;
                case 17:
                    i = 14;
                    break;
                case 18:
                    i = 15;
                    break;
                case 20:
                    i = 19;
                    break;
                default:
                    throw AnonymousClass000.A0d("state is not recognized or not used = ", AnonymousClass000.A0u(), i2);
            }
            C40031ud.A05(r7, A0K, i);
            boolean A1O = AnonymousClass000.A1O(i2);
            if (A1O || A0K == 3) {
                AnonymousClass1QD r2 = r7.A05;
                Bundle A072 = AnonymousClass001.A07();
                A072.putInt("migration_state_on_provider_side", 2);
                Log.i("InterAppCommunicationManager/setDirectMigrationStateOnProviderSide");
                AnonymousClass1QD.A00(A072, r2, "com.whatsapp.registration.directmigration.setMigrationStateOnProviderSide");
            }
            C36321k7.A1X("DirectTransferBackgroundTaskViewModel/afterMessageStoreVerified/success = ", AnonymousClass000.A0u(), A1O);
            if (A1O) {
                C40031ud.A04(r7, 2);
                return;
            }
            int i3 = 5;
            if (i2 != 5) {
                i3 = 6;
                if (i2 != 6) {
                    if (i2 != 7) {
                        C40031ud.A04(r7, 3);
                        return;
                    }
                    return;
                }
            }
            C40031ud.A04(r7, i3);
            return;
        }
        throw AnonymousClass001.A08("should only use RestoreFromDirectMigrationStatus class here");
    }
}
