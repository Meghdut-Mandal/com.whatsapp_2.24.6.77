package X;

import android.app.Activity;

/* renamed from: X.4FU  reason: invalid class name */
public final class AnonymousClass4FU extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ String $key = "gid";
    public final /* synthetic */ Activity $this_jidArg;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4FU(Activity activity) {
        super(0);
        this.$this_jidArg = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r1 != null) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r3 = this;
            android.app.Activity r0 = r3.$this_jidArg
            android.content.Intent r2 = r0.getIntent()
            r1 = 0
            if (r2 == 0) goto L_0x002b
            java.lang.String r0 = r3.$key
            java.lang.String r0 = r2.getStringExtra(r0)
            if (r0 == 0) goto L_0x002b
            android.app.Activity r0 = r3.$this_jidArg
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L_0x002c
            java.lang.String r0 = r3.$key
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 == 0) goto L_0x002c
            com.whatsapp.jid.Jid r1 = X.C36411kG.A0i(r0)
            boolean r0 = r1 instanceof X.AnonymousClass147
            if (r0 == 0) goto L_0x002c
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            return r1
        L_0x002c:
            X.3yN r0 = X.C82233yN.A00
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4FU.invoke():java.lang.Object");
    }
}
