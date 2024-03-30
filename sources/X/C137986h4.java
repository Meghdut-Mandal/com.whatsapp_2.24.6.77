package X;

import com.whatsapp.R;

/* renamed from: X.6h4  reason: invalid class name and case insensitive filesystem */
public final class C137986h4 implements C161197mM {
    public static final C137986h4 A00 = new C137986h4();

    public AnonymousClass7OU BKn(C92424dv r5) {
        C163397q8 r3 = new C163397q8(r5, 0);
        r5.addOnAttachStateChangeListener(r3);
        C138376hl r2 = new C138376hl(r5);
        C114425hE r0 = (C114425hE) r5.getTag(R.id.pooling_container_listener_holder_tag);
        if (r0 == null) {
            r0 = new C114425hE();
            r5.setTag(R.id.pooling_container_listener_holder_tag, r0);
        }
        r0.A00.add(r2);
        return new AnonymousClass7OU(r5, r2, r3);
    }
}
