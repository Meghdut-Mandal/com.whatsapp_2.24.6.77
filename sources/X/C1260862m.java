package X;

import android.content.Context;
import com.whatsapp.AbstractAppShellDelegate;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.62m  reason: invalid class name and case insensitive filesystem */
public final class C1260862m {
    public final C19630wG A00;
    public final WhatsAppLibLoader A01;
    public final Set A02;

    public final synchronized void A00(AnonymousClass5TG r7) {
        C18740tg.A00();
        Set set = this.A02;
        if (!set.contains(r7)) {
            try {
                WhatsAppLibLoader whatsAppLibLoader = this.A01;
                Context context = this.A00.A00;
                String[] A1R = C36441kJ.A1R();
                A1R[0] = r7.libName;
                boolean A012 = whatsAppLibLoader.A06.A01(context, AbstractAppShellDelegate.COMPRESSED_LIBS_ARCHIVE_NAME);
                String str = A1R[0];
                if (!A012 || !AnonymousClass101.A00(context, str)) {
                    WhatsAppLibLoader.A01(context, str);
                }
            } catch (UnsatisfiedLinkError e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("DynamicLibraryLoader/maybeLoadLibrary ");
                A0u.append(r7.libName);
                C36351kA.A1P(" failed", A0u, e);
            }
            set.add(r7);
        }
    }

    public C1260862m(C19630wG r2, WhatsAppLibLoader whatsAppLibLoader) {
        C36321k7.A0x(r2, whatsAppLibLoader);
        this.A00 = r2;
        this.A01 = whatsAppLibLoader;
        Set synchronizedSet = Collections.synchronizedSet(C36441kJ.A16());
        AnonymousClass00C.A08(synchronizedSet);
        this.A02 = synchronizedSet;
    }
}
