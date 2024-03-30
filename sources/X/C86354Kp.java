package X;

import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryActivity;
import com.whatsapp.newsletter.ui.directory.NewsletterDirectoryCategoriesActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.4Kp  reason: invalid class name and case insensitive filesystem */
public final class C86354Kp extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C46512Yd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86354Kp(C46512Yd r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C46522Ye r0;
        ConcurrentMap concurrentMap = (ConcurrentMap) obj;
        C46512Yd r1 = this.this$0;
        AnonymousClass00C.A0B(concurrentMap);
        if (r1 instanceof NewsletterDirectoryCategoriesActivity) {
            AnonymousClass00C.A0D(concurrentMap, 0);
            C40971wP r3 = ((NewsletterDirectoryCategoriesActivity) r1).A02;
            if (r3 == null) {
                throw C36331k8.A0d("newsletterDirectoryCategoriesAdapter");
            }
            AnonymousClass3HX r02 = r3.A00;
            if (!(r02 == null || (r0 = r02.A00) == null)) {
                List list = r0.A00;
                C23931Ak copyOf = C23931Ak.copyOf((Collection) list);
                Iterator A0y = AnonymousClass000.A0y(concurrentMap);
                boolean z = false;
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    Iterator it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i2 = i + 1;
                        if (AnonymousClass00C.A0J(((AnonymousClass3JI) it.next()).A02.A06(), A11.getKey())) {
                            if (((AnonymousClass3JI) copyOf.get(i)).A02.A09 != ((AnonymousClass3IZ) A11.getValue()).A00.A09) {
                                ((AnonymousClass3JI) copyOf.get(i)).A01 = false;
                                ((AnonymousClass3JI) copyOf.get(i)).A02.A09 = ((AnonymousClass3IZ) A11.getValue()).A00.A09;
                                z = true;
                                break;
                            }
                        }
                        i = i2;
                    }
                }
                if (z) {
                    AnonymousClass00C.A0B(copyOf);
                    r3.A0L(new AnonymousClass3HX(new C46522Ye(copyOf)));
                }
            }
        } else {
            AnonymousClass00C.A0D(concurrentMap, 0);
            C41051wX r4 = ((NewsletterDirectoryActivity) r1).A07;
            if (r4 == null) {
                throw C36331k8.A0d("newsletterDirectoryAdapter");
            }
            List list2 = r4.A08;
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object next : list2) {
                if (next instanceof C46542Yg) {
                    A0I.add(next);
                }
            }
            C23931Ak copyOf2 = C23931Ak.copyOf((Collection) A0I);
            Iterator A0y2 = AnonymousClass000.A0y(concurrentMap);
            boolean z2 = false;
            while (A0y2.hasNext()) {
                Map.Entry A112 = AnonymousClass000.A11(A0y2);
                Iterator it2 = A0I.iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int i4 = i3 + 1;
                    if (AnonymousClass00C.A0J(((C46542Yg) it2.next()).A02.A06(), A112.getKey())) {
                        if (((C46542Yg) copyOf2.get(i3)).A02.A09 != ((AnonymousClass3IZ) A112.getValue()).A00.A09) {
                            ((C46542Yg) copyOf2.get(i3)).A01 = false;
                            ((C46542Yg) copyOf2.get(i3)).A02.A09 = ((AnonymousClass3IZ) A112.getValue()).A00.A09;
                            z2 = true;
                            break;
                        }
                    }
                    i3 = i4;
                }
            }
            if (z2) {
                AnonymousClass00C.A0B(copyOf2);
                C41051wX.A00(r4, copyOf2);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
