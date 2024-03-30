package X;

import com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryListQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryListResponseImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterDirectoryFilterInput;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterDirectoryListInput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2YC  reason: invalid class name */
public final class AnonymousClass2YC extends AnonymousClass2YD {
    public AnonymousClass1ZN cache;
    public final String countryCode;
    public final int limit;
    public final AnonymousClass4UA originalCallback;
    public final String startCursor;
    public final C52462pT type;

    public AnonymousClass2YC(AnonymousClass1ZN r8, C52462pT r9, AnonymousClass4UA r10, String str, String str2, int i, boolean z) {
        super(new C75923o1(r8, r9, r10, str, str2), "NewsletterDirectoryV2ListJob", z);
        this.type = r9;
        this.countryCode = str;
        this.limit = i;
        this.startCursor = str2;
        this.cache = r8;
        this.originalCallback = r10;
    }

    public void A0B() {
        ArrayList arrayList;
        AnonymousClass1ZN r3;
        AnonymousClass011 r0;
        super.A0B();
        if (!this.isCancelled) {
            if (this.startCursor == null && (r3 = this.cache) != null) {
                String str = this.type.value;
                String str2 = this.countryCode;
                AnonymousClass00C.A0D(str, 0);
                AnonymousClass1ZN.A00(r3);
                if (str2 == null) {
                    str2 = "global";
                }
                StringBuilder A0v = AnonymousClass000.A0v(str);
                A0v.append('_');
                String A0q = AnonymousClass000.A0q(str2, A0v);
                Map map = r3.A02;
                synchronized (map) {
                    AnonymousClass3JF r02 = (AnonymousClass3JF) map.get(A0q);
                    if (r02 != null) {
                        r0 = C36441kJ.A19(r02.A02, r02.A01);
                    } else {
                        r0 = null;
                    }
                }
                if (r0 != null) {
                    this.originalCallback.Bmz((String) r0.second, (List) r0.first);
                    return;
                }
            }
            C27591Ow r4 = this.A02;
            if (r4 != null) {
                XWA2NewsletterDirectoryFilterInput xWA2NewsletterDirectoryFilterInput = new XWA2NewsletterDirectoryFilterInput();
                String str3 = this.countryCode;
                if (str3 != null) {
                    String[] A1R = C36441kJ.A1R();
                    A1R[0] = str3;
                    arrayList = AnonymousClass03T.A03(A1R);
                } else {
                    arrayList = null;
                }
                xWA2NewsletterDirectoryFilterInput.A08("country_codes", arrayList);
                XWA2NewsletterDirectoryListInput xWA2NewsletterDirectoryListInput = new XWA2NewsletterDirectoryListInput();
                xWA2NewsletterDirectoryListInput.A07("view", this.type.value);
                xWA2NewsletterDirectoryListInput.A06("limit", Integer.valueOf(this.limit));
                xWA2NewsletterDirectoryListInput.A07("start_cursor", this.startCursor);
                xWA2NewsletterDirectoryListInput.A05(xWA2NewsletterDirectoryFilterInput, "filters");
                AnonymousClass9VA r32 = new NewsletterDirectoryListQueryImpl$Builder().A00;
                r32.A00(xWA2NewsletterDirectoryListInput, "input");
                r4.A01(new AnonymousClass9JF(r32, NewsletterDirectoryListResponseImpl.class, "NewsletterDirectoryList")).A02(new C86304Kk(this));
                return;
            }
            throw C36331k8.A0d("graphQlClient");
        }
    }

    public void cancel() {
        super.cancel();
        this.callback = null;
    }
}
