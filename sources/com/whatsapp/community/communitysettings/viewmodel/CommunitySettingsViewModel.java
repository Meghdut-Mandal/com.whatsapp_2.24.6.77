package com.whatsapp.community.communitysettings.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.AnonymousClass04R;
import X.AnonymousClass08S;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass19A;
import X.AnonymousClass1LV;
import X.C023509x;
import X.C109325Xd;
import X.C19770wU;
import X.C27541Op;
import X.C34831hi;
import X.C36321k7;
import X.C36331k8;
import X.C36381kD;
import X.C36441kJ;
import X.C40111uw;
import X.C51162nN;
import X.C51742oJ;
import X.C608339n;
import X.C62843Ht;
import X.C63113Iu;
import X.C82373yb;
import X.C87854Qk;
import X.C89584Xc;
import com.whatsapp.community.communitysettings.AllowNonAdminGroupCreationManager$updateAllowNonAdminSubgroupCreationValue$1;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class CommunitySettingsViewModel extends AnonymousClass04R {
    public int A00;
    public C40111uw A01;
    public AnonymousClass147 A02;
    public AnonymousClass147 A03;
    public final AnonymousClass08S A04 = C36441kJ.A0Y();
    public final AnonymousClass1LV A05;
    public final MemberSuggestedGroupsManager A06;
    public final AnonymousClass16D A07;
    public final C87854Qk A08 = new C89584Xc(this, 4);
    public final C27541Op A09;
    public final C34831hi A0A = C36441kJ.A0s(new C62843Ht(C51162nN.ADMINS, C51742oJ.IDLE));
    public final C34831hi A0B = C36441kJ.A0s(new C63113Iu(-1, 0, 0));
    public final C19770wU A0C;
    public final C608339n A0D;
    public final AnonymousClass19A A0E;

    public void A0R() {
        this.A09.A01(this.A08);
    }

    public final void A0S(boolean z) {
        C51162nN r6;
        C51162nN r5;
        AnonymousClass147 r7 = this.A03;
        if (r7 != null) {
            C608339n r4 = this.A0D;
            AnonymousClass141 A082 = this.A07.A08(r7);
            if (A082 == null || !A082.A0c) {
                r6 = C51162nN.ADMINS;
            } else {
                r6 = C51162nN.EVERYONE;
            }
            C34831hi r8 = this.A0A;
            AnonymousClass040 A002 = C109325Xd.A00(this);
            C36331k8.A1G(r8, 3, A002);
            boolean z2 = z;
            if (z) {
                r5 = C51162nN.EVERYONE;
            } else {
                r5 = C51162nN.ADMINS;
            }
            C62843Ht.A00(r8, r5, C51742oJ.REQUESTING);
            C36381kD.A1R(new C82373yb(r6, r8, CoroutineExceptionHandler.A00), new AllowNonAdminGroupCreationManager$updateAllowNonAdminSubgroupCreationValue$1(r4, r5, r6, r7, r8, (C023509x) null, z2), A002);
        }
    }

    public CommunitySettingsViewModel(AnonymousClass1LV r4, C608339n r5, MemberSuggestedGroupsManager memberSuggestedGroupsManager, AnonymousClass16D r7, C27541Op r8, AnonymousClass19A r9, C19770wU r10) {
        C36321k7.A1B(r10, r9, r7, r4, r8);
        AnonymousClass00C.A0D(memberSuggestedGroupsManager, 6);
        this.A0C = r10;
        this.A0E = r9;
        this.A07 = r7;
        this.A05 = r4;
        this.A09 = r8;
        this.A06 = memberSuggestedGroupsManager;
        this.A0D = r5;
    }
}
