package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel;

/* renamed from: X.5ED  reason: invalid class name */
public final class AnonymousClass5ED extends AnonymousClass5EQ {
    public final BusinessDirectoryConsumerHomeViewModel A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5ED) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass5ED) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass5ED(BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel) {
        super(30);
        this.A00 = businessDirectoryConsumerHomeViewModel;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ProminentSearchBarListItemData(searchBarClickListener=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
