package X;

import android.content.Context;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.7aj  reason: invalid class name and case insensitive filesystem */
public final class C156787aj extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C19700wN A00;
    public transient AnonymousClass1LV A01;
    public transient MemberSuggestedGroupsManager A02;
    public transient C31681cD A03;
    public final String parentGroupRawJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C156787aj(java.lang.String r4) {
        /*
            r3 = this;
            r2 = 1
            X.AnonymousClass00C.A0D(r4, r2)
            X.673 r1 = new X.673
            r1.<init>()
            java.lang.String r0 = "community-fetch-all-subgroup-suggestions"
            r1.A00 = r0
            r1.A01 = r2
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r3.<init>(r0)
            r3.parentGroupRawJid = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C156787aj.<init>(java.lang.String):void");
    }

    public void Bqf(Context context) {
        AnonymousClass00C.A0D(context, 0);
        Context applicationContext = context.getApplicationContext();
        AnonymousClass00C.A08(applicationContext);
        C18800tq A0P = C36371kC.A0P(applicationContext);
        C19700wN B3m = A0P.B3m();
        AnonymousClass00C.A0D(B3m, 0);
        this.A00 = B3m;
        this.A03 = A0P.AzX();
        AnonymousClass1LV r0 = (AnonymousClass1LV) A0P.A1q.get();
        AnonymousClass00C.A0D(r0, 0);
        this.A01 = r0;
        MemberSuggestedGroupsManager memberSuggestedGroupsManager = (MemberSuggestedGroupsManager) A0P.A4q.get();
        AnonymousClass00C.A0D(memberSuggestedGroupsManager, 0);
        this.A02 = memberSuggestedGroupsManager;
    }

    public void A0B() {
        A0E();
        MemberSuggestedGroupsManager memberSuggestedGroupsManager = this.A02;
        if (memberSuggestedGroupsManager != null) {
            AnonymousClass147 A06 = AnonymousClass147.A01.A06(this.parentGroupRawJid);
            if (A06 == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("MemberSuggestedGroupsSyncJob/missing parentGroupJid; ");
                C36321k7.A1Z(A0u, A0E());
                C19700wN r4 = this.A00;
                if (r4 != null) {
                    String str = this.parentGroupRawJid;
                    AnonymousClass00C.A0D(str, 0);
                    int length = str.length();
                    int i = 4;
                    if (4 > length) {
                        i = length;
                    }
                    r4.A0E("MemberSuggestedGroupsSyncJob-parentGroupJid", C90494aF.A0d(str, length - i), false);
                    return;
                }
                throw C36331k8.A0d("crashLogs");
            }
            AnonymousClass1LV r0 = this.A01;
            if (r0 != null) {
                AnonymousClass147 A032 = C65533Sl.A03(r0.A01(A06));
                if (A032 == null) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("MemberSuggestedGroupsSyncJob/missing hintJid; ");
                    C36321k7.A1Z(A0u2, A0E());
                    return;
                }
                A0E();
                C31681cD r02 = this.A03;
                if (r02 != null) {
                    memberSuggestedGroupsManager.A05(A06, A032, r02.A00());
                    return;
                }
                throw C36331k8.A0d("groupMexContext");
            }
            throw C36331k8.A0d("communityChatManager");
        }
        throw C36331k8.A0d("memberSuggestedGroupsManager");
    }

    public final String A0E() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("persistentId=");
        A0u.append(this.A01);
        A0u.append("; groupJid=");
        A0u.append(AnonymousClass147.A01.A06(this.parentGroupRawJid));
        A0u.append("; useMex=");
        C31681cD r0 = this.A03;
        if (r0 != null) {
            return C36421kH.A0d(A0u, r0.A00());
        }
        throw C36331k8.A0d("groupMexContext");
    }
}
