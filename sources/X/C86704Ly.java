package X;

import com.whatsapp.contact.picker.CompoundContactsLoader$loadContacts$2$1$1;

/* renamed from: X.4Ly  reason: invalid class name and case insensitive filesystem */
public final class C86704Ly extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C005502l $dispatcher;
    public final /* synthetic */ AnonymousClass147 $groupJid;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86704Ly(AnonymousClass147 r2, C005502l r3) {
        super(1);
        this.$groupJid = r2;
        this.$dispatcher = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4T0 r5 = (AnonymousClass4T0) obj;
        AnonymousClass00C.A0D(r5, 0);
        return new C15330nA(new CompoundContactsLoader$loadContacts$2$1$1(r5, this.$groupJid, (C023509x) null, this.$dispatcher));
    }
}
