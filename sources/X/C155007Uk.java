package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7Uk  reason: invalid class name and case insensitive filesystem */
public final class C155007Uk extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C132406Tm $directoryQplLogger;
    public final /* synthetic */ C128536Cq $searchQueryResult;
    public final /* synthetic */ AnonymousClass6SI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155007Uk(AnonymousClass6SI r2, C128536Cq r3, C132406Tm r4) {
        super(1);
        this.this$0 = r2;
        this.$searchQueryResult = r3;
        this.$directoryQplLogger = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C110155aD r1 = (C110155aD) obj;
        AnonymousClass00C.A0D(r1, 0);
        AnonymousClass6SI r8 = this.this$0;
        C128536Cq r7 = this.$searchQueryResult;
        C132406Tm r2 = this.$directoryQplLogger;
        Set set = r7.A04;
        set.add(C36361kB.A0i());
        if (r1 instanceof AnonymousClass51A) {
            C130886Mu r0 = r8.A02;
            C124875yw r4 = ((AnonymousClass51A) r1).A00;
            r0.A01(r4);
            List list = r4.A0A;
            AnonymousClass00C.A07(list);
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object next : list) {
                C134986bw r12 = (C134986bw) next;
                C1277269k r02 = r7.A01;
                AnonymousClass00C.A0B(r12);
                C36391kE.A1V(next, A0I, C129416Gv.A00(r02, r12) ? 1 : 0);
            }
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator it = A0I.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                C36391kE.A1V(next2, A0I2, r7.A02.A0A.contains(next2) ? 1 : 0);
            }
            C124875yw r03 = r7.A02;
            List list2 = r03.A0A;
            C90494aF.A1O(A0I2, list2);
            BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = r8.A00;
            if (businessDirectoryContextualSearchViewModel != null) {
                String str = r7.A03;
                List list3 = r03.A0C;
                List list4 = r03.A09;
                AnonymousClass6P1 r82 = r03.A01;
                String str2 = r03.A05;
                String str3 = r03.A08;
                C1277269k r72 = r7.A01;
                boolean z = !AnonymousClass000.A1Z(set, 2);
                r4.A0C.size();
                List list5 = r4.A09;
                list5.size();
                list5.size();
                businessDirectoryContextualSearchViewModel.A0U(r72, r82, str, str2, str3, list2, list3, list4, z);
            }
            if (r2 != null && AnonymousClass000.A1Z(set, 2)) {
                r2.A04();
            }
        } else if (r1 instanceof AnonymousClass519) {
            int i = ((AnonymousClass519) r1).A00;
            r7.A00 = i;
            BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel2 = r8.A00;
            if (businessDirectoryContextualSearchViewModel2 != null) {
                businessDirectoryContextualSearchViewModel2.A0J.A0H(new C80373vI(businessDirectoryContextualSearchViewModel2, r7.A03, i, 2));
            }
            if (r2 != null) {
                r2.A03();
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
