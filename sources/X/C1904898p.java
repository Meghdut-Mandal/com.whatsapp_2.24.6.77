package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.98p  reason: invalid class name and case insensitive filesystem */
public abstract class C1904898p {
    public static QuickPerformanceLogger A00;

    public static QuickPerformanceLogger A00() {
        QuickPerformanceLogger quickPerformanceLogger = A00;
        if (quickPerformanceLogger != null) {
            return quickPerformanceLogger;
        }
        AnonymousClass6YR.A09("QPLProvider", "QuickPerformanceLogger instance wasn't installed in provider, returning noop. Please call QuickPerformanceLoggerProvider.setQuickPerformanceLogger() before getting the instance.", AnonymousClass001.A09("No QPL instance provided"));
        return null;
    }
}
