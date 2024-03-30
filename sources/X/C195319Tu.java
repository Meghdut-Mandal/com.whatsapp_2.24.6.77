package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* renamed from: X.9Tu  reason: invalid class name and case insensitive filesystem */
public class C195319Tu {
    public final MultiBufferLogger A00;
    public final Random A01 = new Random();

    public Long A00(int i) {
        C203119nL r0;
        if (C200699i4.A00 != 2 || (r0 = C203119nL.A0A) == null || r0.A04.get() == 0) {
            return null;
        }
        long nextInt = (((long) this.A01.nextInt(Integer.MAX_VALUE)) << 16) & 281474976645120L;
        this.A00.writeStandardEntry(7, 46, 0, 0, i, 0, nextInt | 562949953421312L);
        return Long.valueOf(nextInt);
    }

    public void A01(Long l, Map map, int i) {
        C203119nL r0;
        if (C200699i4.A00 == 2 && (r0 = C203119nL.A0A) != null && r0.A04.get() != 0) {
            long longValue = l.longValue() | ((long) 2);
            int i2 = i;
            if (!map.isEmpty()) {
                Iterator A0y = AnonymousClass000.A0y(map);
                int i3 = 0;
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    if (A11.getKey() != null && !C90494aF.A0f(A11).isEmpty() && A11.getValue() != null && !C90514aH.A10(A11).isEmpty()) {
                        i3 += C90494aF.A0f(A11).length() + C90494aF.A0f(A11).length();
                        if (((long) i3) > 2048) {
                            Locale locale = Locale.US;
                            Object[] A0M = AnonymousClass001.A0M();
                            AnonymousClass000.A1M(A0M, 0, 2048);
                            AnonymousClass000.A1L(A0M, i3, 1);
                            throw AnonymousClass001.A08(String.format(locale, "Maximum Length(%d) of Profilo annotations exceeded %d", A0M));
                        } else if ((C1693388r.A00 & TraceEvents.sProviders) != 0) {
                            String A0f = C90494aF.A0f(A11);
                            MultiBufferLogger multiBufferLogger = this.A00;
                            int writeStandardEntry = multiBufferLogger.writeStandardEntry(7, 59, 0, 0, i2, 0, longValue);
                            if (A0f != null) {
                                writeStandardEntry = multiBufferLogger.writeBytesEntry(1, 56, writeStandardEntry, A0f);
                            }
                            multiBufferLogger.writeBytesEntry(1, 57, writeStandardEntry, C90514aH.A10(A11));
                        }
                    }
                }
            }
            this.A00.writeStandardEntry(7, 47, 0, 0, i2, 0, longValue);
        }
    }

    public C195319Tu(MultiBufferLogger multiBufferLogger) {
        this.A00 = multiBufferLogger;
    }
}
