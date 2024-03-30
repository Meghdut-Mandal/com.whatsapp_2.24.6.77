package com.whatsapp.backup.google.viewmodel;

import X.AnonymousClass04R;
import X.AnonymousClass6FS;
import X.C001700s;
import X.C19420v0;
import X.C19970wo;
import X.C36341k9;
import X.C36431kI;
import X.C90504aG;

public class GoogleDriveNewUserSetupViewModel extends AnonymousClass04R {
    public static final int[] A06;
    public static final int[] A07 = {0, 4, 1, 2, 3};
    public final C001700s A00;
    public final C001700s A01;
    public final C001700s A02;
    public final AnonymousClass6FS A03;
    public final C19420v0 A04;
    public final C19970wo A05;

    static {
        int[] iArr = new int[5];
        C90504aG.A1S(iArr);
        A06 = iArr;
    }

    public boolean A0S(int i) {
        if (!this.A04.A2R(i)) {
            return false;
        }
        C36341k9.A16(this.A01, i);
        return true;
    }

    public GoogleDriveNewUserSetupViewModel(AnonymousClass6FS r5, C19970wo r6, C19420v0 r7) {
        C001700s A0S = C36431kI.A0S();
        this.A02 = A0S;
        C001700s A0S2 = C36431kI.A0S();
        this.A00 = A0S2;
        C001700s A0S3 = C36431kI.A0S();
        this.A01 = A0S3;
        this.A05 = r6;
        this.A03 = r5;
        this.A04 = r7;
        C36341k9.A18(A0S, r7.A2E());
        A0S2.A0D(r7.A0c());
        C36341k9.A16(A0S3, r7.A0C());
    }
}
