package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Vi  reason: invalid class name and case insensitive filesystem */
public final class C155247Vi extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C119215pS $businessDirectoryResultsPage;
    public final /* synthetic */ C132406Tm $directoryQplLogger;
    public final /* synthetic */ C1260462i $filters;
    public final /* synthetic */ String $query;
    public final /* synthetic */ String $queryId;
    public final /* synthetic */ AnonymousClass6QG $searchLocation;
    public final /* synthetic */ int $searchQueryBusinessType;
    public final /* synthetic */ String $searchSessionId;
    public final /* synthetic */ AnonymousClass6SI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155247Vi(C119215pS r2, C1260462i r3, AnonymousClass6QG r4, AnonymousClass6SI r5, C132406Tm r6, String str, String str2, String str3, int i) {
        super(1);
        this.$query = str;
        this.this$0 = r5;
        this.$searchLocation = r4;
        this.$searchQueryBusinessType = i;
        this.$businessDirectoryResultsPage = r2;
        this.$filters = r3;
        this.$queryId = str2;
        this.$searchSessionId = str3;
        this.$directoryQplLogger = r6;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1277269k r3 = (C1277269k) obj;
        AnonymousClass00C.A0D(r3, 0);
        C128536Cq r2 = new C128536Cq(r3, this.$query, 22);
        AnonymousClass6SI r6 = this.this$0;
        String str = this.$query;
        C130886Mu r9 = r6.A02;
        AnonymousClass00C.A0D(str, 0);
        ArrayList A0u = C90504aG.A0u(r9.A02);
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = A0u.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (C53382rE.A00(r9.A00, ((C134986bw) next).A01, str)) {
                A0I.add(next);
            }
        }
        ArrayList A0u2 = C90504aG.A0u(r9.A01);
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it2 = A0u2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            String str2 = ((C144416s9) next2).A0I;
            AnonymousClass00C.A07(str2);
            if (C53382rE.A00(r9.A00, str2, str)) {
                A0I2.add(next2);
            }
        }
        ArrayList A0u3 = C90504aG.A0u(r9.A03);
        ArrayList A0I3 = AnonymousClass001.A0I();
        Iterator it3 = A0u3.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            String str3 = ((C144416s9) next3).A0I;
            AnonymousClass00C.A07(str3);
            if (C53382rE.A00(r9.A00, str3, str)) {
                A0I3.add(next3);
            }
        }
        ArrayList A0I4 = AnonymousClass001.A0I();
        Iterator it4 = A0I2.iterator();
        while (it4.hasNext()) {
            Object next4 = it4.next();
            C36391kE.A1V(next4, A0I4, C129416Gv.A01(r2.A01, (C144416s9) next4) ? 1 : 0);
        }
        C124875yw r13 = r2.A02;
        List list = r13.A09;
        list.addAll(A0I4.subList(0, Math.min(A0I4.size(), 1 - list.size())));
        ArrayList A0I5 = AnonymousClass001.A0I();
        Iterator it5 = A0I3.iterator();
        while (it5.hasNext()) {
            Object next5 = it5.next();
            C36391kE.A1V(next5, A0I5, C129416Gv.A01(r2.A01, (C144416s9) next5) ? 1 : 0);
        }
        List list2 = r13.A0C;
        C90494aF.A1O(A0I5, list2);
        ArrayList A0I6 = AnonymousClass001.A0I();
        Iterator it6 = A0I.iterator();
        while (it6.hasNext()) {
            Object next6 = it6.next();
            C36391kE.A1V(next6, A0I6, C129416Gv.A00(r2.A01, (C134986bw) next6) ? 1 : 0);
        }
        List list3 = r13.A0A;
        C90494aF.A1O(A0I6, list3);
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = r6.A00;
        if (businessDirectoryContextualSearchViewModel != null) {
            AnonymousClass6P1 r4 = r13.A01;
            String str4 = r13.A05;
            String str5 = r13.A08;
            BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel2 = businessDirectoryContextualSearchViewModel;
            businessDirectoryContextualSearchViewModel2.A0U(r2.A01, r4, str, str4, str5, list3, list2, list, true);
        }
        AnonymousClass6SI r32 = this.this$0;
        String str6 = this.$query;
        AnonymousClass6QG r14 = this.$searchLocation;
        int i = this.$searchQueryBusinessType;
        C119215pS r12 = this.$businessDirectoryResultsPage;
        C1260462i r132 = this.$filters;
        String str7 = this.$queryId;
        String str8 = this.$searchSessionId;
        C132406Tm r0 = this.$directoryQplLogger;
        C119235pU r5 = r32.A01;
        String A0V = C90464aC.A0V();
        C155007Uk r8 = new C155007Uk(r32, r2, r0);
        AnonymousClass00C.A0D(str6, 0);
        AnonymousClass00C.A0D(r14, 1);
        if (r0 != null) {
            r0.A06("text_search_category_request_start");
        }
        C158177fv r11 = r5.A00;
        C1265464l r16 = r5.A01.A00;
        r11.B4B(r12, r132, r14, new C165367tJ(r0, r8, 1), r16, (C132406Tm) null, str6, str7, A0V, str8, 1, true, false).A0B();
        AnonymousClass6SI.A00(r12, r132, r14, r32, r2, r0, str6, str7, C90464aC.A0V(), str8, i, true);
        return AnonymousClass0AJ.A00;
    }
}
