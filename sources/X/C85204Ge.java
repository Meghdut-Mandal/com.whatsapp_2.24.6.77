package X;

import androidx.appcompat.widget.SearchView;
import com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment;

/* renamed from: X.4Ge  reason: invalid class name and case insensitive filesystem */
public final class C85204Ge extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ SearchView $searchView;
    public final /* synthetic */ NewsletterInfoMembersSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85204Ge(SearchView searchView, NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment) {
        super(0);
        this.this$0 = newsletterInfoMembersSearchFragment;
        this.$searchView = searchView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment = this.this$0;
        SearchView searchView = this.$searchView;
        AnonymousClass00C.A07(searchView);
        if (newsletterInfoMembersSearchFragment.A09) {
            searchView.A0E();
            newsletterInfoMembersSearchFragment.A09 = false;
        } else {
            AnonymousClass1N2 r0 = newsletterInfoMembersSearchFragment.A08;
            if (r0 != null) {
                r0.A01(searchView);
            } else {
                throw C36331k8.A0d("imeUtils");
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
