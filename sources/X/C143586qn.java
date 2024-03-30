package X;

import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.BaseGPSLocationManager;
import com.whatsapp.businessdirectory.util.BusinessSearchGPSManager;

/* renamed from: X.6qn  reason: invalid class name and case insensitive filesystem */
public class C143586qn implements C159337jC {
    public C009904e A00;
    public C009904e A01;
    public C009904e A02;
    public final AnonymousClass02E A03;
    public final BaseGPSLocationManager A04;
    public final C1258661p A05;
    public final C143636qs A06;
    public final AnonymousClass5DQ A07;
    public final C20830yE A08;
    public final C20810yC A09;
    public final C21430zE A0A;

    public void BaF() {
        C36331k8.A0w(C90474aD.A0H(this.A07.A03), "location_access_granted", true);
        if (this.A08.A05()) {
            this.A06.BaD();
        } else {
            C009904e r2 = this.A02;
            AnonymousClass3FM A0T = C90474aD.A0T(this.A03.A0i());
            A0T.A02 = R.string.f12nameremoved;
            r2.A01((AnonymousClass0YW) null, A0T.A02());
        }
        this.A0A.markerPoint(207368785, "business_search_location_permission_accepted");
    }

    public void BaG() {
        this.A0A.markerPoint(207368785, "business_search_location_permission_denied");
    }

    public C143586qn(AnonymousClass02E r15, C001600r r16, C1258661p r17, C142636pC r18, C121405t5 r19, C143636qs r20, AnonymousClass5DQ r21, C20830yE r22, C20810yC r23, AnonymousClass32W r24, C21430zE r25) {
        this.A09 = r23;
        this.A03 = r15;
        this.A08 = r22;
        this.A0A = r25;
        this.A05 = r17;
        this.A07 = r21;
        this.A06 = r20;
        String A002 = AnonymousClass3N5.A00(r24.A00);
        C165057so r13 = new C165057so(r16, this, 0);
        C142636pC r4 = r18;
        AnonymousClass00C.A0D(r4, 0);
        C18800tq r1 = r19.A00.A00.A00;
        AnonymousClass17Y A0M = C36351kA.A0M(r1);
        C20810yC A0V = C36341k9.A0V(r1);
        C19630wG A0W = C36351kA.A0W(r1);
        C19770wU A0Z = C36341k9.A0Z(r1);
        BusinessSearchGPSManager businessSearchGPSManager = new BusinessSearchGPSManager(A0M, r4, C18830tt.A2M(r1.A00), C36351kA.A0U(r1), A0W, C36351kA.A0X(r1), C36341k9.A0T(r1), A0V, A0Z, A002, r13);
        this.A04 = businessSearchGPSManager;
        AnonymousClass02E r12 = this.A03;
        r12.A0P.A04(businessSearchGPSManager);
        C165167sz.A00(r12.A0m(), businessSearchGPSManager.A04, this, 2);
        AnonymousClass02E r3 = this.A03;
        this.A02 = r3.BnD(new C165397tM(this, 5), new C009504a());
        this.A01 = r3.BnD(new C165397tM(this, 6), new C009504a());
        this.A00 = r3.BnD(new C165397tM(this, 7), new AnonymousClass0FF());
    }
}
