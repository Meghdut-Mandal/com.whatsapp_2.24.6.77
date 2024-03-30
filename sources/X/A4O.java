package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class A4O implements OnSuccessListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C30331a2 A01;

    public /* synthetic */ A4O(C30331a2 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void onSuccess(Object obj) {
        List<AnonymousClass8C5> asList;
        C30331a2 r9 = this.A01;
        int i = this.A00;
        AnonymousClass8CA r0 = ((A4A) ((C23117B5w) ((AnonymousClass0WJ) obj).A00)).A00;
        if (r0 == null) {
            asList = Collections.emptyList();
        } else {
            asList = Arrays.asList(r0.A03);
        }
        int size = asList.size();
        ArrayList A0I = AnonymousClass001.A0I();
        int i2 = 0;
        for (AnonymousClass8C5 r1 : asList) {
            if (i2 >= i) {
                break;
            }
            A0I.add(new C193219Km(r1.A01, AnonymousClass14B.A0E(r1.A02), r1.A00));
            i2++;
        }
        C30321a1 r3 = r9.A01;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("sendmethods/sendSafetyNetVerifyAppsResult appsListSize=");
        A0u.append(Integer.valueOf(A0I.size()));
        A0u.append(" errorCode=");
        A0u.append(0);
        C36321k7.A1Q(" errorMessage=", (String) null, A0u);
        AnonymousClass6QB A0q = C36441kJ.A0q("apps");
        A0q.A04(new AnonymousClass1AL("actual_count", size));
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            C193219Km r2 = (C193219Km) it.next();
            AnonymousClass6QB A0q2 = C36441kJ.A0q("item");
            C36331k8.A1D(A0q2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r2.A01);
            C36331k8.A1D(A0q2, "hash", r2.A02);
            A0q2.A04(new AnonymousClass1AL("category", r2.A00));
            C36361kB.A1H(A0q2, A0q);
        }
        C203399nx A03 = A0q.A03();
        AnonymousClass6QB A0q3 = C36441kJ.A0q("verify_apps");
        A0q3.A05(A03);
        C203399nx A032 = A0q3.A03();
        AnonymousClass6QB A0q4 = C36441kJ.A0q("ib");
        A0q4.A05(A032);
        r3.A00.A0G(A0q4.A03(), 273);
    }
}
