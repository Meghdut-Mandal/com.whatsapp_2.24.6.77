package X;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.9iM  reason: invalid class name and case insensitive filesystem */
public final class C200859iM {
    public static final Logger A02 = C165587tf.A0p(C200859iM.class);
    public C192949Jg A00;
    public boolean A01;

    public static void A00(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = A02;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder A0i = C90464aC.A0i(valueOf2, C90474aD.A05(valueOf) + 57);
            A0i.append("RuntimeException while executing runnable ");
            A0i.append(valueOf);
            logger.log(level, AnonymousClass000.A0p(" with executor ", valueOf2, A0i), e);
        }
    }
}
