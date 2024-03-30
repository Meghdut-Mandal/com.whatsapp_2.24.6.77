package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2Fn  reason: invalid class name and case insensitive filesystem */
public class C43192Fn extends C43162Fg {
    public final /* synthetic */ C192969Ji A00;
    public final /* synthetic */ C183448qo A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43192Fn(C192969Ji r1, C183448qo r2, AnonymousClass171 r3, C18820ts r4) {
        super(r3, r4);
        this.A01 = r2;
        this.A00 = r1;
    }

    public int A00(AnonymousClass141 r6, AnonymousClass141 r7) {
        C192969Ji r4 = this.A00;
        Class<UserJid> cls = UserJid.class;
        boolean contains = r4.A02.contains(r6.A06(cls));
        if (contains == r4.A02.contains(r7.A06(cls))) {
            return super.A00(r6, r7);
        }
        if (contains) {
            return -1;
        }
        return 1;
    }
}
