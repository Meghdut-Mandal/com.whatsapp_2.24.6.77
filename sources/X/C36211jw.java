package X;

import com.whatsapp.search.SearchViewModel;

/* renamed from: X.1jw  reason: invalid class name and case insensitive filesystem */
public class C36211jw implements AnonymousClass04S {
    public Object A00;
    public Object A01;
    public final int A02;

    public C36211jw(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BTH(Object obj) {
        switch (this.A02) {
            case 0:
                AnonymousClass1S8 r3 = (AnonymousClass1S8) this.A00;
                AnonymousClass1S9 r2 = r3.A07;
                boolean z = false;
                if (((C001600r) this.A01).A04() != null) {
                    z = true;
                }
                r2.A03 = z;
                r3.A02.A0C(r2);
                return;
            case 1:
                SearchViewModel searchViewModel = (SearchViewModel) this.A00;
                AnonymousClass08M r5 = (AnonymousClass08M) this.A01;
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                if (!str.equals(searchViewModel.A0b())) {
                    searchViewModel.A09.A00(new C28231Rv(searchViewModel.A0Y(), Integer.valueOf(searchViewModel.A0U()), str, 3));
                    r5.A03("query_text", str);
                    return;
                }
                return;
            case 2:
                SearchViewModel searchViewModel2 = (SearchViewModel) this.A00;
                searchViewModel2.A0B = (AnonymousClass2dO) obj;
                if (((C235718z) ((AnonymousClass005) this.A01).get()).A0N()) {
                    SearchViewModel.A07(searchViewModel2);
                    return;
                }
                return;
            default:
                AnonymousClass04S r32 = (AnonymousClass04S) this.A01;
                if (((C28201Rs) this.A00).A00.compareAndSet(true, false)) {
                    r32.BTH(obj);
                    return;
                }
                return;
        }
    }
}
