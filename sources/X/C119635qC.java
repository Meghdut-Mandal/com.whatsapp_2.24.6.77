package X;

import android.content.UriMatcher;

/* renamed from: X.5qC  reason: invalid class name and case insensitive filesystem */
public class C119635qC {
    public final UriMatcher A00;
    public final AnonymousClass005 A01;

    public C119635qC(C19460v5 r21, C19730wQ r22, AnonymousClass16D r23, AnonymousClass171 r24, AnonymousClass16K r25, C220412q r26, AnonymousClass17X r27, C20810yC r28, AnonymousClass1VC r29, C119625qB r30, C1261862w r31, AnonymousClass6KI r32, AnonymousClass3G0 r33, AnonymousClass1VE r34, AnonymousClass3S0 r35, C21430zE r36) {
        C1261862w r14 = r31;
        AnonymousClass16D r6 = r23;
        C19730wQ r5 = r22;
        AnonymousClass1VE r17 = r34;
        C19460v5 r4 = r21;
        AnonymousClass171 r7 = r24;
        AnonymousClass16K r8 = r25;
        C220412q r9 = r26;
        AnonymousClass17X r10 = r27;
        C20810yC r11 = r28;
        AnonymousClass1VC r12 = r29;
        C119625qB r13 = r30;
        this.A01 = new C18910u1((Object) null, new AnonymousClass77Y(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r32, r33, r17, r35, r36));
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.A00 = uriMatcher;
        uriMatcher.addURI("com.whatsapp.provider.instrumentation", "contacts", 1);
    }
}
