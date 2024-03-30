package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.LinkedList;

/* renamed from: X.73e  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1498973e implements Runnable {
    public final /* synthetic */ C128836Du A00;
    public final /* synthetic */ BusinessDirectoryContextualSearchViewModel A01;
    public final /* synthetic */ AnonymousClass6P1 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ C1498973e(C128836Du r1, BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, AnonymousClass6P1 r3, String str, String str2, String str3) {
        this.A01 = businessDirectoryContextualSearchViewModel;
        this.A03 = str;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = str2;
        this.A05 = str3;
    }

    public final void run() {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A01;
        String str = this.A03;
        C128836Du r8 = this.A00;
        AnonymousClass6P1 r7 = this.A02;
        String str2 = this.A04;
        String str3 = this.A05;
        LinkedList linkedList = businessDirectoryContextualSearchViewModel.A0e;
        synchronized (linkedList) {
            if (linkedList.isEmpty() && str.equals(BusinessDirectoryContextualSearchViewModel.A03(businessDirectoryContextualSearchViewModel))) {
                businessDirectoryContextualSearchViewModel.A0B.removeCallbacks(businessDirectoryContextualSearchViewModel.A03);
                if (!r8.A09.isEmpty() || !r8.A06.isEmpty()) {
                    businessDirectoryContextualSearchViewModel.A0S.A02(new C135116cA(str, System.currentTimeMillis()));
                }
                C143516qg r1 = businessDirectoryContextualSearchViewModel.A0R;
                C125025zC r0 = r1.A09;
                r0.A0D = str2;
                r0.A0E = str3;
                r0.A08 = r7;
                r1.BST(r8);
            }
        }
    }
}
