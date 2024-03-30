package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.7ag  reason: invalid class name and case insensitive filesystem */
public final class C156777ag extends Job implements AnonymousClass7i8 {
    public static final long serialVersionUID = 1;
    public transient C19700wN A00;
    public transient AnonymousClass1PF A01;
    public transient AnonymousClass19A A02;
    public final String groupJidRawString;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C156777ag(java.lang.String r4) {
        /*
            r3 = this;
            r2 = 1
            X.AnonymousClass00C.A0D(r4, r2)
            X.673 r1 = new X.673
            r1.<init>()
            java.lang.String r0 = "group-fetch-all-membership-approval-requests"
            r1.A00 = r0
            r1.A01 = r2
            org.whispersystems.jobqueue.JobParameters r0 = r1.A01()
            r3.<init>(r0)
            r3.groupJidRawString = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C156777ag.<init>(java.lang.String):void");
    }

    public void Bqf(Context context) {
        AnonymousClass00C.A0D(context, 0);
        Context applicationContext = context.getApplicationContext();
        AnonymousClass00C.A08(applicationContext);
        C18800tq A0P = C36371kC.A0P(applicationContext);
        this.A02 = C36361kB.A0c(A0P);
        this.A00 = A0P.B3m();
        this.A01 = (AnonymousClass1PF) A0P.A3s.get();
    }

    public void A0B() {
        AnonymousClass1PF r1;
        AnonymousClass19A r7 = this.A02;
        if (r7 != null && (r1 = this.A01) != null) {
            C65533Sl r0 = AnonymousClass147.A01;
            AnonymousClass147 A04 = C65533Sl.A04(this.groupJidRawString);
            AnonymousClass777 r2 = new AnonymousClass777();
            C165487tV r8 = new C165487tV(r1, r2, 0);
            String A09 = r7.A09();
            C203399nx r4 = new C203399nx("membership_approval_requests", (AnonymousClass1AL[]) null);
            AnonymousClass1AL[] r3 = new AnonymousClass1AL[4];
            C36341k9.A1L("xmlns", "w:g2", r3, 0);
            r3[1] = new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09);
            C36351kA.A1N(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r3);
            r3[3] = new AnonymousClass1AL((Jid) A04, "to");
            r7.A0K(r8, C36391kE.A0m(r4, r3), A09, 355, 32000);
            try {
                r2.get();
            } catch (Exception e) {
                Log.e("GroupFetchAllMembershipApprovalRequestsJob/onRun Failed to fetch pending requests");
                throw e;
            }
        }
    }
}
